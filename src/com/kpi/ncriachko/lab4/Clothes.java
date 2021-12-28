package com.kpi.ncriachko.lab4;

public class Clothes {
    private String material;
    private String brand;
    private double price;
    private String season;
    private String size;

    public Clothes(String material, String brand, double price, String season, String size) {
        this.material = material;
        this.brand = brand;
        this.price = price;
        this.season = season;
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return this.price;
    }
}
