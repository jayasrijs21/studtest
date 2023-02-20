package com.example.studtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;
    String s1,s2,s3,s4;

    String JSON = "{\"student\" :{\"name\": \"ram\",\"house\":\"green\"," +
            "\"extra\":[\"rsp\",\"jrc\"], \"sub\" :\"maths\" }}";



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv4 = findViewById(R.id.textview4);
        try {

            JSONObject obj = new JSONObject(JSON);
            JSONObject details = obj.getJSONObject("student");
            s1 = details.getString("house");
            s2 = details.getString("sub");
            s3 = details.getString("extra");

            tv1.setText(s1);
            tv2.setText(s2);
            tv3.setText(s3);
            

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}