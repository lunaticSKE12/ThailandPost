package com.example.mr_ja.thailandpost;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class UserDetailActivity extends AppCompatActivity {

    TextView nextBtn;
    Goods goods;
    ConstraintLayout manBtn, womanBtn, questionBtn, kidsBtn, teenBtn, oldBtn;
    ImageView manIcon, man_circle, womanIcon, woman_circle, questionIcon, question_circle,
                kidsIcon, kids_circle, teenIcon, teen_circle, oldIcon, old_circle;
    int colorSelectedIcon, colorSelectedBackground, colorNonSelectedIcon, colorNonSelectedBackground;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

//        set color
        colorSelectedIcon = getResources().getColor(R.color.colorWhite);
        colorNonSelectedIcon = getResources().getColor(R.color.colorNonSelectedIcon);
        colorSelectedBackground = getResources().getColor(R.color.colorSelected);
        colorNonSelectedBackground = colorSelectedIcon;

//      man button
        manBtn = findViewById(R.id.manBtn_id);
        man_circle = findViewById(R.id.manCircle_id);
        manIcon = findViewById(R.id.manIcon_id);
        manBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                man_circle.setColorFilter(colorSelectedBackground);
                manIcon.setColorFilter(colorSelectedIcon);
            }
        });

//        woman button
        womanBtn = findViewById(R.id.womanBtn_id);
        woman_circle = findViewById(R.id.womanCircle_id);
        womanIcon = findViewById(R.id.womanIcon_id);
        womanIcon.setColorFilter(colorNonSelectedIcon);
        womanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                woman_circle.setColorFilter(colorSelectedBackground);
                womanIcon.setColorFilter(colorSelectedIcon);
            }
        });

//        question button
        questionBtn = findViewById(R.id.questionBtn_id);
        question_circle = findViewById(R.id.questionCircle_id);
        questionIcon = findViewById(R.id.questionIcon_id);
        questionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question_circle.setColorFilter(colorSelectedBackground);
                questionIcon.setColorFilter(colorSelectedIcon);
            }
        });

//        kids button
        kidsBtn = findViewById(R.id.kidsBtn_id);
        kids_circle = findViewById(R.id.kidsCircle_id);
        kidsIcon = findViewById(R.id.kidsIcon_id);
        kidsIcon.setColorFilter(colorNonSelectedIcon);
        kidsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kids_circle.setColorFilter(colorSelectedBackground);
                kidsIcon.setColorFilter(colorSelectedIcon);
            }
        });

//        teen button
        teenBtn = findViewById(R.id.teenBtn_id);
        teen_circle = findViewById(R.id.teenCircle_id);
        teenIcon = findViewById(R.id.teenIcon_id);
        teenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teen_circle.setColorFilter(colorSelectedBackground);
                teenIcon.setColorFilter(colorSelectedIcon);
            }
        });

//         old button
        oldBtn = findViewById(R.id.oldBtn_id);
        old_circle = findViewById(R.id.oldCircle_id);
        oldIcon = findViewById(R.id.oldIcon_id);
        oldBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                old_circle.setColorFilter(colorSelectedBackground);
                oldIcon.setColorFilter(colorSelectedIcon);
            }
        });

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

        nextBtn = findViewById(R.id.nextBtn_id);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "next", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), serialActivity.class);
                // pass parameter goods to next Activity
                intent.putExtra("exchange_item", goods.exchange_toString());
                intent.putExtra("balance_item" , goods.balance_toString());
                intent.putExtra("serial_item", goods.serial_toString());
                startActivity(intent);
            }
        });
    }
}
