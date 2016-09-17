package com.mulin.ljf.duoduo.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.mulin.ljf.duoduo.R;
import com.mulin.ljf.duoduo.common.ProDemoContext;

public class SplashActivity extends Activity {

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private Context context;
    private final int SPLASH_DISPLAY_LENGHT = 2000;
    private String account;
    private String password;
    private Handler handler;
    private ProDemoContext mContext = ProDemoContext.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcom);
        context = SplashActivity.this;
        handler = new Handler();
        preferences = getSharedPreferences("firststart",Context.MODE_PRIVATE);

        if(preferences.getBoolean("firststart",true)){
            editor.putBoolean("firststart",false);
            editor.commit();
            Intent mainIntent = new Intent(SplashActivity.this,WelcomeActivity.class);
            startActivity(mainIntent);
            SplashActivity.this.finish();
        }
        else{
            loginIn();
        }
    }

    public void loginIn(){
        if(mContext.getUserID()!= null && !mContext.getUserID().equals("") && !mContext.getUserID().endsWith("0")){
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(mainIntent);
                    SplashActivity.this.finish();
                }
            },SPLASH_DISPLAY_LENGHT);
        }
        else {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent mainIntent = new Intent(SplashActivity.this,LoginActivity.class);
                    startActivity(mainIntent);
                    SplashActivity.this.finish();
                }
            },SPLASH_DISPLAY_LENGHT);
        }
    }
}
