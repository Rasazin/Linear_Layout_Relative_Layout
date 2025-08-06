package com.menglang.linear_layout_relative_layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText etStudentId, etPassword;
    Button btnLogin, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etStudentId = findViewById(R.id.etStudentId);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignup = findViewById(R.id.btnSignup);

        btnLogin.setOnClickListener(v -> {
            String id = etStudentId.getText().toString().trim();
            String pass = etPassword.getText().toString().trim();

            if (id.isEmpty()) {
                etStudentId.setError("Student ID required");
                return;
            }
            if (pass.isEmpty()) {
                etPassword.setError("Password required");
                return;
            }

            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
        });

        btnSignup.setOnClickListener(v ->
                startActivity(new Intent(this, RegisterActivity.class))
        );
    }
}
