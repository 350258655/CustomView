package com.shake.customviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnwheel = (Button) findViewById(R.id.btn_wheel);
        Button btnaddsub = (Button) findViewById(R.id.btn_add_sub);
        btnaddsub.setOnClickListener(this);
        btnwheel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_add_sub:
                startActivity(new Intent(MainActivity.this,NumberAddSubActivity.class));
                break;
            case R.id.btn_wheel:
                startActivity(new Intent(MainActivity.this,WheelActivity.class));
                break;
        }
    }
}
