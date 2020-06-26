package com.pyyj.communityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1 (View v){
        Intent b1 = new Intent(this, FirstActivity.class);
        startActivity(b1);
    }

    public void onClick2(View v){
        Intent b2 = new Intent(this, SecondActivity.class);
        startActivity(b2);
    }

    public void onClick3(View v){
        Intent b3 = new Intent(this, ThirdActivity.class);
        startActivity(b3);
    }


    public void onClick4(View v){
        Intent b4 = new Intent(this, FourthActivity.class);
        startActivity(b4);
    }


    public void onClick5(View v)
    {
        Intent b5 = new Intent (this, FinalActivity.class);
        startActivity(b5);
    }
}
