package MT2018_091_093.calculatorapp;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class StandardCalTest
{
    StandardCal ObjectStandardCal;

    @Before
    public void setUp() throws Exception
    {
        ObjectStandardCal = new StandardCal();
    }

    @Test
    public void combination_1()
    {
        int n = 5;
        int k = 2;

        int expVal = 10;

        Assert.assertTrue("combination_1" + " failed !!",expVal == ObjectStandardCal.Combination(n, k));
    }

    @Test
    public void combination_2()
    {
        int n = 10;
        int k = 2;

        int expVal = 45;

        Assert.assertTrue("combination_2" + " failed !!",expVal == ObjectStandardCal.Combination(n, k));
    }

    @Test
    public void combination_3()
    {
        int n = 15;
        int k = 4;

        int expVal = 1365;

        Assert.assertTrue("combination_3" + " failed !!",expVal == ObjectStandardCal.Combination(n, k));
    }

    @Test
    public void combination_4()
    {
        int n = 20;
        int k = 10;

        int expVal = 184756;

        Assert.assertTrue("combination_4" + " failed !!",expVal == ObjectStandardCal.Combination(n, k));
    }

    @Test
    public void combination_5()
    {
        int n = 5;
        int k = 1;

        int expVal = 10;

        Assert.assertTrue("combination_5" + " failed !!",expVal == ObjectStandardCal.Combination(n, k));
    }
}