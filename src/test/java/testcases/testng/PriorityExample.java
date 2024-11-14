package testcases.testng;


import org.testng.annotations.Test;

public class PriorityExample {

    // Print in According to Priority Order by Number Assigned to From -ve to +Ve
    @Test (priority = 2,enabled = true)
    public void testcase_E() {
        System.out.println("Test Case E");
    }
    // We Can Assign Same Priority then according to Alphabet
    @Test(priority = 2)
    public void testcase_A() {

        System.out.println("Test Case B");
    }

    @Test(priority = 1)
    public void testcase_R() {
        System.out.println("Test Case R");
    }

    @Test(priority = -2)
    public void testcase_P() {
        System.out.println("Test Case P");
    }


}