package com.example.prihann.myapplication.database;

import android.content.Context;

import com.example.prihann.myapplication.App;
import com.example.prihann.myapplication.models.MyObjectBox;

import io.objectbox.BoxStore;

public class AppDatabase {

    private static AppDatabase appDatabaseInstance;
    private static BoxStore boxStore;

    public static BoxStore getBoxStoreInstance(Context context) {
        if (boxStore == null) {
            boxStore = MyObjectBox.builder().androidContext(context).build();
        }
        return boxStore;
    }

    public static void destroyBoxStoreInstance() {
        if (boxStore != null) {
            boxStore = null;
        }
    }
}
