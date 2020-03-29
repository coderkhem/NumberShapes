package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void isTriangular(int input)
    {
        int currentTriNum = 0;
        int n=0;
        double sr= Math.sqrt(input);
        if((sr - Math.floor(sr)) == 0)
        {

        }

        while (currentTriNum < input)
        {
            currentTriNum += n;
            n++;
        }

        if (currentTriNum != input && (sr - Math.floor(sr)) == 0)
        {
            Toast.makeText(this, "This is NOT a triangular number but is a square number", Toast.LENGTH_SHORT).show();
        }
        else if(currentTriNum == input && (sr - Math.floor(sr)) == 0)
        {
            Toast.makeText(this, "This is a triangular number and sqaure number", Toast.LENGTH_SHORT).show();


        }

        else if (currentTriNum != input && (sr - Math.floor(sr)) != 0)
        {
            Toast.makeText(this, "This is Niether a triangular number nor a square number", Toast.LENGTH_SHORT).show();
        }
        else if(currentTriNum == input && (sr - Math.floor(sr)) != 0)
        {
            Toast.makeText(this, "This is a triangular number and not a sqaure number", Toast.LENGTH_SHORT).show();


        }


    }

    public void checkNumber(View view)
    {
        EditText number=(EditText)findViewById(R.id.editText);
        String numberinString =number.getText().toString();
        int numberinInt=Integer.parseInt(numberinString);
        isTriangular(numberinInt);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
