package com.caojiahao.ui_test;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * @Description: java类作用描述
 * @author: caojiahao
 * @date: 2022/7/16
 */
public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        Button titleBack= findViewById(R.id.title_back);
        Button titleEdit= findViewById(R.id.title_edit);
        titleBack.setOnClickListener(v -> ((Activity) getContext()).finish());
        titleEdit.setOnClickListener(v -> Toast.makeText(getContext(),"You clicked Edit button",Toast.LENGTH_SHORT).show());
    }
}
