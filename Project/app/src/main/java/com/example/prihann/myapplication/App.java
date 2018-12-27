package com.example.prihann.myapplication;

import android.app.Application;

import io.objectbox.BoxStore;

public class App extends Application {

    BoxStore boxStore;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
