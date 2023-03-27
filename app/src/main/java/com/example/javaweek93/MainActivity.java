package com.example.javaweek93;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserStorage s = UserStorage.getInstance();

    }

    public void switchToUserList(View view) {
        Intent intent = new Intent(this, userListActicity.class);
        startActivity(intent);
    }


    public void switchToUserAdd(View view) {
        Intent intent = new Intent(this, addUserActivity.class);
        startActivity(intent);
    }




}