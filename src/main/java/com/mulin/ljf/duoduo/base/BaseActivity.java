package com.mulin.ljf.duoduo.base;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.widget.Toast;

import com.mulin.ljf.duoduo.R;

public class BaseActivity extends Activity {

    private boolean isExit;
    private Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        handler = new MyHandler();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {

            if (keyCode == KeyEvent.KEYCODE_BACK) {
                exit();
                return false;
            }
            return super.onKeyDown(keyCode, event);

        }
        return false;
    }
    private void exit(){
        if(!isExit){
            isExit = true;
            Toast.makeText(getApplicationContext(),"再按一次退出程序",Toast.LENGTH_LONG).show();
            handler.sendEmptyMessageDelayed(100,200);
        }
        else {
            finish();
        }
    }

    class MyHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case 100:
                    super.handleMessage(msg);
                    isExit = false;
                    break;
            }
        }
    }
}
