/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Gede Mega
 */
public class Stack {
    private boolean empty,full; //mengecek true atau false
    private int pos; //menentukan posisi
    private int max_data=3; //banyak data dalam array
    private int item[]= new int [max_data]; //deklarasikan dengan nama item
    public void Stack(){ //constructor
        full=false; //variable
        empty=true; //variable
        pos=0; //variable
    }
    public boolean isFull(){ //method
        return (full); //kembali = full
    }
    public boolean isEmpty(){ //method
        return (empty); //kembali = empty
    }
    public void push (int data){ //method stack
        if(!isFull()){ //jika penuh
            item[pos++]=data; //ditambahkan data
            empty=false; //item
            if(pos==max_data){ //jika max_data
                full=true; //maka full=true
            }
            System.out.println("data sudah ditambahkan"); //output
        }else{ //maka
            System.out.println("stack sudah penuh"); //output
        }
        return; //kembali
    }
    public int pop(){ //method pop
        int x=0; //variable
        if(!isEmpty()){ //jika kosong
            x=item[--pos]; //mengecek item apakah kosong
            full=false; //variable
            System.out.println("data yang di pop adalah "+item[pos]); //output
            System.out.println(""); //output
            item[pos]=0; //deklarasikan
            if(pos==0){ //jika pos sama dengan 0
                empty=true; //variable
                System.out.println("stack adalah kosong"); //output
            }else{ //maka
                System.out.println("data sudah di ambil"); //output
            }
        }else{ //maka
            System.out.println("stack masih kosong ! \n"); //output
        }
        return(x); //kembali ke x
    }
    public void display(){ //method display
        System.out.println("isi stack adalah"); //output
        for (int i=0; i < pos; i++) { //pengulangan
            System.out.println(item[i]+""); //output
        }
        System.out.println("\n"); //output
    }

}
