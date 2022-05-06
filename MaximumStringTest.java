package com.Bridgelabz;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaximumStringTest {

    @Test
    public void givenMaxStringAtFirstPositionOrNot(){
        MaximumString maxNum = new MaximumString();
        String result = maxNum.MaxString("Peach");
        Assert.assertEquals("Apple",result);

    }
    @Test
    public void givenMaxStringAtSecondPositionOrNot() {
        MaximumString maxNum = new MaximumString();
        String result = maxNum.MaxString("Peach");
        Assert.assertEquals("Peach", result);

    }
    @Test
    public void givenMaxStringAtThirdPositionOrNot() {
        MaximumString maxNum = new MaximumString();
        String result = maxNum.MaxString("Peach");
        Assert.assertEquals("Banana", result);

    }

}
