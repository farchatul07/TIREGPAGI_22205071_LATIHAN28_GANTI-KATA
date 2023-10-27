/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan28;
import java.util.Scanner;

/**
 *
 * @author user
 Nama              : Farchatul Hudayah
 Nim               : 22205071
 Prodi             : Teknik Informatika
 Kelas             : PBO1
 Deskripsi Program : Program ini berisi program untuk mengganti kata yang perlu diganti
 */
public class Latihan28 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===Program Mengganti Kata===");

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.print("Masukkan kata yang ingin diganti: ");
        String kataYangInginDiganti = scanner.nextLine();

        System.out.print("Masukkan kata pengganti: ");
        String kataPengganti = scanner.nextLine();

        // Menyimpan kalimat awal sebelum melakukan penggantian
        String kalimatAwal = kalimat;

        String kalimatBaru = kalimat.replace(kataYangInginDiganti, kataPengganti);

        System.out.println("==HASIL FORMATTING==");
        System.out.println("Kalimat awal: " + kalimatAwal);
        System.out.println("Kalimat baru: " + kalimatBaru);
    }
    }

