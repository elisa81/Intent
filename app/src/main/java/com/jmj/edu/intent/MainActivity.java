package com.jmj.edu.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1, button2, button3;
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String text = ((Button) v).getText().toString();
        int id = v.getId();
        Intent intent = null;

            switch(id) {
            case R.id.button1:
                intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;
                case R.id.button2:
                    intent = new Intent(this, Main3Activity.class);
                    startActivity(intent);
                    break;
        }
    }
}
