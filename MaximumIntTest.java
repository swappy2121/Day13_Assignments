package com.Bridgelabz;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaximumIntTest {
       @Test
       public void givenMaxNumberAtFirstPositionOrNot(){
           MaximumInt maxNum = new MaximumInt();
           int result = maxNum.MaxInt(30);
           Assert.assertEquals(20,result);

       }
     @Test
    public void givenMaxNumberAtSecondPositionOrNot() {
         MaximumInt maxNum = new MaximumInt();
         int result = maxNum.MaxInt(30);
         Assert.assertEquals(16, result);

     }
    @Test
    public void givenMaxNumberAtThirdPositionOrNot() {
        MaximumInt maxNum = new MaximumInt();
        int result = maxNum.MaxInt(30);
        Assert.assertEquals(30, result);

    }

    }
