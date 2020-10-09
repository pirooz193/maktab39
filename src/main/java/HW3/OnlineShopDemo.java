package HW3;

import java.util.Scanner;

public class OnlineShopDemo {
    static boolean managerChoice = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElectricalAppliances electricalAppliances = new ElectricalAppliances();
        Journals journals = new Journals();
        Shoe shoe = new Shoe();
        ManagerProfile managerProfile = new ManagerProfile();
        UserProfile userProfile = new UserProfile();
        managerProfile.setName("pirooz");
        managerProfile.setPassWord("1379");
        System.out.println("HI\nWANT TO ENTER AS A :(enter it's number )\n1.MANAGER\n2.CUSTOMER");
        int kindOfMember = scanner.nextInt();
        wareInfo(electricalAppliances,shoe,journals);
        if (kindOfMember == 1) {
            managerWork(managerProfile, electricalAppliances, shoe, journals, userProfile);
        }
        welcome();
        boolean again = true;
//        userProfile.profile();
        while (again) {
            System.out.println("*** you can buy only 5 goods *** ");
            int flag = 0, choice, device, shoes, journal, number, remove = 0;
            while (flag == 0) {
                menu();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        electricalAppliances.menu();
                        System.out.printf(".device number :");
                        device = scanner.nextInt();
                        System.out.printf(".num of devices you want :");
                        number = scanner.nextInt();
                        electricalAppliances.applianceExist(device, number);
                        electricalAppliances.remove(device, number, remove());
                        shoe.purchaseInvoice();
                        journals.purchaseInvoice();
                        break;
                    case 2:
                        shoe.menu();
                        System.out.printf(".shoe number :");
                        shoes = scanner.nextInt();
                        System.out.printf(".num of shoes you want :");
                        number = scanner.nextInt();
                        shoe.applianceExist(shoes, number);
                        shoe.remove(shoes, number, remove());
                        shoe.purchaseInvoice();
                        journals.purchaseInvoice();
                        break;
                    case 3:
                        journals.menu();
                        System.out.printf(".journal number :");
                        journal = scanner.nextInt();
                        System.out.printf(".num of journals you want :");
                        number = scanner.nextInt();
                        journals.applianceExist(journal, number);
                        journals.remove(journal, number, remove());
                        electricalAppliances.purchaseInvoice();
                        shoe.purchaseInvoice();
                        journals.purchaseInvoice();
                        break;
                    case 0:
                        flag = 1;
                        break;

                }
                if (electricalAppliances.cart.size() + shoe.cart.size() + journals.cart.size() == 5) {
                    flag = 1;
                }

            }
            purchaseMenu(electricalAppliances, shoe, journals, userProfile);
            System.out.println("\nthank you that choose us");
            System.out.println("\nDo You Want To Continiue Buying?(ENTER NUMBER)");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.println("3.I'm Manager");
            String choice1 = scanner.next();
            if (choice1.equals("2")) {
                again = false;
                System.out.println("\nthank you that choose us");
                System.out.println("GOODBYE " + userProfile.getName());

            } else if (choice1.equals("1")) {
                electricalAppliances.setTotal(0);
                shoe.setTotal(0);
                journals.setTotal(0);
                electricalAppliances.zeroing();
                shoe.zeroing();
                journals.zeroing();
            } else if (choice1.equals("3")) {
                managerChoice = true;
                managerWork(managerProfile, electricalAppliances, shoe, journals, userProfile);
                break;

            }

        }


    }

    public static void welcome() {
        System.out.flush();
        System.out.println("... * WELCOME * ...");
        System.out.println("\n|Please Register|");
    }

    public static void menu() {
        System.out.println("THE LIST ( select it's number ) :");
        System.out.println("1.ElectricalAppliances");
        System.out.println("2.Shoe");
        System.out.println("3.Journals");
    }

    public static void managerMenu() {
        System.out.println("WHAT DO ROU WANT TO DO ?");
        System.out.println("1.add an appliance");
        System.out.println("2.remove an appliance");
    }

    public static int remove() {
        Scanner scanner = new Scanner(System.in);
        int remove, device, numOfRemove = 0;
        System.out.println("Do You Want To Remove AnyThing?");
        System.out.println("1.Yes\n2.No");
        remove = scanner.nextInt();
        if (remove == 1) {
            System.out.println("witch do you want to remove?:");
            device = scanner.nextInt();
            System.out.println("how many? ");
            numOfRemove = scanner.nextInt();
            return numOfRemove;
        }
        return 0;
    }

    public static void purchaseMenu(ElectricalAppliances electricalAppliances, Shoe shoe, Journals journals, UserProfile userProfile) {
        System.out.println("\n====================");
        System.out.println("PURCHASE  INVOICE");
        System.out.println("====================");
        System.out.println(userProfile.getName()+":");
        System.out.println("Name\t\tnumber");
        electricalAppliances.purchaseInvoice();
        shoe.purchaseInvoice();
        journals.purchaseInvoice();
        System.out.println("---------------------");
        System.out.println("TOTAL : " + (electricalAppliances.getTotal() + shoe.getTotal() + journals.getTotal()));
    }

    public static void managerWork(ManagerProfile managerProfile, ElectricalAppliances electricalAppliances, Shoe shoe, Journals journals, UserProfile userProfile) {
        Scanner scanner = new Scanner(System.in);
        boolean felag = true, manage = true;
        while (manage) {
            System.out.println(".Enter Your Username :");
            String name;
            name = scanner.next();
            System.out.println(".Enter Your Password :");
            String passWord = scanner.next();
            if (!managerProfile.getPassWord().equals(passWord) || !managerProfile.getName().equalsIgnoreCase(name)) {
                System.out.println(".Wrong Username Or Password!\n");
                continue;
            }

            while (felag) {//Manager
                int device, number;
                managerMenu();
                if (managerChoice == true) System.out.println("3.See purchase of customer");
                int addOrRemove = scanner.nextInt(), type;
                if (addOrRemove == 1) {
                    menu();
                    type = scanner.nextInt();
                    switch (type) {
                        case 1:
                            electricalAppliances.menu();
                            System.out.printf(".device number :");
                            device = scanner.nextInt();
                            System.out.printf(".num of devices you want :");
                            number = scanner.nextInt();
                            electricalAppliances.managerAdd(device, number);
                            break;
                        case 2:
                            shoe.menu();
                            System.out.printf(".device number :");
                            device = scanner.nextInt();
                            System.out.printf(".num of devices you want :");
                            number = scanner.nextInt();
                            shoe.managerAdd(device, number);
                            break;
                        case 3:
                            journals.menu();
                            System.out.printf(".device number :");
                            device = scanner.nextInt();
                            System.out.printf(".num of devices you want :");
                            number = scanner.nextInt();
                            journals.managerAdd(device, number);
                            break;
                    }
                } else if (addOrRemove == 2) {
                    menu();
                    type = scanner.nextInt();
                    switch (type) {
                        case 1:
                            electricalAppliances.menu();
                            System.out.printf(".device number :");
                            device = scanner.nextInt();
                            System.out.printf(".num of devices you want :");
                            number = scanner.nextInt();
                            electricalAppliances.managerRemove(device, number);
                            break;
                        case 2:
                            shoe.menu();
                            System.out.printf(".device number :");
                            device = scanner.nextInt();
                            System.out.printf(".num of devices you want :");
                            number = scanner.nextInt();
                            shoe.managerRemove(device, number);
                            break;
                        case 3:
                            journals.menu();
                            System.out.printf(".device number :");
                            device = scanner.nextInt();
                            System.out.printf(".num of devices you want :");
                            number = scanner.nextInt();
                            journals.managerRemove(device, number);
                    }
                } else if (addOrRemove == 3) {
                    purchaseMenu(electricalAppliances, shoe, journals, userProfile);
                }

                System.out.println("Do You Want To Do Something Else ?");
                System.out.println("1.Yes\n2.No");
                int choice = scanner.nextInt();
                if (choice == 2) {
                    felag = false;
                    manage = false;
                }
            }
        }
    }

    public static void  wareInfo(ElectricalAppliances electricalAppliances,Shoe shoe ,Journals journals){
        electricalAppliances.wareHouse();
        shoe.wareHouse();
        journals.wareHouse();
    }

}