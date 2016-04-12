package com.anadea.mvptestapp.data.preferences;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;

import com.anadea.mvptestapp.data.DataManager;

public abstract class BasePreference<T> implements Preference<T> {

    protected final SharedPreferences preferences;
    protected final String key;
    protected final T defaultValue;

    public BasePreference(@NonNull SharedPreferences preferences, @NonNull String key, T defaultValue) {
        this.preferences = preferences;
        this.key = key;
        this.defaultValue = defaultValue;
    }

    @Override
    public boolean isSet() {
        return preferences.contains(key);
    }

    @Override
    public void delete() {
        preferences.edit().remove(key).apply();
    }
}