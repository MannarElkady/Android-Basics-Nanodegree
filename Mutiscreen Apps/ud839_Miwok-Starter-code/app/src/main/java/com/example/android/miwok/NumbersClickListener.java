package com.example.android.miwok;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.support.v4.app.ActivityCompat.startActivity;

/**
 * Created by MannarElkady on 2/13/2018.
 */

public class NumbersClickListener  implements View.OnClickListener {
// View.java file package have interface called OnClickListener
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"Open the list of numbers",Toast.LENGTH_SHORT).show();
//mn2dr4 nndh intent mn hna l2nna m7tagyen nb3tlha context w 34an nb3tlha context fltali htb2a activity
// fhn3mlha extend ll activity ele hnndha feha w bltlai hndfha fl el Manifest file l2no b2a activity hwa nfso
    }
}
