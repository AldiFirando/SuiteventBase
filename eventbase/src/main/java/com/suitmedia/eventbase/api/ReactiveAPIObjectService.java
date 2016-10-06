package com.suitmedia.eventbase.api;

import android.accounts.NetworkErrorException;
import android.util.Log;

import com.suitmedia.eventbase.model.ResponseObject;
import com.suitmedia.eventbase.model.SuiteventError;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import rx.Subscriber;

/**
 * Created by elfatahwashere on 10/3/2016.
 */


public abstract class ReactiveAPIObjectService<T> extends Subscriber<ResponseObject<T>> {
    protected ApiObjectCallback<T> callback;

    public ReactiveAPIObjectService(ApiObjectCallback<T> callback) {
        this.callback = callback;
    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable t) {
        if (callback != null) {
            if (t.getCause() instanceof UnknownHostException) {
                callback.onFailure(new SuiteventError(SuiteventError.Code.UnknownHost));
            } else if (t.getCause() instanceof SocketTimeoutException) {
                callback.onFailure(new SuiteventError(SuiteventError.Code.Timeout));
            } else if (t.getCause() instanceof NetworkErrorException) {
                callback.onFailure(new SuiteventError(SuiteventError.Code.NoInternetConnection));
            } else {
                Log.e("", "");
                callback.onFailure(t);
            }
        }
    }

    @Override
    public void onNext(ResponseObject<T> tResponseObject) {

        if (tResponseObject != null) {
            int status = tResponseObject.getStatus();
            if (status == 200) {
                SuiteventError error = new SuiteventError(SuiteventError.Code.NoDataFound);
                callback.onFailure(error);
            } else if (status == 404) {
                SuiteventError error = new SuiteventError(SuiteventError.Code.FailToAuthentication);
                callback.onFailure(error);
            }
        }
    }

    public interface ApiObjectCallback<T> {
        void onSuccess(T response);

        void onFailure(Throwable t);
    }


}



