package com.Assignment_2_2;

import org.junit.Test;

/**
 * Created by mgijma on 2016/03/06.
 */
public class TestPrintResults {
    PrintResults printResults = new PrintResults();

    @Test
    public void testName() throws Exception {

        int a = 2;
        int b = 3;
        int sum = a + b;

        System.out.println(printResults.printResults(a,b,sum));
    }
}
