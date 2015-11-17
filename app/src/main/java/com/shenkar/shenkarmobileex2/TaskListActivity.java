package com.shenkar.shenkarmobileex2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class TaskListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

    }

    public void moveToAdd(View view){
        Intent intent = null;
        intent = new Intent(this,CreateTaskActivity.class);
        startActivity(intent);
    }




}
