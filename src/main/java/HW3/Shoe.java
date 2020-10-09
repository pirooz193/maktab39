package HW3;

import java.util.ArrayList;

public class Shoe extends OnlineShop {
    int sportCntr = 5, everyDayCntr = 5, formalCntr = 5;


    @Override
    public void menu() {

        System.out.println("select number ");
        System.out.println("name\t\t\tprice\tnumber");
        System.out.println("1.sport\t\t\t$25\t\t" + sportCntr);
        System.out.println("2.formal\t\t$69\t\t" + formalCntr);
        System.out.println("3.everyday\t\t$129\t" + everyDayCntr);
    }

    @Override
    public boolean applianceExist(int shoe, int number) {
        if (super.cart.size() < 5) {
            switch (shoe) {
                case 1:

                    for (int i = 0; i < number; i++) {
                        appliances.remove("sport");
                        sportCntr--;
                        super.cart.add("sport");
                        setTotal(getTotal() + 25);
                    }
                    purchase.add("sport");
                    return true;

                case 2:

                    for (int i = 0; i < number; i++) {
                        super.cart.add("formal");
                        appliances.remove("formal");
                        formalCntr--;
                        setTotal(getTotal() + 69);
                    }
                    purchase.add("formal");

                    return true;
                case 3:

                    for (int i = 0; i < number; i++) {
                        super.cart.add("everyDay");
                        appliances.remove("everyDay");
                        everyDayCntr--;
                        setTotal(getTotal() + 129);
                    }
                    purchase.add("everyDay");

                    return true;


            }

        }

        return false;


    }

    @Override
    public void wareHouse() {
        for (int i = 0; i < 5; i++) {
            appliances.add("sport");

        }
        for (int i = 0; i < 5; i++) {
            appliances.add("formal");

        }
        for (int i = 0; i < 5; i++) {
            appliances.add("everyDay");

        }

    }

    @Override
    public void purchaseInvoice() {
        for (int i = 0; i < purchase.size(); i++) {
            if (cart.get(i).equals("sport"))
                System.out.println(cart.get(i) + "\t\t" + (5 - sportCntr));
            else if (cart.get(i).equals("formal"))
                System.out.println(cart.get(i) + "\t\t" + (5 - formalCntr));
            else if (cart.get(i).equals("everyDay"))
                System.out.println(cart.get(i) + "\t" + (5 - everyDayCntr));

        }

    }

    @Override
    public boolean remove(int shoe, int number, int numOfRemove) {
        if (super.cart.size() <= 5) {
            switch (shoe) {
                case 1:

                    for (int i = 0; i < numOfRemove; i++) {
                        appliances.add("sport");
                        sportCntr++;
                        super.cart.remove("sport");
                        setTotal(getTotal() - 25);
                    }
                    if (number == numOfRemove) {
                        purchase.remove("sport");
                    }

                    return true;

                case 2:

                    for (int i = 0; i < numOfRemove; i++) {
                        super.cart.remove("formal");
                        appliances.add("formal");
                        formalCntr++;
                        setTotal(getTotal() - 69);
                    }
                    if (number == numOfRemove) {
                        purchase.remove("formal");
                    }

                    return true;
                case 3:

                    for (int i = 0; i < numOfRemove; i++) {
                        super.cart.remove("everyDay");
                        appliances.add("everyDay");
                        everyDayCntr++;
                        setTotal(getTotal() - 129);
                    }
                    if (number == numOfRemove) {
                        purchase.remove("everyDay");
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
                    appliances.add("sport");
                    sportCntr++;
                }
                break;
            case 2:
                for (int i = 0; i < number; i++) {
                    appliances.add("formal");
                    formalCntr++;
                }
                break;
            case 3:
                for (int i = 0; i < number; i++) {
                    appliances.add("everyDay");
                    everyDayCntr++;
                }
                break;

        }
    }

    @Override
    public void managerRemove(int device, int numOfRemove) {

        switch (device) {
            case 1:

                for (int i = 0; i < numOfRemove; i++) {
                    appliances.remove("sport");
                    sportCntr--;
                }
                break;
            case 2:
                for (int i = 0; i < numOfRemove; i++) {
                    appliances.remove("formal");
                    formalCntr--;
                }
                break;

            case 3:
                for (int i = 0; i < numOfRemove; i++) {
                    appliances.remove("everyDay");
                    everyDayCntr--;
                }
                break;

        }

    }


}
