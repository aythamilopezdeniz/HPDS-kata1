import org.junit.Before;
import org.junit.Test;
import org.ulpgc.FizzBuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz=new FizzBuzz();
    }

    @Test
    public void given_1_should_return_1() {
        assertThat(fizzBuzz.get(1), is("1"));
    }

    @Test
    public void given_2_should_return_2() {
        assertThat(fizzBuzz.get(2), is("2"));
    }

    @Test
    public void given_3_should_return_3() {
        assertThat(fizzBuzz.get(3), is("Fizz"));
    }

    @Test
    public void given_5_should_return_5() {
        assertThat(fizzBuzz.get(5), is("Buzz"));
    }

    @Test
    public void given_6_should_return_6() {
        assertThat(fizzBuzz.get(6), is("Fizz"));
    }

    @Test
    public void given_10_should_return_10() {
        assertThat(fizzBuzz.get(10), is("Buzz"));
    }

    @Test
    public void given_15_should_return_15() {
        assertThat(fizzBuzz.get(15), is("FizzBuzz"));
    }

    @Test
    public void given_30_should_return_30() {
        assertThat(fizzBuzz.get(30), is("FizzBuzz"));
    }
}