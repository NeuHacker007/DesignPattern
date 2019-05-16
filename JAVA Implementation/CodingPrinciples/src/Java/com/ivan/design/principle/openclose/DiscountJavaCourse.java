package com.ivan.design.principle.openclose;

public class DiscountJavaCourse extends JavaCourse {

    public DiscountJavaCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginalPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice(){
        return super.getPrice()*0.8;
    }
}
