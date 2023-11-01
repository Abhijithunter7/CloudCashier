package com.appsnipp.cloudcashier;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class utilities_form extends AppCompatActivity {

    private EditText titleEditText;
    private Spinner optionsSpinner;
    private EditText priceEditText;
    private EditText noteEditText;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utilities_form);

        // Initialize UI elements
        titleEditText = findViewById(R.id.utiedit1);
        optionsSpinner = findViewById(R.id.utispin1);
        priceEditText = findViewById(R.id.utiedit2);
        noteEditText = findViewById(R.id.utiedit3);
        saveButton = findViewById(R.id.saveButton1);

        // Set an OnClickListener for the saveButton
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input from the UI elements
                String title = titleEditText.getText().toString();
                String option = optionsSpinner.getSelectedItem().toString();
                String price = priceEditText.getText().toString();
                String note = noteEditText.getText().toString();

                // Perform your logic here, e.g., save the data or show a message
                String message = "Title: " + title + "\nOption: " + option + "\nPrice: " + price + "\nNote: " + note;
                Toast.makeText(utilities_form.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

