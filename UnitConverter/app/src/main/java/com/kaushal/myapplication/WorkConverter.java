package com.kaushal.myapplication;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WorkConverter extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_converter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent2 = getIntent();

        Spinner dropdown = (Spinner)findViewById(R.id.spinner0);
        String[] items = new String[]{"J", "kJ", "cal","kcal(Cal)","kW·h","kgf·m","in·lbf","ft·lbf","BTU"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);


    }

    public void sendWork(View view){

        TableLayout tableLayout0 = (TableLayout)findViewById(R.id.table0);
        while(tableLayout0.getChildCount()>0){
            tableLayout0.removeViewAt(0);
        }

        TableLayout tableLayout1 = (TableLayout)findViewById(R.id.table1);
        while(tableLayout1.getChildCount()>0){
            tableLayout1.removeViewAt(0);
        }


        String str=" ";
        double quantity=0;
        EditText editText = (EditText)findViewById(R.id.length);
        try {
            str = editText.getText().toString();
            quantity = Double.parseDouble(str);
        }
        catch(Exception e){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Please fill the 'Quantity' field").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            AlertDialog alert = builder.create();
            alert.show();
            return;
        }
        Spinner spinner = (Spinner)findViewById(R.id.spinner0);
        String selectedItem = spinner.getSelectedItem().toString();
        int from = spinner.getSelectedItemPosition();

        double unit[] = {1,.001,.239006,.000239,.000000277778,.101972,8.850746,.737562,.000948};
        String[] names = new String[]{"J", "kJ", "cal","kcal(Cal)","kW·h","kgf·m","in·lbf","ft·lbf","BTU"};


        for(int i=0;i<9;i++){
            StringBuilder sb = new StringBuilder();
            sb.append(Double.toString(quantity / unit[from] * unit[i]));
            String s0=sb.toString();
            BigDecimal bd = new BigDecimal(s0);
            BigDecimal bd1;
            bd1 = bd.setScale(15, RoundingMode.DOWN);
            double d = bd1.doubleValue();
            String s=Double.toString(d)+"\n";
            TableLayout tableLayout = (TableLayout)findViewById(R.id.table0);
            TableRow tr = new TableRow(this);
            tr.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            TextView textView = new TextView(this);
            textView.setText(s);
            textView.setTextSize(20);
            tr.addView(textView);
            tableLayout.addView(tr, new TableLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        }

        for(int i=0;i<9;i++){
            StringBuilder sb = new StringBuilder();
            sb.append("    " + names[i] + "\n");
            String s = sb.toString();
            TableLayout tableLayout = (TableLayout)findViewById(R.id.table1);
            TableRow tr = new TableRow(this);
            tr.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            TextView textView = new TextView(this);
            textView.setText(s);
            textView.setTextSize(20);
            tr.addView(textView);
            tableLayout.addView(tr, new TableLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        }


    }

}
