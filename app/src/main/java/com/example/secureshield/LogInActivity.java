package com.example.secureshield;

import androidx.appcompat.app.AppCompatActivity;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void createAccount(View view){
         Map<String, String> map = new HashMap<String, String>();
         map.put(masterUser, masterPassword);
    }

    public void logIn(View view){

        Intent intent = new Intent(this, UserInput.class);

        intent.putExtra("USER", masterUser);
        intent.putExtra("PASSWORD", masterPassword);

        startActivity(intent);

}


}