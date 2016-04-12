package com.anadea.mvptestapp.data.preferences;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;

public class BooleanPreference extends BasePreference<Boolean> {

    public static final boolean DEFAULT_VALUE = false;

    public BooleanPreference(@NonNull SharedPreferences preferences, @NonNull String key) {
        this(preferences, key, DEFAULT_VALUE);
    }

    public BooleanPreference(@NonNull SharedPreferences preferences, @NonNull String key,
                             @NonNull Boolean defaultValue) {
        super(preferences, key, defaultValue);
    }

    @Override
    public Boolean get() {
        return preferences.getBoolean(key, defaultValue);
    }

    @Override
    public void set(@NonNull Boolean value) {
        preferences.edit().putBoolean(key, value).apply();
    }

}