package com.example.a171y033.leson12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.button;
import static android.R.id.button2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button4 = (Button) findViewById(button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View){
                Toast.makeText(MainActivity.this, R.string.app_name,Toast.LENGTH_LONG).show();
            }
        });
    }
}
