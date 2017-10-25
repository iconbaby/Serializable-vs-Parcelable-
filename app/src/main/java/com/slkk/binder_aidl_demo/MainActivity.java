package com.slkk.binder_aidl_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_serial;
    private Button btn_parcelable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_serial = (Button) findViewById(R.id.btn_serial);
        btn_parcelable = (Button) findViewById(R.id.btn_parcelable);
        btn_serial.setOnClickListener(this);
        btn_parcelable.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_serial:
                Book book = new Book(123, "The first blood");
                Intent intent_book = new Intent(this, SecondActivity.class);
                intent_book.putExtra("book", book);
                startActivity(intent_book);
                break;
            case R.id.btn_parcelable:
                Student jack = new Student("jack", 13);
                Intent intent_student = new Intent(this, SecondActivity.class);
                intent_student.putExtra("student", jack);
                startActivity(intent_student);
                break;
        }

    }
}
