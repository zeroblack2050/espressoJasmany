package com.example.jasmany.espressoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Start extends AppCompatActivity {

    private EditText startEditexText;
    private Button starButtonReset;
    private Button starButtonCambiarActivity;
    private Button starButtonCambiarTextView;
    private TextView starTextViewReceive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        loadView();
        //actionButtons();
    }

    private void loadView() {
        startEditexText = (EditText) findViewById(R.id.start_editex_text);
        starButtonReset = (Button) findViewById(R.id.star_button_reset);;
        starButtonCambiarActivity = (Button) findViewById(R.id.star_button_cambiarActivity);;
        starButtonCambiarTextView = (Button) findViewById(R.id.star_button_cambiarTextView);;
        starTextViewReceive = (TextView) findViewById(R.id.star_textView_receive);
    }

    /*private void actionButtons() {
        starButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startEditexText.setText("");
            }
        });

        starButtonCambiarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Start.this, Second.class);
                intent.putExtra("Input",startEditexText.getText().toString());
                startActivity(intent);
            }
        });

        starButtonCambiarTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                starTextViewReceive.setText(startEditexText.getText().toString());
            }
        });
    }*/

    public void otherMethodToClickButtons (View view){
        switch (view.getId()){
            case R.id.star_button_reset:
                startEditexText.setText("");
                break;
            case R.id.star_button_cambiarActivity:
                Intent intent = new Intent(this, Second.class);
                intent.putExtra("Input",startEditexText.getText().toString());
                startActivity(intent);
                break;
            case R.id.star_button_cambiarTextView:
                starTextViewReceive.setText(startEditexText.getText().toString());
                break;

        }
    }
}
