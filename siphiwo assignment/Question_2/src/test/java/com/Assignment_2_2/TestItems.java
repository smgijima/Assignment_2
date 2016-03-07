package com.Assignment_2_2;

/**
 * Created by mgijma on 2016/03/06.
 */
public class TestItems {
    Items items = new Items("Xbox 360","Game",12000.00);

    @Test
    public void testItems() throws Exception {
        System.out.println(items.toString());
    }
}
