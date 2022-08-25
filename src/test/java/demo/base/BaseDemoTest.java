package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_return_BaseDemo_Sum() {
        BaseDemo baseDemo = new BaseDemo();
        //test case
        int a = 1;
        int b = 2;
        int testSum = 3;




        //tester

        assertEquals(testSum, baseDemo.sum(a, b));
    }


    @Test
    public void should_return_BaseDemo_Sum2() {
        BaseDemo baseDemo = new BaseDemo();
        // test case 2
        int c = 3;
        int d = 4;
        int testSum2 = 7;


        //tester

        assertEquals(testSum2, baseDemo.sum(c, d));
    }

}

