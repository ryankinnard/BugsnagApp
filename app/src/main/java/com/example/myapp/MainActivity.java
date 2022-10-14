package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.Bugsnag;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void onBtnClick (View view) {
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        EditText edtFirstName = findViewById(R.id.edtFirstName);

        TextView txtLastName = findViewById(R.id.txtLastName);
        EditText edtLastName = findViewById(R.id.edtLastName);

        txtFirstName.setText("First Name: " + edtFirstName.getText().toString());
        txtLastName.setText("Last Name: " + edtLastName.getText().toString());

        Map<String, Object> metadata = new HashMap<>();

        // Breadcrumb one
        Bugsnag.leaveBreadcrumb("User clicks a button ", metadata, BreadcrumbType.USER);
        // Breadcrumb two
        Bugsnag.leaveBreadcrumb("User submits a form", metadata,
                BreadcrumbType.PROCESS);
        Bugsnag.notify(new RuntimeException("Test error"));



    }
}