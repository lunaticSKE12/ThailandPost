package com.example.mr_ja.thailandpost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class UserDetailActivity extends AppCompatActivity {

    TextView nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

        nextBtn = findViewById(R.id.nextBtn_id);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "next", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), serialActivity.class);
                startActivity(intent);
            }
        });
    }
}
