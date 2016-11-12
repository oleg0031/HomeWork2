package com.punisher.homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView text = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String text_to_paste = intent.getStringExtra("SecondActivityText");
        text.setText(text_to_paste);
    }
}
