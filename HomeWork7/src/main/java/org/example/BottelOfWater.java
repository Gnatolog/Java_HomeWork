package org.example;

public class BottelOfWater extends Product  {
    /*
     * Класс бутылки с водой
     * */

    private double volume; // обьём

    public BottelOfWater(String name, String brand, double price, double volume){
        super(name,brand,price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String displayinfo() {
    return String.format("""
                
                       
                Product: %s
                Brand: %s
                Price: %.2f
                Volume: %.1f.l
            """,name,brand,price,volume);
    }
}
