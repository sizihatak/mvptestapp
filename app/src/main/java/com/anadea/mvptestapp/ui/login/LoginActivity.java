package com.anadea.mvptestapp.ui.login;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.anadea.mvptestapp.R;
import com.anadea.mvptestapp.injection.components.ApplicationComponent;
import com.anadea.mvptestapp.ui.BaseActivity;

public class LoginActivity extends BaseActivity implements LoginMvpView{

    private final static String SIGN_UP_TEXT = "Not a member? <a href=\"com.anadea.mvptestapp.ui://signup\">Sign up</a> now.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();

        LoginPresenter loginPresenter = (LoginPresenter) mPresenterManager.getPresenter(LoginPresenter.class, savedInstanceState);
        loginPresenter.attachView(this);
    }

    @Override
    protected void injectActivity(ApplicationComponent applicationComponent) {
        applicationComponent.inject(this);
    }

    @Override
    public void init() {
        TextView signUpTextView = (TextView) findViewById(R.id.activity_login_sign_up_tv);
        assert signUpTextView != null;
        signUpTextView.setText(Html.fromHtml(SIGN_UP_TEXT));
        signUpTextView.setClickable(true);
        signUpTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
