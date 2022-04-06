package com.example.eggcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button btnRest;
    TextView textView;

    private int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.egg);
        textView=findViewById(R.id.counterText);
        btnRest=findViewById(R.id.btnRst);
        textView.setText("0");
        //initCounter();


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initCounter();
            }
        });

        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                counter--;
                textView.setText(" "+counter);
                return true;
            }
        });

        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
                counter=0;
            }
        });



    }

    private void initCounter() {
        counter++;
        textView.setText(" "+counter);
    }


}