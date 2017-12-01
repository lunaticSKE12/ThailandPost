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


        goods = new Goods(30, 100);


        exchangeNum = findViewById(R.id.exchangeNumber_id);
        balanceNum = findViewById(R.id.balanceNumber_id);
        exchangeNum.setText(goods.exchange_toString());
        balanceNum.setText(goods.balance_toString());

        exchangeBtn = findViewById(R.id.exchangeBtn_id);
        exchangeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "exchange", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), UserDetailActivity.class);
                startActivity(intent);

            }
        });
    }

}
