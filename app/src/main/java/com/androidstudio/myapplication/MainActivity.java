package com.androidstudio.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.androidstudio.myapplication.textutils.TextUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTextViewText();
        for(int counter = 0; counter < 10; counter++){
            Log.i("MainActivity","Value:" + counter);
        }
    }

    private void setTextViewText() {
        TextUtil textUtil = new TextUtil();
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("abc");
    }
}
