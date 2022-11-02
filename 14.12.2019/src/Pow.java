import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Math.abs(scanner.nextInt());
        List<Integer> response = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            int numberA = Math.abs(scanner.nextInt());
            scanner.nextLine();
            int numberB = Math.abs(scanner.nextInt());
            response.add(pow(numberA, numberB));
        }
        for(int tens : response){
            ostJedn(tens);
        }
    }

    static int pow(int a, int b){
        int x = (int) Math.pow(a,b);
        return x;
    }

    static void ostJedn(int n){
        int k = n%10;
            System.out.println(k);
    }
}
