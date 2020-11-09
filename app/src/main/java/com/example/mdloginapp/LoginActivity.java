package com.example.mdloginapp;

import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    private EditText user_name;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        viewsSetup();
        userAuth();

    }

    public void viewsSetup(){
        user_name = findViewById(R.id.eTusername);
        password =findViewById(R.id.eTusername);

    }

    public void userAuth(){
        user_name.getText().toString();
        password.getText().toString();

        if (user_name.equals("Kenneth") && password.equals("1234")){
            Toast.makeText(this, "Log in successful", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
        }

    }
}
