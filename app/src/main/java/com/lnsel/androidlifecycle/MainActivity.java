package com.lnsel.androidlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_title;
    Button btn_click;
    EditText etn_name;
    Boolean toggle=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("onCreate", "call");

        tv_title=(TextView)findViewById(R.id.tv_title);
        btn_click=(Button)findViewById(R.id.btn_click);
        etn_name=(EditText)findViewById(R.id.etn_name);

        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=etn_name.getText().toString();
                tv_title.setText(name);

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume", "call");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart", "call");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause", "call");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop", "call");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "call");
    }
}
