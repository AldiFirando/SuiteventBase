package com.suitmedia.eventbase.model;

/**
 * Created by Aldio Firando on 7/20/2016.
 */
public class SuiteventError extends Throwable {

    public enum Code {
        NoDataFound,
        FailToAuthentication,
        Timeout,
        UnknownHost,
        NoInternetConnection,
        ServerError
    }

    private final Code mCode;
    private final int mAdditionalCode;
    private final String mMessage;

    public SuiteventError(Code code) {
        mCode = code;
        mAdditionalCode = 0;
        if (mCode == Code.NoDataFound) {
            mMessage = "The data is not exist";
        } else if (mCode == Code.UnknownHost) {
            mMessage = "We couldn't find your request. Please try again";
        } else if (mCode == Code.Timeout) {
            mMessage = "Connection timeout. Please try again";
        } else if (mCode == Code.NoInternetConnection) {
            mMessage = "No internet connection. Please try again";
        } else if (mCode == Code.FailToAuthentication) {
            mMessage = "Your code is invalid";
        } else {
            mMessage = "Oops, Something went wrong";
        }
    }

    public SuiteventError(int serverCode, String message) {
        mCode = Code.ServerError;
        mAdditionalCode = serverCode;
        mMessage = message;
    }

    public Code getCode() {
        return mCode;
    }

    public int getAdditionalCode() {
        return mAdditionalCode;
    }

    @Override
    public String getMessage() {
        return mMessage;
    }
}
