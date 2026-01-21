package org.enigmacamp;

public class BidangDatar {
    private double panjang;
    private double lebar;


    public BidangDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public BidangDatar(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }


    @Override
    public String toString() {
        return "BidangDatar{" +
                "panjang=" + panjang +
                ", lebar=" + lebar +
                '}';
    }
}
