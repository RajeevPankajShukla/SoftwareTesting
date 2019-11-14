package MT2018_091_093.calculatorapp;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class UnitAreaTest
{
    UnitArea testObjectUnitArea;

    @Before
    public void setUp() throws Exception
    {
        testObjectUnitArea = new UnitArea();
    }

    @Test
    public void evaluate_sqMeterToMeter() throws Exception
    {
        int choice1 = 2;
        int choice2 = 2;

        double val = 20.0;
        double expVal = 20.0;

        Assert.assertTrue("evaluate_sqMeterToMeter" + " failed !!",expVal == testObjectUnitArea.evaluate(choice1, choice2, val));
    }

    @Test
    public void evaluate_sqMilliToMeter() throws Exception
    {
        int choice1 = 0;
        int choice2 = 2;

        double val = 2000000.0;
        double expVal = 2.0;

        Assert.assertTrue("evaluate_sqMilliToMeter" + " failed !!",expVal == testObjectUnitArea.evaluate(choice1, choice2, val));
    }

    @Test
    public void evaluate_sqCentiToMeter() throws Exception
    {
        int choice1 = 1;
        int choice2 = 2;

        double val = 20000.0;
        double expVal = 2.0;

        Assert.assertTrue("evaluate_sqCentiToMeter" + " failed !!",expVal == testObjectUnitArea.evaluate(choice1, choice2, val));
    }

    @Test
    public void evaluate_sqKiloToMeter() throws Exception
    {
        int choice1 = 3;
        int choice2 = 2;

        double val = 2.0;
        double expVal = 2000000.0;

        Assert.assertTrue("evaluate_sqKiloToMeter" + " failed !!",expVal == testObjectUnitArea.evaluate(choice1, choice2, val));
    }

    @Test
    public void evaluate_sqAcreToMeter() throws Exception
    {
        int choice1 = 4;
        int choice2 = 2;

        double val = 1.0;
        double expVal = 4046.86;

        Assert.assertTrue("evaluate_sqAcreToMeter" + " failed !!",expVal == testObjectUnitArea.evaluate(choice1, choice2, val));
    }

    @Test
    public void evaluate_sqHectareToMeter() throws Exception
    {
        int choice1 = 5;
        int choice2 = 2;

        double val = 1.0;
        double expVal = 10000.0;

        Assert.assertTrue("evaluate_sqHectareToMeter" + " failed !!",expVal == testObjectUnitArea.evaluate(choice1, choice2, val));
    }

    @Test
    public void evaluate_sqMeterToMilli() throws Exception
    {
        int choice1 = 2;
        int choice2 = 0;

        double val = 2.0;
        double expVal = 2000000.0;

        Assert.assertTrue("evaluate_sqMeterToMilli" + " failed !!",expVal == testObjectUnitArea.evaluate(choice1, choice2, val));
    }

    @Test
    public void evaluate_sqMeterToCenti() throws Exception
    {
        int choice1 = 2;
        int choice2 = 1;

        double val = 2.0;
        double expVal = 20000.0;

        Assert.assertTrue("evaluate_sqMeterToCenti" + " failed !!",expVal == testObjectUnitArea.evaluate(choice1, choice2, val));
    }

    @Test
    public void evaluate_sqMeterToKilo() throws Exception
    {
        int choice1 = 2;
        int choice2 = 3;

        double val    = 2000000.0;
        double expVal = 2.0;

        Assert.assertTrue("evaluate_sqMeterToKilo" + " failed !!",expVal == testObjectUnitArea.evaluate(choice1, choice2, val));
    }

    @Test
    public void evaluate_sqMeterToAcre() throws Exception
    {
        int choice1 = 2;
        int choice2 = 4;

        double val = 4046.86;
        double expVal = 1.0;

        Assert.assertTrue("evaluate_sqMeterToAcre" + " failed !!",expVal == testObjectUnitArea.evaluate(choice1, choice2, val));
    }

    @Test
    public void evaluate_sqMeterToHectare() throws Exception
    {
        int choice1 = 2;
        int choice2 = 5;

        double val = 20.0;
        double expVal = 20.0;

        Assert.assertTrue("evaluate_sqMeterToHectare" + " failed !!",expVal == testObjectUnitArea.evaluate(choice1, choice2, val));
    }
}