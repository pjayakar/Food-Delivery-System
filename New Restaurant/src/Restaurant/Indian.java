package Restaurant;

import java.util.Scanner;

public class Indian extends Customer {
    double rate;
    String dish;

    public Indian() {
        super();
    }

    public Indian(String restaurant, int pincode)
    { super(restaurant,pincode);}
    public Indian(String food, double price) {
        food = dish;
        price = rate;
    }

    public void Ind_data(int pin) {
        Indian[] Ind = new Indian[30];
        Indian f = new Indian();
        f.restaurant = "Jimmy boy";
        f.pincode = 400005;
        Ind[0] = (f);
        Indian F1 = new Indian();
        F1.restaurant = "India";
        F1.pincode = 400005;
        Ind[1] = (F1);
        Indian F4 = new Indian();
        F4.pincode = 400015;
        F4.restaurant = "Dum O Biryania";
        Ind[2] = (F4);
        Indian F6 = new Indian();
        F6.pincode = 400015;
        F6.restaurant = "Grandmama's Cafe";
        Ind[3] = (F6);
        Indian F7 = new Indian();
        F7.pincode = 400025;
        F7.restaurant = "The Camp";
        Ind[4] = (F7);
        Indian F8 = new Indian();
        F7.pincode = 400035;
        F7.restaurant = "Nityanand’s Cafe";
        Ind[5] = (F8);
        Indian F9 = new Indian();
        F9.pincode = 400045;
        F9.restaurant = "Tandoor Palace";
        Ind[6] = (F9);
        Indian F10 = new Indian();
        F10.pincode = 400055;
        F10.restaurant = "The Tanjore Tiffin";
        Ind[7] = (F10);
        Indian F11 = new Indian();
        F11.pincode = 400055;
        F11.restaurant = "Versova Social";
        Ind[8] = (F11);
        Indian F12 = new Indian();
        F12.pincode = 400065;
        F12.restaurant = "Unplugged Food Studio";
        Ind[9] = (F12);
        Indian F13 = new Indian();
        F13.pincode = 400065;
        F13.restaurant = "Flags";
        Ind[10] = (F13);
        Indian F14 = new Indian();
        F14.pincode = 400065;
        F14.restaurant = "Fiasco";
        Ind[11] = (F14);
        Indian F15 = new Indian();
        F15.pincode = 400075;
        F15.restaurant = "D' Crepes";
        Ind[12] = (F15);
        Indian F16 = new Indian();
        F16.pincode = 400075;
        F16.restaurant = "Farm Cafe";
        Ind[13] = (F16);
        Indian F19 = new Indian();
        F19.pincode = 400085;
        F19.restaurant = "Rasoi";
        Ind[14] = F19;
        Indian F20 = new Indian();
        F20.pincode = 400085;
        F20.restaurant = "Bombay fusion";
        Ind[15] = F20;
        Indian F21 = new Indian();
        F21.pincode = 400095;
        F21.restaurant = "MIDC";
        Ind[16] = F21;
        Indian F22 = new Indian();
        F22.pincode = 400095;
        F22.restaurant = "Banjara";
        Ind[17] = F22;
        Scanner t = new Scanner(System.in);

        System.out.println("Available restaurants: ");

        try {
            int i = 1;
            for (int j = 0; j < Ind.length; j++) {
                Indian e2 = Ind[j];
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
        Indian[] menu = new Indian[21];
        Indian a = new Indian();
        a.dish = "Tomato soup";
        a.rate = 180;
        menu[0] = a;
        Indian b = new Indian();
        b.dish = "Manchow soup";
        b.rate = 240;
        menu[1] = b;
        Indian c = new Indian();
        c.dish = "Hot & Sour soup";
        c.rate = 240;
        menu[2] = c;
        Indian d = new Indian();
        d.dish = "Palak soup";
        d.rate = 160;
        menu[3] = d;
        Indian e = new Indian();
        e.dish = "Paneer Tikka masala";
        e.rate = 250;
        menu[4] = e;
        Indian f = new Indian();
        f.dish = "Paneer Handi";
        f.rate = 260;
        menu[5] = f;
        Indian g = new Indian();
        g.dish = "Paneer kolhapuri";
        g.rate = 260;
        menu[6] = g;
        Indian h = new Indian();
        h.dish = "Paneer Butter masal";
        h.rate = 250;
        menu[7] = h;
        Indian i = new Indian();
        i.dish = "Cheese Butter masala ";
        i.rate = 260;
        menu[8] = i;
        Indian j = new Indian();
        j.dish = "Paneer Tawa ";
        j.rate = 250;
        menu[9] = j;
        Indian k = new Indian();
        k.dish = "Veg special";
        k.rate = 300;
        menu[10] = k;
        Indian l = new Indian();
        l.dish = "Roti/Butter Roti";
        l.rate = 40;
        menu[11] = l;
        Indian n = new Indian();
        n.dish = "Naan/Butter Naan";
        n.rate = 60;
        menu[12] = n;
        Indian o = new Indian();
        o.dish = "Cheese Naan";
        o.rate = 90;
        menu[13] = o;
        Indian p = new Indian();
        p.dish = "Dal fry";
        p.rate = 230;
        menu[14] = p;
        Indian q = new Indian();
        q.dish = "Dal tadka";
        q.rate = 250;
        menu[15] = q;
        Indian r = new Indian();
        r.dish = "Dal Makhni";
        r.rate = 260;
        menu[16] = r;
        Indian s = new Indian();
        s.dish = "Steam rice";
        s.rate = 200;
        menu[17] = s;
        Indian t = new Indian();
        t.dish = "Jeera rice";
        t.rate = 220;
        menu[18] = t;
        Indian u = new Indian();
        u.dish = "Biryaani";
        u.rate = 260;
        menu[19] = u;
        Indian v = new Indian();
        v.dish = "Tawa Pulav";
        v.rate = 260;
        menu[20] = v;
        System.out.println("--------------------------------");
        System.out.println("              MENU              ");
        System.out.println("--------------------------------");
        for (int m = 0; m < 21; m++) {
            System.out.print((m + 1) + "." + menu[m].dish);
            System.out.print(" - " + menu[m].rate);
            System.out.println();
        }
        add(menu);
    }

    public void add(Indian[] indi) {
        Scanner t = new Scanner(System.in);
        System.out.print("Enter no. of the items to add to cart:  ");
        int amount = t.nextInt();
        Indian[] cart = new Indian[10];
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
