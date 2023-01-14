package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText Type;
    Button Done;
    TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //R: 리소스를 관리하는 클래스
        //R.id: R 안의 리소스 id를 관리하는 클래스
        Type = findViewById(R.id.Type);
        Done = findViewById(R.id.Done);
        Result = findViewById((R.id.Result));

        Done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Result.setText(Type.getText());
            }
        });
    }
}
