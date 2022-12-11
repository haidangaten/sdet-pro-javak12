package lab2_2;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so :");
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("So chan");
        }
        else{
            System.out.println("So le");
        }
    }
    }
