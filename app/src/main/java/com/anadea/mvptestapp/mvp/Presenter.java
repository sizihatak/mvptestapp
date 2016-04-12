package com.anadea.mvptestapp.mvp;

import android.os.Bundle;

public interface Presenter<T extends MvpView> {
    void attachView(T view);

    void detachView();

    void saveState(Bundle bundle);

    void destroy();
}
