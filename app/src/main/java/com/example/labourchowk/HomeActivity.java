package com.example.labourchowk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home3);
    }

    public void plum(View view) throws ClassNotFoundException {
        String v="com.example.labourchowk"+String.valueOf(view.getId())+"Activity";
        System.out.println(v);
        Class<?> c=Class.forName(v);
       // Intent intent=new Intent(this,PlumberActivity.class);
        Intent intent=new Intent(this,c);
        startActivity(intent);

    }


}