package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textName ;
Button button;
TextView Name ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textName = (TextView) findViewById(R.id.textName);
        button= (Button) findViewById(R.id.button);
        Name=(TextView) findViewById(R.id.Name);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n= Name.getText().toString();
                textName.setText("Hello "+ n);
            }
        });
    }
}