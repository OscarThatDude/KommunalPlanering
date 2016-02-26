package com.hoffmanlbsstockholm.oscar.kommunalplanering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kontakta_databas() {

        EditText input_1= (EditText)findViewById(R.id.input_1);
        String input_dataget= input_1.getText().toString();
    }
}

