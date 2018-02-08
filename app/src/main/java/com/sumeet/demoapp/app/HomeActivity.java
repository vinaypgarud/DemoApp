package com.sumeet.demoapp.app;
/*
 * Created by Sumeet Kasar on 8/2/18.
 *
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView txtURL;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtURL=findViewById(R.id.txtURL);
        String url=App.getInstance().getStringPref(Constants.URL);
        txtURL.setText(url);
    }
}
