package com.example.mr_ja.thailandpost;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class serialActivity extends AppCompatActivity {

    TextView nextBtn;
    Goods goods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serial);


// get parameter goods from last Activity
        Intent intent = getIntent();
        String exchange_item = intent.getStringExtra("exchange_item");
        String balance_item = intent.getStringExtra("balance_item");
        int exchange_item_number = Integer.parseInt(exchange_item);
        int balance_item_number = Integer.parseInt(balance_item);
        Toast.makeText(getApplicationContext(),
                exchange_item + " + " + balance_item, Toast.LENGTH_SHORT).show();
        goods = new Goods(exchange_item_number, balance_item_number);
        goods.update_goods();


        nextBtn = findViewById(R.id.nextBtn_id);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "update number", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), ExchangeActivity.class);
                // pass parameter goods to next Activity
                intent.putExtra("exchange_item", goods.exchange_toString());
                intent.putExtra("balance_item" , goods.balance_toString());
                startActivity(intent);

            }
        });
    }
}
