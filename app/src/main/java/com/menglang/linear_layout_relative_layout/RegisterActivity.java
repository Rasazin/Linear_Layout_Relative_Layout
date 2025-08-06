package com.menglang.linear_layout_relative_layout;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText etFirstName, etLastName, etUsername, etPhone, etEmail, etNote;
    Button btnRegister, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Bind views
        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName); // NEW FIELD
        etUsername = findViewById(R.id.etUsername);
        etPhone = findViewById(R.id.etPhone);
        etEmail = findViewById(R.id.etEmail);
        etNote = findViewById(R.id.etNote);
        btnRegister = findViewById(R.id.btnRegister);
        btnBack = findViewById(R.id.btnBack);

        btnRegister.setOnClickListener(v -> {
            // Validation
            if (etFirstName.getText().toString().isEmpty()) {
                etFirstName.setError("First name required");
                return;
            }
            if (etLastName.getText().toString().isEmpty()) {
                etLastName.setError("Last name required");
                return;
            }
            if (etUsername.getText().toString().isEmpty()) {
                etUsername.setError("Username required");
                return;
            }
            if (etPhone.getText().toString().isEmpty()) {
                etPhone.setError("Phone required");
                return;
            }
            if (etEmail.getText().toString().isEmpty()) {
                etEmail.setError("Email required");
                return;
            }

            // Registration successful
            Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show();
        });

        btnBack.setOnClickListener(v -> finish());
    }
}
