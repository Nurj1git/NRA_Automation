package ebabit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThirdChallenge {

        public static int convert(int minutes) {
            return minutes * 60;
        }

    @Test
    public void test1() {
        assertEquals(360, convert(6));
    }

}
