package app2;

public class Order_2 {
    public static void main(String[] args) {
        // Данні смартфона
        String product1 = "smartphone";
        double price1 = 2430.68;
        int quantity1 = 5;
        int days1 = 5;
        // Данні ноутбука
        String product2 = "laptop";
        double price2 = 1498.12;
        int quantity2 = 7;
        int days2 = 7;

        // Розрахунок для продукту смартфон
        double totalSales1 = price1 * quantity1; // загальна сума продажів
        double salesPerDay1 = totalSales1 / days1; // середньоденна сума

        // Розрахунок для продукту ноутбук
        double totalSales2 = price2 * quantity2;
        double salesPerDay2 = totalSales2 / days2;

        totalSales1 = Math.round(totalSales1 * 100.0) / 100.0;
        salesPerDay1 = Math.round(salesPerDay1 * 100.0) / 100.0;

        totalSales2 = Math.round(totalSales2 * 100.0) / 100.0;
        salesPerDay2 = Math.round(salesPerDay2 * 100.0) / 100.0;

        System.out.println("Product No 1: " + product1);
        System.out.println("total sales for " + days1 + " days is EUR " + totalSales1);
        System.out.println("sales by day is EUR " + salesPerDay1 + ".");

        System.out.println("Product No 2: " + product2);
        System.out.println("total sales for " + days2 + " days is EUR " + totalSales2);
        System.out.println("sales by day is EUR " + salesPerDay2 + ".");
    }
}


