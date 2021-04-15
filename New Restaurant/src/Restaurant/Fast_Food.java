package Restaurant;

import java.util.Scanner;

public class Fast_Food extends Customer {
    double rate;
    String dish;

    public Fast_Food() {
    }

    public Fast_Food(String restaurant, int pincode) {
        super(restaurant, pincode);
    }

    public Fast_Food(String food, double price) {
        food = dish;
        price = rate;
    }

    public void FF_data(int pin) {
        Fast_Food[] FF = new Fast_Food[30];
        Fast_Food f = new Fast_Food();
        f.restaurant = "Colaba social";
        f.pincode = 400005;
        FF[0] = (f);
        Fast_Food F1 = new Fast_Food();
        F1.restaurant = "Charcoal eats";
        F1.pincode = 400025;
        FF[1] = (F1);
        Fast_Food F4 = new Fast_Food();
        F4.pincode = 400015;
        F4.restaurant = "Amar";
        FF[2] = (F4);
        Fast_Food F6 = new Fast_Food();
        F6.pincode = 400015;
        F6.restaurant = "Grandmama's Cafe";
        FF[3] = (F6);
        Fast_Food F7 = new Fast_Food();
        F7.pincode = 400025;
        F7.restaurant = "Amritsari  Chaat";
        FF[4] = (F7);
        Fast_Food F8 = new Fast_Food();
        F7.pincode = 400035;
        F7.restaurant = "Charcoal Eats Express";
        FF[5] = (F8);
        Fast_Food F9 = new Fast_Food();
        F9.pincode = 400045;
        F9.restaurant = "Subway";
        FF[6] = (F9);
        Fast_Food F10 = new Fast_Food();
        F10.pincode = 400055;
        F10.restaurant = "Amar";
        FF[7] = (F10);
        Fast_Food F11 = new Fast_Food();
        F11.pincode = 400055;
        F11.restaurant = "Versova Social";
        FF[8] = (F11);
        Fast_Food F12 = new Fast_Food();
        F12.pincode = 400065;
        F12.restaurant = "McDonald’s";
        FF[9] = (F12);
        Fast_Food F13 = new Fast_Food();
        F13.pincode = 400065;
        F13.restaurant = "Flags";
        FF[10] = (F13);
        Fast_Food F14 = new Fast_Food();
        F14.pincode = 400065;
        F14.restaurant = "Fiasco";
        FF[11] = (F14);
        Fast_Food F15 = new Fast_Food();
        F15.pincode = 400075;
        F15.restaurant = "D' Crepes";
        FF[12] = (F15);
        Fast_Food F16 = new Fast_Food();
        F16.pincode = 400075;
        F16.restaurant = "Farm Cafe";
        FF[13] = (F16);
        Fast_Food F19 = new Fast_Food();
        F19.pincode = 400085;
        F19.restaurant = "Bombay fusion";
        FF[14] = (F19);
        Fast_Food F20 = new Fast_Food();
        F20.pincode = 400085;
        F20.restaurant = "Manas fast food";
        FF[15] = (F20);
        Fast_Food F21 = new Fast_Food();
        F21.pincode = 400095;
        F21.restaurant = "Banjara";
        FF[15] = (F21);

        Scanner t = new Scanner(System.in);

        System.out.println("Available restaurants: ");

        try {
            int i = 1;
            for (int j = 0; j < FF.length; j++) {
                Fast_Food e2 = FF[j];
                if (e2.pincode == pin) {
                    System.out.println(i + "." + e2.restaurant);
                    i++;
                }
            }
        } catch (NullPointerException e) {

        } finally {
            System.out.print("Enter your choice of restaurant: ");
            int option = t.nextInt();
            System.out.println("Please wait till we present the menu.....");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            menu();
        }
    }

    public void menu() {
        Fast_Food[] menu = new Fast_Food[20];
        Fast_Food a = new Fast_Food();
        a.dish = "French Fries";
        a.rate = 30.50;
        menu[0] = a;
        Fast_Food b = new Fast_Food();
        b.dish = "Cheese Burger";
        b.rate = 100;
        menu[1] = b;
        Fast_Food c = new Fast_Food();
        c.dish = "Hot Dog";
        c.rate = 150;
        menu[2] = c;
        Fast_Food d = new Fast_Food();
        d.dish = "Cheese garlic Bread";
        d.rate = 160;
        menu[3] = d;
        Fast_Food e = new Fast_Food();
        e.dish = "Veg Cheese Pizza";
        e.rate = 160;
        menu[4] = e;
        Fast_Food f = new Fast_Food();
        f.dish = "Mexican Pzza";
        f.rate = 180;
        menu[5] = f;
        Fast_Food g = new Fast_Food();
        g.dish = "Pav Bhaji";
        g.rate = 150;
        menu[6] = g;
        Fast_Food h = new Fast_Food();
        h.dish = "Cheese pav bhaji";
        h.rate = 180;
        menu[7] = h;
        Fast_Food i = new Fast_Food();
        i.dish = "Masala pav ";
        i.rate = 60;
        menu[8] = i;
        Fast_Food j = new Fast_Food();
        j.dish = "Masala Dosa ";
        j.rate = 90;
        menu[9] = j;
        Fast_Food k = new Fast_Food();
        k.dish = "Maysoor Masala Dosa ";
        k.rate = 120;
        menu[10] = k;
        Fast_Food l = new Fast_Food();
        l.dish = "Jini Dosa ";
        l.rate = 120;
        menu[11] = l;
        Fast_Food n = new Fast_Food();
        n.dish = "Toast sandwich";
        n.rate = 60;
        menu[12] = n;
        Fast_Food o = new Fast_Food();
        o.dish = "Cheese Toast sandwich";
        o.rate = 80;
        menu[13] = o;
        Fast_Food p = new Fast_Food();
        p.dish = "Tandoori Toast sandwich";
        p.rate = 75;
        menu[14] = p;
        Fast_Food q = new Fast_Food();
        q.dish = "Grill sandwich";
        q.rate = 100;
        menu[15] = q;
        Fast_Food r = new Fast_Food();
        r.dish = "Cheese Grill sandwich";
        r.rate = 120;
        menu[16] = r;

        System.out.println("--------------------------------");
        System.out.println("              MENU            ");
        System.out.println("--------------------------------");
        for (int m = 0; m < 17; m++) {
            System.out.print((m + 1) + "." + menu[m].dish);
            System.out.print(" - " + menu[m].rate);
            System.out.println();
        }
        add(menu);

    }

    public void add(Fast_Food[] indi) {
        Scanner t = new Scanner(System.in);
        System.out.print("Enter no. of the items to add to cart:  ");
        int amount = t.nextInt();
        Fast_Food[] cart = new Fast_Food[10];
        for (int m = 0; m < amount; m++) {
            System.out.println();
            System.out.print("Enter Sr.No of item: ");
            int srno = t.nextInt();
            System.out.print("Quantity: ");
            int quantity = t.nextInt();
            indi[srno - 1].rate = indi[srno - 1].rate * quantity;
            cart[m] = indi[srno - 1];
            System.out.print(cart[m].dish);
            System.out.print(" - " + cart[m].rate);
            System.out.println();
        }
        System.out.println("\nPreparing receipt....");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("------------Receipt------------");
        for (int m = 0; m < amount; m++) {
            System.out.print((m + 1) + "." + cart[m].dish);
            System.out.print(" - " + cart[m].rate);
            System.out.println();
        }
        double sum = 0;
        for (int i = 0; i < amount; i++) {
            sum = sum + cart[i].rate;
        }

        System.out.println("Total:  " + sum);
        System.out.println("-------------------------------");
    }
}
