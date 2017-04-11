package com.example.op.arview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.op.arview.FindPath.FindPath;
import com.example.op.arview.arview.ARView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void arBtnClick(View view) {
        startActivity(new Intent(MainActivity.this, ARView.class));
    }

    public void findPathBtnClick(View view) {
        Intent intent = new Intent(MainActivity.this, FindPath.class);
        intent.putExtra("beginLat",10.8428107);
        intent.putExtra("beginLon",106.663896);
        intent.putExtra("endLat",10.7662791);
        intent.putExtra("endLon",106.681365);
        intent.putExtra("distination","ahihi");

        startActivity(intent);
    }
}
