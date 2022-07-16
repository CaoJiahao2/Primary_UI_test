package com.caojiahao.ui_test;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText;
    private ImageView imageview;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit_text);
        imageview = findViewById(R.id.imageview);
        progressBar = findViewById(R.id.progress_bar);
        Button button1=findViewById(R.id.progress_bar_visible);
        button1.setOnClickListener(this);
        Button button2=findViewById(R.id.button);
        button2.setOnClickListener(this);
        Button button3=findViewById(R.id.picture_change);
        button3.setOnClickListener(this);
        Button button4=findViewById(R.id.alert);
        button4.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.progress_bar_visible:
                int progress=progressBar.getProgress();
                progress+=10;
                progressBar.setProgress(progress);
                break;
            case R.id.button:
                String inputText = editText.getText().toString();
                Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.picture_change:
                if (imageview.getVisibility()==View.INVISIBLE){
                    imageview.setVisibility(View.VISIBLE);
                }else {
                    imageview.setVisibility(View.INVISIBLE);
                }break;
            case R.id.alert:
                AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("this is a alert dialog!");
                dialog.setMessage("Something import is in error!");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", (dialog12, which) -> {

                });
                dialog.setNegativeButton("Cancel", (dialog1, which) -> {

                });
                dialog.show();
                break;
            default:
                break;
        }
    }
}