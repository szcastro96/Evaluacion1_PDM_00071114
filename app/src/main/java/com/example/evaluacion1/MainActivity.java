package com.example.evaluacion1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public LinearLayout mLYproducto1, mLYproducto2, mLYproducto3, mLYproducto4, mLYproducto5, mLYproducto6, mLYproducto7, mLYproducto8, mLYproducto9;
    public TextView mProdu1, mProdu2, mProdu3, mProdu4, mProdu5, mProdu6, mProdu7, mProdu8, mProdu9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLYproducto1 = findViewById(R.id.ly_producto1);
        mLYproducto2 = findViewById(R.id.ly_producto2);
        mLYproducto3 = findViewById(R.id.ly_producto3);
        mLYproducto4 = findViewById(R.id.ly_producto4);
        mLYproducto5 = findViewById(R.id.ly_producto5);
        mLYproducto6 = findViewById(R.id.ly_producto6);
        mLYproducto7 = findViewById(R.id.ly_producto7);
        mLYproducto8 = findViewById(R.id.ly_producto8);
        mLYproducto9 = findViewById(R.id.ly_producto9);

        mProdu1 = findViewById(R.id.tv_produ1);
        mProdu2 = findViewById(R.id.tv_produ2);
        mProdu3 = findViewById(R.id.tv_produ3);
        mProdu4 = findViewById(R.id.tv_produ4);
        mProdu5 = findViewById(R.id.tv_produ5);
        mProdu6 = findViewById(R.id.tv_produ6);
        mProdu7 = findViewById(R.id.tv_produ7);
        mProdu8 = findViewById(R.id.tv_produ8);
        mProdu9 = findViewById(R.id.tv_produ9);

    }
}
