package com.anadea.mvptestapp.injection.modules;

import com.anadea.mvptestapp.data.DataManager;
import com.anadea.mvptestapp.data.DataManagerImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataManagerModule {

    @Provides
    @Singleton
    DataManager dataManager() {
        return new DataManagerImpl();
    }
}