package com.example.prime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText number = findViewById(R.id.editText);
        final Button button = findViewById(R.id.button);
        final TextView result = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                result.setText(Boolean.toString(Util.primo(Integer.parseInt(number.getText().toString()))));
                view.invalidate();
            }
        });
    }
}
