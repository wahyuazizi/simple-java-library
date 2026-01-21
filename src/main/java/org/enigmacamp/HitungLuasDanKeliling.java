package org.enigmacamp;

public class HitungLuasDanKeliling {
    public double hitungLuasPersegi(Persegi persegi){
        double sisi = persegi.getPanjang();
        return sisi*sisi;
    }

    public double hitungLuasPersegiPanjang(PersegiPanjang persegiPanjang){
        double panjang = persegiPanjang.getPanjang();
        double lebar = persegiPanjang.getLebar();
        return panjang*lebar;
    }

    public double hitungKelilingPersegi(Persegi persegi){
        double sisi = persegi.getPanjang();
        return 4*sisi;
    }

    public double hitungKelilingPersegiPanjang(PersegiPanjang persegiPanjang){
        double panjang = persegiPanjang.getPanjang();
        double lebar = persegiPanjang.getLebar();
        return 2*(panjang+lebar);
    }

    public double hitungLuasLingkaran(Lingkaran lingkaran){
        double radius = lingkaran.getPanjang();
        return 3.14*radius*radius;
    }

    public double hitungKelilingLingkaran(Lingkaran lingkaran){
        double radius = lingkaran.getPanjang();
        return 2*3.14*radius;
    }
}
