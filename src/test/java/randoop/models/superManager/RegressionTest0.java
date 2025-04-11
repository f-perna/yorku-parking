package randoop.models.superManager;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.Class<?> wildcardClass1 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass3 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass2 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass3 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        boolean boolean6 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        java.lang.String str3 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("", "");
        java.lang.String str9 = superManager0.getEmail();
        java.lang.String str10 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "superadmin@parking.yorku.ca" + "'", str9.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("", "");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        boolean boolean18 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.Class<?> wildcardClass19 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        boolean boolean4 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str9 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "superadmin@parking.yorku.ca" + "'", str9.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean11 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        java.lang.String str9 = superManager0.getPassword();
        boolean boolean12 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.String str13 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "superadmin@parking.yorku.ca" + "'", str13.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        boolean boolean18 = superManager0.authenticate("", "hi!");
        java.lang.Class<?> wildcardClass19 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str14 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "superadmin@parking.yorku.ca" + "'", str14.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("", "");
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getEmail();
        java.lang.String str17 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass18 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "superadmin@parking.yorku.ca" + "'", str17.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean7 = superManager0.authenticate("hi!", "");
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "superadmin@parking.yorku.ca" + "'", str9.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean7 = superManager0.authenticate("hi!", "");
        java.lang.String str8 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        boolean boolean16 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.Class<?> wildcardClass17 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        boolean boolean16 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean19 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.Class<?> wildcardClass20 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("", "");
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean7 = superManager0.authenticate("hi!", "");
        boolean boolean10 = superManager0.authenticate("", "");
        java.lang.String str11 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        boolean boolean16 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str17 = superManager0.getPassword();
        boolean boolean20 = superManager0.authenticate("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("", "");
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("", "");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass16 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean7 = superManager0.authenticate("hi!", "");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean7 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass16 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("", "");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getPassword();
        boolean boolean19 = superManager0.authenticate("hi!", "");
        java.lang.Class<?> wildcardClass20 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("", "hi!");
        java.lang.String str9 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("", "");
        java.lang.String str9 = superManager0.getEmail();
        java.lang.String str10 = superManager0.getEmail();
        java.lang.String str11 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "superadmin@parking.yorku.ca" + "'", str9.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "superadmin@parking.yorku.ca" + "'", str10.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        boolean boolean18 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean21 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("", "");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getPassword();
        java.lang.String str17 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "superadmin@parking.yorku.ca" + "'", str17.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean7 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        boolean boolean16 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str17 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "superadmin@parking.yorku.ca" + "'", str17.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        java.lang.String str12 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "superadmin@parking.yorku.ca" + "'", str12.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getEmail();
        java.lang.String str17 = superManager0.getEmail();
        boolean boolean20 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        java.lang.Class<?> wildcardClass21 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "superadmin@parking.yorku.ca" + "'", str17.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("", "");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        boolean boolean18 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str19 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "superadmin@parking.yorku.ca" + "'", str19.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        boolean boolean6 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean9 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str10 = superManager0.getEmail();
        java.lang.String str11 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "superadmin@parking.yorku.ca" + "'", str10.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean7 = superManager0.authenticate("hi!", "");
        boolean boolean10 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        java.lang.String str9 = superManager0.getPassword();
        boolean boolean12 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean15 = superManager0.authenticate("hi!", "");
        java.lang.Class<?> wildcardClass16 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        java.lang.String str11 = superManager0.getPassword();
        java.lang.String str12 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str9 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        boolean boolean6 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean9 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str10 = superManager0.getEmail();
        java.lang.String str11 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "superadmin@parking.yorku.ca" + "'", str10.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        boolean boolean18 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.Class<?> wildcardClass19 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("", "hi!");
        java.lang.String str9 = superManager0.getPassword();
        boolean boolean12 = superManager0.authenticate("hi!", "");
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        boolean boolean4 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        java.lang.String str5 = superManager0.getEmail();
        boolean boolean8 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("", "hi!");
        java.lang.String str15 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass16 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        boolean boolean6 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str7 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        boolean boolean4 = superManager0.authenticate("hi!", "");
        boolean boolean7 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        java.lang.String str12 = superManager0.getEmail();
        boolean boolean15 = superManager0.authenticate("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "superadmin@parking.yorku.ca" + "'", str12.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("", "");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getPassword();
        java.lang.String str17 = superManager0.getPassword();
        boolean boolean20 = superManager0.authenticate("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean9 = superManager0.authenticate("hi!", "");
        java.lang.String str10 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass17 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        java.lang.String str9 = superManager0.getPassword();
        boolean boolean12 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.String str13 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("", "hi!");
        java.lang.String str9 = superManager0.getPassword();
        boolean boolean12 = superManager0.authenticate("hi!", "");
        java.lang.String str13 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        java.lang.String str12 = superManager0.getEmail();
        java.lang.String str13 = superManager0.getEmail();
        boolean boolean16 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "superadmin@parking.yorku.ca" + "'", str12.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "superadmin@parking.yorku.ca" + "'", str13.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.String str11 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "superadmin@parking.yorku.ca" + "'", str11.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean11 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        boolean boolean18 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.Class<?> wildcardClass19 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("", "");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getPassword();
        java.lang.String str17 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass18 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("", "hi!");
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        boolean boolean8 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str9 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "superadmin@parking.yorku.ca" + "'", str9.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str9 = superManager0.getEmail();
        boolean boolean12 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean15 = superManager0.authenticate("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "superadmin@parking.yorku.ca" + "'", str9.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean7 = superManager0.authenticate("hi!", "");
        boolean boolean10 = superManager0.authenticate("", "");
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.String str11 = superManager0.getPassword();
        java.lang.String str12 = superManager0.getEmail();
        java.lang.String str13 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "superadmin@parking.yorku.ca" + "'", str12.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "superadmin@parking.yorku.ca" + "'", str13.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        boolean boolean4 = superManager0.authenticate("hi!", "");
        java.lang.String str5 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        boolean boolean6 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean9 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str10 = superManager0.getPassword();
        boolean boolean13 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        boolean boolean6 = superManager0.authenticate("hi!", "");
        boolean boolean9 = superManager0.authenticate("hi!", "");
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        boolean boolean16 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str17 = superManager0.getPassword();
        java.lang.String str18 = superManager0.getEmail();
        java.lang.String str19 = superManager0.getEmail();
        java.lang.String str20 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "superadmin@parking.yorku.ca" + "'", str18.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "superadmin@parking.yorku.ca" + "'", str19.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.String str11 = superManager0.getPassword();
        boolean boolean14 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str14 = superManager0.getEmail();
        java.lang.String str15 = superManager0.getEmail();
        boolean boolean18 = superManager0.authenticate("hi!", "hi!");
        boolean boolean21 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str22 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "superadmin@parking.yorku.ca" + "'", str14.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        boolean boolean6 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean9 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str10 = superManager0.getEmail();
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "superadmin@parking.yorku.ca" + "'", str10.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "superadmin@parking.yorku.ca" + "'", str11.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "superadmin@parking.yorku.ca" + "'", str12.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        java.lang.String str9 = superManager0.getPassword();
        boolean boolean12 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean15 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "");
        java.lang.String str12 = superManager0.getPassword();
        java.lang.String str13 = superManager0.getEmail();
        boolean boolean16 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "superadmin@parking.yorku.ca" + "'", str13.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "hi!");
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean9 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        boolean boolean6 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean9 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean7 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        boolean boolean13 = superManager0.authenticate("hi!", "hi!");
        java.lang.String str14 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "superadmin@parking.yorku.ca" + "'", str14.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getPassword();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("", "");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getPassword();
        boolean boolean19 = superManager0.authenticate("hi!", "");
        java.lang.String str20 = superManager0.getEmail();
        boolean boolean23 = superManager0.authenticate("hi!", "hi!");
        java.lang.String str24 = superManager0.getPassword();
        java.lang.String str25 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "superadmin@parking.yorku.ca" + "'", str20.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("", "");
        java.lang.String str9 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        boolean boolean16 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str17 = superManager0.getPassword();
        java.lang.String str18 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass19 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str14 = superManager0.getPassword();
        boolean boolean17 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        boolean boolean20 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean7 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        java.lang.String str9 = superManager0.getPassword();
        boolean boolean12 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean15 = superManager0.authenticate("hi!", "");
        java.lang.String str16 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass17 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean9 = superManager0.authenticate("hi!", "");
        boolean boolean12 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean7 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        boolean boolean13 = superManager0.authenticate("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.String str11 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass12 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean7 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str8 = superManager0.getEmail();
        boolean boolean11 = superManager0.authenticate("", "");
        java.lang.String str12 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "superadmin@parking.yorku.ca" + "'", str12.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean7 = superManager0.authenticate("hi!", "");
        boolean boolean10 = superManager0.authenticate("", "");
        java.lang.String str11 = superManager0.getEmail();
        boolean boolean14 = superManager0.authenticate("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "superadmin@parking.yorku.ca" + "'", str11.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("", "");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getPassword();
        boolean boolean19 = superManager0.authenticate("hi!", "");
        java.lang.String str20 = superManager0.getEmail();
        boolean boolean23 = superManager0.authenticate("hi!", "hi!");
        java.lang.String str24 = superManager0.getEmail();
        java.lang.String str25 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "superadmin@parking.yorku.ca" + "'", str20.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "superadmin@parking.yorku.ca" + "'", str24.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        java.lang.String str11 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "superadmin@parking.yorku.ca" + "'", str11.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean7 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "");
        boolean boolean14 = superManager0.authenticate("", "");
        java.lang.String str15 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        boolean boolean6 = superManager0.authenticate("hi!", "");
        boolean boolean9 = superManager0.authenticate("hi!", "");
        java.lang.String str10 = superManager0.getEmail();
        java.lang.String str11 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "superadmin@parking.yorku.ca" + "'", str10.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        boolean boolean4 = superManager0.authenticate("hi!", "");
        boolean boolean7 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getPassword();
        boolean boolean18 = superManager0.authenticate("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean7 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean7 = superManager0.authenticate("hi!", "");
        java.lang.String str8 = superManager0.getEmail();
        boolean boolean11 = superManager0.authenticate("", "");
        java.lang.String str12 = superManager0.getEmail();
        boolean boolean15 = superManager0.authenticate("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "superadmin@parking.yorku.ca" + "'", str12.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean9 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "");
        boolean boolean14 = superManager0.authenticate("", "");
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean7 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "superadmin@parking.yorku.ca" + "'", str9.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getPassword();
        java.lang.String str16 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass17 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("", "");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass17 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("", "");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getPassword();
        boolean boolean19 = superManager0.authenticate("hi!", "");
        boolean boolean22 = superManager0.authenticate("", "hi!");
        java.lang.Class<?> wildcardClass23 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.String str11 = superManager0.getPassword();
        java.lang.String str12 = superManager0.getEmail();
        java.lang.String str13 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "superadmin@parking.yorku.ca" + "'", str12.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str11 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        java.lang.String str12 = superManager0.getPassword();
        boolean boolean15 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean18 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        java.lang.Class<?> wildcardClass19 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        java.lang.String str12 = superManager0.getPassword();
        boolean boolean15 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.Class<?> wildcardClass16 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        boolean boolean16 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean19 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        boolean boolean22 = superManager0.authenticate("", "");
        java.lang.Class<?> wildcardClass23 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "");
        boolean boolean17 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.String str18 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        java.lang.String str12 = superManager0.getPassword();
        boolean boolean15 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean18 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.String str19 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "superadmin@parking.yorku.ca" + "'", str19.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("", "");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getPassword();
        boolean boolean19 = superManager0.authenticate("hi!", "");
        java.lang.String str20 = superManager0.getEmail();
        boolean boolean23 = superManager0.authenticate("hi!", "hi!");
        java.lang.String str24 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass25 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "superadmin@parking.yorku.ca" + "'", str20.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "");
        java.lang.String str15 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean9 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        boolean boolean6 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean9 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        boolean boolean12 = superManager0.authenticate("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        boolean boolean16 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean19 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str20 = superManager0.getEmail();
        boolean boolean23 = superManager0.authenticate("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "superadmin@parking.yorku.ca" + "'", str20.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass16 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("", "");
        java.lang.String str9 = superManager0.getEmail();
        java.lang.String str10 = superManager0.getEmail();
        boolean boolean13 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "superadmin@parking.yorku.ca" + "'", str9.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "superadmin@parking.yorku.ca" + "'", str10.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("", "hi!");
        boolean boolean6 = superManager0.authenticate("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        java.lang.String str12 = superManager0.getEmail();
        java.lang.String str13 = superManager0.getEmail();
        java.lang.String str14 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "superadmin@parking.yorku.ca" + "'", str12.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "superadmin@parking.yorku.ca" + "'", str13.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        java.lang.String str12 = superManager0.getEmail();
        java.lang.String str13 = superManager0.getPassword();
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass16 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "superadmin@parking.yorku.ca" + "'", str12.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean7 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str14 = superManager0.getEmail();
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass17 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "superadmin@parking.yorku.ca" + "'", str14.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        boolean boolean6 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getEmail();
        java.lang.String str11 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "superadmin@parking.yorku.ca" + "'", str10.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        boolean boolean6 = superManager0.authenticate("hi!", "");
        boolean boolean9 = superManager0.authenticate("hi!", "");
        boolean boolean12 = superManager0.authenticate("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        boolean boolean6 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean9 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str10 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "superadmin@parking.yorku.ca" + "'", str10.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str9 = superManager0.getEmail();
        boolean boolean12 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str13 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "superadmin@parking.yorku.ca" + "'", str9.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "superadmin@parking.yorku.ca" + "'", str13.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        java.lang.String str11 = superManager0.getPassword();
        java.lang.String str12 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        boolean boolean16 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str17 = superManager0.getPassword();
        java.lang.String str18 = superManager0.getEmail();
        java.lang.String str19 = superManager0.getEmail();
        boolean boolean22 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "superadmin@parking.yorku.ca" + "'", str18.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "superadmin@parking.yorku.ca" + "'", str19.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        java.lang.String str12 = superManager0.getPassword();
        boolean boolean15 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str16 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getEmail();
        java.lang.String str17 = superManager0.getPassword();
        java.lang.String str18 = superManager0.getEmail();
        java.lang.String str19 = superManager0.getPassword();
        java.lang.String str20 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "superadmin@parking.yorku.ca" + "'", str18.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("", "");
        java.lang.String str9 = superManager0.getEmail();
        boolean boolean12 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        boolean boolean15 = superManager0.authenticate("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "superadmin@parking.yorku.ca" + "'", str9.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean7 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str8 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean9 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("", "hi!");
        java.lang.String str15 = superManager0.getPassword();
        boolean boolean18 = superManager0.authenticate("", "hi!");
        java.lang.Class<?> wildcardClass19 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean9 = superManager0.authenticate("hi!", "");
        java.lang.String str10 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        boolean boolean6 = superManager0.authenticate("hi!", "");
        boolean boolean9 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean12 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "");
        java.lang.String str12 = superManager0.getPassword();
        java.lang.String str13 = superManager0.getEmail();
        boolean boolean16 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "superadmin@parking.yorku.ca" + "'", str13.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getPassword();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        boolean boolean13 = superManager0.authenticate("", "hi!");
        java.lang.Class<?> wildcardClass14 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str14 = superManager0.getPassword();
        boolean boolean17 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        boolean boolean20 = superManager0.authenticate("hi!", "");
        java.lang.String str21 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        boolean boolean18 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.String str19 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean7 = superManager0.authenticate("hi!", "");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getEmail();
        java.lang.String str10 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "superadmin@parking.yorku.ca" + "'", str9.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "superadmin@parking.yorku.ca" + "'", str10.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getPassword();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        java.lang.String str11 = superManager0.getEmail();
        java.lang.String str12 = superManager0.getEmail();
        boolean boolean15 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str16 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass17 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "superadmin@parking.yorku.ca" + "'", str11.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "superadmin@parking.yorku.ca" + "'", str12.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getPassword();
        boolean boolean8 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("", "");
        java.lang.String str9 = superManager0.getEmail();
        boolean boolean12 = superManager0.authenticate("hi!", "");
        java.lang.String str13 = superManager0.getPassword();
        java.lang.String str14 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass15 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "superadmin@parking.yorku.ca" + "'", str9.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean7 = superManager0.authenticate("hi!", "");
        java.lang.String str8 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getEmail();
        java.lang.String str17 = superManager0.getPassword();
        java.lang.String str18 = superManager0.getEmail();
        boolean boolean21 = superManager0.authenticate("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "superadmin@parking.yorku.ca" + "'", str18.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean9 = superManager0.authenticate("hi!", "");
        boolean boolean12 = superManager0.authenticate("", "");
        java.lang.String str13 = superManager0.getPassword();
        java.lang.String str14 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "superadmin@parking.yorku.ca" + "'", str14.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        boolean boolean16 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str17 = superManager0.getPassword();
        java.lang.String str18 = superManager0.getPassword();
        java.lang.String str19 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("", "hi!");
        java.lang.String str15 = superManager0.getPassword();
        boolean boolean18 = superManager0.authenticate("", "hi!");
        java.lang.String str19 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getEmail();
        java.lang.String str17 = superManager0.getPassword();
        java.lang.String str18 = superManager0.getEmail();
        boolean boolean21 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "superadmin@parking.yorku.ca" + "'", str18.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean9 = superManager0.authenticate("hi!", "");
        boolean boolean12 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        boolean boolean15 = superManager0.authenticate("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getPassword();
        boolean boolean9 = superManager0.authenticate("hi!", "hi!");
        java.lang.String str10 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "superadmin@parking.yorku.ca" + "'", str10.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        boolean boolean6 = superManager0.authenticate("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        boolean boolean6 = superManager0.authenticate("hi!", "");
        boolean boolean9 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean12 = superManager0.authenticate("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("", "hi!");
        boolean boolean11 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getEmail();
        java.lang.String str17 = superManager0.getPassword();
        boolean boolean20 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        boolean boolean23 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str24 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("", "");
        java.lang.String str9 = superManager0.getEmail();
        boolean boolean12 = superManager0.authenticate("hi!", "");
        java.lang.String str13 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "superadmin@parking.yorku.ca" + "'", str9.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "superadmin@parking.yorku.ca" + "'", str13.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("", "");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getPassword();
        java.lang.String str17 = superManager0.getPassword();
        java.lang.String str18 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str14 = superManager0.getEmail();
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getEmail();
        java.lang.String str17 = superManager0.getEmail();
        java.lang.String str18 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "superadmin@parking.yorku.ca" + "'", str14.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "superadmin@parking.yorku.ca" + "'", str17.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "superadmin@parking.yorku.ca" + "'", str18.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getPassword();
        boolean boolean12 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("", "hi!");
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        boolean boolean13 = superManager0.authenticate("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        boolean boolean11 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        boolean boolean16 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean19 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        boolean boolean22 = superManager0.authenticate("", "");
        java.lang.String str23 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "superadmin@parking.yorku.ca" + "'", str23.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        boolean boolean7 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str8 = superManager0.getEmail();
        java.lang.String str9 = superManager0.getEmail();
        boolean boolean12 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str13 = superManager0.getEmail();
        java.lang.String str14 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "superadmin@parking.yorku.ca" + "'", str9.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "superadmin@parking.yorku.ca" + "'", str13.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "superadmin@parking.yorku.ca" + "'", str14.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        boolean boolean8 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean7 = superManager0.authenticate("hi!", "");
        java.lang.String str8 = superManager0.getEmail();
        boolean boolean11 = superManager0.authenticate("", "");
        java.lang.String str12 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "");
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getPassword();
        java.lang.String str17 = superManager0.getPassword();
        java.lang.String str18 = superManager0.getPassword();
        java.lang.String str19 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "superadmin@parking.yorku.ca" + "'", str19.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        boolean boolean6 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean9 = superManager0.authenticate("", "hi!");
        java.lang.String str10 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean7 = superManager0.authenticate("hi!", "");
        java.lang.String str8 = superManager0.getEmail();
        boolean boolean11 = superManager0.authenticate("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str9 = superManager0.getPassword();
        boolean boolean12 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.String str13 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "superadmin@parking.yorku.ca" + "'", str13.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "");
        java.lang.String str12 = superManager0.getPassword();
        boolean boolean15 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean18 = superManager0.authenticate("hi!", "");
        boolean boolean21 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getEmail();
        boolean boolean8 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        boolean boolean4 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        java.lang.String str5 = superManager0.getEmail();
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "superadmin@parking.yorku.ca" + "'", str5.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getPassword();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        java.lang.String str11 = superManager0.getEmail();
        boolean boolean14 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "superadmin@parking.yorku.ca" + "'", str11.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "hi!");
        java.lang.String str11 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getEmail();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        boolean boolean6 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "");
        boolean boolean13 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("", "");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        boolean boolean18 = superManager0.authenticate("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str14 = superManager0.getEmail();
        boolean boolean17 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean20 = superManager0.authenticate("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "superadmin@parking.yorku.ca" + "'", str14.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        boolean boolean8 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean11 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str14 = superManager0.getEmail();
        java.lang.String str15 = superManager0.getEmail();
        boolean boolean18 = superManager0.authenticate("hi!", "hi!");
        boolean boolean21 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        boolean boolean24 = superManager0.authenticate("", "");
        java.lang.String str25 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "superadmin@parking.yorku.ca" + "'", str14.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean7 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getPassword();
        java.lang.String str8 = superManager0.getPassword();
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "superadmin@parking.yorku.ca" + "'", str10.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str14 = superManager0.getEmail();
        java.lang.String str15 = superManager0.getEmail();
        boolean boolean18 = superManager0.authenticate("hi!", "hi!");
        java.lang.String str19 = superManager0.getPassword();
        java.lang.String str20 = superManager0.getEmail();
        java.lang.String str21 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "superadmin@parking.yorku.ca" + "'", str14.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "superadmin@parking.yorku.ca" + "'", str20.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str9 = superManager0.getPassword();
        java.lang.String str10 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass11 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean9 = superManager0.authenticate("hi!", "");
        boolean boolean12 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        boolean boolean15 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str16 = superManager0.getEmail();
        boolean boolean19 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean22 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        java.lang.String str23 = superManager0.getPassword();
        boolean boolean26 = superManager0.authenticate("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        boolean boolean6 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean9 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        boolean boolean12 = superManager0.authenticate("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean7 = superManager0.authenticate("hi!", "");
        java.lang.String str8 = superManager0.getEmail();
        boolean boolean11 = superManager0.authenticate("", "");
        java.lang.String str12 = superManager0.getEmail();
        java.lang.String str13 = superManager0.getPassword();
        java.lang.String str14 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "superadmin@parking.yorku.ca" + "'", str8.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "superadmin@parking.yorku.ca" + "'", str12.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean7 = superManager0.authenticate("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "superadmin@parking.yorku.ca" + "'", str4.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getEmail();
        java.lang.String str17 = superManager0.getEmail();
        java.lang.String str18 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "superadmin@parking.yorku.ca" + "'", str17.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        boolean boolean3 = superManager0.authenticate("hi!", "");
        boolean boolean6 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        boolean boolean9 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        java.lang.String str10 = superManager0.getPassword();
        java.lang.String str11 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "superadmin@parking.yorku.ca" + "'", str11.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getEmail();
        boolean boolean6 = superManager0.authenticate("hi!", "");
        boolean boolean9 = superManager0.authenticate("", "hi!");
        boolean boolean12 = superManager0.authenticate("", "hi!");
        boolean boolean15 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean18 = superManager0.authenticate("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "superadmin@parking.yorku.ca" + "'", str3.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean9 = superManager0.authenticate("hi!", "");
        boolean boolean12 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        boolean boolean15 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str16 = superManager0.getEmail();
        boolean boolean19 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean22 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        java.lang.String str23 = superManager0.getPassword();
        java.lang.String str24 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str14 = superManager0.getPassword();
        java.lang.String str15 = superManager0.getEmail();
        boolean boolean18 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getEmail();
        java.lang.String str17 = superManager0.getEmail();
        boolean boolean20 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        java.lang.String str21 = superManager0.getEmail();
        java.lang.String str22 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "superadmin@parking.yorku.ca" + "'", str17.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "superadmin@parking.yorku.ca" + "'", str21.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "superadmin@parking.yorku.ca" + "'", str22.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        boolean boolean16 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str17 = superManager0.getPassword();
        java.lang.String str18 = superManager0.getEmail();
        java.lang.String str19 = superManager0.getEmail();
        java.lang.String str20 = superManager0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "superadmin@parking.yorku.ca" + "'", str18.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "superadmin@parking.yorku.ca" + "'", str19.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "superadmin@parking.yorku.ca" + "'", str20.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        boolean boolean16 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str17 = superManager0.getPassword();
        java.lang.String str18 = superManager0.getEmail();
        java.lang.String str19 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "superadmin@parking.yorku.ca" + "'", str18.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getPassword();
        boolean boolean5 = superManager0.authenticate("", "hi!");
        java.lang.String str6 = superManager0.getEmail();
        boolean boolean9 = superManager0.authenticate("hi!", "");
        boolean boolean12 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        boolean boolean15 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        boolean boolean18 = superManager0.authenticate("", "");
        java.lang.String str19 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "");
        java.lang.String str12 = superManager0.getPassword();
        java.lang.String str13 = superManager0.getEmail();
        boolean boolean16 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean19 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "superadmin@parking.yorku.ca" + "'", str13.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.getPassword();
        boolean boolean6 = superManager0.authenticate("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "");
        java.lang.String str6 = superManager0.getEmail();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean10 = superManager0.authenticate("", "superadmin@parking.yorku.ca");
        boolean boolean13 = superManager0.authenticate("superadmin@parking.yorku.ca", "hi!");
        java.lang.String str14 = superManager0.getEmail();
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getPassword();
        java.lang.String str17 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "superadmin@parking.yorku.ca" + "'", str6.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "superadmin@parking.yorku.ca" + "'", str7.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "superadmin@parking.yorku.ca" + "'", str14.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "");
        java.lang.String str12 = superManager0.getPassword();
        java.lang.String str13 = superManager0.getEmail();
        java.lang.String str14 = superManager0.getEmail();
        java.lang.String str15 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "superadmin@parking.yorku.ca" + "'", str13.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "superadmin@parking.yorku.ca" + "'", str14.equals("superadmin@parking.yorku.ca"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        models.superManager.SuperManager superManager0 = models.superManager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        java.lang.String str2 = superManager0.getEmail();
        boolean boolean5 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        boolean boolean8 = superManager0.authenticate("hi!", "");
        boolean boolean11 = superManager0.authenticate("", "hi!");
        boolean boolean14 = superManager0.authenticate("hi!", "superadmin@parking.yorku.ca");
        java.lang.String str15 = superManager0.getEmail();
        java.lang.String str16 = superManager0.getEmail();
        java.lang.String str17 = superManager0.getEmail();
        boolean boolean20 = superManager0.authenticate("superadmin@parking.yorku.ca", "superadmin@parking.yorku.ca");
        java.lang.String str21 = superManager0.getEmail();
        java.lang.Class<?> wildcardClass22 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "superadmin@parking.yorku.ca" + "'", str1.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "superadmin@parking.yorku.ca" + "'", str2.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "superadmin@parking.yorku.ca" + "'", str15.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "superadmin@parking.yorku.ca" + "'", str16.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "superadmin@parking.yorku.ca" + "'", str17.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "superadmin@parking.yorku.ca" + "'", str21.equals("superadmin@parking.yorku.ca"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }
}

