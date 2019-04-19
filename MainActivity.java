package com.nikolaihost.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        String amountInPeso = editText.getText().toString();
        double amountInPesoDouble = Double.parseDouble(amountInPeso);
        double amountInDollarDouble = amountInPesoDouble * 50;
        String amountInDollarString = String.format("%.2f", amountInDollarDouble);

        Toast.makeText(this, "P" + amountInPeso + " is $" + amountInDollarString, Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
