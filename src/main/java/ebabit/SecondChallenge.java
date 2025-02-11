package ebabit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecondChallenge {
    public static int sum(int x, int y) {
        return x + y;
    }

    @Test
    public void test1() {
        int expected = 5;
        int actual = SecondChallenge.sum(2, 3);
        assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        int expected = -9;
        int actual = SecondChallenge.sum(-3, -6);
        assertEquals(expected, actual);
    }
    @Test
    public void test3() {
        int expected = 10;
        int actual = SecondChallenge.sum(3, 7);
        assertEquals(expected, actual);
    }
}
