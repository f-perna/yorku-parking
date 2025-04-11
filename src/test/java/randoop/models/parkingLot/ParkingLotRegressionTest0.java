package randoop.models.parkingLot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParkingLotRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setEnabled(true);
        parkingLot1.setEnabled(true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        java.lang.Class<?> wildcardClass10 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "b6622673-fba5-40c2-a2e1-256fc2f0c0fb");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        java.lang.String str7 = parkingLot1.getName();
        boolean boolean8 = parkingLot1.isEnabled();
        java.lang.Class<?> wildcardClass9 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "8c3d3cb0-ae45-434a-9026-62ddc597c79e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        java.lang.Class<?> wildcardClass20 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "722c2ab5-e824-49ad-9241-5f98633afaac");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "432f5d3f-9dd3-4f41-86bc-8bd513bbd66b");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "722c2ab5-e824-49ad-9241-5f98633afaac");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        java.lang.String str10 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        java.lang.Class<?> wildcardClass13 = parkingLot12.getClass();
        boolean boolean14 = parkingLot1.equals((java.lang.Object) parkingLot12);
        models.parkingLot.ParkingLot parkingLot16 = new models.parkingLot.ParkingLot("hi!");
        parkingLot16.setEnabled(false);
        boolean boolean19 = parkingLot12.equals((java.lang.Object) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "8bf9f870-7705-4be1-9dca-a3652f4d2cb7");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        boolean boolean9 = parkingLot1.equals((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass10 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "3dc5fa27-2f73-4915-bebe-f1cfef92cd95");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        parkingLot7.setName("hi!");
        java.lang.Class<?> wildcardClass13 = parkingLot7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "983b9047-11e4-49e6-a874-7818be1e8f83");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(true);
        java.lang.Class<?> wildcardClass8 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "15227837-fca5-447f-96b5-d625326a117d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        parkingLot1.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "075e1b80-e57a-420c-b481-0269377547b1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean8 = parkingLot1.isEnabled();
        java.lang.Class<?> wildcardClass9 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "02d95f2a-9e3f-4f1d-898f-948b86910bff");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("hi!");
        parkingLot1.setName("");
        parkingLot1.setEnabled(false);
        java.lang.Class<?> wildcardClass12 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "3c48d2b8-c736-46c4-a326-337d14eafda9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        java.util.UUID uUID8 = parkingLot1.getID();
        java.lang.Class<?> wildcardClass9 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "320738e1-d3c3-47b7-8624-e12280aa031f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID8.toString(), "320738e1-d3c3-47b7-8624-e12280aa031f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setName("");
        java.util.UUID uUID6 = parkingLot1.getID();
        java.lang.Class<?> wildcardClass7 = uUID6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID6.toString(), "e2666909-5f55-483f-9c7b-cb43716e56c0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        java.util.UUID uUID23 = parkingLot1.getID();
        java.lang.Class<?> wildcardClass24 = uUID23.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "4d96e131-78d2-48b8-9553-3920f05274d9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "f58d2f3b-2d65-4710-bb7d-1c8f84ddc684");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "4d96e131-78d2-48b8-9553-3920f05274d9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID23);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID23.toString(), "4d96e131-78d2-48b8-9553-3920f05274d9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        java.lang.String str10 = parkingLot1.getName();
        parkingLot1.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "2700a9a2-bf2b-4cfc-9e02-41a3b630c765");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot11.getName();
        java.lang.Class<?> wildcardClass20 = parkingLot11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "dde45b75-75c2-4dc5-b2e3-4aaca08b9986");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "ee9419dc-b482-40af-9e7b-ba5232e9b148");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        boolean boolean5 = parkingLot1.equals((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass6 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.Class<?> wildcardClass22 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "d16d6b96-599a-49ff-b1f7-bc49c72c38fc");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "bb66441c-f891-4fbb-b260-91a5dacdac11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "d16d6b96-599a-49ff-b1f7-bc49c72c38fc");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("");
        java.lang.Class<?> wildcardClass2 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setEnabled(true);
        parkingLot1.setName("");
        java.lang.Class<?> wildcardClass8 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.toString();
        boolean boolean6 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!");
        parkingLot8.setName("hi!");
        parkingLot8.setEnabled(true);
        parkingLot8.setName("");
        models.parkingLot.ParkingLot parkingLot16 = new models.parkingLot.ParkingLot("hi!");
        parkingLot16.setName("hi!");
        parkingLot16.setEnabled(true);
        parkingLot16.setName("");
        parkingLot16.setEnabled(true);
        boolean boolean25 = parkingLot8.equals((java.lang.Object) true);
        boolean boolean26 = parkingLot1.equals((java.lang.Object) boolean25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "9b461b2b-d04f-453e-ac01-bd173d301736");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        java.util.UUID uUID7 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!", uUID7, true);
        parkingLot9.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "6140bd83-3ac4-4133-9097-55f2a3bf9350");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "6140bd83-3ac4-4133-9097-55f2a3bf9350");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        parkingLot1.setName("hi!");
        java.lang.Class<?> wildcardClass12 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "156b3985-e3c0-45b3-ae35-2347724d97dd");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        java.util.UUID uUID3 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot5 = new models.parkingLot.ParkingLot("hi!", uUID3, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID3.toString(), "4af4c95d-7683-4213-bb17-f1b877a4c755");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.toString();
        boolean boolean6 = parkingLot1.isEnabled();
        parkingLot1.setName("");
        parkingLot1.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "11dd2ed0-e3d9-4eaa-8df4-c74d056efc0e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("hi!");
        parkingLot1.setName("");
        parkingLot1.setEnabled(false);
        java.lang.String str12 = parkingLot1.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "3c92fc4a-2369-4e40-a210-c0098fe05799");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setName("");
        boolean boolean7 = parkingLot1.equals((java.lang.Object) (-1.0d));
        boolean boolean8 = parkingLot1.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        models.parkingLot.ParkingLot parkingLot15 = new models.parkingLot.ParkingLot("hi!");
        parkingLot15.setEnabled(false);
        boolean boolean18 = parkingLot9.equals((java.lang.Object) parkingLot15);
        java.util.UUID uUID19 = parkingLot9.getID();
        parkingLot9.setEnabled(false);
        boolean boolean22 = parkingLot1.equals((java.lang.Object) parkingLot9);
        java.lang.String str23 = parkingLot9.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "cd764c98-1fb8-456a-9d67-eb92de32c628");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "10c39484-0ed8-48f6-bba7-4ce98ba3bcae");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "10c39484-0ed8-48f6-bba7-4ce98ba3bcae");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("", uUID5, true);
        java.lang.String str8 = parkingLot7.toString();
        parkingLot7.setName("");
        parkingLot7.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "e49b9af5-1c04-40ad-81cf-b40d7dd3bafa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot2.equals((java.lang.Object) parkingLot8);
        java.util.UUID uUID12 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("hi!", uUID12, false);
        boolean boolean15 = parkingLot14.isEnabled();
        boolean boolean17 = parkingLot14.equals((java.lang.Object) 10.0f);
        models.parkingLot.ParkingLot parkingLot19 = new models.parkingLot.ParkingLot("hi!");
        parkingLot19.setName("hi!");
        boolean boolean23 = parkingLot19.equals((java.lang.Object) (-1L));
        boolean boolean24 = parkingLot14.equals((java.lang.Object) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "47e9f64d-9637-4e26-ab59-2524a29f6c82");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "47e9f64d-9637-4e26-ab59-2524a29f6c82");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        java.util.UUID uUID6 = parkingLot1.getID();
        java.lang.String str7 = parkingLot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "73545246-23bc-458e-8d3d-07a20c27d37a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID6.toString(), "73545246-23bc-458e-8d3d-07a20c27d37a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("", uUID5, true);
        java.lang.String str8 = parkingLot7.toString();
        java.lang.String str9 = parkingLot7.getName();
        boolean boolean10 = parkingLot7.isEnabled();
        java.lang.String str11 = parkingLot7.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "2a01d8d6-9618-4ecd-8965-a8cad1ecd063");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean8 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot10 = new models.parkingLot.ParkingLot("");
        boolean boolean11 = parkingLot10.isEnabled();
        boolean boolean12 = parkingLot1.equals((java.lang.Object) parkingLot10);
        boolean boolean13 = parkingLot10.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "38c01d8f-939f-4b61-b4fc-76c75adff73b");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        parkingLot2.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        java.lang.String str16 = parkingLot12.getName();
        parkingLot12.setName("hi!");
        boolean boolean19 = parkingLot2.equals((java.lang.Object) parkingLot12);
        java.util.UUID uUID20 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot22 = new models.parkingLot.ParkingLot("", uUID20, true);
        parkingLot22.setEnabled(true);
        boolean boolean25 = parkingLot22.isEnabled();
        java.lang.String str26 = parkingLot22.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "aa53bceb-3537-4d0e-9e09-4ad59a829acb");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "ad7e75b7-c235-4886-9b45-78687cb70036");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "aa53bceb-3537-4d0e-9e09-4ad59a829acb");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        parkingLot9.setEnabled(false);
        parkingLot9.setName("hi!");
        models.parkingLot.ParkingLot parkingLot19 = new models.parkingLot.ParkingLot("hi!");
        parkingLot19.setEnabled(false);
        java.util.UUID uUID22 = parkingLot19.getID();
        java.lang.String str23 = parkingLot19.getName();
        parkingLot19.setName("hi!");
        boolean boolean26 = parkingLot9.equals((java.lang.Object) parkingLot19);
        boolean boolean27 = parkingLot1.equals((java.lang.Object) parkingLot19);
        models.parkingLot.ParkingLot parkingLot29 = new models.parkingLot.ParkingLot("hi!");
        parkingLot29.setEnabled(false);
        java.util.UUID uUID32 = parkingLot29.getID();
        java.lang.String str33 = parkingLot29.getName();
        parkingLot29.setEnabled(false);
        boolean boolean36 = parkingLot19.equals((java.lang.Object) parkingLot29);
        java.lang.Class<?> wildcardClass37 = parkingLot19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "67091ad5-ce86-465d-a1c3-50c37e831db2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "918a246e-25bb-4fc9-83aa-23073afefdd7");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "b9640245-5310-4e8c-8b76-cbdc789e0ea2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID32);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID32.toString(), "b43b0532-18ab-47b1-8d8d-36e35770db32");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot2.equals((java.lang.Object) parkingLot8);
        java.util.UUID uUID12 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("hi!", uUID12, false);
        boolean boolean15 = parkingLot14.isEnabled();
        parkingLot14.setEnabled(true);
        boolean boolean18 = parkingLot14.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "dd89bc33-ac2c-4e0e-9059-f0b5e2d2f98d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "dd89bc33-ac2c-4e0e-9059-f0b5e2d2f98d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.Class<?> wildcardClass5 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "517f4b1d-a472-44dc-a5aa-e52e4adbbdf3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot2.equals((java.lang.Object) parkingLot8);
        java.util.UUID uUID12 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("hi!", uUID12, false);
        parkingLot14.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "67e177df-1d0b-4169-9924-44ebc14793c2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "67e177df-1d0b-4169-9924-44ebc14793c2");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        java.lang.String str23 = parkingLot1.toString();
        boolean boolean24 = parkingLot1.isEnabled();
        java.lang.Class<?> wildcardClass25 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "f69e7a4d-6fed-4dff-9d88-2de2c5a9442f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "41ed6cd6-7dfb-48e4-b9d4-b2b02efb54b6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "f69e7a4d-6fed-4dff-9d88-2de2c5a9442f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        parkingLot2.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        java.lang.String str16 = parkingLot12.getName();
        parkingLot12.setName("hi!");
        boolean boolean19 = parkingLot2.equals((java.lang.Object) parkingLot12);
        java.util.UUID uUID20 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot22 = new models.parkingLot.ParkingLot("", uUID20, true);
        java.lang.String str23 = parkingLot22.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "a6f2ab55-9beb-42e3-95a6-66b722c544ba");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "44f3afc0-413e-49c1-b040-b4ac1682431e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "a6f2ab55-9beb-42e3-95a6-66b722c544ba");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        java.util.UUID uUID8 = parkingLot1.getID();
        parkingLot1.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "7c471b20-7277-49ce-859d-944e14f09eca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID8.toString(), "7c471b20-7277-49ce-859d-944e14f09eca");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean8 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot10 = new models.parkingLot.ParkingLot("");
        boolean boolean11 = parkingLot10.isEnabled();
        boolean boolean12 = parkingLot1.equals((java.lang.Object) parkingLot10);
        java.lang.String str13 = parkingLot1.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "94ab7b71-e074-44d0-8c25-78bb0972cf76");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot2.equals((java.lang.Object) parkingLot8);
        java.util.UUID uUID12 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("", uUID12, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "43cdf521-a347-42b7-8321-50d6fec91e6a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "43cdf521-a347-42b7-8321-50d6fec91e6a");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot2.equals((java.lang.Object) parkingLot8);
        java.util.UUID uUID12 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("hi!", uUID12, false);
        boolean boolean16 = parkingLot14.equals((java.lang.Object) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "2d4b5bc1-0084-481d-acf5-b284d8a2265a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "2d4b5bc1-0084-481d-acf5-b284d8a2265a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        parkingLot1.setName("");
        java.lang.Class<?> wildcardClass7 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "935bf00a-241a-4800-a47d-e86214ae81f9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot2.equals((java.lang.Object) parkingLot8);
        java.util.UUID uUID12 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("hi!", uUID12, false);
        boolean boolean15 = parkingLot14.isEnabled();
        java.lang.String str16 = parkingLot14.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "bf4444b2-d6d5-4474-b038-5b048539b34d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "bf4444b2-d6d5-4474-b038-5b048539b34d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(true);
        boolean boolean8 = parkingLot1.isEnabled();
        java.lang.Class<?> wildcardClass9 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "51754a67-de48-4bcd-ad65-a9759bbae36d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot2.equals((java.lang.Object) parkingLot8);
        java.util.UUID uUID12 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("hi!", uUID12, false);
        boolean boolean15 = parkingLot14.isEnabled();
        parkingLot14.setEnabled(true);
        java.util.UUID uUID18 = parkingLot14.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "4fdd439c-ef02-431b-87ea-37e83f341afb");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "4fdd439c-ef02-431b-87ea-37e83f341afb");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID18);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID18.toString(), "4fdd439c-ef02-431b-87ea-37e83f341afb");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!", uUID5, true);
        java.util.UUID uUID8 = parkingLot7.getID();
        java.lang.Class<?> wildcardClass9 = parkingLot7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "98538358-b003-4b8f-b079-b5b2bac39f5c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID8.toString(), "98538358-b003-4b8f-b079-b5b2bac39f5c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("hi!");
        parkingLot1.setName("");
        parkingLot1.setEnabled(false);
        parkingLot1.setEnabled(true);
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "995910c8-a908-4c07-829b-5b7e8578eb71");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        java.util.UUID uUID11 = parkingLot1.getID();
        parkingLot1.setEnabled(false);
        java.lang.Class<?> wildcardClass14 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "d0d501be-e56e-4960-be63-5326d47e2741");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID11);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID11.toString(), "d0d501be-e56e-4960-be63-5326d47e2741");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        parkingLot2.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        java.lang.String str16 = parkingLot12.getName();
        parkingLot12.setName("hi!");
        boolean boolean19 = parkingLot2.equals((java.lang.Object) parkingLot12);
        java.util.UUID uUID20 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot22 = new models.parkingLot.ParkingLot("", uUID20, true);
        parkingLot22.setEnabled(true);
        boolean boolean25 = parkingLot22.isEnabled();
        boolean boolean26 = parkingLot22.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "ffcfd6cf-2a66-454e-9580-9219f6cab8da");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "58008222-1a0a-4def-8dea-814c28531084");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "ffcfd6cf-2a66-454e-9580-9219f6cab8da");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setEnabled(true);
        parkingLot1.setName("");
        parkingLot1.setEnabled(true);
        java.lang.String str10 = parkingLot1.getName();
        parkingLot1.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setName("");
        boolean boolean7 = parkingLot1.equals((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass8 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        parkingLot9.setEnabled(false);
        parkingLot9.setName("hi!");
        models.parkingLot.ParkingLot parkingLot19 = new models.parkingLot.ParkingLot("hi!");
        parkingLot19.setEnabled(false);
        java.util.UUID uUID22 = parkingLot19.getID();
        java.lang.String str23 = parkingLot19.getName();
        parkingLot19.setName("hi!");
        boolean boolean26 = parkingLot9.equals((java.lang.Object) parkingLot19);
        boolean boolean27 = parkingLot1.equals((java.lang.Object) parkingLot19);
        boolean boolean29 = parkingLot19.equals((java.lang.Object) 1);
        parkingLot19.setName("hi!");
        parkingLot19.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "d20b92a7-7a4b-4db5-b080-4783eae5e836");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "faed5f8c-9028-418b-aefd-93764da68356");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "b2a61636-6347-4968-9f63-81579c3d24ee");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        java.lang.String str23 = parkingLot1.toString();
        boolean boolean24 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot27 = new models.parkingLot.ParkingLot("hi!");
        parkingLot27.setEnabled(false);
        java.util.UUID uUID30 = parkingLot27.getID();
        models.parkingLot.ParkingLot parkingLot32 = new models.parkingLot.ParkingLot("", uUID30, true);
        java.lang.String str33 = parkingLot32.toString();
        java.lang.String str34 = parkingLot32.getName();
        boolean boolean35 = parkingLot1.equals((java.lang.Object) parkingLot32);
        java.util.UUID uUID36 = parkingLot32.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "a304bed9-fad6-48ab-8644-1e8ba816bf71");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "83be4351-75ef-42a7-ae45-612e860af80c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "a304bed9-fad6-48ab-8644-1e8ba816bf71");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID30);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID30.toString(), "25bab551-6f42-4413-8196-3cc79adb0a19");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID36);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID36.toString(), "25bab551-6f42-4413-8196-3cc79adb0a19");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot1.getName();
        boolean boolean21 = parkingLot1.equals((java.lang.Object) '#');
        java.util.UUID uUID22 = parkingLot1.getID();
        parkingLot1.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "80020fa8-9fce-4415-8671-426123fca789");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "92cefca5-cf75-4e9a-85ad-ac9176255681");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "80020fa8-9fce-4415-8671-426123fca789");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        boolean boolean23 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot25 = new models.parkingLot.ParkingLot("hi!");
        parkingLot25.setEnabled(false);
        java.util.UUID uUID28 = parkingLot25.getID();
        boolean boolean30 = parkingLot25.equals((java.lang.Object) (short) 100);
        boolean boolean31 = parkingLot25.isEnabled();
        models.parkingLot.ParkingLot parkingLot33 = new models.parkingLot.ParkingLot("hi!");
        parkingLot33.setEnabled(false);
        java.util.UUID uUID36 = parkingLot33.getID();
        java.lang.String str37 = parkingLot33.getName();
        models.parkingLot.ParkingLot parkingLot39 = new models.parkingLot.ParkingLot("hi!");
        parkingLot39.setEnabled(false);
        boolean boolean42 = parkingLot33.equals((java.lang.Object) parkingLot39);
        java.util.UUID uUID43 = parkingLot33.getID();
        parkingLot33.setEnabled(false);
        boolean boolean46 = parkingLot25.equals((java.lang.Object) parkingLot33);
        boolean boolean47 = parkingLot1.equals((java.lang.Object) parkingLot33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "f9fbe973-77a5-4be9-9e17-8957a919a915");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "1021c419-d31d-4bf1-b60a-945532da3e14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "f9fbe973-77a5-4be9-9e17-8957a919a915");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID28);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID28.toString(), "ddd09bb1-3543-402d-9982-64db4a8acefd");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID36);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID36.toString(), "af84788a-1ac3-4ebb-a06b-6add91a157e9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID43);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID43.toString(), "af84788a-1ac3-4ebb-a06b-6add91a157e9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        parkingLot9.setEnabled(false);
        parkingLot9.setName("hi!");
        models.parkingLot.ParkingLot parkingLot19 = new models.parkingLot.ParkingLot("hi!");
        parkingLot19.setEnabled(false);
        java.util.UUID uUID22 = parkingLot19.getID();
        java.lang.String str23 = parkingLot19.getName();
        parkingLot19.setName("hi!");
        boolean boolean26 = parkingLot9.equals((java.lang.Object) parkingLot19);
        boolean boolean27 = parkingLot1.equals((java.lang.Object) parkingLot19);
        boolean boolean29 = parkingLot19.equals((java.lang.Object) 1);
        boolean boolean30 = parkingLot19.isEnabled();
        boolean boolean31 = parkingLot19.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "6bd74bdc-44eb-4f26-adf0-3d1089dd225c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "8b67d6e4-ca5a-43bc-8992-460b3ea5fa91");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "bbaad440-592f-4550-af85-78f1547d3935");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        java.util.UUID uUID11 = parkingLot1.getID();
        parkingLot1.setEnabled(false);
        boolean boolean14 = parkingLot1.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "bc9a8bbd-58b8-4184-81d7-7bd64bc9283d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID11);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID11.toString(), "bc9a8bbd-58b8-4184-81d7-7bd64bc9283d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot2.equals((java.lang.Object) parkingLot8);
        java.util.UUID uUID12 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("hi!", uUID12, false);
        boolean boolean15 = parkingLot14.isEnabled();
        boolean boolean17 = parkingLot14.equals((java.lang.Object) 10.0f);
        parkingLot14.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "01314794-3d14-4129-b5b6-ff6dca7723fa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "01314794-3d14-4129-b5b6-ff6dca7723fa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        parkingLot1.setEnabled(false);
        boolean boolean13 = parkingLot1.isEnabled();
        parkingLot1.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "8e4d803a-1fb2-4259-a227-f5a73da56625");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        parkingLot2.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        java.lang.String str16 = parkingLot12.getName();
        parkingLot12.setName("hi!");
        boolean boolean19 = parkingLot2.equals((java.lang.Object) parkingLot12);
        java.lang.String str20 = parkingLot2.getName();
        boolean boolean22 = parkingLot2.equals((java.lang.Object) '#');
        java.util.UUID uUID23 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot25 = new models.parkingLot.ParkingLot("", uUID23, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "eb630871-af1b-4491-b18c-c2ac1f9d41f8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "744409db-d6e9-4462-bdab-049ed62c5fdd");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID23);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID23.toString(), "eb630871-af1b-4491-b18c-c2ac1f9d41f8");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        boolean boolean20 = parkingLot1.equals((java.lang.Object) 1.0f);
        java.lang.String str21 = parkingLot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "5ce4d089-543d-4630-ab8e-f5d50d87ca48");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "e92fe50f-6560-47d1-b883-4611d6874a01");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        parkingLot2.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        java.lang.String str16 = parkingLot12.getName();
        parkingLot12.setName("hi!");
        boolean boolean19 = parkingLot2.equals((java.lang.Object) parkingLot12);
        java.util.UUID uUID20 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot22 = new models.parkingLot.ParkingLot("", uUID20, true);
        parkingLot22.setEnabled(true);
        models.parkingLot.ParkingLot parkingLot26 = new models.parkingLot.ParkingLot("hi!");
        parkingLot26.setEnabled(false);
        java.util.UUID uUID29 = parkingLot26.getID();
        java.lang.String str30 = parkingLot26.getName();
        parkingLot26.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot34 = new models.parkingLot.ParkingLot("hi!");
        parkingLot34.setEnabled(false);
        java.util.UUID uUID37 = parkingLot34.getID();
        java.lang.String str38 = parkingLot34.getName();
        parkingLot34.setEnabled(false);
        parkingLot34.setName("hi!");
        models.parkingLot.ParkingLot parkingLot44 = new models.parkingLot.ParkingLot("hi!");
        parkingLot44.setEnabled(false);
        java.util.UUID uUID47 = parkingLot44.getID();
        java.lang.String str48 = parkingLot44.getName();
        parkingLot44.setName("hi!");
        boolean boolean51 = parkingLot34.equals((java.lang.Object) parkingLot44);
        boolean boolean52 = parkingLot26.equals((java.lang.Object) parkingLot44);
        boolean boolean53 = parkingLot22.equals((java.lang.Object) boolean52);
        java.lang.String str54 = parkingLot22.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "be8cf4ef-52e3-4752-b9d5-bd457a715587");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "aefcf5c4-5c57-46a9-9045-6e5462360b4b");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "be8cf4ef-52e3-4752-b9d5-bd457a715587");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID29);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID29.toString(), "76aff7c6-2f20-41e0-8f51-30d1f7b47357");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID37);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID37.toString(), "0104ee81-3b78-4213-a394-f18b71c9c404");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID47);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID47.toString(), "4fb8ab87-c08d-4f15-9dd6-95fb815d04a9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setName("hi!");
        parkingLot2.setName("");
        java.util.UUID uUID7 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!", uUID7, true);
        java.util.UUID uUID10 = parkingLot9.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "35e0df59-df41-4350-a2af-b7b46708b58c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID10.toString(), "35e0df59-df41-4350-a2af-b7b46708b58c");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot2.equals((java.lang.Object) parkingLot8);
        java.util.UUID uUID12 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("hi!", uUID12, false);
        parkingLot14.setEnabled(false);
        boolean boolean18 = parkingLot14.equals((java.lang.Object) 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "d55c4ae5-22ea-473e-bb1d-7936aafd8af9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "d55c4ae5-22ea-473e-bb1d-7936aafd8af9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        java.util.UUID uUID23 = parkingLot1.getID();
        parkingLot1.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "5ae24291-5527-4800-8c1a-798dd95ee821");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "4722dbfc-7554-497c-a60e-a2fe28c2e176");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "5ae24291-5527-4800-8c1a-798dd95ee821");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID23);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID23.toString(), "5ae24291-5527-4800-8c1a-798dd95ee821");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        parkingLot1.setName("");
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        parkingLot9.setEnabled(false);
        parkingLot9.setName("hi!");
        models.parkingLot.ParkingLot parkingLot19 = new models.parkingLot.ParkingLot("hi!");
        parkingLot19.setEnabled(false);
        java.util.UUID uUID22 = parkingLot19.getID();
        java.lang.String str23 = parkingLot19.getName();
        parkingLot19.setName("hi!");
        boolean boolean26 = parkingLot9.equals((java.lang.Object) parkingLot19);
        java.util.UUID uUID27 = parkingLot9.getID();
        models.parkingLot.ParkingLot parkingLot29 = new models.parkingLot.ParkingLot("hi!", uUID27, true);
        parkingLot29.setEnabled(false);
        boolean boolean32 = parkingLot1.equals((java.lang.Object) parkingLot29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "803dabf3-ac7a-4ef2-91b4-45454d5ae201");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "fc854d5e-4217-47e0-879f-62058abeca59");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "5908b74f-472b-4b51-8fc9-72121311abb2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID27);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID27.toString(), "fc854d5e-4217-47e0-879f-62058abeca59");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot11.getName();
        parkingLot11.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "ef9a8dc8-6122-40d2-8787-25451ef4fb69");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "eada1101-7e52-4832-b8f5-6ad8798e73df");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("hi!");
        parkingLot1.setName("hi!");
        java.lang.String str10 = parkingLot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "5ff0847e-6740-4cab-ba86-4ef6b568342f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        boolean boolean23 = parkingLot1.isEnabled();
        java.lang.String str24 = parkingLot1.toString();
        java.util.UUID uUID25 = parkingLot1.getID();
        java.lang.Class<?> wildcardClass26 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "f0869345-8625-403b-bc6c-db6bfa87e978");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "347a2afc-6f52-4ea4-8aec-60e7d3bf4c37");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "f0869345-8625-403b-bc6c-db6bfa87e978");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID25);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID25.toString(), "f0869345-8625-403b-bc6c-db6bfa87e978");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        parkingLot9.setEnabled(false);
        parkingLot9.setName("hi!");
        models.parkingLot.ParkingLot parkingLot19 = new models.parkingLot.ParkingLot("hi!");
        parkingLot19.setEnabled(false);
        java.util.UUID uUID22 = parkingLot19.getID();
        java.lang.String str23 = parkingLot19.getName();
        parkingLot19.setName("hi!");
        boolean boolean26 = parkingLot9.equals((java.lang.Object) parkingLot19);
        boolean boolean27 = parkingLot1.equals((java.lang.Object) parkingLot19);
        parkingLot19.setName("hi!");
        java.lang.Class<?> wildcardClass30 = parkingLot19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "c6f5cd1c-6171-4e47-9af4-08eff386902c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "fb069a36-d142-4ff4-8476-672a55927ef9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "a684b343-af53-4c65-a010-d8f07661d23c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        java.lang.String str7 = parkingLot1.getName();
        boolean boolean8 = parkingLot1.isEnabled();
        boolean boolean9 = parkingLot1.isEnabled();
        boolean boolean10 = parkingLot1.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "17c5de20-2f91-4682-b609-7e43c4e07152");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        models.parkingLot.ParkingLot parkingLot15 = new models.parkingLot.ParkingLot("hi!");
        parkingLot15.setEnabled(false);
        boolean boolean18 = parkingLot9.equals((java.lang.Object) parkingLot15);
        java.util.UUID uUID19 = parkingLot9.getID();
        parkingLot9.setEnabled(false);
        boolean boolean22 = parkingLot1.equals((java.lang.Object) parkingLot9);
        models.parkingLot.ParkingLot parkingLot24 = new models.parkingLot.ParkingLot("hi!");
        parkingLot24.setEnabled(false);
        java.util.UUID uUID27 = parkingLot24.getID();
        java.lang.String str28 = parkingLot24.getName();
        parkingLot24.setEnabled(false);
        parkingLot24.setName("hi!");
        models.parkingLot.ParkingLot parkingLot34 = new models.parkingLot.ParkingLot("hi!");
        parkingLot34.setEnabled(false);
        java.util.UUID uUID37 = parkingLot34.getID();
        java.lang.String str38 = parkingLot34.getName();
        parkingLot34.setName("hi!");
        boolean boolean41 = parkingLot24.equals((java.lang.Object) parkingLot34);
        java.util.UUID uUID42 = parkingLot24.getID();
        boolean boolean43 = parkingLot1.equals((java.lang.Object) parkingLot24);
        parkingLot24.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "401ec773-a9f2-4356-bbbf-de8883221883");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "665811e6-acd7-454b-ba78-47aae564bef2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "665811e6-acd7-454b-ba78-47aae564bef2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID27);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID27.toString(), "196b89e6-bb38-4048-9461-1779aedf06d3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID37);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID37.toString(), "bbb54b0f-1b7c-46b5-a093-7a6aa2793758");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID42);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID42.toString(), "196b89e6-bb38-4048-9461-1779aedf06d3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        java.util.UUID uUID3 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot5 = new models.parkingLot.ParkingLot("", uUID3, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID3.toString(), "8f8cc4af-499d-4738-b477-6890c4922874");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        parkingLot9.setEnabled(false);
        parkingLot9.setName("hi!");
        models.parkingLot.ParkingLot parkingLot19 = new models.parkingLot.ParkingLot("hi!");
        parkingLot19.setEnabled(false);
        java.util.UUID uUID22 = parkingLot19.getID();
        java.lang.String str23 = parkingLot19.getName();
        parkingLot19.setName("hi!");
        boolean boolean26 = parkingLot9.equals((java.lang.Object) parkingLot19);
        boolean boolean27 = parkingLot1.equals((java.lang.Object) parkingLot19);
        models.parkingLot.ParkingLot parkingLot29 = new models.parkingLot.ParkingLot("hi!");
        parkingLot29.setEnabled(false);
        java.util.UUID uUID32 = parkingLot29.getID();
        java.lang.String str33 = parkingLot29.getName();
        parkingLot29.setEnabled(false);
        boolean boolean36 = parkingLot19.equals((java.lang.Object) parkingLot29);
        boolean boolean37 = parkingLot29.isEnabled();
        java.lang.String str38 = parkingLot29.toString();
        java.lang.String str39 = parkingLot29.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "c9cbf9f2-27c3-4b58-aab1-19681588550b");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "b842dccb-732a-4176-acff-482e39f705a8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "242a16c4-28d3-43b4-8660-d89e8d027375");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID32);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID32.toString(), "e34f2eac-0f3d-4d78-b28c-2ffadab52370");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        models.parkingLot.ParkingLot parkingLot21 = new models.parkingLot.ParkingLot("hi!");
        parkingLot21.setEnabled(false);
        java.util.UUID uUID24 = parkingLot21.getID();
        java.lang.String str25 = parkingLot21.getName();
        parkingLot21.setEnabled(false);
        parkingLot21.setName("hi!");
        models.parkingLot.ParkingLot parkingLot31 = new models.parkingLot.ParkingLot("hi!");
        parkingLot31.setEnabled(false);
        java.util.UUID uUID34 = parkingLot31.getID();
        java.lang.String str35 = parkingLot31.getName();
        parkingLot31.setName("hi!");
        boolean boolean38 = parkingLot21.equals((java.lang.Object) parkingLot31);
        java.util.UUID uUID39 = parkingLot21.getID();
        boolean boolean40 = parkingLot21.isEnabled();
        boolean boolean41 = parkingLot21.isEnabled();
        java.lang.String str42 = parkingLot21.toString();
        java.lang.String str43 = parkingLot21.toString();
        boolean boolean44 = parkingLot1.equals((java.lang.Object) str43);
        parkingLot1.setName("hi!");
        boolean boolean47 = parkingLot1.isEnabled();
        parkingLot1.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "71445682-10c9-4a5e-a380-cde44a353062");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "44163620-0e3a-4780-9228-03f31ad1fff9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "71445682-10c9-4a5e-a380-cde44a353062");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID24);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID24.toString(), "7bd3a403-46d7-44c9-a0aa-9be67fa82473");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID34);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID34.toString(), "366a1200-d9c3-4f10-b17f-dd0f767a372f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID39);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID39.toString(), "7bd3a403-46d7-44c9-a0aa-9be67fa82473");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setName("hi!");
        parkingLot2.setName("");
        java.util.UUID uUID7 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!", uUID7, false);
        boolean boolean10 = parkingLot9.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "f228d29d-2537-49ca-a6e0-701527755f3c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        java.lang.String str7 = parkingLot1.getName();
        boolean boolean8 = parkingLot1.isEnabled();
        parkingLot1.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "15083c06-1419-4436-80a9-f768c41d2227");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("hi!");
        parkingLot1.setName("");
        boolean boolean10 = parkingLot1.isEnabled();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "3d790ac2-ba22-45d6-864b-1c3d16b518a0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        java.util.UUID uUID7 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!", uUID7, true);
        java.util.UUID uUID10 = parkingLot9.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "b0617775-a756-44c2-895e-a004b6039481");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "b0617775-a756-44c2-895e-a004b6039481");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID10.toString(), "b0617775-a756-44c2-895e-a004b6039481");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        parkingLot9.setEnabled(false);
        parkingLot9.setName("hi!");
        models.parkingLot.ParkingLot parkingLot19 = new models.parkingLot.ParkingLot("hi!");
        parkingLot19.setEnabled(false);
        java.util.UUID uUID22 = parkingLot19.getID();
        java.lang.String str23 = parkingLot19.getName();
        parkingLot19.setName("hi!");
        boolean boolean26 = parkingLot9.equals((java.lang.Object) parkingLot19);
        boolean boolean27 = parkingLot1.equals((java.lang.Object) parkingLot19);
        models.parkingLot.ParkingLot parkingLot29 = new models.parkingLot.ParkingLot("hi!");
        parkingLot29.setEnabled(false);
        java.util.UUID uUID32 = parkingLot29.getID();
        java.lang.String str33 = parkingLot29.getName();
        parkingLot29.setEnabled(false);
        boolean boolean36 = parkingLot19.equals((java.lang.Object) parkingLot29);
        java.util.UUID uUID37 = parkingLot19.getID();
        java.lang.String str38 = parkingLot19.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "f5571a57-262c-49ce-9a9c-784e173b861d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "658d0344-c3d9-4c4d-858c-a3f5d1a0e2f0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "9fbe3b4b-e104-4403-92fb-c4f095e29428");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID32);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID32.toString(), "f7a6daf4-4e50-44e7-b39e-6b08869781c4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID37);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID37.toString(), "9fbe3b4b-e104-4403-92fb-c4f095e29428");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        java.lang.String str7 = parkingLot1.getName();
        boolean boolean8 = parkingLot1.isEnabled();
        parkingLot1.setName("");
        boolean boolean11 = parkingLot1.isEnabled();
        java.lang.Class<?> wildcardClass12 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "e5982047-1e2a-408b-b3a8-c8092d20b626");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!", uUID5, true);
        parkingLot7.setEnabled(false);
        java.lang.String str10 = parkingLot7.getName();
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        boolean boolean17 = parkingLot12.equals((java.lang.Object) (short) 100);
        java.util.UUID uUID18 = parkingLot12.getID();
        boolean boolean19 = parkingLot7.equals((java.lang.Object) parkingLot12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "d8d700d8-5b78-460f-b468-285c2e028cc2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "bf8671d3-a063-40b1-adec-cc8dab601f37");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID18);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID18.toString(), "bf8671d3-a063-40b1-adec-cc8dab601f37");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        models.parkingLot.ParkingLot parkingLot17 = new models.parkingLot.ParkingLot("hi!", uUID15, true);
        java.util.UUID uUID18 = parkingLot17.getID();
        boolean boolean19 = parkingLot1.equals((java.lang.Object) parkingLot17);
        java.util.UUID uUID20 = parkingLot17.getID();
        java.lang.String str21 = parkingLot17.toString();
        boolean boolean22 = parkingLot17.isEnabled();
        java.lang.String str23 = parkingLot17.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "c82c8e3f-56c4-4f0b-addd-1f76d81f7af3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "fe0a01d0-5930-4afa-9cd6-bfee3ee9dbfc");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID18);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID18.toString(), "fe0a01d0-5930-4afa-9cd6-bfee3ee9dbfc");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "fe0a01d0-5930-4afa-9cd6-bfee3ee9dbfc");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        parkingLot2.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        java.lang.String str16 = parkingLot12.getName();
        parkingLot12.setName("hi!");
        boolean boolean19 = parkingLot2.equals((java.lang.Object) parkingLot12);
        java.util.UUID uUID20 = parkingLot2.getID();
        boolean boolean21 = parkingLot2.isEnabled();
        boolean boolean22 = parkingLot2.isEnabled();
        java.lang.String str23 = parkingLot2.toString();
        boolean boolean24 = parkingLot2.isEnabled();
        java.lang.String str25 = parkingLot2.toString();
        java.util.UUID uUID26 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot28 = new models.parkingLot.ParkingLot("", uUID26, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "959eee87-8b22-4735-b57f-bdad07e1f7aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "ca9ba7cf-a2f6-4c0a-83a2-c4337c89f7e7");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "959eee87-8b22-4735-b57f-bdad07e1f7aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID26);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID26.toString(), "959eee87-8b22-4735-b57f-bdad07e1f7aa");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setEnabled(true);
        parkingLot1.setName("");
        parkingLot1.setEnabled(true);
        java.lang.String str10 = parkingLot1.getName();
        java.lang.Class<?> wildcardClass11 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("");
        boolean boolean8 = parkingLot1.isEnabled();
        boolean boolean9 = parkingLot1.isEnabled();
        parkingLot1.setEnabled(true);
        java.lang.Class<?> wildcardClass12 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "c6ccc922-bc41-4b53-953e-0d71fb86f026");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("", uUID5, true);
        java.lang.String str8 = parkingLot7.toString();
        parkingLot7.setName("");
        java.lang.Class<?> wildcardClass11 = parkingLot7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "2ebe3838-11e3-44d9-9c29-b526a3bc71c2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setEnabled(false);
        java.lang.String str6 = parkingLot1.getName();
        java.lang.Class<?> wildcardClass7 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean9 = parkingLot1.equals((java.lang.Object) (-1.0f));
        java.lang.String str10 = parkingLot1.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "127e86c1-dbf3-4805-b448-94f14d4aa5d9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.util.UUID uUID5 = parkingLot1.getID();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        java.util.UUID uUID10 = parkingLot7.getID();
        java.lang.String str11 = parkingLot7.getName();
        parkingLot7.setEnabled(false);
        java.util.UUID uUID14 = parkingLot7.getID();
        boolean boolean15 = parkingLot1.equals((java.lang.Object) parkingLot7);
        models.parkingLot.ParkingLot parkingLot17 = new models.parkingLot.ParkingLot("hi!");
        parkingLot17.setEnabled(false);
        java.util.UUID uUID20 = parkingLot17.getID();
        java.lang.String str21 = parkingLot17.getName();
        parkingLot17.setEnabled(false);
        parkingLot17.setName("hi!");
        models.parkingLot.ParkingLot parkingLot27 = new models.parkingLot.ParkingLot("hi!");
        parkingLot27.setEnabled(false);
        java.util.UUID uUID30 = parkingLot27.getID();
        java.lang.String str31 = parkingLot27.getName();
        parkingLot27.setName("hi!");
        boolean boolean34 = parkingLot17.equals((java.lang.Object) parkingLot27);
        java.lang.String str35 = parkingLot27.getName();
        boolean boolean37 = parkingLot27.equals((java.lang.Object) true);
        boolean boolean38 = parkingLot7.equals((java.lang.Object) parkingLot27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "b4decd7d-6bf9-434e-a7a6-0b574677b7d3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "b4decd7d-6bf9-434e-a7a6-0b574677b7d3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID10.toString(), "324f480a-e177-4db9-af15-2896de27299f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "324f480a-e177-4db9-af15-2896de27299f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "12bf2c07-1509-4535-8be1-8a79763f5e7b");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID30);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID30.toString(), "610f1da6-3a18-466f-ac7a-df779f9d0ef1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!", uUID5, true);
        parkingLot7.setEnabled(false);
        java.lang.String str10 = parkingLot7.getName();
        parkingLot7.setName("hi!");
        boolean boolean13 = parkingLot7.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "68ee8d7a-4f13-456b-9422-731113dca29f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        parkingLot9.setEnabled(false);
        parkingLot9.setName("hi!");
        models.parkingLot.ParkingLot parkingLot19 = new models.parkingLot.ParkingLot("hi!");
        parkingLot19.setEnabled(false);
        java.util.UUID uUID22 = parkingLot19.getID();
        java.lang.String str23 = parkingLot19.getName();
        parkingLot19.setName("hi!");
        boolean boolean26 = parkingLot9.equals((java.lang.Object) parkingLot19);
        boolean boolean27 = parkingLot1.equals((java.lang.Object) parkingLot19);
        boolean boolean29 = parkingLot19.equals((java.lang.Object) 1);
        parkingLot19.setName("hi!");
        models.parkingLot.ParkingLot parkingLot34 = new models.parkingLot.ParkingLot("hi!");
        parkingLot34.setEnabled(false);
        java.util.UUID uUID37 = parkingLot34.getID();
        java.lang.String str38 = parkingLot34.getName();
        parkingLot34.setEnabled(false);
        parkingLot34.setName("hi!");
        models.parkingLot.ParkingLot parkingLot44 = new models.parkingLot.ParkingLot("hi!");
        parkingLot44.setEnabled(false);
        java.util.UUID uUID47 = parkingLot44.getID();
        java.lang.String str48 = parkingLot44.getName();
        parkingLot44.setName("hi!");
        boolean boolean51 = parkingLot34.equals((java.lang.Object) parkingLot44);
        java.util.UUID uUID52 = parkingLot34.getID();
        models.parkingLot.ParkingLot parkingLot54 = new models.parkingLot.ParkingLot("", uUID52, true);
        parkingLot54.setEnabled(true);
        boolean boolean57 = parkingLot19.equals((java.lang.Object) parkingLot54);
        java.lang.Class<?> wildcardClass58 = parkingLot54.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "3c5503d9-4e70-40f4-874a-d8d6371170ae");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "acb64e88-39bb-41ae-b83c-e0aa10f67177");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "c30b1ffa-5cf5-4824-a6ce-da4591aa2d23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID37);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID37.toString(), "2e9bc877-6c3e-4efe-bae5-24a664bdd126");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID47);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID47.toString(), "98da8a5c-5003-4aec-93c3-320289c3d100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID52);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID52.toString(), "2e9bc877-6c3e-4efe-bae5-24a664bdd126");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot2.equals((java.lang.Object) parkingLot8);
        java.util.UUID uUID12 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("hi!", uUID12, false);
        boolean boolean15 = parkingLot14.isEnabled();
        boolean boolean17 = parkingLot14.equals((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass18 = parkingLot14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "71717ae5-11e2-4f68-9c18-15565af79a76");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "71717ae5-11e2-4f68-9c18-15565af79a76");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        boolean boolean20 = parkingLot1.equals((java.lang.Object) 1.0f);
        parkingLot1.setName("");
        boolean boolean24 = parkingLot1.equals((java.lang.Object) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "ad189fa7-bc88-4420-94a3-3305d01eb8fd");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "363f01fd-8afc-4f57-b139-0388396bfd96");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("");
        boolean boolean8 = parkingLot1.isEnabled();
        boolean boolean9 = parkingLot1.isEnabled();
        parkingLot1.setEnabled(true);
        java.lang.Object obj12 = null;
        boolean boolean13 = parkingLot1.equals(obj12);
        java.lang.String str14 = parkingLot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "20ce2e9f-8477-4016-a695-cf497c247635");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        java.lang.String str20 = parkingLot1.toString();
        java.lang.String str21 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        java.util.UUID uUID24 = parkingLot1.getID();
        java.lang.Class<?> wildcardClass25 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "f63ef5b0-2e66-449d-b1e1-2aaa6847b163");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "9b0b4fb6-b5a6-447f-8b5c-adc8efa958c2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "f63ef5b0-2e66-449d-b1e1-2aaa6847b163");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID24);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID24.toString(), "f63ef5b0-2e66-449d-b1e1-2aaa6847b163");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("");
        parkingLot1.setEnabled(false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        parkingLot2.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        java.lang.String str16 = parkingLot12.getName();
        parkingLot12.setName("hi!");
        boolean boolean19 = parkingLot2.equals((java.lang.Object) parkingLot12);
        java.util.UUID uUID20 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot22 = new models.parkingLot.ParkingLot("hi!", uUID20, true);
        parkingLot22.setEnabled(false);
        boolean boolean26 = parkingLot22.equals((java.lang.Object) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "e3b73ddd-6ca2-4a92-bd0f-89303689d8c2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "8cafae91-7815-45e4-b062-6d4398010adb");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "e3b73ddd-6ca2-4a92-bd0f-89303689d8c2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        boolean boolean7 = parkingLot2.equals((java.lang.Object) (short) 100);
        java.util.UUID uUID8 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot10 = new models.parkingLot.ParkingLot("hi!", uUID8, true);
        boolean boolean11 = parkingLot10.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "7931da4d-4b4b-4beb-b598-a296e592c889");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID8.toString(), "7931da4d-4b4b-4beb-b598-a296e592c889");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(true);
        parkingLot1.setName("hi!");
        java.lang.String str10 = parkingLot1.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "fd7e7bfe-3f90-45bf-9be9-18371096c12d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        models.parkingLot.ParkingLot parkingLot15 = new models.parkingLot.ParkingLot("hi!");
        parkingLot15.setEnabled(false);
        boolean boolean18 = parkingLot9.equals((java.lang.Object) parkingLot15);
        java.util.UUID uUID19 = parkingLot9.getID();
        parkingLot9.setEnabled(false);
        boolean boolean22 = parkingLot1.equals((java.lang.Object) parkingLot9);
        java.util.UUID uUID23 = parkingLot9.getID();
        java.lang.String str24 = parkingLot9.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "6b040880-f224-4b4a-9660-fcd1e33a051a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "797b15d6-5b3a-4def-8852-57ac067f35bc");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "797b15d6-5b3a-4def-8852-57ac067f35bc");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID23);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID23.toString(), "797b15d6-5b3a-4def-8852-57ac067f35bc");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        boolean boolean7 = parkingLot2.equals((java.lang.Object) (short) 100);
        boolean boolean8 = parkingLot2.isEnabled();
        models.parkingLot.ParkingLot parkingLot10 = new models.parkingLot.ParkingLot("hi!");
        parkingLot10.setEnabled(false);
        java.util.UUID uUID13 = parkingLot10.getID();
        java.lang.String str14 = parkingLot10.getName();
        models.parkingLot.ParkingLot parkingLot16 = new models.parkingLot.ParkingLot("hi!");
        parkingLot16.setEnabled(false);
        boolean boolean19 = parkingLot10.equals((java.lang.Object) parkingLot16);
        java.util.UUID uUID20 = parkingLot10.getID();
        parkingLot10.setEnabled(false);
        boolean boolean23 = parkingLot2.equals((java.lang.Object) parkingLot10);
        java.util.UUID uUID24 = parkingLot10.getID();
        models.parkingLot.ParkingLot parkingLot26 = new models.parkingLot.ParkingLot("", uUID24, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "fd5e7180-bffa-44e9-b34e-d575ff34bc69");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID13);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID13.toString(), "34233198-65f8-424c-8ab0-40a277e0a252");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "34233198-65f8-424c-8ab0-40a277e0a252");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID24);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID24.toString(), "34233198-65f8-424c-8ab0-40a277e0a252");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        boolean boolean20 = parkingLot1.equals((java.lang.Object) 1.0f);
        parkingLot1.setName("");
        java.lang.Class<?> wildcardClass23 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "76e9512e-277f-4619-819e-e621386cc158");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "d920aefa-4825-4d3a-9f11-3e0992e00696");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        java.util.UUID uUID7 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!", uUID7, true);
        boolean boolean10 = parkingLot9.isEnabled();
        java.util.UUID uUID11 = parkingLot9.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "20492162-5987-4e2e-b068-7ee8f0cd2b14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "20492162-5987-4e2e-b068-7ee8f0cd2b14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID11);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID11.toString(), "20492162-5987-4e2e-b068-7ee8f0cd2b14");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        boolean boolean5 = parkingLot1.equals((java.lang.Object) (-1L));
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        java.util.UUID uUID10 = parkingLot7.getID();
        java.lang.String str11 = parkingLot7.toString();
        boolean boolean12 = parkingLot7.isEnabled();
        parkingLot7.setEnabled(true);
        boolean boolean15 = parkingLot1.equals((java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID10.toString(), "364238e7-69e5-4296-99df-dc174cd43d04");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        models.parkingLot.ParkingLot parkingLot15 = new models.parkingLot.ParkingLot("hi!");
        parkingLot15.setEnabled(false);
        boolean boolean18 = parkingLot9.equals((java.lang.Object) parkingLot15);
        java.util.UUID uUID19 = parkingLot9.getID();
        parkingLot9.setEnabled(false);
        boolean boolean22 = parkingLot1.equals((java.lang.Object) parkingLot9);
        boolean boolean24 = parkingLot1.equals((java.lang.Object) 0L);
        java.lang.String str25 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "ddb644e0-99a2-4ceb-8b92-bc0c88accaa4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "cdcc279e-9836-4225-9480-ce4876dfdaa9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "cdcc279e-9836-4225-9480-ce4876dfdaa9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        java.util.UUID uUID23 = parkingLot1.getID();
        parkingLot1.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "81912e4f-20de-4031-a9bc-1005e0babea6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "2f80c41f-5c68-4dc4-aae4-7882c89af267");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "81912e4f-20de-4031-a9bc-1005e0babea6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID23);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID23.toString(), "81912e4f-20de-4031-a9bc-1005e0babea6");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        boolean boolean20 = parkingLot1.equals((java.lang.Object) 1.0f);
        parkingLot1.setEnabled(false);
        parkingLot1.setEnabled(true);
        parkingLot1.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "1ec34e63-beae-4ddf-8aaf-038e1e163602");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "64cd4448-de2e-45e3-9f7c-d5dd6a48ec17");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        java.lang.String str8 = parkingLot1.getName();
        java.lang.Class<?> wildcardClass9 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "440402a5-59d1-4989-967a-dba75f3f8f43");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        java.lang.String str20 = parkingLot1.toString();
        java.lang.String str21 = parkingLot1.getName();
        boolean boolean22 = parkingLot1.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "7bedee9c-d674-44bf-a4ff-c2b84cab44e6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "a592702e-d67e-4a39-983a-53d9fdea97ad");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "7bedee9c-d674-44bf-a4ff-c2b84cab44e6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        java.lang.String str7 = parkingLot1.getName();
        boolean boolean8 = parkingLot1.isEnabled();
        parkingLot1.setName("");
        boolean boolean11 = parkingLot1.isEnabled();
        java.util.UUID uUID12 = parkingLot1.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "d3f5a2ed-a6ff-449c-90bc-cbe959a8f659");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "d3f5a2ed-a6ff-449c-90bc-cbe959a8f659");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!", uUID5, true);
        parkingLot7.setEnabled(false);
        parkingLot7.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "c515a246-5fe0-4741-9dd1-40ea4e310480");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean22 = parkingLot11.isEnabled();
        java.lang.String str23 = parkingLot11.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "fdc82ac1-2f6e-45ee-b8f3-7bfc2d65c665");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "f0be3e7e-b56d-40b6-91ed-491b02414b59");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        java.lang.String str20 = parkingLot1.toString();
        java.lang.String str21 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        java.util.UUID uUID24 = parkingLot1.getID();
        boolean boolean25 = parkingLot1.isEnabled();
        java.lang.String str26 = parkingLot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "e32e80c6-cc03-4d88-b264-f0f7f73fa615");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "8f626ae1-9a77-44e5-b49e-f7293ac088e1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "e32e80c6-cc03-4d88-b264-f0f7f73fa615");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID24);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID24.toString(), "e32e80c6-cc03-4d88-b264-f0f7f73fa615");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        java.util.UUID uUID6 = parkingLot1.getID();
        parkingLot1.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "c91ebea7-4a44-40ab-9513-74a528f4771d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID6.toString(), "c91ebea7-4a44-40ab-9513-74a528f4771d");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.toString();
        boolean boolean6 = parkingLot1.isEnabled();
        java.lang.Class<?> wildcardClass7 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "72f64aeb-f6a6-414a-8ac0-2aeb6bd81f02");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot2.equals((java.lang.Object) parkingLot8);
        java.util.UUID uUID12 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("", uUID12, false);
        boolean boolean15 = parkingLot14.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "c2f14194-f757-4120-ade1-38e9082aaa38");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "c2f14194-f757-4120-ade1-38e9082aaa38");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        java.lang.String str8 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "55d3d564-7038-4127-8642-5979a7ae36ee");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("");
        parkingLot1.setEnabled(true);
        parkingLot1.setName("hi!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        java.lang.String str20 = parkingLot1.toString();
        java.lang.String str21 = parkingLot1.getName();
        java.util.UUID uUID22 = parkingLot1.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "189ef2cc-002e-4a15-ab77-22387aa556d4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "847b2e50-7d6b-4507-ab04-6cfe3260cbc5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "189ef2cc-002e-4a15-ab77-22387aa556d4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "189ef2cc-002e-4a15-ab77-22387aa556d4");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        parkingLot7.setName("hi!");
        boolean boolean13 = parkingLot7.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "9a127128-ec20-42fc-bd3e-ed36921f222e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.UUID uUID1 = null;
        models.parkingLot.ParkingLot parkingLot3 = new models.parkingLot.ParkingLot("", uUID1, false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean8 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot10 = new models.parkingLot.ParkingLot("");
        boolean boolean11 = parkingLot10.isEnabled();
        boolean boolean12 = parkingLot1.equals((java.lang.Object) parkingLot10);
        boolean boolean13 = parkingLot1.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "822ba5ef-732c-4a1a-b012-c53ef131e23c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(true);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("");
        boolean boolean18 = parkingLot11.isEnabled();
        boolean boolean19 = parkingLot11.isEnabled();
        boolean boolean20 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str21 = parkingLot11.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "b5e4f61e-e2c3-48e4-b3b3-93c5fa770b27");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "a909e4ce-83c0-4c64-943f-4c491b9a2194");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        java.lang.String str11 = parkingLot1.toString();
        java.lang.String str12 = parkingLot1.toString();
        boolean boolean13 = parkingLot1.isEnabled();
        java.lang.String str14 = parkingLot1.toString();
        java.lang.Class<?> wildcardClass15 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "aca74a84-bc3b-4203-b689-bf410331206f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        parkingLot9.setEnabled(false);
        parkingLot9.setName("hi!");
        models.parkingLot.ParkingLot parkingLot19 = new models.parkingLot.ParkingLot("hi!");
        parkingLot19.setEnabled(false);
        java.util.UUID uUID22 = parkingLot19.getID();
        java.lang.String str23 = parkingLot19.getName();
        parkingLot19.setName("hi!");
        boolean boolean26 = parkingLot9.equals((java.lang.Object) parkingLot19);
        boolean boolean27 = parkingLot1.equals((java.lang.Object) parkingLot19);
        parkingLot1.setName("");
        java.lang.String str30 = parkingLot1.getName();
        java.lang.String str31 = parkingLot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "df3de450-40f5-40a6-84c6-ff1a5d3a0e60");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "d5872134-9ffb-4d8c-a430-72ebc7c4db2f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "80e5b0ab-34d6-44ea-a688-e8fe72f38c96");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot1.getName();
        boolean boolean21 = parkingLot1.equals((java.lang.Object) '#');
        boolean boolean22 = parkingLot1.isEnabled();
        java.lang.String str23 = parkingLot1.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "980cb00f-3b56-450e-ab59-eb1a124c1ad2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "d981671a-bf08-40a3-b2cb-9a34a77ad390");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        java.lang.String str11 = parkingLot1.toString();
        java.lang.String str12 = parkingLot1.toString();
        boolean boolean13 = parkingLot1.isEnabled();
        java.lang.String str14 = parkingLot1.getName();
        java.util.UUID uUID15 = parkingLot1.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "9f8a819e-275a-416d-a66d-a9989390f456");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "9f8a819e-275a-416d-a66d-a9989390f456");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        models.parkingLot.ParkingLot parkingLot21 = new models.parkingLot.ParkingLot("hi!");
        parkingLot21.setEnabled(false);
        java.util.UUID uUID24 = parkingLot21.getID();
        java.lang.String str25 = parkingLot21.getName();
        parkingLot21.setEnabled(false);
        parkingLot21.setName("hi!");
        models.parkingLot.ParkingLot parkingLot31 = new models.parkingLot.ParkingLot("hi!");
        parkingLot31.setEnabled(false);
        java.util.UUID uUID34 = parkingLot31.getID();
        java.lang.String str35 = parkingLot31.getName();
        parkingLot31.setName("hi!");
        boolean boolean38 = parkingLot21.equals((java.lang.Object) parkingLot31);
        java.util.UUID uUID39 = parkingLot21.getID();
        boolean boolean40 = parkingLot21.isEnabled();
        boolean boolean41 = parkingLot21.isEnabled();
        java.lang.String str42 = parkingLot21.toString();
        java.lang.String str43 = parkingLot21.toString();
        boolean boolean44 = parkingLot1.equals((java.lang.Object) str43);
        java.lang.String str45 = parkingLot1.getName();
        boolean boolean46 = parkingLot1.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "94f79380-feb0-4236-a191-a2f94315c452");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "31341794-edb7-421a-82ca-3e69b78f751f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "94f79380-feb0-4236-a191-a2f94315c452");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID24);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID24.toString(), "ec874052-f74b-4746-bb45-2c77c57f2faf");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID34);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID34.toString(), "275077c1-9a60-4ac8-b2a6-0fea561a0f37");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID39);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID39.toString(), "ec874052-f74b-4746-bb45-2c77c57f2faf");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        java.lang.String str7 = parkingLot1.getName();
        boolean boolean8 = parkingLot1.isEnabled();
        java.lang.String str9 = parkingLot1.toString();
        java.lang.String str10 = parkingLot1.toString();
        boolean boolean12 = parkingLot1.equals((java.lang.Object) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "4e7eb0e0-7ebd-4a23-8589-1a9f7503eb35");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        boolean boolean23 = parkingLot1.isEnabled();
        parkingLot1.setEnabled(true);
        models.parkingLot.ParkingLot parkingLot27 = new models.parkingLot.ParkingLot("hi!");
        parkingLot27.setName("hi!");
        parkingLot27.setEnabled(true);
        java.lang.String str32 = parkingLot27.getName();
        boolean boolean33 = parkingLot27.isEnabled();
        boolean boolean34 = parkingLot1.equals((java.lang.Object) parkingLot27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "8758a800-dd82-45ad-ad58-c49b0703939e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "9677d54b-0acf-401d-85b6-2e6d5338271f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "8758a800-dd82-45ad-ad58-c49b0703939e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("");
        boolean boolean8 = parkingLot1.isEnabled();
        boolean boolean9 = parkingLot1.isEnabled();
        parkingLot1.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "c1eea63c-2b38-48d3-bd09-65cf4f5cc92f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        models.parkingLot.ParkingLot parkingLot17 = new models.parkingLot.ParkingLot("hi!", uUID15, true);
        java.util.UUID uUID18 = parkingLot17.getID();
        boolean boolean19 = parkingLot1.equals((java.lang.Object) parkingLot17);
        java.util.UUID uUID20 = parkingLot17.getID();
        parkingLot17.setEnabled(true);
        parkingLot17.setName("");
        parkingLot17.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "0426f04d-b993-4cce-a0a2-d9ef9a7ef058");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "a8bd19a5-34d1-4054-b5af-1906c3fb8705");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID18);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID18.toString(), "a8bd19a5-34d1-4054-b5af-1906c3fb8705");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "a8bd19a5-34d1-4054-b5af-1906c3fb8705");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!", uUID5, true);
        parkingLot7.setEnabled(false);
        java.lang.String str10 = parkingLot7.getName();
        parkingLot7.setName("hi!");
        java.lang.String str13 = parkingLot7.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "18221803-085f-49de-ab7e-3693dc8c4fb1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        models.parkingLot.ParkingLot parkingLot15 = new models.parkingLot.ParkingLot("hi!");
        parkingLot15.setEnabled(false);
        boolean boolean18 = parkingLot9.equals((java.lang.Object) parkingLot15);
        java.util.UUID uUID19 = parkingLot9.getID();
        parkingLot9.setEnabled(false);
        boolean boolean22 = parkingLot1.equals((java.lang.Object) parkingLot9);
        java.util.UUID uUID23 = parkingLot1.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "ddb1490d-bc3b-43c3-a21c-4afad35a8847");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "6dcf5aab-5cc9-494a-a49b-a278f4ca39f6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "6dcf5aab-5cc9-494a-a49b-a278f4ca39f6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID23);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID23.toString(), "ddb1490d-bc3b-43c3-a21c-4afad35a8847");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        java.util.UUID uUID3 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot5 = new models.parkingLot.ParkingLot("", uUID3, true);
        parkingLot5.setName("hi!");
        parkingLot5.setName("");
        java.lang.String str10 = parkingLot5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID3.toString(), "70a3dc15-3f3b-455f-ba2b-0cf6d24aa45a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean8 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot10 = new models.parkingLot.ParkingLot("");
        boolean boolean11 = parkingLot10.isEnabled();
        boolean boolean12 = parkingLot1.equals((java.lang.Object) parkingLot10);
        java.lang.String str13 = parkingLot10.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "04a52d6f-a923-46a4-bdfa-972b4872ce1e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot10 = new models.parkingLot.ParkingLot("hi!");
        parkingLot10.setEnabled(false);
        java.util.UUID uUID13 = parkingLot10.getID();
        java.lang.String str14 = parkingLot10.getName();
        parkingLot10.setEnabled(false);
        parkingLot10.setName("hi!");
        models.parkingLot.ParkingLot parkingLot20 = new models.parkingLot.ParkingLot("hi!");
        parkingLot20.setEnabled(false);
        java.util.UUID uUID23 = parkingLot20.getID();
        java.lang.String str24 = parkingLot20.getName();
        parkingLot20.setName("hi!");
        boolean boolean27 = parkingLot10.equals((java.lang.Object) parkingLot20);
        boolean boolean28 = parkingLot2.equals((java.lang.Object) parkingLot20);
        models.parkingLot.ParkingLot parkingLot30 = new models.parkingLot.ParkingLot("hi!");
        parkingLot30.setEnabled(false);
        java.util.UUID uUID33 = parkingLot30.getID();
        java.lang.String str34 = parkingLot30.getName();
        parkingLot30.setEnabled(false);
        boolean boolean37 = parkingLot20.equals((java.lang.Object) parkingLot30);
        java.util.UUID uUID38 = parkingLot20.getID();
        models.parkingLot.ParkingLot parkingLot40 = new models.parkingLot.ParkingLot("", uUID38, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "5000f7e4-daf3-4bb1-bdcb-e58f87d3e2a5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID13);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID13.toString(), "4f5890ca-3b3b-4dfc-ae2d-3edb11556433");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID23);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID23.toString(), "eb7c6cc7-8d16-448d-be00-80f4b1556f6f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID33);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID33.toString(), "9addb027-d714-465e-9c54-bde71c156757");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID38);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID38.toString(), "eb7c6cc7-8d16-448d-be00-80f4b1556f6f");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        parkingLot1.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("hi!");
        parkingLot14.setEnabled(false);
        java.util.UUID uUID17 = parkingLot14.getID();
        boolean boolean18 = parkingLot1.equals((java.lang.Object) uUID17);
        parkingLot1.setName("");
        parkingLot1.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "2e8594a3-68f8-46c8-bb6c-a2494f44038d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID17);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID17.toString(), "dcb6a288-c918-44ec-b8fb-66c8bfa92f51");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("hi!");
        parkingLot1.setName("");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setEnabled(false);
        parkingLot11.setName("hi!");
        models.parkingLot.ParkingLot parkingLot21 = new models.parkingLot.ParkingLot("hi!");
        parkingLot21.setEnabled(false);
        java.util.UUID uUID24 = parkingLot21.getID();
        java.lang.String str25 = parkingLot21.getName();
        parkingLot21.setName("hi!");
        boolean boolean28 = parkingLot11.equals((java.lang.Object) parkingLot21);
        java.util.UUID uUID29 = parkingLot11.getID();
        java.lang.String str30 = parkingLot11.toString();
        boolean boolean31 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID32 = parkingLot1.getID();
        java.lang.Class<?> wildcardClass33 = uUID32.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "5135721c-c47d-4dc7-8ce9-d183386ea92a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "bd93fadc-e088-4772-8221-8f84a15c9949");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID24);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID24.toString(), "61579c82-ae2f-433d-89a0-eea6d52ba860");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID29);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID29.toString(), "bd93fadc-e088-4772-8221-8f84a15c9949");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID32);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID32.toString(), "5135721c-c47d-4dc7-8ce9-d183386ea92a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        java.util.UUID uUID9 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!", uUID9, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "1694a5a4-ebc8-496f-80e7-c6de9ef53187");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID9.toString(), "1694a5a4-ebc8-496f-80e7-c6de9ef53187");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        java.util.UUID uUID8 = parkingLot1.getID();
        java.lang.String str9 = parkingLot1.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "be3f0a28-c5c1-44d2-84da-d3596f0c0477");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID8.toString(), "be3f0a28-c5c1-44d2-84da-d3596f0c0477");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        parkingLot1.setEnabled(false);
        java.lang.String str13 = parkingLot1.getName();
        parkingLot1.setName("hi!");
        java.lang.String str16 = parkingLot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "654b96cc-999c-4e24-b6d3-fd66a3ec5e8c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("hi!");
        java.lang.String str8 = parkingLot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "799aeeb2-47b1-439b-b9c8-8acbe1d8f597");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        boolean boolean23 = parkingLot1.isEnabled();
        java.lang.String str24 = parkingLot1.toString();
        java.util.UUID uUID25 = parkingLot1.getID();
        parkingLot1.setName("hi!");
        java.lang.String str28 = parkingLot1.toString();
        java.util.UUID uUID29 = parkingLot1.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "2ab390c5-5690-45ab-a9ce-f1fd478b3a27");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "34f73248-95c4-4ee2-9573-c348e1505df1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "2ab390c5-5690-45ab-a9ce-f1fd478b3a27");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID25);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID25.toString(), "2ab390c5-5690-45ab-a9ce-f1fd478b3a27");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID29);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID29.toString(), "2ab390c5-5690-45ab-a9ce-f1fd478b3a27");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        boolean boolean23 = parkingLot1.isEnabled();
        java.lang.String str24 = parkingLot1.toString();
        java.util.UUID uUID25 = parkingLot1.getID();
        java.util.UUID uUID26 = parkingLot1.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "5b0fe4d9-aca7-4ff4-8ccb-d20e98d1ffe0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "55a04f8f-65bc-4e2a-abc9-3ce0d8add264");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "5b0fe4d9-aca7-4ff4-8ccb-d20e98d1ffe0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID25);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID25.toString(), "5b0fe4d9-aca7-4ff4-8ccb-d20e98d1ffe0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID26);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID26.toString(), "5b0fe4d9-aca7-4ff4-8ccb-d20e98d1ffe0");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        parkingLot1.setEnabled(true);
        java.lang.String str13 = parkingLot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "d09aee40-fe89-489a-941a-18b9960fbb98");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot2.equals((java.lang.Object) parkingLot8);
        java.util.UUID uUID12 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("", uUID12, false);
        models.parkingLot.ParkingLot parkingLot16 = new models.parkingLot.ParkingLot("hi!");
        parkingLot16.setEnabled(false);
        java.util.UUID uUID19 = parkingLot16.getID();
        java.lang.String str20 = parkingLot16.getName();
        parkingLot16.setEnabled(false);
        java.lang.String str23 = parkingLot16.getName();
        boolean boolean24 = parkingLot14.equals((java.lang.Object) str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "2f0a6f4b-cd6b-4192-b550-a9bffe8a1168");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "2f0a6f4b-cd6b-4192-b550-a9bffe8a1168");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "7fe313ba-0940-460c-8325-25864cfe9753");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        parkingLot9.setEnabled(false);
        parkingLot9.setName("hi!");
        models.parkingLot.ParkingLot parkingLot19 = new models.parkingLot.ParkingLot("hi!");
        parkingLot19.setEnabled(false);
        java.util.UUID uUID22 = parkingLot19.getID();
        java.lang.String str23 = parkingLot19.getName();
        parkingLot19.setName("hi!");
        boolean boolean26 = parkingLot9.equals((java.lang.Object) parkingLot19);
        boolean boolean27 = parkingLot1.equals((java.lang.Object) parkingLot19);
        models.parkingLot.ParkingLot parkingLot29 = new models.parkingLot.ParkingLot("hi!");
        parkingLot29.setEnabled(false);
        java.util.UUID uUID32 = parkingLot29.getID();
        java.lang.String str33 = parkingLot29.getName();
        parkingLot29.setEnabled(false);
        boolean boolean36 = parkingLot19.equals((java.lang.Object) parkingLot29);
        java.lang.Object obj37 = null;
        boolean boolean38 = parkingLot19.equals(obj37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "b4b0dd4a-d531-45a4-ae0d-ee0817be9af4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "8e8b1b32-da23-4006-862c-6ae2e6632ab5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "976f71d7-ed33-47a0-b659-e66b11b9e82e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID32);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID32.toString(), "8ff435ed-a057-412d-b4c1-d7cfa15833ba");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("hi!");
        java.lang.String str8 = parkingLot1.getName();
        java.util.UUID uUID9 = parkingLot1.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "658cda5a-a19b-4bbe-8368-ff3ca111abe6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID9.toString(), "658cda5a-a19b-4bbe-8368-ff3ca111abe6");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("hi!");
        java.lang.String str8 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot10 = new models.parkingLot.ParkingLot("hi!");
        parkingLot10.setEnabled(false);
        java.util.UUID uUID13 = parkingLot10.getID();
        java.lang.String str14 = parkingLot10.getName();
        parkingLot10.setEnabled(false);
        parkingLot10.setName("hi!");
        models.parkingLot.ParkingLot parkingLot21 = new models.parkingLot.ParkingLot("hi!");
        parkingLot21.setEnabled(false);
        java.util.UUID uUID24 = parkingLot21.getID();
        models.parkingLot.ParkingLot parkingLot26 = new models.parkingLot.ParkingLot("hi!", uUID24, true);
        java.util.UUID uUID27 = parkingLot26.getID();
        boolean boolean28 = parkingLot10.equals((java.lang.Object) parkingLot26);
        java.util.UUID uUID29 = parkingLot26.getID();
        boolean boolean30 = parkingLot1.equals((java.lang.Object) parkingLot26);
        parkingLot26.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "c1f00e67-b617-4709-bdbf-36ff7bbc6596");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID13);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID13.toString(), "13496576-ff4f-4f35-8f4f-3f2a76ee0fac");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID24);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID24.toString(), "e9120c44-cc69-4df4-8bbc-dd0ec1ba1461");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID27);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID27.toString(), "e9120c44-cc69-4df4-8bbc-dd0ec1ba1461");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID29);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID29.toString(), "e9120c44-cc69-4df4-8bbc-dd0ec1ba1461");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot1.getName();
        boolean boolean21 = parkingLot1.equals((java.lang.Object) '#');
        models.parkingLot.ParkingLot parkingLot23 = new models.parkingLot.ParkingLot("hi!");
        parkingLot23.setEnabled(false);
        java.util.UUID uUID26 = parkingLot23.getID();
        java.lang.String str27 = parkingLot23.toString();
        boolean boolean28 = parkingLot23.isEnabled();
        boolean boolean29 = parkingLot1.equals((java.lang.Object) parkingLot23);
        boolean boolean30 = parkingLot23.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "a245d5f7-9a1e-4d6c-911a-709267891945");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "3f2c9bbf-8236-49e6-bf14-b3aaf51db820");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID26);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID26.toString(), "76e4c7aa-2d20-4647-9878-34e1ab2a1911");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean8 = parkingLot1.isEnabled();
        java.util.UUID uUID9 = parkingLot1.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "a6f60b26-ecd5-4601-8b47-5de777b2406c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID9.toString(), "a6f60b26-ecd5-4601-8b47-5de777b2406c");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        parkingLot2.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        java.lang.String str16 = parkingLot12.getName();
        parkingLot12.setName("hi!");
        boolean boolean19 = parkingLot2.equals((java.lang.Object) parkingLot12);
        java.util.UUID uUID20 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot22 = new models.parkingLot.ParkingLot("", uUID20, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "da534411-e150-4988-96b3-425623f5c589");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "aa29702f-5005-44eb-8a7f-59162cfac117");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "da534411-e150-4988-96b3-425623f5c589");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        java.util.UUID uUID3 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot5 = new models.parkingLot.ParkingLot("hi!", uUID3, true);
        boolean boolean6 = parkingLot5.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID3.toString(), "3b3f67de-53d2-4f7a-990c-f6e221b6885d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot11.getName();
        java.lang.String str20 = parkingLot11.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "76401f2e-c2fa-4b65-8a56-6a852768a56b");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "77a342b9-62c0-4414-b197-59349625074d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isEnabled();
        java.lang.Class<?> wildcardClass3 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        boolean boolean23 = parkingLot1.isEnabled();
        parkingLot1.setEnabled(true);
        java.lang.String str26 = parkingLot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "754fe090-bbba-4c80-b58f-c4cfcd2367ee");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "f4b56083-f74a-44e4-81b2-f760482fec30");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "754fe090-bbba-4c80-b58f-c4cfcd2367ee");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot11.getName();
        boolean boolean21 = parkingLot11.equals((java.lang.Object) true);
        java.util.UUID uUID22 = parkingLot11.getID();
        java.lang.String str23 = parkingLot11.toString();
        parkingLot11.setName("hi!");
        java.lang.String str26 = parkingLot11.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "2fc1500a-433b-4a94-ba71-67dd5682cf9c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "d99b56c1-ca16-45da-a704-55e054406a43");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "d99b56c1-ca16-45da-a704-55e054406a43");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setName("");
        boolean boolean7 = parkingLot1.equals((java.lang.Object) (-1.0d));
        java.lang.String str8 = parkingLot1.getName();
        boolean boolean10 = parkingLot1.equals((java.lang.Object) 1L);
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        java.lang.String str16 = parkingLot12.getName();
        models.parkingLot.ParkingLot parkingLot18 = new models.parkingLot.ParkingLot("hi!");
        parkingLot18.setEnabled(false);
        boolean boolean21 = parkingLot12.equals((java.lang.Object) parkingLot18);
        java.lang.String str22 = parkingLot12.toString();
        java.lang.String str23 = parkingLot12.toString();
        boolean boolean24 = parkingLot1.equals((java.lang.Object) parkingLot12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "6741123e-3f52-463b-b1c0-e0877facdbcd");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot11.getName();
        boolean boolean21 = parkingLot11.equals((java.lang.Object) true);
        java.util.UUID uUID22 = parkingLot11.getID();
        boolean boolean24 = parkingLot11.equals((java.lang.Object) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "7787ea70-2c15-48e7-a223-01204de268cf");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "86efbe4b-b898-48cf-b4a2-13a5302bc1d8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "86efbe4b-b898-48cf-b4a2-13a5302bc1d8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        parkingLot9.setEnabled(false);
        parkingLot9.setName("hi!");
        models.parkingLot.ParkingLot parkingLot19 = new models.parkingLot.ParkingLot("hi!");
        parkingLot19.setEnabled(false);
        java.util.UUID uUID22 = parkingLot19.getID();
        java.lang.String str23 = parkingLot19.getName();
        parkingLot19.setName("hi!");
        boolean boolean26 = parkingLot9.equals((java.lang.Object) parkingLot19);
        boolean boolean27 = parkingLot1.equals((java.lang.Object) parkingLot19);
        boolean boolean29 = parkingLot19.equals((java.lang.Object) 1);
        boolean boolean30 = parkingLot19.isEnabled();
        parkingLot19.setName("hi!");
        java.lang.Class<?> wildcardClass33 = parkingLot19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "eedd4535-ff59-42c6-b319-0622afcfb06f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "e4058322-945e-4f4a-bbb3-3db220bc3ab3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "77e7b1f9-b39b-4e65-9831-a13b6ef4b1b4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        java.lang.String str4 = parkingLot1.toString();
        parkingLot1.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        java.lang.String str20 = parkingLot1.toString();
        java.lang.String str21 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("");
        parkingLot1.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "768f9add-9876-4280-a47b-f0f6de8e9b7a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "92510972-40d1-470b-bb68-c0542604e465");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "768f9add-9876-4280-a47b-f0f6de8e9b7a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        parkingLot9.setEnabled(false);
        parkingLot9.setName("hi!");
        models.parkingLot.ParkingLot parkingLot19 = new models.parkingLot.ParkingLot("hi!");
        parkingLot19.setEnabled(false);
        java.util.UUID uUID22 = parkingLot19.getID();
        java.lang.String str23 = parkingLot19.getName();
        parkingLot19.setName("hi!");
        boolean boolean26 = parkingLot9.equals((java.lang.Object) parkingLot19);
        boolean boolean27 = parkingLot1.equals((java.lang.Object) parkingLot19);
        models.parkingLot.ParkingLot parkingLot29 = new models.parkingLot.ParkingLot("hi!");
        parkingLot29.setEnabled(false);
        java.util.UUID uUID32 = parkingLot29.getID();
        java.lang.String str33 = parkingLot29.getName();
        parkingLot29.setEnabled(false);
        boolean boolean36 = parkingLot19.equals((java.lang.Object) parkingLot29);
        boolean boolean37 = parkingLot29.isEnabled();
        java.lang.String str38 = parkingLot29.toString();
        java.lang.String str39 = parkingLot29.toString();
        java.lang.String str40 = parkingLot29.getName();
        java.lang.String str41 = parkingLot29.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "b65d3dc1-03b3-406b-b7c0-8d6def603ba7");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "7ca532c4-2fb8-4350-9c33-66c71f1e1b58");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "8b2782be-01d8-48fb-9664-a5f436a05728");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID32);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID32.toString(), "cf81c5d5-1bc4-48e1-8b58-bd67a708d7ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setName("hi!");
        parkingLot2.setName("");
        java.util.UUID uUID11 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot13 = new models.parkingLot.ParkingLot("hi!", uUID11, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "f7322df7-c9c3-4b7d-a702-635535883834");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID11);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID11.toString(), "f7322df7-c9c3-4b7d-a702-635535883834");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        java.lang.String str10 = parkingLot1.getName();
        boolean boolean11 = parkingLot1.isEnabled();
        java.util.UUID uUID12 = parkingLot1.getID();
        java.lang.Class<?> wildcardClass13 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "b112ef4c-d40e-429e-95ba-fc94aa7db2b0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "b112ef4c-d40e-429e-95ba-fc94aa7db2b0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        parkingLot2.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        java.lang.String str16 = parkingLot12.getName();
        parkingLot12.setName("hi!");
        boolean boolean19 = parkingLot2.equals((java.lang.Object) parkingLot12);
        java.util.UUID uUID20 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot22 = new models.parkingLot.ParkingLot("", uUID20, true);
        parkingLot22.setEnabled(true);
        parkingLot22.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "85af5a47-75e3-4eb7-a195-6c35956c6a35");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "bf35d06e-7e7c-4466-976b-c43559e53ae2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "85af5a47-75e3-4eb7-a195-6c35956c6a35");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setEnabled(true);
        parkingLot1.setName("");
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setName("hi!");
        parkingLot9.setEnabled(true);
        parkingLot9.setName("");
        parkingLot9.setEnabled(true);
        boolean boolean18 = parkingLot1.equals((java.lang.Object) true);
        boolean boolean19 = parkingLot1.isEnabled();
        java.lang.Class<?> wildcardClass20 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        java.lang.String str20 = parkingLot1.toString();
        java.lang.String str21 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("");
        models.parkingLot.ParkingLot parkingLot27 = new models.parkingLot.ParkingLot("hi!");
        parkingLot27.setEnabled(false);
        java.util.UUID uUID30 = parkingLot27.getID();
        java.lang.String str31 = parkingLot27.getName();
        parkingLot27.setName("hi!");
        parkingLot27.setName("");
        boolean boolean36 = parkingLot27.isEnabled();
        boolean boolean37 = parkingLot1.equals((java.lang.Object) boolean36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "26905ea8-cf87-4647-adcd-bd6080f32fca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "e40eb4d7-3d88-4b52-b927-d043f1e7723e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "26905ea8-cf87-4647-adcd-bd6080f32fca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID30);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID30.toString(), "6fb4f6d5-30f0-4e54-a268-ade22d574557");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        parkingLot9.setEnabled(false);
        parkingLot9.setName("hi!");
        models.parkingLot.ParkingLot parkingLot19 = new models.parkingLot.ParkingLot("hi!");
        parkingLot19.setEnabled(false);
        java.util.UUID uUID22 = parkingLot19.getID();
        java.lang.String str23 = parkingLot19.getName();
        parkingLot19.setName("hi!");
        boolean boolean26 = parkingLot9.equals((java.lang.Object) parkingLot19);
        boolean boolean27 = parkingLot1.equals((java.lang.Object) parkingLot19);
        models.parkingLot.ParkingLot parkingLot29 = new models.parkingLot.ParkingLot("hi!");
        parkingLot29.setEnabled(false);
        java.util.UUID uUID32 = parkingLot29.getID();
        java.lang.String str33 = parkingLot29.getName();
        parkingLot29.setEnabled(false);
        boolean boolean36 = parkingLot19.equals((java.lang.Object) parkingLot29);
        parkingLot19.setEnabled(false);
        java.lang.String str39 = parkingLot19.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "eaa9a25a-bf86-4959-b986-4bd18c6c037a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "0fdfea2d-7c5b-454e-8c28-367b6bee77b0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "8db24f85-a619-4e6e-a863-44b0fdbc623f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID32);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID32.toString(), "60ed8e60-82a6-4273-beaf-7b5d8e6210c5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setEnabled(true);
        parkingLot1.setName("");
        parkingLot1.setEnabled(true);
        java.lang.String str10 = parkingLot1.getName();
        java.util.UUID uUID11 = parkingLot1.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID11);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID11.toString(), "3fae05d3-383c-44a1-951c-e5d16e8a2d88");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        models.parkingLot.ParkingLot parkingLot15 = new models.parkingLot.ParkingLot("hi!");
        parkingLot15.setEnabled(false);
        boolean boolean18 = parkingLot9.equals((java.lang.Object) parkingLot15);
        java.util.UUID uUID19 = parkingLot9.getID();
        parkingLot9.setEnabled(false);
        boolean boolean22 = parkingLot1.equals((java.lang.Object) parkingLot9);
        boolean boolean24 = parkingLot1.equals((java.lang.Object) 0L);
        java.lang.String str25 = parkingLot1.getName();
        java.lang.String str26 = parkingLot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "f6f134e7-0dd6-4f11-a609-73ed2ae0aa68");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "83082c3a-a0e1-46a4-b2dd-e265e5e8cfdd");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "83082c3a-a0e1-46a4-b2dd-e265e5e8cfdd");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        java.lang.String str6 = parkingLot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "e89c043a-344b-4567-858d-48c66722dd34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        parkingLot9.setEnabled(false);
        parkingLot9.setName("hi!");
        models.parkingLot.ParkingLot parkingLot19 = new models.parkingLot.ParkingLot("hi!");
        parkingLot19.setEnabled(false);
        java.util.UUID uUID22 = parkingLot19.getID();
        java.lang.String str23 = parkingLot19.getName();
        parkingLot19.setName("hi!");
        boolean boolean26 = parkingLot9.equals((java.lang.Object) parkingLot19);
        boolean boolean27 = parkingLot1.equals((java.lang.Object) parkingLot19);
        parkingLot19.setName("hi!");
        boolean boolean30 = parkingLot19.isEnabled();
        java.lang.Class<?> wildcardClass31 = parkingLot19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "c5c24b57-3c9e-4814-b4b9-18f9f226845f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "874f24ca-6d59-4835-8ef3-e26e6baa0232");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "ada992a4-878b-4f5e-8b14-9b1761160e54");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        java.lang.String str8 = parkingLot1.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "56cffa4a-c69d-4e60-b7d6-8f68c9a07318");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot1.getName();
        parkingLot1.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "601df487-a4dd-47f7-8bd7-c9dd7415d77e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "3f7695a6-3908-4fb6-ae83-3d9c743a1dc3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot11.getName();
        boolean boolean21 = parkingLot11.equals((java.lang.Object) true);
        java.lang.String str22 = parkingLot11.toString();
        java.util.UUID uUID23 = parkingLot11.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "4f71a25c-9ba7-45f7-8ca4-1a75405e70b5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "cdb49592-d7f1-49e3-8771-ee606ec7a1cd");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID23);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID23.toString(), "cdb49592-d7f1-49e3-8771-ee606ec7a1cd");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setEnabled(false);
        java.lang.String str6 = parkingLot1.getName();
        java.util.UUID uUID7 = parkingLot1.getID();
        parkingLot1.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "b4ab2412-1a48-4152-988d-4aa035891e59");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("");
        java.lang.Class<?> wildcardClass8 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "72978432-a691-4a83-b23c-19215d3700bf");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot1.getName();
        boolean boolean21 = parkingLot1.equals((java.lang.Object) '#');
        java.util.UUID uUID22 = parkingLot1.getID();
        parkingLot1.setEnabled(true);
        parkingLot1.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "31fec6a6-13da-4bab-a03d-698c6f53dcd0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "9405a0d6-4dad-4c0a-acb8-8f0a34909604");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "31fec6a6-13da-4bab-a03d-698c6f53dcd0");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        parkingLot2.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        java.lang.String str16 = parkingLot12.getName();
        parkingLot12.setName("hi!");
        boolean boolean19 = parkingLot2.equals((java.lang.Object) parkingLot12);
        java.util.UUID uUID20 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot22 = new models.parkingLot.ParkingLot("hi!", uUID20, true);
        parkingLot22.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "aec2721c-4eee-4921-b47f-ac9d16720c1c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "d817bd2c-eae5-4a90-ac8d-ffa4ea9623b8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "aec2721c-4eee-4921-b47f-ac9d16720c1c");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("", uUID5, true);
        parkingLot7.setEnabled(false);
        parkingLot7.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "b36b1afa-8927-407e-8f28-a6df1884ac97");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("");
        boolean boolean8 = parkingLot1.isEnabled();
        boolean boolean9 = parkingLot1.isEnabled();
        parkingLot1.setEnabled(true);
        java.lang.String str12 = parkingLot1.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "64f72fbc-963e-405f-b061-7892e787bff9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.util.UUID uUID6 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!", uUID6, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "421a04d3-95f0-44c0-9dbc-19d5946e30d9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID6.toString(), "421a04d3-95f0-44c0-9dbc-19d5946e30d9");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        parkingLot1.setEnabled(false);
        boolean boolean13 = parkingLot1.isEnabled();
        java.lang.Class<?> wildcardClass14 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "711503f7-5607-4da8-baf8-37b337c40eaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot11.getName();
        boolean boolean21 = parkingLot11.equals((java.lang.Object) true);
        java.lang.String str22 = parkingLot11.toString();
        parkingLot11.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "678c8643-767d-4e4c-b3cf-c090fbf72f84");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "fcffc673-fade-41d9-87b8-12c5abcce66d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        parkingLot1.setName("");
        java.lang.String str7 = parkingLot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "c755487f-208a-45e5-a342-c389d9337de3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        boolean boolean23 = parkingLot1.isEnabled();
        parkingLot1.setEnabled(true);
        parkingLot1.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "fe480e13-ec41-4397-9b6e-f80c322265e5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "59ab291a-3515-46e7-b01c-99a759503526");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "fe480e13-ec41-4397-9b6e-f80c322265e5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        java.lang.String str20 = parkingLot1.toString();
        java.lang.String str21 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setEnabled(false);
        java.lang.Class<?> wildcardClass26 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "7f6dbcc5-078a-4c34-9fcd-1107b4d89305");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "acdc12a3-0190-489b-86f2-4cbf3eaef519");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "7f6dbcc5-078a-4c34-9fcd-1107b4d89305");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.util.UUID uUID1 = null;
        models.parkingLot.ParkingLot parkingLot3 = new models.parkingLot.ParkingLot("", uUID1, true);
        java.lang.String str4 = parkingLot3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        parkingLot1.setEnabled(true);
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("hi!");
        parkingLot14.setEnabled(false);
        java.util.UUID uUID17 = parkingLot14.getID();
        java.lang.String str18 = parkingLot14.getName();
        parkingLot14.setName("");
        boolean boolean21 = parkingLot14.isEnabled();
        boolean boolean22 = parkingLot1.equals((java.lang.Object) parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "99352cc7-055a-4b43-a903-07f03b8052ad");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID17);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID17.toString(), "a304e0e8-7dc6-4ee6-a7f3-fbb864e9c1ce");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("hi!");
        parkingLot1.setName("");
        parkingLot1.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot13 = new models.parkingLot.ParkingLot("hi!");
        parkingLot13.setEnabled(false);
        java.util.UUID uUID16 = parkingLot13.getID();
        java.lang.String str17 = parkingLot13.getName();
        parkingLot13.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot21 = new models.parkingLot.ParkingLot("hi!");
        parkingLot21.setEnabled(false);
        java.util.UUID uUID24 = parkingLot21.getID();
        java.lang.String str25 = parkingLot21.getName();
        parkingLot21.setEnabled(false);
        parkingLot21.setName("hi!");
        models.parkingLot.ParkingLot parkingLot31 = new models.parkingLot.ParkingLot("hi!");
        parkingLot31.setEnabled(false);
        java.util.UUID uUID34 = parkingLot31.getID();
        java.lang.String str35 = parkingLot31.getName();
        parkingLot31.setName("hi!");
        boolean boolean38 = parkingLot21.equals((java.lang.Object) parkingLot31);
        boolean boolean39 = parkingLot13.equals((java.lang.Object) parkingLot31);
        boolean boolean41 = parkingLot31.equals((java.lang.Object) 1);
        parkingLot31.setName("");
        boolean boolean44 = parkingLot1.equals((java.lang.Object) parkingLot31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "4e8cefe3-6963-4e23-9915-f9f7561f0010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID16);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID16.toString(), "5e837123-5aa2-49e6-9695-6329efc272ee");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID24);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID24.toString(), "c08aacd9-ab00-448f-8ab0-0fdc0c017675");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID34);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID34.toString(), "049510c0-8562-4634-afa1-4f80c0fa321d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("hi!");
        parkingLot1.setName("");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setEnabled(false);
        parkingLot11.setName("hi!");
        models.parkingLot.ParkingLot parkingLot21 = new models.parkingLot.ParkingLot("hi!");
        parkingLot21.setEnabled(false);
        java.util.UUID uUID24 = parkingLot21.getID();
        java.lang.String str25 = parkingLot21.getName();
        parkingLot21.setName("hi!");
        boolean boolean28 = parkingLot11.equals((java.lang.Object) parkingLot21);
        java.util.UUID uUID29 = parkingLot11.getID();
        java.lang.String str30 = parkingLot11.toString();
        boolean boolean31 = parkingLot1.equals((java.lang.Object) parkingLot11);
        parkingLot11.setName("");
        java.lang.String str34 = parkingLot11.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "34bd3d3f-7314-40b8-9870-6fc13f40fa6d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "8d633c47-ab7e-45a9-84db-d8c293ae15ee");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID24);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID24.toString(), "cde28d7a-14ea-4ca6-8cba-6467d4ccfe28");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID29);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID29.toString(), "8d633c47-ab7e-45a9-84db-d8c293ae15ee");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        models.parkingLot.ParkingLot parkingLot15 = new models.parkingLot.ParkingLot("hi!");
        parkingLot15.setEnabled(false);
        boolean boolean18 = parkingLot9.equals((java.lang.Object) parkingLot15);
        java.util.UUID uUID19 = parkingLot9.getID();
        parkingLot9.setEnabled(false);
        boolean boolean22 = parkingLot1.equals((java.lang.Object) parkingLot9);
        boolean boolean23 = parkingLot1.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "2493836c-c322-42be-8415-ca7601bc842a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "0f576bed-1b8d-49d0-8626-b2cbb280bb7c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "0f576bed-1b8d-49d0-8626-b2cbb280bb7c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        boolean boolean23 = parkingLot1.isEnabled();
        java.lang.String str24 = parkingLot1.toString();
        java.util.UUID uUID25 = parkingLot1.getID();
        parkingLot1.setName("hi!");
        java.lang.String str28 = parkingLot1.toString();
        java.lang.String str29 = parkingLot1.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "3fa6cd99-7dea-47ef-acdb-ff261d53f4af");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "fcf92104-9966-43c1-94d4-059b584f67b6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "3fa6cd99-7dea-47ef-acdb-ff261d53f4af");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID25);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID25.toString(), "3fa6cd99-7dea-47ef-acdb-ff261d53f4af");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        java.lang.String str4 = parkingLot1.toString();
        java.util.UUID uUID5 = parkingLot1.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "c1f694c1-ca2d-484f-9835-469872b26af5");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        java.util.UUID uUID3 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot5 = new models.parkingLot.ParkingLot("hi!", uUID3, true);
        java.lang.Class<?> wildcardClass6 = parkingLot5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID3.toString(), "5211b6ef-4bea-456b-8091-1845833af8df");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot2.equals((java.lang.Object) parkingLot8);
        java.util.UUID uUID12 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("hi!", uUID12, false);
        boolean boolean15 = parkingLot14.isEnabled();
        parkingLot14.setName("");
        java.util.UUID uUID18 = parkingLot14.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "af68a428-4c08-41cd-a282-764dfe5031be");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "af68a428-4c08-41cd-a282-764dfe5031be");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID18);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID18.toString(), "af68a428-4c08-41cd-a282-764dfe5031be");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("hi!");
        parkingLot1.setName("");
        parkingLot1.setEnabled(false);
        parkingLot1.setEnabled(true);
        java.lang.String str14 = parkingLot1.toString();
        boolean boolean15 = parkingLot1.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "868b835b-fdcc-4f67-8784-f4e242b981f6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        parkingLot1.setEnabled(false);
        boolean boolean13 = parkingLot1.isEnabled();
        java.lang.String str14 = parkingLot1.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "2c9f2717-4e71-44e5-9bdf-b79792af9f2a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("", uUID5, true);
        java.lang.String str8 = parkingLot7.toString();
        java.lang.String str9 = parkingLot7.getName();
        java.lang.String str10 = parkingLot7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "327042a9-ad41-4e0a-bcc6-5bcea716895e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        boolean boolean23 = parkingLot1.isEnabled();
        boolean boolean24 = parkingLot1.isEnabled();
        java.lang.Class<?> wildcardClass25 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "173aa931-cde4-493d-aa8f-f5904f8ba03e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "4ec25279-2b99-4c0b-a77a-45fcddf3ff09");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "173aa931-cde4-493d-aa8f-f5904f8ba03e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.toString();
        boolean boolean6 = parkingLot1.isEnabled();
        parkingLot1.setName("");
        boolean boolean9 = parkingLot1.isEnabled();
        java.lang.Class<?> wildcardClass10 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "a79a10d5-26de-4bf5-9d05-a1b9b7009ac5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        models.parkingLot.ParkingLot parkingLot8 = new models.parkingLot.ParkingLot("hi!");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot2.equals((java.lang.Object) parkingLot8);
        java.util.UUID uUID12 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot14 = new models.parkingLot.ParkingLot("hi!", uUID12, false);
        boolean boolean15 = parkingLot14.isEnabled();
        parkingLot14.setEnabled(true);
        java.lang.String str18 = parkingLot14.toString();
        java.lang.String str19 = parkingLot14.toString();
        models.parkingLot.ParkingLot parkingLot21 = new models.parkingLot.ParkingLot("hi!");
        parkingLot21.setEnabled(false);
        java.util.UUID uUID24 = parkingLot21.getID();
        java.lang.String str25 = parkingLot21.getName();
        parkingLot21.setEnabled(false);
        parkingLot21.setName("hi!");
        models.parkingLot.ParkingLot parkingLot31 = new models.parkingLot.ParkingLot("hi!");
        parkingLot31.setEnabled(false);
        java.util.UUID uUID34 = parkingLot31.getID();
        java.lang.String str35 = parkingLot31.getName();
        parkingLot31.setName("hi!");
        boolean boolean38 = parkingLot21.equals((java.lang.Object) parkingLot31);
        java.lang.String str39 = parkingLot31.getName();
        parkingLot31.setName("hi!");
        boolean boolean42 = parkingLot31.isEnabled();
        boolean boolean43 = parkingLot14.equals((java.lang.Object) parkingLot31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "b45b72cc-fe32-4673-b16b-4b95ff60143a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "b45b72cc-fe32-4673-b16b-4b95ff60143a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID24);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID24.toString(), "2aca5a09-94e9-4747-991d-519201d97b09");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID34);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID34.toString(), "e2a2afbf-a940-4c96-8975-fba09e27e38c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        java.util.UUID uUID4 = parkingLot1.getID();
        java.util.UUID uUID5 = parkingLot1.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "d6f8edea-9ed2-4873-bcb5-d48ce03e204d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "d6f8edea-9ed2-4873-bcb5-d48ce03e204d");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setEnabled(false);
        boolean boolean6 = parkingLot1.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setName("");
        java.util.UUID uUID6 = parkingLot1.getID();
        java.lang.Class<?> wildcardClass7 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID6.toString(), "e988a1cb-b263-4acf-96c2-a6de38e30de0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        parkingLot2.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        java.lang.String str16 = parkingLot12.getName();
        parkingLot12.setName("hi!");
        boolean boolean19 = parkingLot2.equals((java.lang.Object) parkingLot12);
        java.util.UUID uUID20 = parkingLot2.getID();
        boolean boolean21 = parkingLot2.isEnabled();
        boolean boolean22 = parkingLot2.isEnabled();
        java.lang.String str23 = parkingLot2.toString();
        boolean boolean24 = parkingLot2.isEnabled();
        java.lang.String str25 = parkingLot2.toString();
        java.util.UUID uUID26 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot28 = new models.parkingLot.ParkingLot("", uUID26, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "0e4a761e-20ba-4398-85b1-6dca2d5e831d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "dc088b4d-a85c-4c17-adf6-72044e97107e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "0e4a761e-20ba-4398-85b1-6dca2d5e831d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID26);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID26.toString(), "0e4a761e-20ba-4398-85b1-6dca2d5e831d");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        boolean boolean4 = parkingLot1.isEnabled();
        java.lang.Class<?> wildcardClass5 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        parkingLot1.setEnabled(false);
        boolean boolean13 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot15 = new models.parkingLot.ParkingLot("hi!");
        parkingLot15.setEnabled(false);
        java.util.UUID uUID18 = parkingLot15.getID();
        java.lang.String str19 = parkingLot15.getName();
        models.parkingLot.ParkingLot parkingLot21 = new models.parkingLot.ParkingLot("hi!");
        parkingLot21.setEnabled(false);
        boolean boolean24 = parkingLot15.equals((java.lang.Object) parkingLot21);
        java.lang.String str25 = parkingLot15.toString();
        java.lang.String str26 = parkingLot15.toString();
        boolean boolean27 = parkingLot15.isEnabled();
        java.lang.String str28 = parkingLot15.toString();
        boolean boolean29 = parkingLot1.equals((java.lang.Object) str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "478c2b9e-62ce-4232-b72b-c40ab2a55d32");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID18);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID18.toString(), "99390bd3-ae3e-4efa-b1b3-6bab05c00af0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setEnabled(false);
        java.lang.String str6 = parkingLot1.getName();
        java.util.UUID uUID7 = parkingLot1.getID();
        parkingLot1.setName("");
        parkingLot1.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "7fb4bb95-fbc8-4450-b7c1-5a484c946bfc");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        parkingLot1.setEnabled(false);
        java.lang.String str13 = parkingLot1.getName();
        parkingLot1.setName("hi!");
        parkingLot1.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "a9a5a7d9-be31-4e40-ad7d-5a5c4f304d49");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        java.lang.String str7 = parkingLot1.getName();
        boolean boolean8 = parkingLot1.isEnabled();
        java.lang.String str9 = parkingLot1.toString();
        parkingLot1.setName("hi!");
        java.lang.String str12 = parkingLot1.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "7fca673c-da2d-4b7b-9fbe-0452e75b9364");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        boolean boolean6 = parkingLot1.equals((java.lang.Object) (short) 100);
        boolean boolean7 = parkingLot1.isEnabled();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setEnabled(false);
        java.util.UUID uUID12 = parkingLot9.getID();
        java.lang.String str13 = parkingLot9.getName();
        models.parkingLot.ParkingLot parkingLot15 = new models.parkingLot.ParkingLot("hi!");
        parkingLot15.setEnabled(false);
        boolean boolean18 = parkingLot9.equals((java.lang.Object) parkingLot15);
        java.util.UUID uUID19 = parkingLot9.getID();
        parkingLot9.setEnabled(false);
        boolean boolean22 = parkingLot1.equals((java.lang.Object) parkingLot9);
        java.util.UUID uUID23 = parkingLot9.getID();
        models.parkingLot.ParkingLot parkingLot25 = new models.parkingLot.ParkingLot("hi!");
        parkingLot25.setEnabled(false);
        java.util.UUID uUID28 = parkingLot25.getID();
        boolean boolean30 = parkingLot25.equals((java.lang.Object) (short) 100);
        boolean boolean31 = parkingLot25.isEnabled();
        models.parkingLot.ParkingLot parkingLot33 = new models.parkingLot.ParkingLot("hi!");
        parkingLot33.setEnabled(false);
        java.util.UUID uUID36 = parkingLot33.getID();
        java.lang.String str37 = parkingLot33.getName();
        models.parkingLot.ParkingLot parkingLot39 = new models.parkingLot.ParkingLot("hi!");
        parkingLot39.setEnabled(false);
        boolean boolean42 = parkingLot33.equals((java.lang.Object) parkingLot39);
        java.util.UUID uUID43 = parkingLot33.getID();
        parkingLot33.setEnabled(false);
        boolean boolean46 = parkingLot25.equals((java.lang.Object) parkingLot33);
        boolean boolean48 = parkingLot25.equals((java.lang.Object) 0L);
        boolean boolean49 = parkingLot9.equals((java.lang.Object) boolean48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "2c61ccdf-2a3d-4633-b63a-bd5ef90c7bde");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "5130b1d2-288b-43c1-9e64-83e8397f5a7c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "5130b1d2-288b-43c1-9e64-83e8397f5a7c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID23);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID23.toString(), "5130b1d2-288b-43c1-9e64-83e8397f5a7c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID28);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID28.toString(), "be6725c1-5b31-4386-8e93-c04498519929");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID36);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID36.toString(), "6aca8538-4d37-4d39-b831-9fbae998a209");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID43);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID43.toString(), "6aca8538-4d37-4d39-b831-9fbae998a209");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.util.UUID uUID6 = parkingLot2.getID();
        java.util.UUID uUID7 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("", uUID7, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "123ae1b0-8087-4d9c-a847-227c996f6560");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID6.toString(), "123ae1b0-8087-4d9c-a847-227c996f6560");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "123ae1b0-8087-4d9c-a847-227c996f6560");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        parkingLot2.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        java.lang.String str16 = parkingLot12.getName();
        parkingLot12.setName("hi!");
        boolean boolean19 = parkingLot2.equals((java.lang.Object) parkingLot12);
        java.util.UUID uUID20 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot22 = new models.parkingLot.ParkingLot("hi!", uUID20, true);
        java.lang.String str23 = parkingLot22.toString();
        java.lang.String str24 = parkingLot22.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "da1d6c90-7ed8-421a-a107-f2c1444ed4e0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "06a47398-3d18-4873-b946-e1b1cae3b311");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "da1d6c90-7ed8-421a-a107-f2c1444ed4e0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        java.lang.String str8 = parkingLot1.getName();
        java.util.UUID uUID9 = parkingLot1.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "38f64884-df13-4879-86d0-169552b08dd4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID9.toString(), "38f64884-df13-4879-86d0-169552b08dd4");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        java.lang.String str10 = parkingLot1.getName();
        boolean boolean11 = parkingLot1.isEnabled();
        parkingLot1.setName("hi!");
        parkingLot1.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "1a3501a4-602e-4f2a-b35e-39409aa4ec56");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setName("hi!");
        parkingLot2.setName("");
        java.util.UUID uUID7 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!", uUID7, true);
        parkingLot9.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "389c74ac-88e1-4297-a726-360296765f57");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        parkingLot2.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        java.lang.String str16 = parkingLot12.getName();
        parkingLot12.setName("hi!");
        boolean boolean19 = parkingLot2.equals((java.lang.Object) parkingLot12);
        java.util.UUID uUID20 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot22 = new models.parkingLot.ParkingLot("hi!", uUID20, true);
        java.lang.String str23 = parkingLot22.toString();
        java.util.UUID uUID24 = parkingLot22.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "00124fb5-ae12-4014-bcd3-33048908d19f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "244b8c6c-f084-4f1b-ad07-6e36b5a735ba");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "00124fb5-ae12-4014-bcd3-33048908d19f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID24);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID24.toString(), "00124fb5-ae12-4014-bcd3-33048908d19f");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        models.parkingLot.ParkingLot parkingLot24 = new models.parkingLot.ParkingLot("hi!");
        parkingLot24.setEnabled(false);
        java.util.UUID uUID27 = parkingLot24.getID();
        boolean boolean29 = parkingLot24.equals((java.lang.Object) (short) 100);
        boolean boolean30 = parkingLot24.isEnabled();
        models.parkingLot.ParkingLot parkingLot32 = new models.parkingLot.ParkingLot("hi!");
        parkingLot32.setEnabled(false);
        java.util.UUID uUID35 = parkingLot32.getID();
        java.lang.String str36 = parkingLot32.getName();
        models.parkingLot.ParkingLot parkingLot38 = new models.parkingLot.ParkingLot("hi!");
        parkingLot38.setEnabled(false);
        boolean boolean41 = parkingLot32.equals((java.lang.Object) parkingLot38);
        java.util.UUID uUID42 = parkingLot32.getID();
        parkingLot32.setEnabled(false);
        boolean boolean45 = parkingLot24.equals((java.lang.Object) parkingLot32);
        java.util.UUID uUID46 = parkingLot32.getID();
        boolean boolean47 = parkingLot1.equals((java.lang.Object) uUID46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "70a3fdcb-0ae7-4957-9971-2c648e359aa1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "789fd98c-bb2d-4104-a464-e1261cb00bc3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "70a3fdcb-0ae7-4957-9971-2c648e359aa1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID27);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID27.toString(), "83330b61-4943-48de-a804-28512c0afe39");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID35);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID35.toString(), "7d1a32ed-384b-4128-b79d-d26a6984d4ab");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID42);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID42.toString(), "7d1a32ed-384b-4128-b79d-d26a6984d4ab");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID46);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID46.toString(), "7d1a32ed-384b-4128-b79d-d26a6984d4ab");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setName("hi!");
        parkingLot1.setName("");
        parkingLot1.setEnabled(false);
        parkingLot1.setEnabled(true);
        boolean boolean14 = parkingLot1.isEnabled();
        java.lang.Class<?> wildcardClass15 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "e86dc557-2a53-4979-a30f-f9cb79fab5d9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setEnabled(true);
        parkingLot1.setName("");
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("hi!");
        parkingLot9.setName("hi!");
        parkingLot9.setEnabled(true);
        parkingLot9.setName("");
        parkingLot9.setEnabled(true);
        boolean boolean18 = parkingLot1.equals((java.lang.Object) true);
        models.parkingLot.ParkingLot parkingLot20 = new models.parkingLot.ParkingLot("hi!");
        parkingLot20.setEnabled(false);
        java.util.UUID uUID23 = parkingLot20.getID();
        java.util.UUID uUID24 = parkingLot20.getID();
        boolean boolean25 = parkingLot1.equals((java.lang.Object) parkingLot20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID23);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID23.toString(), "3c9b486d-3e6e-46e7-921a-dc7c4c9d7d36");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID24);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID24.toString(), "3c9b486d-3e6e-46e7-921a-dc7c4c9d7d36");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot11.getName();
        boolean boolean21 = parkingLot11.equals((java.lang.Object) true);
        java.util.UUID uUID22 = parkingLot11.getID();
        boolean boolean23 = parkingLot11.isEnabled();
        java.lang.String str24 = parkingLot11.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "b44b477c-b930-4e3f-bd09-eedaacdaa913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "942e8ea9-e6a8-4cb2-b0cc-91ddd9f499f5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "942e8ea9-e6a8-4cb2-b0cc-91ddd9f499f5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot11.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "de735a69-5eaf-465a-b0eb-6cdeb0e3bf38");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "66f57d0d-3f66-440b-9978-f1170204b594");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        models.parkingLot.ParkingLot parkingLot7 = new models.parkingLot.ParkingLot("hi!");
        parkingLot7.setEnabled(false);
        boolean boolean10 = parkingLot1.equals((java.lang.Object) parkingLot7);
        java.lang.String str11 = parkingLot1.toString();
        parkingLot1.setName("");
        models.parkingLot.ParkingLot parkingLot15 = new models.parkingLot.ParkingLot("hi!");
        parkingLot15.setName("hi!");
        parkingLot15.setName("");
        boolean boolean21 = parkingLot15.equals((java.lang.Object) (-1.0d));
        boolean boolean22 = parkingLot1.equals((java.lang.Object) boolean21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "58eb5fba-7931-4204-b930-779d2c5f1690");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.getName();
        parkingLot2.setEnabled(false);
        parkingLot2.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        java.lang.String str16 = parkingLot12.getName();
        parkingLot12.setName("hi!");
        boolean boolean19 = parkingLot2.equals((java.lang.Object) parkingLot12);
        java.util.UUID uUID20 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot22 = new models.parkingLot.ParkingLot("", uUID20, true);
        parkingLot22.setEnabled(true);
        boolean boolean25 = parkingLot22.isEnabled();
        java.lang.Class<?> wildcardClass26 = parkingLot22.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "256e74b1-654c-4389-af1f-50ad3ef46c4a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "896d0824-2b38-4093-ad4d-11283611e837");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "256e74b1-654c-4389-af1f-50ad3ef46c4a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID19 = parkingLot1.getID();
        boolean boolean20 = parkingLot1.isEnabled();
        boolean boolean21 = parkingLot1.isEnabled();
        java.lang.String str22 = parkingLot1.toString();
        java.lang.String str23 = parkingLot1.toString();
        java.lang.Class<?> wildcardClass24 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "756409b6-b9f5-4beb-b792-87bc60399b1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "b08567be-e59c-4e65-989f-d268e279a3d6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "756409b6-b9f5-4beb-b792-87bc60399b1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setName("hi!");
        parkingLot1.setEnabled(true);
        java.lang.String str6 = parkingLot1.getName();
        parkingLot1.setName("");
        java.util.UUID uUID9 = parkingLot1.getID();
        java.lang.String str10 = parkingLot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID9.toString(), "5bf39c68-cbfc-4922-a237-8a6790d8861a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("hi!");
        boolean boolean18 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.lang.String str19 = parkingLot1.getName();
        boolean boolean21 = parkingLot1.equals((java.lang.Object) '#');
        models.parkingLot.ParkingLot parkingLot23 = new models.parkingLot.ParkingLot("hi!");
        parkingLot23.setEnabled(false);
        java.util.UUID uUID26 = parkingLot23.getID();
        java.lang.String str27 = parkingLot23.toString();
        boolean boolean28 = parkingLot23.isEnabled();
        boolean boolean29 = parkingLot1.equals((java.lang.Object) parkingLot23);
        parkingLot23.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "60c59789-b752-4ba1-9069-f2f69f5c382d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "1e00a77d-c295-4008-bf15-9858c95d53d5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID26);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID26.toString(), "e1bbd7aa-e9e6-46ec-90d9-e2c98792166d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(false);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot12 = new models.parkingLot.ParkingLot("hi!");
        parkingLot12.setEnabled(false);
        java.util.UUID uUID15 = parkingLot12.getID();
        models.parkingLot.ParkingLot parkingLot17 = new models.parkingLot.ParkingLot("hi!", uUID15, true);
        java.util.UUID uUID18 = parkingLot17.getID();
        boolean boolean19 = parkingLot1.equals((java.lang.Object) parkingLot17);
        java.util.UUID uUID20 = parkingLot17.getID();
        java.lang.String str21 = parkingLot17.toString();
        boolean boolean22 = parkingLot17.isEnabled();
        java.lang.Class<?> wildcardClass23 = parkingLot17.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "591bc4b0-63ea-4fa7-ac4b-155e88b03fab");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "d90edf71-990a-4a82-a932-204f7f1b79d2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID18);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID18.toString(), "d90edf71-990a-4a82-a932-204f7f1b79d2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID20.toString(), "d90edf71-990a-4a82-a932-204f7f1b79d2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        models.parkingLot.ParkingLot parkingLot1 = new models.parkingLot.ParkingLot("hi!");
        parkingLot1.setEnabled(false);
        java.util.UUID uUID4 = parkingLot1.getID();
        java.lang.String str5 = parkingLot1.getName();
        parkingLot1.setEnabled(true);
        parkingLot1.setName("hi!");
        models.parkingLot.ParkingLot parkingLot11 = new models.parkingLot.ParkingLot("hi!");
        parkingLot11.setEnabled(false);
        java.util.UUID uUID14 = parkingLot11.getID();
        java.lang.String str15 = parkingLot11.getName();
        parkingLot11.setName("");
        boolean boolean18 = parkingLot11.isEnabled();
        boolean boolean19 = parkingLot11.isEnabled();
        boolean boolean20 = parkingLot1.equals((java.lang.Object) parkingLot11);
        java.util.UUID uUID21 = parkingLot1.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "dc8199d4-067b-433a-adea-0f03cde6fae4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "f1017e0e-8b89-407b-afe1-baca55fe0a20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "dc8199d4-067b-433a-adea-0f03cde6fae4");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        models.parkingLot.ParkingLot parkingLot2 = new models.parkingLot.ParkingLot("hi!");
        parkingLot2.setEnabled(false);
        java.util.UUID uUID5 = parkingLot2.getID();
        java.lang.String str6 = parkingLot2.toString();
        java.util.UUID uUID7 = parkingLot2.getID();
        models.parkingLot.ParkingLot parkingLot9 = new models.parkingLot.ParkingLot("", uUID7, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "97318dbc-6856-4f09-9796-3c95cb24e144");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "97318dbc-6856-4f09-9796-3c95cb24e144");
    }
}
