import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String mode = sc.next(), file = sc.next();
        Scanner reader = new Scanner(new File(file + ".txt"));
        int nextint;
        ArrayList<Integer> numbs = new ArrayList<>();
        while (reader.hasNext()) {
            // проверка на принадлежность числа диапазону int
            try {
                nextint = Integer.parseInt(reader.next());
                numbs.add(nextint);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Число выходит за диапазон int!");
            }
        }
        switch (mode){
            case ("max"):
                System.out.println(_max(numbs));
                break;
            case ("min"):
                System.out.println(_min(numbs));
                break;
            case ("sum"):
                System.out.println(_sum(numbs));
                break;
            case ("mult"):
                System.out.println(_mult(numbs));
                break;
        }


    }

    static int _max(ArrayList<Integer> arr){
        int max = 0, count = 0;
        for (int el: arr){
            if (count == 0){
                max = el;
                count++;
            }
            else if (max < el){
                max = el;
            }
        }
        return max;
    }
    static int _min(ArrayList<Integer> arr){
        int min = 0, count = 0;
        for (int el: arr){
            if (count == 0){
                min = el;
                count++;
            }
            else {
                if (el < min){
                    min = el;
                }
            }
        }
        return min;
    }
    static int _mult(ArrayList<Integer> arr){
        int mult = 1;
        for (int el: arr){
            BigInteger bi = new BigInteger(String.valueOf(el));
            bi = bi.multiply(new BigInteger(String.valueOf(mult)));
            try {
                mult = Integer.parseInt(bi.toString());
            }
            catch (NumberFormatException e){
                throw new NumberFormatException("Произошло переполнение");
            }
        }
        return mult;

    }
    static int _sum(ArrayList<Integer> arr){
        int sum = 0;
        for (int el: arr){
            try {
                sum = Math.addExact(sum, el);
            }
            catch (ArithmeticException e){
                throw new ArithmeticException("Произошло переполнение");
            }
        }
        return sum;
    }
}
