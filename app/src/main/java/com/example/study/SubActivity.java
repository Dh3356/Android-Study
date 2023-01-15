package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;
    private Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub = findViewById(R.id.tv_sub);
        btn_back = findViewById(R.id.btn_back);

        Intent i = getIntent();//Intent를 받는다
        String text = i.getStringExtra("text");//데이터 수신(String)

        tv_sub.setText(text+"님 환영합니다!");

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                finish();//Activity 종료
            }
        });
    }
}