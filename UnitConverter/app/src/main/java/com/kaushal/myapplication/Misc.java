package com.kaushal.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class Misc extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misc);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent3 = getIntent();
    }

    public void AngleConverter(View view0){
        Intent intent0 = new Intent(this,AngleConverter.class);
        startActivity(intent0);
    }

    public void DataConverter(View view1){
        Intent intent1 = new Intent(this,DataConverter.class);
        startActivity(intent1);
    }

    public void FuelConverter(View view2){
        Intent intent2 = new Intent(this,FuelConverter.class);
        startActivity(intent2);
    }

    public void CookingConverter(View view3){
        Intent intent3 = new Intent(this,CookingConverter.class);
        startActivity(intent3);
    }
}
