package com.example.citylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class showActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showcity2);
        Intent intent =getIntent();
        String s= intent.getStringExtra("cityname");

        TextView city = findViewById(R.id.view);
        city.setText(s);

        Button back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(showActivity.this,MainActivity.class);
                startActivity(intent1);
                finish();

            }
        });

    }
}