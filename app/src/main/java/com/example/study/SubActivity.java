package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SubActivity extends AppCompatActivity {
    private TextView tv_welcome;
    private Button btn_back;
    private ImageView iv_launcher;
    private TextView tv_counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_welcome = findViewById(R.id.tv_welcome);
        btn_back = findViewById(R.id.btn_back);
        iv_launcher = findViewById((R.id.iv_launcher));
        tv_counter = findViewById(R.id.tv_counter);

        Intent i = getIntent();//Intent를 받는다
        String text = i.getStringExtra("text");//데이터 수신(String)

        tv_welcome.setText(text+"님 환영합니다!");
        //이미지를 클릭하면 counter가 증가한다
        iv_launcher.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int c = Integer.parseInt(tv_counter.getText().toString())+1;//counter의 text를 int로 만든다
                tv_counter.setText(Integer.toString(c));//다시 String으로 만든 후 setText()
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                finish();//Activity 종료
            }
        });
    }
}