package com.example.jasmany.espressoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    private TextView secondTextViewView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        loadView();
        receiveData();

    }

    private void receiveData() {
        Bundle inputData = getIntent().getExtras();
        String input = inputData.getString("Input");
        secondTextViewView.setText(input);
    }

    private void loadView() {
        secondTextViewView = (TextView) findViewById(R.id.second_textView_view);
    }


}
