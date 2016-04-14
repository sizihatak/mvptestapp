package com.anadea.mvptestapp.data;

import android.content.Context;
import android.content.SharedPreferences;

import com.anadea.mvptestapp.data.preferences.StringPreference;
import com.anadea.mvptestapp.injection.ApplicationContext;

public class DataManagerImpl implements DataManager{

    private static final String PREF_FILE_NAME = "preferences";
    protected static final String USER_INFO_PREFERENCES = "user_info_preferences";
    private final StringPreference mUserInfoPreferences;

    public DataManagerImpl(@ApplicationContext Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME,
                Context.MODE_PRIVATE);

        mUserInfoPreferences = new StringPreference(sharedPreferences, USER_INFO_PREFERENCES);
    }

    @Override
    public boolean checkAuth() {
        return mUserInfoPreferences.isSet();
    }

    @Override
    public void resetAuth() {

    }
}
