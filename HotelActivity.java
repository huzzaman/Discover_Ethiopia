package com.example.discoverethiopia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toolbar;

public class HotelActivity extends AppCompatActivity {
     String items[]=new String[]{"Hilton","Sheraton","SkyLight","WabiShebele","RasAdama"};
     private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        button =(Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(HotelActivity.this,newact.class);
                startActivity(in);
            }
        });


    }
}
