package com.anadea.mvptestapp.mvp;

import android.os.Bundle;

public abstract class BasePresenter<T extends MvpView> implements Presenter<T> {

    protected T mMvpView;

    @Override
    public void attachView(T view) {
        mMvpView = view;
    }

    @Override
    public void detachView() {
        mMvpView = null;
    }

    @Override
    public void saveState(Bundle bundle) {
    }

    @Override
    public void destroy() {
        mMvpView = null;
    }
}
