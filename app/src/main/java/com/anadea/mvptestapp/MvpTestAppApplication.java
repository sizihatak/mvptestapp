package com.anadea.mvptestapp;

import android.app.Application;

import com.anadea.mvptestapp.injection.components.ApplicationComponent;
import com.anadea.mvptestapp.injection.components.DaggerApplicationComponent;
import com.anadea.mvptestapp.injection.modules.ApplicationModule;

public class MvpTestAppApplication extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
