package com.tkx.tian_demo.models;

public class Product {

    /**
     * 钻石
     */
    public static final String DIAMOND = "0";

    /**
     * 黄金
     */
    public static final String GOLD = "1";

    private String type;

    private int discount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}