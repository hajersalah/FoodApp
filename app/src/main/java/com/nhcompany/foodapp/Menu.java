package com.nhcompany.foodapp;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu {
    private int foodImageId;
    private String foodName;
    private String price;
    private String dollarSign;

    public Menu(int foodImageId, String foodName, String price , String dollarSign) {
        this.foodImageId = foodImageId;
        this.foodName = foodName;
        this.price = price;
        this.dollarSign = dollarSign;
    }

    public String getDollarSign() {
        return dollarSign;
    }

    public int getFoodImageId() {
        return foodImageId;
    }

    public void setFoodImageId(int foodImageId) {
        this.foodImageId = foodImageId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
