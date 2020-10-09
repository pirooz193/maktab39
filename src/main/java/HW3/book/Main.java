package HW3.book;

public class Main {

    public static void main(String[] args) {
        Fiction fiction = new Fiction("little black fish");
        NonFiction nonFiction = new NonFiction("chemistry");
        fiction.setPrice();
        System.out.println(fiction.getTitle());
        System.out.println(fiction.getPrice());
        nonFiction.setPrice();
        System.out.println(nonFiction.getTitle());
        System.out.println(nonFiction.getPrice());
    }
}



