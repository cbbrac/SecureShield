package com.example.secureshield;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logIn(View view){

        Intent intent = new Intent(this, userInput.class);

        editTextUser = (EditText) findViewById(R.id.user);
        editTextPass = (EditText) findViewById(R.id.password);

        String masterUser = editTextUser.getText().toString();
        String masterPassword = editTextPass.getText().toString();

        intent.putExtra("USER", masterUser);
        intent.putExtra("PASSWORD", masterPassword);

        startActivity(intent);

}

    public void createAccount(){
         Map<String, String> map = new HashMap<String, String>();
         map.put(masterUser, masterPassword);
    }
}