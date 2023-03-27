package veikko.vanninen.userprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {

    private EditText ptFirstName;
    private EditText ptLastName;
    private EditText ptEmail;
    private RadioGroup radioGroup;
    private Button addUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        ptFirstName = findViewById(R.id.ptFirstName);
        ptLastName = findViewById(R.id.ptLastName);
        ptEmail = findViewById(R.id.ptEmail);
        radioGroup = findViewById(R.id.rgDegreeProgram);
        addUser = findViewById(R.id.btnAddNewUser);
    }

    public void addUser(View view) {

        String firstName = ptFirstName.getText().toString();
        String lastName = ptLastName.getText().toString();
        String email = ptEmail.getText().toString();

        int radioButtonId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(radioButtonId);
        String degreeProgram = radioButton.getText().toString();

        User user = new User(firstName, lastName, email, degreeProgram);
        UserStorage us = UserStorage.getInstance();
        us.addUser(user);
    }
}