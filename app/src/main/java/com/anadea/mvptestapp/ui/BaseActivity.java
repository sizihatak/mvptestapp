package com.anadea.mvptestapp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anadea.mvptestapp.MvpTestAppApplication;
import com.anadea.mvptestapp.injection.components.ApplicationComponent;
import com.anadea.mvptestapp.mvp.PresenterManager;

import javax.inject.Inject;

public abstract class BaseActivity extends AppCompatActivity {
    @Inject
    protected PresenterManager mPresenterManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ApplicationComponent applicationComponent =
                ((MvpTestAppApplication) getApplication()).getApplicationComponent();

        injectActivity(applicationComponent);
    }

    protected abstract void injectActivity(ApplicationComponent applicationComponent);
}
