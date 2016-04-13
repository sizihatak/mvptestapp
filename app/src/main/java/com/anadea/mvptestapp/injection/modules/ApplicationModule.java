package com.anadea.mvptestapp.injection.modules;

import android.app.Application;
import android.content.Context;

import com.anadea.mvptestapp.data.DataManager;
import com.anadea.mvptestapp.injection.ApplicationContext;
import com.anadea.mvptestapp.mvp.PresenterManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return this.mApplication;
    }

    @Provides
    Application provideApplication() {
        return this.mApplication;
    }

    @Provides
    @Singleton
    PresenterManager providePresenterManager(DataManager dataManager) {
        return new PresenterManager(dataManager);
    }
}
