package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FamilyActivity extends AppCompatActivity {
//alt+enter bygbli el2ktra7at ll implements lma y3mli y3mli 3lama 7mra
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tt=new TextView(this);
        tt.setText("Hello it's me");
       // setContentView(R.layout.activity_family);
        setContentView(tt);
    }
}
