package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        int size;
        do {
            System.out.println("nhap so  luong");
            size=scanner.nextInt();
            if (size>10) System.out.println("nhieu the!!");
        }while (size>10);

        int[] array= new int[size];

        for (int i=0;i<array.length;i++){
            System.out.println("nhap phan tu ");
            array[i]=scanner.nextInt();
        }

        int amount=0;
        for (int j=0; j<array.length;j++){
            if (array[j]>5){
                amount++;
            }
        }
        System.out.println("so luong sinh vien do la :"+amount);





    }

}
