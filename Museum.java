package com.example.discoverethiopia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

public class Museum extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    String[] musList={"Abay tis","Tiya dingay","Yangudi rasa"};
    private ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);
        ListView museum;
        museum=(ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,musList);
        museum.setAdapter(adapter);
    }
}
