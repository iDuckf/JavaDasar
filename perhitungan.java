package com.javaTutor;

public class perhitungan{
    //Kubus
    public static int luasKubus(int sisi){
        return 6 * (sisi * sisi);
    }
    public static int kelKubus(int rusuk){
        return 12 * rusuk;
    }
    public static int volumeKubus(int sisi){
        return sisi * sisi * sisi;
    }

    //Balok
    public static int luasBalok(int panjang, int lebar, int tinggi){
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (tinggi * lebar));
    }
    public static int kelBalok(int panjang, int lebar, int tinggi){
        return 4 * (panjang * lebar * tinggi);
    }
    public static int volumeBalok(int panjang, int lebar, int tinggi){
        return panjang * lebar * tinggi;
    }

    //Bola
    public static float luasBola(float diameter){
        float r = diameter / 2;
        float luas = 4 * 3.14f * (r * r);
        return luas;
    }
    public static float kelBola(float diameter){
        float r = diameter / 2;
        float Kel = 1.3f * 3.14f * (r * r);
        return Kel;
    }
    public static float volumeBola(float diameter){
        float r = diameter / 2;
        float vol = 1.3f * 3.14f * (r * r * r);
        return vol;
    }
}