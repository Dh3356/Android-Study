package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText et_test;
    private Button btn_move;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //R: 리소스를 관리하는 클래스
        //R.id: R 안의 리소스 id를 관리하는 클래스
        et_test = findViewById(R.id.et_test);
        btn_move = findViewById(R.id.btn_move);


        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(MainActivity.this, SubActivity.class);//현재 Activity에서 SubActivity로 넘어가게
                text = et_test.getText().toString();
                i.putExtra("text", text);//데이터 송신(text 변수의 데이터를 value 값으로, "text"를 name 값으로 송신한다)
                startActivity(i);//새로운 Activity를 화면에 띄운다(SubActivity를 화면에 띄운다)
            }
        });
    }
}
