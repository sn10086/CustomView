package com.asi.customview;

import com.asi.customview.util.DLog;
import com.asi.customview.util.ToastUtil;
import com.asi.customview.view.NavigationView;
import com.asi.customview.view.NavigationView.ClickCallback;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initView();
    }

    private NavigationView navigationView;
    private void initView() {
        navigationView = (NavigationView) super.findViewById(R.id.nav_main);
        navigationView.setTitle("Title");
        navigationView.setClickCallback(new ClickCallback() {
            
            @Override
            public void onRightClick() {
                DLog.d("点击了右侧按钮!");
                ToastUtil.showShort(MainActivity.this, "点击了右侧按钮!");
            }
            
            @Override
            public void onBackClick() {
                DLog.d("点击了返回按钮!");
                ToastUtil.showShort(MainActivity.this, "点击了返回按钮!");
                finish();
            }
        });
    }
}
