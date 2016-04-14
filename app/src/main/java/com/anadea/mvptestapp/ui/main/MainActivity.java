package com.anadea.mvptestapp.ui.main;

import android.content.Intent;
import android.os.Bundle;

import com.anadea.mvptestapp.R;
import com.anadea.mvptestapp.injection.components.ApplicationComponent;
import com.anadea.mvptestapp.ui.BaseActivity;
import com.anadea.mvptestapp.ui.login.LoginActivity;

public class MainActivity extends BaseActivity implements MainMvpView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainPresenter mMainPresenter = (MainPresenter) mPresenterManager.getPresenter(MainPresenter.class, savedInstanceState);

        if (mMainPresenter !=null && !mMainPresenter.checkAuth()) {
            finish();
            startLoginActivity();
            return;
        }
    }

    @Override
    public void init() {

    }

    @Override
    protected void injectActivity(ApplicationComponent applicationComponent) {
        applicationComponent.inject(this);
    }

    private void startLoginActivity() {
        startActivity(new Intent(getApplicationContext(), LoginActivity.class)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
    }
}
