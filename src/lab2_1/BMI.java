package lab2_1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float weight , height , bmi;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap can nang (kg) : ");
        weight=sc.nextFloat();
        System.out.println("Nhap chieu cao (m) : ");
        height=sc.nextFloat();

        bmi= weight / (height*2);

        if(bmi<18.5){
            System.out.println("Underweight");
        } else if (bmi>18.5 && bmi <24.9) {
            System.out.println("Normal weight");
        } else if (bmi <29.9) {
            System.out.println("Overweight");
        }else{
            System.out.println("Obesity");
        }


    }
}
