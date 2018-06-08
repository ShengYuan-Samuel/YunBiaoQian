package com.dapeng.yunbiaoqian;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_view;
    private TextView tv_view1;
    private TextView tv_view2;
    private TextView tv_view3;
    private TextView tv_view4;
    private TextView tv_view5;
    private TextView tv_view6;
    private TextView tv_view7;
    private TextView tv_view8;
    private TextView tv_view9;
    private TextView tv_view10;
    private TextView tv_view11;
    private TextView tv_view12;
    private TextView tv_view13;
    private TextView tv_view14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tv_view = (TextView) findViewById(R.id.tv_view);

        tv_view1 = (TextView) findViewById(R.id.tv_view1);
        tv_view2 = (TextView) findViewById(R.id.tv_view2);

        tv_view3 = (TextView) findViewById(R.id.tv_view3);
        tv_view4 = (TextView) findViewById(R.id.tv_view4);
        tv_view5 = (TextView) findViewById(R.id.tv_view5);
        tv_view6 = (TextView) findViewById(R.id.tv_view6);
        tv_view7 = (TextView) findViewById(R.id.tv_view7);
        tv_view8 = (TextView) findViewById(R.id.tv_view8);
        tv_view9 = (TextView) findViewById(R.id.tv_view9);
        tv_view10 = (TextView) findViewById(R.id.tv_view10);
        tv_view11 = (TextView) findViewById(R.id.tv_view11);
        tv_view12 = (TextView) findViewById(R.id.tv_view12);
        tv_view13 = (TextView) findViewById(R.id.tv_view13);
        tv_view14 = (TextView) findViewById(R.id.tv_view14);
        tv_view.setText("你是好人");
        tv_view1.setText("你是好人");
        tv_view2.setText("你是好人");
        tv_view3.setText("你是好人");
        tv_view4.setText("你是好人");
        tv_view5.setText("你是好人");
        tv_view6.setText("你是好人");
        tv_view7.setText("你是好人");
        tv_view8.setText("你是好人");
        tv_view9.setText("你是好人");
        tv_view10.setText("你是好人");
        tv_view11.setText("你是好人");
        tv_view12.setText("你是好人");
        tv_view13.setText("你是好人");
        tv_view14.setText("你是好人");
    }
}
