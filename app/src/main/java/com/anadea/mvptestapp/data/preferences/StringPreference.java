package com.anadea.mvptestapp.data.preferences;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;

public class StringPreference extends BasePreference<String> {

    public StringPreference(@NonNull SharedPreferences preferences, @NonNull String key) {
        this(preferences, key, null);
    }

    public StringPreference(@NonNull SharedPreferences preferences, @NonNull String key,
                            String defaultValue) {
        super(preferences, key, defaultValue);
    }

    @Override
    public String get() {
        return preferences.getString(key, defaultValue);
    }

    @Override
    public void set(@NonNull String value) {
        preferences.edit().putString(key, value).apply();
    }
}
