package com.example.mr_ja.thailandpost;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ExchangeActivity extends AppCompatActivity {

    TextView exchangeNum, balanceNum;
    TextView exchangeBtn;
    Goods goods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange);

        // get parameter goods from last Activity
        Intent intent = getIntent();
        String exchange_item = intent.getStringExtra("exchange_item");
        String balance_item = intent.getStringExtra("balance_item");
        String serial_iem = intent.getStringExtra("serial_item");
        int exchange_item_number = Integer.parseInt(exchange_item);
        int balance_item_number = Integer.parseInt(balance_item);
        int serial_item_number = Integer.parseInt(serial_iem);
//        Toast.makeText(getApplicationContext(),
//                exchange_item + " + " + balance_item, Toast.LENGTH_SHORT).show();
        goods = new Goods(exchange_item_number, balance_item_number, serial_item_number);


        exchangeNum = findViewById(R.id.exchangeNumber_id);
        balanceNum = findViewById(R.id.balanceNumber_id);
        // set text exchange number and balance number and update number
        exchangeNum.setText(goods.exchange_toString());
        balanceNum.setText(goods.balance_toString());

        exchangeBtn = findViewById(R.id.exchangeBtn_id);
        exchangeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "exchange", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), UserDetailActivity.class);
                // pass parameter goods to next Activity
                intent.putExtra("exchange_item", goods.exchange_toString());
                intent.putExtra("balance_item" , goods.balance_toString());
                intent.putExtra("serial_item", goods.serial_toString());
                startActivity(intent);

            }
        });
    }

}
