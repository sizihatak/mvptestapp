package com.anadea.mvptestapp.injection.components;

import android.app.Application;
import android.content.Context;

import com.anadea.mvptestapp.injection.ApplicationContext;
import com.anadea.mvptestapp.injection.modules.ApplicationModule;
import com.anadea.mvptestapp.injection.modules.DataManagerModule;
import com.anadea.mvptestapp.ui.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, DataManagerModule.class})
public interface ApplicationComponent {

    void inject(MainActivity activity);

    // Exported for child-components.
    @ApplicationContext
    Context getContext();

    //Exposes Application to any component which depends on this
    Application getApplication();
}
