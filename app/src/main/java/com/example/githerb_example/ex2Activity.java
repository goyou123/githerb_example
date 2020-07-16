package com.example.githerb_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ex2Activity extends AppCompatActivity {
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);

        text1 = (TextView)findViewById(R.id.text);
        text1.setText("충돌가능 김청아");

        //청아누나가 코드 치고있을때 내가 commit 해보기
    }
}
