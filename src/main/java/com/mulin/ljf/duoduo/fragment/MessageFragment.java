package com.mulin.ljf.duoduo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mulin.ljf.duoduo.R;
import com.mulin.ljf.duoduo.utils.LogUtils;

/**
 * Created by mulin on 16/9/21.
 */
public class MessageFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e("fragment","onCreateView");
        return inflater.inflate(R.layout.activity_main, container, false);

    }

    @Override
    public void onDetach() {
        Log.e("fragment","onDetach");
        super.onDetach();

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.e("fragment","onCreate");
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onDestroy() {
        Log.e("fragment","onDestroy");
        super.onDestroy();

    }

    @Override
    public void onDestroyView() {
        Log.e("fragment","onDestroyView");
        super.onDestroyView();

    }

    @Override
    public void onPause() {
        Log.d("fragment","onPause");
        super.onPause();

    }

    @Override
    public void onResume() {
        Log.e("fragment","onResume");
        super.onResume();

    }

    @Override
    public void onStart() {
        Log.e("fragment","onStart");
        super.onStart();

    }

    @Override
    public void onStop() {
        Log.e("fragment","onStop");
        super.onStop();

    }
}
