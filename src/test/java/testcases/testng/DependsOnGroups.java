package testcases.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {

    @Test(groups ={"smoke"})
    public void verifyAddToCart(){
        Assert.assertTrue(false,"Login verification failed");
        System.out.println("Verify Add To Cart");
    }
    @Test(dependsOnGroups = {"smoke"})
    public void verifyProductDelivery(){
        System.out.println("Verify Product Delivery");
    }

    @Test
    public void VerifySearchProduct(){
        System.out.println("Verify Search Product");
    }
}

