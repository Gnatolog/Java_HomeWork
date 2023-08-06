package org.example;

public class NoteBook {

    private Integer ram;
    private Integer hd;
    private String os;
    private String color;
    private String lable;
    private Integer video;

    public NoteBook(String liable,Integer video, Integer ram, Integer hd, String os, String color){
        this.ram = ram;
        this.hd = hd;
        this.os = os;
        this.color = color;
        this.lable = liable;
        this.video = video;

        }

    public Integer getHd() {
        return hd;
    }

    public Integer getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public String getOs() {
        return os;
    }
    @Override
    public String toString(){
        return  "Company: " + this.lable + "\n"+ "Video: " + this.video + " gb\n"
                + "Ram: " + this.ram + " gb\n" + "HDD: " + this.hd + " gb\n"
                + "Os:  "+ this.os + "\n" + "Color: " + this.color + "\n";
    }

}
