package com.example.discoverethiopia;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CulturalFoods extends AppCompatActivity {
    ListView listview;
    String mTitle[] = {"Injera","Doro Wot","Kitfo"};
    String mDescription[] = {"This is injera","This is doro wot","This is kitfo"};
    int images[] ={R.drawable.injera,R.drawable.dorowot,R.drawable.kitfo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural_foods);

        listview=findViewById(R.id.listview1);

        MyAdapter adapter=new MyAdapter(this,mTitle,mDescription,images);
        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(CulturalFoods.this, "Injera Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c,String title[],String description[],int images[]){
            super(c,R.layout.row,R.id.textview4,title);
            this.context=c;
            this.rTitle=title;
            this.rDescription=description;
            this.rImgs=images;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=layoutInflater.inflate(R.layout.row,parent,false);
            ImageView images=row.findViewById(R.id.image);
            TextView mytitle=row.findViewById(R.id.textview1);
            TextView mydiscription=row.findViewById(R.id.textview4);

            images.setImageResource(rImgs[position]);
            mytitle.setText(rTitle[position]);
            mydiscription.setText(rDescription[position]);

            return row;
        }
    }
}
