package com.example.hellotost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount =0;
    private TextView mShowCount;
    //définir la clé de l'extra de l'intention
    public static final String EXTRA_MESSAGE =
            "com.example.hellotost.extra.MESSAGE";

    private TextView mMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        //*******
        mMessageTextView= findViewById(R.id.show_count);
        Log.d("qest1", "3");
        Log.d("qest2", "1;3");
        Log.d("qest3", "2");
        Log.d("qest4", "4");
        Log.d("quest5", "4");



    }
/*
    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }
*/
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = mMessageTextView.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}