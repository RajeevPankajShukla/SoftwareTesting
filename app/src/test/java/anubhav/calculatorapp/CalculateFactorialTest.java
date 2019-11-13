package anubhav.calculatorapp;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateFactorialTest
{

    CalculateFactorial ObjectCalculateFactorial;

    @Before
    public void setUp() throws Exception
    {
        ObjectCalculateFactorial = new CalculateFactorial();
    }

    @Test
    public void factorial_1()
    {
        int n = 5;

        int expVal = 120;

        Assert.assertTrue("factorial_1" + " failed !!",expVal == ObjectCalculateFactorial.factorial(n));
    }

    @Test
    public void factorial_2()
    {
        int n = 4;

        int expVal = 24;

        Assert.assertTrue("factorial_2" + " failed !!",expVal == ObjectCalculateFactorial.factorial(n));
    }

    @Test
    public void factorial_3()
    {
        int n = 6;

        int expVal = 720;

        Assert.assertTrue("factorial_3" + " failed !!",expVal == ObjectCalculateFactorial.factorial(n));
    }

    @Test
    public void factorial_4()
    {
        int n = 3;

        int expVal = 6;

        Assert.assertTrue("factorial_4" + " failed !!",expVal == ObjectCalculateFactorial.factorial(n));
    }

    @Test
    public void factorial_5()
    {
        int n = 5;

        int expVal = 20;

        Assert.assertTrue("factorial_5" + " failed !!",expVal == ObjectCalculateFactorial.factorial(n));
    }
}