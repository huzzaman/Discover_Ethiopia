package com.example.discoverethiopia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

public class Holidays extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    String[] holyList={"Abay tis","Tiya dingay","Yangudi rasa"};
    private ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holidays);

        ListView holy;
        holy=(ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,holyList);
        holy.setAdapter(adapter);
    }
}
