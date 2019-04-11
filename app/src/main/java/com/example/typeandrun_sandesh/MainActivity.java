package com.example.typeandrun_sandesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button button1;
    EditText etmake, etYear, etColor, etPrice, etEngineSize;
    int i=1;
    output_Sandesh output_sandesh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.button1);
        etmake= findViewById(R.id.etmake);
        etYear = findViewById(R.id.etYear);
        etColor = findViewById(R.id.etColor);
        etPrice = findViewById(R.id.etPrice);
        etEngineSize = findViewById(R.id.etEngineSize);
        result = findViewById(R.id.result);

        output_sandesh = new output_Sandesh();



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!validate()){
                    return;
                }


                output_sandesh.setMake(etmake.getText().toString());
                output_sandesh.setYear(Integer.parseInt(etYear.getText().toString()));
                output_sandesh.setColor(etColor.getText().toString());
                output_sandesh.setPrice(Float.parseFloat(etPrice.getText().toString()));
                output_sandesh.setEngineSize(Integer.parseInt(etEngineSize.getText().toString()));

                result.append("This is Vehicle No " + i + "\n" + "Manfacturer " + output_sandesh.getMake()
                        + "\n" + "color is "+ output_sandesh.getColor()+ "\n" + "The price is "+output_sandesh.getPrice()
                        + "\n" +"The engine size is "+output_sandesh.getEngineSize());


            }
        });


    }
    private boolean validate() {
        if(TextUtils.isEmpty(etmake.getText().toString())){
            etmake.setError("please enter manufacturer");
            etmake.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(etYear.getText().toString())){
            etYear.setError("Enter Year of purchase");
            etYear.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(etColor.getText().toString())){
            etColor.setError(" Enter Color");
            etColor.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(etPrice.getText().toString())){
            etPrice.setError("Enter Price");
            etPrice.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(etEngineSize.getText().toString())){
            etEngineSize.setError("Enter the engine size");
            etEngineSize.requestFocus();
            return false;
        }
        return true;
    }

}






