package com.pr.model;
import java.util.Scanner;
class practise
{


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = Integer.parseInt((obj).nextLine());

        String ar[] = new String[size];
        for (int i = 0; i <size; i++) {
            ar[i] = obj.nextLine();
        }
        for (int i = 0; i <ar.length; i++) {
            System.out.println("Array elements of " + i + " is" + ar[i]);
        }
    }





    }







