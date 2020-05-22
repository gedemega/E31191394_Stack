/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author Gede Mega
 */
public class Main {

    public static void main(String[] args) { //method main
        int pilihan; //variable
        int data; //variable
        Stack result = new Stack(); //deklarasi untuk memanggil kelas lain
        do { //melakukan
            System.out.println("1.PUSH"); //output
            System.out.println("2.POP ITEM"); //output
            System.out.println("3.LIHAT ISI DATA"); //output
            System.out.println("4.KELUAR"); //output
            Scanner input = new Scanner(System.in); //memasukan scanner
            pilihan = input.nextInt(); //memasukan pilihan input.nextInt
            if (pilihan == 1) { //jika pilihan
                System.out.println("Data yang di tambahkan :");//output
                data = input.nextInt(); //data yang dimasukan ke stack
                result.push(data); //memanggil method push
            } else if (pilihan == 2) { //maka pilihan 2
                result.pop(); //hasilnya pop
            } else if (pilihan == 3) { //maka pilihan 3
                result.display(); //hasilnya display
            } else if (pilihan == 0) { //maka pilihan 0
                System.exit(0); //berhenti
            } else { //maka
                System.out.println("pilihan tidak ada"); //output
            }
        }while(pilihan !=0); //program mengulang
    }

}
