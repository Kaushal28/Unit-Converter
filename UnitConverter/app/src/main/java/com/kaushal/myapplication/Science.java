package com.kaushal.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class Science extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent2 = getIntent();
    }

    public void PressureConverter(View view0){
        Intent intent0 = new Intent(this,PressureConverter.class);
        startActivity(intent0);
    }

    public void ForceConverter(View view1){
        Intent intent1 = new Intent(this,ForceConverter.class);
        startActivity(intent1);
    }

    public void WorkConverter(View view2){
        Intent intent2 = new Intent(this,WorkConverter.class);
        startActivity(intent2);
    }

    public void PowerConverter(View view3){
        Intent intent3 = new Intent(this,PowerConverter.class);
        startActivity(intent3);
    }
}
