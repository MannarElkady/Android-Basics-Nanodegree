package com.example.mannarelkady.mytutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    int quantity=0;
    int perOne=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // TextView textView=new TextView(this);
        //  textView.setText("Woow !");
        setContentView(R.layout.activity_main);
        //  setContentView(textView);


    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price;
        EditText et= (EditText) findViewById(R.id.name);
        String name=et.getText().toString();
        //et.getText() return Editable object which have to string method in it to show this editable text
        CheckBox cb= (CheckBox) findViewById(R.id.checkBox);
        boolean state= cb.isChecked();
        CheckBox ccb= (CheckBox) findViewById(R.id.chocolateCheckBox);
        boolean state2= ccb.isChecked();
        price = calculatePrice();
        displayMessage(createOrderSummery(name,price,state,state2));

    }

    private String createOrderSummery(String name ,int price,boolean state,boolean state2) {
        String msg="Name : "+name;
        msg+= "\nAdd whipped Cream?  "+state;
        msg+= "\nAdd Chocolate?  "+state2;
        msg=msg+"\nQuantity = "+quantity;
        msg=msg+"\nTotal Price=" +price;
        msg+="\nThank YOU !";
        return msg;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView orderSummeryTextView = (TextView) findViewById(R.id.order_summery_text_view);
        orderSummeryTextView.setText(NumberFormat.getCurrencyInstance().format(number*5));
    }
    public void increment(View view){
        quantity++;
        displayQuantity(quantity);
        displayPrice(quantity);
    }
    public void decrement(View view){
        quantity=quantity-1 ;
        displayQuantity(quantity);
        displayPrice(quantity);
    }
    /**
     * This method displays the given text on the screen.
     * (TextView) here is a Casting bec findViewById method is in View Class and it return View object but we want it specific type of view which is TextView so casting takes place here
     */
    private void displayMessage(String message) {
        TextView orderSummeryTextView = (TextView) findViewById(R.id.order_summery_text_view);
        orderSummeryTextView.setText(message);
    }
    /**
     * Calculates the price of the order.
     */
    private int calculatePrice() {
        int price = quantity * perOne;
        return price;
    }
}
