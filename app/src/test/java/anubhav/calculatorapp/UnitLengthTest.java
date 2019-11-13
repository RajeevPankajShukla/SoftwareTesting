package anubhav.calculatorapp;

//import org.junit.Assert;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Ravindra Singh on 13-11-2019.
 */
public class UnitLengthTest {
    UnitLength testObjectUnitLength;
    @Before
    public void setUp() throws Exception {
        testObjectUnitLength = new UnitLength();
    }

    @Test
    public void evaluate_equalMetric() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 3;
        int choice2 = 3;
        double val = 20.0;
        double expVal = 20.0;
        try {
            Assert.assertTrue(expVal == testObjectUnitLength.evaluate(choice1, choice2, val));
        }
        catch (Exception e)
        {
            System.out.println("evaluate_equalMetric" + " failed !!");
        }
    }

    @Test
    public void evaluate_nanoToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 0;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 0.000000002;
        try {
            Assert.assertTrue(expVal == testObjectUnitLength.evaluate(choice1, choice2, val));
        }
        catch (Exception e)
        {
            System.out.println("evaluate_equalMetric" + " failed !!");
        }
    }


    @Test
    public void evaluate_milliToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 1;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 0.002;
        try {
            Assert.assertTrue(expVal == testObjectUnitLength.evaluate(choice1, choice2, val));
        }
        catch (Exception e)
        {
            System.out.println("evaluate_milliToMeter" + " failed !!");
        }
    }

    @Test
    public void evaluate_centiToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 2;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 0.02;
        try {
            Assert.assertTrue(expVal == testObjectUnitLength.evaluate(choice1, choice2, val));
        }
        catch (Exception e)
        {
            System.out.println("evaluate_centiToMeter" + " failed !!");
        }
    }

    @Test
    public void evaluate_kiloToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 4;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 2000.0;
        try {
            Assert.assertTrue(expVal == testObjectUnitLength.evaluate(choice1, choice2, val));
        }
        catch (Exception e)
        {
            System.out.println("evaluate_kiloToMeter" + " failed !!");
        }
    }

    @Test
    public void evaluate_inchToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 5;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 78.7402;
        try {
            Assert.assertTrue(expVal == testObjectUnitLength.evaluate(choice1, choice2, val));
        }
        catch (Exception e)
        {
            System.out.println("evaluate_inchToMeter" + " failed !!");
        }
    }

    @Test
    public void evaluate_footToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 6;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 6.56168;
        try {
            Assert.assertTrue(expVal == testObjectUnitLength.evaluate(choice1, choice2, val));
        }
        catch (Exception e)
        {
            System.out.println("evaluate_footToMeter" + " failed !!");
        }
    }

    @Test
    public void evaluate_yardToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 7;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 1.8287988;
        try {
            Assert.assertTrue(expVal == testObjectUnitLength.evaluate(choice1, choice2, val));
        }
        catch (Exception e)
        {
            System.out.println("evaluate_yardToMeter" + " failed !!");
        }
    }

    @Test
    public void evaluate_mileToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 8;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 3218.688995;
        try {
            Assert.assertTrue(expVal == testObjectUnitLength.evaluate(choice1, choice2, val));
        }
        catch (Exception e)
        {
            System.out.println("evaluate_yardToMeter" + " failed !!");
        }
    }
}//class