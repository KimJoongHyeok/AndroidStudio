package com.example.fin_201510332;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2_1 extends AppCompatActivity {

    RadioGroup rg1,rg2;
    RadioButton b1,b2,b3,b4,b5,b6;
    String str ,str2;
    int total=0;
    int s1 = 7000,s2 = 8000,s3 = 9000;

    View.OnClickListener radio_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (rg1.getCheckedRadioButtonId()) {
                case R.id.rb1 :
                    Toast.makeText(getApplicationContext(), "12시 시작영화 선택",Toast.LENGTH_SHORT).show();
                    str = "12시 영화";
                    break;
                case R.id.rb2 :
                    Toast.makeText(getApplicationContext(),"14시 시작영화 선택",Toast.LENGTH_SHORT).show();
                    str = "14시 영화";
                    break;
                case R.id.rb3:
                    Toast.makeText(getApplicationContext(),"16시 시작영화 선택",Toast.LENGTH_SHORT).show();
                    str = "16시 영화";
                    break;
            }
        }
    };

    View.OnClickListener radio_listener2 = new View.OnClickListener() {
        public void onClick(View v){

            switch(v.getId()) {

                case R.id.rb4:
                    Toast.makeText(getApplicationContext(), "2D영화 선택", Toast.LENGTH_SHORT).show();
                    total = s1;
                    str2 = "(2D)";
                    break;
                case R.id.rb5:
                    Toast.makeText(getApplicationContext(), "3D영화 선택", Toast.LENGTH_SHORT).show();
                    total = s2;
                    str2 = "(3D)";
                    break;

                case R.id.rb6:
                    Toast.makeText(getApplicationContext(), "4D영화 선택", Toast.LENGTH_SHORT).show();
                    total = s3;
                    str2 = "(4D)";
                    break;
            }
        }
    };



    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2_1);

        rg1 = (RadioGroup)findViewById(R.id.rg1);
        rg2 = (RadioGroup)findViewById(R.id.rg2);


        Button b1_1 = findViewById(R.id.button3_1);
        Button gotomain = findViewById(R.id.gotomainbtn3);

        //이전화면으로
        b1_1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent intent = new Intent(Activity2_1.this,Activity1.class);
                startActivity(intent);
            }
        });
        
        //처음화면으로
        gotomain.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent intent = new Intent(Activity2_1.this,MainActivity.class);
                startActivity(intent);
            }
        });

        
        b1 = (RadioButton)findViewById(R.id.rb1);
        b2 = (RadioButton)findViewById(R.id.rb2);
        b3 = (RadioButton)findViewById(R.id.rb3);
        b4 = (RadioButton)findViewById(R.id.rb4);
        b5 = (RadioButton)findViewById(R.id.rb5);
        b6 = (RadioButton)findViewById(R.id.rb6);

        Button b = (Button)findViewById(R.id.button); //가격확인버튼
        Button price = (Button)findViewById(R.id.pricebtn); //가격볼수잇는버튼

        b1.setOnClickListener(radio_listener);
        b2.setOnClickListener(radio_listener);
        b3.setOnClickListener(radio_listener);
        b4.setOnClickListener(radio_listener2);
        b5.setOnClickListener(radio_listener2);
        b6.setOnClickListener(radio_listener2);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                price.setText("해리포터와 죽음의 성물 " + (str) + (str2) + (total) + "원");
            }
        });


    }




}
