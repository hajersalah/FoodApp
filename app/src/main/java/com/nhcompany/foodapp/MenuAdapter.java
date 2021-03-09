package com.nhcompany.foodapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MenuAdapter extends ArrayAdapter<Menu> {
    public MenuAdapter(@NonNull Context context, @NonNull List<Menu> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.food_item,parent , false);

        TextView foodName = convertView.findViewById(R.id.foodname);
        ImageView foodImage = convertView.findViewById(R.id.foodimage);
        Button price = convertView.findViewById(R.id.price);

        final Menu menu =getItem(position);
        foodName.setText(menu.getFoodName());
        foodImage.setImageResource(menu.getFoodImageId());
        price.setText(menu.getPrice()+ menu.getDollarSign());
        //price.setText(String.valueOf(menu.getPrice())+ menu.getDollarSign());

        return convertView;
    }
}
