package HW3;

import java.util.ArrayList;
import java.util.Scanner;


public class ElectricalAppliances extends OnlineShop {
    ArrayList<String> applianceOfElectric = new ArrayList<>();
    ArrayList<Integer> numOfAppliance = new ArrayList<>();

    int tvCntr = 5, radioCntr = 5, phoneCntr = 5, laptopCntr = 5;

    @Override
    public void menu() {
        System.out.println("select number ");
        System.out.println("name\t\tprice\tnumber");
        System.out.println("1.tv\t\t139$\t" + tvCntr);
        System.out.println("2.radio\t\t75$\t\t" + radioCntr);
        System.out.println("3.phone\t\t68$\t\t" + phoneCntr);
        System.out.println("4.laptop\t200$\t" + laptopCntr);
    }

    @Override
    public boolean applianceExist(int device, int number) {
        if (super.cart.size() <= 5) {
            switch (device) {
                case 1:

                    for (int i = 0; i < number; i++) {
                        appliances.remove("tv");
                        tvCntr--;
                        super.cart.add("tv");
                        setTotal(getTotal() + 139);
                    }
                    purchase.add("tv");
                    return true;

                case 2:

                    for (int i = 0; i < number; i++) {
                        super.cart.add("radio");
                        appliances.remove("radio");
                        radioCntr--;
                        setTotal(getTotal() + 75);
                    }
                    purchase.add("radio");
                    return true;
                case 3:

                    for (int i = 0; i < number; i++) {
                        super.cart.add("phone");
                        appliances.remove("phone");
                        phoneCntr--;
                        setTotal(getTotal() + 68);
                    }
                    purchase.add("phone");
                    return true;

                case 4:

                    for (int i = 0; i < number; i++) {
                        super.cart.add("laptop");
                        appliances.remove("laptop");
                        laptopCntr--;
                        setTotal(getTotal() + 200);
                    }
                    purchase.add("laptop");
                    return true;
            }
        }
        return false;
    }

    @Override
    public void wareHouse() {

        for (int i = 0; i < tvCntr; i++) {
            appliances.add("tv");

        }
        for (int i = 0; i < radioCntr; i++) {
            appliances.add("radio");
        }
        for (int i = 0; i < phoneCntr; i++) {
            appliances.add("phone");

        }
        for (int i = 0; i < laptopCntr; i++) {
            appliances.add("laptop");

        }

    }

    @Override
    public void purchaseInvoice() {
        for (int i = 0; i < purchase.size(); i++) {
            if (cart.get(i).equals("tv"))
                System.out.println(cart.get(i) + "\t\t\t" + (5 - tvCntr));
            else if (cart.get(i).equals("radio"))
                System.out.println(cart.get(i) + "\t\t" + (5 - radioCntr));
            else if (cart.get(i).equals("phone"))
                System.out.println(cart.get(i) + "\t\t" + (5 - phoneCntr));
            else if (cart.get(i).equals("laptop"))
                System.out.println(cart.get(i) + "\t\t" + (5 - laptopCntr));
        }
    }

    @Override
    public boolean remove(int device, int number, int numOfRemove) {
        if (super.cart.size() <= 5) {
            switch (device) {
                case 1:
                    for (int i = 0; i < numOfRemove; i++) {
                        appliances.add("tv");
                        tvCntr++;
                        super.cart.remove("tv");
                        setTotal(getTotal() - 139);
                    }
                    if (number == numOfRemove) {
                        purchase.remove("tv");
                    }
                    return true;
                case 2:
                    for (int i = 0; i < numOfRemove; i++) {
                        super.cart.remove("radio");
                        appliances.add("radio");
                        radioCntr++;
                        setTotal(getTotal() - 75);
                    }
                    if (number == numOfRemove) {
                        purchase.remove("radio");
                    }
                    return true;
                case 3:
                    for (int i = 0; i < numOfRemove; i++) {
                        super.cart.remove("phone");
                        appliances.add("phone");
                        phoneCntr++;
                        setTotal(getTotal() - 68);
                    }
                    if (number == numOfRemove) {
                        purchase.remove("phone");
                    }
                    return true;
                case 4:
                    for (int i = 0; i < number; i++) {
                        super.cart.remove("laptop");
                        appliances.add("laptop");
                        laptopCntr++;
                        setTotal(getTotal() - 200);
                    }
                    if (number == numOfRemove) {
                        purchase.remove("laptop");
                    }
                    return true;
            }
        }
        return false;
    }

    @Override
    public void managerAdd(int device, int number) {

        switch (device) {
            case 1:
                for (int i = 0; i < number; i++) {
                    appliances.add("tv");
                    tvCntr++;
                }
                break;
            case 2:
                for (int i = 0; i < number; i++) {
                    appliances.add("radio");
                    radioCntr++;
                }
                break;
            case 3:
                for (int i = 0; i < number; i++) {
                    appliances.add("phone");
                    phoneCntr++;
                }
                break;
            case 4:
                for (int i = 0; i < number; i++) {
                    appliances.add("laptop");
                    laptopCntr++;
                }
                break;
        }
    }

    @Override
    public void managerRemove(int device, int numOfRemove) {
        if (super.cart.size() <= 5) {
//            wareHouse();
            switch (device) {
                case 1:

                    for (int i = 0; i < numOfRemove; i++) {
                        appliances.remove("tv");
                        tvCntr--;
                    }
                    break;
                case 2:
                    for (int i = 0; i < numOfRemove; i++) {
                        appliances.remove("radio");
                        radioCntr--;
                    }
                    break;

                case 3:
                    for (int i = 0; i < numOfRemove; i++) {
                        appliances.remove("phone");
                        phoneCntr--;
                    }
                    break;
                case 4:
                    for (int i = 0; i < numOfRemove; i++) {
                        appliances.remove("laptop");
                        laptopCntr--;
                    }
                    break;
            }
        }
    }
}
