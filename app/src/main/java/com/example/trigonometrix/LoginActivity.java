package com.example.trigonometrix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Verifică dacă username și parola sunt valide
                if (username.equals("user") && password.length() >= 6) {
                    // Deschide activitatea următoare
                    Intent intent = new Intent(LoginActivity.this, CourseActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Username sau parolă incorecte.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
