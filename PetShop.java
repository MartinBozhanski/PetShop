import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFood = Integer.parseInt(scanner.nextLine());
        double dogSum = dogFood * 2.5;

        int catFood = Integer.parseInt(scanner.nextLine());
        int catSum =catFood * 4;

        double sum = catSum + dogSum;

        System.out.println(sum + " lv.");
    }
}
