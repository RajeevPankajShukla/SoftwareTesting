package anubhav.calculatorapp;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitWeightTest
{

    UnitWeight testObjectUnitWeight;

    @Before
    public void setUp() throws Exception
    {
        testObjectUnitWeight = new UnitWeight();
    }

    @Test
    public void evaluate_KiloToKilo() throws Exception
    {

        int choice1 = 4;
        int choice2 = 4;

        double val = 20.0;
        double expVal = 20.0;

        Assert.assertTrue("evaluate_KiloToKilo" + " failed !!",expVal == testObjectUnitWeight.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_MilliToKilo() throws Exception
    {

        int choice1 = 0;
        int choice2 = 4;

        double val = 2000000.0;
        double expVal = 2.0;

        Assert.assertTrue("evaluate_MilliToKilo" + " failed !!",expVal == testObjectUnitWeight.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_CentiToKilo() throws Exception
    {

        int choice1 = 1;
        int choice2 = 4;

        double val = 200000.0;
        double expVal = 2.0;

        Assert.assertTrue("evaluate_CentiToKilo" + " failed !!",expVal == testObjectUnitWeight.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_DeciToKilo() throws Exception
    {

        int choice1 = 2;
        int choice2 = 4;

        double val = 20000.0;
        double expVal = 2.0;

        Assert.assertTrue("evaluate_DeciToKilo" + " failed !!",expVal == testObjectUnitWeight.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_GramToKilo() throws Exception
    {

        int choice1 = 3;
        int choice2 = 4;

        double val = 200.0;
        double expVal = 2.0;

        Assert.assertTrue("evaluate_GramToKilo" + " failed !!",expVal == testObjectUnitWeight.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_MetricTonnesToKilo() throws Exception
    {

        int choice1 = 5;
        int choice2 = 4;

        double val = 2.0;
        double expVal = 2000.0;

        Assert.assertTrue("evaluate_MetricTonnesToKilo" + " failed !!",expVal == testObjectUnitWeight.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_PoundsToKilo() throws Exception
    {

        int choice1 = 6;
        int choice2 = 4;

        double val = 2.20462;
        double expVal = 1.0;

        Assert.assertTrue("evaluate_PoundsToKilo" + " failed !!",expVal == testObjectUnitWeight.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_OuncesToKilo() throws Exception
    {

        int choice1 = 7;
        int choice2 = 4;

        double val = 70.0;
        double expVal = 1.0;

        Assert.assertTrue("evaluate_OuncesToKilo" + " failed !!",expVal == testObjectUnitWeight.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_KiloToMilli() throws Exception
    {

        int choice1 = 4;
        int choice2 = 0;

        double val = 5.0;
        double expVal = 5000000.0;

        Assert.assertTrue("evaluate_KiloToMilli" + " failed !!",expVal == testObjectUnitWeight.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_KiloToCenti() throws Exception
    {

        int choice1 = 4;
        int choice2 = 1;

        double val = 5.0;
        double expVal = 500000.0;

        Assert.assertTrue("evaluate_KiloToCenti" + " failed !!",expVal == testObjectUnitWeight.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_KiloToDeci() throws Exception
    {

        int choice1 = 4;
        int choice2 = 2;

        double val = 5.0;
        double expVal = 50000.0;

        Assert.assertTrue("evaluate_KiloToDeci" + " failed !!",expVal == testObjectUnitWeight.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_KiloToGram() throws Exception
    {

        int choice1 = 4;
        int choice2 = 3;

        double val = 5.0;
        double expVal = 5000.0;

        Assert.assertTrue("evaluate_KiloToGram" + " failed !!",expVal == testObjectUnitWeight.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_KiloToMetricTonnes() throws Exception
    {

        int choice1 = 4;
        int choice2 = 5;

        double val = 5000.0;
        double expVal = 5.0;

        Assert.assertTrue("evaluate_KiloToMetricTonnes" + " failed !!",expVal == testObjectUnitWeight.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_KiloToPounds() throws Exception
    {

        int choice1 = 4;
        int choice2 = 6;

        double val = 1;
        double expVal = 2.20462;

        Assert.assertTrue("evaluate_KiloToPounds" + " failed !!",expVal == testObjectUnitWeight.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_KiloToOunces() throws Exception
    {

        int choice1 = 4;
        int choice2 = 7;

        double val = 1;
        double expVal = 35.274;

        Assert.assertTrue("evaluate_KiloToOunces" + " failed !!",expVal == testObjectUnitWeight.evaluate(choice1, choice2, val));

    }
}