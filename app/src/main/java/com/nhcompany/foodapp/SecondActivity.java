package com.nhcompany.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    ImageView foodImage;
    TextView foodName;
    TextView price;
    String name , price2  ;
    int imageId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        foodImage = findViewById(R.id.foodimage2);
        foodName =findViewById(R.id.foodname2);
        price = findViewById(R.id.price2);

        name = getIntent().getStringExtra("title");
        price2 = getIntent().getStringExtra("price");
        imageId = getIntent().getIntExtra("image" , 0);

        foodName.setText(name);
        price.setText(price2);
        foodImage.setImageResource(imageId);

        //Parcelable
        /*Menu menu =getIntent().getParcelableExtra("foodobject");

        foodName.setText(menu.getFoodName());
        foodImage.setImageResource(menu.getFoodImageId());
        price.setText(menu.getPrice());*/





    }
}
