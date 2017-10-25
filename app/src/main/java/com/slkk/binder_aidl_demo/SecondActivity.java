package com.slkk.binder_aidl_demo;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

public class SecondActivity extends AppCompatActivity {

    public static final String TAG = "SecondActivity";
    private TextView intent_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        intent_value = (TextView) findViewById(R.id.value_intent);

        Student student = getIntent().getParcelableExtra("student");
        Book book = (Book) getIntent().getSerializableExtra("book");

        if (student != null) {
            intent_value.setText("name:" + String.valueOf(student.getName()) + "   " + "age:" + student.getAge());
        } else {
            intent_value.setText("id:" + String.valueOf(book.getId()) + "   " + "name:" + book.getName());
        }
    }
}
