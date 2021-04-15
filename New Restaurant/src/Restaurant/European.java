package Restaurant;

import java.util.Scanner;
import java.util.Vector;

public class European extends Customer {
    double rate;
    String dish;

    public European(String food, double price) {
        food = dish;
        price = rate;
    }

    public European() {
    }
    public European(String restaurant, int pincode) {
        super(restaurant, pincode);
    }

    public void Euro_data(int pin) {
        European[] Euro = new European[30];
        European f = new European();
        f.restaurant = "Colaba social";
        f.pincode = 400005;
        Euro[0] = (f);
        European F1 = new European();
        F1.restaurant = "Quattro Ristorante";
        F1.pincode = 400025;
        Euro[1] = (F1);
        European F4 = new European();
        F4.pincode = 400015;
        F4.restaurant = "Fountain Sizzlers";
        Euro[2] = (F4);
        European F6 = new European();
        F6.pincode = 400015;
        F6.restaurant = "Grandmama's Cafe";
        Euro[3] = (F6);
        European F7 = new European();
        F7.pincode = 400025;
        F7.restaurant = " The Clearing Cafe";
        Euro[4] = (F7);
        European F8 = new European();
        F8.pincode = 400035;
        F8.restaurant = " Under the banyan tree";
        Euro[5] = (F8);
        European F9 = new European();
        F9.pincode = 400045;
        F9.restaurant = "Rochelle";
        Euro[6] = (F9);
        European F10 = new European();
        F10.pincode = 400055;
        F10.restaurant = "Italy in a Box";
        Euro[7] = (F10);
        European F11 = new European();
        F11.pincode = 400055;
        F11.restaurant = "Versova Social";
        Euro[8] = (F11);
        European F12 = new European();
        F12.pincode = 400005;
        F12.restaurant = " Pot pourri";
        Euro[9] = (F12);
        European F13 = new European();
        F13.pincode = 400065;
        F13.restaurant = "Flags";
        Euro[10] = (F13);
        European F14 = new European();
        F14.pincode = 400065;
        F14.restaurant = "Fiasco";
        Euro[11] = (F14);
        European F15 = new European();
        F15.pincode = 400075;
        F15.restaurant = "D' Crepes";
        Euro[12] = (F15);
        European F16 = new European();
        F16.pincode = 400075;
        F16.restaurant = "Farm Cafe";
        Euro[13] = (F16);
        European F19 = new European();
        F19.pincode = 400085;
        F19.restaurant = "Bombay fusion";
        Euro[14] = (F19);
        European F20 = new European();
        F20.pincode = 400085;
        F20.restaurant = " Red box cafe";
        Euro[15] = (F20);
        European F21 = new European();
        F21.pincode = 400095;
        F21.restaurant = " Al Fresco";
        Euro[15] = (F21);

        Scanner t = new Scanner(System.in);

        System.out.println("Available restaurants: ");

        try {
            int i = 1;
            for (int j = 0; j < Euro.length; j++) {
                European e2 = Euro[j];
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
        European[] menu = new European[21];
        European a = new European();
        a.dish = "French lentil salad";
        a.rate = 260;
        menu[0] = a;
        European b = new European();
        b.dish = "Charred Spanish salad";
        b.rate = 240;
        menu[1] = b;
        European c = new European();
        c.dish = "Itallian Beetroot and pumkinsalad";
        c.rate = 240;
        menu[2] = c;
        European d = new European();
        d.dish = "Classic English salad";
        d.rate = 180;
        menu[3] = d;
        European e = new European();
        e.dish = "Tomato & basil soup";
        e.rate = 220;
        menu[4] = e;
        European f = new European();
        f.dish = "Classic minestone soup";
        f.rate = 240;
        menu[5] = f;
        European g = new European();
        g.dish = "Chilli Mushroom & Potato soup";
        g.rate = 220;
        menu[6] = g;
        European h = new European();
        h.dish = "Oven Roasted Paneer with Jalepeno";
        h.rate = 220;
        menu[7] = h;
        European i = new European();
        i.dish = "Mac & cheese croqutte with mustard mayo ";
        i.rate = 180;
        menu[8] = i;
        European j = new European();
        j.dish = "Onion Tomato Bruchetta";
        j.rate = 200;
        menu[9] = j;
        European k = new European();
        k.dish = "Cheese Nachos";
        k.rate = 240;
        menu[10] = k;
        European l = new European();
        l.dish = "Italian Gnocci";
        l.rate = 340;
        menu[11] = l;
        European n = new European();
        n.dish = "Italian Ravioli";
        n.rate = 360;
        menu[12] = n;
        European o = new European();
        o.dish = "Italian Wild Mushroom Risotto";
        o.rate = 390;
        menu[13] = o;
        European p = new European();
        p.dish = "Polish Perogi";
        p.rate = 330;
        menu[14] = p;
        European q = new European();
        q.dish = "English Leek Pie";
        q.rate = 350;
        menu[15] = q;
        European r = new European();
        r.dish = "French Garlic Stone baked Pizza";
        r.rate = 240;
        menu[16] = r;
        European s = new European();
        s.dish = "French Onion Stone baked Pizza";
        s.rate = 330;
        menu[17] = s;
        European t = new European();
        t.dish = "Italian classic Margerita Stone baked Pizza";
        t.rate = 260;
        menu[18] = t;
        European u = new European();
        u.dish = "Greek Feta Stone baked Pizza";
        u.rate = 400;
        menu[19] = u;
        European v = new European();
        v.dish = "Spanish Pineapple Stone baked Pizza";
        v.rate = 360;
        menu[20] = v;

        System.out.println("--------------------------------");
        System.out.println("              MENU            ");
        System.out.println("--------------------------------");
        for (int m = 0; m < 21; m++) {
            System.out.print((m + 1) + "." + menu[m].dish);
            System.out.print(" - " + menu[m].rate);
            System.out.println();
        }
        add(menu);
    }

    public void add(European[] indi) {
        Scanner t = new Scanner(System.in);
        System.out.print("Enter no. of the items to add to cart:  ");
        int amount = t.nextInt();
        European[] cart = new European[10];
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
