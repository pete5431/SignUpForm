package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    EditText editName;
    EditText editEmail;
    EditText editPassword;
    EditText editConfirmPassword;
    Button saveButton;

    private static final String WARNING = "Empty field(s) detected.";
    private static final String NO_MATCH = "Passwords don't match.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        editName = (EditText) findViewById(R.id.edit_name);
        editEmail = (EditText) findViewById(R.id.edit_email);
        editPassword = (EditText) findViewById(R.id.edit_pass);
        editConfirmPassword = (EditText) findViewById(R.id.edit_confirm_pass);
        saveButton = (Button) findViewById(R.id.button_save);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editName.getText().toString().isEmpty()){
                    Toast.makeText(FormActivity.this, WARNING, Toast.LENGTH_SHORT).show();
                }
                else if(editEmail.getText().toString().isEmpty()){
                    Toast.makeText(FormActivity.this, WARNING, Toast.LENGTH_SHORT).show();
                }
                else if(editPassword.getText().toString().isEmpty()){
                    Toast.makeText(FormActivity.this, WARNING, Toast.LENGTH_SHORT).show();
                }
                else if(editConfirmPassword.getText().toString().isEmpty()){
                    Toast.makeText(FormActivity.this, WARNING, Toast.LENGTH_SHORT).show();
                }
                else if(!editPassword.getText().toString().equals(editConfirmPassword.getText().toString())){
                    Toast.makeText(FormActivity.this, NO_MATCH, Toast.LENGTH_SHORT).show();
                }
                else{
                    String displayMessage;
                    displayMessage = "Welcome, " + editName.getText().toString() + " to the SignUpForm App";
                    Toast.makeText(FormActivity.this, displayMessage, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
