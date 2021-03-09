package com.nhcompany.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Menu> menu;
    MenuAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.menuView);

        menu = new ArrayList<>();
        menu.add(new Menu(R.drawable.burger , "Cheese Burger" , "3.5" , "$"));
        menu.add(new Menu(R.drawable.shawerma , "Chicken Shawerma" , "4.5" ,"$"));
        menu.add(new Menu(R.drawable.pancakes , "Pancakes" , "2.99" ,"$"));
        menu.add(new Menu(R.drawable.pizza , "Pepperoni Pizza" , "3.99" ,"$"));
        menu.add(new Menu(R.drawable.filletsteak , "Fillet Steak" , "2.5" ,"$"));
        menu.add(new Menu(R.drawable.waffles , "Waffle" , "2.5" ,"$"));
        menu.add(new Menu(R.drawable.clubsandwich , "Club Sandwich" , "2.5" ,"$"));

        adapter = new MenuAdapter(MainActivity.this ,menu);
        gridView.setAdapter(adapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Menu menuObj = (Menu) gridView.getAdapter().getItem(position);
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                //parcelable
                //intent.putExtra("foodobject", (Parcelable) adapter.getItem(position));
                intent.putExtra("title" , menuObj.getFoodName());
                intent.putExtra("price" , menuObj.getPrice());
                intent.putExtra("image" , menuObj.getFoodImageId());

                startActivity(intent);
            }
        });



    }
}
