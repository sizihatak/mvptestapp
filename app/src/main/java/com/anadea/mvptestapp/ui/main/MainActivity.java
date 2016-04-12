package com.anadea.mvptestapp.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anadea.mvptestapp.R;

public class MainActivity extends AppCompatActivity implements MainMvpView{

    private MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (mMainPresenter!=null && !mMainPresenter.checkAuth()) {
            finish();
            startLoginActivity();
            return;
        }
    }

    private void startLoginActivity() {

    }
}
