package com.example.mannarelkady.sessiontwoapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent myIntent = getIntent(); // this is just for example purpose
        String[] data= myIntent.getExtras().getStringArray("data");
        TextView name =(TextView) findViewById(R.id.name);
        name.setText(data[0]);
        TextView tv =(TextView) findViewById(R.id.text);
        tv.setText(data[1]);
        TextView returnn=(TextView) findViewById(R.id.returnn);
        returnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main=new Intent(result.this,MainActivity.class);
                startActivity(main);
            }
        });
    }

}
