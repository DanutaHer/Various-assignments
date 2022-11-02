import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Silnia2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = Math.abs(scanner.nextInt());
        List<Integer> response = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            int number = Math.abs(scanner.nextInt());
            response.add(silnia(number));
        }
        for(int tens : response){
           ten(tens);
            System.out.println();
        }
        scanner.close();
    }

    public static int silnia(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static void ten(int n){
        List<Integer> temp = new ArrayList<>();
        while (n!=0){
            int k = n % 10;
            temp.add(k);
            n = n/10;
        }
        Collections.reverse(temp);
        for(int response : temp){
            System.out.print(response + " ");;
        }
    }
}
