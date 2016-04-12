package com.anadea.mvptestapp.injection.components;

import android.app.Application;
import android.content.Context;

import com.anadea.mvptestapp.injection.ApplicationContext;
import com.anadea.mvptestapp.injection.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(Application application);

    // Exported for child-components.
    @ApplicationContext
    Context getContext();

    //Exposes Application to any component which depends on this
    Application getApplication();
}
