package com.suitmedia.eventbase.api;

import android.content.Context;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.concurrent.TimeUnit;

import com.suitmedia.eventbase.BuildConfig;
import com.suitmedia.eventbase.model.Attraction;
import com.suitmedia.eventbase.model.AttractionCategory;
import com.suitmedia.eventbase.model.Banner;
import com.suitmedia.eventbase.model.Content;
import com.suitmedia.eventbase.model.Gallery;
import com.suitmedia.eventbase.model.PartnerCategory;
import com.suitmedia.eventbase.model.Performer;
import com.suitmedia.eventbase.model.Response;
import com.suitmedia.eventbase.model.ResponseObject;
import com.suitmedia.eventbase.model.Review;
import com.suitmedia.eventbase.model.Schedule;
import com.suitmedia.eventbase.model.Setting;
import com.suitmedia.eventbase.model.SideMenu;
import com.suitmedia.eventbase.model.Stage;
import com.suitmedia.eventbase.model.TicketCategories;
import com.suitmedia.eventbase.model.Timeslot;
import com.suitmedia.eventbase.model.Token;
import com.suitmedia.eventbase.model.User;
import com.suitmedia.eventbase.model.Wishlist;

import io.realm.RealmObject;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by elfatahwashere on 9/27/2016.
 */
public interface APIService {

    //public String ENDPOINT = "http://soundrenaline.suitmedia.events/";

    @GET("api/stages")
    Observable<Response<Stage>> getStages();

    @GET("api/time-slots")
    Observable<Response<Timeslot>> getTimeslot();

    @GET("api/schedules")
    Observable<Response<Schedule>> getScheduleStage(@Query("user_id") String user_id, @Query("order_stage:name") String order_stage_name, @Query("order_timeSlot:order") String order_stage_time, @Query("page") int page, @Query("per_page") int perPage);

    @GET("api/schedules")
    Observable<Response<Schedule>> getScheduleTime(@Query("user_id") String user_id, @Query("order_timeSlot:order") String order_time_slot_id, @Query("page") int page, @Query("per_page") int perPage);

    @GET("api/schedules")
    Observable<Response<Schedule>> getStageSchedule(@Query("filter_stage_id") String filter_stage_id, @Query("order_timeSlot:order") String order_time_slot_id, @Query("page") int page, @Query("per_page") int perPage);

    @GET("api/performers")
    Observable<Response<Performer>> getPerformer(@Query("user_id") String user_id, @Query("order_order") String order_order, @Query("order_updated_at") String order_updated_at, @Query("page") int page);

    @GET("api/performers")
    Observable<Response<Performer>> getPerformerDetail(@Query("user_id") String user_id, @Query("filter_id") String filter_id);

    @GET("api/partner-categories")
    Observable<Response<PartnerCategory>> getPartnerCategory();

    @GET("api/partner-categories")
    Observable<Response<PartnerCategory>> getPartner(@Query("filter_order") String filter_order);

    @GET("api/contents")
    Observable<Response<Content>> getContent(@Query("order_is_featured") String order_is_featured, @Query("order_created_at") String order_created_at, @Query("page") int page);

    @GET("api/banners")
    Observable<Response<Banner>> getTicketBanner(@Query("filter_banner_category_id") String filter_banner_category_id);

    @GET("api/attraction-categories")
    Observable<Response<AttractionCategory>> getAttractionsCategory(@Query("page") int page);

    @GET("api/attractions")
    Observable<Response<Attraction>> getAttractions(@Query("user_id") String user_id, @Query("filter_name") String filter_name, @Query("filter_attraction_category_id") String filter_attraction_category_id, @Query("page") int page, @Query("per_page") int per_page);

    @GET("api/attractions")
    Observable<Response<Attraction>> getAttractions(@Query("per_page") int per_page);

    @GET("api/settings")
    Observable<Response<Setting>> getSettings(@Query("per_page") int perPage);

    @FormUrlEncoded
    @POST("api/users/login")
    Observable<ResponseObject<Token>> login(@Field("invoice_id") String invoice_id, @Field("api_key") String api_key);

    @FormUrlEncoded
    @POST("api/users/logout")
    Observable<ResponseObject<Token>> logout(@Field("access_token") String access_token);

    @POST("api/user/invoice/{id}")
    Observable<User> signIn(@Path("id") String id);

    @GET("api/ticket-categories")
    Observable<Response<TicketCategories>> getTicket();

    @GET("api/galleries")
    Observable<Response<Gallery>> getGallery(@Query("page") int page);

    @GET("api/wishlists")
    Observable<Response<Wishlist>> getWhistlist(@Query("page") int page);

    @FormUrlEncoded
    @POST("api/wishlists")
    Observable<ResponseObject<Wishlist>> postWishlist(@Field("access_token") String access_token,
                                                      @Field("event_location") String event_location,
                                                      @Field("international_performer") String international_performer,
                                                      @Field("local_performer") String local_performer,
                                                      @Field("text") String text);

    @FormUrlEncoded
    @POST("api/performers/review")
    Observable<ResponseObject<Review>> ratePerformer(@Field("access_token") String access_token,
                                                     @Field("performer_id") String performer_id,
                                                     @Field("stars") String stars,
                                                     @Field("text") String text);

    @FormUrlEncoded
    @POST("api/attractions/review")
    Observable<ResponseObject<Review>> rateAttraction(@Field("access_token") String access_token,
                                                      @Field("attraction_id") String attraction_id,
                                                      @Field("stars") String stars,
                                                      @Field("text") String text);

    @FormUrlEncoded
    @POST("api/attractions/review")
    Observable<ResponseObject<Review>> rateGeneralAttraction(@Field("access_token") String access_token,
                                                             @Field("stars") String stars,
                                                             @Field("text") String text);

    @GET("api/menus")
    Observable<Response<SideMenu>> getMenu(@Query("per_page") int per_page, @Query("order_order") String order_order);

    class Factory {

        public static String ENDPOINT = "";

        public static void setEndPoint(String endPoint){
            ENDPOINT = endPoint;
        }

        public static APIService create(Context context) {

            OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
            builder.readTimeout(30, TimeUnit.SECONDS);
            builder.connectTimeout(20, TimeUnit.SECONDS);
            builder.writeTimeout(60, TimeUnit.SECONDS);

            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);

            builder.addInterceptor(logging);

            Gson mGson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                    .setExclusionStrategies(new ExclusionStrategy() {
                        @Override
                        public boolean shouldSkipField(FieldAttributes f) {
                            return f.getDeclaringClass().equals(RealmObject.class);
                        }

                        @Override
                        public boolean shouldSkipClass(Class<?> clazz) {
                            return false;
                        }
                    })
                    .create();

            int cacheSize = 10 * 1024 * 1024; // 10 MiB
            Cache cache = new Cache(context.getCacheDir(), cacheSize);
            builder.cache(cache);

            OkHttpClient client = builder.build();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(ENDPOINT)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create(mGson))
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();

            return retrofit.create(APIService.class);
        }

    }
}
