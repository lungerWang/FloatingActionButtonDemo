package com.example.lunger.floatingactionbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.lunger.floatingactionbardemo.floatbutton.FloatingActionButton;
import com.example.lunger.floatingactionbardemo.floatbutton.FloatingActionMenu;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private FloatingActionMenu mMenu;
    private FloatingActionButton mFloatingActionButtonShare;
    private FloatingActionButton mFloatingActionButtonSize;
    private FloatingActionButton mFloatingActionButtonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mMenu = findViewById(R.id.fab_menu_main);
        mFloatingActionButtonShare = findViewById(R.id.fab_share);
        mFloatingActionButtonSize = findViewById(R.id.fab_wordsize);
        mFloatingActionButtonOrder = findViewById(R.id.fab_ordertype);
        mMenu.setClosedOnTouchOutside(true);
        mFloatingActionButtonShare.setOnClickListener(this);
        mFloatingActionButtonSize.setOnClickListener(this);
        mFloatingActionButtonOrder.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fab_share:
                Log.d("wbl", "fab_share 被点击");
                mMenu.close(true);
                break;
            case R.id.fab_wordsize:
                Log.d("wbl", "fab_wordsize 被点击");
                mMenu.close(true);
                break;
            case R.id.fab_ordertype:
                Log.d("wbl", "fab_ordertype 被点击");
                mMenu.close(true);
                break;
        }
    }
}
