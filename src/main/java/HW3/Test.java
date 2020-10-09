package HW3;

public class Test {

    public static void main(String[] args) {
        ElectricalAppliances electricalAppliances = new ElectricalAppliances();
        Shoe shoe = new Shoe();
        Journals journals = new Journals();
        electricalAppliances.wareHouse();
        shoe.wareHouse();
        journals.wareHouse();
        System.out.println(electricalAppliances.appliances);
        System.out.println(shoe.appliances);
        System.out.println(journals.appliances);

    }
}
