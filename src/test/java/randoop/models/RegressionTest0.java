package randoop.models;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Throwable throwable1 = null;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("hi!", throwable1);
        java.lang.String str3 = parkingSystemException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.ParkingSystemException: hi!" + "'", str3.equals("models.ParkingSystemException: hi!"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException3);
        java.lang.Throwable[] throwableArray6 = parkingSystemException5.getSuppressed();
        java.lang.String str7 = parkingSystemException5.toString();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.ParkingSystemException: " + "'", str7.equals("models.ParkingSystemException: "));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException3);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException3.getErrorType();
        java.lang.Class<?> wildcardClass7 = errorType6.getClass();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException4);
        java.lang.String str8 = parkingSystemException7.toString();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str8.equals("models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        models.ParkingSystemException.ErrorType errorType0 = models.ParkingSystemException.ErrorType.VALIDATION;
        java.lang.Class<?> wildcardClass1 = errorType0.getClass();
        org.junit.Assert.assertTrue("'" + errorType0 + "' != '" + models.ParkingSystemException.ErrorType.VALIDATION + "'", errorType0.equals(models.ParkingSystemException.ErrorType.VALIDATION));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.Throwable throwable1 = null;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("hi!", throwable1);
        models.ParkingSystemException.ErrorType errorType3 = parkingSystemException2.getErrorType();
        java.lang.Class<?> wildcardClass4 = parkingSystemException2.getClass();
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType3.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4);
        java.lang.Class<?> wildcardClass6 = parkingSystemException5.getClass();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Throwable throwable1 = null;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("hi!", throwable1);
        models.ParkingSystemException.ErrorType errorType3 = parkingSystemException2.getErrorType();
        java.lang.String str4 = parkingSystemException2.toString();
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType3.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "models.ParkingSystemException: hi!" + "'", str4.equals("models.ParkingSystemException: hi!"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4);
        java.lang.String str6 = parkingSystemException5.toString();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: " + "'", str6.equals("models.ParkingSystemException: models.ParkingSystemException: "));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("", errorType1);
        java.lang.Class<?> wildcardClass3 = errorType1.getClass();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType1.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        models.ParkingSystemException parkingSystemException1 = new models.ParkingSystemException("");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("", errorType1);
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSystemException2.addSuppressed(throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType1.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType5);
        java.lang.Throwable throwable10 = null;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", throwable10);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException11);
        java.lang.Throwable[] throwableArray14 = parkingSystemException13.getSuppressed();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException13);
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType5, (java.lang.Throwable) parkingSystemException15);
        java.lang.String str17 = parkingSystemException16.toString();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: " + "'", str17.equals("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: "));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", errorType8);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException9);
        java.lang.Class<?> wildcardClass11 = parkingSystemException10.getClass();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable[] throwableArray8 = parkingSystemException7.getSuppressed();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType1, (java.lang.Throwable) parkingSystemException7);
        java.lang.Class<?> wildcardClass10 = errorType1.getClass();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType1.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("", errorType1);
        java.lang.Class<?> wildcardClass3 = errorType1.getClass();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType1.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", errorType7);
        java.lang.String str9 = parkingSystemException8.toString();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.ParkingSystemException: hi!" + "'", str9.equals("models.ParkingSystemException: hi!"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        models.ParkingSystemException parkingSystemException1 = new models.ParkingSystemException("models.ParkingSystemException: ");
        java.lang.Class<?> wildcardClass2 = parkingSystemException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException2);
        java.lang.Class<?> wildcardClass4 = parkingSystemException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable[] throwableArray8 = parkingSystemException7.getSuppressed();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType1, (java.lang.Throwable) parkingSystemException7);
        java.lang.Class<?> wildcardClass10 = parkingSystemException7.getClass();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType1.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        java.lang.Throwable[] throwableArray9 = parkingSystemException8.getSuppressed();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException8);
        java.lang.Throwable throwable14 = null;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", throwable14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType16);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", throwable21);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException22);
        java.lang.Throwable[] throwableArray25 = parkingSystemException24.getSuppressed();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType16, (java.lang.Throwable) parkingSystemException26);
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException.ErrorType errorType29 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType29);
        java.lang.String str31 = parkingSystemException30.toString();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertTrue("'" + errorType29 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType29.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: " + "'", str31.equals("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: "));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException2);
        java.lang.String str4 = parkingSystemException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: " + "'", str4.equals("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: "));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable[] throwableArray8 = parkingSystemException7.getSuppressed();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType1, (java.lang.Throwable) parkingSystemException7);
        java.lang.Class<?> wildcardClass10 = parkingSystemException9.getClass();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType1.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException2);
        java.lang.Class<?> wildcardClass4 = parkingSystemException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("", errorType1);
        java.lang.Class<?> wildcardClass3 = parkingSystemException2.getClass();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType1.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", errorType8);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException9);
        java.lang.String str11 = parkingSystemException9.toString();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.ParkingSystemException: hi!" + "'", str11.equals("models.ParkingSystemException: hi!"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4);
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        parkingSystemException5.addSuppressed((java.lang.Throwable) parkingSystemException8);
        java.lang.String str11 = parkingSystemException8.toString();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.ParkingSystemException: hi!" + "'", str11.equals("models.ParkingSystemException: hi!"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.VALIDATION;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("", errorType1);
        java.lang.String str3 = parkingSystemException2.toString();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.VALIDATION + "'", errorType1.equals(models.ParkingSystemException.ErrorType.VALIDATION));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.ParkingSystemException: " + "'", str3.equals("models.ParkingSystemException: "));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        models.ParkingSystemException.ErrorType errorType3 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        java.lang.Throwable[] throwableArray10 = parkingSystemException9.getSuppressed();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType3, (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable throwable15 = null;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", throwable15);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType17);
        java.lang.Throwable throwable22 = null;
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("hi!", throwable22);
        models.ParkingSystemException.ErrorType errorType24 = parkingSystemException23.getErrorType();
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException23);
        java.lang.Throwable[] throwableArray26 = parkingSystemException25.getSuppressed();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType17, (java.lang.Throwable) parkingSystemException27);
        parkingSystemException9.addSuppressed((java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException.ErrorType errorType30 = parkingSystemException9.getErrorType();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType30);
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException34);
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType30, (java.lang.Throwable) parkingSystemException35);
        java.lang.String str37 = parkingSystemException35.toString();
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType3.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType24.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType30.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str37.equals("models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException2);
        java.lang.String str4 = parkingSystemException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: " + "'", str4.equals("models.ParkingSystemException: models.ParkingSystemException: "));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", errorType10);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType10);
        java.lang.Throwable throwable17 = null;
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("hi!", throwable17);
        models.ParkingSystemException.ErrorType errorType19 = parkingSystemException18.getErrorType();
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException.ErrorType errorType21 = parkingSystemException18.getErrorType();
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", errorType21);
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException22);
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType10, (java.lang.Throwable) parkingSystemException23);
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("hi!", errorType10);
        java.lang.Class<?> wildcardClass26 = parkingSystemException25.getClass();
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType19.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType21.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException5);
        java.lang.Class<?> wildcardClass8 = parkingSystemException7.getClass();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        models.ParkingSystemException.ErrorType errorType4 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException8);
        java.lang.Throwable[] throwableArray11 = parkingSystemException10.getSuppressed();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType4, (java.lang.Throwable) parkingSystemException10);
        java.lang.Throwable throwable16 = null;
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("hi!", throwable16);
        models.ParkingSystemException.ErrorType errorType18 = parkingSystemException17.getErrorType();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType18);
        java.lang.Throwable throwable23 = null;
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("hi!", throwable23);
        models.ParkingSystemException.ErrorType errorType25 = parkingSystemException24.getErrorType();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        java.lang.Throwable[] throwableArray27 = parkingSystemException26.getSuppressed();
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType18, (java.lang.Throwable) parkingSystemException28);
        parkingSystemException10.addSuppressed((java.lang.Throwable) parkingSystemException28);
        models.ParkingSystemException.ErrorType errorType31 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType31);
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException35);
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType31, (java.lang.Throwable) parkingSystemException36);
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("hi!", errorType31);
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType4.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType18.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType25.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertTrue("'" + errorType31 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType31.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", errorType8);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException9);
        java.lang.String str11 = parkingSystemException10.toString();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str11.equals("models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8);
        java.lang.Throwable throwable13 = null;
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("hi!", throwable13);
        models.ParkingSystemException.ErrorType errorType15 = parkingSystemException14.getErrorType();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException14);
        java.lang.Throwable[] throwableArray17 = parkingSystemException16.getSuppressed();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("", errorType8);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType8, throwable21);
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", throwable21);
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType15.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", errorType9);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType9);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType9);
        models.ParkingSystemException.ErrorType errorType13 = parkingSystemException12.getErrorType();
        java.lang.Throwable[] throwableArray14 = parkingSystemException12.getSuppressed();
        java.lang.Class<?> wildcardClass15 = throwableArray14.getClass();
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType13.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType6);
        java.lang.Throwable throwable11 = null;
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("hi!", throwable11);
        models.ParkingSystemException.ErrorType errorType13 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable[] throwableArray15 = parkingSystemException14.getSuppressed();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException14);
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType6, (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable22 = null;
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("hi!", throwable22);
        models.ParkingSystemException.ErrorType errorType24 = parkingSystemException23.getErrorType();
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException23);
        parkingSystemException19.addSuppressed((java.lang.Throwable) parkingSystemException25);
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType6, (java.lang.Throwable) parkingSystemException19);
        java.lang.Throwable[] throwableArray28 = parkingSystemException19.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType13.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType24.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", errorType8);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable throwable14 = null;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", throwable14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException15);
        java.lang.Throwable[] throwableArray18 = parkingSystemException17.getSuppressed();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException17);
        parkingSystemException10.addSuppressed((java.lang.Throwable) parkingSystemException17);
        java.lang.Throwable[] throwableArray21 = parkingSystemException17.getSuppressed();
        java.lang.Class<?> wildcardClass22 = throwableArray21.getClass();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", errorType10);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType10);
        java.lang.Throwable throwable17 = null;
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("hi!", throwable17);
        models.ParkingSystemException.ErrorType errorType19 = parkingSystemException18.getErrorType();
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException.ErrorType errorType21 = parkingSystemException18.getErrorType();
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", errorType21);
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException22);
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType10, (java.lang.Throwable) parkingSystemException23);
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("hi!", errorType10);
        java.lang.Class<?> wildcardClass26 = errorType10.getClass();
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType19.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType21.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        java.lang.Throwable[] throwableArray4 = parkingSystemException3.getSuppressed();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException3);
        java.lang.Throwable[] throwableArray6 = parkingSystemException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType2.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4);
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        parkingSystemException5.addSuppressed((java.lang.Throwable) parkingSystemException8);
        java.lang.Class<?> wildcardClass11 = parkingSystemException5.getClass();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException3);
        java.lang.Throwable[] throwableArray6 = parkingSystemException3.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        models.ParkingSystemException parkingSystemException1 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable[] throwableArray8 = parkingSystemException5.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException3);
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException3);
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException9);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException9);
        parkingSystemException3.addSuppressed((java.lang.Throwable) parkingSystemException11);
        java.lang.Class<?> wildcardClass13 = parkingSystemException11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType5);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType5);
        java.lang.Class<?> wildcardClass8 = parkingSystemException7.getClass();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable[] throwableArray8 = parkingSystemException7.getSuppressed();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType1, (java.lang.Throwable) parkingSystemException7);
        java.lang.String str10 = parkingSystemException9.toString();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType1.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: " + "'", str10.equals("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: "));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.Throwable throwable1 = null;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: hi!", throwable1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable[] throwableArray8 = parkingSystemException7.getSuppressed();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType1, (java.lang.Throwable) parkingSystemException7);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: ");
        parkingSystemException7.addSuppressed((java.lang.Throwable) parkingSystemException11);
        java.lang.String str13 = parkingSystemException7.toString();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType1.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "models.ParkingSystemException: " + "'", str13.equals("models.ParkingSystemException: "));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("", errorType1);
        java.lang.Throwable[] throwableArray3 = parkingSystemException2.getSuppressed();
        models.ParkingSystemException.ErrorType errorType6 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", errorType6);
        java.lang.Throwable throwable10 = null;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", throwable10);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException11);
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType6, (java.lang.Throwable) parkingSystemException11);
        parkingSystemException2.addSuppressed((java.lang.Throwable) parkingSystemException14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException14.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType1.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType6.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType16.equals(models.ParkingSystemException.ErrorType.CONFLICT));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        models.ParkingSystemException.ErrorType errorType3 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType3);
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("", errorType3);
        java.lang.Throwable throwable8 = null;
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", throwable8);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException9.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable[] throwableArray12 = parkingSystemException11.getSuppressed();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType3, (java.lang.Throwable) parkingSystemException11);
        java.lang.String str14 = parkingSystemException13.toString();
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType3.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str14.equals("models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("", errorType1);
        models.ParkingSystemException.ErrorType errorType5 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable8 = null;
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", throwable8);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException9.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable[] throwableArray12 = parkingSystemException11.getSuppressed();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType5, (java.lang.Throwable) parkingSystemException11);
        java.lang.Throwable throwable17 = null;
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("hi!", throwable17);
        models.ParkingSystemException.ErrorType errorType19 = parkingSystemException18.getErrorType();
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType19);
        java.lang.Throwable throwable24 = null;
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("hi!", throwable24);
        models.ParkingSystemException.ErrorType errorType26 = parkingSystemException25.getErrorType();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        java.lang.Throwable[] throwableArray28 = parkingSystemException27.getSuppressed();
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType19, (java.lang.Throwable) parkingSystemException29);
        parkingSystemException11.addSuppressed((java.lang.Throwable) parkingSystemException29);
        models.ParkingSystemException.ErrorType errorType32 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType32);
        java.lang.Throwable[] throwableArray34 = parkingSystemException33.getSuppressed();
        parkingSystemException2.addSuppressed((java.lang.Throwable) parkingSystemException33);
        models.ParkingSystemException.ErrorType errorType36 = parkingSystemException33.getErrorType();
        java.lang.String str37 = parkingSystemException33.toString();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType1.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType5.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType19.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType26.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType32.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertTrue("'" + errorType36 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType36.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: " + "'", str37.equals("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: "));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        java.lang.Throwable[] throwableArray9 = parkingSystemException8.getSuppressed();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException8);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", (java.lang.Throwable) parkingSystemException8);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable throwable12 = null;
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("hi!", throwable12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException13);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType16);
        java.lang.Throwable throwable23 = null;
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("hi!", throwable23);
        models.ParkingSystemException.ErrorType errorType25 = parkingSystemException24.getErrorType();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType25);
        java.lang.Throwable throwable30 = null;
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("hi!", throwable30);
        models.ParkingSystemException.ErrorType errorType32 = parkingSystemException31.getErrorType();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException31);
        java.lang.Throwable[] throwableArray34 = parkingSystemException33.getSuppressed();
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException33);
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType25, (java.lang.Throwable) parkingSystemException35);
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("", errorType25);
        java.lang.Throwable throwable38 = null;
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType25, throwable38);
        parkingSystemException17.addSuppressed((java.lang.Throwable) parkingSystemException39);
        java.lang.Throwable[] throwableArray41 = parkingSystemException17.getSuppressed();
        models.ParkingSystemException parkingSystemException42 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException17);
        parkingSystemException5.addSuppressed((java.lang.Throwable) parkingSystemException42);
        java.lang.String str44 = parkingSystemException42.toString();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType25.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType32.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: " + "'", str44.equals("models.ParkingSystemException: models.ParkingSystemException: "));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        models.ParkingSystemException.ErrorType errorType3 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType3);
        models.ParkingSystemException.ErrorType errorType6 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable9 = null;
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", throwable9);
        models.ParkingSystemException.ErrorType errorType11 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException10);
        java.lang.Throwable[] throwableArray13 = parkingSystemException12.getSuppressed();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType6, (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType3, (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException.ErrorType errorType17 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType17);
        java.lang.Throwable[] throwableArray19 = parkingSystemException18.getSuppressed();
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType3, (java.lang.Throwable) parkingSystemException18);
        java.lang.Class<?> wildcardClass21 = errorType3.getClass();
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType3.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType6.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType11.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType17.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType6);
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType6);
        java.lang.Throwable[] throwableArray9 = parkingSystemException8.getSuppressed();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException8);
        java.lang.String str11 = parkingSystemException8.toString();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str11.equals("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException4.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType6);
        java.lang.Throwable throwable11 = null;
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("hi!", throwable11);
        models.ParkingSystemException.ErrorType errorType13 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable[] throwableArray15 = parkingSystemException14.getSuppressed();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException14);
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType6, (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable22 = null;
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("hi!", throwable22);
        models.ParkingSystemException.ErrorType errorType24 = parkingSystemException23.getErrorType();
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException23);
        parkingSystemException19.addSuppressed((java.lang.Throwable) parkingSystemException25);
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType6, (java.lang.Throwable) parkingSystemException19);
        java.lang.Throwable[] throwableArray28 = parkingSystemException27.getSuppressed();
        java.lang.Throwable[] throwableArray29 = parkingSystemException27.getSuppressed();
        java.lang.String str30 = parkingSystemException27.toString();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType13.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType24.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str30.equals("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        models.ParkingSystemException.ErrorType errorType6 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable9 = null;
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", throwable9);
        models.ParkingSystemException.ErrorType errorType11 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException10);
        java.lang.Throwable[] throwableArray13 = parkingSystemException12.getSuppressed();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType6, (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable throwable18 = null;
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("hi!", throwable18);
        models.ParkingSystemException.ErrorType errorType20 = parkingSystemException19.getErrorType();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType20);
        java.lang.Throwable throwable25 = null;
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("hi!", throwable25);
        models.ParkingSystemException.ErrorType errorType27 = parkingSystemException26.getErrorType();
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException26);
        java.lang.Throwable[] throwableArray29 = parkingSystemException28.getSuppressed();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException28);
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType20, (java.lang.Throwable) parkingSystemException30);
        parkingSystemException12.addSuppressed((java.lang.Throwable) parkingSystemException30);
        models.ParkingSystemException.ErrorType errorType33 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType33);
        java.lang.Throwable[] throwableArray35 = parkingSystemException34.getSuppressed();
        parkingSystemException3.addSuppressed((java.lang.Throwable) parkingSystemException34);
        models.ParkingSystemException.ErrorType errorType37 = parkingSystemException34.getErrorType();
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType37);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType6.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType11.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType20.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType27 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType27.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + errorType33 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType33.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertTrue("'" + errorType37 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType37.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.VALIDATION;
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType9);
        java.lang.Throwable throwable14 = null;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", throwable14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException15);
        java.lang.Throwable[] throwableArray18 = parkingSystemException17.getSuppressed();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException17);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType9, (java.lang.Throwable) parkingSystemException19);
        models.ParkingSystemException.ErrorType errorType21 = parkingSystemException20.getErrorType();
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType2);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.VALIDATION + "'", errorType2.equals(models.ParkingSystemException.ErrorType.VALIDATION));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType21.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        models.ParkingSystemException.ErrorType errorType5 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable8 = null;
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", throwable8);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException9.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable[] throwableArray12 = parkingSystemException11.getSuppressed();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType5, (java.lang.Throwable) parkingSystemException11);
        java.lang.Throwable throwable17 = null;
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("hi!", throwable17);
        models.ParkingSystemException.ErrorType errorType19 = parkingSystemException18.getErrorType();
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType19);
        java.lang.Throwable throwable24 = null;
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("hi!", throwable24);
        models.ParkingSystemException.ErrorType errorType26 = parkingSystemException25.getErrorType();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        java.lang.Throwable[] throwableArray28 = parkingSystemException27.getSuppressed();
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType19, (java.lang.Throwable) parkingSystemException29);
        parkingSystemException11.addSuppressed((java.lang.Throwable) parkingSystemException29);
        models.ParkingSystemException.ErrorType errorType32 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType32);
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException36);
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType32, (java.lang.Throwable) parkingSystemException37);
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType32);
        java.lang.Throwable throwable44 = null;
        models.ParkingSystemException parkingSystemException45 = new models.ParkingSystemException("hi!", throwable44);
        models.ParkingSystemException.ErrorType errorType46 = parkingSystemException45.getErrorType();
        models.ParkingSystemException parkingSystemException47 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException45);
        models.ParkingSystemException.ErrorType errorType48 = parkingSystemException45.getErrorType();
        models.ParkingSystemException parkingSystemException49 = new models.ParkingSystemException("hi!", errorType48);
        models.ParkingSystemException parkingSystemException50 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException49);
        java.lang.Throwable throwable54 = null;
        models.ParkingSystemException parkingSystemException55 = new models.ParkingSystemException("hi!", throwable54);
        models.ParkingSystemException.ErrorType errorType56 = parkingSystemException55.getErrorType();
        models.ParkingSystemException parkingSystemException57 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException55);
        java.lang.Throwable[] throwableArray58 = parkingSystemException57.getSuppressed();
        models.ParkingSystemException parkingSystemException59 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException57);
        parkingSystemException50.addSuppressed((java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException parkingSystemException61 = new models.ParkingSystemException("", errorType32, (java.lang.Throwable) parkingSystemException50);
        java.lang.Class<?> wildcardClass62 = parkingSystemException61.getClass();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType5.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType19.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType26.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType32.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType46 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType46.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType48 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType48.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType56 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType56.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable[] throwableArray8 = parkingSystemException7.getSuppressed();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        models.ParkingSystemException.ErrorType errorType11 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("", errorType11);
        java.lang.Throwable[] throwableArray13 = parkingSystemException12.getSuppressed();
        parkingSystemException7.addSuppressed((java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable[] throwableArray16 = parkingSystemException15.getSuppressed();
        java.lang.String str17 = parkingSystemException15.toString();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType11.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str17.equals("models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType1);
        java.lang.Throwable[] throwableArray3 = parkingSystemException2.getSuppressed();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException7);
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException7);
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException13);
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException13);
        parkingSystemException7.addSuppressed((java.lang.Throwable) parkingSystemException15);
        parkingSystemException2.addSuppressed((java.lang.Throwable) parkingSystemException15);
        java.lang.Throwable throwable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSystemException2.addSuppressed(throwable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType1.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        models.ParkingSystemException.ErrorType errorType3 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("", errorType3);
        java.lang.Throwable[] throwableArray5 = parkingSystemException4.getSuppressed();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException6);
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType3.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", errorType9);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType9);
        java.lang.Throwable throwable16 = null;
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("hi!", throwable16);
        models.ParkingSystemException.ErrorType errorType18 = parkingSystemException17.getErrorType();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException17);
        models.ParkingSystemException.ErrorType errorType20 = parkingSystemException17.getErrorType();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("hi!", errorType20);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException21);
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType9, (java.lang.Throwable) parkingSystemException22);
        java.lang.Class<?> wildcardClass24 = parkingSystemException22.getClass();
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType18.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType20.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        java.lang.Throwable[] throwableArray7 = parkingSystemException6.getSuppressed();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        java.lang.Class<?> wildcardClass9 = parkingSystemException8.getClass();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("", errorType1);
        java.lang.Throwable[] throwableArray3 = parkingSystemException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = parkingSystemException2.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType1.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException3);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException5.getErrorType();
        java.lang.String str8 = parkingSystemException5.toString();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.ParkingSystemException: " + "'", str8.equals("models.ParkingSystemException: "));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4);
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        parkingSystemException5.addSuppressed((java.lang.Throwable) parkingSystemException8);
        java.lang.Throwable[] throwableArray11 = parkingSystemException8.getSuppressed();
        java.lang.Throwable[] throwableArray12 = parkingSystemException8.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable throwable12 = null;
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("hi!", throwable12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException13);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType16);
        java.lang.Throwable throwable23 = null;
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("hi!", throwable23);
        models.ParkingSystemException.ErrorType errorType25 = parkingSystemException24.getErrorType();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType25);
        java.lang.Throwable throwable30 = null;
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("hi!", throwable30);
        models.ParkingSystemException.ErrorType errorType32 = parkingSystemException31.getErrorType();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException31);
        java.lang.Throwable[] throwableArray34 = parkingSystemException33.getSuppressed();
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException33);
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType25, (java.lang.Throwable) parkingSystemException35);
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("", errorType25);
        java.lang.Throwable throwable38 = null;
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType25, throwable38);
        parkingSystemException17.addSuppressed((java.lang.Throwable) parkingSystemException39);
        java.lang.Throwable[] throwableArray41 = parkingSystemException17.getSuppressed();
        models.ParkingSystemException parkingSystemException42 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException17);
        parkingSystemException5.addSuppressed((java.lang.Throwable) parkingSystemException42);
        java.lang.Class<?> wildcardClass44 = parkingSystemException5.getClass();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType25.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType32.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", errorType8);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable[] throwableArray11 = parkingSystemException9.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType7);
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType7);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("", errorType7);
        models.ParkingSystemException.ErrorType errorType12 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable15 = null;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", throwable15);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        java.lang.Throwable[] throwableArray19 = parkingSystemException18.getSuppressed();
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType12, (java.lang.Throwable) parkingSystemException18);
        parkingSystemException10.addSuppressed((java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException22);
        models.ParkingSystemException.ErrorType errorType24 = parkingSystemException23.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType12.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType24.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException3);
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        parkingSystemException4.addSuppressed((java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", errorType8, (java.lang.Throwable) parkingSystemException14);
        java.lang.String str16 = parkingSystemException15.toString();
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "models.ParkingSystemException: hi!" + "'", str16.equals("models.ParkingSystemException: hi!"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.DATA_ACCESS;
        models.ParkingSystemException.ErrorType errorType4 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4);
        models.ParkingSystemException.ErrorType errorType7 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable10 = null;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", throwable10);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException11);
        java.lang.Throwable[] throwableArray14 = parkingSystemException13.getSuppressed();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType7, (java.lang.Throwable) parkingSystemException13);
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType4, (java.lang.Throwable) parkingSystemException13);
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType1, (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException.ErrorType errorType18 = parkingSystemException17.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.DATA_ACCESS + "'", errorType1.equals(models.ParkingSystemException.ErrorType.DATA_ACCESS));
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType4.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType7.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + models.ParkingSystemException.ErrorType.DATA_ACCESS + "'", errorType18.equals(models.ParkingSystemException.ErrorType.DATA_ACCESS));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType4);
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType4);
        java.lang.String str7 = parkingSystemException6.toString();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str7.equals("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException2);
        java.lang.Throwable[] throwableArray4 = parkingSystemException3.getSuppressed();
        java.lang.String str5 = parkingSystemException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str5.equals("models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.BUSINESS_LOGIC;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType1);
        models.ParkingSystemException.ErrorType errorType3 = parkingSystemException2.getErrorType();
        java.lang.Class<?> wildcardClass4 = errorType3.getClass();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.BUSINESS_LOGIC + "'", errorType1.equals(models.ParkingSystemException.ErrorType.BUSINESS_LOGIC));
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.BUSINESS_LOGIC + "'", errorType3.equals(models.ParkingSystemException.ErrorType.BUSINESS_LOGIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType7);
        java.lang.Throwable throwable14 = null;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", throwable14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType16);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", throwable21);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException22);
        java.lang.Throwable[] throwableArray25 = parkingSystemException24.getSuppressed();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType16, (java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", errorType16);
        java.lang.Throwable throwable29 = null;
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType16, throwable29);
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException30);
        java.lang.Throwable[] throwableArray32 = parkingSystemException8.getSuppressed();
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException35);
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        parkingSystemException36.addSuppressed((java.lang.Throwable) parkingSystemException38);
        models.ParkingSystemException.ErrorType errorType40 = parkingSystemException38.getErrorType();
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException38);
        java.lang.String str42 = parkingSystemException8.toString();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + errorType40 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType40.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str42.equals("models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType5);
        java.lang.Throwable throwable10 = null;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", throwable10);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException11);
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException11);
        java.lang.Throwable[] throwableArray15 = parkingSystemException14.getSuppressed();
        java.lang.Throwable throwable19 = null;
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("hi!", throwable19);
        models.ParkingSystemException.ErrorType errorType21 = parkingSystemException20.getErrorType();
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType21);
        java.lang.Throwable throwable24 = null;
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("hi!", throwable24);
        models.ParkingSystemException.ErrorType errorType26 = parkingSystemException25.getErrorType();
        parkingSystemException22.addSuppressed((java.lang.Throwable) parkingSystemException25);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException22);
        parkingSystemException14.addSuppressed((java.lang.Throwable) parkingSystemException28);
        parkingSystemException6.addSuppressed((java.lang.Throwable) parkingSystemException28);
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("hi!", (java.lang.Throwable) parkingSystemException6);
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType21.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType26.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException4);
        java.lang.Throwable[] throwableArray8 = parkingSystemException7.getSuppressed();
        java.lang.Class<?> wildcardClass9 = parkingSystemException7.getClass();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4);
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType4);
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable[] throwableArray8 = parkingSystemException7.getSuppressed();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType1, (java.lang.Throwable) parkingSystemException7);
        java.lang.Throwable throwable13 = null;
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("hi!", throwable13);
        models.ParkingSystemException.ErrorType errorType15 = parkingSystemException14.getErrorType();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType15);
        java.lang.Throwable throwable20 = null;
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("hi!", throwable20);
        models.ParkingSystemException.ErrorType errorType22 = parkingSystemException21.getErrorType();
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException21);
        java.lang.Throwable[] throwableArray24 = parkingSystemException23.getSuppressed();
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException23);
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType15, (java.lang.Throwable) parkingSystemException25);
        parkingSystemException7.addSuppressed((java.lang.Throwable) parkingSystemException25);
        java.lang.Throwable[] throwableArray28 = parkingSystemException25.getSuppressed();
        models.ParkingSystemException.ErrorType errorType29 = parkingSystemException25.getErrorType();
        java.lang.String str30 = parkingSystemException25.toString();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType1.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType15.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType22.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertTrue("'" + errorType29 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType29.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "models.ParkingSystemException: " + "'", str30.equals("models.ParkingSystemException: "));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType9);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType9);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException11);
        models.ParkingSystemException.ErrorType errorType13 = parkingSystemException11.getErrorType();
        java.lang.Throwable[] throwableArray14 = parkingSystemException11.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType13.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        models.ParkingSystemException parkingSystemException1 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType2 = parkingSystemException1.getErrorType();
        models.ParkingSystemException.ErrorType errorType4 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4);
        java.lang.Throwable throwable9 = null;
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", throwable9);
        models.ParkingSystemException.ErrorType errorType11 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException10);
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException10);
        parkingSystemException5.addSuppressed((java.lang.Throwable) parkingSystemException10);
        parkingSystemException1.addSuppressed((java.lang.Throwable) parkingSystemException10);
        java.lang.String str16 = parkingSystemException10.toString();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType2.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType4.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType11.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "models.ParkingSystemException: hi!" + "'", str16.equals("models.ParkingSystemException: hi!"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        models.ParkingSystemException.ErrorType errorType6 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable9 = null;
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", throwable9);
        models.ParkingSystemException.ErrorType errorType11 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException10);
        java.lang.Throwable[] throwableArray13 = parkingSystemException12.getSuppressed();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType6, (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable throwable18 = null;
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("hi!", throwable18);
        models.ParkingSystemException.ErrorType errorType20 = parkingSystemException19.getErrorType();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType20);
        java.lang.Throwable throwable25 = null;
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("hi!", throwable25);
        models.ParkingSystemException.ErrorType errorType27 = parkingSystemException26.getErrorType();
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException26);
        java.lang.Throwable[] throwableArray29 = parkingSystemException28.getSuppressed();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException28);
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType20, (java.lang.Throwable) parkingSystemException30);
        parkingSystemException12.addSuppressed((java.lang.Throwable) parkingSystemException30);
        models.ParkingSystemException.ErrorType errorType33 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType33);
        java.lang.Throwable[] throwableArray35 = parkingSystemException34.getSuppressed();
        parkingSystemException3.addSuppressed((java.lang.Throwable) parkingSystemException34);
        models.ParkingSystemException.ErrorType errorType37 = parkingSystemException34.getErrorType();
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException34);
        java.lang.String str39 = parkingSystemException38.toString();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType6.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType11.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType20.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType27 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType27.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + errorType33 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType33.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertTrue("'" + errorType37 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType37.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: " + "'", str39.equals("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: "));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Throwable throwable1 = null;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("hi!", throwable1);
        models.ParkingSystemException.ErrorType errorType3 = parkingSystemException2.getErrorType();
        java.lang.Class<?> wildcardClass4 = errorType3.getClass();
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType3.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable[] throwableArray8 = parkingSystemException7.getSuppressed();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType1, (java.lang.Throwable) parkingSystemException7);
        java.lang.Throwable throwable13 = null;
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("hi!", throwable13);
        models.ParkingSystemException.ErrorType errorType15 = parkingSystemException14.getErrorType();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType15);
        java.lang.Throwable throwable20 = null;
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("hi!", throwable20);
        models.ParkingSystemException.ErrorType errorType22 = parkingSystemException21.getErrorType();
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException21);
        java.lang.Throwable[] throwableArray24 = parkingSystemException23.getSuppressed();
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException23);
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType15, (java.lang.Throwable) parkingSystemException25);
        parkingSystemException7.addSuppressed((java.lang.Throwable) parkingSystemException25);
        java.lang.String str28 = parkingSystemException25.toString();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType1.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType15.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType22.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "models.ParkingSystemException: " + "'", str28.equals("models.ParkingSystemException: "));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        models.ParkingSystemException.ErrorType errorType4 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4);
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", errorType4);
        java.lang.Throwable throwable9 = null;
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", throwable9);
        models.ParkingSystemException.ErrorType errorType11 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException10);
        java.lang.Throwable[] throwableArray13 = parkingSystemException12.getSuppressed();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType4, (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException12);
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType4.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType11.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType5);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType5);
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType5, (java.lang.Throwable) parkingSystemException9);
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType2);
        java.lang.Throwable[] throwableArray4 = parkingSystemException3.getSuppressed();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", (java.lang.Throwable) parkingSystemException3);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType2.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable throwable12 = null;
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("hi!", throwable12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException13);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType16);
        java.lang.Throwable throwable23 = null;
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("hi!", throwable23);
        models.ParkingSystemException.ErrorType errorType25 = parkingSystemException24.getErrorType();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType25);
        java.lang.Throwable throwable30 = null;
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("hi!", throwable30);
        models.ParkingSystemException.ErrorType errorType32 = parkingSystemException31.getErrorType();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException31);
        java.lang.Throwable[] throwableArray34 = parkingSystemException33.getSuppressed();
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException33);
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType25, (java.lang.Throwable) parkingSystemException35);
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("", errorType25);
        java.lang.Throwable throwable38 = null;
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType25, throwable38);
        parkingSystemException17.addSuppressed((java.lang.Throwable) parkingSystemException39);
        java.lang.Throwable[] throwableArray41 = parkingSystemException17.getSuppressed();
        models.ParkingSystemException parkingSystemException42 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException17);
        parkingSystemException5.addSuppressed((java.lang.Throwable) parkingSystemException42);
        java.lang.Class<?> wildcardClass44 = parkingSystemException42.getClass();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType25.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType32.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException3);
        java.lang.Throwable[] throwableArray6 = parkingSystemException3.getSuppressed();
        java.lang.Class<?> wildcardClass7 = parkingSystemException3.getClass();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        java.lang.Throwable[] throwableArray9 = parkingSystemException8.getSuppressed();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException8);
        java.lang.Throwable throwable14 = null;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", throwable14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType16);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", throwable21);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException22);
        java.lang.Throwable[] throwableArray25 = parkingSystemException24.getSuppressed();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType16, (java.lang.Throwable) parkingSystemException26);
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException.ErrorType errorType29 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType29);
        java.lang.Throwable[] throwableArray31 = parkingSystemException30.getSuppressed();
        java.lang.Class<?> wildcardClass32 = parkingSystemException30.getClass();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertTrue("'" + errorType29 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType29.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        models.ParkingSystemException parkingSystemException1 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", errorType9);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType9);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("hi!", errorType9);
        java.lang.Throwable throwable16 = null;
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("hi!", throwable16);
        models.ParkingSystemException.ErrorType errorType18 = parkingSystemException17.getErrorType();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException17);
        models.ParkingSystemException.ErrorType errorType20 = parkingSystemException17.getErrorType();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType20);
        java.lang.Throwable throwable27 = null;
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("hi!", throwable27);
        models.ParkingSystemException.ErrorType errorType29 = parkingSystemException28.getErrorType();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType29);
        java.lang.Throwable throwable34 = null;
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("hi!", throwable34);
        models.ParkingSystemException.ErrorType errorType36 = parkingSystemException35.getErrorType();
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException35);
        java.lang.Throwable[] throwableArray38 = parkingSystemException37.getSuppressed();
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException37);
        models.ParkingSystemException parkingSystemException40 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType29, (java.lang.Throwable) parkingSystemException39);
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("", errorType29);
        java.lang.Throwable throwable42 = null;
        models.ParkingSystemException parkingSystemException43 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType29, throwable42);
        parkingSystemException21.addSuppressed((java.lang.Throwable) parkingSystemException43);
        java.lang.Throwable throwable49 = null;
        models.ParkingSystemException parkingSystemException50 = new models.ParkingSystemException("hi!", throwable49);
        models.ParkingSystemException.ErrorType errorType51 = parkingSystemException50.getErrorType();
        models.ParkingSystemException parkingSystemException52 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType51);
        models.ParkingSystemException parkingSystemException53 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType51);
        java.lang.Throwable[] throwableArray54 = parkingSystemException53.getSuppressed();
        models.ParkingSystemException parkingSystemException55 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException53);
        parkingSystemException21.addSuppressed((java.lang.Throwable) parkingSystemException53);
        parkingSystemException12.addSuppressed((java.lang.Throwable) parkingSystemException53);
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType18.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType20.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType29 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType29.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType36 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType36.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertTrue("'" + errorType51 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType51.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray54);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType5);
        java.lang.Throwable throwable8 = null;
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", throwable8);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException9.getErrorType();
        parkingSystemException6.addSuppressed((java.lang.Throwable) parkingSystemException9);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException6);
        java.lang.Throwable[] throwableArray13 = parkingSystemException12.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!");
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", errorType6);
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException7);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException3);
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        parkingSystemException4.addSuppressed((java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable[] throwableArray8 = parkingSystemException7.getSuppressed();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType1, (java.lang.Throwable) parkingSystemException7);
        java.lang.Throwable[] throwableArray10 = parkingSystemException9.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType1.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("", errorType1);
        models.ParkingSystemException.ErrorType errorType3 = parkingSystemException2.getErrorType();
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException2.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType1.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType3.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType4.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException3);
        java.lang.Throwable[] throwableArray6 = parkingSystemException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = parkingSystemException5.getSuppressed();
        java.lang.Class<?> wildcardClass8 = parkingSystemException5.getClass();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        java.lang.Throwable[] throwableArray7 = parkingSystemException6.getSuppressed();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException6);
        java.lang.String str9 = parkingSystemException8.toString();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str9.equals("models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException3);
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        parkingSystemException4.addSuppressed((java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException4.getErrorType();
        models.ParkingSystemException.ErrorType errorType10 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable13 = null;
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("hi!", throwable13);
        models.ParkingSystemException.ErrorType errorType15 = parkingSystemException14.getErrorType();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException14);
        java.lang.Throwable[] throwableArray17 = parkingSystemException16.getSuppressed();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType10, (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: ");
        parkingSystemException16.addSuppressed((java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType8, (java.lang.Throwable) parkingSystemException16);
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType10.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType15.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        java.lang.Throwable[] throwableArray9 = parkingSystemException8.getSuppressed();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException8);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: ");
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException12);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8);
        java.lang.Throwable throwable13 = null;
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("hi!", throwable13);
        models.ParkingSystemException.ErrorType errorType15 = parkingSystemException14.getErrorType();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException14);
        java.lang.Throwable[] throwableArray17 = parkingSystemException16.getSuppressed();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("", errorType8);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType8, throwable21);
        models.ParkingSystemException.ErrorType errorType25 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", errorType25);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType29 = parkingSystemException28.getErrorType();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType25, (java.lang.Throwable) parkingSystemException28);
        java.lang.Throwable throwable35 = null;
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("hi!", throwable35);
        models.ParkingSystemException.ErrorType errorType37 = parkingSystemException36.getErrorType();
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException36);
        models.ParkingSystemException.ErrorType errorType39 = parkingSystemException36.getErrorType();
        models.ParkingSystemException parkingSystemException40 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType39);
        java.lang.Throwable throwable46 = null;
        models.ParkingSystemException parkingSystemException47 = new models.ParkingSystemException("hi!", throwable46);
        models.ParkingSystemException.ErrorType errorType48 = parkingSystemException47.getErrorType();
        models.ParkingSystemException parkingSystemException49 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType48);
        java.lang.Throwable throwable53 = null;
        models.ParkingSystemException parkingSystemException54 = new models.ParkingSystemException("hi!", throwable53);
        models.ParkingSystemException.ErrorType errorType55 = parkingSystemException54.getErrorType();
        models.ParkingSystemException parkingSystemException56 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException54);
        java.lang.Throwable[] throwableArray57 = parkingSystemException56.getSuppressed();
        models.ParkingSystemException parkingSystemException58 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException56);
        models.ParkingSystemException parkingSystemException59 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType48, (java.lang.Throwable) parkingSystemException58);
        models.ParkingSystemException parkingSystemException60 = new models.ParkingSystemException("", errorType48);
        java.lang.Throwable throwable61 = null;
        models.ParkingSystemException parkingSystemException62 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType48, throwable61);
        parkingSystemException40.addSuppressed((java.lang.Throwable) parkingSystemException62);
        java.lang.Throwable[] throwableArray64 = parkingSystemException40.getSuppressed();
        models.ParkingSystemException parkingSystemException65 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException40);
        parkingSystemException28.addSuppressed((java.lang.Throwable) parkingSystemException65);
        models.ParkingSystemException parkingSystemException67 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException65);
        java.lang.Class<?> wildcardClass68 = errorType8.getClass();
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType15.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType25.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType29 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType29.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType37 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType37.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType39 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType39.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType48 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType48.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType55 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType55.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.Throwable throwable1 = null;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("", throwable1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        models.ParkingSystemException.ErrorType errorType3 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType3);
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("", errorType3);
        java.lang.Throwable throwable8 = null;
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", throwable8);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException9.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable[] throwableArray12 = parkingSystemException11.getSuppressed();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType3, (java.lang.Throwable) parkingSystemException11);
        models.ParkingSystemException.ErrorType errorType16 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("", errorType16);
        java.lang.Throwable throwable20 = null;
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("hi!", throwable20);
        models.ParkingSystemException.ErrorType errorType22 = parkingSystemException21.getErrorType();
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException21);
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType16, (java.lang.Throwable) parkingSystemException21);
        java.lang.Throwable[] throwableArray25 = parkingSystemException24.getSuppressed();
        parkingSystemException11.addSuppressed((java.lang.Throwable) parkingSystemException24);
        java.lang.Throwable throwable34 = null;
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("hi!", throwable34);
        models.ParkingSystemException.ErrorType errorType36 = parkingSystemException35.getErrorType();
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException35);
        models.ParkingSystemException.ErrorType errorType38 = parkingSystemException35.getErrorType();
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("hi!", errorType38);
        models.ParkingSystemException parkingSystemException40 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType38);
        java.lang.Throwable throwable45 = null;
        models.ParkingSystemException parkingSystemException46 = new models.ParkingSystemException("hi!", throwable45);
        models.ParkingSystemException.ErrorType errorType47 = parkingSystemException46.getErrorType();
        models.ParkingSystemException parkingSystemException48 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException46);
        models.ParkingSystemException.ErrorType errorType49 = parkingSystemException46.getErrorType();
        models.ParkingSystemException parkingSystemException50 = new models.ParkingSystemException("hi!", errorType49);
        models.ParkingSystemException parkingSystemException51 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException50);
        models.ParkingSystemException parkingSystemException52 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType38, (java.lang.Throwable) parkingSystemException51);
        models.ParkingSystemException parkingSystemException53 = new models.ParkingSystemException("hi!", errorType38);
        models.ParkingSystemException parkingSystemException57 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException58 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException parkingSystemException59 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException parkingSystemException63 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException64 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException63);
        models.ParkingSystemException parkingSystemException65 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException63);
        parkingSystemException57.addSuppressed((java.lang.Throwable) parkingSystemException65);
        models.ParkingSystemException parkingSystemException67 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType38, (java.lang.Throwable) parkingSystemException57);
        parkingSystemException24.addSuppressed((java.lang.Throwable) parkingSystemException67);
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType3.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType16.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType22.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertTrue("'" + errorType36 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType36.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType38 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType38.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType47 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType47.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType49 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType49.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType2);
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("", errorType2);
        java.lang.String str5 = parkingSystemException4.toString();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType2.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "models.ParkingSystemException: " + "'", str5.equals("models.ParkingSystemException: "));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType5);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType5);
        java.lang.String str8 = parkingSystemException7.toString();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str8.equals("models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType7);
        java.lang.Throwable throwable12 = null;
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("hi!", throwable12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException13);
        java.lang.Throwable[] throwableArray16 = parkingSystemException15.getSuppressed();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException15);
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType7, (java.lang.Throwable) parkingSystemException17);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable23 = null;
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("hi!", throwable23);
        models.ParkingSystemException.ErrorType errorType25 = parkingSystemException24.getErrorType();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        parkingSystemException20.addSuppressed((java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType7, (java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException.ErrorType errorType30 = parkingSystemException20.getErrorType();
        java.lang.Throwable[] throwableArray31 = parkingSystemException20.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType25.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType30.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType5);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType5);
        java.lang.Class<?> wildcardClass8 = errorType5.getClass();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        models.ParkingSystemException.ErrorType errorType1 = null;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType9);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType9);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException11);
        models.ParkingSystemException.ErrorType errorType13 = parkingSystemException11.getErrorType();
        models.ParkingSystemException.ErrorType errorType17 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType17);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("", errorType17);
        java.lang.Throwable throwable22 = null;
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("hi!", throwable22);
        models.ParkingSystemException.ErrorType errorType24 = parkingSystemException23.getErrorType();
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException23);
        java.lang.Throwable[] throwableArray26 = parkingSystemException25.getSuppressed();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType17, (java.lang.Throwable) parkingSystemException25);
        models.ParkingSystemException.ErrorType errorType30 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("", errorType30);
        java.lang.Throwable throwable34 = null;
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("hi!", throwable34);
        models.ParkingSystemException.ErrorType errorType36 = parkingSystemException35.getErrorType();
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException35);
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType30, (java.lang.Throwable) parkingSystemException35);
        java.lang.Throwable[] throwableArray39 = parkingSystemException38.getSuppressed();
        parkingSystemException25.addSuppressed((java.lang.Throwable) parkingSystemException38);
        parkingSystemException11.addSuppressed((java.lang.Throwable) parkingSystemException38);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType13.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType17.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType24.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType30.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType36 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType36.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        models.ParkingSystemException parkingSystemException1 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType2 = parkingSystemException1.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType2.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType5);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType5);
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", errorType5);
        java.lang.Throwable[] throwableArray9 = parkingSystemException8.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        models.ParkingSystemException.ErrorType errorType6 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable9 = null;
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", throwable9);
        models.ParkingSystemException.ErrorType errorType11 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException10);
        java.lang.Throwable[] throwableArray13 = parkingSystemException12.getSuppressed();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType6, (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable throwable18 = null;
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("hi!", throwable18);
        models.ParkingSystemException.ErrorType errorType20 = parkingSystemException19.getErrorType();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType20);
        java.lang.Throwable throwable25 = null;
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("hi!", throwable25);
        models.ParkingSystemException.ErrorType errorType27 = parkingSystemException26.getErrorType();
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException26);
        java.lang.Throwable[] throwableArray29 = parkingSystemException28.getSuppressed();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException28);
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType20, (java.lang.Throwable) parkingSystemException30);
        parkingSystemException12.addSuppressed((java.lang.Throwable) parkingSystemException30);
        models.ParkingSystemException.ErrorType errorType33 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType33);
        java.lang.Throwable[] throwableArray35 = parkingSystemException34.getSuppressed();
        parkingSystemException3.addSuppressed((java.lang.Throwable) parkingSystemException34);
        models.ParkingSystemException.ErrorType errorType37 = parkingSystemException34.getErrorType();
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException34);
        java.lang.Class<?> wildcardClass39 = parkingSystemException34.getClass();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType6.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType11.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType20.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType27 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType27.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + errorType33 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType33.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertTrue("'" + errorType37 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType37.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", errorType8);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType8);
        java.lang.Class<?> wildcardClass11 = errorType8.getClass();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType5);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType5);
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", errorType5);
        java.lang.Class<?> wildcardClass9 = errorType5.getClass();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.Throwable throwable1 = null;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("hi!", throwable1);
        models.ParkingSystemException.ErrorType errorType3 = parkingSystemException2.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException6);
        parkingSystemException2.addSuppressed((java.lang.Throwable) parkingSystemException7);
        models.ParkingSystemException.ErrorType errorType10 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("", errorType10);
        models.ParkingSystemException.ErrorType errorType14 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable17 = null;
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("hi!", throwable17);
        models.ParkingSystemException.ErrorType errorType19 = parkingSystemException18.getErrorType();
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException18);
        java.lang.Throwable[] throwableArray21 = parkingSystemException20.getSuppressed();
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType14, (java.lang.Throwable) parkingSystemException20);
        java.lang.Throwable throwable26 = null;
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("hi!", throwable26);
        models.ParkingSystemException.ErrorType errorType28 = parkingSystemException27.getErrorType();
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType28);
        java.lang.Throwable throwable33 = null;
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("hi!", throwable33);
        models.ParkingSystemException.ErrorType errorType35 = parkingSystemException34.getErrorType();
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException34);
        java.lang.Throwable[] throwableArray37 = parkingSystemException36.getSuppressed();
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException36);
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType28, (java.lang.Throwable) parkingSystemException38);
        parkingSystemException20.addSuppressed((java.lang.Throwable) parkingSystemException38);
        models.ParkingSystemException.ErrorType errorType41 = parkingSystemException20.getErrorType();
        models.ParkingSystemException parkingSystemException42 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType41);
        java.lang.Throwable[] throwableArray43 = parkingSystemException42.getSuppressed();
        parkingSystemException11.addSuppressed((java.lang.Throwable) parkingSystemException42);
        parkingSystemException7.addSuppressed((java.lang.Throwable) parkingSystemException42);
        java.lang.Throwable[] throwableArray46 = parkingSystemException7.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType3.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType10.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType14.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType19.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertTrue("'" + errorType28 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType28.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType35 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType35.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertTrue("'" + errorType41 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType41.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray46);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", errorType9);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType9);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException11);
        java.lang.Throwable[] throwableArray13 = parkingSystemException11.getSuppressed();
        java.lang.Throwable[] throwableArray14 = parkingSystemException11.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType5);
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType5, throwable7);
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("hi!");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException2);
        java.lang.Class<?> wildcardClass4 = parkingSystemException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8);
        java.lang.Throwable throwable13 = null;
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("hi!", throwable13);
        models.ParkingSystemException.ErrorType errorType15 = parkingSystemException14.getErrorType();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException14);
        java.lang.Throwable[] throwableArray17 = parkingSystemException16.getSuppressed();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable24 = null;
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("hi!", throwable24);
        models.ParkingSystemException.ErrorType errorType26 = parkingSystemException25.getErrorType();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        parkingSystemException21.addSuppressed((java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType8, (java.lang.Throwable) parkingSystemException21);
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType8);
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType8);
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType15.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType26.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.BUSINESS_LOGIC;
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType1, throwable2);
        java.lang.Class<?> wildcardClass4 = errorType1.getClass();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.BUSINESS_LOGIC + "'", errorType1.equals(models.ParkingSystemException.ErrorType.BUSINESS_LOGIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType5);
        models.ParkingSystemException.ErrorType errorType8 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8);
        java.lang.Throwable[] throwableArray10 = parkingSystemException9.getSuppressed();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException14);
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException14);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException20);
        parkingSystemException14.addSuppressed((java.lang.Throwable) parkingSystemException22);
        parkingSystemException9.addSuppressed((java.lang.Throwable) parkingSystemException22);
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType5, (java.lang.Throwable) parkingSystemException22);
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType8.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        models.ParkingSystemException parkingSystemException1 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        models.ParkingSystemException.ErrorType errorType3 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        java.lang.Throwable[] throwableArray10 = parkingSystemException9.getSuppressed();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType3, (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable throwable15 = null;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", throwable15);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType17);
        java.lang.Throwable throwable22 = null;
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("hi!", throwable22);
        models.ParkingSystemException.ErrorType errorType24 = parkingSystemException23.getErrorType();
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException23);
        java.lang.Throwable[] throwableArray26 = parkingSystemException25.getSuppressed();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType17, (java.lang.Throwable) parkingSystemException27);
        parkingSystemException9.addSuppressed((java.lang.Throwable) parkingSystemException27);
        parkingSystemException1.addSuppressed((java.lang.Throwable) parkingSystemException9);
        java.lang.Class<?> wildcardClass31 = parkingSystemException9.getClass();
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType3.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType24.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.Throwable throwable8 = null;
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", throwable8);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException9.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType10);
        java.lang.Throwable throwable15 = null;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", throwable15);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        java.lang.Throwable[] throwableArray19 = parkingSystemException18.getSuppressed();
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType10, (java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable26 = null;
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("hi!", throwable26);
        models.ParkingSystemException.ErrorType errorType28 = parkingSystemException27.getErrorType();
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException27);
        parkingSystemException23.addSuppressed((java.lang.Throwable) parkingSystemException29);
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType10, (java.lang.Throwable) parkingSystemException23);
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType10);
        models.ParkingSystemException.ErrorType errorType34 = models.ParkingSystemException.ErrorType.BUSINESS_LOGIC;
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType34);
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType10, (java.lang.Throwable) parkingSystemException35);
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException36);
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException37);
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + errorType28 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType28.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType34 + "' != '" + models.ParkingSystemException.ErrorType.BUSINESS_LOGIC + "'", errorType34.equals(models.ParkingSystemException.ErrorType.BUSINESS_LOGIC));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType2);
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("", errorType2);
        java.lang.Throwable[] throwableArray5 = parkingSystemException4.getSuppressed();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!");
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException8);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException9.getErrorType();
        java.lang.Throwable throwable16 = null;
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("hi!", throwable16);
        models.ParkingSystemException.ErrorType errorType18 = parkingSystemException17.getErrorType();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException17);
        models.ParkingSystemException.ErrorType errorType20 = parkingSystemException17.getErrorType();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("hi!", errorType20);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType20);
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException22);
        parkingSystemException9.addSuppressed((java.lang.Throwable) parkingSystemException23);
        models.ParkingSystemException.ErrorType errorType25 = parkingSystemException23.getErrorType();
        parkingSystemException4.addSuppressed((java.lang.Throwable) parkingSystemException23);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType2.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType18.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType20.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType25.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8);
        java.lang.Throwable throwable13 = null;
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("hi!", throwable13);
        models.ParkingSystemException.ErrorType errorType15 = parkingSystemException14.getErrorType();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException14);
        java.lang.Throwable[] throwableArray17 = parkingSystemException16.getSuppressed();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable24 = null;
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("hi!", throwable24);
        models.ParkingSystemException.ErrorType errorType26 = parkingSystemException25.getErrorType();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        parkingSystemException21.addSuppressed((java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType8, (java.lang.Throwable) parkingSystemException21);
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8);
        java.lang.Throwable throwable34 = null;
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("hi!", throwable34);
        models.ParkingSystemException.ErrorType errorType36 = parkingSystemException35.getErrorType();
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException35);
        models.ParkingSystemException.ErrorType errorType38 = parkingSystemException35.getErrorType();
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType38);
        java.lang.Throwable throwable45 = null;
        models.ParkingSystemException parkingSystemException46 = new models.ParkingSystemException("hi!", throwable45);
        models.ParkingSystemException.ErrorType errorType47 = parkingSystemException46.getErrorType();
        models.ParkingSystemException parkingSystemException48 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType47);
        java.lang.Throwable throwable52 = null;
        models.ParkingSystemException parkingSystemException53 = new models.ParkingSystemException("hi!", throwable52);
        models.ParkingSystemException.ErrorType errorType54 = parkingSystemException53.getErrorType();
        models.ParkingSystemException parkingSystemException55 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException53);
        java.lang.Throwable[] throwableArray56 = parkingSystemException55.getSuppressed();
        models.ParkingSystemException parkingSystemException57 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException55);
        models.ParkingSystemException parkingSystemException58 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType47, (java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException parkingSystemException59 = new models.ParkingSystemException("", errorType47);
        java.lang.Throwable throwable60 = null;
        models.ParkingSystemException parkingSystemException61 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType47, throwable60);
        parkingSystemException39.addSuppressed((java.lang.Throwable) parkingSystemException61);
        models.ParkingSystemException parkingSystemException63 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException61);
        models.ParkingSystemException.ErrorType errorType64 = parkingSystemException63.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType15.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType26.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType36 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType36.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType38 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType38.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType47 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType47.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType54 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType54.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertTrue("'" + errorType64 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType64.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8);
        java.lang.Throwable throwable13 = null;
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("hi!", throwable13);
        models.ParkingSystemException.ErrorType errorType15 = parkingSystemException14.getErrorType();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException14);
        java.lang.Throwable[] throwableArray17 = parkingSystemException16.getSuppressed();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("", errorType8);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType8, throwable21);
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", errorType8);
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType15.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType7);
        java.lang.Throwable throwable14 = null;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", throwable14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType16);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", throwable21);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException22);
        java.lang.Throwable[] throwableArray25 = parkingSystemException24.getSuppressed();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType16, (java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", errorType16);
        java.lang.Throwable throwable29 = null;
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType16, throwable29);
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException30);
        java.lang.Throwable[] throwableArray32 = parkingSystemException8.getSuppressed();
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException35);
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        parkingSystemException36.addSuppressed((java.lang.Throwable) parkingSystemException38);
        models.ParkingSystemException.ErrorType errorType40 = parkingSystemException38.getErrorType();
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException38);
        java.lang.Throwable[] throwableArray42 = parkingSystemException38.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + errorType40 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType40.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType5);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType5);
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", errorType5);
        java.lang.String str9 = parkingSystemException8.toString();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.ParkingSystemException: " + "'", str9.equals("models.ParkingSystemException: "));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException3);
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException3);
        java.lang.String str6 = parkingSystemException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: " + "'", str6.equals("models.ParkingSystemException: models.ParkingSystemException: "));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", errorType9);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType9);
        java.lang.Throwable throwable16 = null;
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("hi!", throwable16);
        models.ParkingSystemException.ErrorType errorType18 = parkingSystemException17.getErrorType();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException17);
        models.ParkingSystemException.ErrorType errorType20 = parkingSystemException17.getErrorType();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("hi!", errorType20);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException21);
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType9, (java.lang.Throwable) parkingSystemException22);
        java.lang.String str24 = parkingSystemException23.toString();
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType18.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType20.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: " + "'", str24.equals("models.ParkingSystemException: models.ParkingSystemException: "));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", errorType9);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType9);
        models.ParkingSystemException.ErrorType errorType14 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("", errorType14);
        java.lang.Throwable throwable18 = null;
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("hi!", throwable18);
        models.ParkingSystemException.ErrorType errorType20 = parkingSystemException19.getErrorType();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException19);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType14, (java.lang.Throwable) parkingSystemException19);
        java.lang.Throwable[] throwableArray23 = parkingSystemException22.getSuppressed();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType9, (java.lang.Throwable) parkingSystemException22);
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType14.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType20.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.SYSTEM_ERROR;
        models.ParkingSystemException.ErrorType errorType4 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException8);
        java.lang.Throwable[] throwableArray11 = parkingSystemException10.getSuppressed();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType4, (java.lang.Throwable) parkingSystemException10);
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", throwable21);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType23);
        java.lang.Throwable throwable28 = null;
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("hi!", throwable28);
        models.ParkingSystemException.ErrorType errorType30 = parkingSystemException29.getErrorType();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException29);
        java.lang.Throwable[] throwableArray32 = parkingSystemException31.getSuppressed();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException31);
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType23, (java.lang.Throwable) parkingSystemException33);
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("", errorType23);
        java.lang.Throwable throwable36 = null;
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType23, throwable36);
        models.ParkingSystemException.ErrorType errorType40 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("", errorType40);
        models.ParkingSystemException parkingSystemException43 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType44 = parkingSystemException43.getErrorType();
        models.ParkingSystemException parkingSystemException45 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType40, (java.lang.Throwable) parkingSystemException43);
        java.lang.Throwable throwable50 = null;
        models.ParkingSystemException parkingSystemException51 = new models.ParkingSystemException("hi!", throwable50);
        models.ParkingSystemException.ErrorType errorType52 = parkingSystemException51.getErrorType();
        models.ParkingSystemException parkingSystemException53 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException51);
        models.ParkingSystemException.ErrorType errorType54 = parkingSystemException51.getErrorType();
        models.ParkingSystemException parkingSystemException55 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType54);
        java.lang.Throwable throwable61 = null;
        models.ParkingSystemException parkingSystemException62 = new models.ParkingSystemException("hi!", throwable61);
        models.ParkingSystemException.ErrorType errorType63 = parkingSystemException62.getErrorType();
        models.ParkingSystemException parkingSystemException64 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType63);
        java.lang.Throwable throwable68 = null;
        models.ParkingSystemException parkingSystemException69 = new models.ParkingSystemException("hi!", throwable68);
        models.ParkingSystemException.ErrorType errorType70 = parkingSystemException69.getErrorType();
        models.ParkingSystemException parkingSystemException71 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException69);
        java.lang.Throwable[] throwableArray72 = parkingSystemException71.getSuppressed();
        models.ParkingSystemException parkingSystemException73 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException71);
        models.ParkingSystemException parkingSystemException74 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType63, (java.lang.Throwable) parkingSystemException73);
        models.ParkingSystemException parkingSystemException75 = new models.ParkingSystemException("", errorType63);
        java.lang.Throwable throwable76 = null;
        models.ParkingSystemException parkingSystemException77 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType63, throwable76);
        parkingSystemException55.addSuppressed((java.lang.Throwable) parkingSystemException77);
        java.lang.Throwable[] throwableArray79 = parkingSystemException55.getSuppressed();
        models.ParkingSystemException parkingSystemException80 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException55);
        parkingSystemException43.addSuppressed((java.lang.Throwable) parkingSystemException80);
        models.ParkingSystemException parkingSystemException82 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType23, (java.lang.Throwable) parkingSystemException80);
        models.ParkingSystemException parkingSystemException86 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType87 = parkingSystemException86.getErrorType();
        models.ParkingSystemException parkingSystemException88 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType87);
        models.ParkingSystemException parkingSystemException89 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType87);
        models.ParkingSystemException parkingSystemException90 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", errorType23, (java.lang.Throwable) parkingSystemException89);
        models.ParkingSystemException parkingSystemException91 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType2, (java.lang.Throwable) parkingSystemException89);
        java.lang.String str92 = parkingSystemException89.toString();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType2.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType4.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType30.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + errorType40 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType40.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType44 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType44.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType52 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType52.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType54 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType54.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType63 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType63.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType70 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType70.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertTrue("'" + errorType87 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType87.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str92.equals("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException2);
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException8);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException8);
        java.lang.Throwable[] throwableArray12 = parkingSystemException11.getSuppressed();
        parkingSystemException3.addSuppressed((java.lang.Throwable) parkingSystemException11);
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        java.lang.Throwable throwable10 = null;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", throwable10);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException11);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", errorType14);
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType14);
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType4, (java.lang.Throwable) parkingSystemException16);
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        models.ParkingSystemException.ErrorType errorType4 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException8);
        java.lang.Throwable[] throwableArray11 = parkingSystemException10.getSuppressed();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType4, (java.lang.Throwable) parkingSystemException10);
        java.lang.Throwable throwable16 = null;
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("hi!", throwable16);
        models.ParkingSystemException.ErrorType errorType18 = parkingSystemException17.getErrorType();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType18);
        java.lang.Throwable throwable23 = null;
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("hi!", throwable23);
        models.ParkingSystemException.ErrorType errorType25 = parkingSystemException24.getErrorType();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        java.lang.Throwable[] throwableArray27 = parkingSystemException26.getSuppressed();
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType18, (java.lang.Throwable) parkingSystemException28);
        parkingSystemException10.addSuppressed((java.lang.Throwable) parkingSystemException28);
        models.ParkingSystemException.ErrorType errorType31 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType31);
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException35);
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType31, (java.lang.Throwable) parkingSystemException36);
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType31);
        java.lang.Throwable[] throwableArray39 = parkingSystemException38.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType4.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType18.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType25.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertTrue("'" + errorType31 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType31.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType6);
        java.lang.Throwable throwable11 = null;
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("hi!", throwable11);
        models.ParkingSystemException.ErrorType errorType13 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable[] throwableArray15 = parkingSystemException14.getSuppressed();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException14);
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType6, (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", errorType6);
        java.lang.Class<?> wildcardClass19 = parkingSystemException18.getClass();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType13.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException6);
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        java.lang.Throwable throwable10 = null;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", throwable10);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException11);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", errorType14);
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType14);
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException16);
        parkingSystemException3.addSuppressed((java.lang.Throwable) parkingSystemException17);
        models.ParkingSystemException.ErrorType errorType19 = parkingSystemException17.getErrorType();
        java.lang.Class<?> wildcardClass20 = parkingSystemException17.getClass();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType19.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", errorType10);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType10);
        java.lang.Throwable throwable17 = null;
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("hi!", throwable17);
        models.ParkingSystemException.ErrorType errorType19 = parkingSystemException18.getErrorType();
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException.ErrorType errorType21 = parkingSystemException18.getErrorType();
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", errorType21);
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException22);
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType10, (java.lang.Throwable) parkingSystemException23);
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException23);
        java.lang.Throwable throwable26 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSystemException25.addSuppressed(throwable26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType19.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType21.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        java.lang.Throwable[] throwableArray7 = parkingSystemException6.getSuppressed();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        java.lang.Throwable[] throwableArray9 = parkingSystemException6.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException3);
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException4);
        java.lang.Class<?> wildcardClass6 = parkingSystemException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.VALIDATION;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        models.ParkingSystemException.ErrorType errorType5 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", errorType5);
        models.ParkingSystemException.ErrorType errorType9 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable12 = null;
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("hi!", throwable12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException13);
        java.lang.Throwable[] throwableArray16 = parkingSystemException15.getSuppressed();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType9, (java.lang.Throwable) parkingSystemException15);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", throwable21);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType23);
        java.lang.Throwable throwable28 = null;
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("hi!", throwable28);
        models.ParkingSystemException.ErrorType errorType30 = parkingSystemException29.getErrorType();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException29);
        java.lang.Throwable[] throwableArray32 = parkingSystemException31.getSuppressed();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException31);
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType23, (java.lang.Throwable) parkingSystemException33);
        parkingSystemException15.addSuppressed((java.lang.Throwable) parkingSystemException33);
        models.ParkingSystemException.ErrorType errorType36 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType36);
        java.lang.Throwable[] throwableArray38 = parkingSystemException37.getSuppressed();
        parkingSystemException6.addSuppressed((java.lang.Throwable) parkingSystemException37);
        models.ParkingSystemException.ErrorType errorType40 = parkingSystemException37.getErrorType();
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException37);
        java.lang.Class<?> wildcardClass42 = parkingSystemException37.getClass();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.VALIDATION + "'", errorType2.equals(models.ParkingSystemException.ErrorType.VALIDATION));
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType5.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType9.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType30.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + errorType36 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType36.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertTrue("'" + errorType40 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType40.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType6);
        java.lang.Throwable throwable11 = null;
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("hi!", throwable11);
        models.ParkingSystemException.ErrorType errorType13 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable[] throwableArray15 = parkingSystemException14.getSuppressed();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException14);
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType6, (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException.ErrorType errorType18 = parkingSystemException17.getErrorType();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("hi!", errorType18);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType13.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType18.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8);
        java.lang.Throwable throwable13 = null;
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("hi!", throwable13);
        models.ParkingSystemException.ErrorType errorType15 = parkingSystemException14.getErrorType();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException14);
        java.lang.Throwable[] throwableArray17 = parkingSystemException16.getSuppressed();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("", errorType8);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType8, throwable21);
        models.ParkingSystemException.ErrorType errorType25 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", errorType25);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType29 = parkingSystemException28.getErrorType();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType25, (java.lang.Throwable) parkingSystemException28);
        java.lang.Throwable throwable35 = null;
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("hi!", throwable35);
        models.ParkingSystemException.ErrorType errorType37 = parkingSystemException36.getErrorType();
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException36);
        models.ParkingSystemException.ErrorType errorType39 = parkingSystemException36.getErrorType();
        models.ParkingSystemException parkingSystemException40 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType39);
        java.lang.Throwable throwable46 = null;
        models.ParkingSystemException parkingSystemException47 = new models.ParkingSystemException("hi!", throwable46);
        models.ParkingSystemException.ErrorType errorType48 = parkingSystemException47.getErrorType();
        models.ParkingSystemException parkingSystemException49 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType48);
        java.lang.Throwable throwable53 = null;
        models.ParkingSystemException parkingSystemException54 = new models.ParkingSystemException("hi!", throwable53);
        models.ParkingSystemException.ErrorType errorType55 = parkingSystemException54.getErrorType();
        models.ParkingSystemException parkingSystemException56 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException54);
        java.lang.Throwable[] throwableArray57 = parkingSystemException56.getSuppressed();
        models.ParkingSystemException parkingSystemException58 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException56);
        models.ParkingSystemException parkingSystemException59 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType48, (java.lang.Throwable) parkingSystemException58);
        models.ParkingSystemException parkingSystemException60 = new models.ParkingSystemException("", errorType48);
        java.lang.Throwable throwable61 = null;
        models.ParkingSystemException parkingSystemException62 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType48, throwable61);
        parkingSystemException40.addSuppressed((java.lang.Throwable) parkingSystemException62);
        java.lang.Throwable[] throwableArray64 = parkingSystemException40.getSuppressed();
        models.ParkingSystemException parkingSystemException65 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException40);
        parkingSystemException28.addSuppressed((java.lang.Throwable) parkingSystemException65);
        models.ParkingSystemException parkingSystemException67 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException65);
        java.lang.Class<?> wildcardClass68 = parkingSystemException67.getClass();
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType15.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType25.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType29 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType29.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType37 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType37.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType39 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType39.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType48 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType48.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType55 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType55.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType7);
        java.lang.Throwable throwable12 = null;
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("hi!", throwable12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException13);
        java.lang.Throwable[] throwableArray16 = parkingSystemException15.getSuppressed();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException15);
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType7, (java.lang.Throwable) parkingSystemException17);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable23 = null;
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("hi!", throwable23);
        models.ParkingSystemException.ErrorType errorType25 = parkingSystemException24.getErrorType();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        parkingSystemException20.addSuppressed((java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType7, (java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType7);
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType25.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.SYSTEM_ERROR;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType1);
        java.lang.Throwable[] throwableArray3 = parkingSystemException2.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType1.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType5);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType5);
        java.lang.Throwable[] throwableArray8 = parkingSystemException7.getSuppressed();
        java.lang.Throwable throwable10 = null;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", throwable10);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException11.getErrorType();
        parkingSystemException7.addSuppressed((java.lang.Throwable) parkingSystemException11);
        java.lang.Class<?> wildcardClass14 = parkingSystemException7.getClass();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        java.lang.Throwable throwable11 = null;
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("hi!", throwable11);
        models.ParkingSystemException.ErrorType errorType13 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException.ErrorType errorType15 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", errorType15);
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType15);
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException17);
        parkingSystemException4.addSuppressed((java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException.ErrorType errorType20 = parkingSystemException18.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!");
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        models.ParkingSystemException.ErrorType errorType26 = parkingSystemException25.getErrorType();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", errorType26);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", errorType20, (java.lang.Throwable) parkingSystemException27);
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType13.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType15.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType20.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType26.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        models.ParkingSystemException parkingSystemException1 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        models.ParkingSystemException parkingSystemException1 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType9);
        java.lang.Throwable throwable16 = null;
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("hi!", throwable16);
        models.ParkingSystemException.ErrorType errorType18 = parkingSystemException17.getErrorType();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType18);
        java.lang.Throwable throwable23 = null;
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("hi!", throwable23);
        models.ParkingSystemException.ErrorType errorType25 = parkingSystemException24.getErrorType();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        java.lang.Throwable[] throwableArray27 = parkingSystemException26.getSuppressed();
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType18, (java.lang.Throwable) parkingSystemException28);
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("", errorType18);
        java.lang.Throwable throwable31 = null;
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType18, throwable31);
        parkingSystemException10.addSuppressed((java.lang.Throwable) parkingSystemException32);
        java.lang.Throwable[] throwableArray34 = parkingSystemException10.getSuppressed();
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException37);
        models.ParkingSystemException parkingSystemException40 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        parkingSystemException38.addSuppressed((java.lang.Throwable) parkingSystemException40);
        models.ParkingSystemException.ErrorType errorType42 = parkingSystemException40.getErrorType();
        parkingSystemException10.addSuppressed((java.lang.Throwable) parkingSystemException40);
        parkingSystemException1.addSuppressed((java.lang.Throwable) parkingSystemException40);
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType18.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType25.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertTrue("'" + errorType42 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType42.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        models.ParkingSystemException.ErrorType errorType3 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType3);
        models.ParkingSystemException.ErrorType errorType6 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable9 = null;
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", throwable9);
        models.ParkingSystemException.ErrorType errorType11 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException10);
        java.lang.Throwable[] throwableArray13 = parkingSystemException12.getSuppressed();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType6, (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType3, (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException.ErrorType errorType17 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType17);
        java.lang.Throwable[] throwableArray19 = parkingSystemException18.getSuppressed();
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType3, (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException.ErrorType errorType23 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("", errorType23);
        java.lang.Throwable[] throwableArray25 = parkingSystemException24.getSuppressed();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException24);
        parkingSystemException18.addSuppressed((java.lang.Throwable) parkingSystemException24);
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType3.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType6.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType11.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType17.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType23.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("hi!");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException2);
        java.lang.String str4 = parkingSystemException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "models.ParkingSystemException: hi!" + "'", str4.equals("models.ParkingSystemException: hi!"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.BUSINESS_LOGIC;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType1);
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType6);
        parkingSystemException2.addSuppressed((java.lang.Throwable) parkingSystemException7);
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.BUSINESS_LOGIC + "'", errorType1.equals(models.ParkingSystemException.ErrorType.BUSINESS_LOGIC));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType7);
        java.lang.Throwable throwable12 = null;
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("hi!", throwable12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException13);
        java.lang.Throwable[] throwableArray16 = parkingSystemException15.getSuppressed();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException15);
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType7, (java.lang.Throwable) parkingSystemException17);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("", errorType7);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", errorType7);
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("", errorType1);
        models.ParkingSystemException.ErrorType errorType5 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable8 = null;
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", throwable8);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException9.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable[] throwableArray12 = parkingSystemException11.getSuppressed();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType5, (java.lang.Throwable) parkingSystemException11);
        java.lang.Throwable throwable17 = null;
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("hi!", throwable17);
        models.ParkingSystemException.ErrorType errorType19 = parkingSystemException18.getErrorType();
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType19);
        java.lang.Throwable throwable24 = null;
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("hi!", throwable24);
        models.ParkingSystemException.ErrorType errorType26 = parkingSystemException25.getErrorType();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        java.lang.Throwable[] throwableArray28 = parkingSystemException27.getSuppressed();
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType19, (java.lang.Throwable) parkingSystemException29);
        parkingSystemException11.addSuppressed((java.lang.Throwable) parkingSystemException29);
        models.ParkingSystemException.ErrorType errorType32 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType32);
        java.lang.Throwable[] throwableArray34 = parkingSystemException33.getSuppressed();
        parkingSystemException2.addSuppressed((java.lang.Throwable) parkingSystemException33);
        models.ParkingSystemException parkingSystemException40 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException40);
        models.ParkingSystemException parkingSystemException42 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException40);
        java.lang.Throwable[] throwableArray43 = parkingSystemException42.getSuppressed();
        models.ParkingSystemException parkingSystemException44 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException42);
        parkingSystemException33.addSuppressed((java.lang.Throwable) parkingSystemException44);
        java.lang.Throwable[] throwableArray46 = parkingSystemException44.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType1.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType5.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType19.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType26.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType32.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray46);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", errorType10);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType10);
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType10);
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException13);
        java.lang.Throwable[] throwableArray15 = parkingSystemException13.getSuppressed();
        java.lang.Class<?> wildcardClass16 = parkingSystemException13.getClass();
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType4);
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", errorType4);
        java.lang.Throwable throwable10 = null;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", throwable10);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException11);
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException11);
        parkingSystemException6.addSuppressed((java.lang.Throwable) parkingSystemException11);
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.Throwable throwable1 = null;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", throwable1);
        models.ParkingSystemException.ErrorType errorType4 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("", errorType4);
        models.ParkingSystemException.ErrorType errorType8 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable11 = null;
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("hi!", throwable11);
        models.ParkingSystemException.ErrorType errorType13 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable[] throwableArray15 = parkingSystemException14.getSuppressed();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException14);
        java.lang.Throwable throwable20 = null;
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("hi!", throwable20);
        models.ParkingSystemException.ErrorType errorType22 = parkingSystemException21.getErrorType();
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType22);
        java.lang.Throwable throwable27 = null;
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("hi!", throwable27);
        models.ParkingSystemException.ErrorType errorType29 = parkingSystemException28.getErrorType();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException28);
        java.lang.Throwable[] throwableArray31 = parkingSystemException30.getSuppressed();
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException30);
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType22, (java.lang.Throwable) parkingSystemException32);
        parkingSystemException14.addSuppressed((java.lang.Throwable) parkingSystemException32);
        models.ParkingSystemException.ErrorType errorType35 = parkingSystemException14.getErrorType();
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType35);
        java.lang.Throwable[] throwableArray37 = parkingSystemException36.getSuppressed();
        parkingSystemException5.addSuppressed((java.lang.Throwable) parkingSystemException36);
        parkingSystemException2.addSuppressed((java.lang.Throwable) parkingSystemException5);
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType4.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType8.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType13.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType22.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType29 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType29.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertTrue("'" + errorType35 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType35.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        java.lang.Throwable[] throwableArray9 = parkingSystemException8.getSuppressed();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException8);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: ");
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException12);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType7);
        java.lang.Throwable throwable12 = null;
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("hi!", throwable12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException13);
        java.lang.Throwable[] throwableArray16 = parkingSystemException15.getSuppressed();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException15);
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType7, (java.lang.Throwable) parkingSystemException17);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable23 = null;
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("hi!", throwable23);
        models.ParkingSystemException.ErrorType errorType25 = parkingSystemException24.getErrorType();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        parkingSystemException20.addSuppressed((java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType7, (java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException20);
        java.lang.Throwable[] throwableArray30 = parkingSystemException29.getSuppressed();
        java.lang.Class<?> wildcardClass31 = parkingSystemException29.getClass();
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType25.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType8);
        models.ParkingSystemException.ErrorType errorType13 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType13);
        java.lang.Throwable throwable18 = null;
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("hi!", throwable18);
        models.ParkingSystemException.ErrorType errorType20 = parkingSystemException19.getErrorType();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException19);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException19);
        parkingSystemException14.addSuppressed((java.lang.Throwable) parkingSystemException19);
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("hi!", errorType8, (java.lang.Throwable) parkingSystemException14);
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        models.ParkingSystemException.ErrorType errorType28 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable31 = null;
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("hi!", throwable31);
        models.ParkingSystemException.ErrorType errorType33 = parkingSystemException32.getErrorType();
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException32);
        java.lang.Throwable[] throwableArray35 = parkingSystemException34.getSuppressed();
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType28, (java.lang.Throwable) parkingSystemException34);
        java.lang.Throwable throwable40 = null;
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("hi!", throwable40);
        models.ParkingSystemException.ErrorType errorType42 = parkingSystemException41.getErrorType();
        models.ParkingSystemException parkingSystemException43 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType42);
        java.lang.Throwable throwable47 = null;
        models.ParkingSystemException parkingSystemException48 = new models.ParkingSystemException("hi!", throwable47);
        models.ParkingSystemException.ErrorType errorType49 = parkingSystemException48.getErrorType();
        models.ParkingSystemException parkingSystemException50 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException48);
        java.lang.Throwable[] throwableArray51 = parkingSystemException50.getSuppressed();
        models.ParkingSystemException parkingSystemException52 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException50);
        models.ParkingSystemException parkingSystemException53 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType42, (java.lang.Throwable) parkingSystemException52);
        parkingSystemException34.addSuppressed((java.lang.Throwable) parkingSystemException52);
        parkingSystemException26.addSuppressed((java.lang.Throwable) parkingSystemException34);
        models.ParkingSystemException parkingSystemException56 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException34);
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType13.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType20.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType28 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType28.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType33 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType33.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertTrue("'" + errorType42 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType42.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType49 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType49.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray51);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.SYSTEM_ERROR;
        models.ParkingSystemException.ErrorType errorType4 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException8);
        java.lang.Throwable[] throwableArray11 = parkingSystemException10.getSuppressed();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType4, (java.lang.Throwable) parkingSystemException10);
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException17);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType2, (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        java.lang.Throwable[] throwableArray23 = parkingSystemException22.getSuppressed();
        parkingSystemException18.addSuppressed((java.lang.Throwable) parkingSystemException22);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType2.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType4.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException2);
        java.lang.String str4 = parkingSystemException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str4.equals("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        models.ParkingSystemException.ErrorType errorType5 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable8 = null;
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", throwable8);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException9.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable[] throwableArray12 = parkingSystemException11.getSuppressed();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType5, (java.lang.Throwable) parkingSystemException11);
        java.lang.Throwable throwable17 = null;
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("hi!", throwable17);
        models.ParkingSystemException.ErrorType errorType19 = parkingSystemException18.getErrorType();
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType19);
        java.lang.Throwable throwable24 = null;
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("hi!", throwable24);
        models.ParkingSystemException.ErrorType errorType26 = parkingSystemException25.getErrorType();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        java.lang.Throwable[] throwableArray28 = parkingSystemException27.getSuppressed();
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType19, (java.lang.Throwable) parkingSystemException29);
        parkingSystemException11.addSuppressed((java.lang.Throwable) parkingSystemException29);
        models.ParkingSystemException.ErrorType errorType32 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType32);
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException36);
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType32, (java.lang.Throwable) parkingSystemException37);
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType32);
        java.lang.Throwable throwable45 = null;
        models.ParkingSystemException parkingSystemException46 = new models.ParkingSystemException("hi!", throwable45);
        models.ParkingSystemException.ErrorType errorType47 = parkingSystemException46.getErrorType();
        models.ParkingSystemException parkingSystemException48 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType47);
        java.lang.Throwable throwable52 = null;
        models.ParkingSystemException parkingSystemException53 = new models.ParkingSystemException("hi!", throwable52);
        models.ParkingSystemException.ErrorType errorType54 = parkingSystemException53.getErrorType();
        models.ParkingSystemException parkingSystemException55 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException53);
        java.lang.Throwable[] throwableArray56 = parkingSystemException55.getSuppressed();
        models.ParkingSystemException parkingSystemException57 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException55);
        models.ParkingSystemException parkingSystemException58 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType47, (java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException parkingSystemException60 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable63 = null;
        models.ParkingSystemException parkingSystemException64 = new models.ParkingSystemException("hi!", throwable63);
        models.ParkingSystemException.ErrorType errorType65 = parkingSystemException64.getErrorType();
        models.ParkingSystemException parkingSystemException66 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException64);
        parkingSystemException60.addSuppressed((java.lang.Throwable) parkingSystemException66);
        models.ParkingSystemException parkingSystemException68 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType47, (java.lang.Throwable) parkingSystemException60);
        models.ParkingSystemException parkingSystemException69 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException60);
        models.ParkingSystemException parkingSystemException70 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType32, (java.lang.Throwable) parkingSystemException60);
        models.ParkingSystemException.ErrorType errorType71 = parkingSystemException60.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType5.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType19.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType26.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType32.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType47 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType47.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType54 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType54.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertTrue("'" + errorType65 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType65.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType71 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType71.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType7);
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType7);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("", errorType7);
        models.ParkingSystemException.ErrorType errorType12 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable15 = null;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", throwable15);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        java.lang.Throwable[] throwableArray19 = parkingSystemException18.getSuppressed();
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType12, (java.lang.Throwable) parkingSystemException18);
        parkingSystemException10.addSuppressed((java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("hi!", (java.lang.Throwable) parkingSystemException20);
        java.lang.Class<?> wildcardClass24 = parkingSystemException20.getClass();
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType12.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType2);
        java.lang.Throwable[] throwableArray4 = parkingSystemException3.getSuppressed();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException8);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException8);
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException14);
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException14);
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException16);
        parkingSystemException3.addSuppressed((java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("hi!", (java.lang.Throwable) parkingSystemException3);
        java.lang.Throwable throwable23 = null;
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("hi!", throwable23);
        models.ParkingSystemException.ErrorType errorType25 = parkingSystemException24.getErrorType();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        java.lang.Throwable[] throwableArray27 = parkingSystemException26.getSuppressed();
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException.ErrorType errorType30 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("", errorType30);
        java.lang.Throwable[] throwableArray32 = parkingSystemException31.getSuppressed();
        parkingSystemException26.addSuppressed((java.lang.Throwable) parkingSystemException31);
        java.lang.Throwable[] throwableArray34 = parkingSystemException26.getSuppressed();
        models.ParkingSystemException.ErrorType errorType35 = parkingSystemException26.getErrorType();
        parkingSystemException3.addSuppressed((java.lang.Throwable) parkingSystemException26);
        java.lang.Throwable[] throwableArray37 = parkingSystemException26.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType2.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType25.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType30.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertTrue("'" + errorType35 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType35.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.SYSTEM_ERROR;
        models.ParkingSystemException.ErrorType errorType4 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException8);
        java.lang.Throwable[] throwableArray11 = parkingSystemException10.getSuppressed();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType4, (java.lang.Throwable) parkingSystemException10);
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", throwable21);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType23);
        java.lang.Throwable throwable28 = null;
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("hi!", throwable28);
        models.ParkingSystemException.ErrorType errorType30 = parkingSystemException29.getErrorType();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException29);
        java.lang.Throwable[] throwableArray32 = parkingSystemException31.getSuppressed();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException31);
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType23, (java.lang.Throwable) parkingSystemException33);
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("", errorType23);
        java.lang.Throwable throwable36 = null;
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType23, throwable36);
        models.ParkingSystemException.ErrorType errorType40 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("", errorType40);
        models.ParkingSystemException parkingSystemException43 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType44 = parkingSystemException43.getErrorType();
        models.ParkingSystemException parkingSystemException45 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType40, (java.lang.Throwable) parkingSystemException43);
        java.lang.Throwable throwable50 = null;
        models.ParkingSystemException parkingSystemException51 = new models.ParkingSystemException("hi!", throwable50);
        models.ParkingSystemException.ErrorType errorType52 = parkingSystemException51.getErrorType();
        models.ParkingSystemException parkingSystemException53 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException51);
        models.ParkingSystemException.ErrorType errorType54 = parkingSystemException51.getErrorType();
        models.ParkingSystemException parkingSystemException55 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType54);
        java.lang.Throwable throwable61 = null;
        models.ParkingSystemException parkingSystemException62 = new models.ParkingSystemException("hi!", throwable61);
        models.ParkingSystemException.ErrorType errorType63 = parkingSystemException62.getErrorType();
        models.ParkingSystemException parkingSystemException64 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType63);
        java.lang.Throwable throwable68 = null;
        models.ParkingSystemException parkingSystemException69 = new models.ParkingSystemException("hi!", throwable68);
        models.ParkingSystemException.ErrorType errorType70 = parkingSystemException69.getErrorType();
        models.ParkingSystemException parkingSystemException71 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException69);
        java.lang.Throwable[] throwableArray72 = parkingSystemException71.getSuppressed();
        models.ParkingSystemException parkingSystemException73 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException71);
        models.ParkingSystemException parkingSystemException74 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType63, (java.lang.Throwable) parkingSystemException73);
        models.ParkingSystemException parkingSystemException75 = new models.ParkingSystemException("", errorType63);
        java.lang.Throwable throwable76 = null;
        models.ParkingSystemException parkingSystemException77 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType63, throwable76);
        parkingSystemException55.addSuppressed((java.lang.Throwable) parkingSystemException77);
        java.lang.Throwable[] throwableArray79 = parkingSystemException55.getSuppressed();
        models.ParkingSystemException parkingSystemException80 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException55);
        parkingSystemException43.addSuppressed((java.lang.Throwable) parkingSystemException80);
        models.ParkingSystemException parkingSystemException82 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType23, (java.lang.Throwable) parkingSystemException80);
        models.ParkingSystemException parkingSystemException86 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType87 = parkingSystemException86.getErrorType();
        models.ParkingSystemException parkingSystemException88 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType87);
        models.ParkingSystemException parkingSystemException89 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType87);
        models.ParkingSystemException parkingSystemException90 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", errorType23, (java.lang.Throwable) parkingSystemException89);
        models.ParkingSystemException parkingSystemException91 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType2, (java.lang.Throwable) parkingSystemException89);
        java.lang.String str92 = parkingSystemException91.toString();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType2.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType4.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType30.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + errorType40 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType40.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType44 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType44.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType52 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType52.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType54 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType54.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType63 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType63.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType70 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType70.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertTrue("'" + errorType87 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType87.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str92.equals("models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        java.lang.Throwable[] throwableArray9 = parkingSystemException8.getSuppressed();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException8);
        java.lang.Throwable throwable14 = null;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", throwable14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType16);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", throwable21);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException22);
        java.lang.Throwable[] throwableArray25 = parkingSystemException24.getSuppressed();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType16, (java.lang.Throwable) parkingSystemException26);
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("hi!", (java.lang.Throwable) parkingSystemException8);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        models.ParkingSystemException parkingSystemException1 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        java.lang.Throwable[] throwableArray2 = parkingSystemException1.getSuppressed();
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSystemException1.addSuppressed(throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType2);
        java.lang.Throwable[] throwableArray4 = parkingSystemException3.getSuppressed();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException8);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException8);
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException14);
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException14);
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException16);
        parkingSystemException3.addSuppressed((java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("hi!", (java.lang.Throwable) parkingSystemException3);
        java.lang.Throwable throwable23 = null;
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("hi!", throwable23);
        models.ParkingSystemException.ErrorType errorType25 = parkingSystemException24.getErrorType();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        java.lang.Throwable[] throwableArray27 = parkingSystemException26.getSuppressed();
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException.ErrorType errorType30 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("", errorType30);
        java.lang.Throwable[] throwableArray32 = parkingSystemException31.getSuppressed();
        parkingSystemException26.addSuppressed((java.lang.Throwable) parkingSystemException31);
        java.lang.Throwable[] throwableArray34 = parkingSystemException26.getSuppressed();
        models.ParkingSystemException.ErrorType errorType35 = parkingSystemException26.getErrorType();
        parkingSystemException3.addSuppressed((java.lang.Throwable) parkingSystemException26);
        java.lang.String str37 = parkingSystemException3.toString();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType2.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType25.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType30.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertTrue("'" + errorType35 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType35.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: " + "'", str37.equals("models.ParkingSystemException: models.ParkingSystemException: "));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        models.ParkingSystemException.ErrorType errorType3 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        java.lang.Throwable[] throwableArray10 = parkingSystemException9.getSuppressed();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType3, (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable throwable15 = null;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", throwable15);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType17);
        java.lang.Throwable throwable22 = null;
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("hi!", throwable22);
        models.ParkingSystemException.ErrorType errorType24 = parkingSystemException23.getErrorType();
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException23);
        java.lang.Throwable[] throwableArray26 = parkingSystemException25.getSuppressed();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType17, (java.lang.Throwable) parkingSystemException27);
        parkingSystemException9.addSuppressed((java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException.ErrorType errorType30 = parkingSystemException9.getErrorType();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType30);
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException34);
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType30, (java.lang.Throwable) parkingSystemException35);
        java.lang.Throwable[] throwableArray37 = parkingSystemException36.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType3.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType24.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType30.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        models.ParkingSystemException.ErrorType errorType3 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        java.lang.Throwable[] throwableArray10 = parkingSystemException9.getSuppressed();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType3, (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable throwable15 = null;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", throwable15);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType17);
        java.lang.Throwable throwable22 = null;
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("hi!", throwable22);
        models.ParkingSystemException.ErrorType errorType24 = parkingSystemException23.getErrorType();
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException23);
        java.lang.Throwable[] throwableArray26 = parkingSystemException25.getSuppressed();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType17, (java.lang.Throwable) parkingSystemException27);
        parkingSystemException9.addSuppressed((java.lang.Throwable) parkingSystemException27);
        java.lang.Throwable[] throwableArray30 = parkingSystemException27.getSuppressed();
        models.ParkingSystemException.ErrorType errorType31 = parkingSystemException27.getErrorType();
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException32);
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType3.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType24.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertTrue("'" + errorType31 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType31.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", errorType9);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException10);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException11.getErrorType();
        models.ParkingSystemException.ErrorType errorType15 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType15);
        java.lang.Throwable[] throwableArray17 = parkingSystemException16.getSuppressed();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException21);
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException21);
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException27);
        parkingSystemException21.addSuppressed((java.lang.Throwable) parkingSystemException29);
        parkingSystemException16.addSuppressed((java.lang.Throwable) parkingSystemException29);
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("hi!", (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType12, (java.lang.Throwable) parkingSystemException32);
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType15.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        java.lang.Throwable[] throwableArray9 = parkingSystemException8.getSuppressed();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException8);
        java.lang.Throwable throwable14 = null;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", throwable14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType16);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", throwable21);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException22);
        java.lang.Throwable[] throwableArray25 = parkingSystemException24.getSuppressed();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType16, (java.lang.Throwable) parkingSystemException26);
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException.ErrorType errorType29 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType29);
        models.ParkingSystemException.ErrorType errorType32 = models.ParkingSystemException.ErrorType.BUSINESS_LOGIC;
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType32);
        models.ParkingSystemException.ErrorType errorType34 = parkingSystemException33.getErrorType();
        parkingSystemException30.addSuppressed((java.lang.Throwable) parkingSystemException33);
        models.ParkingSystemException.ErrorType errorType36 = parkingSystemException30.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertTrue("'" + errorType29 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType29.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + models.ParkingSystemException.ErrorType.BUSINESS_LOGIC + "'", errorType32.equals(models.ParkingSystemException.ErrorType.BUSINESS_LOGIC));
        org.junit.Assert.assertTrue("'" + errorType34 + "' != '" + models.ParkingSystemException.ErrorType.BUSINESS_LOGIC + "'", errorType34.equals(models.ParkingSystemException.ErrorType.BUSINESS_LOGIC));
        org.junit.Assert.assertTrue("'" + errorType36 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType36.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4);
        java.lang.Throwable throwable10 = null;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", throwable10);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType12);
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType12);
        java.lang.Throwable[] throwableArray15 = parkingSystemException14.getSuppressed();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException14);
        parkingSystemException5.addSuppressed((java.lang.Throwable) parkingSystemException14);
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType4);
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType4);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException6.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        models.ParkingSystemException.ErrorType errorType3 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        java.lang.Throwable[] throwableArray10 = parkingSystemException9.getSuppressed();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType3, (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable throwable15 = null;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", throwable15);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType17);
        java.lang.Throwable throwable22 = null;
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("hi!", throwable22);
        models.ParkingSystemException.ErrorType errorType24 = parkingSystemException23.getErrorType();
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException23);
        java.lang.Throwable[] throwableArray26 = parkingSystemException25.getSuppressed();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType17, (java.lang.Throwable) parkingSystemException27);
        parkingSystemException9.addSuppressed((java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException.ErrorType errorType30 = parkingSystemException9.getErrorType();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType30);
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", errorType30);
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType3.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType24.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType30.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        models.ParkingSystemException.ErrorType errorType3 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType3);
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("", errorType3);
        java.lang.Throwable throwable8 = null;
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", throwable8);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException9.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable[] throwableArray12 = parkingSystemException11.getSuppressed();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType3, (java.lang.Throwable) parkingSystemException11);
        models.ParkingSystemException.ErrorType errorType16 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("", errorType16);
        java.lang.Throwable throwable20 = null;
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("hi!", throwable20);
        models.ParkingSystemException.ErrorType errorType22 = parkingSystemException21.getErrorType();
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException21);
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType16, (java.lang.Throwable) parkingSystemException21);
        java.lang.Throwable[] throwableArray25 = parkingSystemException24.getSuppressed();
        parkingSystemException11.addSuppressed((java.lang.Throwable) parkingSystemException24);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable31 = null;
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("hi!", throwable31);
        models.ParkingSystemException.ErrorType errorType33 = parkingSystemException32.getErrorType();
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException32);
        parkingSystemException28.addSuppressed((java.lang.Throwable) parkingSystemException34);
        parkingSystemException11.addSuppressed((java.lang.Throwable) parkingSystemException34);
        java.lang.String str37 = parkingSystemException34.toString();
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType3.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType16.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType22.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertTrue("'" + errorType33 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType33.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "models.ParkingSystemException: " + "'", str37.equals("models.ParkingSystemException: "));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType8);
        java.lang.Throwable throwable15 = null;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", throwable15);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType17);
        java.lang.Throwable throwable22 = null;
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("hi!", throwable22);
        models.ParkingSystemException.ErrorType errorType24 = parkingSystemException23.getErrorType();
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException23);
        java.lang.Throwable[] throwableArray26 = parkingSystemException25.getSuppressed();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType17, (java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("", errorType17);
        java.lang.Throwable throwable30 = null;
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType17, throwable30);
        parkingSystemException9.addSuppressed((java.lang.Throwable) parkingSystemException31);
        models.ParkingSystemException.ErrorType errorType34 = null;
        java.lang.Throwable throwable35 = null;
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType34, throwable35);
        parkingSystemException9.addSuppressed((java.lang.Throwable) parkingSystemException36);
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException9);
        java.lang.String str39 = parkingSystemException38.toString();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType24.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str39.equals("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.VALIDATION;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        models.ParkingSystemException.ErrorType errorType5 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", errorType5);
        models.ParkingSystemException.ErrorType errorType9 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable12 = null;
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("hi!", throwable12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException13);
        java.lang.Throwable[] throwableArray16 = parkingSystemException15.getSuppressed();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType9, (java.lang.Throwable) parkingSystemException15);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", throwable21);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType23);
        java.lang.Throwable throwable28 = null;
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("hi!", throwable28);
        models.ParkingSystemException.ErrorType errorType30 = parkingSystemException29.getErrorType();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException29);
        java.lang.Throwable[] throwableArray32 = parkingSystemException31.getSuppressed();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException31);
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType23, (java.lang.Throwable) parkingSystemException33);
        parkingSystemException15.addSuppressed((java.lang.Throwable) parkingSystemException33);
        models.ParkingSystemException.ErrorType errorType36 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType36);
        java.lang.Throwable[] throwableArray38 = parkingSystemException37.getSuppressed();
        parkingSystemException6.addSuppressed((java.lang.Throwable) parkingSystemException37);
        models.ParkingSystemException.ErrorType errorType40 = parkingSystemException37.getErrorType();
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException37);
        java.lang.Throwable throwable45 = null;
        models.ParkingSystemException parkingSystemException46 = new models.ParkingSystemException("hi!", throwable45);
        models.ParkingSystemException.ErrorType errorType47 = parkingSystemException46.getErrorType();
        models.ParkingSystemException parkingSystemException48 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException46);
        models.ParkingSystemException.ErrorType errorType49 = parkingSystemException48.getErrorType();
        models.ParkingSystemException.ErrorType errorType51 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException52 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType51);
        java.lang.Throwable throwable56 = null;
        models.ParkingSystemException parkingSystemException57 = new models.ParkingSystemException("hi!", throwable56);
        models.ParkingSystemException.ErrorType errorType58 = parkingSystemException57.getErrorType();
        models.ParkingSystemException parkingSystemException59 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException parkingSystemException60 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException57);
        parkingSystemException52.addSuppressed((java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException parkingSystemException62 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType49, (java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException.ErrorType errorType63 = parkingSystemException57.getErrorType();
        parkingSystemException37.addSuppressed((java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException.ErrorType errorType65 = parkingSystemException37.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.VALIDATION + "'", errorType2.equals(models.ParkingSystemException.ErrorType.VALIDATION));
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType5.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType9.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType30.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + errorType36 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType36.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertTrue("'" + errorType40 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType40.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType47 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType47.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType49 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType49.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType51 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType51.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType58 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType58.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType63 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType63.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType65 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType65.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException3);
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        parkingSystemException4.addSuppressed((java.lang.Throwable) parkingSystemException6);
        java.lang.Throwable throwable12 = null;
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("hi!", throwable12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType14);
        java.lang.Throwable throwable19 = null;
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("hi!", throwable19);
        models.ParkingSystemException.ErrorType errorType21 = parkingSystemException20.getErrorType();
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException20);
        java.lang.Throwable[] throwableArray23 = parkingSystemException22.getSuppressed();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException22);
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType14, (java.lang.Throwable) parkingSystemException24);
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable30 = null;
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("hi!", throwable30);
        models.ParkingSystemException.ErrorType errorType32 = parkingSystemException31.getErrorType();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException31);
        parkingSystemException27.addSuppressed((java.lang.Throwable) parkingSystemException33);
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType14, (java.lang.Throwable) parkingSystemException27);
        java.lang.Throwable[] throwableArray36 = parkingSystemException35.getSuppressed();
        java.lang.Throwable[] throwableArray37 = parkingSystemException35.getSuppressed();
        models.ParkingSystemException.ErrorType errorType39 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable42 = null;
        models.ParkingSystemException parkingSystemException43 = new models.ParkingSystemException("hi!", throwable42);
        models.ParkingSystemException.ErrorType errorType44 = parkingSystemException43.getErrorType();
        models.ParkingSystemException parkingSystemException45 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException43);
        java.lang.Throwable[] throwableArray46 = parkingSystemException45.getSuppressed();
        models.ParkingSystemException parkingSystemException47 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType39, (java.lang.Throwable) parkingSystemException45);
        java.lang.Throwable throwable51 = null;
        models.ParkingSystemException parkingSystemException52 = new models.ParkingSystemException("hi!", throwable51);
        models.ParkingSystemException.ErrorType errorType53 = parkingSystemException52.getErrorType();
        models.ParkingSystemException parkingSystemException54 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType53);
        java.lang.Throwable throwable58 = null;
        models.ParkingSystemException parkingSystemException59 = new models.ParkingSystemException("hi!", throwable58);
        models.ParkingSystemException.ErrorType errorType60 = parkingSystemException59.getErrorType();
        models.ParkingSystemException parkingSystemException61 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException59);
        java.lang.Throwable[] throwableArray62 = parkingSystemException61.getSuppressed();
        models.ParkingSystemException parkingSystemException63 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException61);
        models.ParkingSystemException parkingSystemException64 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType53, (java.lang.Throwable) parkingSystemException63);
        parkingSystemException45.addSuppressed((java.lang.Throwable) parkingSystemException63);
        models.ParkingSystemException.ErrorType errorType66 = parkingSystemException45.getErrorType();
        parkingSystemException35.addSuppressed((java.lang.Throwable) parkingSystemException45);
        parkingSystemException4.addSuppressed((java.lang.Throwable) parkingSystemException45);
        models.ParkingSystemException parkingSystemException69 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException45);
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType21.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType32.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertTrue("'" + errorType39 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType39.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType44 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType44.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertTrue("'" + errorType53 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType53.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType60 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType60.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertTrue("'" + errorType66 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType66.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException4);
        java.lang.Throwable[] throwableArray8 = parkingSystemException7.getSuppressed();
        java.lang.Throwable throwable12 = null;
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("hi!", throwable12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType14);
        java.lang.Throwable throwable17 = null;
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("hi!", throwable17);
        models.ParkingSystemException.ErrorType errorType19 = parkingSystemException18.getErrorType();
        parkingSystemException15.addSuppressed((java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException15);
        parkingSystemException7.addSuppressed((java.lang.Throwable) parkingSystemException21);
        java.lang.Throwable throwable27 = null;
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("hi!", throwable27);
        models.ParkingSystemException.ErrorType errorType29 = parkingSystemException28.getErrorType();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException28);
        models.ParkingSystemException.ErrorType errorType31 = parkingSystemException30.getErrorType();
        models.ParkingSystemException.ErrorType errorType32 = parkingSystemException30.getErrorType();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("", errorType32);
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException37);
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException37);
        java.lang.Throwable[] throwableArray40 = parkingSystemException39.getSuppressed();
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType32, (java.lang.Throwable) parkingSystemException39);
        models.ParkingSystemException.ErrorType errorType42 = parkingSystemException41.getErrorType();
        parkingSystemException7.addSuppressed((java.lang.Throwable) parkingSystemException41);
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType19.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType29 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType29.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType31 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType31.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType32.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertTrue("'" + errorType42 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType42.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        models.ParkingSystemException parkingSystemException1 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ");
        java.lang.Throwable[] throwableArray2 = parkingSystemException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        models.ParkingSystemException.ErrorType errorType4 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException8);
        java.lang.Throwable[] throwableArray11 = parkingSystemException10.getSuppressed();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType4, (java.lang.Throwable) parkingSystemException10);
        java.lang.Throwable throwable16 = null;
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("hi!", throwable16);
        models.ParkingSystemException.ErrorType errorType18 = parkingSystemException17.getErrorType();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType18);
        java.lang.Throwable throwable23 = null;
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("hi!", throwable23);
        models.ParkingSystemException.ErrorType errorType25 = parkingSystemException24.getErrorType();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        java.lang.Throwable[] throwableArray27 = parkingSystemException26.getSuppressed();
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType18, (java.lang.Throwable) parkingSystemException28);
        parkingSystemException10.addSuppressed((java.lang.Throwable) parkingSystemException28);
        models.ParkingSystemException.ErrorType errorType31 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType31);
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType31);
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType31);
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType4.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType18.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType25.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertTrue("'" + errorType31 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType31.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", errorType10);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType10);
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType10);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        java.lang.Throwable[] throwableArray15 = parkingSystemException13.getSuppressed();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!");
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException.ErrorType errorType20 = parkingSystemException19.getErrorType();
        java.lang.Throwable throwable24 = null;
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("hi!", throwable24);
        models.ParkingSystemException.ErrorType errorType26 = parkingSystemException25.getErrorType();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        models.ParkingSystemException.ErrorType errorType28 = parkingSystemException25.getErrorType();
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType28);
        parkingSystemException19.addSuppressed((java.lang.Throwable) parkingSystemException29);
        parkingSystemException13.addSuppressed((java.lang.Throwable) parkingSystemException19);
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException13);
        models.ParkingSystemException.ErrorType errorType33 = parkingSystemException32.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType20.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType26.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType28 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType28.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType33 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType33.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType5);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType5);
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType5);
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        models.ParkingSystemException.ErrorType errorType3 = models.ParkingSystemException.ErrorType.SYSTEM_ERROR;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType3);
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType3);
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType3);
        models.ParkingSystemException.ErrorType errorType8 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8);
        parkingSystemException6.addSuppressed((java.lang.Throwable) parkingSystemException9);
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType3.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType8.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType2);
        java.lang.Throwable[] throwableArray4 = parkingSystemException3.getSuppressed();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException8);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException8);
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException14);
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException14);
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException16);
        parkingSystemException3.addSuppressed((java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("hi!", (java.lang.Throwable) parkingSystemException3);
        java.lang.Throwable[] throwableArray20 = parkingSystemException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType2.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", errorType8);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable[] throwableArray11 = parkingSystemException9.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        models.ParkingSystemException parkingSystemException1 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType2 = parkingSystemException1.getErrorType();
        models.ParkingSystemException.ErrorType errorType4 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4);
        java.lang.Throwable throwable9 = null;
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", throwable9);
        models.ParkingSystemException.ErrorType errorType11 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException10);
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException10);
        parkingSystemException5.addSuppressed((java.lang.Throwable) parkingSystemException10);
        parkingSystemException1.addSuppressed((java.lang.Throwable) parkingSystemException10);
        java.lang.Throwable[] throwableArray16 = parkingSystemException1.getSuppressed();
        java.lang.Class<?> wildcardClass17 = throwableArray16.getClass();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType2.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType4.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType11.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType1);
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException7);
        parkingSystemException2.addSuppressed((java.lang.Throwable) parkingSystemException7);
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSystemException2.addSuppressed(throwable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType1.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException.ErrorType errorType10 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType10);
        java.lang.Throwable throwable15 = null;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", throwable15);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException16);
        parkingSystemException11.addSuppressed((java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType8);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType10.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        models.ParkingSystemException.ErrorType errorType3 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        java.lang.Throwable[] throwableArray10 = parkingSystemException9.getSuppressed();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType3, (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable throwable15 = null;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", throwable15);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType17);
        java.lang.Throwable throwable22 = null;
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("hi!", throwable22);
        models.ParkingSystemException.ErrorType errorType24 = parkingSystemException23.getErrorType();
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException23);
        java.lang.Throwable[] throwableArray26 = parkingSystemException25.getSuppressed();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType17, (java.lang.Throwable) parkingSystemException27);
        parkingSystemException9.addSuppressed((java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException.ErrorType errorType30 = parkingSystemException9.getErrorType();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType30);
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType30);
        models.ParkingSystemException.ErrorType errorType34 = models.ParkingSystemException.ErrorType.SYSTEM_ERROR;
        models.ParkingSystemException.ErrorType errorType36 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable39 = null;
        models.ParkingSystemException parkingSystemException40 = new models.ParkingSystemException("hi!", throwable39);
        models.ParkingSystemException.ErrorType errorType41 = parkingSystemException40.getErrorType();
        models.ParkingSystemException parkingSystemException42 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException40);
        java.lang.Throwable[] throwableArray43 = parkingSystemException42.getSuppressed();
        models.ParkingSystemException parkingSystemException44 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType36, (java.lang.Throwable) parkingSystemException42);
        models.ParkingSystemException parkingSystemException45 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType34, (java.lang.Throwable) parkingSystemException44);
        parkingSystemException32.addSuppressed((java.lang.Throwable) parkingSystemException44);
        java.lang.Throwable[] throwableArray47 = parkingSystemException32.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType3.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType24.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType30.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType34 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType34.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType36 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType36.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType41 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType41.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray47);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException3);
        java.lang.Throwable[] throwableArray6 = parkingSystemException5.getSuppressed();
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException5.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        models.ParkingSystemException.ErrorType errorType1 = null;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType1);
        models.ParkingSystemException.ErrorType errorType3 = parkingSystemException2.getErrorType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(errorType3);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("", errorType9);
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException14);
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException14);
        java.lang.Throwable[] throwableArray17 = parkingSystemException16.getSuppressed();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType9, (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException.ErrorType errorType22 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType22);
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("", errorType22);
        models.ParkingSystemException.ErrorType errorType26 = models.ParkingSystemException.ErrorType.DATA_ACCESS;
        models.ParkingSystemException.ErrorType errorType29 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType29);
        models.ParkingSystemException.ErrorType errorType32 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable35 = null;
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("hi!", throwable35);
        models.ParkingSystemException.ErrorType errorType37 = parkingSystemException36.getErrorType();
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException36);
        java.lang.Throwable[] throwableArray39 = parkingSystemException38.getSuppressed();
        models.ParkingSystemException parkingSystemException40 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType32, (java.lang.Throwable) parkingSystemException38);
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType29, (java.lang.Throwable) parkingSystemException38);
        models.ParkingSystemException parkingSystemException42 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType26, (java.lang.Throwable) parkingSystemException41);
        models.ParkingSystemException parkingSystemException43 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType22, (java.lang.Throwable) parkingSystemException42);
        parkingSystemException16.addSuppressed((java.lang.Throwable) parkingSystemException43);
        models.ParkingSystemException.ErrorType errorType45 = parkingSystemException43.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType22.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + models.ParkingSystemException.ErrorType.DATA_ACCESS + "'", errorType26.equals(models.ParkingSystemException.ErrorType.DATA_ACCESS));
        org.junit.Assert.assertTrue("'" + errorType29 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType29.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType32.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType37 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType37.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertTrue("'" + errorType45 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType45.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException2);
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        parkingSystemException3.addSuppressed((java.lang.Throwable) parkingSystemException5);
        java.lang.String str7 = parkingSystemException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str7.equals("models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType7);
        java.lang.Throwable throwable14 = null;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", throwable14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType16);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", throwable21);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException22);
        java.lang.Throwable[] throwableArray25 = parkingSystemException24.getSuppressed();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType16, (java.lang.Throwable) parkingSystemException26);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", errorType16);
        java.lang.Throwable throwable29 = null;
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType16, throwable29);
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException30);
        java.lang.Throwable throwable36 = null;
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("hi!", throwable36);
        models.ParkingSystemException.ErrorType errorType38 = parkingSystemException37.getErrorType();
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType38);
        models.ParkingSystemException parkingSystemException40 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType38);
        models.ParkingSystemException.ErrorType errorType42 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException43 = new models.ParkingSystemException("", errorType42);
        java.lang.Throwable[] throwableArray44 = parkingSystemException43.getSuppressed();
        models.ParkingSystemException.ErrorType errorType47 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException48 = new models.ParkingSystemException("", errorType47);
        java.lang.Throwable throwable51 = null;
        models.ParkingSystemException parkingSystemException52 = new models.ParkingSystemException("hi!", throwable51);
        models.ParkingSystemException.ErrorType errorType53 = parkingSystemException52.getErrorType();
        models.ParkingSystemException parkingSystemException54 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException52);
        models.ParkingSystemException parkingSystemException55 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType47, (java.lang.Throwable) parkingSystemException52);
        parkingSystemException43.addSuppressed((java.lang.Throwable) parkingSystemException55);
        models.ParkingSystemException parkingSystemException57 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType38, (java.lang.Throwable) parkingSystemException43);
        parkingSystemException30.addSuppressed((java.lang.Throwable) parkingSystemException57);
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertTrue("'" + errorType38 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType38.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType42 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType42.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertTrue("'" + errorType47 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType47.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType53 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType53.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        models.ParkingSystemException.ErrorType errorType6 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable9 = null;
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", throwable9);
        models.ParkingSystemException.ErrorType errorType11 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException10);
        java.lang.Throwable[] throwableArray13 = parkingSystemException12.getSuppressed();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType6, (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable throwable18 = null;
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("hi!", throwable18);
        models.ParkingSystemException.ErrorType errorType20 = parkingSystemException19.getErrorType();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType20);
        java.lang.Throwable throwable25 = null;
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("hi!", throwable25);
        models.ParkingSystemException.ErrorType errorType27 = parkingSystemException26.getErrorType();
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException26);
        java.lang.Throwable[] throwableArray29 = parkingSystemException28.getSuppressed();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException28);
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType20, (java.lang.Throwable) parkingSystemException30);
        parkingSystemException12.addSuppressed((java.lang.Throwable) parkingSystemException30);
        models.ParkingSystemException.ErrorType errorType33 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType33);
        java.lang.Throwable[] throwableArray35 = parkingSystemException34.getSuppressed();
        parkingSystemException3.addSuppressed((java.lang.Throwable) parkingSystemException34);
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException42 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException41);
        models.ParkingSystemException parkingSystemException43 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException41);
        java.lang.Throwable[] throwableArray44 = parkingSystemException43.getSuppressed();
        models.ParkingSystemException parkingSystemException45 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException43);
        parkingSystemException34.addSuppressed((java.lang.Throwable) parkingSystemException45);
        models.ParkingSystemException parkingSystemException47 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException34);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType6.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType11.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType20.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType27 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType27.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + errorType33 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType33.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray44);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        models.ParkingSystemException.ErrorType errorType7 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable10 = null;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", throwable10);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException11);
        java.lang.Throwable[] throwableArray14 = parkingSystemException13.getSuppressed();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType7, (java.lang.Throwable) parkingSystemException13);
        java.lang.Throwable throwable19 = null;
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("hi!", throwable19);
        models.ParkingSystemException.ErrorType errorType21 = parkingSystemException20.getErrorType();
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType21);
        java.lang.Throwable throwable26 = null;
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("hi!", throwable26);
        models.ParkingSystemException.ErrorType errorType28 = parkingSystemException27.getErrorType();
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException27);
        java.lang.Throwable[] throwableArray30 = parkingSystemException29.getSuppressed();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException29);
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType21, (java.lang.Throwable) parkingSystemException31);
        parkingSystemException13.addSuppressed((java.lang.Throwable) parkingSystemException31);
        models.ParkingSystemException.ErrorType errorType34 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType34);
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException38);
        models.ParkingSystemException parkingSystemException40 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType34, (java.lang.Throwable) parkingSystemException39);
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("", errorType2, (java.lang.Throwable) parkingSystemException40);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType2.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType7.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType21.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType28 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType28.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertTrue("'" + errorType34 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType34.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType9);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType9);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException11);
        java.lang.Class<?> wildcardClass13 = parkingSystemException11.getClass();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        models.ParkingSystemException.ErrorType errorType6 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable9 = null;
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", throwable9);
        models.ParkingSystemException.ErrorType errorType11 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException10);
        java.lang.Throwable[] throwableArray13 = parkingSystemException12.getSuppressed();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType6, (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable throwable18 = null;
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("hi!", throwable18);
        models.ParkingSystemException.ErrorType errorType20 = parkingSystemException19.getErrorType();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType20);
        java.lang.Throwable throwable25 = null;
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("hi!", throwable25);
        models.ParkingSystemException.ErrorType errorType27 = parkingSystemException26.getErrorType();
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException26);
        java.lang.Throwable[] throwableArray29 = parkingSystemException28.getSuppressed();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException28);
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType20, (java.lang.Throwable) parkingSystemException30);
        parkingSystemException12.addSuppressed((java.lang.Throwable) parkingSystemException30);
        models.ParkingSystemException.ErrorType errorType33 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType33);
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException37);
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType33, (java.lang.Throwable) parkingSystemException38);
        models.ParkingSystemException.ErrorType errorType40 = parkingSystemException39.getErrorType();
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("", errorType40);
        models.ParkingSystemException parkingSystemException42 = new models.ParkingSystemException("hi!", errorType40);
        models.ParkingSystemException.ErrorType errorType44 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable47 = null;
        models.ParkingSystemException parkingSystemException48 = new models.ParkingSystemException("hi!", throwable47);
        models.ParkingSystemException.ErrorType errorType49 = parkingSystemException48.getErrorType();
        models.ParkingSystemException parkingSystemException50 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException48);
        java.lang.Throwable[] throwableArray51 = parkingSystemException50.getSuppressed();
        models.ParkingSystemException parkingSystemException52 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType44, (java.lang.Throwable) parkingSystemException50);
        models.ParkingSystemException parkingSystemException54 = new models.ParkingSystemException("models.ParkingSystemException: ");
        parkingSystemException50.addSuppressed((java.lang.Throwable) parkingSystemException54);
        models.ParkingSystemException.ErrorType errorType56 = parkingSystemException54.getErrorType();
        models.ParkingSystemException parkingSystemException57 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType40, (java.lang.Throwable) parkingSystemException54);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType6.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType11.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType20.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType27 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType27.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + errorType33 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType33.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType40 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType40.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType44 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType44.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType49 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType49.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertTrue("'" + errorType56 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType56.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.AUTHORIZATION;
        models.ParkingSystemException.ErrorType errorType4 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4);
        java.lang.Throwable throwable9 = null;
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", throwable9);
        models.ParkingSystemException.ErrorType errorType11 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException10);
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException10);
        parkingSystemException5.addSuppressed((java.lang.Throwable) parkingSystemException10);
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", errorType2, (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException19);
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException19);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", errorType2, (java.lang.Throwable) parkingSystemException19);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.AUTHORIZATION + "'", errorType2.equals(models.ParkingSystemException.ErrorType.AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType4.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType11.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        java.lang.Throwable[] throwableArray7 = parkingSystemException6.getSuppressed();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        java.lang.String str9 = parkingSystemException6.toString();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.ParkingSystemException: " + "'", str9.equals("models.ParkingSystemException: "));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType2);
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("", errorType2);
        java.lang.Class<?> wildcardClass5 = parkingSystemException4.getClass();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType2.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8);
        java.lang.Throwable throwable13 = null;
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("hi!", throwable13);
        models.ParkingSystemException.ErrorType errorType15 = parkingSystemException14.getErrorType();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException14);
        java.lang.Throwable[] throwableArray17 = parkingSystemException16.getSuppressed();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable24 = null;
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("hi!", throwable24);
        models.ParkingSystemException.ErrorType errorType26 = parkingSystemException25.getErrorType();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        parkingSystemException21.addSuppressed((java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType8, (java.lang.Throwable) parkingSystemException21);
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8);
        java.lang.Throwable throwable34 = null;
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("hi!", throwable34);
        models.ParkingSystemException.ErrorType errorType36 = parkingSystemException35.getErrorType();
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException35);
        models.ParkingSystemException.ErrorType errorType38 = parkingSystemException35.getErrorType();
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType38);
        java.lang.Throwable throwable45 = null;
        models.ParkingSystemException parkingSystemException46 = new models.ParkingSystemException("hi!", throwable45);
        models.ParkingSystemException.ErrorType errorType47 = parkingSystemException46.getErrorType();
        models.ParkingSystemException parkingSystemException48 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType47);
        java.lang.Throwable throwable52 = null;
        models.ParkingSystemException parkingSystemException53 = new models.ParkingSystemException("hi!", throwable52);
        models.ParkingSystemException.ErrorType errorType54 = parkingSystemException53.getErrorType();
        models.ParkingSystemException parkingSystemException55 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException53);
        java.lang.Throwable[] throwableArray56 = parkingSystemException55.getSuppressed();
        models.ParkingSystemException parkingSystemException57 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException55);
        models.ParkingSystemException parkingSystemException58 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType47, (java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException parkingSystemException59 = new models.ParkingSystemException("", errorType47);
        java.lang.Throwable throwable60 = null;
        models.ParkingSystemException parkingSystemException61 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType47, throwable60);
        parkingSystemException39.addSuppressed((java.lang.Throwable) parkingSystemException61);
        models.ParkingSystemException parkingSystemException63 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException61);
        java.lang.String str64 = parkingSystemException61.toString();
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType15.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType26.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType36 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType36.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType38 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType38.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType47 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType47.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType54 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType54.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str64.equals("models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType8);
        java.lang.Throwable throwable15 = null;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", throwable15);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType17);
        java.lang.Throwable throwable22 = null;
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("hi!", throwable22);
        models.ParkingSystemException.ErrorType errorType24 = parkingSystemException23.getErrorType();
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException23);
        java.lang.Throwable[] throwableArray26 = parkingSystemException25.getSuppressed();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType17, (java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("", errorType17);
        java.lang.Throwable throwable30 = null;
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType17, throwable30);
        parkingSystemException9.addSuppressed((java.lang.Throwable) parkingSystemException31);
        java.lang.Throwable[] throwableArray33 = parkingSystemException9.getSuppressed();
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException9);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType24.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType9);
        java.lang.Throwable throwable14 = null;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", throwable14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException15);
        java.lang.Throwable[] throwableArray18 = parkingSystemException17.getSuppressed();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException17);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType9, (java.lang.Throwable) parkingSystemException19);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable25 = null;
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("hi!", throwable25);
        models.ParkingSystemException.ErrorType errorType27 = parkingSystemException26.getErrorType();
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException26);
        parkingSystemException22.addSuppressed((java.lang.Throwable) parkingSystemException28);
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType9, (java.lang.Throwable) parkingSystemException22);
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType9);
        models.ParkingSystemException.ErrorType errorType33 = models.ParkingSystemException.ErrorType.BUSINESS_LOGIC;
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType33);
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType9, (java.lang.Throwable) parkingSystemException34);
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType9);
        models.ParkingSystemException.ErrorType errorType37 = parkingSystemException36.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + errorType27 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType27.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType33 + "' != '" + models.ParkingSystemException.ErrorType.BUSINESS_LOGIC + "'", errorType33.equals(models.ParkingSystemException.ErrorType.BUSINESS_LOGIC));
        org.junit.Assert.assertTrue("'" + errorType37 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType37.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        java.lang.Throwable[] throwableArray9 = parkingSystemException8.getSuppressed();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException8);
        java.lang.Throwable throwable14 = null;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", throwable14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType16);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", throwable21);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException22);
        java.lang.Throwable[] throwableArray25 = parkingSystemException24.getSuppressed();
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException24);
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType16, (java.lang.Throwable) parkingSystemException26);
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException26);
        java.lang.Throwable[] throwableArray29 = parkingSystemException26.getSuppressed();
        models.ParkingSystemException.ErrorType errorType30 = parkingSystemException26.getErrorType();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException26);
        java.lang.Throwable throwable32 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSystemException31.addSuppressed(throwable32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType30.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType6);
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType6);
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", errorType6);
        java.lang.Throwable throwable13 = null;
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("hi!", throwable13);
        models.ParkingSystemException.ErrorType errorType15 = parkingSystemException14.getErrorType();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException14);
        java.lang.Throwable[] throwableArray17 = parkingSystemException16.getSuppressed();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException.ErrorType errorType20 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("", errorType20);
        java.lang.Throwable[] throwableArray22 = parkingSystemException21.getSuppressed();
        parkingSystemException16.addSuppressed((java.lang.Throwable) parkingSystemException21);
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType6, (java.lang.Throwable) parkingSystemException21);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType15.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType20.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException3);
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        parkingSystemException4.addSuppressed((java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", errorType8, (java.lang.Throwable) parkingSystemException14);
        java.lang.Throwable throwable19 = null;
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("hi!", throwable19);
        models.ParkingSystemException.ErrorType errorType21 = parkingSystemException20.getErrorType();
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException.ErrorType errorType25 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType25);
        java.lang.Throwable throwable30 = null;
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("hi!", throwable30);
        models.ParkingSystemException.ErrorType errorType32 = parkingSystemException31.getErrorType();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException31);
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException31);
        parkingSystemException26.addSuppressed((java.lang.Throwable) parkingSystemException31);
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType23, (java.lang.Throwable) parkingSystemException31);
        parkingSystemException14.addSuppressed((java.lang.Throwable) parkingSystemException36);
        java.lang.Throwable[] throwableArray38 = parkingSystemException14.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType21.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType25.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType32.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray38);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException.ErrorType errorType10 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType10);
        java.lang.Throwable throwable15 = null;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", throwable15);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException16);
        parkingSystemException11.addSuppressed((java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException.ErrorType errorType22 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException16);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType10.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType22.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4);
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        parkingSystemException5.addSuppressed((java.lang.Throwable) parkingSystemException8);
        models.ParkingSystemException.ErrorType errorType11 = parkingSystemException8.getErrorType();
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException8.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType11.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.SYSTEM_ERROR;
        models.ParkingSystemException.ErrorType errorType4 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException8);
        java.lang.Throwable[] throwableArray11 = parkingSystemException10.getSuppressed();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType4, (java.lang.Throwable) parkingSystemException10);
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", throwable21);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType23);
        java.lang.Throwable throwable28 = null;
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("hi!", throwable28);
        models.ParkingSystemException.ErrorType errorType30 = parkingSystemException29.getErrorType();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException29);
        java.lang.Throwable[] throwableArray32 = parkingSystemException31.getSuppressed();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException31);
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType23, (java.lang.Throwable) parkingSystemException33);
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("", errorType23);
        java.lang.Throwable throwable36 = null;
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType23, throwable36);
        models.ParkingSystemException.ErrorType errorType40 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("", errorType40);
        models.ParkingSystemException parkingSystemException43 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType44 = parkingSystemException43.getErrorType();
        models.ParkingSystemException parkingSystemException45 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType40, (java.lang.Throwable) parkingSystemException43);
        java.lang.Throwable throwable50 = null;
        models.ParkingSystemException parkingSystemException51 = new models.ParkingSystemException("hi!", throwable50);
        models.ParkingSystemException.ErrorType errorType52 = parkingSystemException51.getErrorType();
        models.ParkingSystemException parkingSystemException53 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException51);
        models.ParkingSystemException.ErrorType errorType54 = parkingSystemException51.getErrorType();
        models.ParkingSystemException parkingSystemException55 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType54);
        java.lang.Throwable throwable61 = null;
        models.ParkingSystemException parkingSystemException62 = new models.ParkingSystemException("hi!", throwable61);
        models.ParkingSystemException.ErrorType errorType63 = parkingSystemException62.getErrorType();
        models.ParkingSystemException parkingSystemException64 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType63);
        java.lang.Throwable throwable68 = null;
        models.ParkingSystemException parkingSystemException69 = new models.ParkingSystemException("hi!", throwable68);
        models.ParkingSystemException.ErrorType errorType70 = parkingSystemException69.getErrorType();
        models.ParkingSystemException parkingSystemException71 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException69);
        java.lang.Throwable[] throwableArray72 = parkingSystemException71.getSuppressed();
        models.ParkingSystemException parkingSystemException73 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException71);
        models.ParkingSystemException parkingSystemException74 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType63, (java.lang.Throwable) parkingSystemException73);
        models.ParkingSystemException parkingSystemException75 = new models.ParkingSystemException("", errorType63);
        java.lang.Throwable throwable76 = null;
        models.ParkingSystemException parkingSystemException77 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType63, throwable76);
        parkingSystemException55.addSuppressed((java.lang.Throwable) parkingSystemException77);
        java.lang.Throwable[] throwableArray79 = parkingSystemException55.getSuppressed();
        models.ParkingSystemException parkingSystemException80 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException55);
        parkingSystemException43.addSuppressed((java.lang.Throwable) parkingSystemException80);
        models.ParkingSystemException parkingSystemException82 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType23, (java.lang.Throwable) parkingSystemException80);
        models.ParkingSystemException parkingSystemException86 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType87 = parkingSystemException86.getErrorType();
        models.ParkingSystemException parkingSystemException88 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType87);
        models.ParkingSystemException parkingSystemException89 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType87);
        models.ParkingSystemException parkingSystemException90 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", errorType23, (java.lang.Throwable) parkingSystemException89);
        models.ParkingSystemException parkingSystemException91 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType2, (java.lang.Throwable) parkingSystemException89);
        java.lang.Throwable[] throwableArray92 = parkingSystemException91.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType2.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType4.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType30.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + errorType40 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType40.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType44 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType44.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType52 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType52.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType54 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType54.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType63 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType63.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType70 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType70.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertTrue("'" + errorType87 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType87.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray92);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        models.ParkingSystemException.ErrorType errorType3 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        java.lang.Throwable[] throwableArray10 = parkingSystemException9.getSuppressed();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType3, (java.lang.Throwable) parkingSystemException9);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType3);
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType3);
        java.lang.Class<?> wildcardClass14 = parkingSystemException13.getClass();
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType3.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.VALIDATION;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        models.ParkingSystemException.ErrorType errorType5 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", errorType5);
        models.ParkingSystemException.ErrorType errorType9 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable12 = null;
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("hi!", throwable12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException13);
        java.lang.Throwable[] throwableArray16 = parkingSystemException15.getSuppressed();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType9, (java.lang.Throwable) parkingSystemException15);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", throwable21);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType23);
        java.lang.Throwable throwable28 = null;
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("hi!", throwable28);
        models.ParkingSystemException.ErrorType errorType30 = parkingSystemException29.getErrorType();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException29);
        java.lang.Throwable[] throwableArray32 = parkingSystemException31.getSuppressed();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException31);
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType23, (java.lang.Throwable) parkingSystemException33);
        parkingSystemException15.addSuppressed((java.lang.Throwable) parkingSystemException33);
        models.ParkingSystemException.ErrorType errorType36 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType36);
        java.lang.Throwable[] throwableArray38 = parkingSystemException37.getSuppressed();
        parkingSystemException6.addSuppressed((java.lang.Throwable) parkingSystemException37);
        models.ParkingSystemException.ErrorType errorType40 = parkingSystemException37.getErrorType();
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException37);
        java.lang.Throwable[] throwableArray42 = parkingSystemException37.getSuppressed();
        models.ParkingSystemException.ErrorType errorType43 = parkingSystemException37.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.VALIDATION + "'", errorType2.equals(models.ParkingSystemException.ErrorType.VALIDATION));
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType5.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType9.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType30.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + errorType36 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType36.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertTrue("'" + errorType40 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType40.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertTrue("'" + errorType43 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType43.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException3);
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        parkingSystemException4.addSuppressed((java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException4.getErrorType();
        java.lang.Throwable throwable9 = null;
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", errorType8, throwable9);
        java.lang.String str11 = parkingSystemException10.toString();
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!" + "'", str11.equals("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        java.lang.Throwable[] throwableArray9 = parkingSystemException8.getSuppressed();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException8);
        models.ParkingSystemException.ErrorType errorType11 = parkingSystemException10.getErrorType();
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType12);
        java.lang.String str14 = parkingSystemException13.toString();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType11.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType12.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: " + "'", str14.equals("models.ParkingSystemException: models.ParkingSystemException: "));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.VALIDATION;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        models.ParkingSystemException.ErrorType errorType5 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", errorType5);
        models.ParkingSystemException.ErrorType errorType9 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable12 = null;
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("hi!", throwable12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException13);
        java.lang.Throwable[] throwableArray16 = parkingSystemException15.getSuppressed();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType9, (java.lang.Throwable) parkingSystemException15);
        java.lang.Throwable throwable21 = null;
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("hi!", throwable21);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType23);
        java.lang.Throwable throwable28 = null;
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("hi!", throwable28);
        models.ParkingSystemException.ErrorType errorType30 = parkingSystemException29.getErrorType();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException29);
        java.lang.Throwable[] throwableArray32 = parkingSystemException31.getSuppressed();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException31);
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType23, (java.lang.Throwable) parkingSystemException33);
        parkingSystemException15.addSuppressed((java.lang.Throwable) parkingSystemException33);
        models.ParkingSystemException.ErrorType errorType36 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType36);
        java.lang.Throwable[] throwableArray38 = parkingSystemException37.getSuppressed();
        parkingSystemException6.addSuppressed((java.lang.Throwable) parkingSystemException37);
        models.ParkingSystemException.ErrorType errorType40 = parkingSystemException37.getErrorType();
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException37);
        java.lang.Throwable throwable45 = null;
        models.ParkingSystemException parkingSystemException46 = new models.ParkingSystemException("hi!", throwable45);
        models.ParkingSystemException.ErrorType errorType47 = parkingSystemException46.getErrorType();
        models.ParkingSystemException parkingSystemException48 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException46);
        models.ParkingSystemException.ErrorType errorType49 = parkingSystemException48.getErrorType();
        models.ParkingSystemException.ErrorType errorType51 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException52 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType51);
        java.lang.Throwable throwable56 = null;
        models.ParkingSystemException parkingSystemException57 = new models.ParkingSystemException("hi!", throwable56);
        models.ParkingSystemException.ErrorType errorType58 = parkingSystemException57.getErrorType();
        models.ParkingSystemException parkingSystemException59 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException parkingSystemException60 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException57);
        parkingSystemException52.addSuppressed((java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException parkingSystemException62 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType49, (java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException.ErrorType errorType63 = parkingSystemException57.getErrorType();
        parkingSystemException37.addSuppressed((java.lang.Throwable) parkingSystemException57);
        java.lang.Throwable[] throwableArray65 = parkingSystemException57.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.VALIDATION + "'", errorType2.equals(models.ParkingSystemException.ErrorType.VALIDATION));
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType5.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType9.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType30.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + errorType36 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType36.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertTrue("'" + errorType40 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType40.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType47 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType47.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType49 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType49.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType51 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType51.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType58 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType58.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType63 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType63.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray65);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException18);
        parkingSystemException12.addSuppressed((java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException.ErrorType errorType27 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", errorType27);
        java.lang.Throwable throwable32 = null;
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("hi!", throwable32);
        models.ParkingSystemException.ErrorType errorType34 = parkingSystemException33.getErrorType();
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType34);
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType34);
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType27, (java.lang.Throwable) parkingSystemException36);
        models.ParkingSystemException.ErrorType errorType38 = parkingSystemException36.getErrorType();
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType38);
        models.ParkingSystemException.ErrorType errorType41 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable44 = null;
        models.ParkingSystemException parkingSystemException45 = new models.ParkingSystemException("hi!", throwable44);
        models.ParkingSystemException.ErrorType errorType46 = parkingSystemException45.getErrorType();
        models.ParkingSystemException parkingSystemException47 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException45);
        java.lang.Throwable[] throwableArray48 = parkingSystemException47.getSuppressed();
        models.ParkingSystemException parkingSystemException49 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType41, (java.lang.Throwable) parkingSystemException47);
        java.lang.Throwable throwable53 = null;
        models.ParkingSystemException parkingSystemException54 = new models.ParkingSystemException("hi!", throwable53);
        models.ParkingSystemException.ErrorType errorType55 = parkingSystemException54.getErrorType();
        models.ParkingSystemException parkingSystemException56 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType55);
        java.lang.Throwable throwable60 = null;
        models.ParkingSystemException parkingSystemException61 = new models.ParkingSystemException("hi!", throwable60);
        models.ParkingSystemException.ErrorType errorType62 = parkingSystemException61.getErrorType();
        models.ParkingSystemException parkingSystemException63 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException61);
        java.lang.Throwable[] throwableArray64 = parkingSystemException63.getSuppressed();
        models.ParkingSystemException parkingSystemException65 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException63);
        models.ParkingSystemException parkingSystemException66 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType55, (java.lang.Throwable) parkingSystemException65);
        parkingSystemException47.addSuppressed((java.lang.Throwable) parkingSystemException65);
        models.ParkingSystemException.ErrorType errorType68 = parkingSystemException47.getErrorType();
        models.ParkingSystemException parkingSystemException69 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType38, (java.lang.Throwable) parkingSystemException47);
        models.ParkingSystemException parkingSystemException70 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType8, (java.lang.Throwable) parkingSystemException69);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType27 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType27.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType34 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType34.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType38 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType38.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType41 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType41.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType46 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType46.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertTrue("'" + errorType55 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType55.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType62 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType62.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertTrue("'" + errorType68 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType68.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable[] throwableArray8 = parkingSystemException7.getSuppressed();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType1, (java.lang.Throwable) parkingSystemException7);
        java.lang.Throwable throwable15 = null;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", throwable15);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException.ErrorType errorType19 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("hi!", errorType19);
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType19);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException21);
        parkingSystemException7.addSuppressed((java.lang.Throwable) parkingSystemException22);
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType1.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType19.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        java.lang.Throwable[] throwableArray9 = parkingSystemException8.getSuppressed();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException8);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: ");
        parkingSystemException8.addSuppressed((java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", errorType14);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType2);
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("", errorType2);
        java.lang.Throwable[] throwableArray5 = parkingSystemException4.getSuppressed();
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException4.getErrorType();
        java.lang.Throwable[] throwableArray7 = parkingSystemException4.getSuppressed();
        java.lang.Class<?> wildcardClass8 = throwableArray7.getClass();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType2.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType6.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!");
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", errorType6);
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", errorType6);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType6);
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType6);
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", errorType6);
        models.ParkingSystemException.ErrorType errorType11 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable14 = null;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", throwable14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException15);
        java.lang.Throwable[] throwableArray18 = parkingSystemException17.getSuppressed();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType11, (java.lang.Throwable) parkingSystemException17);
        parkingSystemException9.addSuppressed((java.lang.Throwable) parkingSystemException19);
        models.ParkingSystemException.ErrorType errorType23 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("", errorType23);
        java.lang.Throwable throwable28 = null;
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("hi!", throwable28);
        models.ParkingSystemException.ErrorType errorType30 = parkingSystemException29.getErrorType();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType30);
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType30);
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType23, (java.lang.Throwable) parkingSystemException32);
        parkingSystemException9.addSuppressed((java.lang.Throwable) parkingSystemException32);
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException9);
        java.lang.Class<?> wildcardClass36 = parkingSystemException35.getClass();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType11.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType23.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType30.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        models.ParkingSystemException.ErrorType errorType1 = null;
        java.lang.Throwable throwable8 = null;
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", throwable8);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException9.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException9);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException9.getErrorType();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("hi!", errorType12);
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType12);
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType12);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType16);
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", errorType1, (java.lang.Throwable) parkingSystemException17);
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        models.ParkingSystemException.ErrorType errorType4 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4);
        models.ParkingSystemException.ErrorType errorType7 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable10 = null;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", throwable10);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException11);
        java.lang.Throwable[] throwableArray14 = parkingSystemException13.getSuppressed();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType7, (java.lang.Throwable) parkingSystemException13);
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType4, (java.lang.Throwable) parkingSystemException13);
        models.ParkingSystemException.ErrorType errorType18 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType18);
        java.lang.Throwable[] throwableArray20 = parkingSystemException19.getSuppressed();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4, (java.lang.Throwable) parkingSystemException19);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType4);
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType4.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType7.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType18.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", errorType10);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType10);
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType10);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType14);
        java.lang.Throwable throwable19 = null;
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("hi!", throwable19);
        models.ParkingSystemException.ErrorType errorType21 = parkingSystemException20.getErrorType();
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException20);
        java.lang.Throwable[] throwableArray23 = parkingSystemException20.getSuppressed();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException20);
        parkingSystemException15.addSuppressed((java.lang.Throwable) parkingSystemException24);
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType21.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.lang.Throwable throwable3 = null;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("hi!", throwable3);
        models.ParkingSystemException.ErrorType errorType5 = parkingSystemException4.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException4);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException.ErrorType errorType9 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType9);
        java.lang.Throwable throwable14 = null;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", throwable14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException15);
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException15);
        parkingSystemException10.addSuppressed((java.lang.Throwable) parkingSystemException15);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType7, (java.lang.Throwable) parkingSystemException15);
        java.lang.Throwable[] throwableArray21 = parkingSystemException15.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType5.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType9.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.lang.Throwable throwable8 = null;
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", throwable8);
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException9.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType10);
        java.lang.Throwable throwable15 = null;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("hi!", throwable15);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException16.getErrorType();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        java.lang.Throwable[] throwableArray19 = parkingSystemException18.getSuppressed();
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType10, (java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable26 = null;
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("hi!", throwable26);
        models.ParkingSystemException.ErrorType errorType28 = parkingSystemException27.getErrorType();
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException27);
        parkingSystemException23.addSuppressed((java.lang.Throwable) parkingSystemException29);
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType10, (java.lang.Throwable) parkingSystemException23);
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType10);
        java.lang.Throwable throwable36 = null;
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("hi!", throwable36);
        models.ParkingSystemException.ErrorType errorType38 = parkingSystemException37.getErrorType();
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException37);
        models.ParkingSystemException.ErrorType errorType40 = parkingSystemException37.getErrorType();
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType40);
        java.lang.Throwable throwable47 = null;
        models.ParkingSystemException parkingSystemException48 = new models.ParkingSystemException("hi!", throwable47);
        models.ParkingSystemException.ErrorType errorType49 = parkingSystemException48.getErrorType();
        models.ParkingSystemException parkingSystemException50 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType49);
        java.lang.Throwable throwable54 = null;
        models.ParkingSystemException parkingSystemException55 = new models.ParkingSystemException("hi!", throwable54);
        models.ParkingSystemException.ErrorType errorType56 = parkingSystemException55.getErrorType();
        models.ParkingSystemException parkingSystemException57 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException55);
        java.lang.Throwable[] throwableArray58 = parkingSystemException57.getSuppressed();
        models.ParkingSystemException parkingSystemException59 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException parkingSystemException60 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType49, (java.lang.Throwable) parkingSystemException59);
        models.ParkingSystemException parkingSystemException61 = new models.ParkingSystemException("", errorType49);
        java.lang.Throwable throwable62 = null;
        models.ParkingSystemException parkingSystemException63 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType49, throwable62);
        parkingSystemException41.addSuppressed((java.lang.Throwable) parkingSystemException63);
        models.ParkingSystemException parkingSystemException65 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType10, (java.lang.Throwable) parkingSystemException63);
        models.ParkingSystemException parkingSystemException66 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType10);
        models.ParkingSystemException parkingSystemException67 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType10);
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + errorType28 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType28.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType38 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType38.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType40 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType40.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType49 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType49.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType56 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType56.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray58);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.lang.Throwable throwable2 = null;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("hi!", throwable2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        parkingSystemException3.addSuppressed((java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException3);
        java.lang.String str9 = parkingSystemException3.toString();
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType4.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.ParkingSystemException: hi!" + "'", str9.equals("models.ParkingSystemException: hi!"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable[] throwableArray8 = parkingSystemException7.getSuppressed();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        models.ParkingSystemException.ErrorType errorType11 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("", errorType11);
        java.lang.Throwable[] throwableArray13 = parkingSystemException12.getSuppressed();
        parkingSystemException7.addSuppressed((java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable[] throwableArray15 = parkingSystemException7.getSuppressed();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException7);
        models.ParkingSystemException.ErrorType errorType17 = parkingSystemException7.getErrorType();
        java.lang.Throwable[] throwableArray18 = parkingSystemException7.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType11.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType17.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.BUSINESS_LOGIC;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType2);
        models.ParkingSystemException.ErrorType errorType4 = parkingSystemException3.getErrorType();
        java.lang.Throwable throwable12 = null;
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("hi!", throwable12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType14);
        java.lang.Throwable throwable19 = null;
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("hi!", throwable19);
        models.ParkingSystemException.ErrorType errorType21 = parkingSystemException20.getErrorType();
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException20);
        java.lang.Throwable[] throwableArray23 = parkingSystemException22.getSuppressed();
        models.ParkingSystemException parkingSystemException24 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException22);
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType14, (java.lang.Throwable) parkingSystemException24);
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("", errorType14);
        java.lang.Throwable throwable27 = null;
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType14, throwable27);
        models.ParkingSystemException.ErrorType errorType31 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("", errorType31);
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType35 = parkingSystemException34.getErrorType();
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType31, (java.lang.Throwable) parkingSystemException34);
        java.lang.Throwable throwable41 = null;
        models.ParkingSystemException parkingSystemException42 = new models.ParkingSystemException("hi!", throwable41);
        models.ParkingSystemException.ErrorType errorType43 = parkingSystemException42.getErrorType();
        models.ParkingSystemException parkingSystemException44 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException42);
        models.ParkingSystemException.ErrorType errorType45 = parkingSystemException42.getErrorType();
        models.ParkingSystemException parkingSystemException46 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType45);
        java.lang.Throwable throwable52 = null;
        models.ParkingSystemException parkingSystemException53 = new models.ParkingSystemException("hi!", throwable52);
        models.ParkingSystemException.ErrorType errorType54 = parkingSystemException53.getErrorType();
        models.ParkingSystemException parkingSystemException55 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType54);
        java.lang.Throwable throwable59 = null;
        models.ParkingSystemException parkingSystemException60 = new models.ParkingSystemException("hi!", throwable59);
        models.ParkingSystemException.ErrorType errorType61 = parkingSystemException60.getErrorType();
        models.ParkingSystemException parkingSystemException62 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException60);
        java.lang.Throwable[] throwableArray63 = parkingSystemException62.getSuppressed();
        models.ParkingSystemException parkingSystemException64 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException62);
        models.ParkingSystemException parkingSystemException65 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType54, (java.lang.Throwable) parkingSystemException64);
        models.ParkingSystemException parkingSystemException66 = new models.ParkingSystemException("", errorType54);
        java.lang.Throwable throwable67 = null;
        models.ParkingSystemException parkingSystemException68 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType54, throwable67);
        parkingSystemException46.addSuppressed((java.lang.Throwable) parkingSystemException68);
        java.lang.Throwable[] throwableArray70 = parkingSystemException46.getSuppressed();
        models.ParkingSystemException parkingSystemException71 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException46);
        parkingSystemException34.addSuppressed((java.lang.Throwable) parkingSystemException71);
        models.ParkingSystemException parkingSystemException73 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType14, (java.lang.Throwable) parkingSystemException71);
        models.ParkingSystemException parkingSystemException77 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType78 = parkingSystemException77.getErrorType();
        models.ParkingSystemException parkingSystemException79 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType78);
        models.ParkingSystemException parkingSystemException80 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType78);
        models.ParkingSystemException parkingSystemException81 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", errorType14, (java.lang.Throwable) parkingSystemException80);
        models.ParkingSystemException parkingSystemException82 = new models.ParkingSystemException("", errorType4, (java.lang.Throwable) parkingSystemException80);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.BUSINESS_LOGIC + "'", errorType2.equals(models.ParkingSystemException.ErrorType.BUSINESS_LOGIC));
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.BUSINESS_LOGIC + "'", errorType4.equals(models.ParkingSystemException.ErrorType.BUSINESS_LOGIC));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType21.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertTrue("'" + errorType31 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType31.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType35 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType35.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType43 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType43.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType45 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType45.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType54 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType54.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType61 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType61.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertTrue("'" + errorType78 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType78.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType6);
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType6);
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", errorType6);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!");
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException.ErrorType errorType14 = parkingSystemException13.getErrorType();
        java.lang.Throwable throwable20 = null;
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("hi!", throwable20);
        models.ParkingSystemException.ErrorType errorType22 = parkingSystemException21.getErrorType();
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException21);
        models.ParkingSystemException.ErrorType errorType24 = parkingSystemException21.getErrorType();
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("hi!", errorType24);
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType24);
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException26);
        parkingSystemException13.addSuppressed((java.lang.Throwable) parkingSystemException27);
        parkingSystemException9.addSuppressed((java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException27);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType14.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType22.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType24.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType9);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType9);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException11);
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType18 = parkingSystemException17.getErrorType();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType18);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType18);
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("", errorType18);
        models.ParkingSystemException.ErrorType errorType23 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable26 = null;
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("hi!", throwable26);
        models.ParkingSystemException.ErrorType errorType28 = parkingSystemException27.getErrorType();
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException27);
        java.lang.Throwable[] throwableArray30 = parkingSystemException29.getSuppressed();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType23, (java.lang.Throwable) parkingSystemException29);
        parkingSystemException21.addSuppressed((java.lang.Throwable) parkingSystemException31);
        models.ParkingSystemException.ErrorType errorType35 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("", errorType35);
        java.lang.Throwable throwable40 = null;
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("hi!", throwable40);
        models.ParkingSystemException.ErrorType errorType42 = parkingSystemException41.getErrorType();
        models.ParkingSystemException parkingSystemException43 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType42);
        models.ParkingSystemException parkingSystemException44 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType42);
        models.ParkingSystemException parkingSystemException45 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType35, (java.lang.Throwable) parkingSystemException44);
        parkingSystemException21.addSuppressed((java.lang.Throwable) parkingSystemException44);
        parkingSystemException11.addSuppressed((java.lang.Throwable) parkingSystemException21);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType18.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType23.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType28 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType28.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertTrue("'" + errorType35 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType35.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType42 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType42.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8);
        java.lang.Throwable throwable13 = null;
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("hi!", throwable13);
        models.ParkingSystemException.ErrorType errorType15 = parkingSystemException14.getErrorType();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException14);
        java.lang.Throwable[] throwableArray17 = parkingSystemException16.getSuppressed();
        models.ParkingSystemException parkingSystemException18 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException16);
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException18);
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable24 = null;
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("hi!", throwable24);
        models.ParkingSystemException.ErrorType errorType26 = parkingSystemException25.getErrorType();
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException25);
        parkingSystemException21.addSuppressed((java.lang.Throwable) parkingSystemException27);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType8, (java.lang.Throwable) parkingSystemException21);
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType8);
        java.lang.Throwable throwable34 = null;
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("hi!", throwable34);
        models.ParkingSystemException.ErrorType errorType36 = parkingSystemException35.getErrorType();
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException35);
        models.ParkingSystemException.ErrorType errorType38 = parkingSystemException35.getErrorType();
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType38);
        java.lang.Throwable throwable45 = null;
        models.ParkingSystemException parkingSystemException46 = new models.ParkingSystemException("hi!", throwable45);
        models.ParkingSystemException.ErrorType errorType47 = parkingSystemException46.getErrorType();
        models.ParkingSystemException parkingSystemException48 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType47);
        java.lang.Throwable throwable52 = null;
        models.ParkingSystemException parkingSystemException53 = new models.ParkingSystemException("hi!", throwable52);
        models.ParkingSystemException.ErrorType errorType54 = parkingSystemException53.getErrorType();
        models.ParkingSystemException parkingSystemException55 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException53);
        java.lang.Throwable[] throwableArray56 = parkingSystemException55.getSuppressed();
        models.ParkingSystemException parkingSystemException57 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException55);
        models.ParkingSystemException parkingSystemException58 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType47, (java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException parkingSystemException59 = new models.ParkingSystemException("", errorType47);
        java.lang.Throwable throwable60 = null;
        models.ParkingSystemException parkingSystemException61 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType47, throwable60);
        parkingSystemException39.addSuppressed((java.lang.Throwable) parkingSystemException61);
        models.ParkingSystemException parkingSystemException63 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType8, (java.lang.Throwable) parkingSystemException61);
        java.lang.Throwable[] throwableArray64 = parkingSystemException61.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType15.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType26.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType36 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType36.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType38 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType38.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType47 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType47.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType54 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType54.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray64);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        models.ParkingSystemException.ErrorType errorType5 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType5);
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", errorType5);
        java.lang.Throwable throwable10 = null;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", throwable10);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException11);
        java.lang.Throwable[] throwableArray14 = parkingSystemException13.getSuppressed();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType5, (java.lang.Throwable) parkingSystemException13);
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException13);
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException13);
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType5.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException2 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType1);
        java.lang.Throwable throwable6 = null;
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("hi!", throwable6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException7.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException7);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException7);
        parkingSystemException2.addSuppressed((java.lang.Throwable) parkingSystemException7);
        java.lang.Throwable[] throwableArray12 = parkingSystemException2.getSuppressed();
        models.ParkingSystemException.ErrorType errorType13 = parkingSystemException2.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType1.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType13.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType6);
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType6);
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType6);
        java.lang.Throwable throwable11 = null;
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("hi!", throwable11);
        models.ParkingSystemException.ErrorType errorType13 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException16);
        parkingSystemException12.addSuppressed((java.lang.Throwable) parkingSystemException17);
        models.ParkingSystemException.ErrorType errorType20 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("", errorType20);
        models.ParkingSystemException.ErrorType errorType24 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable27 = null;
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("hi!", throwable27);
        models.ParkingSystemException.ErrorType errorType29 = parkingSystemException28.getErrorType();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException28);
        java.lang.Throwable[] throwableArray31 = parkingSystemException30.getSuppressed();
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType24, (java.lang.Throwable) parkingSystemException30);
        java.lang.Throwable throwable36 = null;
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("hi!", throwable36);
        models.ParkingSystemException.ErrorType errorType38 = parkingSystemException37.getErrorType();
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType38);
        java.lang.Throwable throwable43 = null;
        models.ParkingSystemException parkingSystemException44 = new models.ParkingSystemException("hi!", throwable43);
        models.ParkingSystemException.ErrorType errorType45 = parkingSystemException44.getErrorType();
        models.ParkingSystemException parkingSystemException46 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException44);
        java.lang.Throwable[] throwableArray47 = parkingSystemException46.getSuppressed();
        models.ParkingSystemException parkingSystemException48 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException46);
        models.ParkingSystemException parkingSystemException49 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType38, (java.lang.Throwable) parkingSystemException48);
        parkingSystemException30.addSuppressed((java.lang.Throwable) parkingSystemException48);
        models.ParkingSystemException.ErrorType errorType51 = parkingSystemException30.getErrorType();
        models.ParkingSystemException parkingSystemException52 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType51);
        java.lang.Throwable[] throwableArray53 = parkingSystemException52.getSuppressed();
        parkingSystemException21.addSuppressed((java.lang.Throwable) parkingSystemException52);
        parkingSystemException17.addSuppressed((java.lang.Throwable) parkingSystemException52);
        parkingSystemException9.addSuppressed((java.lang.Throwable) parkingSystemException52);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType13.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType20.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType24.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType29 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType29.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertTrue("'" + errorType38 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType38.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType45 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType45.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertTrue("'" + errorType51 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType51.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray53);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType6);
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType6);
        models.ParkingSystemException.ErrorType errorType10 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("", errorType10);
        java.lang.Throwable[] throwableArray12 = parkingSystemException11.getSuppressed();
        models.ParkingSystemException.ErrorType errorType15 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("", errorType15);
        java.lang.Throwable throwable19 = null;
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("hi!", throwable19);
        models.ParkingSystemException.ErrorType errorType21 = parkingSystemException20.getErrorType();
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType15, (java.lang.Throwable) parkingSystemException20);
        parkingSystemException11.addSuppressed((java.lang.Throwable) parkingSystemException23);
        models.ParkingSystemException parkingSystemException25 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType6, (java.lang.Throwable) parkingSystemException11);
        models.ParkingSystemException.ErrorType errorType26 = parkingSystemException11.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType10.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType15.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType21.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType26.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType9);
        java.lang.Throwable throwable14 = null;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", throwable14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException15);
        java.lang.Throwable[] throwableArray18 = parkingSystemException17.getSuppressed();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException17);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType9, (java.lang.Throwable) parkingSystemException19);
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("", errorType9);
        java.lang.Throwable throwable22 = null;
        models.ParkingSystemException parkingSystemException23 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType9, throwable22);
        models.ParkingSystemException.ErrorType errorType26 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("", errorType26);
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException.ErrorType errorType30 = parkingSystemException29.getErrorType();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType26, (java.lang.Throwable) parkingSystemException29);
        java.lang.Throwable throwable36 = null;
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("hi!", throwable36);
        models.ParkingSystemException.ErrorType errorType38 = parkingSystemException37.getErrorType();
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException37);
        models.ParkingSystemException.ErrorType errorType40 = parkingSystemException37.getErrorType();
        models.ParkingSystemException parkingSystemException41 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType40);
        java.lang.Throwable throwable47 = null;
        models.ParkingSystemException parkingSystemException48 = new models.ParkingSystemException("hi!", throwable47);
        models.ParkingSystemException.ErrorType errorType49 = parkingSystemException48.getErrorType();
        models.ParkingSystemException parkingSystemException50 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType49);
        java.lang.Throwable throwable54 = null;
        models.ParkingSystemException parkingSystemException55 = new models.ParkingSystemException("hi!", throwable54);
        models.ParkingSystemException.ErrorType errorType56 = parkingSystemException55.getErrorType();
        models.ParkingSystemException parkingSystemException57 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException55);
        java.lang.Throwable[] throwableArray58 = parkingSystemException57.getSuppressed();
        models.ParkingSystemException parkingSystemException59 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException57);
        models.ParkingSystemException parkingSystemException60 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType49, (java.lang.Throwable) parkingSystemException59);
        models.ParkingSystemException parkingSystemException61 = new models.ParkingSystemException("", errorType49);
        java.lang.Throwable throwable62 = null;
        models.ParkingSystemException parkingSystemException63 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType49, throwable62);
        parkingSystemException41.addSuppressed((java.lang.Throwable) parkingSystemException63);
        java.lang.Throwable[] throwableArray65 = parkingSystemException41.getSuppressed();
        models.ParkingSystemException parkingSystemException66 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException41);
        parkingSystemException29.addSuppressed((java.lang.Throwable) parkingSystemException66);
        models.ParkingSystemException parkingSystemException68 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType9, (java.lang.Throwable) parkingSystemException66);
        models.ParkingSystemException parkingSystemException69 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException68);
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType26.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType30.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType38 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType38.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType40 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType40.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType49 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType49.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType56 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType56.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray65);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        models.ParkingSystemException.ErrorType errorType4 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4);
        models.ParkingSystemException.ErrorType errorType7 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable10 = null;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", throwable10);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException11);
        java.lang.Throwable[] throwableArray14 = parkingSystemException13.getSuppressed();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType7, (java.lang.Throwable) parkingSystemException13);
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType4, (java.lang.Throwable) parkingSystemException13);
        models.ParkingSystemException.ErrorType errorType18 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType18);
        java.lang.Throwable[] throwableArray20 = parkingSystemException19.getSuppressed();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType4, (java.lang.Throwable) parkingSystemException19);
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException21);
        org.junit.Assert.assertTrue("'" + errorType4 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType4.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType7.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType18.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException3);
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException4);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.lang.Throwable throwable5 = null;
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("hi!", throwable5);
        models.ParkingSystemException.ErrorType errorType7 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException.ErrorType errorType10 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("", errorType10);
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException16 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException15);
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException15);
        java.lang.Throwable[] throwableArray18 = parkingSystemException17.getSuppressed();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType10, (java.lang.Throwable) parkingSystemException17);
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType10);
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType7.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType10.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        models.ParkingSystemException.ErrorType errorType6 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable9 = null;
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", throwable9);
        models.ParkingSystemException.ErrorType errorType11 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException10);
        java.lang.Throwable[] throwableArray13 = parkingSystemException12.getSuppressed();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType6, (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable throwable18 = null;
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("hi!", throwable18);
        models.ParkingSystemException.ErrorType errorType20 = parkingSystemException19.getErrorType();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType20);
        java.lang.Throwable throwable25 = null;
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("hi!", throwable25);
        models.ParkingSystemException.ErrorType errorType27 = parkingSystemException26.getErrorType();
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException26);
        java.lang.Throwable[] throwableArray29 = parkingSystemException28.getSuppressed();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException28);
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType20, (java.lang.Throwable) parkingSystemException30);
        parkingSystemException12.addSuppressed((java.lang.Throwable) parkingSystemException30);
        models.ParkingSystemException.ErrorType errorType33 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType33);
        java.lang.Throwable[] throwableArray35 = parkingSystemException34.getSuppressed();
        parkingSystemException3.addSuppressed((java.lang.Throwable) parkingSystemException34);
        models.ParkingSystemException.ErrorType errorType37 = parkingSystemException34.getErrorType();
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException34);
        java.lang.Throwable throwable42 = null;
        models.ParkingSystemException parkingSystemException43 = new models.ParkingSystemException("hi!", throwable42);
        models.ParkingSystemException.ErrorType errorType44 = parkingSystemException43.getErrorType();
        models.ParkingSystemException parkingSystemException45 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException43);
        models.ParkingSystemException.ErrorType errorType46 = parkingSystemException45.getErrorType();
        models.ParkingSystemException.ErrorType errorType48 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException49 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType48);
        java.lang.Throwable throwable53 = null;
        models.ParkingSystemException parkingSystemException54 = new models.ParkingSystemException("hi!", throwable53);
        models.ParkingSystemException.ErrorType errorType55 = parkingSystemException54.getErrorType();
        models.ParkingSystemException parkingSystemException56 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException54);
        models.ParkingSystemException parkingSystemException57 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException54);
        parkingSystemException49.addSuppressed((java.lang.Throwable) parkingSystemException54);
        models.ParkingSystemException parkingSystemException59 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType46, (java.lang.Throwable) parkingSystemException54);
        parkingSystemException38.addSuppressed((java.lang.Throwable) parkingSystemException59);
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType6.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType11.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType20.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType27 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType27.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + errorType33 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType33.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertTrue("'" + errorType37 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType37.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType44 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType44.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType46 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType46.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType48 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType48.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType55 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType55.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        models.ParkingSystemException.ErrorType errorType1 = models.ParkingSystemException.ErrorType.AUTHENTICATION;
        models.ParkingSystemException.ErrorType errorType3 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("", errorType3);
        models.ParkingSystemException.ErrorType errorType7 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable10 = null;
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("hi!", throwable10);
        models.ParkingSystemException.ErrorType errorType12 = parkingSystemException11.getErrorType();
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException11);
        java.lang.Throwable[] throwableArray14 = parkingSystemException13.getSuppressed();
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType7, (java.lang.Throwable) parkingSystemException13);
        java.lang.Throwable throwable19 = null;
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("hi!", throwable19);
        models.ParkingSystemException.ErrorType errorType21 = parkingSystemException20.getErrorType();
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType21);
        java.lang.Throwable throwable26 = null;
        models.ParkingSystemException parkingSystemException27 = new models.ParkingSystemException("hi!", throwable26);
        models.ParkingSystemException.ErrorType errorType28 = parkingSystemException27.getErrorType();
        models.ParkingSystemException parkingSystemException29 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException27);
        java.lang.Throwable[] throwableArray30 = parkingSystemException29.getSuppressed();
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException29);
        models.ParkingSystemException parkingSystemException32 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType21, (java.lang.Throwable) parkingSystemException31);
        parkingSystemException13.addSuppressed((java.lang.Throwable) parkingSystemException31);
        models.ParkingSystemException.ErrorType errorType34 = parkingSystemException13.getErrorType();
        models.ParkingSystemException parkingSystemException35 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType34);
        java.lang.Throwable[] throwableArray36 = parkingSystemException35.getSuppressed();
        parkingSystemException4.addSuppressed((java.lang.Throwable) parkingSystemException35);
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType1, (java.lang.Throwable) parkingSystemException35);
        org.junit.Assert.assertTrue("'" + errorType1 + "' != '" + models.ParkingSystemException.ErrorType.AUTHENTICATION + "'", errorType1.equals(models.ParkingSystemException.ErrorType.AUTHENTICATION));
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType3.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType7.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType12.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType21.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType28 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType28.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertTrue("'" + errorType34 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType34.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray36);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        models.ParkingSystemException.ErrorType errorType2 = models.ParkingSystemException.ErrorType.CONFLICT;
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("", errorType2);
        java.lang.Throwable throwable7 = null;
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("hi!", throwable7);
        models.ParkingSystemException.ErrorType errorType9 = parkingSystemException8.getErrorType();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType9);
        models.ParkingSystemException parkingSystemException11 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType9);
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType2, (java.lang.Throwable) parkingSystemException11);
        models.ParkingSystemException.ErrorType errorType13 = parkingSystemException12.getErrorType();
        java.lang.String str14 = parkingSystemException12.toString();
        org.junit.Assert.assertTrue("'" + errorType2 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType2.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType9.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType13.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: " + "'", str14.equals("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: "));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        models.ParkingSystemException parkingSystemException3 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException4 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException3);
        models.ParkingSystemException parkingSystemException6 = new models.ParkingSystemException("models.ParkingSystemException: hi!");
        parkingSystemException4.addSuppressed((java.lang.Throwable) parkingSystemException6);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException6.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException13 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException12);
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", errorType8, (java.lang.Throwable) parkingSystemException14);
        java.lang.Throwable throwable19 = null;
        models.ParkingSystemException parkingSystemException20 = new models.ParkingSystemException("hi!", throwable19);
        models.ParkingSystemException.ErrorType errorType21 = parkingSystemException20.getErrorType();
        models.ParkingSystemException parkingSystemException22 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException20);
        models.ParkingSystemException.ErrorType errorType23 = parkingSystemException22.getErrorType();
        models.ParkingSystemException.ErrorType errorType25 = models.ParkingSystemException.ErrorType.NOT_FOUND;
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType25);
        java.lang.Throwable throwable30 = null;
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("hi!", throwable30);
        models.ParkingSystemException.ErrorType errorType32 = parkingSystemException31.getErrorType();
        models.ParkingSystemException parkingSystemException33 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException31);
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException31);
        parkingSystemException26.addSuppressed((java.lang.Throwable) parkingSystemException31);
        models.ParkingSystemException parkingSystemException36 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType23, (java.lang.Throwable) parkingSystemException31);
        parkingSystemException14.addSuppressed((java.lang.Throwable) parkingSystemException36);
        models.ParkingSystemException.ErrorType errorType38 = parkingSystemException14.getErrorType();
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType21.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType23.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + models.ParkingSystemException.ErrorType.NOT_FOUND + "'", errorType25.equals(models.ParkingSystemException.ErrorType.NOT_FOUND));
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType32.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType38 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType38.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        models.ParkingSystemException.ErrorType errorType6 = models.ParkingSystemException.ErrorType.CONFLICT;
        java.lang.Throwable throwable9 = null;
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("hi!", throwable9);
        models.ParkingSystemException.ErrorType errorType11 = parkingSystemException10.getErrorType();
        models.ParkingSystemException parkingSystemException12 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException10);
        java.lang.Throwable[] throwableArray13 = parkingSystemException12.getSuppressed();
        models.ParkingSystemException parkingSystemException14 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType6, (java.lang.Throwable) parkingSystemException12);
        java.lang.Throwable throwable18 = null;
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("hi!", throwable18);
        models.ParkingSystemException.ErrorType errorType20 = parkingSystemException19.getErrorType();
        models.ParkingSystemException parkingSystemException21 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType20);
        java.lang.Throwable throwable25 = null;
        models.ParkingSystemException parkingSystemException26 = new models.ParkingSystemException("hi!", throwable25);
        models.ParkingSystemException.ErrorType errorType27 = parkingSystemException26.getErrorType();
        models.ParkingSystemException parkingSystemException28 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException26);
        java.lang.Throwable[] throwableArray29 = parkingSystemException28.getSuppressed();
        models.ParkingSystemException parkingSystemException30 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException28);
        models.ParkingSystemException parkingSystemException31 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType20, (java.lang.Throwable) parkingSystemException30);
        parkingSystemException12.addSuppressed((java.lang.Throwable) parkingSystemException30);
        models.ParkingSystemException.ErrorType errorType33 = parkingSystemException12.getErrorType();
        models.ParkingSystemException parkingSystemException34 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType33);
        models.ParkingSystemException parkingSystemException37 = new models.ParkingSystemException("models.ParkingSystemException: ");
        models.ParkingSystemException parkingSystemException38 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException37);
        models.ParkingSystemException parkingSystemException39 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType33, (java.lang.Throwable) parkingSystemException38);
        models.ParkingSystemException parkingSystemException40 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", errorType33);
        java.lang.Throwable throwable46 = null;
        models.ParkingSystemException parkingSystemException47 = new models.ParkingSystemException("hi!", throwable46);
        models.ParkingSystemException.ErrorType errorType48 = parkingSystemException47.getErrorType();
        models.ParkingSystemException parkingSystemException49 = new models.ParkingSystemException("models.ParkingSystemException: ", errorType48);
        java.lang.Throwable throwable53 = null;
        models.ParkingSystemException parkingSystemException54 = new models.ParkingSystemException("hi!", throwable53);
        models.ParkingSystemException.ErrorType errorType55 = parkingSystemException54.getErrorType();
        models.ParkingSystemException parkingSystemException56 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException54);
        java.lang.Throwable[] throwableArray57 = parkingSystemException56.getSuppressed();
        models.ParkingSystemException parkingSystemException58 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException56);
        models.ParkingSystemException parkingSystemException59 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", errorType48, (java.lang.Throwable) parkingSystemException58);
        models.ParkingSystemException parkingSystemException61 = new models.ParkingSystemException("hi!");
        java.lang.Throwable throwable64 = null;
        models.ParkingSystemException parkingSystemException65 = new models.ParkingSystemException("hi!", throwable64);
        models.ParkingSystemException.ErrorType errorType66 = parkingSystemException65.getErrorType();
        models.ParkingSystemException parkingSystemException67 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException65);
        parkingSystemException61.addSuppressed((java.lang.Throwable) parkingSystemException67);
        models.ParkingSystemException parkingSystemException69 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: hi!", errorType48, (java.lang.Throwable) parkingSystemException61);
        models.ParkingSystemException parkingSystemException70 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException61);
        models.ParkingSystemException parkingSystemException71 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType33, (java.lang.Throwable) parkingSystemException61);
        models.ParkingSystemException parkingSystemException72 = new models.ParkingSystemException("models.ParkingSystemException: hi!", errorType33);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.CONFLICT + "'", errorType6.equals(models.ParkingSystemException.ErrorType.CONFLICT));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType11.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType20.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType27 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType27.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + errorType33 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType33.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType48 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType48.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType55 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType55.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertTrue("'" + errorType66 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType66.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException parkingSystemException8 = new models.ParkingSystemException("models.ParkingSystemException: hi!", (java.lang.Throwable) parkingSystemException5);
        java.lang.Throwable[] throwableArray9 = parkingSystemException8.getSuppressed();
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException8);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.lang.Throwable throwable4 = null;
        models.ParkingSystemException parkingSystemException5 = new models.ParkingSystemException("hi!", throwable4);
        models.ParkingSystemException.ErrorType errorType6 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException7 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException5);
        models.ParkingSystemException.ErrorType errorType8 = parkingSystemException5.getErrorType();
        models.ParkingSystemException parkingSystemException9 = new models.ParkingSystemException("hi!", errorType8);
        models.ParkingSystemException parkingSystemException10 = new models.ParkingSystemException("models.ParkingSystemException: models.ParkingSystemException: ", (java.lang.Throwable) parkingSystemException9);
        java.lang.Throwable throwable14 = null;
        models.ParkingSystemException parkingSystemException15 = new models.ParkingSystemException("hi!", throwable14);
        models.ParkingSystemException.ErrorType errorType16 = parkingSystemException15.getErrorType();
        models.ParkingSystemException parkingSystemException17 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException15);
        java.lang.Throwable[] throwableArray18 = parkingSystemException17.getSuppressed();
        models.ParkingSystemException parkingSystemException19 = new models.ParkingSystemException("", (java.lang.Throwable) parkingSystemException17);
        parkingSystemException10.addSuppressed((java.lang.Throwable) parkingSystemException17);
        java.lang.Throwable[] throwableArray21 = parkingSystemException10.getSuppressed();
        java.lang.Class<?> wildcardClass22 = throwableArray21.getClass();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType6.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType8.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + models.ParkingSystemException.ErrorType.SYSTEM_ERROR + "'", errorType16.equals(models.ParkingSystemException.ErrorType.SYSTEM_ERROR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }
}

