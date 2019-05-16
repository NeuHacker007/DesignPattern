package com.ivan.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse Javacourse = new DiscountJavaCourse(96, "Design Pattern", 348d);
        DiscountJavaCourse discountJavaCourse = (DiscountJavaCourse) Javacourse;
        System.out.println( "Course ID: "+discountJavaCourse.getId() +" Course name: " +discountJavaCourse.getName()+" original price: "+ discountJavaCourse.getOriginalPrice()+" Course price: " + discountJavaCourse.getPrice());
    }
}
