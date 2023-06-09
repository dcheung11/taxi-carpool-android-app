package com.example.taxicarpool.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.taxicarpool.LoggedInUser;
import com.example.taxicarpool.MainActivity;
import com.example.taxicarpool.R;
import com.example.taxicarpool.data.EncryptionController;
import com.example.taxicarpool.data.UserIdentity;

public class ProfileScreen extends AppCompatActivity {

    TextView firstName;
    TextView lastName;
    TextView email;
    TextView rating;
    TextView gender;
    UserIdentity user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);
        user = LoggedInUser.getInstance().getUser();
        firstName = findViewById(R.id.profile_screen_first_name);
        lastName = findViewById(R.id.profile_screen_last_name);
        email = findViewById(R.id.profile_screen_email);
        rating = findViewById(R.id.profile_screen_rating);
        gender = findViewById(R.id.profile_screen_gender);
        setDetails();
    }

    @Override
    protected void onResume() {
        super.onResume();
        user = LoggedInUser.getInstance().getUser();
        setDetails();
    }

    public void setDetails(){
        String field1 = "First Name: " + user.getFirstName();
        firstName.setText(field1);
        String field2 = "Last Name: " + user.getLastName();
        lastName.setText(field2);
        String field3 = "Email: " + user.getEmail();
        email.setText(field3);
        String field4 = "Rating: " + user.getRating();
        rating.setText(field4);
        String field5 = "Gender: " + user.getGender();
        gender.setText(field5);

    }

    public void delete(View v) throws Exception {
        LoggedInUser.getInstance().logoff();
        EncryptionController.getInstance(this).deleteUser(user);
        Toast.makeText(this, "Delete Success", Toast.LENGTH_SHORT).show();
        // System.out.println(EncryptionController.getInstance(this).getAll());
        finish();
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void logoff(View v){
        LoggedInUser.getInstance().logoff();
        Toast.makeText(this, "Logoff Success", Toast.LENGTH_SHORT).show();
        // System.out.println(EncryptionController.getInstance(this).getAll());
        finish();
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void edit(View v){
        Intent i = new Intent(this, EditActivity.class);
        startActivity(i);
    }

}