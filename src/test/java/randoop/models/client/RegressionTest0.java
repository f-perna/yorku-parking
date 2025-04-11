package randoop.models.client;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "", "hi!", type3, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        models.client.GenerateClientFactory generateClientFactory0 = new models.client.GenerateClientFactory();
        java.lang.Class<?> wildcardClass1 = generateClientFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "hi!", "", type3, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "", "", type3, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "", "", type3, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "", "hi!", type3, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "", "hi!", type3, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "hi!", "", type3, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "hi!", "hi!", type3, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "", "hi!", type3, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "", "", type3, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "hi!", "", type3, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "hi!", "hi!", type3, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "hi!", "hi!", type3, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "", "hi!", type3, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "", "", type3, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "", "", type3, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "hi!", "hi!", type3, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "hi!", "hi!", type3, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "", "", type3, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "", "hi!", type3, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "hi!", "hi!", type3, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "hi!", "", type3, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "hi!", "", type3, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "", "hi!", type3, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "hi!", "", type3, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "hi!", "", type3, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "hi!", "hi!", type3, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "hi!", "", type3, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "", "hi!", type3, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "", "", type3, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("", "", "", type3, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        models.client.Client.type type3 = null;
        models.client.Client client6 = models.client.GenerateClientFactory.getClientType("hi!", "hi!", "hi!", type3, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }
}

