package com.punisher.homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText editText = (EditText) findViewById(R.id.editText);


        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equals("")) {
                    Toast toast = Toast.makeText(SecondActivity.this, "Input something, please", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    intent.putExtra("SecondActivityText", editText.getText().toString());
                    startActivity(intent);
                }
            }
        });

    }
}
