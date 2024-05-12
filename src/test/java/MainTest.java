import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;


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
    public void test_time() {
        ArrayList<Integer> numbs;
        for (String k: new String[] {"max", "min", "sum", "mult"}){
            for (int i = 0; i < 5; i++){
                numbs = new ArrayList<>();
                for (int j = 0; j < Math.pow(2, i); j++){
                    numbs.add(j % 2);
                }
                double time_start = System.nanoTime();
                switch (k){
                    case "sum":
                        Main._sum(numbs);
                        break;
                    case "max":
                        Main._max(numbs);
                        break;
                    case "min":
                        Main._min(numbs);
                        break;
                    case "mult":
                        Main._mult(numbs);
                        break;
                }

                double time_end = System.nanoTime();
                Assert.assertEquals((time_end - time_start) / 1000000. < 20, true);
                System.out.println((time_end - time_start) / 1000000.);
                // каждый тест проходит менее чем за 20 миллисекунд
            }
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
