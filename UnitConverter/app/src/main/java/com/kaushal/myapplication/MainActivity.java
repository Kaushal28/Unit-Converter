package com.kaushal.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Basic(View view0) {
        Intent intent0 = new Intent(this,Basic.class);
        startActivity(intent0);
    }

    public void Living(View view1){
        Intent intent1 = new Intent(this,Living.class);
        startActivity(intent1);
    }

    public void Science(View view2){
        Intent intent2 = new Intent(this,Science.class);
        startActivity(intent2);
    }

    public void Misc(View view3){
        Intent intent3 = new Intent(this,Misc.class);
        startActivity(intent3);
    }


    @Override


    public  void onBackPressed(){
        new AlertDialog.Builder(this).setTitle("Warning!").setMessage("Are you sure want to exit?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("No",null).show();
    }

}
