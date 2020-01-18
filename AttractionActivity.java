package com.example.discoverethiopia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AttractionActivity extends AppCompatActivity implements View.OnClickListener {
    private Button but1,but2,but3,but4,but5,but6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction);


        but2 =findViewById(R.id.nature);
        but3 =findViewById(R.id.history);
        but4 =findViewById(R.id.holy);
        but5 =findViewById(R.id.unesco);
        but6 =findViewById(R.id.museum);
        but1= findViewById(R.id.arch);

        but1.setOnClickListener(AttractionActivity.this);
        but2.setOnClickListener(AttractionActivity.this);
        but3.setOnClickListener(AttractionActivity.this);
        but4.setOnClickListener(AttractionActivity.this);
        but5.setOnClickListener(AttractionActivity.this);
        but6.setOnClickListener(AttractionActivity.this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
           case R.id.arch:
                Intent i=new Intent(AttractionActivity.this,Archeological.class);
                startActivity(i);
                break;
            case R.id.nature:
                Intent i1=new Intent(AttractionActivity.this,Natural.class);
                startActivity(i1);
                break;
            case R.id.history:
                Intent i2=new Intent(AttractionActivity.this,Historical.class);
                startActivity(i2);
                break;
            case R.id.holy:
                Intent i3=new Intent(AttractionActivity.this,Holidays.class);
                startActivity(i3);
                break;
            case R.id.unesco:
                Intent i4=new Intent(AttractionActivity.this,Unesco.class);
                startActivity(i4);
                break;
            case R.id.museum:
                Intent i5=new Intent(AttractionActivity.this,Museum.class);
                startActivity(i5);
                break;
        }

    }
}
