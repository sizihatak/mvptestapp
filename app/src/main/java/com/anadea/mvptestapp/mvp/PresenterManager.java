package com.anadea.mvptestapp.mvp;

import android.os.Bundle;
import android.util.LongSparseArray;

import com.anadea.mvptestapp.data.DataManager;

import java.util.concurrent.atomic.AtomicLong;

public class PresenterManager {

    private static final String KEY_PRESENTER_ID = "presenter_id";

    private DataManager mDataManager;
    private final AtomicLong mCurrentId;
    private final LongSparseArray<Presenter<?>> mPresentersArray = new LongSparseArray<>();

    public PresenterManager(DataManager dataManager) {
        mDataManager = dataManager;
        mCurrentId = new AtomicLong();
    }

    public Presenter<?> getPresenter(Class<?> clazz, Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            final long presenterId = mCurrentId.incrementAndGet();
            final BasePresenter presenter = create(clazz);
            presenter.init(mDataManager);
            mPresentersArray.put(presenterId, presenter);
            return presenter;
        } else {
            final long presenterId = savedInstanceState.getLong(KEY_PRESENTER_ID);
            return mPresentersArray.get(presenterId);
        }
    }

    private BasePresenter create(Class clazz) {
        BasePresenter presenter = null;
        try {
            presenter = (BasePresenter) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return presenter;
    }
}
