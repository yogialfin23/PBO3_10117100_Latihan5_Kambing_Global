/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingglobal;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class KambingGlobal {
    //Variabel jumlahKambing menjadi Variabel Instance
    int jumlahKambing = 88;
    
    //Methode Untuk Menampilkan Jumlah Kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " +jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah ditambah: " +
                        jumlahKambing);
    }

    
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama dan berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
