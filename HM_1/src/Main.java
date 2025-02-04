public class Main {
    public static void main(String[] args){
        //данні першого замовлення

        int orderNo1 = 1;
        String client1 = " Alice ";
        String product1 = " smartphone ";
        double price1 = 305.99;
        String address1 = " Moon Street, 10 ";

        //данні другого замовлення

        int orderNo2 = 2;
        String client2 = " Tom ";
        String product2 = " laptop ";
        double price2 = 570.95;
        String address2 = " Terra Street, 17 ";

        //виводим данні

        System.out.println(" Order No " + orderNo1 + " Client: " + client1 + ".");
        System.out.println(" Product: " + product1 + ",");
        System.out.println(" Price EUR " + price1 + ".");
        System.out.println(" Address: " + address1 + ".");

        System.out.println(" Order No " + orderNo2 + " Client: " + client2 + ".");
        System.out.println(" Product: " + product2 + ",");
        System.out.println(" Price EUR " + price2 + ".");
        System.out.println(" Address: " + address2 + ".");
    }
}