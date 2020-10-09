package HW3;

import java.util.ArrayList;

public class Journals extends OnlineShop {
    int bookCntr = 5, magazineCntr = 5, newsPaperCntr = 5;

    @Override
    public void menu() {
        System.out.println("select number ");
        System.out.println("name\t\t\tprice\tnumber");
        System.out.println("1.book\t\t\t$5\t\t" + bookCntr);
        System.out.println("2.magazine\t\t$14\t\t" +magazineCntr );
        System.out.println("3.newspaper\t\t$13\t\t" + newsPaperCntr);
    }

    @Override
    public boolean applianceExist(int journal, int number) {
        if (super.cart.size() < 5) {
            switch (journal) {
                case 1:

                    for (int i = 0; i < number; i++) {
                        appliances.remove("book");
                        bookCntr--;
                        super.cart.add("book");
                        setTotal(getTotal() + 5);
                    }
                    purchase.add("book");
                    return true;

                case 2:

                    for (int i = 0; i < number; i++) {
                        appliances.remove("magazine");
                        magazineCntr--;
                        super.cart.add("magazine");
                        setTotal(getTotal() + 14);
                    }
                    purchase.add("magazine");
                    return true;
                case 3:

                    for (int i = 0; i < number; i++) {
                        super.cart.add("newsPaper");
                        appliances.remove("newsPaper");
                        newsPaperCntr--;
                        setTotal(getTotal() + 13);
                    }
                    purchase.add("newsPaper");

                    return true;

            }


        }
        return false;
    }

    @Override
    public void wareHouse() {
        for (int i = 0; i < 5; i++) {
            appliances.add("book");

        }
        for (int i = 0; i < 5; i++) {
            appliances.add("magazine");

        }
        for (int i = 0; i < 5; i++) {
            appliances.add("newsPaper");

        }
    }

    @Override
    public void purchaseInvoice() {
        for (int i = 0; i < purchase.size(); i++) {
            if (cart.get(i).equals("book"))
                System.out.println(cart.get(i) + "\t\t" + (5 - bookCntr));
            if (cart.get(i).equals("magazine"))
                System.out.println(cart.get(i) + "\t" + (5 - magazineCntr));
            if (cart.get(i).equals("newsPaper"))
                System.out.println(cart.get(i) + "\t" + (5 - newsPaperCntr));

        }

    }

    @Override
    public boolean remove(int journals, int number,int numOfRemove) {
        if (super.cart.size() <= 5) {
            switch (journals) {
                case 1:

                    for (int i = 0; i < numOfRemove; i++) {
                        appliances.add("book");
                        bookCntr++;
                        super.cart.remove("book");
                        setTotal(getTotal() - 5);
                    }
                    if (number == numOfRemove){
                        purchase.remove("book");
                    }

                    return true;

                case 2:

                    for (int i = 0; i < numOfRemove; i++) {
                        super.cart.remove("magazine");
                        appliances.add("magazine");
                        magazineCntr++;
                        setTotal(getTotal() - 14);
                    }
                    if (number == numOfRemove){
                        purchase.remove("magazine");
                    }

                    return true;
                case 3:

                    for (int i = 0; i < numOfRemove; i++) {
                        super.cart.remove("newsPaper");
                        appliances.add("newsPaper");
                        newsPaperCntr++;
                        setTotal(getTotal() - 13);
                    }
                    if (number == numOfRemove){
                        purchase.remove("newsPaper");
                    }

                    return true;
            }

        }

        return false;

    }
    @Override
    public  void managerAdd(int device, int number){
        switch (device) {
            case 1:
                for (int i = 0; i < number; i++) {
                    appliances.add("book");
                    bookCntr++;
                }
                break;
            case 2:
                for (int i = 0; i < number; i++) {
                    appliances.add("magazine");
                    magazineCntr++;
                }
                break;
            case 3:
                for (int i = 0; i < number; i++) {
                    appliances.add("newsPaper");
                    newsPaperCntr++;
                }
                break;

        }
    }


    public  void managerRemove(int device, int numOfRemove){
        switch (device) {
            case 1:

                for (int i = 0; i < numOfRemove; i++) {
                    appliances.remove("book");
                    bookCntr--;
                }
                break;
            case 2:
                for (int i = 0; i < numOfRemove; i++) {
                    appliances.remove("magazine");
                    magazineCntr--;
                }
                break;

            case 3:
                for (int i = 0; i < numOfRemove; i++) {
                    appliances.remove("newsPaper");
                    newsPaperCntr--;
                }
                break;

        }
    }


}

