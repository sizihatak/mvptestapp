package com.anadea.mvptestapp.injection.modules;

import android.content.Context;

import com.anadea.mvptestapp.data.DataManager;
import com.anadea.mvptestapp.data.DataManagerImpl;
import com.anadea.mvptestapp.injection.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataManagerModule {

    @Provides
    @Singleton
    DataManager dataManager(@ApplicationContext Context context) {
        return new DataManagerImpl(context);
    }
}