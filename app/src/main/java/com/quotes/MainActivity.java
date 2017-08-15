package com.quotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener , View.OnLongClickListener {


    Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

        button1.setOnClickListener(MainActivity.this);
        button2.setOnClickListener(MainActivity.this);
        button3.setOnClickListener(MainActivity.this);
        button4.setOnClickListener(MainActivity.this);
        button5.setOnClickListener(MainActivity.this);
        button6.setOnClickListener(MainActivity.this);

        button1.setOnLongClickListener(MainActivity.this);
        button2.setOnLongClickListener(MainActivity.this);
        button3.setOnLongClickListener(MainActivity.this);
        button4.setOnLongClickListener(MainActivity.this);
        button5.setOnLongClickListener(MainActivity.this);
        button6.setOnLongClickListener(MainActivity.this);




    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.button1 : Intent i1 = new Intent(MainActivity.this,ButtonOne.class);
                                startActivity(i1);
                                break;

            case R.id.button2 : Intent i2 = new Intent(MainActivity.this,ButtonTwo.class);
                                startActivity(i2);
                                break;

            case R.id.button3 : Intent i3 = new Intent(MainActivity.this,ButtonThree.class);
                                startActivity(i3);
                                break;

            case R.id.button4 : Intent i4 = new Intent(MainActivity.this,ButtonFour.class);
                                startActivity(i4);
                                break;

            case R.id.button5 : Intent i5 = new Intent(MainActivity.this,ButtonFive.class);
                                startActivity(i5);
                                break;

            case R.id.button6 : Intent i6 = new Intent(MainActivity.this,ButtonSix.class);
                                startActivity(i6);
                                break;


        }
    }

    @Override
    public boolean onLongClick(View view) {
        switch (view.getId())
        {
            case R.id.button1 : Intent i1 = new Intent(MainActivity.this,JeffBezos.class);
                                startActivity(i1);
                                break;

            case R.id.button2 : Intent i2 = new Intent(MainActivity.this,ElonMusk.class);
                                startActivity(i2);
                                break;

            case R.id.button3 : Intent i3 = new Intent(MainActivity.this,JacKMa.class);
                                startActivity(i3);
                                break;

            case R.id.button4 : Intent i4 = new Intent(MainActivity.this,MarkZuckerberg.class);
                                startActivity(i4);
                                break;

            case R.id.button5 : Intent i5 = new Intent(MainActivity.this,MalalaYousafzai.class);
                                startActivity(i5);
                                break;

            case R.id.button6 : Intent i6 = new Intent(MainActivity.this,SteveJobs.class);
                                startActivity(i6);
                                break;
        }

        return false;
    }
}
