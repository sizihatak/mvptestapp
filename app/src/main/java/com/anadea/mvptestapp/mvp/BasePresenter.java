package com.anadea.mvptestapp.mvp;

import android.os.Bundle;

import com.anadea.mvptestapp.data.DataManager;

public abstract class BasePresenter<T extends MvpView> implements Presenter<T> {

    protected T mMvpView;
    protected DataManager mDataManager;

    protected void init(DataManager dataManager) {
        mDataManager = dataManager;
    }

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
        mDataManager = null;
        mMvpView = null;
    }

    @Override
    public boolean checkAuth() {
        return mDataManager.checkAuth();
    }

    @Override
    public void resetAuth() {
        mDataManager.resetAuth();
    }

    public boolean isViewAttached() {
        return mMvpView != null;
    }

    public T getView() {
        return mMvpView;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) throw new ViewNotAttachedException();
    }

    public static class ViewNotAttachedException extends RuntimeException {
        public ViewNotAttachedException() {
            super("Call Presenter.attachView(view) before requesting data");
        }
    }
}
