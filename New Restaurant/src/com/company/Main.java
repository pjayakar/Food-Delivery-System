package com.company;
import Restaurant.*;
import java.io.*;
import java.util.*;

class Payment_Delivery
{
    void delivery()
    {
        Scanner t = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = t.next();
        System.out.print("Enter Mobile number: ");
        String no = t.next();
        if(no.length() != 10 )
        {
            System.out.println("Invalid Number! Please try again");
            System.out.print("Enter Mobile number: ");
            no = t.next();
        }
        System.out.print("Enter your address: ");
        String address = t.next();
    }
    void mode_of_pay()
    {
        Scanner t = new Scanner(System.in);
        System.out.print("Mode of Payments \n1. Card \n2. Cash on Delivery \n3. Net Banking \nChoose mode of payment: ");
        int pay = t.nextInt();
        t.nextLine();
        switch(pay)
        {
            case 1:
            {
                System.out.println("Enter card number: ");
                String card = t.nextLine();
                System.out.println("Enter expiry date: ");
                String date = t.nextLine();
                System.out.println("Payment Successful! Your order will arrive in 30 mins.");
            }
            break;
            case 2:
            {
                System.out.println("Cash On Delivery");
                System.out.println("Your order will arrive in 30 mins. Please keep the exact change ready!");
            }
            break;
            case 3:
            {
                System.out.println("1. IDBI Bank");
                System.out.println("2. ICICI Bank");
                System.out.println("3. Bank of Baroda");
                System.out.println("4. Central Bank of India.");
                System.out.println("5. Bank of India");
                System.out.print("Choose your bank: ");
                int bank = t.nextInt();
                System.out.println("Redirecting to bank website.......");
            }
        }

    }
}
class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner t = new Scanner(System.in);
        System.out.print("Enter your 6-digit pincode: ");
        int pincode = t.nextInt();
        String str = Integer.toString(pincode);
        str = str.substring(0, str.length() - 1);
        str = str + "5";
        pincode = Integer.parseInt(str);
        System.out.print("1. Indian \n2. Asian \n3. European \n4. Middle Eastern \n5. Fast Food \nEnter your preferred cuisine: ");
        int cuisine = t.nextInt();
        switch (cuisine) {
            case 1:
                Indian ind = new Indian();
                ind.Ind_data(pincode);
                break;
            case 2:
                Asian asia = new Asian();
                asia.Asi_data(pincode);
                break;
            case 3:
                European ital = new European();
                ital.Euro_data(pincode);
                break;
            case 4:
                Mid_East ME = new Mid_East();
                ME.ME_data(pincode);
                break;
            case 5:
                Fast_Food fF = new Fast_Food();
                fF.FF_data(pincode);
                break;

        }
        Payment_Delivery pd = new Payment_Delivery();
        pd.delivery();
        pd.mode_of_pay();
    }
}