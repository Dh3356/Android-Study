package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText et_user_id;
    private Button btn_login;
    private String text;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //R: 리소스를 관리하는 클래스
        //R.id: R 안의 리소스 id를 관리하는 클래스
        et_user_id = findViewById(R.id.et_user_id);
        btn_login = findViewById(R.id.btn_login);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text = et_user_id.getText().toString();
                if(text.length() > 0)//아이디를 검사하지 않을 것이므로 한 글자라도 입력하면 로그인한다
                {
                    Toast.makeText(getApplicationContext(), "login success", Toast.LENGTH_SHORT).show();//Toast Message를 짧게 띄운다
                    Intent i = new Intent(MainActivity.this, SubActivity.class);//현재 Activity에서 SubActivity로 넘어가게
                    i.putExtra("text", text);//데이터 송신(text 변수의 데이터를 value 값으로, "text"를 name 값으로 송신한다)
                    startActivity(i);//새로운 Activity를 화면에 띄운다(SubActivity를 화면에 띄운다)
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "login fail", Toast.LENGTH_SHORT).show();//아이디를 입력하지 않았다면 로그임을 하지 않는다
                }
            }
        });
    }
}
