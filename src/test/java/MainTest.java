import org.junit.Assert;
import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {


    @Test
    public void testMain() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < 6; i++){
            arr.add(i);
        }

        int result_min = Main._min(arr);
        int result_max = Main._max(arr);
        int result_sum = Main._sum(arr);
        int result_mult = Main._mult(arr);

        Assert.assertEquals(result_min, 1);
        Assert.assertEquals(result_max, 5);
        Assert.assertEquals(result_mult, 2 * 3 * 4 * 5);
        Assert.assertEquals(result_sum, 1 + 2 + 3 + 4 + 5);

    }

    @Test
    public void test_time() throws FileNotFoundException {
        Scanner reader;
        int nextint;
        ArrayList<Integer> numbs;
        for (int i = 0; i < 6; i++){
            reader = new Scanner(new File("test1" + i + ".txt"));
            numbs = new ArrayList<>();
            while (reader.hasNext()) {
                // проверка на принадлежность числа диапазону int
                try {
                    nextint = Integer.parseInt(reader.next());
                    numbs.add(nextint);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Число выходит за диапазон int!");
                }
                numbs.add(nextint);
            }
            double time_start = System.nanoTime();
            Main._sum(numbs);
            double time_end = System.nanoTime();
            Assert.assertEquals((time_end - time_start) / 1000000. < 15, true);
            System.out.println((time_end - time_start) / 1000000.);
            // каждый тест проходит менее чем за 15 миллисекунд
        }

    }

    @Test
    public void test_correct_mult_sign() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = -10; i < 0; i++){
            arr.add(i);
        }
        int result_mult = Main._mult(arr);
        Assert.assertEquals((int)Math.signum(result_mult), (int)Math.pow((-1), arr.size()));

    }

}
