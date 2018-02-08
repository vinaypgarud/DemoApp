package com.sumeet.demoapp.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnProduction,btnDevelopment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProduction=findViewById(R.id.btnProduction);
        btnDevelopment=findViewById(R.id.btnDevelopment);
        btnProduction.setOnClickListener(this);
        btnDevelopment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnProduction:
                App.getInstance().setStringPref(Constants.URL,getString(R.string.production_url));
                break;

            case R.id.btnDevelopment:
                App.getInstance().setStringPref(Constants.URL,getString(R.string.development_url));

                break;
        }

        Intent intent=new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
}
