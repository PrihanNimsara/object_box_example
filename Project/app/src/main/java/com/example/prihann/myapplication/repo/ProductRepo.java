package com.example.prihann.myapplication.repo;

import android.content.Context;

import com.example.prihann.myapplication.database.AppDatabase;
import com.example.prihann.myapplication.models.Product;
import com.example.prihann.myapplication.models.Product_;

import java.util.List;

import io.objectbox.Box;
import io.objectbox.BoxStore;

public class ProductRepo implements Crud {
    Context context;
    BoxStore boxStore;
    private Box<Product> productBox;

    public ProductRepo(Context context) {
        this.context = context;
        boxStore = AppDatabase.getBoxStoreInstance(context);
        productBox = boxStore.boxFor(Product.class);
    }

    @Override
    public Boolean create(Object item) {
        productBox.put((Product) item);
        return null;
    }

    @Override
    public Boolean update(Object item) {
        productBox.put((Product) item);
        return null;
    }

    @Override
    public Boolean delete(Object item) {
        productBox.remove((Product) item);
        return null;
    }

    @Override
    public List<?> findAll() {
        List<Product> productList = productBox.getAll();
        return productList;
    }

    public List<Product> getUsingProductName(String productName) {
        List<Product> productList = productBox.query().equal(Product_.productName, productName).build().find();
        return productList;
    }
}
