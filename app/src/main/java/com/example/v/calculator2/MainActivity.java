package com.example.v.calculator2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mSum;
    private Button mDifference;
    private Button mDivision;
    private Button mDobytok;

    private EditText mFirstNumber;
    private EditText mSecondNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSum= (Button) findViewById(R.id.sum);
        mDifference= (Button) findViewById(R.id.difference);
        mDivision= (Button) findViewById(R.id.division);
        mDobytok= (Button) findViewById(R.id.dobytok);
        mSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum();

            }
        });
        mDifference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                difference();
            }

        });

        mDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                devision();
            }
        });

        mDobytok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dobytok();
            }
        });


    }

    private int get1Number() {
        return Integer.parseInt(mFirstNumber.getText().toString().trim());
    }

    private int get2Number(){
        return Integer.parseInt(mSecondNumber.getText().toString().trim());
    }

    int n1 = get1Number();
    int n2 = get2Number();

    private void showToast(Integer result){
        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
    }

    private void sum(){
        showToast(n1 + n2);
    }

    private void difference(){
        showToast(n1 - n2);
    }

    private void devision(){
        showToast(n1 / n2);
    }

    private void dobytok(){
        showToast(n1 * n2);
    }

    
}
