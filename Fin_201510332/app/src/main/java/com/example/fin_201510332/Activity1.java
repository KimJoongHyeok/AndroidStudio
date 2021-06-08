package com.example.fin_201510332;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);


        final RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingbar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getApplicationContext(),"줄거리 평점 : " + rating,Toast.LENGTH_SHORT).show();
            }
        });

        Button b = findViewById(R.id.button3_1);
        Button b2 = findViewById(R.id.gotomainbtn3);

        b.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent intent = new Intent(Activity1.this,Activity1_1.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent intent = new Intent(Activity1.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
