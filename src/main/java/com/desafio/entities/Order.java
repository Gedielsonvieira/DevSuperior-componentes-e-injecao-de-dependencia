package com.desafio.entities;

public class Order {
    private int code;
    private double basicValue;
    private double discount;

    public Order(int code, double basicValue, double discount) {
        this.code = code;
        this.basicValue = basicValue;
        this.discount = discount;
    }

    public int getCode() {
        return code;
    }

    public double getBasicValue() {
        return basicValue;
    }

    public double getDiscount() {
        return discount;
    }
}
