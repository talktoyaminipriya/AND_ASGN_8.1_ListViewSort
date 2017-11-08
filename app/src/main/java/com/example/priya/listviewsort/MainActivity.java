package com.example.priya.listviewsort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> alist;
    ListView listview;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create ArrayList object(datasource)

        alist = new ArrayList<String>();
        //add 12 months to the list
        alist.add("January");
        alist.add("February");
        alist.add("March");
        alist.add("April");
        alist.add("May");
        alist.add("June");
        alist.add("July");
        alist.add("August");
        alist.add("September");
        alist.add("October");
        alist.add("November");
        alist.add("December");
        listview = (ListView) findViewById(R.id.lv);
        //set array adapter
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.tv, alist);
        listview.setAdapter(adapter);
    }
    public void sortList(View view) {
        //sort in ascending order
        Collections.sort(alist);
        adapter.notifyDataSetChanged();
    }
    public void reverseList(View view) {
        // sort in descending order
        Collections.reverse(alist);
        adapter.notifyDataSetChanged();
    }



}



