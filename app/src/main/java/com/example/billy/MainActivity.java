package com.example.billy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import okhttp3.internal.Util;

public class MainActivity extends AppCompatActivity {
    EditText id;
    EditText username;
    EditText firstname;
    EditText lastname;
    EditText email;
    EditText password;
    EditText phone;
    Button buttonregistrtion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = (EditText) findViewById(R.id.userId);
        username = (EditText) findViewById(R.id.username);
        firstname = (EditText) findViewById(R.id.userFirstName);
        lastname = (EditText) findViewById(R.id.userLastName);
        email = (EditText) findViewById(R.id.userEmail);
        password = (EditText) findViewById(R.id.userPassword);
        phone = (EditText) findViewById(R.id.userPhone);
        buttonregistrtion = (Button) findViewById(R.id.button);
    }

    public void OnClick(View view){
        if (TextUtils.isEmpty(id.getText()) || TextUtils.isEmpty(username.getText()) ||
                TextUtils.isEmpty(password.getText()) || TextUtils.isEmpty(email.getText())){
            id.setText("Give number pleeeeeeseee!!!");
            username.setText("Give me name pleeeeeeseee!!!");
            email.setText("Give email pleeeeeeseee!!!");
            password.setText("Give password pleeeeeeseee!!!");
        }
        else {
            Log.d("bob", "i am bob");
        }
    }
}