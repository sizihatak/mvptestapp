package com.anadea.mvptestapp.injection.modules;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return this.mApplication;
    }
}
