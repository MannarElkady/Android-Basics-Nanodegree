package com.example.mannarelkady.sessiononeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String mess="Nothing to show";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt= (Button) findViewById(R.id.button);
      //  bt.setText("Show Message");
        Log.v("test",bt.getText().toString());
    }
    public void saveMessage(View view){
        EditText et= (EditText) findViewById(R.id.messagess);
        mess= et.getText().toString();
        et.setText("");
    }
    public void showMessage(View view){
        TextView tv= (TextView) findViewById(R.id.textmess);
        tv.setText(mess);
        Button bt= (Button) findViewById(R.id.button);
        if(bt.getText().toString().equals("Show Message")) {
            bt.setText("Hide Message");
            tv.setText(mess);
        }
        else {
            bt.setText("Show Message");
            tv.setText("");
        }
    }
}
