package randoop.utils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.String str0 = utils.RandomCredentialGenerator.generateRandomPassword();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SAhtl?9Y9Zq3wP" + "'", str0.equals("SAhtl?9Y9Zq3wP"));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.String str0 = utils.RandomCredentialGenerator.generateRandomEmail();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str0 + "' != '" + "lbuuwgwj@parking.yorku.ca" + "'", str0.equals("lbuuwgwj@parking.yorku.ca"));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        utils.RandomCredentialGenerator randomCredentialGenerator0 = new utils.RandomCredentialGenerator();
        java.lang.Class<?> wildcardClass1 = randomCredentialGenerator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}
