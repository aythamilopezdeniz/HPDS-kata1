import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void given_1_should_return_1() {
        assertEquals("1", new FizzBuzz().get(1));
    }

    @Test
    public void given_2_should_return_2() {
        assertEquals("2", new FizzBuzz().get(2));
    }

    @Test
    public void given_3_should_return_3() {
        assertEquals("Fizz", new FizzBuzz().get(3));
    }

    @Test
    public void given_5_should_return_5() {
        assertEquals("Buzz", new FizzBuzz().get(5));
    }

    @Test
    public void given_6_should_return_6() {
        assertEquals("Fizz", new FizzBuzz().get(6));
    }

    @Test
    public void given_10_should_return_10() {
        assertEquals("Buzz", new FizzBuzz().get(10));
    }

    @Test
    public void given_15_should_return_15() {
        assertEquals("FizzBuzz", new FizzBuzz().get(15));
    }

    @Test
    public void given_30_should_return_30() {
        assertEquals("FizzBuzz", new FizzBuzz().get(30));
    }

    public class FizzBuzz {
        public String get(int position) {
            if(position%15==0)return "FizzBuzz";
            if(position%5==0)return "Buzz";
            if(position%3==0)return "Fizz";
            return String.valueOf(position);
        }
    }
}