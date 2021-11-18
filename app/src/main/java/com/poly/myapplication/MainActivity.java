package com.poly.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String text ="Dự án 1";
    int number ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hello
        System.out.println("Hello");
        String test ="ĐÂY LÀ pHONG ĐẸP TRAI";
    }
}