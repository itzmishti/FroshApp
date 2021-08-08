package com.example.callkill;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.callkill.ui.home.HomeFragment;

public class loginPage extends AppCompatActivity {
private EditText name;
private EditText age;
private EditText height;
private EditText weight;
private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        button = findViewById(R.id.button);




    }
    public void openActivity(View view){
           Intent intent = new Intent(this , bottomNavigationActivity.class );
      startActivity(intent);
       finish(); }



}