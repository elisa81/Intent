package com.jmj.edu.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String text = ((Button) v).getText().toString();
        Intent intent = null;
        intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}