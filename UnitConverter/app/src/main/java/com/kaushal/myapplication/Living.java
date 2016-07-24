package com.kaushal.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class Living extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_living);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent1 = getIntent();
    }

    public void TemperatureConverter(View view0){
        Intent intent0 = new Intent(this,TemperatureConverter.class);
        startActivity(intent0);
    }

    public void TimeConverter(View view1){
        Intent intent1 = new Intent(this,TimeConverter.class);
        startActivity(intent1);
    }

    public void SpeedConverter(View view2){
        Intent intent2 = new Intent(this,SpeedConverter.class);
        startActivity(intent2);
    }

}
