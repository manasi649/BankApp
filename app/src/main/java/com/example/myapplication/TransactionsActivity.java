package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;

public class TransactionsActivity extends AppCompatActivity {

    EditText TextMulti,TextMulti1,TextMulti2;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);

        // instantiate the edittext variables
        TextMulti =findViewById(R.id.TextMulti);
        TextMulti1 = findViewById(R.id.TextMulti1);
        TextMulti2 = findViewById(R.id.TextMulti2);

        String text = "From     Adarsh Marakwar        Amount To           Panda Chan                 10000";

        SpannableString ss = new SpannableString(text);

        ForegroundColorSpan fcsred = new ForegroundColorSpan(Color.RED);
        ForegroundColorSpan fcsgreen = new ForegroundColorSpan(Color.GREEN);
        ForegroundColorSpan fcscyan = new ForegroundColorSpan(Color.CYAN);

        ss.setSpan(fcsred, 0, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(fcsgreen, 39, 41, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(fcscyan, 30, 38, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        TextMulti.setText(ss);

        /*String text2 = "From      Walter White             Amount To           Jessy Pinkman          50000";

        SpannableString ss2 = new SpannableString(text2);

        ForegroundColorSpan fcs2red = new ForegroundColorSpan(Color.RED);
        ForegroundColorSpan fcs2green = new ForegroundColorSpan(Color.GREEN);
        ForegroundColorSpan fcs2cyan = new ForegroundColorSpan(Color.CYAN);

        ss2.setSpan(fcs2red, 0, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss2.setSpan(fcs2green, 39, 41, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss2.setSpan(fcs2cyan, 30, 38, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        TextMulti1.setText(ss2);*/

        String text1 = "From      Walter White             Amount To           Vito Corleone             40000";

        SpannableString ss1 = new SpannableString(text1);

        ForegroundColorSpan fcs1red = new ForegroundColorSpan(Color.RED);
        ForegroundColorSpan fcs1green = new ForegroundColorSpan(Color.GREEN);
        ForegroundColorSpan fcs1cyan = new ForegroundColorSpan(Color.CYAN);

        ss1.setSpan(fcs1red, 0, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss1.setSpan(fcs1green, 41, 44, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss1.setSpan(fcs1cyan, 35, 41, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        TextMulti2.setText(ss1);

        // get the drawable layout
        Drawable multi = ContextCompat.getDrawable(this,R.drawable.multitext_layout);

        // we are editing mul
        multi.setColorFilter(new PorterDuffColorFilter(getColor(R.color.colorMultitext), PorterDuff.Mode.MULTIPLY));
        TextMulti.setBackground(multi);

        // get the drawable layout
        Drawable multi1 = ContextCompat.getDrawable(this,R.drawable.multitext_layout);

        // we are editing mul
        multi1.setColorFilter(new PorterDuffColorFilter(getColor(R.color.colorMultitext1), PorterDuff.Mode.MULTIPLY));
        TextMulti1.setBackground(multi1);

        // get the drawable layout
        Drawable multi2 = ContextCompat.getDrawable(this,R.drawable.multitext_layout);

        // we are editing mul
        multi2.setColorFilter(new PorterDuffColorFilter(getColor(R.color.colorMultitext2), PorterDuff.Mode.MULTIPLY));
        TextMulti2.setBackground(multi2);




    }
}