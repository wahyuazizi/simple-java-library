# INI LIBRARY SEDERHANA UNTUK BELAJAR

untuk mencoba bisa buat projek baru kemudian di main atau file class baru bisa mencoba library ini.
contoh sederhana seperti ini

```JAVA
package org.enigmacamp;


public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(2.5);
        PersegiPanjang persegiPanjang = new PersegiPanjang(2.5, 4.0);
        Lingkaran lingkaran = new Lingkaran(4.2);
        HitungLuasDanKeliling rumus = new HitungLuasDanKeliling();

        double hasilLuasPersegi = rumus.hitungLuasPersegi(persegi);
        double hasilLuasPersegiPanjang = rumus.hitungLuasPersegiPanjang(persegiPanjang);

        double hasilKelilingPersegi = rumus.hitungKelilingPersegi(persegi);
        double hasilKelilingPersegiPanjang = rumus.hitungKelilingPersegiPanjang(persegiPanjang);

        double hasilLuasLingkaran = rumus.hitungLuasLingkaran(lingkaran);
        double hasilKelilingLingkaran = rumus.hitungKelilingLingkaran(lingkaran);

        System.out.println("Luas Persegi : " + hasilLuasPersegi);
        System.out.println("===".repeat(5));
        System.out.println("Luas Persegi Panjang : " + hasilLuasPersegiPanjang);
        System.out.println("===".repeat(5));
        System.out.println("Keliling Persegi : " + hasilKelilingPersegi);
        System.out.println("===".repeat(5));
        System.out.println("Keliling Persegi Panjang : " + hasilKelilingPersegiPanjang);
        System.out.println("===".repeat(5));
        System.out.println("Keliling Lingkaran : " + hasilKelilingLingkaran);
        System.out.println("===".repeat(5));
        System.out.println("Luas Lingkaran : " + hasilLuasLingkaran);
        System.out.println("===".repeat(5));
    }
}
```