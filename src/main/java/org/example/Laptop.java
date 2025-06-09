package org.example;

public class Laptop {

    int LapPrice;

    public int getLapPrice() {
        return LapPrice;
    }

    public void setLapPrice(int lapPrice) {
        LapPrice = lapPrice;
    }


    private Alien alienn;

    public Alien getAlienn() {
        return alienn;
    }

    public void setAlienn(Alien alienn) {
        this.alienn = alienn;
    }


    public Laptop() {
        System.out.println("Laptop Object created");
    }

    public void laptop() {
        System.out.println("Enter something to code");
    }
}
