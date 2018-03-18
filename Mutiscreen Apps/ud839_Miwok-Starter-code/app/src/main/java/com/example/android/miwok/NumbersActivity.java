package com.example.android.miwok;

import 	android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
//        String [] numberList= new String[100];


//        Log.v("NumbersActivity","Words at index 0 "+numberList[0]);
//        Log.v("NumbersActivity","Words at index 8 "+numberList.get(8));
//        LinearLayout root= (LinearLayout) findViewById(R.id.root_view);
//        for(int i=0;i<numberList.size();i++) {
//            TextView numView = new TextView(this);
//            numView.setText(numberList.get(i));
//            root.addView(numView);
//
// }

        //ArrayList<String> numberList=new ArrayList<String>();
        //numberList.add("Ten");
        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this,R.layout.list_item, numberList);

        ArrayList<Word> numberList = new ArrayList<Word>();
        numberList.add(new Word("One ", "Lutti"));
        numberList.add(new Word("Two ", "Otiiko"));
        numberList.add(new Word("Three ", "Tolookosu"));
        numberList.add(new Word("Four ", "Oyyisa"));
        numberList.add(new Word("Five ", "Massokka"));
        numberList.add(new Word("Six ", "Temmokka"));
        numberList.add(new Word("Seven ", "Kenekaku"));
        numberList.add(new Word("Eight ", "Kawinta"));
        numberList.add(new Word("Nine ", "Wo'e"));
        numberList.add(new Word("Ten ", "Na'aacha"));


        //to create Recycle ListView

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.


        // ArrayAdapter<Word> wordAdapter= new ArrayAdapter<Word>(this, R.layout.list_item, numberList);


        WordAdapter itemsAdapter = new WordAdapter(this , numberList);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);

    }

}