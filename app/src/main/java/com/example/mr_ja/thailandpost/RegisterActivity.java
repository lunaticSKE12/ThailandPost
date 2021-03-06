package com.example.mr_ja.thailandpost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText name, phone;
    TextView registerBtn;
    Spinner spinner;
    Goods goods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = findViewById(R.id.name_editText_id);
        phone = findViewById(R.id.phone_editText_id);

        spinner = findViewById(R.id.post_spinner_id);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, getResources().getStringArray(R.array.post_array));
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        //create object goods
        goods = new Goods(40, 110, 7399);


        registerBtn = findViewById(R.id.nextrBtn_id);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "regis", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), ExchangeActivity.class);
                // pass parameter goods to next Activity
                intent.putExtra("exchange_item", goods.exchange_toString());
                intent.putExtra("balance_item" , goods.balance_toString());
                intent.putExtra("serial_item", goods.serial_toString());
                startActivity(intent);
            }
        });
    }

}
