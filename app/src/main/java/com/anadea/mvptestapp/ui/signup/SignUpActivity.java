package com.anadea.mvptestapp.ui.signup;


import android.os.Bundle;

import com.anadea.mvptestapp.R;
import com.anadea.mvptestapp.injection.components.ApplicationComponent;
import com.anadea.mvptestapp.mvp.MvpView;
import com.anadea.mvptestapp.ui.BaseActivity;

public class SignUpActivity extends BaseActivity implements MvpView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

    }

    @Override
    protected void injectActivity(ApplicationComponent applicationComponent) {
        applicationComponent.inject(this);
    }

    @Override
    public void init() {

    }
}