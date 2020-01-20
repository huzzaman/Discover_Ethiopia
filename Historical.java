package com.example.discoverethiopia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

public class Historical extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    String[] histList={"Axum-Mysterios Monoliths","Gondar:-The Comelot Of Africa","Harar Jugol"};
    private ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical);

        ListView history;
        history=(ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,histList);
        history.setAdapter(adapter);
    }
}
