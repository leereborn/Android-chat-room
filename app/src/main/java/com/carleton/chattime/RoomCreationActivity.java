package com.carleton.chattime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RoomCreationActivity extends AppCompatActivity {

    private EditText roomName;
    private EditText description;
    private Button create;
    //firebase
    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mDatabaseReference;
    private ChildEventListener mChildEventListener;
    //private FirebaseAuth mFirebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_creation);
        roomName = (EditText) findViewById(R.id.editText_name);
        description = (EditText) findViewById(R.id.editText_description);
        create = (Button) findViewById(R.id.button_create);
        //firebase init
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mDatabaseReference = mFirebaseDatabase.getReference();

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = roomName.getText().toString();
                String descript = description.getText().toString();//TODO
                Intent intent = new Intent(v.getContext(), chatRoomActivity.class);
                intent.putExtra("roomID", name);
                User.addUserToDatabase(name);
                startActivity(intent);
            }
        });
    }
}
