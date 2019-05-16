package com.ivan.design.principle.openclose;

public class JavaCourse implements ICourse {
    private Integer Id;
    private String Name;
    private Double Price;

    public JavaCourse(Integer id, String name, Double price) {
        Id = id;
        Name = name;
        Price = price;
    }

    public Integer getId() {
        return this.Id;
    }

    public String getName() {
        return this.Name;
    }

    public Double getPrice() {
        return this.Price;
    }
}
