import java.util.Random;
import java.util.Scanner;


public class Soldiers {
    private int soldierId;
    private String name;
    private String rank;
    private String firstRank;
    int[] bullet = new int[4];
    int sum = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Soldiers[] soldiers = new Soldiers[15];
        boolean flag = true;
        int shootingTestNumber = 1;
        String[] ranks = {"Lieutenant", "Sergent", "Corporal"};
        speakAtFirst();
        for (int i = 0; i < 15; i++) {
            soldiers[i] = new Soldiers();
            soldiers[i].setRank(ranks[random.nextInt(3)]);
            soldiers[i].setFirstRank(soldiers[i].getRank());
            System.out.printf("ENTER YOUR NAME: ");
            soldiers[i].setName(scanner.next());
            System.out.printf("ENTER YOUR ID: ");
            soldiers[i].setSoldierId(random.nextInt(10000));
            System.out.println(soldiers[i].getSoldierId());

        }

        while (flag) {
            String yesSir;
            int corporalCntr = 0;
            for (int i = 0; i < 15; i++) {


                System.out.printf("IT'S TIME TO VOLLEY !!!\n");
                for (int j = 0; j < 4; j++) {
                    System.out.printf("BULLET %d:", j + 1);
                    soldiers[i].bullet[j] = random.nextInt(10);
                    System.out.println(soldiers[i].bullet[j]);
                    soldiers[i].sum += soldiers[i].bullet[j];
                }
                bulletChecker(soldiers[i], soldiers[i].sum);
                if (soldiers[i].getRank().equals("Corporal")) corporalCntr++;

            }
            System.out.println("==================");
            System.out.println("Shooting test.Test [" + shootingTestNumber + "]");
            System.out.println("==================");
            for (int i = 0; i < 15; i++) {
                System.out.printf("Soldier ID : [%d]\n", soldiers[i].getSoldierId());
                for (int j = 0; j < 4; j++) {
                    System.out.println("Bullet " + (j + 1) + " : [" + soldiers[i].bullet[j] + "]");
                }
                System.out.println("Final Score: [" + soldiers[i].sum + "]");
                System.out.println("Initial Rank: [" + soldiers[i].getFirstRank() + "]");
                System.out.println("Final Rank: [" + soldiers[i].getRank() + "]");
                System.out.println("*****************");
            }


            System.out.println("Shooting test [" + shootingTestNumber + "] result: [" + ((corporalCntr * 100) / 15) + "]% of soldiers are Corporals");
            if (corporalCntr >= (15 * 60) / 100) {
                for (int i = 0; i < 15; i++) {
                    soldiers[i].setFirstRank(soldiers[i].getRank());
                    soldiers[i].sum = 0;

                }

                System.out.println("WHAT!!!\nWHAT KIND OF SOLDIER ARE YOU??\nMUST TEST AGAIN!!\n");
                System.out.println("YOU CAN NOT TO TURN AWAY !!!");
                System.out.printf("SAY YES SIR TO CONTINUE !");
                yesSir =scanner.next();
                if (yesSir.equalsIgnoreCase("yes sir") ){

                    System.out.println("CONTINUE");
                    System.out.println();
                }
            }
            shootingTestNumber++;
            if (corporalCntr < (15 * 60) / 100) {
                flag = false;
                System.out.println("\n... CONGRAGULATION ...\n WELL DONE!! , WE PROUD OF YOU !");
            }
        }


    }

    public void setSoldierId(int soldierId) {
        this.soldierId = soldierId;
    }

    public int getSoldierId() {
        return soldierId;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setFirstRank(String firstRank) {
        this.firstRank = firstRank;
    }

    public String getFirstRank() {
        return firstRank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public static void bulletChecker(Soldiers soldiers, int sum) {

        if (sum >= 28) {
            if (soldiers.getRank().equals("Corporal")) soldiers.setRank("Sergent");
            else if (soldiers.getRank().equals("Sergent")) soldiers.setRank("Lieutenant");


        } else {
            if (soldiers.getRank().equals("Sergent")) soldiers.setRank("Corporal");
            else if (soldiers.getRank().equals("Lieutenant")) soldiers.setRank("Sergent");

        }

    }

    public static void speakAtFirst() {

        System.out.println("\t...HI SOLDIERS...");
        System.out.println("'THIS IS A HARD TEST '");
        System.out.println("IF YOU PASS THIS , YOUR RANK WILL BE RISSEN !!");
        System.out.println("\t...BUT...\nIF YOU DONT--> YOU'LL BE DEMOTED!!");
        System.out.println("THEN BE * CAREFULL *\n");

    }

}
