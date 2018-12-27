package com.example.prihann.myapplication.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.prihann.myapplication.App;
import com.example.prihann.myapplication.R;
import com.example.prihann.myapplication.models.Product;
import com.example.prihann.myapplication.models.Product_;
import com.example.prihann.myapplication.repo.ProductRepo;

import java.util.List;

import io.objectbox.Box;
import io.objectbox.BoxStore;
import io.objectbox.query.QueryBuilder;

public class MainActivity extends AppCompatActivity {

    private  Box<Product> productBox;

    Button buttonInsert,buttonView,buttonTest;
    TextView textViewProductName;
    EditText editTextProductId,editTextProductName,editTextProductId2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProductRepo productRepo = new ProductRepo(getApplicationContext());
        Product product = new Product();
        product.setProductId(100);
        product.setProductName("me");
        productRepo.create(product);


        List<Product> productList = (List<Product>) productRepo.findAll();
        Log.d("kn",productList.get(0).getProductName()+"dddddddddddddddddddddddddddd");
    }
}
