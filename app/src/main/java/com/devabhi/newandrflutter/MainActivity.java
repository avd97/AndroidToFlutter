package com.devabhi.newandrflutter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpFlutter(View view) {
        startActivity(FlutterActivity.createDefaultIntent(this));
    }
}

/*
setBinding(new Binding([gradle: this]))                                // new
evaluate(new File(                                                     // new
  settingsDir.parentFile,                                              // new
  'demomodule/.android/include_flutter.groovy'                         // new
))

include ':demomodule'
project(':demomodule').projectDir = new File('../demomodule')
* */