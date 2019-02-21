package com.app.shovan.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_NextOk;
    Button btn_PrevOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_NextOk=(Button)findViewById(R.id.btn_Next);
        btn_PrevOK=(Button)findViewById(R.id.prev);



        btn_NextOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "hi shovon", Toast.LENGTH_SHORT).show();
            }
        });
        btn_PrevOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);

               // startActivity(new Intent(MainActivity.this,SecondActivity.class));

            }
        });


    }
}
