package org.example;

public class Chips extends Product {

    /*
     * Класс чипсы
     * */
    private int gram; // обьём чипсов
    private String taste; // вкус чипсов

    private String type; // тип чипсов


    public Chips(String name, String brand, double price, int gram, String taste, String type){
        super(name,brand,price);
        this.taste = taste;
        this.type = type;
        this.gram = gram;
    }

    public double getGram() {
        return gram;
    }

    public String getTaste() {
        return taste;
    }

    public String getType() {
        return type;
    }

    @Override
    public String displayinfo() {
        return String.format("""
                         
                         
                    Product: %s
                    Brand: %s
                    Price: %.2f
                    Gram: %dg
                    Taste: %s
                    Type: %s
                """,name,brand,price,gram,taste,type);
    }
}
