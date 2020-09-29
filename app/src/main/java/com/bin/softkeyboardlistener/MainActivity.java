package com.bin.softkeyboardlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SoftKeyBoardHelper.setListener(this, new SoftKeyBoardHelper.OnSoftKeyboardChangeListener() {
            @Override
            public void keyBoardShow() {

            }

            @Override
            public void keyBoardHide() {

            }
        });
    }
}
