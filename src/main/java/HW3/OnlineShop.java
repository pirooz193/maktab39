package HW3;

import java.util.ArrayList;

public abstract class OnlineShop {
    ArrayList<String> cart = new ArrayList<String>();
    ArrayList<String> appliances = new ArrayList<String>();
    ArrayList<String> purchase = new ArrayList<String>();

    private int total = 0;

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }
   public  abstract void managerAdd(int device, int number);
    public abstract void managerRemove(int device, int numOfRemove);
    public abstract void menu();

    public abstract void wareHouse();

    public abstract boolean applianceExist(int device, int number);

    public abstract void purchaseInvoice();
    public abstract boolean remove(int appliance ,int number,int numOfRemove);

    public void zeroing() {
        for (int i = cart.size() - 1; i >= 0; i--) {
            cart.remove(cart.get(i));
        }
        for (int i = purchase.size() - 1; i >= 0; i--) {
            purchase.remove(purchase.get(i));
        }
    }

}
