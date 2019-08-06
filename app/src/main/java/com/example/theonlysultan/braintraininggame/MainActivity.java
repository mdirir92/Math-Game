package com.example.theonlysultan.braintraininggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity{
    Button cntBtn, nwgmeBtn, abtBtn, exitBtn;
    private PopupWindow popupWndw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
