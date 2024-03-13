package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;
    TextView tvDisplay;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        tvDisplay = findViewById(R.id.tvDisplay);




/**
        Handler handler = new Handler();

        btn1.setOnClickListener(handler);
        btn2.setOnClickListener(handler);

 **/


//=================================================
//=================================================

//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                tvDisplay.setText("Login Button is Clicked");
//            }
//        });
//
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                tvDisplay.setText("LogOut Button is Clicked");
//            }
//        });

//=================================================
//=================================================

    }// onCreate Bundle


    public void clickedMessage (View view){
        if (view.getId()==R.id.btn1){
            tvDisplay.setText("Login Button is Clicked");
        }if (view.getId()==R.id.btn2){
            tvDisplay.setText("Logout Button is Clicked");
        }
    }

/**
    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.btn1){
                tvDisplay.setText("Login Button is Clicked");
            }if (view.getId()==R.id.btn2){
                tvDisplay.setText("Logout Button is Clicked");
            }

        }
    }
 **/


} //AppCompatActivity