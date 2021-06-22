package com.example.secureshield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

public class LogInActivity extends AppCompatActivity {

    EditText editTextUser = (EditText) findViewById(R.id.userId);
    EditText editTextPass = (EditText) findViewById(R.id.passwordId);

    String masterUser = editTextUser.getText().toString();
    String masterPassword = editTextPass.getText().toString();
    Map<String, String> map = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void createAccount(View view){
         map.put(masterUser, masterPassword);
    }

    public void logIn(View view){
        if (editTextUser.equals(masterUser)){
            System.out.println("User successful!");
            if(editTextPass.equals(map.get(masterUser))){
                System.out.println("Login successful!");
//                Intent intent = new Intent(this, AccountActivity.class);
//
//                intent.putExtra("USER", masterUser);
//                intent.putExtra("PASSWORD", masterPassword);
//
//                startActivity(intent);

            } else if (!editTextPass.equals(map.get(masterUser))){
                System.out.println("Wrong pass");
            }
        } else if (!editTextUser.equals(masterUser)){
            System.out.println("That username doesn't exist");
        }
    }
}