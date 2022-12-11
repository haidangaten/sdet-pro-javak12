package lab2_3;

import java.util.Scanner;

public class BMIAdvanced {
    public static void main(String[] args) {
        float weight , height , bmi;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap can nang (kg) : ");
        weight=sc.nextFloat();
        System.out.println("Nhap chieu cao (m) : ");
        height=sc.nextFloat();

        bmi= weight / (height*2);

        if(bmi<18.5){
            float newBMI1= (float) (18.5 * (height*2) -weight);
            System.out.println("Underweight");
            System.out.println("Ban can tang : " + newBMI1 + "kg");
        } else if (bmi>18.5 && bmi <24.9) {
            System.out.println("Normal weight");
        } else if (bmi <29.9) {
            float newBMI2= (float) (weight -18.5 * (height*2));
            System.out.println("Overweight");
            System.out.println("Ban can giam : " + newBMI2 + "kg");
        }else{
            System.out.println("Obesity");
        }
    }
}
