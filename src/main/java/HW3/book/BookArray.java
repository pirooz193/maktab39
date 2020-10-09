package HW3.book;

import java.util.Scanner;

public class BookArray {



    public static void main(String[] args) {
        String[] books = new  String[10];
        Scanner scanner = new Scanner(System.in);
        String title ;
        double price;
        System.out.println("enter your book's name and price \ni tell you is it a fiction book or not");

        for (int i = 0; i < books.length; i++) {
            System.out.printf(".book's name : ");
            title = scanner.nextLine();
            Fiction fiction  = new Fiction(title);
            NonFiction nonFiction = new NonFiction(fiction.getTitle());
            System.out.printf(".price : ");
            price = scanner.nextDouble();
            if (price == fiction.getPrice()) {
                System.out.println(title);
                System.out.println("it's a fiction book");
            }
            else if (price == nonFiction.getPrice())System.out.println("it's a non fiction book");
            else System.out.println("it's not fiction or nonfiction book !");


        }

    }

}
