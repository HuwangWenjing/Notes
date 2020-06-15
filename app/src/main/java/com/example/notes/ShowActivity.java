package com.example.notes;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    TextView content;
    TextView topic;
    TextView time;
    String TAG = "show";
//    private SQLiteDatabase db;
//    Cursor cursor = db.query("Book",null, null, null, null, null, null);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        View view1 = View.inflate(ShowActivity.this,R.layout.activity_show,null);


        //将变量取出
        Intent intent = getIntent();
        String title1 = intent.getStringExtra("title_from_Add");
        String content1 = intent.getStringExtra("content_from_Add");
        String time1 = intent.getStringExtra("time");
        Log.i(TAG, "onCreate: title1 " + title1);
        Log.i(TAG, "onCreate: content1  " + content1);
        Log.i(TAG, "onCreate: time1  " + time1);
        //获取控件
        content = (TextView) findViewById(R.id.detailContent);
        topic = (TextView)findViewById(R.id.detailTitle);
        time = (TextView) findViewById(R.id.detailTime);
        //Log.i(TAG, "onCreate: content " + content);
        //显示数据到控件
        topic.setText(title1);
        content.setText(content1);
        time.setText(time1);
        Log.i(TAG, "onCreate: 成功显示 " + title1 );
    }
}
