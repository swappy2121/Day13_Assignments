package com.Bridgelabz;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaximumFloatNumberTest {

    @Test
    public void givenMaxNumberAtFirstPositionOrNot(){
        MaximumFloatNumber maxNum = new MaximumFloatNumber();
        double result = maxNum.MaxFloat(4.54);
        Assert.assertEquals(1.29,result);

    }
    @Test
    public void givenMaxNumberAtSecondPositionOrNot() {
        MaximumFloatNumber maxNum = new MaximumFloatNumber();
        double result = maxNum.MaxFloat(4.54);
        Assert.assertEquals(3.56, result);

    }
    @Test
    public void givenMaxNumberAtThirdPositionOrNot() {
        MaximumFloatNumber maxNum = new MaximumFloatNumber();
        double result = maxNum.MaxFloat(4.54);
        Assert.assertEquals(4.54, result);

    }

}
