package com.anadea.mvptestapp.injection.components;

import android.app.Application;

import com.anadea.mvptestapp.injection.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(Application application);

    //Exposes Application to any component which depends on this
    Application getApplication();
}
