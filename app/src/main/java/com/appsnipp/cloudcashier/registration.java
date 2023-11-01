package com.appsnipp.cloudcashier;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class registration extends AppCompatActivity {

    EditText username, email, password, confirmPassword;
    Button signUp;
    TextView alreadyUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        signUp = findViewById(R.id.regsign_up_button);
        username = findViewById(R.id.reguser);
        email = findViewById(R.id.regemail);
        password = findViewById(R.id.regpass);
        confirmPassword = findViewById(R.id.regconf_pass);
        alreadyUser = findViewById(R.id.already_user_textview);



        alreadyUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class );
                startActivity(intent);
            }
        });
    }
}
