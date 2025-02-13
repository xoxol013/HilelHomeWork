package HM_3;

public class Tax {
        public static void main(String[] args) {

            double income = 13_700; // Amount of income
            double taxRate = 0.025; // Tax amount


            taxRate += (income > 10000) ? 0.018 : 0; // Tax more 10_000
            taxRate += (income > 25000) ? 0.024 : 0; // Tax more 25_000

            double tax = income * taxRate;
            System.out.println("Tax amount: " + tax);
        }
    }

