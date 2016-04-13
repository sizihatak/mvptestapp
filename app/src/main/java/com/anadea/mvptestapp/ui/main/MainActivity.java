package com.anadea.mvptestapp.ui.main;

import android.os.Bundle;

import com.anadea.mvptestapp.R;
import com.anadea.mvptestapp.injection.components.ApplicationComponent;
import com.anadea.mvptestapp.ui.BaseActivity;

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
    protected void injectActivity(ApplicationComponent applicationComponent) {
        applicationComponent.inject(this);
    }

    private void startLoginActivity() {

    }
}
