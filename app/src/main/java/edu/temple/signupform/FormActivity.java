package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    EditText editName;
    EditText editEmail;
    EditText editPassword;
    EditText editConfirmPassword;
    Button saveButton;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);
        editConfirmPassword = findViewById(R.id.editConfirmPass);
        saveButton = findViewById(R.id.saveButton);

        context = getApplicationContext();

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editName.getText().toString().trim().isEmpty()){
                    Toast.makeText(context, "Please enter name", Toast.LENGTH_SHORT).show();
                }
                else if(editEmail.getText().toString().trim().isEmpty()){
                    Toast.makeText(context, "Please enter email", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
