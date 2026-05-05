package day7;

public class GroceryBill {

    public static void main(String[] args) {
        String itemname = "Soap";
        int quantity = 3;
        double price = 50.0;
        int membership = 0;

        double subtotal = quantity * price;

        double discount = 0;
        if (membership == 1) {
            discount = subtotal * 0.10;
        }

        double amount = subtotal - discount;

        double gst;
        if (amount > 500) {
            gst = amount * 0.05;
        } else {
            gst = amount * 0.12;
        }

        double finalTotal = amount + gst;

        System.out.println("\n----- BILL -----");
        System.out.println("Item Name: " + itemname);
        System.out.println("Subtotal: Rs " + subtotal);
        System.out.println("Discount: Rs " + discount);
        System.out.println("GST: Rs " + gst);
        System.out.println("Final Total: Rs " + finalTotal);
    }
}