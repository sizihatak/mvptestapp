package com.anadea.mvptestapp.data.preferences;

public interface Preference<T> {

    T get();
    boolean isSet();
    void set(T value);
    void delete();
}