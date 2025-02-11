package ebabit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstChallenge {

    public static boolean returnTrue() {
        return true;
    }

    @Test
    public void test1() {
        assertEquals(true, returnTrue());
    }
}
