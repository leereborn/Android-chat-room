package com.carleton.chattime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class UsersActivity extends AppCompatActivity {
    private ListView listview;
    private List<String> list = new ArrayList<String>();
    private ArrayAdapter adapter;
    private ValueEventListener mValueEventListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlist);
        ArrayList<String> list = new ArrayList<String>();
        list.add("Leereborn");
        list.add("Felix");

        //instantiate custom adapter
        MyCustomAdapter adapter = new MyCustomAdapter(list, this);

        //handle listview and assign adapter
        ListView lView = (ListView)findViewById(R.id.list22);
        lView.setAdapter(adapter);
    }
}