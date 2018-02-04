package com.deqode.android.kasuspembelajaran1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;

    Button bt1;
    Button bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.menuMakanan);
        e2 = (EditText)findViewById(R.id.jumlahPorsi);

        bt1 = (Button)findViewById(R.id.btabnormal);
        bt2 = (Button)findViewById(R.id.bteatbus);

    }

    public void dosomething(View view) {

        int duration = Toast.LENGTH_LONG;
        Toast toast;
        Toast.makeText(this, "Disini aja makan malamnya", duration).show();

        Intent i1 = new Intent(this,KeduaActivity.class);
        i1.putExtra("zulkarnain",e1.getText().toString());
        i1.putExtra("zulkarnain2",e2.getText().toString());
        i1.putExtra("zulkarnain3",bt1.getText().toString());
        i1.putExtra("zulkarnain4","60000");

        startActivity(i1);

    }

    public void doLagi(View view) {

        int duration = Toast.LENGTH_LONG;
        Toast toast;
        Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", duration).show();


        Intent i1 = new Intent(this,KeduaActivity.class);
        i1.putExtra("zulkarnain",e1.getText().toString());
        i1.putExtra("zulkarnain2",e2.getText().toString());
        i1.putExtra("zulkarnain3",bt2.getText().toString());
        i1.putExtra("zulkarnain4","100000");
        startActivity(i1);
    }
}