package com.vahitkeskin.javabottomsheetactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBottomSheetActivity (View view) {
        BottomSheetActivity bottomSheetActivity = new BottomSheetActivity();
        bottomSheetActivity.show(getSupportFragmentManager(),"BottomSheetActivity");
    }
}