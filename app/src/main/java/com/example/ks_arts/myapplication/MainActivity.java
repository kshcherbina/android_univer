package com.example.ks_arts.myapplication;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private final String loginConstant = "mylogin";
        private String passwordConstant = "mypassword";
        private final static String LOG_TAG="MainActivity";

    private EditText login  = (EditText)findViewById(R.id.LoginText);
    private EditText password  = (EditText)findViewById(R.id.passwordText);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG_TAG, "login text = " + login.getText());
        Log.d(LOG_TAG, "password text = " + password.getText());

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)

        if (login.getText() !=null && !login.getText().equals("") && password.getText() !=null && !password.equals("")) {
            Log.d(LOG_TAG, "login not empty");
            Log.d(LOG_TAG, "password not empty");

            if (login.getText().equals(loginConstant) && password.getText().equals(passwordConstant)) {
                // Login success
                Intent intent = new Intent(this, SuccessActivity.class);
                startActivity(intent);

            } else  {
                // Login failure

                Toast.makeText(getApplicationContext(), "not valid login/username", Toast.LENGTH_LONG).show();

            }


        } else {
            Log.d(LOG_TAG, "Login is empty or email");
        }
    }
}
