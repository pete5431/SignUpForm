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

    private static final String WARNING = "One of the fields is empty.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        editName = findViewById(R.id.edit_name);
        editEmail = findViewById(R.id.edit_email);
        editPassword = findViewById(R.id.edit_pass);
        editConfirmPassword = findViewById(R.id.edit_confirm_pass);
        saveButton = findViewById(R.id.button_save);

        context = getApplicationContext();

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editName.getText().toString().isEmpty()){
                    Toast.makeText(context, WARNING, Toast.LENGTH_SHORT).show();
                }
                else if(editEmail.getText().toString().isEmpty()){
                    Toast.makeText(context, WARNING, Toast.LENGTH_SHORT).show();
                }
                else if(editPassword.getText().toString().isEmpty()){
                    Toast.makeText(context, WARNING, Toast.LENGTH_SHORT).show();
                }
                else if(editConfirmPassword.getText().toString().isEmpty()){
                    Toast.makeText(context, WARNING, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
