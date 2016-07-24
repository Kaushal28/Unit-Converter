package com.kaushal.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TemperatureConverter extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent0 = getIntent();

        Spinner dropdown = (Spinner)findViewById(R.id.spinner0);
        String[] items = new String[]{"°C", "°F", "K","°R","°Rè"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

    }

    public void sendTemperature(View view){
        EditText editText = (EditText)findViewById(R.id.length);
        String length = editText.getText().toString();
        double l = Double.parseDouble(length);

        Spinner spinner = (Spinner)findViewById(R.id.spinner0);
        String selected = spinner.getSelectedItem().toString();
        StringBuilder s = new StringBuilder();
        if(selected=="°C"){
            s.append(l+" °C\n");
            s.append((l*(1.8)+32)+" °F\n");
            s.append((l+273.15)+" K\n");
            s.append(((l+273.15)*1.8)+" °R\n");
            s.append((l*.8)+" °Rè\n");;
        }
        else if(selected=="°F"){
            s.append((l-32)/1.8+" °C\n");
            s.append(l+" °F\n");
            s.append((l-32)/1.8+273.15+" K\n");
            s.append((((l-32)/1.8)+273.15)*1.8+" °R\n");
            s.append((l-32)/1.8*.8+" °Rè\n");;
        }
        else if(selected=="K"){
            s.append(l-273.15+" °C\n");
            s.append((l-273.15)*1.8+32+" °F\n");
            s.append(l+" K\n");
            s.append((l)*1.8+" °R\n");
            s.append((l-273.15)*.8+" °Rè\n");;
        }
        else if(selected=="°R"){
            s.append(l/1.8-273.15+" °C\n");
            s.append((l/(1.8)-273.15)*1.8+32+" °F\n");
            s.append((l/(1.8)-273.15)+273.15+" K\n");
            s.append((l)+" °R\n");
            s.append((l/(1.8)-273.15)*.8+" °Rè\n");;
        }
        else if(selected=="°Rè"){
            s.append(l/.8+" °C\n");
            s.append((l/.8)*1.8+32+" °F\n");
            s.append((l/.8)+273.15+" K\n");
            s.append(((l/.8)+273.15)*1.8+" °R\n");
            s.append((l)+" °Rè\n");;
        }

        String s1 = s.toString();
        //  intent.putExtra(EXTRA_MESSAGE , s1);
        //  startActivity(intent);




        //  TextView textView = new TextView(this);
        //  textView.setTextSize(20);
        //  textView.setText(length);

        TextView textView1 = (TextView) findViewById(R.id.textView6);
        textView1.setText(s1);
        textView1.setTextSize(25);


    }

}
