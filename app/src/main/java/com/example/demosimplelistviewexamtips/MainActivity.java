package com.example.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lvExamTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvExamTips = findViewById(R.id.listViewExamTips);

        ArrayList<String> tipArray = new ArrayList<String>();
        tipArray.add("Don't just read the code, code it as much as possible during each practical session");
        tipArray.add("Seek help from the lecturer ASAP, don't wait till you lost in the jungle");
        tipArray.add("Prepare your template source code for each topic");
        tipArray.add("Create a few empty Android projects to speed up your coding during the exam");
        tipArray.add("Ensure that your Android Studio is up and running before the exam");
        ArrayAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,tipArray);
        lvExamTips.setAdapter(adapter);
    }
}