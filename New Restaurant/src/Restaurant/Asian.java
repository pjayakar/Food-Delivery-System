package Restaurant;

import java.util.Scanner;

public class Asian extends Customer {
    double rate;
    String dish;

    public Asian(String food, double price) {
        food = dish;
        price = rate;
    }

    public Asian() {
    }

    public Asian(String restaurant, int pincode) {
        super(restaurant, pincode);
    }

    public void Asi_data(int pin) {
        Asian[] Asi = new Asian[30];
        Asian f = new Asian();
        f.restaurant = "Colaba social";
        f.pincode = 400005;
        Asi[0] = (f);
        Asian F1 = new Asian();
        F1.restaurant = " China gate";
        F1.pincode = 400025;
        Asi[1] = (F1);
        Asian F4 = new Asian();
        F4.pincode = 400015;
        F4.restaurant = " China gate";
        Asi[2] = (F4);
        Asian F6 = new Asian();
        F6.pincode = 400015;
        F6.restaurant = "Grandmama's Cafe";
        Asi[3] = (F6);
        Asian F7 = new Asian();
        F7.pincode = 400025;
        F7.restaurant = " Chinese palace";
        Asi[4] = (F7);
        Asian F8 = new Asian();
        F8.pincode = 400035;
        F8.restaurant = "Charcoal Eats Express";
        Asi[5] = (F8);
        Asian F9 = new Asian();
        F9.pincode = 400045;
        F9.restaurant = " Pa Pa Ya";
        Asi[6] = (F9);
        Asian F10 = new Asian();
        F10.pincode = 400055;
        F10.restaurant = " Chinese palace";
        Asi[7] = (F10);
        Asian F11 = new Asian();
        F11.pincode = 400055;
        F11.restaurant = "Versova Social";
        Asi[8] = (F11);
        Asian F12 = new Asian();
        F12.pincode = 400065;
        F12.restaurant = "McDonald’s";
        Asi[9] = (F12);
        Asian F13 = new Asian();
        F13.pincode = 400065;
        F13.restaurant = "Flags";
        Asi[10] = (F13);
        Asian F14 = new Asian();
        F14.pincode = 400065;
        F14.restaurant = "Fiasco";
        Asi[11] = (F14);
        Asian F15 = new Asian();
        F15.pincode = 400075;
        F15.restaurant = "D' Crepes";
        Asi[12] = (F15);
        Asian F16 = new Asian();
        F16.pincode = 400075;
        F16.restaurant = "Farm Cafe";
        Asi[13] = (F16);
        Asian F19 = new Asian();
        F19.pincode = 400085;
        F19.restaurant = "Bombay fusion";
        Asi[14] = (F19);
        Asian F20 = new Asian();
        F20.pincode = 400085;
        F20.restaurant = " Pa Pa Ya";
        Asi[15] = (F20);
        Asian F21 = new Asian();
        F21.pincode = 400095;
        F21.restaurant = "Chef Ping";
        Asi[15] = (F21);

        Scanner t = new Scanner(System.in);

        System.out.println("Available restaurants: ");

        try {
            int i = 1;
            for (int j = 0; j < Asi.length; j++) {
                Asian e2 = Asi[j];
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
        Asian[] menu = new Asian[21];
        Asian a = new Asian();
        a.dish = "Tom Yum Soup";
        a.rate = 260;
        menu[0] = a;
        Asian b = new Asian();
        b.dish = "Bean Curd Clear Soup";
        b.rate = 240;
        menu[1] = b;
        Asian c = new Asian();
        c.dish = "Lemmon Corriender Soup";
        c.rate = 240;
        menu[2] = c;
        Asian d = new Asian();
        d.dish = "Talumein Soup";
        d.rate = 250;
        menu[3] = d;
        Asian e = new Asian();
        e.dish = "Hot Pot Soup";
        e.rate = 350;
        menu[4] = e;
        Asian f = new Asian();
        f.dish = "Crispy Thread Paneer";
        f.rate = 320;
        menu[5] = f;
        Asian g = new Asian();
        g.dish = "Crispy Spinach Paneer";
        g.rate = 320;
        menu[6] = g;
        Asian h = new Asian();
        h.dish = "Veg Spring Roll";
        h.rate = 300;
        menu[7] = h;
        Asian i = new Asian();
        i.dish = "Crispy Potato";
        i.rate = 320;
        menu[8] = i;
        Asian j = new Asian();
        j.dish = "Kung Pao Paneer";
        j.rate = 390;
        menu[9] = j;
        Asian k = new Asian();
        k.dish = "Paneer Dual Sauce";
        k.rate = 405;
        menu[10] = k;
        Asian l = new Asian();
        l.dish = "Mandarian Bean Curd";
        l.rate = 385;
        menu[11] = l;
        Asian n = new Asian();
        n.dish = "Veg Taro Nest";
        n.rate = 380;
        menu[12] = n;
        Asian o = new Asian();
        o.dish = "Okra Potato Chilli Bean";
        o.rate = 380;
        menu[13] = o;
        Asian p = new Asian();
        p.dish = "Veg Hakka Noddles";
        p.rate = 310;
        menu[14] = p;
        Asian q = new Asian();
        q.dish = "Veg Pot Rice";
        q.rate = 380;
        menu[15] = q;
        Asian r = new Asian();
        r.dish = "Burnt Garlic ried Rice";
        r.rate = 330;
        menu[16] = r;
        Asian s = new Asian();
        s.dish = "Tripple Schezwann Rice and Noddles";
        s.rate = 400;
        menu[17] = s;

        System.out.println("--------------------------------");
        System.out.println("              MENU            ");
        System.out.println("--------------------------------");
        for (int m = 0; m < 18; m++) {
            System.out.print((m + 1) + "." + menu[m].dish);
            System.out.print(" - " + menu[m].rate);
            System.out.println();
        }
        add(menu);
    }

    public void add(Asian[] indi) {
        Scanner t = new Scanner(System.in);
        System.out.print("Enter no. of the items to add to cart:  ");
        int amount = t.nextInt();
        Asian[] cart = new Asian[10];
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
