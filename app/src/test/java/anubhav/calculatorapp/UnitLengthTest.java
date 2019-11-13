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
        int choice1 = 10;
        int choice2 = 10;
        double val = 20.0;
        double expVal = 20.0;

        Assert.assertTrue("evaluate_equalMetric",expVal == testObjectUnitLength.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_nanoToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 0;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 0.000000002;

        Assert.assertTrue("evaluate_nanoToMeter",expVal == testObjectUnitLength.evaluate(choice1, choice2, val));
    }


    @Test
    public void evaluate_milliToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 1;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 0.002;

        Assert.assertTrue("evaluate_milliToMeter", expVal == testObjectUnitLength.evaluate(choice1, choice2, val));
    }

    @Test
    public void evaluate_centiToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 2;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 0.02;

        Assert.assertTrue("evaluate_centiToMeter",expVal == testObjectUnitLength.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_meterToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 3;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 2.0;

        Assert.assertTrue("evaluate_meterToMeter", expVal == testObjectUnitLength.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_kiloToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 4;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 2000.0;

        Assert.assertTrue("evaluate_kiloToMeter",expVal == testObjectUnitLength.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_inchToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 5;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 78.7402;

        Assert.assertTrue("evaluate_inchToMeter", expVal == testObjectUnitLength.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_footToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 6;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 6.56168;

        Assert.assertTrue("evaluate_footToMeter", expVal == testObjectUnitLength.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_yardToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 7;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 1.8287988;

        Assert.assertTrue("evaluate_yardToMeter",expVal == testObjectUnitLength.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_mileToMeter() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 8;
        int choice2 = 3;
        double val = 2.0;
        double expVal = 3218.688995;

        Assert.assertTrue("evaluate_yardToMeter", expVal == testObjectUnitLength.evaluate(choice1, choice2, val));

    }



    /* *
    Changing from meter to x metric
     *  */
    @Test
    public void evaluate_meterToNano() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 3;
        int choice2 = 0;
        double val = 2.0;
        double expVal = 2000000000.0;

        Assert.assertTrue("evaluate_meterToNano", expVal == testObjectUnitLength.evaluate(choice1, choice2, val));

    }
    @Test
    public void evaluate_meterToMilli() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 3;
        int choice2 = 1;
        double val = 2.0;
        double expVal = 2000000.0;

        Assert.assertTrue("evaluate_meterToMilli", expVal == testObjectUnitLength.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_meterToCenti() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 3;
        int choice2 = 2;
        double val = 2.0;
        double expVal = 200.0;

        Assert.assertTrue("evaluate_meterToCenti", expVal == testObjectUnitLength.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_meterToKilo() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 3;
        int choice2 = 4;
        double val = 2.0;
        double expVal = 0.002;

        Assert.assertTrue("evaluate_meterToKilo", expVal == testObjectUnitLength.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_meterToInch() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 3;
        int choice2 = 5;
        double val = 2.0;
        double expVal = 78.7402;

        Assert.assertTrue("evaluate_meterToInch", expVal == testObjectUnitLength.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_meterToFoot() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 3;
        int choice2 = 6;
        double val = 2.0;
        double expVal = 6.56168;

        Assert.assertTrue("evaluate_meterToFoot", expVal == testObjectUnitLength.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_meterToYard() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 3;
        int choice2 = 7;
        double val = 2.0;
        double expVal = 2.18722;

        Assert.assertTrue("evaluate_meterToYard", expVal == testObjectUnitLength.evaluate(choice1, choice2, val));

    }

    @Test
    public void evaluate_meterToMile() throws Exception {

        //metric 1 and metric2 are same.
        int choice1 = 3;
        int choice2 = 8;
        double val = 2.0;
        double expVal = .001242742;

        Assert.assertTrue("evaluate_meterToYard", expVal == testObjectUnitLength.evaluate(choice1, choice2, val));
    }
}//class