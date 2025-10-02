import java.util.Scanner;

public class Main {
    public static void buyPhone(String[] phones) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер продукта для покупки(1-" + phones.length + ")");

        for (int i = 0; i < phones.length; i++) {
            System.out.println(i + 1 + ". " + phones[i]);
        }
        int productId = sc.nextInt();

        System.out.println("Хотите купить чехольчик для вашего " + phones[productId -1] + "?(1-yes,2-no)");
        int phoneCase = sc.nextInt();

        if (phoneCase == 1) {
            System.out.println("Теперь вы уверенный владелец " + phones[productId - 1]);
        } else if (phoneCase == 2) {
            System.out.println("Теперь вы не уверенный владелец " + phones[productId - 1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] iphones = {"Iphone 17", "Iphone 17 Pro", "Iphone 17 Pro Max", "Iphone 17 Air"};
        String[] samsungs = {"Samsung s25", "Samsung s25+", "Samsung s25 Ultra", "Samsung s25 Edge"};
        String[] xiaomi = {"Xiaomi 14", "Xiaomi 14 Pro", "Xiaomi 14 Ultra"};

        System.out.println("Введите желаемую фирму смартфона(1 - Apple, 2 - Samsung, 3 - Xiaomi): ");
        int company = sc.nextInt();

        if (company == 1) {
            buyPhone(iphones);
        } else if (company == 2) {
            buyPhone(samsungs);
        } else if (company == 3) {
            buyPhone(xiaomi);
        } else {
            System.out.println("Вы ввели неверное число");
        }


    }
}