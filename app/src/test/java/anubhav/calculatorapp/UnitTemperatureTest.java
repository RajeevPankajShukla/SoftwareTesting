package anubhav.calculatorapp;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTemperatureTest
{
    UnitTemperature testObjectUnitTemp;

    @Before
    public void setUp() throws Exception
    {
        testObjectUnitTemp = new UnitTemperature();
    }

    @Test
    public void evaluate_KelvinToKelvin() throws Exception
    {
        int choice1 = 2;
        int choice2 = 2;

        double val = 20.0;
        double expVal = 20.0;

        Assert.assertTrue("evaluate_KiloToKilo" + " failed !!",expVal == testObjectUnitTemp.evaluate(choice1, choice2, val));
    }

    @Test
    public void evaluate_CelsiusToKelvin() throws Exception
    {
        int choice1 = 0;
        int choice2 = 2;

        double val = 1;
        double expVal = 274.15;

        Assert.assertTrue("evaluate_CelsiusToKelvin" + " failed !!",expVal == testObjectUnitTemp.evaluate(choice1, choice2, val));
    }

    @Test
    public void evaluate_FerToKelvin() throws Exception
    {
        int choice1 = 1;
        int choice2 = 2;

        double val = 20.0;
        double expVal = 20.0;

        Assert.assertTrue("evaluate_FerToKelvin" + " failed !!",expVal == testObjectUnitTemp.evaluate(choice1, choice2, val));
    }

    @Test
    public void evaluate_KelvinToCelsius() throws Exception
    {
        int choice1 = 2;
        int choice2 = 0;

        double val = 273.15;
        double expVal = 1.0;

        Assert.assertTrue("evaluate_KelvinToCelsius" + " failed !!",expVal == testObjectUnitTemp.evaluate(choice1, choice2, val));
    }

    @Test
    public void evaluate_KelvinToFer() throws Exception
    {
        int choice1 = 2;
        int choice2 = 1;

        double val = 20.0;
        double expVal = 20.0;

        Assert.assertTrue("evaluate_KelvinToFer" + " failed !!",expVal == testObjectUnitTemp.evaluate(choice1, choice2, val));
    }
}