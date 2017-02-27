package com.example.cuongphan.widgetbutton_radiobutton;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
    }

    protected void changeColor(int color){
        TextView mTextView = (TextView)findViewById(R.id.textview);
        mTextView.setBackgroundColor(color);
    }

    protected void changeTextViewColor(View clickedButton){
        RadioButton rbtn = (RadioButton)clickedButton;
        String mTextColor = rbtn.getText().toString();
        switch (mTextColor){
            case "Red":
                changeColor(Color.RED);
                break;
            case "Green":
                changeColor(Color.GREEN);
                break;
            case "Yellow":
                changeColor(Color.YELLOW);
                break;
            default:
        }
    }
}
