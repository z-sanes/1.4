package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView name =findViewById(R.id.name_test);
        final TextView cla =findViewById(R.id.class_test);
        final TextView num =findViewById(R.id.number_test);
        Button bt =findViewById(R.id.btn_test);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                name.setText("朱鑫");
                name.setTextColor(Color.BLUE);
                cla.setText("19物联网工程专升本1班");
                cla.setTextColor(Color.GREEN);
                num.setText("1903850138");
                num.setTextColor(Color.RED);
            }

        }
        );


    }
}
