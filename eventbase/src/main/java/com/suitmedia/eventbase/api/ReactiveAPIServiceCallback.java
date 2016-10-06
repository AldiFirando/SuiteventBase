package com.suitmedia.eventbase.api;

import android.accounts.NetworkErrorException;

import com.suitmedia.eventbase.model.Response;
import com.suitmedia.eventbase.model.SuiteventError;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;

import rx.Subscriber;

public abstract class ReactiveAPIServiceCallback<T> extends Subscriber<Response<T>> {

    protected ApiCallback<T> callback;

    public ReactiveAPIServiceCallback(ApiCallback<T> callback) {
        this.callback = callback;
    }

    @Override
    public void onNext(Response<T> t) {
        if (t != null) {
            int total = t.getTotal();
            if (total == 0) {
                SuiteventError error = new SuiteventError(SuiteventError.Code.NoDataFound);
                callback.onFailure(error);
            }
        }
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
                callback.onFailure(t);
            }
        }
    }

    public interface ApiCallback<T> {
        void onSuccess(List<T> response);

        void onFailure(Throwable t);
    }
}
