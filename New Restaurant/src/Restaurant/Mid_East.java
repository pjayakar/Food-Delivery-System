package Restaurant;

import java.util.Scanner;

public class Mid_East extends Customer {
    double rate;
    String dish;

    public Mid_East(String food, double price) {
        food = dish;
        price = rate;
    }

    public Mid_East() {
    }

    public Mid_East(String restaurant, int pincode) {
        super(restaurant, pincode);
    }

    public void ME_data(int pin) {
        Mid_East[] ME = new Mid_East[30];
        Mid_East f = new Mid_East();
        f.restaurant = " Bayroute Cuff Parade";
        f.pincode = 400005;
        ME[0] = (f);
        Mid_East F1 = new Mid_East();
        F1.restaurant = "Flamboyante";
        F1.pincode = 400025;
        ME[1] = (F1);
        Mid_East F4 = new Mid_East();
        F4.pincode = 400015;
        F4.restaurant = "Persian darbaar";
        ME[2] = (F4);
        Mid_East F6 = new Mid_East();
        F6.pincode = 400015;
        F6.restaurant = "Grandmama's Cafe";
        ME[3] = (F6);
        Mid_East F7 = new Mid_East();
        F7.pincode = 400025;
        F7.restaurant = " Tasty point shawarma";
        ME[4] = (F7);
        Mid_East F8 = new Mid_East();
        F7.pincode = 400035;
        F7.restaurant = " Colaba Social";
        ME[5] = (F8);
        Mid_East F9 = new Mid_East();
        F9.pincode = 400045;
        F9.restaurant = "Carter's blue";
        ME[6] = (F9);
        Mid_East F10 = new Mid_East();
        F10.pincode = 400055;
        F10.restaurant = "Hit and run";
        ME[7] = (F10);
        Mid_East F11 = new Mid_East();
        F11.pincode = 400055;
        F11.restaurant = "Versova Social";
        ME[8] = (F11);
        Mid_East F12 = new Mid_East();
        F12.pincode = 400005;
        F12.restaurant = " Yalla Yalla";
        ME[9] = (F12);
        Mid_East F13 = new Mid_East();
        F13.pincode = 400065;
        F13.restaurant = "Flags";
        ME[10] = (F13);
        Mid_East F14 = new Mid_East();
        F14.pincode = 400065;
        F14.restaurant = "Fiasco";
        ME[11] = (F14);
        Mid_East F15 = new Mid_East();
        F15.pincode = 400075;
        F15.restaurant = "D' Crepes";
        ME[12] = (F15);
        Mid_East F16 = new Mid_East();
        F16.pincode = 400075;
        F16.restaurant = "Farm Cafe";
        ME[13] = (F16);
        Mid_East F19 = new Mid_East();
        F19.pincode = 400085;
        F19.restaurant = "Bombay fusion";
        ME[14] = (F19);
        Mid_East F20 = new Mid_East();
        F20.pincode = 400085;
        F20.restaurant = " Red box cafe";
        ME[15] = (F20);
        Mid_East F21 = new Mid_East();
        F21.pincode = 400095;
        F21.restaurant = " Al Fresco";
        ME[15] = (F21);

        Scanner t = new Scanner(System.in);

        System.out.println("Available restaurants: ");

        try {
            int i = 1;
            for (int j = 0; j < ME.length; j++) {
                Mid_East e2 = ME[j];
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
        Mid_East[] menu = new Mid_East[21];
        Mid_East a = new Mid_East();
        a.dish = "Falafel Roll";
        a.rate = 195;
        menu[0] = a;
        Mid_East b = new Mid_East();
        b.dish = "Zaatar Batata Roll";
        b.rate = 215;
        menu[1] = b;
        Mid_East c = new Mid_East();
        c.dish = "Sauted veggies Roll";
        c.rate = 220;
        menu[2] = c;
        Mid_East d = new Mid_East();
        d.dish = "Cottage cheese Shawarma Roll";
        d.rate = 220;
        menu[3] = d;
        Mid_East e = new Mid_East();
        e.dish = "Hommous with Falafel";
        e.rate = 290;
        menu[4] = e;
        Mid_East f = new Mid_East();
        f.dish = "Hommous with Batata Harra";
        f.rate = 300;
        menu[5] = f;
        Mid_East g = new Mid_East();
        g.dish = "Hommous with Cottage Cheese";
        g.rate = 320;
        menu[6] = g;
        Mid_East h = new Mid_East();
        h.dish = "Hommous with grilled Veggies";
        h.rate = 320;
        menu[7] = h;
        Mid_East i = new Mid_East();
        i.dish = "Hummus with Fitr & cheese";
        i.rate = 320;
        menu[8] = i;
        Mid_East j = new Mid_East();
        j.dish = "Falafel Portion";
        j.rate = 240;
        menu[9] = j;
        Mid_East k = new Mid_East();
        k.dish = "Batata Harra Portion";
        k.rate = 230;
        menu[10] = k;
        Mid_East l = new Mid_East();
        l.dish = "Zaatar Batata Portion";
        l.rate = 250;
        menu[11] = l;
        Mid_East n = new Mid_East();
        n.dish = "Cottage cheese Portion";
        n.rate = 260;
        menu[12] = n;
        Mid_East o = new Mid_East();
        o.dish = "Vegetable Fatayer";
        o.rate = 300;
        menu[13] = o;
        Mid_East p = new Mid_East();
        p.dish = "Cheese & Toum Fatayer";
        p.rate = 320;
        menu[14] = p;
        Mid_East q = new Mid_East();
        q.dish = "Zaatar & Feta Cheese Fatayer";
        q.rate = 350;
        menu[15] = q;
        Mid_East r = new Mid_East();
        r.dish = "Zaatar & Cottage cheese Fatayer";
        r.rate = 350;
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

    public void add(Mid_East[] indi) {
        Scanner t = new Scanner(System.in);
        System.out.print("Enter no. of the items to add to cart:  ");
        int amount = t.nextInt();
        Mid_East[] cart = new Mid_East[10];
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
