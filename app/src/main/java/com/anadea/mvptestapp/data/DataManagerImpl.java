package com.anadea.mvptestapp.data;

import android.content.Context;

import com.anadea.mvptestapp.injection.ApplicationContext;

public class DataManagerImpl implements DataManager{


    public DataManagerImpl(@ApplicationContext Context context) {

    }

    @Override
    public boolean checkAuth() {
        return false;
    }

    @Override
    public void resetAuth() {

    }
}
