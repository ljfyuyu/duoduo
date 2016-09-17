package com.mulin.ljf.duoduo.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.mulin.ljf.duoduo.R;
import com.mulin.ljf.duoduo.common.ProDemoContext;

import butterknife.Bind;
import butterknife.ButterKnife;

public class WelcomeActivity extends Activity implements GestureDetector.OnGestureListener{

    @Bind(R.id.viewflit_activity)
    ViewFlipper flipper;
    @Bind(R.id.pic3)
    ImageView go;
    @Bind(R.id.pic1)
    ImageView pic1;
    private GestureDetector gestureDetector;

    private Handler handler;
    private ProDemoContext mContext = ProDemoContext.getInstance();
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private static final int sleepTime = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcom);
        preferences = getSharedPreferences("firststart", Context.MODE_PRIVATE);
        handler = new Handler();
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        if(preferences.getBoolean("firststart",true)){
            editor = preferences.edit();
            editor.putBoolean("firststart",false);
            editor.commit();
            gestureDetector = new GestureDetector(this);
            go.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent mainIntent = new Intent(WelcomeActivity.this,LoginActivity.class);
                    startActivity(mainIntent);
                    WelcomeActivity.this.finish();
                }
            });

        }
        else{
            pic1.setImageResource(R.drawable.logo750x1134);
            if(mContext.getUserID()!= null && !mContext.getUserID().equals("") && !mContext.getUserID().endsWith("0")){
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent mainIntent = new Intent(WelcomeActivity.this,MainActivity.class);
                        startActivity(mainIntent);
                        WelcomeActivity.this.finish();
                    }
                },sleepTime);
            }
            else {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent mainIntent = new Intent(WelcomeActivity.this,LoginActivity.class);
                        startActivity(mainIntent);
                        WelcomeActivity.this.finish();
                    }
                },sleepTime);
            }
        }
    }




    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        if(motionEvent.getX() > motionEvent1.getX()){
            flipper.setInAnimation(AnimationUtils.loadAnimation(this,R.anim.slide_in_from_right));
            flipper.setOutAnimation(AnimationUtils.loadAnimation(this,R.anim.slide_out_to_left));
            flipper.showNext();
        }else if(motionEvent.getX() < motionEvent1.getX()){
            flipper.setInAnimation(AnimationUtils.loadAnimation(this,R.anim.slide_in_from_left));
            flipper.setOutAnimation(AnimationUtils.loadAnimation(this,R.anim.slide_out_to_right));
            flipper.showPrevious();
        }else {
            return false;
        }
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }
}
