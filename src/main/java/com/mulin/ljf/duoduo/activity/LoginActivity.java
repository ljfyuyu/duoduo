package com.mulin.ljf.duoduo.activity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mulin.ljf.duoduo.R;
import com.mulin.ljf.duoduo.base.BaseActivity;
import com.mulin.ljf.duoduo.common.ProDemoContext;
import com.mulin.ljf.duoduo.db.DatabaseHelper;
import com.mulin.ljf.duoduo.rxJava.entity.SchoolModel;
import com.mulin.ljf.duoduo.rxJava.http.RetrofitManager;
import com.mulin.ljf.duoduo.rxJava.subscribers.ProgressSubscriber;
import com.mulin.ljf.duoduo.rxJava.subscribers.SubscriberOnNextListener;
import com.mulin.ljf.duoduo.utils.LogUtils;
import com.mulin.ljf.duoduo.view.WinToast;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

    @Bind(R.id.user_name)
    EditText userName;
    @Bind(R.id.password)
    EditText passWord;
    @Bind(R.id.error)
    TextView errorView;
    @Bind(R.id.loginButton)
    Button loginBtn;
    @Bind(R.id.register)
    TextView register;
    @Bind(R.id.forget_password)
    TextView forgetPassword;

    //注册各个控件的点击事件
    @OnClick({R.id.loginButton,R.id.register,R.id.forget_password})
    public void buttonClicks(View view) {
        switch(view.getId()) {
            case R.id.loginButton:
                String myUserName = userName.getText().toString();
                String myPassword = passWord.getText().toString();
                if (myUserName.isEmpty() || myPassword.isEmpty()) {
                    WinToast.toastWithCat(context, "用户名或密码不能为空" , false);
                    return;
                }
                getLoginStatus(myUserName,myPassword,"0",deviceId);
                break;

            case R.id.register:
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.forget_password:
                break;

        }
    }
//    LoadingDialog mDialog;

    private Context context;
    private DatabaseHelper dbHelper;
    private SQLiteDatabase db;
    private ProDemoContext mContext = ProDemoContext.getInstance();
    private SubscriberOnNextListener getLoginStatus,getSchoolInfo;

    String deviceId = "";
    String Tag = "loginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        init();
        initView();
        resolveRequest();
    }

    /*
    一些资源的初始化
     */
    private void init() {
        context = this;
        deviceId = Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
        LogUtils.d(Tag,"deviceId:"+deviceId);
        loginBtn.setEnabled(false);
        dbHelper = new DatabaseHelper(LoginActivity.this,mContext.APPNAME);
        db = dbHelper.getWritableDatabase();
    }
    /*
    控件设置初始化
     */
    private void initView() {
        passWord.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(!editable.toString().isEmpty()){
                    loginBtn.setEnabled(true);
                    loginBtn.setTextColor(Color.parseColor("#66cccc"));
                    loginBtn.setBackgroundResource(R.drawable.icon_log);
                }else {
                    loginBtn.setEnabled(true);
                    loginBtn.setTextColor(Color.WHITE);
                    loginBtn.setBackgroundResource(R.drawable.icon_log_02);
                }

            }
        });
    }
    /*
    处理网络请求返回的结果
     */
    private void resolveRequest() {

        getLoginStatus = new SubscriberOnNextListener<String>(){
            @Override
            public void onNext(String uid) {
                mContext.setUsername(userName.getText().toString());
                mContext.setUserID(uid+"");
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        getSchoolInfo = new SubscriberOnNextListener<List<SchoolModel>>() {
            @Override
            public void onNext(List<SchoolModel> schoolModels) {
                LogUtils.e(Tag,schoolModels.toString());
            }
        };

    }
    /*
    获取登录结果状态
     */
    private void getLoginStatus(String userName,String password,String role,String deviceId){
        RetrofitManager.getInstance(1).getLoginStatus(new ProgressSubscriber(getLoginStatus,LoginActivity.this),userName,password,role,deviceId);
    }

}
