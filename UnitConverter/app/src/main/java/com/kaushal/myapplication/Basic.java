package com.kaushal.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class Basic extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent0 = getIntent();
    }

    public void LengthConverter(View view0){
        Intent intent0 = new Intent(this,LengthConverter.class);
        startActivity(intent0);
    }

    public void AreaConverter(View view1){
        Intent intent1 = new Intent(this,AreaConverter.class);
        startActivity(intent1);
    }

    public void WeightConverter(View view2){
        Intent intent2 = new Intent(this,WeightConverter.class);
        startActivity(intent2);
    }

    public void VolumeConverter(View view3){
        Intent intent3 = new Intent(this,VolumeConverter.class);
        startActivity(intent3);
    }


}
