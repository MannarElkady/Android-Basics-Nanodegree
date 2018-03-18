package com.example.mannarelkady.sessiontwoapp;

import android.content.Intent;
import android.media.Image;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String [] quotes=new String[10];
        quotes[0]="'You never know what worse luck your bad luck has saved you from'";
        quotes[1]="'Remember that sometimes not getting what you want is a wonderful stroke of luck.'";
        quotes[2]="“The sun doesn't just hang on one family's tree”";
        quotes[3]="“المثابرة تغلب الذكاء، والصبر يغلب الحظ... والعبرة دائمًا بالنتيجة!” ";
        quotes[4]="الكسالى والفاشلون سيجعلون \"الحظ\" الشماعة التي يعلقون عليها أخطاءهم وفشلهم في الحياة.";
        quotes[5]="I believe that we all have a responsibility to give back. No one becomes successful without lots of hard work, support from others, and a little luck. Giving back creates a virtuous cycle that makes everyone more successful";
        quotes[6]="Inspiration is one thing and you can't control it, but hard work is what keeps the ship moving. Good luck means, work hard. Keep up the good work";
        quotes[7]="Good night, and good luck";
        quotes[8]="Ma3lsh";
        quotes[9]="Ma3lhaaaash";
        ImageButton img= (ImageButton) findViewById(R.id.click);
        final EditText et = (EditText) findViewById(R.id.name);
        final TextView text=(TextView) findViewById(R.id.text);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new CountDownTimer(5000, 200) {
                    Random r= new Random();
                    String name=et.getText().toString();
                    public void onFinish() {
                        // When timer is finished
                        // Execute your code here
                        if(name.isEmpty()){name="No Name Entered";}
                        String[] data= {name,text.getText().toString()};
                        Intent i =new Intent(MainActivity.this,result.class);
                        i.putExtra("data", data);
                        startActivity(i);
                    }

                    public void onTick(long millisUntilFinished) {
                        // millisUntilFinished    The amount of time until finished.
                        int index=r.nextInt(10);
                        text.setText(quotes[index]);
                    }
                }.start();
            }
        });
    }
}
