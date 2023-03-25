package com.javaTutor;
import java.lang.Math;
import java.util.Scanner;

public class show{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pil;
        boolean kon = true;

        while (kon == true){
            System.out.println("Silakan Pilih Bangun Ruang:");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Bola");
            System.out.print("Pilih: ");
            pil = sc.nextInt();

            if (pil == 1) {
                System.out.println("Kamu Memilih Kubus");
                System.out.println("Silakan Pilih Perhitungan:");
                System.out.println("1. Luas Kubus");
                System.out.println("2. Keliling Kubus");
                System.out.println("3. Volume Kubus");
                System.out.print("Pilih: ");
                pil = sc.nextInt();
                if (pil == 1) {
                    System.out.print("Masukkan Sisi: ");
                    int sisi = sc.nextInt();
                    System.out.printf("Luas Kubus: %d\n",perhitungan.luasKubus(sisi));
                }
                else if (pil == 2) {
                    System.out.print("Masukkan Panjang Rusuk: ");
                    int rusuk = sc.nextInt();
                    System.out.printf("Keliling Kubus: %d\n",perhitungan.kelKubus(rusuk));
                }
                else if (pil == 3) {
                    System.out.print("Masukkan Sisi: ");
                    int sisi = sc.nextInt();
                    System.out.printf("Volume Kubus: %d\n",perhitungan.volumeKubus(sisi));
                }
            }
            else if (pil == 2){
                System.out.println("Kamu Memilih Balok");
                System.out.println("Silakan Pilih Perhitungan:");
                System.out.println("1. Luas Balok");
                System.out.println("2. Keliling Balok");
                System.out.println("3. Volume Balok");
                System.out.print("Pilih: ");
                pil = sc.nextInt();

                System.out.print("Masukkan Panjang: ");
                int p = sc.nextInt();
                System.out.print("Masukkan Lebar: ");
                int l = sc.nextInt();
                System.out.print("Masukkan Tinggi: ");
                int t = sc.nextInt();

                if (pil == 1) {
                    System.out.printf("Luas Balok: %d\n",perhitungan.luasBalok(p, l, t));
                }
                else if (pil == 2) {
                    System.out.printf("Keliling Balok: %d\n",perhitungan.kelBalok(p, l, t));
                }
                else if (pil == 3) {
                    System.out.printf("Volume Balok: %d\n",perhitungan.volumeBalok(p, l, t));
                }
            }
            else if (pil == 3){
                System.out.println("Kamu Memilih Bola");
                System.out.println("Silakan Pilih Perhitungan:");
                System.out.println("1. Luas Permukaan Bola");
                System.out.println("2. Keliling Bola");
                System.out.println("3. Volume Bola");
                System.out.print("Pilih: ");
                pil = sc.nextInt();

                System.out.print("Masukkan Diameter: ");
                float d = sc.nextInt();

                if (pil == 1) {
                    System.out.printf("Luas Permukaan Bola: %d\n",Math.round(perhitungan.luasBola(d)));
                }
                else if (pil == 2) {
                    System.out.printf("Keliling Bola: %d\n",Math.round(perhitungan.kelBola(d)));
                }
                else if (pil == 3) {
                    System.out.printf("Volume Bola: %d\n",Math.round(perhitungan.volumeBola(d)));
                }
            }

            System.out.println("Apakah Ingin melanjutkan?");
            System.out.println("1. YA");
            System.out.println("2. TIDAK");
            System.out.print("Pilih: ");
            pil = sc.nextInt();

            if (pil == 1){
                continue;
            }
            else{
                break;
            }
        }
        sc.close();
    }
}