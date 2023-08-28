package org.example;

public class Product {
    /*
    * Базовый класс
    * */

    protected String name; // Наименование
    protected String brand; // Изготовление
    protected double price; // Стоимость


    private void check_prices(double price){
        if (price < 100){
            throw new RuntimeException("Некорректная цена товара");
        }
        this.price = price;
    }

    private void check_name(String name){
        if ( name == null || name.length() < 3 ){
            this.name="Noname";
        }
        else{
            this.name = name;
        }
    }

    private void check_brand(String brand){
        if (brand == null || brand.length() < 3){
            this.brand="Noname";
        }
        else{
            this.brand = brand;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        check_name(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        check_brand(brand);
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        check_prices(price);
    }

    public Product(){
        this("Noname");
    }
    public  Product(String name){
        this(name,"Noname");
    }

    public Product (String name, String brand){
        this(name, brand, 100);
    }

    public Product(String name, String brand, double price){
        check_name(name);
        check_brand(brand);
        check_prices(price);
    }

    public String displayinfo(){
        return String.format("%s - %s - %.2f",name,brand,price);
    }
}
