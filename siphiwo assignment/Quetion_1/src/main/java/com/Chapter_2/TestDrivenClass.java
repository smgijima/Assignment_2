package com.Chapter_2;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by mgijma on 2016/03/06.
 */
public class TestDrivenClass {


    public float calculateFloat(float a, float b)
    {
        return a + b;
    }

    public int calculateInt(int a,int b){
        return a + b;
    }

    public boolean checkObjectEquality() {
        String string1 = new String("Mzu");
        String string2 = new String("Mzu");
        return string1.equals(string2);
    }


    public boolean checkObjectIdentity() {
        String string1 = new String();
        String string2 = new String();
        string1 = string2;
        return  string1.equals(string2);
    }


    public boolean checkTruth() {
        return true;
    }

    public boolean checkFalse() {
        return false;
    }

    public Object checkNullness() {
        return null;
    }

    public Object checkNotNull() {
        return "Siphiwo";
    }

    public boolean checkFailingTest() {
        String str1 = new String("Mzu");
        String str2 = new String("Bongs");
        boolean checkFail;
        checkFail = str1.equals(str2);
        return checkFail;
    }

     @Ignore @Test(timeout = 1000)
    public boolean checkException() throws ArithmeticException {
        try {
            int a, b, c;
            a = 5;
            b = 0;
            c = a / b;
        }
        catch(ArithmeticException e){
            return true;
        }
        return true;
    }

    public int accessArray(){
        int num2[] = new int[2];
        num2[0] = 10;
        return num2[0];
    }
}
