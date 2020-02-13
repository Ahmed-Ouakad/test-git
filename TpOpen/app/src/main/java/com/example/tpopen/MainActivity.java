package com.example.tpopen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.imc);
        Button p = (Button) findViewById(R.id.popup);
        Button bt = (Button) findViewById(R.id.chbx);
        final EditText pds = (EditText) findViewById(R.id.editText);
        final EditText tal = (EditText) findViewById(R.id.editText2);
        final RadioButton rb = (RadioButton) findViewById(R.id.rb1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x;
                TextView res = (TextView) findViewById(R.id.res);
                String a = pds.getText().toString();
                String b = tal.getText().toString();
                if (rb.isChecked()) {

                    x = Float.parseFloat(a) / (Float.parseFloat(b) * Float.parseFloat(b));
                    if (x < 20)
                        res.setText("vous etes maigre " + x);
                    else if (x < 25 && x >= 20)
                        res.setText("vous etes normale " + x);
                    else if (x < 30 && x >= 25)
                        res.setText("vous avez un surpoids " + x);
                    else if (x < 40 && x >= 30)
                        res.setText("vous etes obese " + x);
                    else
                        res.setText("vous avez une obesite morbide " + x);
                }
                else {
                    x = Float.parseFloat(a) / (Float.parseFloat(b) * Float.parseFloat(b) / 10000);
                    if (x < 20)
                        res.setText("vous etes maigre " + x);

                    else if (x < 25 && x >= 20)
                        res.setText("vous etes normale " + x);
                    else if (x < 30 && x >= 25)
                        res.setText("vous avez un surpoids " + x);
                    else if (x < 40 && x >= 30)
                        res.setText("vous etes obese " + x);
                    else
                        res.setText("vous avez une obesite morbide " + x);
                }
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }
        public void openDialog(){
        ExampleDialog exp = new ExampleDialog();
        exp.show(getSupportFragmentManager(),"exemple dialogue");
        }


}

