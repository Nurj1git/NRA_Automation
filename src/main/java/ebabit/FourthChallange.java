package ebabit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FourthChallange {
    public static boolean isSameNum(int a, int b){
        if(a == b) return true;
        else return false;

    }
    @Test
    public void test1(){
        assertEquals(true, FourthChallange.isSameNum(2,2));
    }
    @Test
    public void test2(){
        assertEquals(false, FourthChallange.isSameNum(2,3));
    }
    @Test
    public void test3(){
        assertEquals(true, FourthChallange.isSameNum(1,1));
    }
}
