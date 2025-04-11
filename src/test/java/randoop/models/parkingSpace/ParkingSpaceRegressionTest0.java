package randoop.models.parkingSpace;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParkingSpaceRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus0 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        java.lang.Class<?> wildcardClass1 = parkingSpaceStatus0.getClass();
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus0 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus0.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        models.parkingLot.ParkingLot parkingLot3 = parkingSpace2.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        java.lang.String str7 = parkingSpace5.getName();
        boolean boolean8 = parkingSpace5.isEnabled();
        java.lang.String str9 = parkingSpace5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus14 = parkingSpace13.getStatus();
        java.lang.Class<?> wildcardClass15 = parkingSpace13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus14 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus14.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingLot.ParkingLot parkingLot21 = null;
        models.parkingSpace.ParkingSpace parkingSpace23 = new models.parkingSpace.ParkingSpace(parkingLot21, "hi!");
        parkingSpace23.setEnabled(true);
        java.util.UUID uUID26 = parkingSpace23.getID();
        models.parkingLot.ParkingLot parkingLot27 = null;
        java.util.UUID uUID28 = null;
        models.parkingLot.ParkingLot parkingLot29 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus30 = null;
        models.parkingSpace.ParkingSpace parkingSpace33 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus30, "", false);
        java.lang.String str34 = parkingSpace33.toString();
        models.parkingLot.ParkingLot parkingLot35 = parkingSpace33.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus36 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace33.setStatus(parkingSpaceStatus36);
        models.parkingSpace.ParkingSpace parkingSpace40 = new models.parkingSpace.ParkingSpace(uUID26, parkingLot27, parkingSpaceStatus36, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace43 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus36, "hi!", true);
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingLot.ParkingLot parkingLot45 = null;
        models.parkingSpace.ParkingSpace parkingSpace47 = new models.parkingSpace.ParkingSpace(parkingLot45, "hi!");
        parkingSpace47.setEnabled(true);
        java.util.UUID uUID50 = parkingSpace47.getID();
        models.parkingLot.ParkingLot parkingLot51 = null;
        java.util.UUID uUID52 = null;
        models.parkingLot.ParkingLot parkingLot53 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus54 = null;
        models.parkingSpace.ParkingSpace parkingSpace57 = new models.parkingSpace.ParkingSpace(uUID52, parkingLot53, parkingSpaceStatus54, "", false);
        java.lang.String str58 = parkingSpace57.toString();
        models.parkingLot.ParkingLot parkingLot59 = parkingSpace57.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus60 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace57.setStatus(parkingSpaceStatus60);
        models.parkingSpace.ParkingSpace parkingSpace64 = new models.parkingSpace.ParkingSpace(uUID50, parkingLot51, parkingSpaceStatus60, "hi!", true);
        models.parkingLot.ParkingLot parkingLot65 = null;
        models.parkingLot.ParkingLot parkingLot66 = null;
        models.parkingSpace.ParkingSpace parkingSpace68 = new models.parkingSpace.ParkingSpace(parkingLot66, "hi!");
        parkingSpace68.setEnabled(true);
        java.util.UUID uUID71 = parkingSpace68.getID();
        models.parkingLot.ParkingLot parkingLot72 = null;
        java.util.UUID uUID73 = null;
        models.parkingLot.ParkingLot parkingLot74 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus75 = null;
        models.parkingSpace.ParkingSpace parkingSpace78 = new models.parkingSpace.ParkingSpace(uUID73, parkingLot74, parkingSpaceStatus75, "", false);
        java.lang.String str79 = parkingSpace78.toString();
        models.parkingLot.ParkingLot parkingLot80 = parkingSpace78.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus81 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace78.setStatus(parkingSpaceStatus81);
        models.parkingSpace.ParkingSpace parkingSpace85 = new models.parkingSpace.ParkingSpace(uUID71, parkingLot72, parkingSpaceStatus81, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace88 = new models.parkingSpace.ParkingSpace(uUID50, parkingLot65, parkingSpaceStatus81, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace91 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot44, parkingSpaceStatus81, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "6bae7250-b1f5-4e90-a5fe-333015515589");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID26);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID26.toString(), "048cac03-2a01-434a-b42b-ad125f34f019");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot35);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus36 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus36.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID50);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID50.toString(), "84d292c1-d956-4b3c-ae38-583c38e5d1cc");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot59);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus60 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus60.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID71);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID71.toString(), "9b0351bf-68fd-425f-a0a4-09fbaa1bcdb7");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "" + "'", str79.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot80);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus81 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus81.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace13.getLot();
        boolean boolean15 = parkingSpace13.isBookable();
        models.parkingLot.ParkingLot parkingLot16 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(parkingLot16, "hi!");
        boolean boolean19 = parkingSpace13.equals((java.lang.Object) parkingSpace18);
        java.lang.Class<?> wildcardClass20 = parkingSpace13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        models.parkingSpace.ParkingSpace parkingSpace24 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus21, "hi!", false);
        java.lang.Class<?> wildcardClass25 = uUID5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "9590d5e4-e6f2-486d-9634-54af5d1e3c45");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus21 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus21.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        parkingSpace13.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        models.parkingLot.ParkingLot parkingLot10 = parkingSpace5.getLot();
        boolean boolean12 = parkingSpace5.equals((java.lang.Object) false);
        parkingSpace5.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace13.getLot();
        boolean boolean15 = parkingSpace13.isBookable();
        models.parkingLot.ParkingLot parkingLot16 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(parkingLot16, "hi!");
        boolean boolean19 = parkingSpace13.equals((java.lang.Object) parkingSpace18);
        boolean boolean20 = parkingSpace13.isEnabled();
        models.parkingLot.ParkingLot parkingLot21 = parkingSpace13.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot21);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(false);
        parkingSpace5.setEnabled(true);
        parkingSpace5.setEnabled(false);
        parkingSpace5.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingLot.ParkingLot parkingLot21 = null;
        models.parkingSpace.ParkingSpace parkingSpace23 = new models.parkingSpace.ParkingSpace(parkingLot21, "hi!");
        parkingSpace23.setEnabled(true);
        java.util.UUID uUID26 = parkingSpace23.getID();
        models.parkingLot.ParkingLot parkingLot27 = null;
        java.util.UUID uUID28 = null;
        models.parkingLot.ParkingLot parkingLot29 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus30 = null;
        models.parkingSpace.ParkingSpace parkingSpace33 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus30, "", false);
        java.lang.String str34 = parkingSpace33.toString();
        models.parkingLot.ParkingLot parkingLot35 = parkingSpace33.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus36 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace33.setStatus(parkingSpaceStatus36);
        models.parkingSpace.ParkingSpace parkingSpace40 = new models.parkingSpace.ParkingSpace(uUID26, parkingLot27, parkingSpaceStatus36, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace43 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus36, "hi!", true);
        java.lang.Class<?> wildcardClass44 = parkingSpaceStatus36.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "36c4ba04-83bb-4ebe-8066-bcd1f6e55743");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID26);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID26.toString(), "efdacad0-75bd-4d36-9625-0ef5e5e8171c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot35);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus36 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus36.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace5.getStatus();
        java.lang.Class<?> wildcardClass17 = parkingSpaceStatus16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        boolean boolean10 = parkingSpace5.isEnabled();
        models.parkingLot.ParkingLot parkingLot11 = parkingSpace5.getLot();
        java.lang.String str12 = parkingSpace5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "");
        java.lang.Class<?> wildcardClass3 = parkingSpace2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus31, "", true);
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus31, "hi!", false);
        models.parkingLot.ParkingLot parkingLot38 = null;
        java.util.UUID uUID39 = null;
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.UUID uUID41 = null;
        models.parkingLot.ParkingLot parkingLot42 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus43 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(uUID41, parkingLot42, parkingSpaceStatus43, "", false);
        java.lang.String str47 = parkingSpace46.toString();
        parkingSpace46.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus49 = parkingSpace46.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace52 = new models.parkingSpace.ParkingSpace(uUID39, parkingLot40, parkingSpaceStatus49, "", true);
        models.parkingSpace.ParkingSpace parkingSpace55 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot38, parkingSpaceStatus49, "", true);
        java.lang.Class<?> wildcardClass56 = parkingSpaceStatus49.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "4a395efe-7a05-4e98-b0b3-2e388c00d9d0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus49 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus49.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        java.lang.String str7 = parkingSpace5.getName();
        java.lang.String str8 = parkingSpace5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        java.lang.String str7 = parkingSpace5.getName();
        boolean boolean8 = parkingSpace5.isEnabled();
        java.lang.Class<?> wildcardClass9 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus31, "", true);
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus31, "hi!", false);
        parkingSpace37.setEnabled(false);
        java.lang.Class<?> wildcardClass40 = parkingSpace37.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "6602be96-42d7-4e8e-95d1-b1ba27958dbc");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        boolean boolean10 = parkingSpace5.isEnabled();
        boolean boolean11 = parkingSpace5.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        java.lang.String str11 = parkingSpace5.toString();
        java.util.UUID uUID12 = parkingSpace5.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        java.lang.String str7 = parkingSpace5.getName();
        java.lang.String str8 = parkingSpace5.getName();
        boolean boolean9 = parkingSpace5.isBookable();
        parkingSpace5.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.checkOut();
        boolean boolean9 = parkingSpace5.isBookable();
        boolean boolean10 = parkingSpace5.isBookable();
        java.lang.Class<?> wildcardClass11 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        boolean boolean10 = parkingSpace5.equals((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass11 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        java.lang.String str6 = parkingSpace2.getName();
        java.lang.Class<?> wildcardClass7 = parkingSpace2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "b8884634-9e31-4ca7-99f0-740fb3a485e5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        java.lang.String str15 = parkingSpace5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingLot.ParkingLot parkingLot23 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(parkingLot23, "hi!");
        parkingSpace25.setEnabled(true);
        java.util.UUID uUID28 = parkingSpace25.getID();
        models.parkingLot.ParkingLot parkingLot29 = null;
        java.util.UUID uUID30 = null;
        models.parkingLot.ParkingLot parkingLot31 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus32 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = new models.parkingSpace.ParkingSpace(uUID30, parkingLot31, parkingSpaceStatus32, "", false);
        java.lang.String str36 = parkingSpace35.toString();
        models.parkingLot.ParkingLot parkingLot37 = parkingSpace35.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus38 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace35.setStatus(parkingSpaceStatus38);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus38, "hi!", true);
        models.parkingLot.ParkingLot parkingLot43 = null;
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(parkingLot44, "hi!");
        parkingSpace46.setEnabled(true);
        java.util.UUID uUID49 = parkingSpace46.getID();
        models.parkingLot.ParkingLot parkingLot50 = null;
        java.util.UUID uUID51 = null;
        models.parkingLot.ParkingLot parkingLot52 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID51, parkingLot52, parkingSpaceStatus53, "", false);
        java.lang.String str57 = parkingSpace56.toString();
        models.parkingLot.ParkingLot parkingLot58 = parkingSpace56.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace56.setStatus(parkingSpaceStatus59);
        models.parkingSpace.ParkingSpace parkingSpace63 = new models.parkingSpace.ParkingSpace(uUID49, parkingLot50, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot43, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace69 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus59, "", true);
        java.util.UUID uUID70 = parkingSpace69.getID();
        models.parkingLot.ParkingLot parkingLot71 = null;
        java.util.UUID uUID72 = null;
        models.parkingLot.ParkingLot parkingLot73 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus74 = null;
        models.parkingSpace.ParkingSpace parkingSpace77 = new models.parkingSpace.ParkingSpace(uUID72, parkingLot73, parkingSpaceStatus74, "", false);
        java.lang.String str78 = parkingSpace77.toString();
        models.parkingLot.ParkingLot parkingLot79 = parkingSpace77.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus80 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace77.setStatus(parkingSpaceStatus80);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus82 = parkingSpace77.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace85 = new models.parkingSpace.ParkingSpace(uUID70, parkingLot71, parkingSpaceStatus82, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "7bd8308a-aac4-4f7c-881a-acf1ff9b5baa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID28);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID28.toString(), "b3180a2f-d753-4ea6-a3c5-8ee46d4192d5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot37);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus38 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus38.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID49);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID49.toString(), "1ae64337-1c57-4d8a-9b5d-984112cf0f93");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus59 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus59.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID70);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID70.toString(), "7bd8308a-aac4-4f7c-881a-acf1ff9b5baa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot79);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus80 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus80.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus82 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus82.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        java.lang.String str7 = parkingSpace5.getName();
        java.lang.String str8 = parkingSpace5.getName();
        boolean boolean9 = parkingSpace5.isBookable();
        boolean boolean10 = parkingSpace5.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        java.lang.String str7 = parkingSpace5.getName();
        java.lang.String str8 = parkingSpace5.getName();
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace parkingSpace11 = new models.parkingSpace.ParkingSpace(parkingLot9, "hi!");
        parkingSpace11.setEnabled(true);
        java.util.UUID uUID14 = parkingSpace11.getID();
        models.parkingLot.ParkingLot parkingLot15 = null;
        java.util.UUID uUID16 = null;
        models.parkingLot.ParkingLot parkingLot17 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus18 = null;
        models.parkingSpace.ParkingSpace parkingSpace21 = new models.parkingSpace.ParkingSpace(uUID16, parkingLot17, parkingSpaceStatus18, "", false);
        java.lang.String str22 = parkingSpace21.toString();
        models.parkingLot.ParkingLot parkingLot23 = parkingSpace21.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus24 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace21.setStatus(parkingSpaceStatus24);
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID14, parkingLot15, parkingSpaceStatus24, "hi!", true);
        boolean boolean29 = parkingSpace5.equals((java.lang.Object) true);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus30 = parkingSpace5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "9d124dde-58cf-4fcf-80d3-c5d923e6db20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot23);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus24 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus24.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpaceStatus30);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        boolean boolean10 = parkingSpace5.isEnabled();
        java.util.UUID uUID11 = null;
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.UUID uUID13 = null;
        models.parkingLot.ParkingLot parkingLot14 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(uUID13, parkingLot14, parkingSpaceStatus15, "", false);
        java.lang.String str19 = parkingSpace18.toString();
        parkingSpace18.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = parkingSpace18.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace24 = new models.parkingSpace.ParkingSpace(uUID11, parkingLot12, parkingSpaceStatus21, "", false);
        parkingSpace5.setStatus(parkingSpaceStatus21);
        java.lang.Class<?> wildcardClass26 = parkingSpaceStatus21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus21 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus21.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingLot.ParkingLot parkingLot23 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(parkingLot23, "hi!");
        parkingSpace25.setEnabled(true);
        java.util.UUID uUID28 = parkingSpace25.getID();
        models.parkingLot.ParkingLot parkingLot29 = null;
        java.util.UUID uUID30 = null;
        models.parkingLot.ParkingLot parkingLot31 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus32 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = new models.parkingSpace.ParkingSpace(uUID30, parkingLot31, parkingSpaceStatus32, "", false);
        java.lang.String str36 = parkingSpace35.toString();
        models.parkingLot.ParkingLot parkingLot37 = parkingSpace35.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus38 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace35.setStatus(parkingSpaceStatus38);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus38, "hi!", true);
        models.parkingLot.ParkingLot parkingLot43 = null;
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(parkingLot44, "hi!");
        parkingSpace46.setEnabled(true);
        java.util.UUID uUID49 = parkingSpace46.getID();
        models.parkingLot.ParkingLot parkingLot50 = null;
        java.util.UUID uUID51 = null;
        models.parkingLot.ParkingLot parkingLot52 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID51, parkingLot52, parkingSpaceStatus53, "", false);
        java.lang.String str57 = parkingSpace56.toString();
        models.parkingLot.ParkingLot parkingLot58 = parkingSpace56.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace56.setStatus(parkingSpaceStatus59);
        models.parkingSpace.ParkingSpace parkingSpace63 = new models.parkingSpace.ParkingSpace(uUID49, parkingLot50, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot43, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace69 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus59, "", true);
        java.util.UUID uUID70 = parkingSpace69.getID();
        models.parkingLot.ParkingLot parkingLot71 = null;
        java.util.UUID uUID72 = null;
        models.parkingLot.ParkingLot parkingLot73 = null;
        java.util.UUID uUID74 = null;
        models.parkingLot.ParkingLot parkingLot75 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus76 = null;
        models.parkingSpace.ParkingSpace parkingSpace79 = new models.parkingSpace.ParkingSpace(uUID74, parkingLot75, parkingSpaceStatus76, "", false);
        java.lang.String str80 = parkingSpace79.toString();
        parkingSpace79.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus82 = parkingSpace79.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace85 = new models.parkingSpace.ParkingSpace(uUID72, parkingLot73, parkingSpaceStatus82, "", true);
        models.parkingSpace.ParkingSpace parkingSpace88 = new models.parkingSpace.ParkingSpace(uUID70, parkingLot71, parkingSpaceStatus82, "", true);
        java.util.UUID uUID89 = parkingSpace88.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "528c2a47-7162-496d-8ce4-c3e8a896e253");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID28);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID28.toString(), "6db616a9-de44-46e3-885e-1f05d0e36bca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot37);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus38 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus38.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID49);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID49.toString(), "ee2af9da-636e-4bb2-a56a-31d5ae77a568");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus59 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus59.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID70);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID70.toString(), "528c2a47-7162-496d-8ce4-c3e8a896e253");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus82 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus82.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID89);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID89.toString(), "528c2a47-7162-496d-8ce4-c3e8a896e253");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus31, "", true);
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus31, "hi!", false);
        java.util.UUID uUID38 = parkingSpace37.getID();
        boolean boolean39 = parkingSpace37.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "69554809-f489-4834-b7ec-8ddebe51b3cc");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID38);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID38.toString(), "69554809-f489-4834-b7ec-8ddebe51b3cc");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(false);
        parkingSpace5.setEnabled(true);
        parkingSpace5.setEnabled(true);
        boolean boolean16 = parkingSpace5.equals((java.lang.Object) "");
        boolean boolean17 = parkingSpace5.isBookable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        boolean boolean22 = parkingSpace2.isBookable();
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        models.parkingLot.ParkingLot parkingLot30 = parkingSpace28.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace28.setStatus(parkingSpaceStatus31);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus33 = parkingSpace28.getStatus();
        parkingSpace2.setStatus(parkingSpaceStatus33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "1485c56c-49dd-42b6-97d3-39fb82e39f77");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot30);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus33 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus33.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.getName();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = parkingSpace13.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(false);
        parkingSpace5.setEnabled(true);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = parkingSpace5.getStatus();
        boolean boolean14 = parkingSpace5.isBookable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus13 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus13.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        boolean boolean10 = parkingSpace5.equals((java.lang.Object) 1.0f);
        boolean boolean11 = parkingSpace5.isEnabled();
        java.lang.Class<?> wildcardClass12 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.checkOut();
        parkingSpace5.setEnabled(true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.checkOut();
        java.util.UUID uUID9 = parkingSpace5.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        java.lang.String str3 = parkingSpace2.toString();
        boolean boolean4 = parkingSpace2.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus14 = parkingSpace13.getStatus();
        java.lang.Object obj15 = null;
        boolean boolean16 = parkingSpace13.equals(obj15);
        java.lang.String str17 = parkingSpace13.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus14 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus14.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        models.parkingSpace.ParkingSpace parkingSpace24 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus21, "hi!", false);
        java.lang.String str25 = parkingSpace24.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "869b2d75-b8ef-412d-9402-f3f0e85b3705");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus21 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus21.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace5.getStatus();
        models.parkingLot.ParkingLot parkingLot17 = null;
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(parkingLot17, "hi!");
        parkingSpace19.setEnabled(true);
        java.lang.String str22 = parkingSpace19.getName();
        boolean boolean23 = parkingSpace5.equals((java.lang.Object) str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        java.lang.String str3 = parkingSpace2.toString();
        java.lang.String str4 = parkingSpace2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus14 = parkingSpace13.getStatus();
        java.lang.Class<?> wildcardClass15 = parkingSpace13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus14 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus14.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus11 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        boolean boolean12 = parkingSpace5.equals((java.lang.Object) parkingSpaceStatus11);
        java.util.UUID uUID13 = null;
        models.parkingLot.ParkingLot parkingLot14 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(uUID13, parkingLot14, parkingSpaceStatus15, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus19 = null;
        parkingSpace18.setStatus(parkingSpaceStatus19);
        parkingSpace18.setEnabled(true);
        boolean boolean23 = parkingSpace18.isEnabled();
        parkingSpace18.checkOut();
        java.util.UUID uUID25 = parkingSpace18.getID();
        parkingSpace18.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot28 = parkingSpace18.getLot();
        java.lang.String str29 = parkingSpace18.getName();
        boolean boolean30 = parkingSpace5.equals((java.lang.Object) str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus11 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus11.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(false);
        parkingSpace5.setEnabled(true);
        parkingSpace5.setEnabled(true);
        boolean boolean16 = parkingSpace5.equals((java.lang.Object) "");
        models.parkingLot.ParkingLot parkingLot17 = parkingSpace5.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot17);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        models.parkingLot.ParkingLot parkingLot10 = parkingSpace5.getLot();
        boolean boolean11 = parkingSpace5.isEnabled();
        java.lang.String str12 = parkingSpace5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingLot.ParkingLot parkingLot23 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(parkingLot23, "hi!");
        parkingSpace25.setEnabled(true);
        java.util.UUID uUID28 = parkingSpace25.getID();
        models.parkingLot.ParkingLot parkingLot29 = null;
        java.util.UUID uUID30 = null;
        models.parkingLot.ParkingLot parkingLot31 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus32 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = new models.parkingSpace.ParkingSpace(uUID30, parkingLot31, parkingSpaceStatus32, "", false);
        java.lang.String str36 = parkingSpace35.toString();
        models.parkingLot.ParkingLot parkingLot37 = parkingSpace35.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus38 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace35.setStatus(parkingSpaceStatus38);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus38, "hi!", true);
        models.parkingLot.ParkingLot parkingLot43 = null;
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(parkingLot44, "hi!");
        parkingSpace46.setEnabled(true);
        java.util.UUID uUID49 = parkingSpace46.getID();
        models.parkingLot.ParkingLot parkingLot50 = null;
        java.util.UUID uUID51 = null;
        models.parkingLot.ParkingLot parkingLot52 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID51, parkingLot52, parkingSpaceStatus53, "", false);
        java.lang.String str57 = parkingSpace56.toString();
        models.parkingLot.ParkingLot parkingLot58 = parkingSpace56.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace56.setStatus(parkingSpaceStatus59);
        models.parkingSpace.ParkingSpace parkingSpace63 = new models.parkingSpace.ParkingSpace(uUID49, parkingLot50, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot43, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace69 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus59, "", true);
        java.util.UUID uUID70 = parkingSpace69.getID();
        parkingSpace69.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "00d1844e-4c6b-4046-b601-b739434e4d53");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID28);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID28.toString(), "1818c350-4f4c-487c-ae85-5315948a26a2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot37);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus38 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus38.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID49);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID49.toString(), "e74b8bb5-2901-4d44-87a8-c1cb468ad992");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus59 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus59.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID70);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID70.toString(), "00d1844e-4c6b-4046-b601-b739434e4d53");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace5.getStatus();
        java.lang.Class<?> wildcardClass11 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = null;
        models.parkingLot.ParkingLot parkingLot13 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus14 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = new models.parkingSpace.ParkingSpace(uUID12, parkingLot13, parkingSpaceStatus14, "", false);
        java.lang.String str18 = parkingSpace17.toString();
        parkingSpace17.checkOut();
        boolean boolean20 = parkingSpace17.isEnabled();
        models.parkingLot.ParkingLot parkingLot21 = parkingSpace17.getLot();
        boolean boolean22 = parkingSpace5.equals((java.lang.Object) parkingLot21);
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        parkingSpace5.setStatus(parkingSpaceStatus31);
        java.lang.Class<?> wildcardClass33 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        boolean boolean9 = parkingSpace5.isEnabled();
        java.lang.Object obj10 = null;
        boolean boolean11 = parkingSpace5.equals(obj10);
        parkingSpace5.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean8 = parkingSpace5.isEnabled();
        models.parkingLot.ParkingLot parkingLot9 = parkingSpace5.getLot();
        parkingSpace5.checkOut();
        java.lang.String str11 = parkingSpace5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingLot.ParkingLot parkingLot23 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(parkingLot23, "hi!");
        parkingSpace25.setEnabled(true);
        java.util.UUID uUID28 = parkingSpace25.getID();
        models.parkingLot.ParkingLot parkingLot29 = null;
        java.util.UUID uUID30 = null;
        models.parkingLot.ParkingLot parkingLot31 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus32 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = new models.parkingSpace.ParkingSpace(uUID30, parkingLot31, parkingSpaceStatus32, "", false);
        java.lang.String str36 = parkingSpace35.toString();
        models.parkingLot.ParkingLot parkingLot37 = parkingSpace35.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus38 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace35.setStatus(parkingSpaceStatus38);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus38, "hi!", true);
        models.parkingLot.ParkingLot parkingLot43 = null;
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(parkingLot44, "hi!");
        parkingSpace46.setEnabled(true);
        java.util.UUID uUID49 = parkingSpace46.getID();
        models.parkingLot.ParkingLot parkingLot50 = null;
        java.util.UUID uUID51 = null;
        models.parkingLot.ParkingLot parkingLot52 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID51, parkingLot52, parkingSpaceStatus53, "", false);
        java.lang.String str57 = parkingSpace56.toString();
        models.parkingLot.ParkingLot parkingLot58 = parkingSpace56.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace56.setStatus(parkingSpaceStatus59);
        models.parkingSpace.ParkingSpace parkingSpace63 = new models.parkingSpace.ParkingSpace(uUID49, parkingLot50, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot43, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace69 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus59, "", true);
        java.util.UUID uUID70 = parkingSpace69.getID();
        models.parkingLot.ParkingLot parkingLot71 = null;
        java.util.UUID uUID72 = null;
        models.parkingLot.ParkingLot parkingLot73 = null;
        java.util.UUID uUID74 = null;
        models.parkingLot.ParkingLot parkingLot75 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus76 = null;
        models.parkingSpace.ParkingSpace parkingSpace79 = new models.parkingSpace.ParkingSpace(uUID74, parkingLot75, parkingSpaceStatus76, "", false);
        java.lang.String str80 = parkingSpace79.toString();
        parkingSpace79.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus82 = parkingSpace79.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace85 = new models.parkingSpace.ParkingSpace(uUID72, parkingLot73, parkingSpaceStatus82, "", true);
        models.parkingSpace.ParkingSpace parkingSpace88 = new models.parkingSpace.ParkingSpace(uUID70, parkingLot71, parkingSpaceStatus82, "", true);
        java.lang.String str89 = parkingSpace88.getName();
        boolean boolean91 = parkingSpace88.equals((java.lang.Object) (short) 1);
        java.lang.String str92 = parkingSpace88.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "8f5ae96d-5228-4d3f-854e-437824a821af");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID28);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID28.toString(), "f12ee754-8c4d-4969-81ad-28bc868fd6f5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot37);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus38 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus38.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID49);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID49.toString(), "4c5f33dd-7e52-422a-b0dc-7246f6cb5049");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus59 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus59.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID70);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID70.toString(), "8f5ae96d-5228-4d3f-854e-437824a821af");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus82 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus82.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "" + "'", str89.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "" + "'", str92.equals(""));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.checkOut();
        boolean boolean9 = parkingSpace5.isBookable();
        boolean boolean10 = parkingSpace5.isBookable();
        boolean boolean11 = parkingSpace5.isBookable();
        java.lang.Class<?> wildcardClass12 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingLot.ParkingLot parkingLot23 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(parkingLot23, "hi!");
        parkingSpace25.setEnabled(true);
        java.util.UUID uUID28 = parkingSpace25.getID();
        models.parkingLot.ParkingLot parkingLot29 = null;
        java.util.UUID uUID30 = null;
        models.parkingLot.ParkingLot parkingLot31 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus32 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = new models.parkingSpace.ParkingSpace(uUID30, parkingLot31, parkingSpaceStatus32, "", false);
        java.lang.String str36 = parkingSpace35.toString();
        models.parkingLot.ParkingLot parkingLot37 = parkingSpace35.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus38 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace35.setStatus(parkingSpaceStatus38);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus38, "hi!", true);
        models.parkingLot.ParkingLot parkingLot43 = null;
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(parkingLot44, "hi!");
        parkingSpace46.setEnabled(true);
        java.util.UUID uUID49 = parkingSpace46.getID();
        models.parkingLot.ParkingLot parkingLot50 = null;
        java.util.UUID uUID51 = null;
        models.parkingLot.ParkingLot parkingLot52 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID51, parkingLot52, parkingSpaceStatus53, "", false);
        java.lang.String str57 = parkingSpace56.toString();
        models.parkingLot.ParkingLot parkingLot58 = parkingSpace56.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace56.setStatus(parkingSpaceStatus59);
        models.parkingSpace.ParkingSpace parkingSpace63 = new models.parkingSpace.ParkingSpace(uUID49, parkingLot50, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot43, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace69 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus59, "", true);
        java.util.UUID uUID70 = parkingSpace69.getID();
        models.parkingLot.ParkingLot parkingLot71 = null;
        java.util.UUID uUID72 = null;
        models.parkingLot.ParkingLot parkingLot73 = null;
        java.util.UUID uUID74 = null;
        models.parkingLot.ParkingLot parkingLot75 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus76 = null;
        models.parkingSpace.ParkingSpace parkingSpace79 = new models.parkingSpace.ParkingSpace(uUID74, parkingLot75, parkingSpaceStatus76, "", false);
        java.lang.String str80 = parkingSpace79.toString();
        parkingSpace79.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus82 = parkingSpace79.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace85 = new models.parkingSpace.ParkingSpace(uUID72, parkingLot73, parkingSpaceStatus82, "", true);
        models.parkingSpace.ParkingSpace parkingSpace88 = new models.parkingSpace.ParkingSpace(uUID70, parkingLot71, parkingSpaceStatus82, "", true);
        java.lang.String str89 = parkingSpace88.getName();
        parkingSpace88.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "b34f3084-991c-4460-a5ca-386259aa4bcf");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID28);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID28.toString(), "fb38720a-0939-4b8b-ab65-f079826dc89a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot37);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus38 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus38.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID49);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID49.toString(), "d72e9142-6ab0-481d-b21f-d7492aa081aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus59 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus59.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID70);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID70.toString(), "b34f3084-991c-4460-a5ca-386259aa4bcf");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus82 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus82.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "" + "'", str89.equals(""));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingLot.ParkingLot parkingLot2 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = new models.parkingSpace.ParkingSpace(parkingLot2, "hi!");
        parkingSpace4.setEnabled(true);
        java.util.UUID uUID7 = parkingSpace4.getID();
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.UUID uUID9 = null;
        models.parkingLot.ParkingLot parkingLot10 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus11 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = new models.parkingSpace.ParkingSpace(uUID9, parkingLot10, parkingSpaceStatus11, "", false);
        java.lang.String str15 = parkingSpace14.toString();
        models.parkingLot.ParkingLot parkingLot16 = parkingSpace14.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus17 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace14.setStatus(parkingSpaceStatus17);
        models.parkingSpace.ParkingSpace parkingSpace21 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus17, "hi!", true);
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.UUID uUID25 = null;
        models.parkingLot.ParkingLot parkingLot26 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus27 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = new models.parkingSpace.ParkingSpace(uUID25, parkingLot26, parkingSpaceStatus27, "", false);
        java.lang.String str31 = parkingSpace30.toString();
        parkingSpace30.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus33 = parkingSpace30.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace36 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus33, "", true);
        models.parkingSpace.ParkingSpace parkingSpace39 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot22, parkingSpaceStatus33, "hi!", false);
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.UUID uUID41 = null;
        models.parkingLot.ParkingLot parkingLot42 = null;
        java.util.UUID uUID43 = null;
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus45 = null;
        models.parkingSpace.ParkingSpace parkingSpace48 = new models.parkingSpace.ParkingSpace(uUID43, parkingLot44, parkingSpaceStatus45, "", false);
        java.lang.String str49 = parkingSpace48.toString();
        parkingSpace48.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus51 = parkingSpace48.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace54 = new models.parkingSpace.ParkingSpace(uUID41, parkingLot42, parkingSpaceStatus51, "", true);
        models.parkingSpace.ParkingSpace parkingSpace57 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot40, parkingSpaceStatus51, "", true);
        models.parkingLot.ParkingLot parkingLot58 = null;
        java.util.UUID uUID59 = null;
        models.parkingLot.ParkingLot parkingLot60 = null;
        java.util.UUID uUID61 = null;
        models.parkingLot.ParkingLot parkingLot62 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus63 = null;
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(uUID61, parkingLot62, parkingSpaceStatus63, "", false);
        java.lang.String str67 = parkingSpace66.toString();
        parkingSpace66.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus69 = parkingSpace66.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace72 = new models.parkingSpace.ParkingSpace(uUID59, parkingLot60, parkingSpaceStatus69, "", true);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus73 = parkingSpace72.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace76 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot58, parkingSpaceStatus73, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace79 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus73, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "02c77884-e830-47f0-9839-1d690a69d95c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot16);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus17 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus17.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus33 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus33.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus51 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus51.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus69 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus69.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus73 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus73.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        boolean boolean10 = parkingSpace5.isEnabled();
        java.util.UUID uUID11 = null;
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.UUID uUID13 = null;
        models.parkingLot.ParkingLot parkingLot14 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(uUID13, parkingLot14, parkingSpaceStatus15, "", false);
        java.lang.String str19 = parkingSpace18.toString();
        parkingSpace18.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = parkingSpace18.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace24 = new models.parkingSpace.ParkingSpace(uUID11, parkingLot12, parkingSpaceStatus21, "", false);
        parkingSpace5.setStatus(parkingSpaceStatus21);
        java.util.UUID uUID26 = parkingSpace5.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus21 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus21.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID26);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean8 = parkingSpace5.isEnabled();
        java.lang.String str9 = parkingSpace5.toString();
        boolean boolean10 = parkingSpace5.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(false);
        parkingSpace5.setEnabled(true);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(true);
        models.parkingLot.ParkingLot parkingLot16 = parkingSpace5.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus13 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus13.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot16);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        java.util.UUID uUID11 = parkingSpace5.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        java.lang.Class<?> wildcardClass6 = uUID5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "7285a576-5dff-453d-bf05-2dcaf1ac808a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(false);
        parkingSpace5.setEnabled(true);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = parkingSpace5.getStatus();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace5.getLot();
        java.util.UUID uUID15 = null;
        models.parkingLot.ParkingLot parkingLot16 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus17 = null;
        models.parkingSpace.ParkingSpace parkingSpace20 = new models.parkingSpace.ParkingSpace(uUID15, parkingLot16, parkingSpaceStatus17, "", false);
        java.lang.String str21 = parkingSpace20.toString();
        parkingSpace20.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus23 = parkingSpace20.getStatus();
        boolean boolean24 = parkingSpace20.isEnabled();
        java.lang.Object obj25 = null;
        boolean boolean26 = parkingSpace20.equals(obj25);
        java.lang.String str27 = parkingSpace20.toString();
        boolean boolean28 = parkingSpace5.equals((java.lang.Object) str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus13 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus13.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus23 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus23.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", false);
        java.util.UUID uUID14 = parkingSpace13.getID();
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace13.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        parkingSpace5.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus14 = parkingSpace13.getStatus();
        boolean boolean15 = parkingSpace13.isBookable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus14 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus14.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(false);
        parkingSpace5.setEnabled(true);
        java.lang.String str13 = parkingSpace5.getName();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus14 = parkingSpace5.getStatus();
        boolean boolean15 = parkingSpace5.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus14 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus14.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus7 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        parkingSpace5.setStatus(parkingSpaceStatus7);
        java.lang.Class<?> wildcardClass9 = parkingSpaceStatus7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus7 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus7.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        java.lang.String str7 = parkingSpace5.getName();
        parkingSpace5.setEnabled(true);
        java.util.UUID uUID10 = parkingSpace5.getID();
        boolean boolean11 = parkingSpace5.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        java.lang.String str11 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = parkingSpace5.getStatus();
        java.util.UUID uUID14 = parkingSpace5.getID();
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus13 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus13.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        java.lang.String str6 = parkingSpace2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "9268b282-951b-4741-8e63-0ee1022cca7f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace13.getLot();
        parkingSpace13.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus7 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        parkingSpace5.setStatus(parkingSpaceStatus7);
        java.util.UUID uUID9 = parkingSpace5.getID();
        models.parkingLot.ParkingLot parkingLot10 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(parkingLot10, "hi!");
        parkingSpace12.setEnabled(true);
        java.util.UUID uUID15 = parkingSpace12.getID();
        models.parkingLot.ParkingLot parkingLot16 = null;
        java.util.UUID uUID17 = null;
        models.parkingLot.ParkingLot parkingLot18 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus19 = null;
        models.parkingSpace.ParkingSpace parkingSpace22 = new models.parkingSpace.ParkingSpace(uUID17, parkingLot18, parkingSpaceStatus19, "", false);
        java.lang.String str23 = parkingSpace22.toString();
        models.parkingLot.ParkingLot parkingLot24 = parkingSpace22.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace22.setStatus(parkingSpaceStatus25);
        models.parkingSpace.ParkingSpace parkingSpace29 = new models.parkingSpace.ParkingSpace(uUID15, parkingLot16, parkingSpaceStatus25, "hi!", true);
        models.parkingLot.ParkingLot parkingLot30 = null;
        java.util.UUID uUID31 = null;
        models.parkingLot.ParkingLot parkingLot32 = null;
        java.util.UUID uUID33 = null;
        models.parkingLot.ParkingLot parkingLot34 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus35 = null;
        models.parkingSpace.ParkingSpace parkingSpace38 = new models.parkingSpace.ParkingSpace(uUID33, parkingLot34, parkingSpaceStatus35, "", false);
        java.lang.String str39 = parkingSpace38.toString();
        parkingSpace38.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus41 = parkingSpace38.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace44 = new models.parkingSpace.ParkingSpace(uUID31, parkingLot32, parkingSpaceStatus41, "", true);
        models.parkingSpace.ParkingSpace parkingSpace47 = new models.parkingSpace.ParkingSpace(uUID15, parkingLot30, parkingSpaceStatus41, "hi!", false);
        models.parkingLot.ParkingLot parkingLot48 = null;
        java.util.UUID uUID49 = null;
        models.parkingLot.ParkingLot parkingLot50 = null;
        java.util.UUID uUID51 = null;
        models.parkingLot.ParkingLot parkingLot52 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID51, parkingLot52, parkingSpaceStatus53, "", false);
        java.lang.String str57 = parkingSpace56.toString();
        parkingSpace56.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = parkingSpace56.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace62 = new models.parkingSpace.ParkingSpace(uUID49, parkingLot50, parkingSpaceStatus59, "", true);
        models.parkingSpace.ParkingSpace parkingSpace65 = new models.parkingSpace.ParkingSpace(uUID15, parkingLot48, parkingSpaceStatus59, "", true);
        models.parkingLot.ParkingLot parkingLot66 = null;
        java.util.UUID uUID67 = null;
        models.parkingLot.ParkingLot parkingLot68 = null;
        java.util.UUID uUID69 = null;
        models.parkingLot.ParkingLot parkingLot70 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus71 = null;
        models.parkingSpace.ParkingSpace parkingSpace74 = new models.parkingSpace.ParkingSpace(uUID69, parkingLot70, parkingSpaceStatus71, "", false);
        java.lang.String str75 = parkingSpace74.toString();
        parkingSpace74.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus77 = parkingSpace74.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace80 = new models.parkingSpace.ParkingSpace(uUID67, parkingLot68, parkingSpaceStatus77, "", true);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus81 = parkingSpace80.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace84 = new models.parkingSpace.ParkingSpace(uUID15, parkingLot66, parkingSpaceStatus81, "hi!", true);
        parkingSpace5.setStatus(parkingSpaceStatus81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus7 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus7.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID15.toString(), "7b05560c-fc71-4673-9ef0-bf6ce1af44ec");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot24);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus25 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus25.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus41 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus41.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus59 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus59.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "" + "'", str75.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus77 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus77.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus81 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus81.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        models.parkingLot.ParkingLot parkingLot6 = null;
        models.parkingSpace.ParkingSpace parkingSpace8 = new models.parkingSpace.ParkingSpace(parkingLot6, "hi!");
        parkingSpace8.setEnabled(true);
        java.util.UUID uUID11 = parkingSpace8.getID();
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.UUID uUID13 = null;
        models.parkingLot.ParkingLot parkingLot14 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(uUID13, parkingLot14, parkingSpaceStatus15, "", false);
        java.lang.String str19 = parkingSpace18.toString();
        models.parkingLot.ParkingLot parkingLot20 = parkingSpace18.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace18.setStatus(parkingSpaceStatus21);
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(uUID11, parkingLot12, parkingSpaceStatus21, "hi!", true);
        models.parkingLot.ParkingLot parkingLot26 = null;
        java.util.UUID uUID27 = null;
        models.parkingLot.ParkingLot parkingLot28 = null;
        java.util.UUID uUID29 = null;
        models.parkingLot.ParkingLot parkingLot30 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = null;
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID29, parkingLot30, parkingSpaceStatus31, "", false);
        java.lang.String str35 = parkingSpace34.toString();
        parkingSpace34.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus37 = parkingSpace34.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace40 = new models.parkingSpace.ParkingSpace(uUID27, parkingLot28, parkingSpaceStatus37, "", true);
        models.parkingSpace.ParkingSpace parkingSpace43 = new models.parkingSpace.ParkingSpace(uUID11, parkingLot26, parkingSpaceStatus37, "hi!", false);
        models.parkingLot.ParkingLot parkingLot44 = null;
        java.util.UUID uUID45 = null;
        models.parkingLot.ParkingLot parkingLot46 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus47 = null;
        models.parkingSpace.ParkingSpace parkingSpace50 = new models.parkingSpace.ParkingSpace(uUID45, parkingLot46, parkingSpaceStatus47, "", false);
        java.lang.String str51 = parkingSpace50.toString();
        parkingSpace50.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = parkingSpace50.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID11, parkingLot44, parkingSpaceStatus53, "", true);
        parkingSpace56.setEnabled(true);
        boolean boolean59 = parkingSpace2.equals((java.lang.Object) parkingSpace56);
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID62 = null;
        models.parkingLot.ParkingLot parkingLot63 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus64 = null;
        models.parkingSpace.ParkingSpace parkingSpace67 = new models.parkingSpace.ParkingSpace(uUID62, parkingLot63, parkingSpaceStatus64, "", false);
        java.lang.String str68 = parkingSpace67.toString();
        models.parkingLot.ParkingLot parkingLot69 = parkingSpace67.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus70 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace67.setStatus(parkingSpaceStatus70);
        parkingSpace2.setStatus(parkingSpaceStatus70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID11);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID11.toString(), "e4df17ee-f7af-4d9d-8624-0de67932e20d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot20);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus21 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus21.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus37 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus37.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus53 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus53.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "" + "'", str68.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot69);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus70 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus70.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus14 = parkingSpace13.getStatus();
        java.lang.Object obj15 = null;
        boolean boolean16 = parkingSpace13.equals(obj15);
        boolean boolean17 = parkingSpace13.isBookable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus14 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus14.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace13.getLot();
        boolean boolean15 = parkingSpace13.isBookable();
        models.parkingLot.ParkingLot parkingLot16 = parkingSpace13.getLot();
        boolean boolean17 = parkingSpace13.isBookable();
        java.lang.String str18 = parkingSpace13.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean8 = parkingSpace5.isEnabled();
        boolean boolean9 = parkingSpace5.isBookable();
        parkingSpace5.checkOut();
        java.util.UUID uUID11 = parkingSpace5.getID();
        models.parkingLot.ParkingLot parkingLot12 = parkingSpace5.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean8 = parkingSpace5.isEnabled();
        models.parkingLot.ParkingLot parkingLot9 = parkingSpace5.getLot();
        boolean boolean10 = parkingSpace5.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace13.getLot();
        parkingSpace13.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        parkingSpace5.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        boolean boolean20 = parkingSpace19.isEnabled();
        parkingSpace19.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "8744d6cd-d759-4c1f-a667-7f803eeb28a8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = null;
        models.parkingLot.ParkingLot parkingLot13 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus14 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = new models.parkingSpace.ParkingSpace(uUID12, parkingLot13, parkingSpaceStatus14, "", false);
        java.lang.String str18 = parkingSpace17.toString();
        parkingSpace17.checkOut();
        boolean boolean20 = parkingSpace17.isEnabled();
        models.parkingLot.ParkingLot parkingLot21 = parkingSpace17.getLot();
        boolean boolean22 = parkingSpace5.equals((java.lang.Object) parkingLot21);
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        parkingSpace5.setStatus(parkingSpaceStatus31);
        java.lang.String str33 = parkingSpace5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.checkOut();
        boolean boolean9 = parkingSpace5.isBookable();
        java.lang.Class<?> wildcardClass10 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        models.parkingSpace.ParkingSpace parkingSpace24 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus21, "hi!", false);
        parkingSpace24.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "5b8e7af2-e5e6-4b9b-9fa2-ad11c5259e7d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus21 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus21.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        parkingSpace5.checkOut();
        boolean boolean11 = parkingSpace5.isBookable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus7 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        parkingSpace5.setStatus(parkingSpaceStatus7);
        java.util.UUID uUID9 = parkingSpace5.getID();
        java.lang.String str10 = parkingSpace5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus7 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus7.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace5.getStatus();
        java.util.UUID uUID17 = null;
        models.parkingLot.ParkingLot parkingLot18 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus19 = null;
        models.parkingSpace.ParkingSpace parkingSpace22 = new models.parkingSpace.ParkingSpace(uUID17, parkingLot18, parkingSpaceStatus19, "", false);
        java.lang.String str23 = parkingSpace22.toString();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus24 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        parkingSpace22.setStatus(parkingSpaceStatus24);
        boolean boolean26 = parkingSpace5.equals((java.lang.Object) parkingSpace22);
        parkingSpace22.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus24 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus24.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(false);
        parkingSpace5.setEnabled(true);
        parkingSpace5.setEnabled(true);
        java.lang.Class<?> wildcardClass15 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        models.parkingLot.ParkingLot parkingLot9 = parkingSpace7.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace7.setStatus(parkingSpaceStatus10);
        models.parkingSpace.ParkingSpace parkingSpace14 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "hi!", true);
        java.util.UUID uUID15 = null;
        models.parkingLot.ParkingLot parkingLot16 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus17 = null;
        models.parkingSpace.ParkingSpace parkingSpace20 = new models.parkingSpace.ParkingSpace(uUID15, parkingLot16, parkingSpaceStatus17, "", false);
        java.lang.String str21 = parkingSpace20.toString();
        parkingSpace20.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus23 = parkingSpace20.getStatus();
        boolean boolean25 = parkingSpace20.equals((java.lang.Object) 1.0f);
        models.parkingLot.ParkingLot parkingLot26 = parkingSpace20.getLot();
        boolean boolean27 = parkingSpace14.equals((java.lang.Object) parkingSpace20);
        java.lang.String str28 = parkingSpace14.getName();
        java.util.UUID uUID29 = parkingSpace14.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot9);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus23 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus23.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID29);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus11 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        boolean boolean12 = parkingSpace5.equals((java.lang.Object) parkingSpaceStatus11);
        java.lang.Class<?> wildcardClass13 = parkingSpaceStatus11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus11 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus11.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingLot.ParkingLot parkingLot2 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = new models.parkingSpace.ParkingSpace(parkingLot2, "hi!");
        parkingSpace4.setEnabled(true);
        java.util.UUID uUID7 = parkingSpace4.getID();
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.UUID uUID9 = null;
        models.parkingLot.ParkingLot parkingLot10 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus11 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = new models.parkingSpace.ParkingSpace(uUID9, parkingLot10, parkingSpaceStatus11, "", false);
        java.lang.String str15 = parkingSpace14.toString();
        models.parkingLot.ParkingLot parkingLot16 = parkingSpace14.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus17 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace14.setStatus(parkingSpaceStatus17);
        models.parkingSpace.ParkingSpace parkingSpace21 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus17, "hi!", true);
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.UUID uUID25 = null;
        models.parkingLot.ParkingLot parkingLot26 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus27 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = new models.parkingSpace.ParkingSpace(uUID25, parkingLot26, parkingSpaceStatus27, "", false);
        java.lang.String str31 = parkingSpace30.toString();
        parkingSpace30.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus33 = parkingSpace30.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace36 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus33, "", true);
        models.parkingSpace.ParkingSpace parkingSpace39 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot22, parkingSpaceStatus33, "hi!", false);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus33, "hi!", true);
        parkingSpace42.setEnabled(true);
        models.parkingLot.ParkingLot parkingLot45 = parkingSpace42.getLot();
        boolean boolean46 = parkingSpace42.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "f3c82ea9-c55f-49a6-8cde-bb27a8b689cd");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot16);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus17 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus17.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus33 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus33.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace13.getLot();
        boolean boolean15 = parkingSpace13.isBookable();
        models.parkingLot.ParkingLot parkingLot16 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(parkingLot16, "hi!");
        boolean boolean19 = parkingSpace13.equals((java.lang.Object) parkingSpace18);
        boolean boolean20 = parkingSpace13.isEnabled();
        parkingSpace13.setEnabled(false);
        java.lang.Class<?> wildcardClass23 = parkingSpace13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        models.parkingLot.ParkingLot parkingLot9 = parkingSpace7.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace7.setStatus(parkingSpaceStatus10);
        models.parkingSpace.ParkingSpace parkingSpace14 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "hi!", true);
        java.util.UUID uUID15 = null;
        models.parkingLot.ParkingLot parkingLot16 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus17 = null;
        models.parkingSpace.ParkingSpace parkingSpace20 = new models.parkingSpace.ParkingSpace(uUID15, parkingLot16, parkingSpaceStatus17, "", false);
        java.lang.String str21 = parkingSpace20.toString();
        parkingSpace20.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus23 = parkingSpace20.getStatus();
        boolean boolean25 = parkingSpace20.equals((java.lang.Object) 1.0f);
        models.parkingLot.ParkingLot parkingLot26 = parkingSpace20.getLot();
        boolean boolean27 = parkingSpace14.equals((java.lang.Object) parkingSpace20);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus28 = parkingSpace14.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot9);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus23 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus23.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus28 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus28.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        java.lang.Class<?> wildcardClass7 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        boolean boolean12 = parkingSpace5.isBookable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean8 = parkingSpace5.isEnabled();
        java.lang.String str9 = parkingSpace5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        boolean boolean9 = parkingSpace5.isEnabled();
        java.lang.Object obj10 = null;
        boolean boolean11 = parkingSpace5.equals(obj10);
        java.lang.String str12 = parkingSpace5.toString();
        java.util.UUID uUID13 = null;
        models.parkingLot.ParkingLot parkingLot14 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(uUID13, parkingLot14, parkingSpaceStatus15, "", false);
        java.lang.String str19 = parkingSpace18.toString();
        models.parkingLot.ParkingLot parkingLot20 = parkingSpace18.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace18.setStatus(parkingSpaceStatus21);
        boolean boolean23 = parkingSpace18.isEnabled();
        models.parkingLot.ParkingLot parkingLot24 = parkingSpace18.getLot();
        boolean boolean25 = parkingSpace18.isEnabled();
        java.lang.String str26 = parkingSpace18.toString();
        boolean boolean27 = parkingSpace5.equals((java.lang.Object) parkingSpace18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot20);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus21 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus21.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingLot.ParkingLot parkingLot21 = null;
        models.parkingSpace.ParkingSpace parkingSpace23 = new models.parkingSpace.ParkingSpace(parkingLot21, "hi!");
        parkingSpace23.setEnabled(true);
        java.util.UUID uUID26 = parkingSpace23.getID();
        models.parkingLot.ParkingLot parkingLot27 = null;
        java.util.UUID uUID28 = null;
        models.parkingLot.ParkingLot parkingLot29 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus30 = null;
        models.parkingSpace.ParkingSpace parkingSpace33 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus30, "", false);
        java.lang.String str34 = parkingSpace33.toString();
        models.parkingLot.ParkingLot parkingLot35 = parkingSpace33.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus36 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace33.setStatus(parkingSpaceStatus36);
        models.parkingSpace.ParkingSpace parkingSpace40 = new models.parkingSpace.ParkingSpace(uUID26, parkingLot27, parkingSpaceStatus36, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace43 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus36, "hi!", true);
        models.parkingLot.ParkingLot parkingLot44 = parkingSpace43.getLot();
        parkingSpace43.checkOut();
        java.util.UUID uUID46 = null;
        models.parkingLot.ParkingLot parkingLot47 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus48 = null;
        models.parkingSpace.ParkingSpace parkingSpace51 = new models.parkingSpace.ParkingSpace(uUID46, parkingLot47, parkingSpaceStatus48, "", false);
        java.lang.String str52 = parkingSpace51.toString();
        models.parkingLot.ParkingLot parkingLot53 = parkingSpace51.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus54 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace51.setStatus(parkingSpaceStatus54);
        boolean boolean56 = parkingSpace51.isEnabled();
        models.parkingLot.ParkingLot parkingLot57 = parkingSpace51.getLot();
        boolean boolean58 = parkingSpace51.isEnabled();
        java.lang.String str59 = parkingSpace51.toString();
        boolean boolean60 = parkingSpace43.equals((java.lang.Object) parkingSpace51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "13a621a4-467c-4ef0-80b9-f8bbdda7d157");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID26);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID26.toString(), "e17a49c3-eb2b-4631-b905-3f8f6064d905");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot35);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus36 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus36.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot53);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus54 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus54.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        java.lang.String str11 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean13 = parkingSpace5.isBookable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.setEnabled(false);
        java.util.UUID uUID9 = parkingSpace5.getID();
        java.util.UUID uUID10 = null;
        models.parkingLot.ParkingLot parkingLot11 = null;
        java.util.UUID uUID12 = null;
        models.parkingLot.ParkingLot parkingLot13 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus14 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = new models.parkingSpace.ParkingSpace(uUID12, parkingLot13, parkingSpaceStatus14, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus18 = null;
        parkingSpace17.setStatus(parkingSpaceStatus18);
        parkingSpace17.setEnabled(true);
        boolean boolean22 = parkingSpace17.isEnabled();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus23 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        boolean boolean24 = parkingSpace17.equals((java.lang.Object) parkingSpaceStatus23);
        models.parkingSpace.ParkingSpace parkingSpace27 = new models.parkingSpace.ParkingSpace(uUID10, parkingLot11, parkingSpaceStatus23, "", true);
        boolean boolean28 = parkingSpace5.equals((java.lang.Object) parkingLot11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus23 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus23.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace5.getStatus();
        java.util.UUID uUID17 = null;
        models.parkingLot.ParkingLot parkingLot18 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus19 = null;
        models.parkingSpace.ParkingSpace parkingSpace22 = new models.parkingSpace.ParkingSpace(uUID17, parkingLot18, parkingSpaceStatus19, "", false);
        java.lang.String str23 = parkingSpace22.toString();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus24 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        parkingSpace22.setStatus(parkingSpaceStatus24);
        boolean boolean26 = parkingSpace5.equals((java.lang.Object) parkingSpace22);
        boolean boolean27 = parkingSpace5.isBookable();
        java.util.UUID uUID28 = null;
        models.parkingLot.ParkingLot parkingLot29 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus30 = null;
        models.parkingSpace.ParkingSpace parkingSpace33 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus30, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus34 = null;
        parkingSpace33.setStatus(parkingSpaceStatus34);
        parkingSpace33.setEnabled(true);
        boolean boolean38 = parkingSpace33.isEnabled();
        parkingSpace33.checkOut();
        java.util.UUID uUID40 = parkingSpace33.getID();
        parkingSpace33.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot43 = parkingSpace33.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus44 = parkingSpace33.getStatus();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus45 = parkingSpace33.getStatus();
        boolean boolean46 = parkingSpace5.equals((java.lang.Object) parkingSpace33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus24 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus24.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot43);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus44 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus44.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus45 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus45.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        boolean boolean22 = parkingSpace2.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "f6a86a87-b8d8-4475-8ed5-cc68a668d533");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        boolean boolean9 = parkingSpace5.isEnabled();
        java.lang.Object obj10 = null;
        boolean boolean11 = parkingSpace5.equals(obj10);
        java.lang.String str12 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot13 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = new models.parkingSpace.ParkingSpace(parkingLot13, "hi!");
        parkingSpace15.setEnabled(true);
        java.util.UUID uUID18 = parkingSpace15.getID();
        models.parkingLot.ParkingLot parkingLot19 = null;
        java.util.UUID uUID20 = null;
        models.parkingLot.ParkingLot parkingLot21 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus22 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(uUID20, parkingLot21, parkingSpaceStatus22, "", false);
        java.lang.String str26 = parkingSpace25.toString();
        models.parkingLot.ParkingLot parkingLot27 = parkingSpace25.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus28 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace25.setStatus(parkingSpaceStatus28);
        models.parkingSpace.ParkingSpace parkingSpace32 = new models.parkingSpace.ParkingSpace(uUID18, parkingLot19, parkingSpaceStatus28, "hi!", true);
        models.parkingLot.ParkingLot parkingLot33 = null;
        java.util.UUID uUID34 = null;
        models.parkingLot.ParkingLot parkingLot35 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus36 = null;
        models.parkingSpace.ParkingSpace parkingSpace39 = new models.parkingSpace.ParkingSpace(uUID34, parkingLot35, parkingSpaceStatus36, "", false);
        java.lang.String str40 = parkingSpace39.toString();
        parkingSpace39.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus42 = parkingSpace39.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace45 = new models.parkingSpace.ParkingSpace(uUID18, parkingLot33, parkingSpaceStatus42, "hi!", false);
        parkingSpace5.setStatus(parkingSpaceStatus42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID18);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID18.toString(), "6dc37bd3-2450-4307-a26f-6abe5bc2e27e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot27);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus28 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus28.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus42 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus42.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        boolean boolean9 = parkingSpace5.isEnabled();
        java.util.UUID uUID10 = null;
        models.parkingLot.ParkingLot parkingLot11 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus12 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = new models.parkingSpace.ParkingSpace(uUID10, parkingLot11, parkingSpaceStatus12, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = null;
        parkingSpace15.setStatus(parkingSpaceStatus16);
        parkingSpace15.setEnabled(true);
        boolean boolean20 = parkingSpace15.isEnabled();
        parkingSpace15.checkOut();
        java.util.UUID uUID22 = parkingSpace15.getID();
        boolean boolean23 = parkingSpace5.equals((java.lang.Object) uUID22);
        boolean boolean24 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "");
        java.util.UUID uUID3 = null;
        models.parkingLot.ParkingLot parkingLot4 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus5 = null;
        models.parkingSpace.ParkingSpace parkingSpace8 = new models.parkingSpace.ParkingSpace(uUID3, parkingLot4, parkingSpaceStatus5, "", false);
        java.lang.String str9 = parkingSpace8.toString();
        parkingSpace8.checkOut();
        boolean boolean11 = parkingSpace8.isEnabled();
        java.lang.String str12 = parkingSpace8.toString();
        boolean boolean13 = parkingSpace2.equals((java.lang.Object) str12);
        models.parkingLot.ParkingLot parkingLot14 = null;
        models.parkingSpace.ParkingSpace parkingSpace16 = new models.parkingSpace.ParkingSpace(parkingLot14, "hi!");
        parkingSpace16.setEnabled(true);
        java.util.UUID uUID19 = null;
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = null;
        models.parkingSpace.ParkingSpace parkingSpace24 = new models.parkingSpace.ParkingSpace(uUID19, parkingLot20, parkingSpaceStatus21, "", false);
        java.lang.String str25 = parkingSpace24.toString();
        models.parkingLot.ParkingLot parkingLot26 = parkingSpace24.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus27 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace24.setStatus(parkingSpaceStatus27);
        parkingSpace16.setStatus(parkingSpaceStatus27);
        models.parkingLot.ParkingLot parkingLot30 = parkingSpace16.getLot();
        boolean boolean31 = parkingSpace16.isBookable();
        boolean boolean32 = parkingSpace2.equals((java.lang.Object) parkingSpace16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot26);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus27 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus27.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = parkingSpace2.getStatus();
        boolean boolean22 = parkingSpace2.isBookable();
        models.parkingLot.ParkingLot parkingLot23 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(parkingLot23, "hi!");
        parkingSpace25.setEnabled(true);
        java.lang.String str28 = parkingSpace25.getName();
        models.parkingLot.ParkingLot parkingLot29 = null;
        models.parkingSpace.ParkingSpace parkingSpace31 = new models.parkingSpace.ParkingSpace(parkingLot29, "hi!");
        parkingSpace31.setEnabled(true);
        java.util.UUID uUID34 = null;
        models.parkingLot.ParkingLot parkingLot35 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus36 = null;
        models.parkingSpace.ParkingSpace parkingSpace39 = new models.parkingSpace.ParkingSpace(uUID34, parkingLot35, parkingSpaceStatus36, "", false);
        java.lang.String str40 = parkingSpace39.toString();
        models.parkingLot.ParkingLot parkingLot41 = parkingSpace39.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus42 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace39.setStatus(parkingSpaceStatus42);
        parkingSpace31.setStatus(parkingSpaceStatus42);
        parkingSpace25.setStatus(parkingSpaceStatus42);
        parkingSpace2.setStatus(parkingSpaceStatus42);
        boolean boolean47 = parkingSpace2.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus21 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus21.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot41);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus42 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus42.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace13.getLot();
        boolean boolean15 = parkingSpace13.isBookable();
        models.parkingLot.ParkingLot parkingLot16 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(parkingLot16, "hi!");
        boolean boolean19 = parkingSpace13.equals((java.lang.Object) parkingSpace18);
        models.parkingLot.ParkingLot parkingLot20 = parkingSpace13.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = parkingSpace13.getStatus();
        parkingSpace13.checkOut();
        boolean boolean23 = parkingSpace13.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot20);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus21 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus21.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        boolean boolean9 = parkingSpace5.isEnabled();
        java.lang.Object obj10 = null;
        boolean boolean11 = parkingSpace5.equals(obj10);
        java.lang.String str12 = parkingSpace5.toString();
        java.util.UUID uUID13 = null;
        models.parkingLot.ParkingLot parkingLot14 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(uUID13, parkingLot14, parkingSpaceStatus15, "", false);
        java.lang.String str19 = parkingSpace18.toString();
        parkingSpace18.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = parkingSpace18.getStatus();
        parkingSpace5.setStatus(parkingSpaceStatus21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus21 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus21.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        boolean boolean10 = parkingSpace5.equals((java.lang.Object) 1.0f);
        parkingSpace5.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace13.getLot();
        boolean boolean15 = parkingSpace13.isBookable();
        models.parkingLot.ParkingLot parkingLot16 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(parkingLot16, "hi!");
        boolean boolean19 = parkingSpace13.equals((java.lang.Object) parkingSpace18);
        boolean boolean20 = parkingSpace13.isEnabled();
        parkingSpace13.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingLot.ParkingLot parkingLot6 = parkingSpace5.getLot();
        java.lang.Class<?> wildcardClass7 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(false);
        parkingSpace5.setEnabled(true);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = parkingSpace5.getStatus();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = parkingSpace5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus13 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus13.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace13.getLot();
        boolean boolean15 = parkingSpace13.isBookable();
        models.parkingLot.ParkingLot parkingLot16 = parkingSpace13.getLot();
        boolean boolean17 = parkingSpace13.isBookable();
        models.parkingLot.ParkingLot parkingLot18 = parkingSpace13.getLot();
        models.parkingLot.ParkingLot parkingLot19 = null;
        models.parkingSpace.ParkingSpace parkingSpace21 = new models.parkingSpace.ParkingSpace(parkingLot19, "hi!");
        parkingSpace21.setEnabled(true);
        java.lang.String str24 = parkingSpace21.getName();
        java.util.UUID uUID25 = null;
        models.parkingLot.ParkingLot parkingLot26 = null;
        java.util.UUID uUID27 = null;
        models.parkingLot.ParkingLot parkingLot28 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus29 = null;
        models.parkingSpace.ParkingSpace parkingSpace32 = new models.parkingSpace.ParkingSpace(uUID27, parkingLot28, parkingSpaceStatus29, "", false);
        java.lang.String str33 = parkingSpace32.toString();
        parkingSpace32.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus35 = parkingSpace32.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace38 = new models.parkingSpace.ParkingSpace(uUID25, parkingLot26, parkingSpaceStatus35, "", false);
        parkingSpace21.setStatus(parkingSpaceStatus35);
        java.util.UUID uUID40 = parkingSpace21.getID();
        boolean boolean41 = parkingSpace21.isBookable();
        boolean boolean42 = parkingSpace13.equals((java.lang.Object) boolean41);
        parkingSpace13.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus35 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus35.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID40);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID40.toString(), "5be2f668-5cc7-47f0-a093-e10b46a57d3e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.checkOut();
        parkingSpace5.checkOut();
        java.lang.String str10 = parkingSpace5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace5.getStatus();
        java.util.UUID uUID17 = null;
        models.parkingLot.ParkingLot parkingLot18 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus19 = null;
        models.parkingSpace.ParkingSpace parkingSpace22 = new models.parkingSpace.ParkingSpace(uUID17, parkingLot18, parkingSpaceStatus19, "", false);
        java.lang.String str23 = parkingSpace22.toString();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus24 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        parkingSpace22.setStatus(parkingSpaceStatus24);
        boolean boolean26 = parkingSpace5.equals((java.lang.Object) parkingSpace22);
        java.util.UUID uUID27 = parkingSpace22.getID();
        models.parkingLot.ParkingLot parkingLot28 = parkingSpace22.getLot();
        boolean boolean29 = parkingSpace22.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus24 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus24.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", false);
        parkingSpace13.checkOut();
        java.util.UUID uUID15 = null;
        models.parkingLot.ParkingLot parkingLot16 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus17 = null;
        models.parkingSpace.ParkingSpace parkingSpace20 = new models.parkingSpace.ParkingSpace(uUID15, parkingLot16, parkingSpaceStatus17, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = null;
        parkingSpace20.setStatus(parkingSpaceStatus21);
        parkingSpace20.setEnabled(true);
        boolean boolean25 = parkingSpace20.isEnabled();
        parkingSpace20.checkOut();
        java.util.UUID uUID27 = parkingSpace20.getID();
        parkingSpace20.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot30 = parkingSpace20.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace20.getStatus();
        java.util.UUID uUID32 = null;
        models.parkingLot.ParkingLot parkingLot33 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus34 = null;
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID32, parkingLot33, parkingSpaceStatus34, "", false);
        java.lang.String str38 = parkingSpace37.toString();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus39 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        parkingSpace37.setStatus(parkingSpaceStatus39);
        boolean boolean41 = parkingSpace20.equals((java.lang.Object) parkingSpace37);
        boolean boolean42 = parkingSpace13.equals((java.lang.Object) parkingSpace37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot30);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus39 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus39.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean8 = parkingSpace5.isEnabled();
        boolean boolean9 = parkingSpace5.isBookable();
        java.util.UUID uUID10 = parkingSpace5.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace13.getLot();
        java.util.UUID uUID15 = parkingSpace13.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID15);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace13.getLot();
        boolean boolean15 = parkingSpace13.isBookable();
        models.parkingLot.ParkingLot parkingLot16 = parkingSpace13.getLot();
        java.lang.String str17 = parkingSpace13.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingLot.ParkingLot parkingLot23 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(parkingLot23, "hi!");
        parkingSpace25.setEnabled(true);
        java.util.UUID uUID28 = parkingSpace25.getID();
        models.parkingLot.ParkingLot parkingLot29 = null;
        java.util.UUID uUID30 = null;
        models.parkingLot.ParkingLot parkingLot31 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus32 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = new models.parkingSpace.ParkingSpace(uUID30, parkingLot31, parkingSpaceStatus32, "", false);
        java.lang.String str36 = parkingSpace35.toString();
        models.parkingLot.ParkingLot parkingLot37 = parkingSpace35.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus38 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace35.setStatus(parkingSpaceStatus38);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus38, "hi!", true);
        models.parkingLot.ParkingLot parkingLot43 = null;
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(parkingLot44, "hi!");
        parkingSpace46.setEnabled(true);
        java.util.UUID uUID49 = parkingSpace46.getID();
        models.parkingLot.ParkingLot parkingLot50 = null;
        java.util.UUID uUID51 = null;
        models.parkingLot.ParkingLot parkingLot52 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID51, parkingLot52, parkingSpaceStatus53, "", false);
        java.lang.String str57 = parkingSpace56.toString();
        models.parkingLot.ParkingLot parkingLot58 = parkingSpace56.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace56.setStatus(parkingSpaceStatus59);
        models.parkingSpace.ParkingSpace parkingSpace63 = new models.parkingSpace.ParkingSpace(uUID49, parkingLot50, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot43, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace69 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus59, "", true);
        java.util.UUID uUID70 = parkingSpace69.getID();
        models.parkingLot.ParkingLot parkingLot71 = null;
        java.util.UUID uUID72 = null;
        models.parkingLot.ParkingLot parkingLot73 = null;
        java.util.UUID uUID74 = null;
        models.parkingLot.ParkingLot parkingLot75 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus76 = null;
        models.parkingSpace.ParkingSpace parkingSpace79 = new models.parkingSpace.ParkingSpace(uUID74, parkingLot75, parkingSpaceStatus76, "", false);
        java.lang.String str80 = parkingSpace79.toString();
        parkingSpace79.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus82 = parkingSpace79.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace85 = new models.parkingSpace.ParkingSpace(uUID72, parkingLot73, parkingSpaceStatus82, "", true);
        models.parkingSpace.ParkingSpace parkingSpace88 = new models.parkingSpace.ParkingSpace(uUID70, parkingLot71, parkingSpaceStatus82, "", true);
        java.lang.String str89 = parkingSpace88.getName();
        boolean boolean90 = parkingSpace88.isBookable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "d5c8952c-22f1-4e44-866a-0b70aee5c7a7");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID28);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID28.toString(), "d28cf2a0-a58e-4e2b-b663-faabe6537e2a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot37);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus38 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus38.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID49);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID49.toString(), "e0bc2910-c88f-4691-9c65-c216be995e34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus59 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus59.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID70);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID70.toString(), "d5c8952c-22f1-4e44-866a-0b70aee5c7a7");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus82 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus82.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "" + "'", str89.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.checkOut();
        boolean boolean9 = parkingSpace5.isBookable();
        boolean boolean10 = parkingSpace5.isBookable();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus11 = parkingSpace5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus11 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus11.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        models.parkingLot.ParkingLot parkingLot6 = null;
        models.parkingSpace.ParkingSpace parkingSpace8 = new models.parkingSpace.ParkingSpace(parkingLot6, "hi!");
        parkingSpace8.setEnabled(true);
        java.util.UUID uUID11 = parkingSpace8.getID();
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.UUID uUID13 = null;
        models.parkingLot.ParkingLot parkingLot14 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(uUID13, parkingLot14, parkingSpaceStatus15, "", false);
        java.lang.String str19 = parkingSpace18.toString();
        models.parkingLot.ParkingLot parkingLot20 = parkingSpace18.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace18.setStatus(parkingSpaceStatus21);
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(uUID11, parkingLot12, parkingSpaceStatus21, "hi!", true);
        models.parkingLot.ParkingLot parkingLot26 = null;
        java.util.UUID uUID27 = null;
        models.parkingLot.ParkingLot parkingLot28 = null;
        java.util.UUID uUID29 = null;
        models.parkingLot.ParkingLot parkingLot30 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = null;
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID29, parkingLot30, parkingSpaceStatus31, "", false);
        java.lang.String str35 = parkingSpace34.toString();
        parkingSpace34.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus37 = parkingSpace34.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace40 = new models.parkingSpace.ParkingSpace(uUID27, parkingLot28, parkingSpaceStatus37, "", true);
        models.parkingSpace.ParkingSpace parkingSpace43 = new models.parkingSpace.ParkingSpace(uUID11, parkingLot26, parkingSpaceStatus37, "hi!", false);
        models.parkingLot.ParkingLot parkingLot44 = null;
        java.util.UUID uUID45 = null;
        models.parkingLot.ParkingLot parkingLot46 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus47 = null;
        models.parkingSpace.ParkingSpace parkingSpace50 = new models.parkingSpace.ParkingSpace(uUID45, parkingLot46, parkingSpaceStatus47, "", false);
        java.lang.String str51 = parkingSpace50.toString();
        parkingSpace50.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = parkingSpace50.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID11, parkingLot44, parkingSpaceStatus53, "", true);
        parkingSpace56.setEnabled(true);
        boolean boolean59 = parkingSpace2.equals((java.lang.Object) parkingSpace56);
        java.lang.Class<?> wildcardClass60 = parkingSpace2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID11);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID11.toString(), "f7aaccec-285a-4cf8-94be-f689ff2c0446");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot20);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus21 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus21.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus37 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus37.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus53 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus53.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingLot.ParkingLot parkingLot21 = null;
        models.parkingSpace.ParkingSpace parkingSpace23 = new models.parkingSpace.ParkingSpace(parkingLot21, "hi!");
        parkingSpace23.setEnabled(true);
        java.util.UUID uUID26 = parkingSpace23.getID();
        models.parkingLot.ParkingLot parkingLot27 = null;
        java.util.UUID uUID28 = null;
        models.parkingLot.ParkingLot parkingLot29 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus30 = null;
        models.parkingSpace.ParkingSpace parkingSpace33 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus30, "", false);
        java.lang.String str34 = parkingSpace33.toString();
        models.parkingLot.ParkingLot parkingLot35 = parkingSpace33.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus36 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace33.setStatus(parkingSpaceStatus36);
        models.parkingSpace.ParkingSpace parkingSpace40 = new models.parkingSpace.ParkingSpace(uUID26, parkingLot27, parkingSpaceStatus36, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace43 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus36, "hi!", true);
        models.parkingLot.ParkingLot parkingLot44 = parkingSpace43.getLot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass45 = parkingLot44.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "ebea2f48-157e-4528-a4e3-1965abe787df");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID26);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID26.toString(), "df3974ff-436b-42ad-b530-b3a731070ec8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot35);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus36 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus36.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot44);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean8 = parkingSpace5.isEnabled();
        boolean boolean9 = parkingSpace5.isBookable();
        parkingSpace5.checkOut();
        boolean boolean11 = parkingSpace5.isEnabled();
        parkingSpace5.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean8 = parkingSpace5.isEnabled();
        boolean boolean9 = parkingSpace5.isBookable();
        parkingSpace5.checkOut();
        boolean boolean11 = parkingSpace5.isEnabled();
        java.util.UUID uUID12 = parkingSpace5.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace5.getStatus();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus17 = parkingSpace5.getStatus();
        java.util.UUID uUID18 = parkingSpace5.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus17 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus17.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID18);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace13.getLot();
        java.lang.String str15 = parkingSpace13.toString();
        java.util.UUID uUID16 = null;
        models.parkingLot.ParkingLot parkingLot17 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus18 = null;
        models.parkingSpace.ParkingSpace parkingSpace21 = new models.parkingSpace.ParkingSpace(uUID16, parkingLot17, parkingSpaceStatus18, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus22 = null;
        parkingSpace21.setStatus(parkingSpaceStatus22);
        parkingSpace21.setEnabled(true);
        boolean boolean26 = parkingSpace21.isEnabled();
        parkingSpace21.checkOut();
        java.util.UUID uUID28 = null;
        models.parkingLot.ParkingLot parkingLot29 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus30 = null;
        models.parkingSpace.ParkingSpace parkingSpace33 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus30, "", false);
        java.lang.String str34 = parkingSpace33.toString();
        parkingSpace33.checkOut();
        boolean boolean36 = parkingSpace33.isEnabled();
        models.parkingLot.ParkingLot parkingLot37 = parkingSpace33.getLot();
        boolean boolean38 = parkingSpace21.equals((java.lang.Object) parkingLot37);
        java.util.UUID uUID39 = null;
        models.parkingLot.ParkingLot parkingLot40 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus41 = null;
        models.parkingSpace.ParkingSpace parkingSpace44 = new models.parkingSpace.ParkingSpace(uUID39, parkingLot40, parkingSpaceStatus41, "", false);
        java.lang.String str45 = parkingSpace44.toString();
        parkingSpace44.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus47 = parkingSpace44.getStatus();
        parkingSpace21.setStatus(parkingSpaceStatus47);
        parkingSpace13.setStatus(parkingSpaceStatus47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus47 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus47.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        java.lang.String str16 = parkingSpace5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingLot.ParkingLot parkingLot2 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = new models.parkingSpace.ParkingSpace(parkingLot2, "hi!");
        parkingSpace4.setEnabled(true);
        java.util.UUID uUID7 = parkingSpace4.getID();
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.UUID uUID9 = null;
        models.parkingLot.ParkingLot parkingLot10 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus11 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = new models.parkingSpace.ParkingSpace(uUID9, parkingLot10, parkingSpaceStatus11, "", false);
        java.lang.String str15 = parkingSpace14.toString();
        models.parkingLot.ParkingLot parkingLot16 = parkingSpace14.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus17 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace14.setStatus(parkingSpaceStatus17);
        models.parkingSpace.ParkingSpace parkingSpace21 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus17, "hi!", true);
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.UUID uUID25 = null;
        models.parkingLot.ParkingLot parkingLot26 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus27 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = new models.parkingSpace.ParkingSpace(uUID25, parkingLot26, parkingSpaceStatus27, "", false);
        java.lang.String str31 = parkingSpace30.toString();
        parkingSpace30.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus33 = parkingSpace30.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace36 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus33, "", true);
        models.parkingSpace.ParkingSpace parkingSpace39 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot22, parkingSpaceStatus33, "hi!", false);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus33, "hi!", true);
        parkingSpace42.setEnabled(true);
        java.lang.String str45 = parkingSpace42.getName();
        java.util.UUID uUID46 = parkingSpace42.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "b5e0ad95-f9d4-4a3a-a155-778275dfa593");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot16);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus17 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus17.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus33 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus33.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID46);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace13.getLot();
        boolean boolean15 = parkingSpace13.isBookable();
        models.parkingLot.ParkingLot parkingLot16 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(parkingLot16, "hi!");
        boolean boolean19 = parkingSpace13.equals((java.lang.Object) parkingSpace18);
        boolean boolean20 = parkingSpace13.isEnabled();
        parkingSpace13.setEnabled(false);
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        models.parkingLot.ParkingLot parkingLot30 = parkingSpace28.getLot();
        models.parkingLot.ParkingLot parkingLot31 = null;
        models.parkingSpace.ParkingSpace parkingSpace33 = new models.parkingSpace.ParkingSpace(parkingLot31, "hi!");
        parkingSpace33.setEnabled(true);
        java.util.UUID uUID36 = parkingSpace33.getID();
        models.parkingLot.ParkingLot parkingLot37 = null;
        java.util.UUID uUID38 = null;
        models.parkingLot.ParkingLot parkingLot39 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus40 = null;
        models.parkingSpace.ParkingSpace parkingSpace43 = new models.parkingSpace.ParkingSpace(uUID38, parkingLot39, parkingSpaceStatus40, "", false);
        java.lang.String str44 = parkingSpace43.toString();
        models.parkingLot.ParkingLot parkingLot45 = parkingSpace43.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus46 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace43.setStatus(parkingSpaceStatus46);
        models.parkingSpace.ParkingSpace parkingSpace50 = new models.parkingSpace.ParkingSpace(uUID36, parkingLot37, parkingSpaceStatus46, "hi!", true);
        models.parkingLot.ParkingLot parkingLot51 = null;
        java.util.UUID uUID52 = null;
        models.parkingLot.ParkingLot parkingLot53 = null;
        java.util.UUID uUID54 = null;
        models.parkingLot.ParkingLot parkingLot55 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus56 = null;
        models.parkingSpace.ParkingSpace parkingSpace59 = new models.parkingSpace.ParkingSpace(uUID54, parkingLot55, parkingSpaceStatus56, "", false);
        java.lang.String str60 = parkingSpace59.toString();
        parkingSpace59.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus62 = parkingSpace59.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace65 = new models.parkingSpace.ParkingSpace(uUID52, parkingLot53, parkingSpaceStatus62, "", true);
        models.parkingSpace.ParkingSpace parkingSpace68 = new models.parkingSpace.ParkingSpace(uUID36, parkingLot51, parkingSpaceStatus62, "hi!", false);
        models.parkingLot.ParkingLot parkingLot69 = null;
        java.util.UUID uUID70 = null;
        models.parkingLot.ParkingLot parkingLot71 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus72 = null;
        models.parkingSpace.ParkingSpace parkingSpace75 = new models.parkingSpace.ParkingSpace(uUID70, parkingLot71, parkingSpaceStatus72, "", false);
        java.lang.String str76 = parkingSpace75.toString();
        parkingSpace75.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus78 = parkingSpace75.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace81 = new models.parkingSpace.ParkingSpace(uUID36, parkingLot69, parkingSpaceStatus78, "", true);
        parkingSpace28.setStatus(parkingSpaceStatus78);
        parkingSpace13.setStatus(parkingSpaceStatus78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID36);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID36.toString(), "22811d63-cf10-4cbb-9f4b-4351178a1f9f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot45);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus46 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus46.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus62 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus62.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus78 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus78.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus31, "", true);
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus31, "hi!", false);
        parkingSpace37.setEnabled(false);
        boolean boolean40 = parkingSpace37.isEnabled();
        models.parkingLot.ParkingLot parkingLot41 = parkingSpace37.getLot();
        java.lang.String str42 = parkingSpace37.toString();
        models.parkingLot.ParkingLot parkingLot43 = parkingSpace37.getLot();
        parkingSpace37.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "deceb5de-69d3-4258-bfc8-4e4154e36f28");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot43);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(false);
        parkingSpace5.setEnabled(true);
        java.lang.String str13 = parkingSpace5.getName();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace5.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean8 = parkingSpace5.isEnabled();
        boolean boolean9 = parkingSpace5.isBookable();
        parkingSpace5.checkOut();
        boolean boolean11 = parkingSpace5.isEnabled();
        java.lang.String str12 = parkingSpace5.toString();
        boolean boolean13 = parkingSpace5.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        models.parkingLot.ParkingLot parkingLot6 = null;
        models.parkingSpace.ParkingSpace parkingSpace8 = new models.parkingSpace.ParkingSpace(parkingLot6, "hi!");
        parkingSpace8.setEnabled(true);
        java.util.UUID uUID11 = null;
        models.parkingLot.ParkingLot parkingLot12 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = null;
        models.parkingSpace.ParkingSpace parkingSpace16 = new models.parkingSpace.ParkingSpace(uUID11, parkingLot12, parkingSpaceStatus13, "", false);
        java.lang.String str17 = parkingSpace16.toString();
        models.parkingLot.ParkingLot parkingLot18 = parkingSpace16.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus19 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace16.setStatus(parkingSpaceStatus19);
        parkingSpace8.setStatus(parkingSpaceStatus19);
        parkingSpace2.setStatus(parkingSpaceStatus19);
        java.util.UUID uUID23 = parkingSpace2.getID();
        java.util.UUID uUID24 = null;
        models.parkingLot.ParkingLot parkingLot25 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus26 = null;
        models.parkingSpace.ParkingSpace parkingSpace29 = new models.parkingSpace.ParkingSpace(uUID24, parkingLot25, parkingSpaceStatus26, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus30 = null;
        parkingSpace29.setStatus(parkingSpaceStatus30);
        parkingSpace29.setEnabled(true);
        boolean boolean34 = parkingSpace29.isEnabled();
        parkingSpace29.checkOut();
        java.util.UUID uUID36 = parkingSpace29.getID();
        parkingSpace29.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot39 = parkingSpace29.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus40 = parkingSpace29.getStatus();
        java.util.UUID uUID41 = parkingSpace29.getID();
        boolean boolean42 = parkingSpace2.equals((java.lang.Object) uUID41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot18);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus19 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus19.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID23);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID23.toString(), "60e73209-112f-4803-8ee7-c870303e04ee");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot39);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus40 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus40.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace5.getStatus();
        java.util.UUID uUID17 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID17);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus7 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        parkingSpace5.setStatus(parkingSpaceStatus7);
        parkingSpace5.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus7 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus7.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus31, "", true);
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus31, "hi!", false);
        models.parkingLot.ParkingLot parkingLot38 = null;
        java.util.UUID uUID39 = null;
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.UUID uUID41 = null;
        models.parkingLot.ParkingLot parkingLot42 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus43 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(uUID41, parkingLot42, parkingSpaceStatus43, "", false);
        java.lang.String str47 = parkingSpace46.toString();
        parkingSpace46.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus49 = parkingSpace46.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace52 = new models.parkingSpace.ParkingSpace(uUID39, parkingLot40, parkingSpaceStatus49, "", true);
        models.parkingSpace.ParkingSpace parkingSpace55 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot38, parkingSpaceStatus49, "", true);
        models.parkingLot.ParkingLot parkingLot56 = null;
        models.parkingLot.ParkingLot parkingLot57 = null;
        models.parkingSpace.ParkingSpace parkingSpace59 = new models.parkingSpace.ParkingSpace(parkingLot57, "hi!");
        parkingSpace59.setEnabled(true);
        java.util.UUID uUID62 = parkingSpace59.getID();
        models.parkingLot.ParkingLot parkingLot63 = null;
        java.util.UUID uUID64 = null;
        models.parkingLot.ParkingLot parkingLot65 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus66 = null;
        models.parkingSpace.ParkingSpace parkingSpace69 = new models.parkingSpace.ParkingSpace(uUID64, parkingLot65, parkingSpaceStatus66, "", false);
        java.lang.String str70 = parkingSpace69.toString();
        models.parkingLot.ParkingLot parkingLot71 = parkingSpace69.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus72 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace69.setStatus(parkingSpaceStatus72);
        models.parkingSpace.ParkingSpace parkingSpace76 = new models.parkingSpace.ParkingSpace(uUID62, parkingLot63, parkingSpaceStatus72, "hi!", true);
        models.parkingLot.ParkingLot parkingLot77 = null;
        java.util.UUID uUID78 = null;
        models.parkingLot.ParkingLot parkingLot79 = null;
        java.util.UUID uUID80 = null;
        models.parkingLot.ParkingLot parkingLot81 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus82 = null;
        models.parkingSpace.ParkingSpace parkingSpace85 = new models.parkingSpace.ParkingSpace(uUID80, parkingLot81, parkingSpaceStatus82, "", false);
        java.lang.String str86 = parkingSpace85.toString();
        parkingSpace85.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus88 = parkingSpace85.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace91 = new models.parkingSpace.ParkingSpace(uUID78, parkingLot79, parkingSpaceStatus88, "", true);
        models.parkingSpace.ParkingSpace parkingSpace94 = new models.parkingSpace.ParkingSpace(uUID62, parkingLot77, parkingSpaceStatus88, "hi!", false);
        models.parkingSpace.ParkingSpace parkingSpace97 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot56, parkingSpaceStatus88, "hi!", false);
        java.lang.String str98 = parkingSpace97.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "ac0a1b08-6895-4bad-829d-16a318183fbb");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus49 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus49.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID62);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID62.toString(), "b1fc9eae-9d0a-4ace-83e5-fa2671e964a1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot71);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus72 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus72.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "" + "'", str86.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus88 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus88.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str98 + "' != '" + "hi!" + "'", str98.equals("hi!"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "");
        boolean boolean3 = parkingSpace2.isBookable();
        java.util.UUID uUID4 = parkingSpace2.getID();
        java.lang.Class<?> wildcardClass5 = uUID4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "8fb442cc-afc9-45c6-82a9-4d1d8e3d93f3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean8 = parkingSpace5.isEnabled();
        models.parkingLot.ParkingLot parkingLot9 = parkingSpace5.getLot();
        models.parkingLot.ParkingLot parkingLot10 = parkingSpace5.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(false);
        parkingSpace5.setEnabled(true);
        parkingSpace5.setEnabled(true);
        boolean boolean16 = parkingSpace5.equals((java.lang.Object) "");
        java.lang.String str17 = parkingSpace5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus31, "", true);
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus31, "hi!", false);
        models.parkingLot.ParkingLot parkingLot38 = null;
        java.util.UUID uUID39 = null;
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.UUID uUID41 = null;
        models.parkingLot.ParkingLot parkingLot42 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus43 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(uUID41, parkingLot42, parkingSpaceStatus43, "", false);
        java.lang.String str47 = parkingSpace46.toString();
        parkingSpace46.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus49 = parkingSpace46.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace52 = new models.parkingSpace.ParkingSpace(uUID39, parkingLot40, parkingSpaceStatus49, "", true);
        models.parkingSpace.ParkingSpace parkingSpace55 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot38, parkingSpaceStatus49, "", true);
        parkingSpace55.setEnabled(false);
        java.lang.String str58 = parkingSpace55.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "eb97628d-4de7-4b9a-a8de-53689d7a8280");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus49 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus49.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", false);
        parkingSpace13.checkOut();
        parkingSpace13.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingLot.ParkingLot parkingLot23 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(parkingLot23, "hi!");
        parkingSpace25.setEnabled(true);
        java.util.UUID uUID28 = parkingSpace25.getID();
        models.parkingLot.ParkingLot parkingLot29 = null;
        java.util.UUID uUID30 = null;
        models.parkingLot.ParkingLot parkingLot31 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus32 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = new models.parkingSpace.ParkingSpace(uUID30, parkingLot31, parkingSpaceStatus32, "", false);
        java.lang.String str36 = parkingSpace35.toString();
        models.parkingLot.ParkingLot parkingLot37 = parkingSpace35.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus38 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace35.setStatus(parkingSpaceStatus38);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus38, "hi!", true);
        models.parkingLot.ParkingLot parkingLot43 = null;
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(parkingLot44, "hi!");
        parkingSpace46.setEnabled(true);
        java.util.UUID uUID49 = parkingSpace46.getID();
        models.parkingLot.ParkingLot parkingLot50 = null;
        java.util.UUID uUID51 = null;
        models.parkingLot.ParkingLot parkingLot52 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID51, parkingLot52, parkingSpaceStatus53, "", false);
        java.lang.String str57 = parkingSpace56.toString();
        models.parkingLot.ParkingLot parkingLot58 = parkingSpace56.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace56.setStatus(parkingSpaceStatus59);
        models.parkingSpace.ParkingSpace parkingSpace63 = new models.parkingSpace.ParkingSpace(uUID49, parkingLot50, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot43, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace69 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus59, "", true);
        java.util.UUID uUID70 = parkingSpace69.getID();
        parkingSpace69.setEnabled(true);
        boolean boolean73 = parkingSpace69.isBookable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "da2d4169-1acc-4a3b-8118-3a103779c7e5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID28);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID28.toString(), "7d077a3e-8cb3-4843-aaf3-0bb2ff22b81b");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot37);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus38 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus38.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID49);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID49.toString(), "1d1b1e77-eb98-4f7b-9622-53aade4f6288");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus59 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus59.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID70);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID70.toString(), "da2d4169-1acc-4a3b-8118-3a103779c7e5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace5.getStatus();
        models.parkingLot.ParkingLot parkingLot17 = null;
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(parkingLot17, "hi!");
        parkingSpace19.setEnabled(true);
        java.util.UUID uUID22 = parkingSpace19.getID();
        models.parkingLot.ParkingLot parkingLot23 = null;
        java.util.UUID uUID24 = null;
        models.parkingLot.ParkingLot parkingLot25 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus26 = null;
        models.parkingSpace.ParkingSpace parkingSpace29 = new models.parkingSpace.ParkingSpace(uUID24, parkingLot25, parkingSpaceStatus26, "", false);
        java.lang.String str30 = parkingSpace29.toString();
        models.parkingLot.ParkingLot parkingLot31 = parkingSpace29.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus32 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace29.setStatus(parkingSpaceStatus32);
        models.parkingSpace.ParkingSpace parkingSpace36 = new models.parkingSpace.ParkingSpace(uUID22, parkingLot23, parkingSpaceStatus32, "hi!", true);
        models.parkingLot.ParkingLot parkingLot37 = null;
        java.util.UUID uUID38 = null;
        models.parkingLot.ParkingLot parkingLot39 = null;
        java.util.UUID uUID40 = null;
        models.parkingLot.ParkingLot parkingLot41 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus42 = null;
        models.parkingSpace.ParkingSpace parkingSpace45 = new models.parkingSpace.ParkingSpace(uUID40, parkingLot41, parkingSpaceStatus42, "", false);
        java.lang.String str46 = parkingSpace45.toString();
        parkingSpace45.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus48 = parkingSpace45.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace51 = new models.parkingSpace.ParkingSpace(uUID38, parkingLot39, parkingSpaceStatus48, "", true);
        models.parkingSpace.ParkingSpace parkingSpace54 = new models.parkingSpace.ParkingSpace(uUID22, parkingLot37, parkingSpaceStatus48, "hi!", false);
        models.parkingLot.ParkingLot parkingLot55 = null;
        java.util.UUID uUID56 = null;
        models.parkingLot.ParkingLot parkingLot57 = null;
        java.util.UUID uUID58 = null;
        models.parkingLot.ParkingLot parkingLot59 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus60 = null;
        models.parkingSpace.ParkingSpace parkingSpace63 = new models.parkingSpace.ParkingSpace(uUID58, parkingLot59, parkingSpaceStatus60, "", false);
        java.lang.String str64 = parkingSpace63.toString();
        parkingSpace63.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus66 = parkingSpace63.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace69 = new models.parkingSpace.ParkingSpace(uUID56, parkingLot57, parkingSpaceStatus66, "", true);
        models.parkingSpace.ParkingSpace parkingSpace72 = new models.parkingSpace.ParkingSpace(uUID22, parkingLot55, parkingSpaceStatus66, "", true);
        parkingSpace5.setStatus(parkingSpaceStatus66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "f0976b6f-fa7d-45ad-af78-25fe9dd5b729");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot31);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus32 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus32.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus48 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus48.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus66 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus66.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = null;
        parkingSpace7.setStatus(parkingSpaceStatus8);
        parkingSpace7.setEnabled(true);
        boolean boolean12 = parkingSpace7.isEnabled();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        boolean boolean14 = parkingSpace7.equals((java.lang.Object) parkingSpaceStatus13);
        models.parkingSpace.ParkingSpace parkingSpace17 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus13, "", true);
        java.lang.String str18 = parkingSpace17.toString();
        models.parkingLot.ParkingLot parkingLot19 = parkingSpace17.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus13 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus13.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot19);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        boolean boolean7 = parkingSpace5.isBookable();
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        boolean boolean17 = parkingSpace13.isEnabled();
        java.util.UUID uUID18 = null;
        models.parkingLot.ParkingLot parkingLot19 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus20 = null;
        models.parkingSpace.ParkingSpace parkingSpace23 = new models.parkingSpace.ParkingSpace(uUID18, parkingLot19, parkingSpaceStatus20, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus24 = null;
        parkingSpace23.setStatus(parkingSpaceStatus24);
        parkingSpace23.setEnabled(true);
        boolean boolean28 = parkingSpace23.isEnabled();
        parkingSpace23.checkOut();
        java.util.UUID uUID30 = parkingSpace23.getID();
        boolean boolean31 = parkingSpace13.equals((java.lang.Object) uUID30);
        boolean boolean32 = parkingSpace5.equals((java.lang.Object) boolean31);
        java.util.UUID uUID33 = parkingSpace5.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID33);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        models.parkingLot.ParkingLot parkingLot10 = parkingSpace5.getLot();
        parkingSpace5.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", false);
        models.parkingLot.ParkingLot parkingLot14 = null;
        models.parkingSpace.ParkingSpace parkingSpace16 = new models.parkingSpace.ParkingSpace(parkingLot14, "hi!");
        parkingSpace16.setEnabled(true);
        java.util.UUID uUID19 = parkingSpace16.getID();
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus23 = null;
        models.parkingSpace.ParkingSpace parkingSpace26 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus23, "", false);
        java.lang.String str27 = parkingSpace26.toString();
        models.parkingLot.ParkingLot parkingLot28 = parkingSpace26.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus29 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace26.setStatus(parkingSpaceStatus29);
        models.parkingSpace.ParkingSpace parkingSpace33 = new models.parkingSpace.ParkingSpace(uUID19, parkingLot20, parkingSpaceStatus29, "hi!", true);
        models.parkingLot.ParkingLot parkingLot34 = null;
        java.util.UUID uUID35 = null;
        models.parkingLot.ParkingLot parkingLot36 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus37 = null;
        models.parkingSpace.ParkingSpace parkingSpace40 = new models.parkingSpace.ParkingSpace(uUID35, parkingLot36, parkingSpaceStatus37, "", false);
        java.lang.String str41 = parkingSpace40.toString();
        parkingSpace40.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus43 = parkingSpace40.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(uUID19, parkingLot34, parkingSpaceStatus43, "hi!", false);
        parkingSpace13.setStatus(parkingSpaceStatus43);
        models.parkingLot.ParkingLot parkingLot48 = parkingSpace13.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "578e0cec-b71d-4474-af0b-019f9bf173d8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot28);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus29 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus29.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus43 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus43.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot48);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        java.lang.String str16 = parkingSpace5.getName();
        parkingSpace5.checkOut();
        boolean boolean18 = parkingSpace5.isEnabled();
        boolean boolean19 = parkingSpace5.isBookable();
        java.lang.Class<?> wildcardClass20 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(false);
        parkingSpace5.setEnabled(true);
        parkingSpace5.setEnabled(true);
        parkingSpace5.checkOut();
        java.lang.String str16 = parkingSpace5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus31, "", true);
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus31, "hi!", false);
        models.parkingLot.ParkingLot parkingLot38 = null;
        java.util.UUID uUID39 = null;
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.UUID uUID41 = null;
        models.parkingLot.ParkingLot parkingLot42 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus43 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(uUID41, parkingLot42, parkingSpaceStatus43, "", false);
        java.lang.String str47 = parkingSpace46.toString();
        parkingSpace46.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus49 = parkingSpace46.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace52 = new models.parkingSpace.ParkingSpace(uUID39, parkingLot40, parkingSpaceStatus49, "", true);
        models.parkingSpace.ParkingSpace parkingSpace55 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot38, parkingSpaceStatus49, "", true);
        models.parkingLot.ParkingLot parkingLot56 = null;
        java.util.UUID uUID57 = null;
        models.parkingLot.ParkingLot parkingLot58 = null;
        java.util.UUID uUID59 = null;
        models.parkingLot.ParkingLot parkingLot60 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus61 = null;
        models.parkingSpace.ParkingSpace parkingSpace64 = new models.parkingSpace.ParkingSpace(uUID59, parkingLot60, parkingSpaceStatus61, "", false);
        java.lang.String str65 = parkingSpace64.toString();
        parkingSpace64.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus67 = parkingSpace64.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace70 = new models.parkingSpace.ParkingSpace(uUID57, parkingLot58, parkingSpaceStatus67, "", false);
        java.util.UUID uUID71 = parkingSpace70.getID();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus72 = parkingSpace70.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace75 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot56, parkingSpaceStatus72, "hi!", false);
        models.parkingLot.ParkingLot parkingLot76 = null;
        java.util.UUID uUID77 = null;
        models.parkingLot.ParkingLot parkingLot78 = null;
        java.util.UUID uUID79 = null;
        models.parkingLot.ParkingLot parkingLot80 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus81 = null;
        models.parkingSpace.ParkingSpace parkingSpace84 = new models.parkingSpace.ParkingSpace(uUID79, parkingLot80, parkingSpaceStatus81, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus85 = null;
        parkingSpace84.setStatus(parkingSpaceStatus85);
        parkingSpace84.setEnabled(true);
        boolean boolean89 = parkingSpace84.isEnabled();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus90 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        boolean boolean91 = parkingSpace84.equals((java.lang.Object) parkingSpaceStatus90);
        models.parkingSpace.ParkingSpace parkingSpace94 = new models.parkingSpace.ParkingSpace(uUID77, parkingLot78, parkingSpaceStatus90, "", true);
        models.parkingSpace.ParkingSpace parkingSpace97 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot76, parkingSpaceStatus90, "", true);
        java.lang.Class<?> wildcardClass98 = uUID5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "94c3f616-4091-4f84-a059-a49e1395b361");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus49 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus49.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus67 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus67.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID71);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus72 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus72.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus90 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus90.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingLot.ParkingLot parkingLot2 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = new models.parkingSpace.ParkingSpace(parkingLot2, "hi!");
        parkingSpace4.setEnabled(true);
        java.util.UUID uUID7 = parkingSpace4.getID();
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.UUID uUID9 = null;
        models.parkingLot.ParkingLot parkingLot10 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus11 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = new models.parkingSpace.ParkingSpace(uUID9, parkingLot10, parkingSpaceStatus11, "", false);
        java.lang.String str15 = parkingSpace14.toString();
        models.parkingLot.ParkingLot parkingLot16 = parkingSpace14.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus17 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace14.setStatus(parkingSpaceStatus17);
        models.parkingSpace.ParkingSpace parkingSpace21 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus17, "hi!", true);
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot22, parkingSpaceStatus31, "hi!", false);
        models.parkingLot.ParkingLot parkingLot35 = null;
        models.parkingLot.ParkingLot parkingLot36 = null;
        models.parkingSpace.ParkingSpace parkingSpace38 = new models.parkingSpace.ParkingSpace(parkingLot36, "hi!");
        parkingSpace38.setEnabled(true);
        java.util.UUID uUID41 = parkingSpace38.getID();
        models.parkingLot.ParkingLot parkingLot42 = null;
        java.util.UUID uUID43 = null;
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus45 = null;
        models.parkingSpace.ParkingSpace parkingSpace48 = new models.parkingSpace.ParkingSpace(uUID43, parkingLot44, parkingSpaceStatus45, "", false);
        java.lang.String str49 = parkingSpace48.toString();
        models.parkingLot.ParkingLot parkingLot50 = parkingSpace48.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus51 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace48.setStatus(parkingSpaceStatus51);
        models.parkingSpace.ParkingSpace parkingSpace55 = new models.parkingSpace.ParkingSpace(uUID41, parkingLot42, parkingSpaceStatus51, "hi!", true);
        models.parkingLot.ParkingLot parkingLot56 = null;
        java.util.UUID uUID57 = null;
        models.parkingLot.ParkingLot parkingLot58 = null;
        java.util.UUID uUID59 = null;
        models.parkingLot.ParkingLot parkingLot60 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus61 = null;
        models.parkingSpace.ParkingSpace parkingSpace64 = new models.parkingSpace.ParkingSpace(uUID59, parkingLot60, parkingSpaceStatus61, "", false);
        java.lang.String str65 = parkingSpace64.toString();
        parkingSpace64.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus67 = parkingSpace64.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace70 = new models.parkingSpace.ParkingSpace(uUID57, parkingLot58, parkingSpaceStatus67, "", true);
        models.parkingSpace.ParkingSpace parkingSpace73 = new models.parkingSpace.ParkingSpace(uUID41, parkingLot56, parkingSpaceStatus67, "hi!", false);
        models.parkingLot.ParkingLot parkingLot74 = null;
        java.util.UUID uUID75 = null;
        models.parkingLot.ParkingLot parkingLot76 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus77 = null;
        models.parkingSpace.ParkingSpace parkingSpace80 = new models.parkingSpace.ParkingSpace(uUID75, parkingLot76, parkingSpaceStatus77, "", false);
        java.lang.String str81 = parkingSpace80.toString();
        parkingSpace80.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus83 = parkingSpace80.getStatus();
        boolean boolean85 = parkingSpace80.equals((java.lang.Object) 1.0f);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus86 = parkingSpace80.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace89 = new models.parkingSpace.ParkingSpace(uUID41, parkingLot74, parkingSpaceStatus86, "hi!", false);
        models.parkingSpace.ParkingSpace parkingSpace92 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot35, parkingSpaceStatus86, "", true);
        models.parkingSpace.ParkingSpace parkingSpace95 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus86, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "10dba0d8-446b-4966-9eae-0e23be1393c2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot16);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus17 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus17.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID41);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID41.toString(), "d68939b2-2a4f-4b80-8cde-0d3f7eef12b7");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot50);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus51 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus51.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus67 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus67.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "" + "'", str81.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus83 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus83.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus86 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus86.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingLot.ParkingLot parkingLot23 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(parkingLot23, "hi!");
        parkingSpace25.setEnabled(true);
        java.util.UUID uUID28 = parkingSpace25.getID();
        models.parkingLot.ParkingLot parkingLot29 = null;
        java.util.UUID uUID30 = null;
        models.parkingLot.ParkingLot parkingLot31 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus32 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = new models.parkingSpace.ParkingSpace(uUID30, parkingLot31, parkingSpaceStatus32, "", false);
        java.lang.String str36 = parkingSpace35.toString();
        models.parkingLot.ParkingLot parkingLot37 = parkingSpace35.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus38 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace35.setStatus(parkingSpaceStatus38);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus38, "hi!", true);
        models.parkingLot.ParkingLot parkingLot43 = null;
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(parkingLot44, "hi!");
        parkingSpace46.setEnabled(true);
        java.util.UUID uUID49 = parkingSpace46.getID();
        models.parkingLot.ParkingLot parkingLot50 = null;
        java.util.UUID uUID51 = null;
        models.parkingLot.ParkingLot parkingLot52 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID51, parkingLot52, parkingSpaceStatus53, "", false);
        java.lang.String str57 = parkingSpace56.toString();
        models.parkingLot.ParkingLot parkingLot58 = parkingSpace56.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace56.setStatus(parkingSpaceStatus59);
        models.parkingSpace.ParkingSpace parkingSpace63 = new models.parkingSpace.ParkingSpace(uUID49, parkingLot50, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot43, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace69 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus59, "", true);
        models.parkingLot.ParkingLot parkingLot70 = null;
        java.util.UUID uUID71 = null;
        models.parkingLot.ParkingLot parkingLot72 = null;
        java.util.UUID uUID73 = null;
        models.parkingLot.ParkingLot parkingLot74 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus75 = null;
        models.parkingSpace.ParkingSpace parkingSpace78 = new models.parkingSpace.ParkingSpace(uUID73, parkingLot74, parkingSpaceStatus75, "", false);
        java.lang.String str79 = parkingSpace78.toString();
        parkingSpace78.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus81 = parkingSpace78.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace84 = new models.parkingSpace.ParkingSpace(uUID71, parkingLot72, parkingSpaceStatus81, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus85 = parkingSpace84.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace88 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot70, parkingSpaceStatus85, "hi!", false);
        parkingSpace88.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "6abccff4-629f-4e08-97cd-ac0da5115c59");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID28);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID28.toString(), "5c23298b-70c9-4075-afab-b5694c5c165e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot37);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus38 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus38.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID49);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID49.toString(), "6f19a650-bf26-46e6-981e-a52269c0f2dd");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus59 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus59.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "" + "'", str79.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus81 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus81.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus85 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus85.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus31, "", true);
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus31, "hi!", false);
        models.parkingLot.ParkingLot parkingLot38 = null;
        java.util.UUID uUID39 = null;
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.UUID uUID41 = null;
        models.parkingLot.ParkingLot parkingLot42 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus43 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(uUID41, parkingLot42, parkingSpaceStatus43, "", false);
        java.lang.String str47 = parkingSpace46.toString();
        parkingSpace46.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus49 = parkingSpace46.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace52 = new models.parkingSpace.ParkingSpace(uUID39, parkingLot40, parkingSpaceStatus49, "", true);
        models.parkingSpace.ParkingSpace parkingSpace55 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot38, parkingSpaceStatus49, "", true);
        models.parkingLot.ParkingLot parkingLot56 = null;
        java.util.UUID uUID57 = null;
        models.parkingLot.ParkingLot parkingLot58 = null;
        java.util.UUID uUID59 = null;
        models.parkingLot.ParkingLot parkingLot60 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus61 = null;
        models.parkingSpace.ParkingSpace parkingSpace64 = new models.parkingSpace.ParkingSpace(uUID59, parkingLot60, parkingSpaceStatus61, "", false);
        java.lang.String str65 = parkingSpace64.toString();
        parkingSpace64.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus67 = parkingSpace64.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace70 = new models.parkingSpace.ParkingSpace(uUID57, parkingLot58, parkingSpaceStatus67, "", false);
        java.util.UUID uUID71 = parkingSpace70.getID();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus72 = parkingSpace70.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace75 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot56, parkingSpaceStatus72, "hi!", false);
        models.parkingLot.ParkingLot parkingLot76 = null;
        java.util.UUID uUID77 = null;
        models.parkingLot.ParkingLot parkingLot78 = null;
        java.util.UUID uUID79 = null;
        models.parkingLot.ParkingLot parkingLot80 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus81 = null;
        models.parkingSpace.ParkingSpace parkingSpace84 = new models.parkingSpace.ParkingSpace(uUID79, parkingLot80, parkingSpaceStatus81, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus85 = null;
        parkingSpace84.setStatus(parkingSpaceStatus85);
        parkingSpace84.setEnabled(true);
        boolean boolean89 = parkingSpace84.isEnabled();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus90 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        boolean boolean91 = parkingSpace84.equals((java.lang.Object) parkingSpaceStatus90);
        models.parkingSpace.ParkingSpace parkingSpace94 = new models.parkingSpace.ParkingSpace(uUID77, parkingLot78, parkingSpaceStatus90, "", true);
        models.parkingSpace.ParkingSpace parkingSpace97 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot76, parkingSpaceStatus90, "", true);
        models.parkingLot.ParkingLot parkingLot98 = parkingSpace97.getLot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass99 = parkingLot98.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "7a9c83e8-915e-4752-ac89-ce4aca641295");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus49 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus49.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus67 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus67.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID71);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus72 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus72.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus90 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus90.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot98);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        java.lang.String str7 = parkingSpace5.getName();
        java.lang.String str8 = parkingSpace5.getName();
        boolean boolean9 = parkingSpace5.isBookable();
        parkingSpace5.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        java.lang.String str10 = parkingSpace5.getName();
        boolean boolean11 = parkingSpace5.isBookable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean8 = parkingSpace5.isEnabled();
        java.util.UUID uUID9 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        java.lang.String str16 = parkingSpace5.getName();
        parkingSpace5.checkOut();
        boolean boolean18 = parkingSpace5.isEnabled();
        java.lang.String str19 = parkingSpace5.toString();
        boolean boolean20 = parkingSpace5.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(false);
        parkingSpace5.setEnabled(true);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(true);
        java.lang.String str16 = parkingSpace5.toString();
        parkingSpace5.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus13 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus13.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace13.getLot();
        java.lang.String str15 = parkingSpace13.toString();
        java.util.UUID uUID16 = null;
        models.parkingLot.ParkingLot parkingLot17 = null;
        java.util.UUID uUID18 = null;
        models.parkingLot.ParkingLot parkingLot19 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus20 = null;
        models.parkingSpace.ParkingSpace parkingSpace23 = new models.parkingSpace.ParkingSpace(uUID18, parkingLot19, parkingSpaceStatus20, "", false);
        java.lang.String str24 = parkingSpace23.toString();
        parkingSpace23.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus26 = parkingSpace23.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace29 = new models.parkingSpace.ParkingSpace(uUID16, parkingLot17, parkingSpaceStatus26, "", true);
        parkingSpace13.setStatus(parkingSpaceStatus26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus26 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus26.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", false);
        java.util.UUID uUID14 = parkingSpace13.getID();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = parkingSpace13.getStatus();
        parkingSpace13.checkOut();
        java.util.UUID uUID17 = parkingSpace13.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID17);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        boolean boolean16 = parkingSpace5.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus31, "", true);
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus31, "hi!", false);
        models.parkingLot.ParkingLot parkingLot38 = null;
        java.util.UUID uUID39 = null;
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.UUID uUID41 = null;
        models.parkingLot.ParkingLot parkingLot42 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus43 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(uUID41, parkingLot42, parkingSpaceStatus43, "", false);
        java.lang.String str47 = parkingSpace46.toString();
        parkingSpace46.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus49 = parkingSpace46.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace52 = new models.parkingSpace.ParkingSpace(uUID39, parkingLot40, parkingSpaceStatus49, "", true);
        models.parkingSpace.ParkingSpace parkingSpace55 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot38, parkingSpaceStatus49, "", true);
        models.parkingLot.ParkingLot parkingLot56 = null;
        java.util.UUID uUID57 = null;
        models.parkingLot.ParkingLot parkingLot58 = null;
        java.util.UUID uUID59 = null;
        models.parkingLot.ParkingLot parkingLot60 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus61 = null;
        models.parkingSpace.ParkingSpace parkingSpace64 = new models.parkingSpace.ParkingSpace(uUID59, parkingLot60, parkingSpaceStatus61, "", false);
        java.lang.String str65 = parkingSpace64.toString();
        parkingSpace64.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus67 = parkingSpace64.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace70 = new models.parkingSpace.ParkingSpace(uUID57, parkingLot58, parkingSpaceStatus67, "", false);
        java.util.UUID uUID71 = parkingSpace70.getID();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus72 = parkingSpace70.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace75 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot56, parkingSpaceStatus72, "hi!", false);
        models.parkingLot.ParkingLot parkingLot76 = null;
        java.util.UUID uUID77 = null;
        models.parkingLot.ParkingLot parkingLot78 = null;
        java.util.UUID uUID79 = null;
        models.parkingLot.ParkingLot parkingLot80 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus81 = null;
        models.parkingSpace.ParkingSpace parkingSpace84 = new models.parkingSpace.ParkingSpace(uUID79, parkingLot80, parkingSpaceStatus81, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus85 = null;
        parkingSpace84.setStatus(parkingSpaceStatus85);
        parkingSpace84.setEnabled(true);
        boolean boolean89 = parkingSpace84.isEnabled();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus90 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        boolean boolean91 = parkingSpace84.equals((java.lang.Object) parkingSpaceStatus90);
        models.parkingSpace.ParkingSpace parkingSpace94 = new models.parkingSpace.ParkingSpace(uUID77, parkingLot78, parkingSpaceStatus90, "", true);
        models.parkingSpace.ParkingSpace parkingSpace97 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot76, parkingSpaceStatus90, "", true);
        boolean boolean98 = parkingSpace97.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "8fca82a3-f6d6-4e8d-acc9-95be9fe22e64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus49 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus49.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus67 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus67.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID71);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus72 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus72.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus90 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus90.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingLot.ParkingLot parkingLot21 = null;
        models.parkingSpace.ParkingSpace parkingSpace23 = new models.parkingSpace.ParkingSpace(parkingLot21, "hi!");
        parkingSpace23.setEnabled(true);
        java.util.UUID uUID26 = parkingSpace23.getID();
        models.parkingLot.ParkingLot parkingLot27 = null;
        java.util.UUID uUID28 = null;
        models.parkingLot.ParkingLot parkingLot29 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus30 = null;
        models.parkingSpace.ParkingSpace parkingSpace33 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus30, "", false);
        java.lang.String str34 = parkingSpace33.toString();
        models.parkingLot.ParkingLot parkingLot35 = parkingSpace33.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus36 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace33.setStatus(parkingSpaceStatus36);
        models.parkingSpace.ParkingSpace parkingSpace40 = new models.parkingSpace.ParkingSpace(uUID26, parkingLot27, parkingSpaceStatus36, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace43 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus36, "hi!", true);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus44 = parkingSpace43.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "71d45097-5eb5-4165-a282-6d82d9dba7c1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID26);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID26.toString(), "68fc4713-80d8-44cb-b393-621de8d35f9c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot35);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus36 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus36.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus44 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus44.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        models.parkingLot.ParkingLot parkingLot13 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = new models.parkingSpace.ParkingSpace(parkingLot13, "");
        boolean boolean16 = parkingSpace15.isEnabled();
        boolean boolean17 = parkingSpace15.isEnabled();
        java.util.UUID uUID18 = null;
        models.parkingLot.ParkingLot parkingLot19 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus20 = null;
        models.parkingSpace.ParkingSpace parkingSpace23 = new models.parkingSpace.ParkingSpace(uUID18, parkingLot19, parkingSpaceStatus20, "", false);
        java.lang.String str24 = parkingSpace23.toString();
        parkingSpace23.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus26 = parkingSpace23.getStatus();
        boolean boolean27 = parkingSpace23.isEnabled();
        java.lang.Object obj28 = null;
        boolean boolean29 = parkingSpace23.equals(obj28);
        java.lang.Class<?> wildcardClass30 = parkingSpace23.getClass();
        boolean boolean31 = parkingSpace15.equals((java.lang.Object) parkingSpace23);
        java.util.UUID uUID32 = null;
        models.parkingLot.ParkingLot parkingLot33 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus34 = null;
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID32, parkingLot33, parkingSpaceStatus34, "", false);
        java.lang.String str38 = parkingSpace37.toString();
        parkingSpace37.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus40 = parkingSpace37.getStatus();
        boolean boolean42 = parkingSpace37.equals((java.lang.Object) 1.0f);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus43 = parkingSpace37.getStatus();
        parkingSpace15.setStatus(parkingSpaceStatus43);
        parkingSpace5.setStatus(parkingSpaceStatus43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus26 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus26.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus40 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus40.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus43 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus43.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        java.lang.String str11 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingLot.ParkingLot parkingLot13 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = new models.parkingSpace.ParkingSpace(parkingLot13, "hi!");
        parkingSpace15.setEnabled(true);
        java.util.UUID uUID18 = parkingSpace15.getID();
        models.parkingLot.ParkingLot parkingLot19 = null;
        java.util.UUID uUID20 = null;
        models.parkingLot.ParkingLot parkingLot21 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus22 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(uUID20, parkingLot21, parkingSpaceStatus22, "", false);
        java.lang.String str26 = parkingSpace25.toString();
        models.parkingLot.ParkingLot parkingLot27 = parkingSpace25.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus28 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace25.setStatus(parkingSpaceStatus28);
        models.parkingSpace.ParkingSpace parkingSpace32 = new models.parkingSpace.ParkingSpace(uUID18, parkingLot19, parkingSpaceStatus28, "hi!", true);
        models.parkingLot.ParkingLot parkingLot33 = null;
        java.util.UUID uUID34 = null;
        models.parkingLot.ParkingLot parkingLot35 = null;
        java.util.UUID uUID36 = null;
        models.parkingLot.ParkingLot parkingLot37 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus38 = null;
        models.parkingSpace.ParkingSpace parkingSpace41 = new models.parkingSpace.ParkingSpace(uUID36, parkingLot37, parkingSpaceStatus38, "", false);
        java.lang.String str42 = parkingSpace41.toString();
        parkingSpace41.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus44 = parkingSpace41.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace47 = new models.parkingSpace.ParkingSpace(uUID34, parkingLot35, parkingSpaceStatus44, "", true);
        models.parkingSpace.ParkingSpace parkingSpace50 = new models.parkingSpace.ParkingSpace(uUID18, parkingLot33, parkingSpaceStatus44, "hi!", false);
        models.parkingLot.ParkingLot parkingLot51 = null;
        java.util.UUID uUID52 = null;
        models.parkingLot.ParkingLot parkingLot53 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus54 = null;
        models.parkingSpace.ParkingSpace parkingSpace57 = new models.parkingSpace.ParkingSpace(uUID52, parkingLot53, parkingSpaceStatus54, "", false);
        java.lang.String str58 = parkingSpace57.toString();
        parkingSpace57.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus60 = parkingSpace57.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace63 = new models.parkingSpace.ParkingSpace(uUID18, parkingLot51, parkingSpaceStatus60, "", true);
        parkingSpace5.setStatus(parkingSpaceStatus60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID18);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID18.toString(), "52c16acb-ab85-4d26-8748-aca492925376");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot27);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus28 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus28.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus44 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus44.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus60 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus60.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean8 = parkingSpace5.isEnabled();
        boolean boolean9 = parkingSpace5.isBookable();
        java.lang.String str10 = parkingSpace5.getName();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus11 = parkingSpace5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus11 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus11.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus31, "", true);
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus31, "hi!", false);
        models.parkingLot.ParkingLot parkingLot38 = null;
        java.util.UUID uUID39 = null;
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.UUID uUID41 = null;
        models.parkingLot.ParkingLot parkingLot42 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus43 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(uUID41, parkingLot42, parkingSpaceStatus43, "", false);
        java.lang.String str47 = parkingSpace46.toString();
        parkingSpace46.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus49 = parkingSpace46.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace52 = new models.parkingSpace.ParkingSpace(uUID39, parkingLot40, parkingSpaceStatus49, "", true);
        models.parkingSpace.ParkingSpace parkingSpace55 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot38, parkingSpaceStatus49, "", true);
        models.parkingLot.ParkingLot parkingLot56 = parkingSpace55.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "d1fe7a7c-d71a-4ab3-9328-951e7da8a1da");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus49 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus49.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot56);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingLot.ParkingLot parkingLot2 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = new models.parkingSpace.ParkingSpace(parkingLot2, "hi!");
        parkingSpace4.setEnabled(true);
        java.util.UUID uUID7 = parkingSpace4.getID();
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.UUID uUID9 = null;
        models.parkingLot.ParkingLot parkingLot10 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus11 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = new models.parkingSpace.ParkingSpace(uUID9, parkingLot10, parkingSpaceStatus11, "", false);
        java.lang.String str15 = parkingSpace14.toString();
        models.parkingLot.ParkingLot parkingLot16 = parkingSpace14.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus17 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace14.setStatus(parkingSpaceStatus17);
        models.parkingSpace.ParkingSpace parkingSpace21 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus17, "hi!", true);
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.UUID uUID25 = null;
        models.parkingLot.ParkingLot parkingLot26 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus27 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = new models.parkingSpace.ParkingSpace(uUID25, parkingLot26, parkingSpaceStatus27, "", false);
        java.lang.String str31 = parkingSpace30.toString();
        parkingSpace30.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus33 = parkingSpace30.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace36 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus33, "", true);
        models.parkingSpace.ParkingSpace parkingSpace39 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot22, parkingSpaceStatus33, "hi!", false);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus33, "hi!", true);
        parkingSpace42.setEnabled(true);
        java.lang.String str45 = parkingSpace42.getName();
        boolean boolean46 = parkingSpace42.isBookable();
        parkingSpace42.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "e7fd525b-4384-45c3-9f91-f8005fc1b1de");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot16);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus17 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus17.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus33 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus33.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.getName();
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace13.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace5.getStatus();
        models.parkingLot.ParkingLot parkingLot11 = parkingSpace5.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", false);
        models.parkingLot.ParkingLot parkingLot14 = null;
        models.parkingSpace.ParkingSpace parkingSpace16 = new models.parkingSpace.ParkingSpace(parkingLot14, "hi!");
        parkingSpace16.setEnabled(true);
        java.util.UUID uUID19 = parkingSpace16.getID();
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus23 = null;
        models.parkingSpace.ParkingSpace parkingSpace26 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus23, "", false);
        java.lang.String str27 = parkingSpace26.toString();
        models.parkingLot.ParkingLot parkingLot28 = parkingSpace26.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus29 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace26.setStatus(parkingSpaceStatus29);
        models.parkingSpace.ParkingSpace parkingSpace33 = new models.parkingSpace.ParkingSpace(uUID19, parkingLot20, parkingSpaceStatus29, "hi!", true);
        models.parkingLot.ParkingLot parkingLot34 = null;
        java.util.UUID uUID35 = null;
        models.parkingLot.ParkingLot parkingLot36 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus37 = null;
        models.parkingSpace.ParkingSpace parkingSpace40 = new models.parkingSpace.ParkingSpace(uUID35, parkingLot36, parkingSpaceStatus37, "", false);
        java.lang.String str41 = parkingSpace40.toString();
        parkingSpace40.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus43 = parkingSpace40.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(uUID19, parkingLot34, parkingSpaceStatus43, "hi!", false);
        parkingSpace13.setStatus(parkingSpaceStatus43);
        java.lang.Class<?> wildcardClass48 = parkingSpaceStatus43.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "9543152f-c1b8-4f51-8359-8bb84c42dde3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot28);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus29 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus29.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus43 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus43.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean8 = parkingSpace5.isEnabled();
        boolean boolean9 = parkingSpace5.isBookable();
        parkingSpace5.checkOut();
        boolean boolean11 = parkingSpace5.isBookable();
        boolean boolean13 = parkingSpace5.equals((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass14 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingLot.ParkingLot parkingLot2 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = new models.parkingSpace.ParkingSpace(parkingLot2, "hi!");
        parkingSpace4.setEnabled(true);
        java.util.UUID uUID7 = parkingSpace4.getID();
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.UUID uUID9 = null;
        models.parkingLot.ParkingLot parkingLot10 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus11 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = new models.parkingSpace.ParkingSpace(uUID9, parkingLot10, parkingSpaceStatus11, "", false);
        java.lang.String str15 = parkingSpace14.toString();
        models.parkingLot.ParkingLot parkingLot16 = parkingSpace14.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus17 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace14.setStatus(parkingSpaceStatus17);
        models.parkingSpace.ParkingSpace parkingSpace21 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus17, "hi!", true);
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.UUID uUID25 = null;
        models.parkingLot.ParkingLot parkingLot26 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus27 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = new models.parkingSpace.ParkingSpace(uUID25, parkingLot26, parkingSpaceStatus27, "", false);
        java.lang.String str31 = parkingSpace30.toString();
        parkingSpace30.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus33 = parkingSpace30.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace36 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus33, "", true);
        models.parkingSpace.ParkingSpace parkingSpace39 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot22, parkingSpaceStatus33, "hi!", false);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus33, "hi!", true);
        parkingSpace42.setEnabled(true);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus45 = parkingSpace42.getStatus();
        boolean boolean46 = parkingSpace42.isBookable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "d6353cbf-eaed-44d8-af48-62f176c4e12c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot16);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus17 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus17.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus33 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus33.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus45 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus45.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingLot.ParkingLot parkingLot23 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(parkingLot23, "hi!");
        parkingSpace25.setEnabled(true);
        java.util.UUID uUID28 = parkingSpace25.getID();
        models.parkingLot.ParkingLot parkingLot29 = null;
        java.util.UUID uUID30 = null;
        models.parkingLot.ParkingLot parkingLot31 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus32 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = new models.parkingSpace.ParkingSpace(uUID30, parkingLot31, parkingSpaceStatus32, "", false);
        java.lang.String str36 = parkingSpace35.toString();
        models.parkingLot.ParkingLot parkingLot37 = parkingSpace35.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus38 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace35.setStatus(parkingSpaceStatus38);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus38, "hi!", true);
        models.parkingLot.ParkingLot parkingLot43 = null;
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(parkingLot44, "hi!");
        parkingSpace46.setEnabled(true);
        java.util.UUID uUID49 = parkingSpace46.getID();
        models.parkingLot.ParkingLot parkingLot50 = null;
        java.util.UUID uUID51 = null;
        models.parkingLot.ParkingLot parkingLot52 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID51, parkingLot52, parkingSpaceStatus53, "", false);
        java.lang.String str57 = parkingSpace56.toString();
        models.parkingLot.ParkingLot parkingLot58 = parkingSpace56.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace56.setStatus(parkingSpaceStatus59);
        models.parkingSpace.ParkingSpace parkingSpace63 = new models.parkingSpace.ParkingSpace(uUID49, parkingLot50, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot43, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace69 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus59, "", true);
        java.util.UUID uUID70 = parkingSpace69.getID();
        parkingSpace69.checkOut();
        boolean boolean72 = parkingSpace69.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "58245ef5-2ae5-40cb-8269-b2d7e036371a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID28);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID28.toString(), "df14a14f-b498-4d9b-99f2-d88bf50d1259");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot37);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus38 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus38.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID49);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID49.toString(), "8be07bd5-b84e-45c9-af9e-4e7686afa508");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus59 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus59.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID70);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID70.toString(), "58245ef5-2ae5-40cb-8269-b2d7e036371a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus31, "", true);
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus31, "hi!", false);
        models.parkingLot.ParkingLot parkingLot38 = null;
        java.util.UUID uUID39 = null;
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.UUID uUID41 = null;
        models.parkingLot.ParkingLot parkingLot42 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus43 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(uUID41, parkingLot42, parkingSpaceStatus43, "", false);
        java.lang.String str47 = parkingSpace46.toString();
        parkingSpace46.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus49 = parkingSpace46.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace52 = new models.parkingSpace.ParkingSpace(uUID39, parkingLot40, parkingSpaceStatus49, "", true);
        models.parkingSpace.ParkingSpace parkingSpace55 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot38, parkingSpaceStatus49, "", true);
        models.parkingLot.ParkingLot parkingLot56 = null;
        java.util.UUID uUID57 = null;
        models.parkingLot.ParkingLot parkingLot58 = null;
        java.util.UUID uUID59 = null;
        models.parkingLot.ParkingLot parkingLot60 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus61 = null;
        models.parkingSpace.ParkingSpace parkingSpace64 = new models.parkingSpace.ParkingSpace(uUID59, parkingLot60, parkingSpaceStatus61, "", false);
        java.lang.String str65 = parkingSpace64.toString();
        parkingSpace64.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus67 = parkingSpace64.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace70 = new models.parkingSpace.ParkingSpace(uUID57, parkingLot58, parkingSpaceStatus67, "", true);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus71 = parkingSpace70.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace74 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot56, parkingSpaceStatus71, "hi!", true);
        java.lang.String str75 = parkingSpace74.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "699ad006-12fc-4b87-8497-704331e93037");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus49 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus49.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus67 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus67.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus71 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus71.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "hi!" + "'", str75.equals("hi!"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        java.lang.String str9 = parkingSpace7.getName();
        java.lang.String str10 = parkingSpace7.getName();
        boolean boolean11 = parkingSpace7.isBookable();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus12 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace7.setStatus(parkingSpaceStatus12);
        models.parkingSpace.ParkingSpace parkingSpace16 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus12, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus12 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus12.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "");
        java.lang.String str3 = parkingSpace2.toString();
        parkingSpace2.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        boolean boolean16 = parkingSpace5.isBookable();
        java.lang.String str17 = parkingSpace5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean8 = parkingSpace5.isEnabled();
        boolean boolean9 = parkingSpace5.isBookable();
        parkingSpace5.checkOut();
        boolean boolean11 = parkingSpace5.isEnabled();
        boolean boolean12 = parkingSpace5.isBookable();
        java.lang.String str13 = parkingSpace5.getName();
        java.lang.Class<?> wildcardClass14 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        java.lang.String str10 = parkingSpace5.getName();
        models.parkingLot.ParkingLot parkingLot11 = parkingSpace5.getLot();
        boolean boolean12 = parkingSpace5.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "");
        boolean boolean3 = parkingSpace2.isBookable();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = parkingSpace2.getStatus();
        models.parkingLot.ParkingLot parkingLot5 = parkingSpace2.getLot();
        boolean boolean6 = parkingSpace2.isBookable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus4 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus4.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingLot.ParkingLot parkingLot2 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = new models.parkingSpace.ParkingSpace(parkingLot2, "hi!");
        parkingSpace4.setEnabled(true);
        java.util.UUID uUID7 = parkingSpace4.getID();
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.UUID uUID9 = null;
        models.parkingLot.ParkingLot parkingLot10 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus11 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = new models.parkingSpace.ParkingSpace(uUID9, parkingLot10, parkingSpaceStatus11, "", false);
        java.lang.String str15 = parkingSpace14.toString();
        models.parkingLot.ParkingLot parkingLot16 = parkingSpace14.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus17 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace14.setStatus(parkingSpaceStatus17);
        models.parkingSpace.ParkingSpace parkingSpace21 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus17, "hi!", true);
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.UUID uUID25 = null;
        models.parkingLot.ParkingLot parkingLot26 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus27 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = new models.parkingSpace.ParkingSpace(uUID25, parkingLot26, parkingSpaceStatus27, "", false);
        java.lang.String str31 = parkingSpace30.toString();
        parkingSpace30.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus33 = parkingSpace30.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace36 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus33, "", true);
        models.parkingSpace.ParkingSpace parkingSpace39 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot22, parkingSpaceStatus33, "hi!", false);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus33, "hi!", true);
        parkingSpace42.setEnabled(true);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus45 = parkingSpace42.getStatus();
        boolean boolean46 = parkingSpace42.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "122d7229-24fd-4141-95d2-66f18fac7fcf");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot16);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus17 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus17.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus33 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus33.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus45 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus45.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus31, "", true);
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus31, "hi!", false);
        models.parkingLot.ParkingLot parkingLot38 = null;
        java.util.UUID uUID39 = null;
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.UUID uUID41 = null;
        models.parkingLot.ParkingLot parkingLot42 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus43 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(uUID41, parkingLot42, parkingSpaceStatus43, "", false);
        java.lang.String str47 = parkingSpace46.toString();
        parkingSpace46.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus49 = parkingSpace46.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace52 = new models.parkingSpace.ParkingSpace(uUID39, parkingLot40, parkingSpaceStatus49, "", true);
        models.parkingSpace.ParkingSpace parkingSpace55 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot38, parkingSpaceStatus49, "", true);
        models.parkingLot.ParkingLot parkingLot56 = null;
        java.util.UUID uUID57 = null;
        models.parkingLot.ParkingLot parkingLot58 = null;
        java.util.UUID uUID59 = null;
        models.parkingLot.ParkingLot parkingLot60 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus61 = null;
        models.parkingSpace.ParkingSpace parkingSpace64 = new models.parkingSpace.ParkingSpace(uUID59, parkingLot60, parkingSpaceStatus61, "", false);
        java.lang.String str65 = parkingSpace64.toString();
        parkingSpace64.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus67 = parkingSpace64.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace70 = new models.parkingSpace.ParkingSpace(uUID57, parkingLot58, parkingSpaceStatus67, "", false);
        java.util.UUID uUID71 = parkingSpace70.getID();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus72 = parkingSpace70.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace75 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot56, parkingSpaceStatus72, "hi!", false);
        boolean boolean76 = parkingSpace75.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "28cf3550-df48-47d2-b5cf-d69610f92f80");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus49 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus49.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus67 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus67.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID71);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus72 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus72.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        models.parkingLot.ParkingLot parkingLot8 = parkingSpace5.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot8);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace13.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace13.setStatus(parkingSpaceStatus16);
        parkingSpace5.setStatus(parkingSpaceStatus16);
        parkingSpace5.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        boolean boolean10 = parkingSpace5.isEnabled();
        models.parkingLot.ParkingLot parkingLot11 = parkingSpace5.getLot();
        boolean boolean12 = parkingSpace5.isEnabled();
        java.lang.Class<?> wildcardClass13 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.checkOut();
        parkingSpace5.checkOut();
        java.lang.String str10 = parkingSpace5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        models.parkingLot.ParkingLot parkingLot9 = parkingSpace7.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace7.setStatus(parkingSpaceStatus10);
        models.parkingSpace.ParkingSpace parkingSpace14 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "hi!", true);
        java.util.UUID uUID15 = null;
        models.parkingLot.ParkingLot parkingLot16 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus17 = null;
        models.parkingSpace.ParkingSpace parkingSpace20 = new models.parkingSpace.ParkingSpace(uUID15, parkingLot16, parkingSpaceStatus17, "", false);
        java.lang.String str21 = parkingSpace20.toString();
        parkingSpace20.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus23 = parkingSpace20.getStatus();
        boolean boolean25 = parkingSpace20.equals((java.lang.Object) 1.0f);
        models.parkingLot.ParkingLot parkingLot26 = parkingSpace20.getLot();
        boolean boolean27 = parkingSpace14.equals((java.lang.Object) parkingSpace20);
        java.lang.String str28 = parkingSpace14.getName();
        boolean boolean29 = parkingSpace14.isBookable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot9);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus23 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus23.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        models.parkingLot.ParkingLot parkingLot10 = parkingSpace5.getLot();
        boolean boolean12 = parkingSpace5.equals((java.lang.Object) false);
        boolean boolean13 = parkingSpace5.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        boolean boolean10 = parkingSpace5.isEnabled();
        models.parkingLot.ParkingLot parkingLot11 = parkingSpace5.getLot();
        boolean boolean12 = parkingSpace5.isEnabled();
        java.lang.String str13 = parkingSpace5.toString();
        java.lang.String str14 = parkingSpace5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace5.getStatus();
        java.util.UUID uUID17 = null;
        models.parkingLot.ParkingLot parkingLot18 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus19 = null;
        models.parkingSpace.ParkingSpace parkingSpace22 = new models.parkingSpace.ParkingSpace(uUID17, parkingLot18, parkingSpaceStatus19, "", false);
        java.lang.String str23 = parkingSpace22.toString();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus24 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        parkingSpace22.setStatus(parkingSpaceStatus24);
        boolean boolean26 = parkingSpace5.equals((java.lang.Object) parkingSpace22);
        boolean boolean27 = parkingSpace5.isBookable();
        parkingSpace5.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus24 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus24.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        models.parkingLot.ParkingLot parkingLot6 = null;
        models.parkingSpace.ParkingSpace parkingSpace8 = new models.parkingSpace.ParkingSpace(parkingLot6, "hi!");
        parkingSpace8.setEnabled(true);
        java.util.UUID uUID11 = null;
        models.parkingLot.ParkingLot parkingLot12 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = null;
        models.parkingSpace.ParkingSpace parkingSpace16 = new models.parkingSpace.ParkingSpace(uUID11, parkingLot12, parkingSpaceStatus13, "", false);
        java.lang.String str17 = parkingSpace16.toString();
        models.parkingLot.ParkingLot parkingLot18 = parkingSpace16.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus19 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace16.setStatus(parkingSpaceStatus19);
        parkingSpace8.setStatus(parkingSpaceStatus19);
        parkingSpace2.setStatus(parkingSpaceStatus19);
        java.util.UUID uUID23 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.UUID uUID25 = null;
        models.parkingLot.ParkingLot parkingLot26 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus27 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = new models.parkingSpace.ParkingSpace(uUID25, parkingLot26, parkingSpaceStatus27, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = null;
        parkingSpace30.setStatus(parkingSpaceStatus31);
        parkingSpace30.setEnabled(true);
        boolean boolean35 = parkingSpace30.isEnabled();
        parkingSpace30.checkOut();
        java.util.UUID uUID37 = parkingSpace30.getID();
        parkingSpace30.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot40 = parkingSpace30.getLot();
        java.lang.String str41 = parkingSpace30.getName();
        parkingSpace30.checkOut();
        boolean boolean43 = parkingSpace30.isEnabled();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus44 = parkingSpace30.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace47 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus44, "", true);
        models.parkingLot.ParkingLot parkingLot48 = null;
        java.util.UUID uUID49 = null;
        models.parkingLot.ParkingLot parkingLot50 = null;
        java.util.UUID uUID51 = null;
        models.parkingLot.ParkingLot parkingLot52 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID51, parkingLot52, parkingSpaceStatus53, "", false);
        java.lang.String str57 = parkingSpace56.toString();
        parkingSpace56.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = parkingSpace56.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace62 = new models.parkingSpace.ParkingSpace(uUID49, parkingLot50, parkingSpaceStatus59, "", false);
        models.parkingSpace.ParkingSpace parkingSpace65 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot48, parkingSpaceStatus59, "", true);
        java.lang.Class<?> wildcardClass66 = uUID23.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot18);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus19 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus19.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID23);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID23.toString(), "7a168cb8-eadd-4325-9f41-c1baa283ce94");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus44 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus44.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus59 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus59.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        boolean boolean10 = parkingSpace5.isEnabled();
        models.parkingLot.ParkingLot parkingLot11 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(parkingLot11, "hi!");
        java.util.UUID uUID14 = null;
        models.parkingLot.ParkingLot parkingLot15 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = null;
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID14, parkingLot15, parkingSpaceStatus16, "", false);
        java.lang.String str20 = parkingSpace19.toString();
        parkingSpace19.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus22 = parkingSpace19.getStatus();
        boolean boolean24 = parkingSpace19.equals((java.lang.Object) 1.0f);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = parkingSpace19.getStatus();
        parkingSpace13.setStatus(parkingSpaceStatus25);
        parkingSpace5.setStatus(parkingSpaceStatus25);
        java.lang.String str28 = parkingSpace5.toString();
        java.lang.Class<?> wildcardClass29 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus22 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus22.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus25 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus25.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        parkingSpace2.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "fe0de4eb-9c47-4af7-95e1-6c84ddd85314");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus23 = null;
        models.parkingSpace.ParkingSpace parkingSpace26 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus23, "", false);
        java.lang.String str27 = parkingSpace26.toString();
        parkingSpace26.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus29 = parkingSpace26.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace32 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus29, "hi!", false);
        models.parkingLot.ParkingLot parkingLot33 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = new models.parkingSpace.ParkingSpace(parkingLot33, "hi!");
        parkingSpace35.setEnabled(true);
        java.util.UUID uUID38 = parkingSpace35.getID();
        models.parkingLot.ParkingLot parkingLot39 = null;
        java.util.UUID uUID40 = null;
        models.parkingLot.ParkingLot parkingLot41 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus42 = null;
        models.parkingSpace.ParkingSpace parkingSpace45 = new models.parkingSpace.ParkingSpace(uUID40, parkingLot41, parkingSpaceStatus42, "", false);
        java.lang.String str46 = parkingSpace45.toString();
        models.parkingLot.ParkingLot parkingLot47 = parkingSpace45.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus48 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace45.setStatus(parkingSpaceStatus48);
        models.parkingSpace.ParkingSpace parkingSpace52 = new models.parkingSpace.ParkingSpace(uUID38, parkingLot39, parkingSpaceStatus48, "hi!", true);
        models.parkingLot.ParkingLot parkingLot53 = null;
        models.parkingLot.ParkingLot parkingLot54 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(parkingLot54, "hi!");
        parkingSpace56.setEnabled(true);
        java.util.UUID uUID59 = parkingSpace56.getID();
        models.parkingLot.ParkingLot parkingLot60 = null;
        java.util.UUID uUID61 = null;
        models.parkingLot.ParkingLot parkingLot62 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus63 = null;
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(uUID61, parkingLot62, parkingSpaceStatus63, "", false);
        java.lang.String str67 = parkingSpace66.toString();
        models.parkingLot.ParkingLot parkingLot68 = parkingSpace66.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus69 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace66.setStatus(parkingSpaceStatus69);
        models.parkingSpace.ParkingSpace parkingSpace73 = new models.parkingSpace.ParkingSpace(uUID59, parkingLot60, parkingSpaceStatus69, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace76 = new models.parkingSpace.ParkingSpace(uUID38, parkingLot53, parkingSpaceStatus69, "hi!", true);
        parkingSpace32.setStatus(parkingSpaceStatus69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "a7dcd458-222a-4b4d-b56a-ace9727940d8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus29 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus29.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID38);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID38.toString(), "ec293d14-31dc-45e7-bb28-cfa0c1a475e6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot47);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus48 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus48.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID59);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID59.toString(), "0e8acac5-6f72-4759-97e0-3c33b344c9f0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot68);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus69 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus69.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "");
        boolean boolean3 = parkingSpace2.isEnabled();
        boolean boolean4 = parkingSpace2.isEnabled();
        java.util.UUID uUID5 = null;
        models.parkingLot.ParkingLot parkingLot6 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus7 = null;
        models.parkingSpace.ParkingSpace parkingSpace10 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus7, "", false);
        java.lang.String str11 = parkingSpace10.toString();
        parkingSpace10.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = parkingSpace10.getStatus();
        boolean boolean14 = parkingSpace10.isEnabled();
        java.lang.Object obj15 = null;
        boolean boolean16 = parkingSpace10.equals(obj15);
        java.lang.Class<?> wildcardClass17 = parkingSpace10.getClass();
        boolean boolean18 = parkingSpace2.equals((java.lang.Object) parkingSpace10);
        java.util.UUID uUID19 = null;
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = null;
        models.parkingSpace.ParkingSpace parkingSpace24 = new models.parkingSpace.ParkingSpace(uUID19, parkingLot20, parkingSpaceStatus21, "", false);
        java.lang.String str25 = parkingSpace24.toString();
        parkingSpace24.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus27 = parkingSpace24.getStatus();
        boolean boolean29 = parkingSpace24.equals((java.lang.Object) 1.0f);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus30 = parkingSpace24.getStatus();
        parkingSpace2.setStatus(parkingSpaceStatus30);
        boolean boolean32 = parkingSpace2.isBookable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus13 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus13.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus27 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus27.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus30 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus30.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = null;
        models.parkingLot.ParkingLot parkingLot6 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus7 = null;
        models.parkingSpace.ParkingSpace parkingSpace10 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus7, "", false);
        java.lang.String str11 = parkingSpace10.toString();
        models.parkingLot.ParkingLot parkingLot12 = parkingSpace10.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace10.setStatus(parkingSpaceStatus13);
        parkingSpace2.setStatus(parkingSpaceStatus13);
        models.parkingLot.ParkingLot parkingLot16 = parkingSpace2.getLot();
        boolean boolean17 = parkingSpace2.isBookable();
        parkingSpace2.setEnabled(true);
        models.parkingLot.ParkingLot parkingLot20 = parkingSpace2.getLot();
        parkingSpace2.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus13 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus13.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot20);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        java.lang.String str7 = parkingSpace5.getName();
        java.lang.String str8 = parkingSpace5.getName();
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace parkingSpace11 = new models.parkingSpace.ParkingSpace(parkingLot9, "hi!");
        parkingSpace11.setEnabled(true);
        java.util.UUID uUID14 = parkingSpace11.getID();
        models.parkingLot.ParkingLot parkingLot15 = null;
        java.util.UUID uUID16 = null;
        models.parkingLot.ParkingLot parkingLot17 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus18 = null;
        models.parkingSpace.ParkingSpace parkingSpace21 = new models.parkingSpace.ParkingSpace(uUID16, parkingLot17, parkingSpaceStatus18, "", false);
        java.lang.String str22 = parkingSpace21.toString();
        models.parkingLot.ParkingLot parkingLot23 = parkingSpace21.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus24 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace21.setStatus(parkingSpaceStatus24);
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID14, parkingLot15, parkingSpaceStatus24, "hi!", true);
        boolean boolean29 = parkingSpace5.equals((java.lang.Object) true);
        parkingSpace5.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "561a6552-6e3e-481a-a600-c51b49bde848");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot23);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus24 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus24.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingLot.ParkingLot parkingLot21 = null;
        models.parkingSpace.ParkingSpace parkingSpace23 = new models.parkingSpace.ParkingSpace(parkingLot21, "hi!");
        parkingSpace23.setEnabled(true);
        java.util.UUID uUID26 = parkingSpace23.getID();
        models.parkingLot.ParkingLot parkingLot27 = null;
        java.util.UUID uUID28 = null;
        models.parkingLot.ParkingLot parkingLot29 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus30 = null;
        models.parkingSpace.ParkingSpace parkingSpace33 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus30, "", false);
        java.lang.String str34 = parkingSpace33.toString();
        models.parkingLot.ParkingLot parkingLot35 = parkingSpace33.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus36 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace33.setStatus(parkingSpaceStatus36);
        models.parkingSpace.ParkingSpace parkingSpace40 = new models.parkingSpace.ParkingSpace(uUID26, parkingLot27, parkingSpaceStatus36, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace43 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus36, "hi!", true);
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus45 = null;
        models.parkingSpace.ParkingSpace parkingSpace48 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot44, parkingSpaceStatus45, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "f70d45a6-f091-44b7-ba7a-5f7438aba406");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID26);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID26.toString(), "0c78452f-95e6-4b0f-93c6-c2363cddac0c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot35);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus36 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus36.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        java.lang.String str16 = parkingSpace5.getName();
        parkingSpace5.checkOut();
        boolean boolean18 = parkingSpace5.isEnabled();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus19 = parkingSpace5.getStatus();
        models.parkingLot.ParkingLot parkingLot20 = parkingSpace5.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus19 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus19.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot20);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        models.parkingLot.ParkingLot parkingLot6 = null;
        models.parkingSpace.ParkingSpace parkingSpace8 = new models.parkingSpace.ParkingSpace(parkingLot6, "hi!");
        parkingSpace8.setEnabled(true);
        java.util.UUID uUID11 = null;
        models.parkingLot.ParkingLot parkingLot12 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = null;
        models.parkingSpace.ParkingSpace parkingSpace16 = new models.parkingSpace.ParkingSpace(uUID11, parkingLot12, parkingSpaceStatus13, "", false);
        java.lang.String str17 = parkingSpace16.toString();
        models.parkingLot.ParkingLot parkingLot18 = parkingSpace16.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus19 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace16.setStatus(parkingSpaceStatus19);
        parkingSpace8.setStatus(parkingSpaceStatus19);
        parkingSpace2.setStatus(parkingSpaceStatus19);
        java.util.UUID uUID23 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.UUID uUID25 = null;
        models.parkingLot.ParkingLot parkingLot26 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus27 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = new models.parkingSpace.ParkingSpace(uUID25, parkingLot26, parkingSpaceStatus27, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = null;
        parkingSpace30.setStatus(parkingSpaceStatus31);
        parkingSpace30.setEnabled(true);
        boolean boolean35 = parkingSpace30.isEnabled();
        parkingSpace30.checkOut();
        java.util.UUID uUID37 = null;
        models.parkingLot.ParkingLot parkingLot38 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus39 = null;
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID37, parkingLot38, parkingSpaceStatus39, "", false);
        java.lang.String str43 = parkingSpace42.toString();
        parkingSpace42.checkOut();
        boolean boolean45 = parkingSpace42.isEnabled();
        models.parkingLot.ParkingLot parkingLot46 = parkingSpace42.getLot();
        boolean boolean47 = parkingSpace30.equals((java.lang.Object) parkingLot46);
        java.util.UUID uUID48 = null;
        models.parkingLot.ParkingLot parkingLot49 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus50 = null;
        models.parkingSpace.ParkingSpace parkingSpace53 = new models.parkingSpace.ParkingSpace(uUID48, parkingLot49, parkingSpaceStatus50, "", false);
        java.lang.String str54 = parkingSpace53.toString();
        parkingSpace53.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus56 = parkingSpace53.getStatus();
        parkingSpace30.setStatus(parkingSpaceStatus56);
        models.parkingSpace.ParkingSpace parkingSpace60 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus56, "", true);
        boolean boolean61 = parkingSpace60.isEnabled();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus62 = parkingSpace60.getStatus();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus63 = parkingSpace60.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot18);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus19 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus19.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID23);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID23.toString(), "8a05a7b6-23cb-4fae-b362-6d8d4cd2791c");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus56 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus56.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus62 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus62.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus63 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus63.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingLot.ParkingLot parkingLot8 = parkingSpace5.getLot();
        parkingSpace5.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        java.lang.String str7 = parkingSpace5.getName();
        java.lang.String str8 = parkingSpace5.getName();
        boolean boolean9 = parkingSpace5.isBookable();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus10);
        java.util.UUID uUID12 = parkingSpace5.getID();
        models.parkingLot.ParkingLot parkingLot13 = parkingSpace5.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot13);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", true);
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace13.getLot();
        boolean boolean15 = parkingSpace13.isBookable();
        models.parkingLot.ParkingLot parkingLot16 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(parkingLot16, "hi!");
        boolean boolean19 = parkingSpace13.equals((java.lang.Object) parkingSpace18);
        models.parkingLot.ParkingLot parkingLot20 = parkingSpace13.getLot();
        parkingSpace13.checkOut();
        parkingSpace13.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot20);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.UUID uUID2 = null;
        models.parkingLot.ParkingLot parkingLot3 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus4 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = new models.parkingSpace.ParkingSpace(uUID2, parkingLot3, parkingSpaceStatus4, "", false);
        java.lang.String str8 = parkingSpace7.toString();
        parkingSpace7.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = parkingSpace7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus10, "", false);
        java.util.UUID uUID14 = parkingSpace13.getID();
        java.util.UUID uUID15 = parkingSpace13.getID();
        java.util.UUID uUID16 = parkingSpace13.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus10 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus10.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID16);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "");
        boolean boolean3 = parkingSpace2.isEnabled();
        boolean boolean4 = parkingSpace2.isEnabled();
        java.util.UUID uUID5 = null;
        models.parkingLot.ParkingLot parkingLot6 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus7 = null;
        models.parkingSpace.ParkingSpace parkingSpace10 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus7, "", false);
        java.lang.String str11 = parkingSpace10.toString();
        parkingSpace10.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = parkingSpace10.getStatus();
        boolean boolean14 = parkingSpace10.isEnabled();
        java.lang.Object obj15 = null;
        boolean boolean16 = parkingSpace10.equals(obj15);
        java.lang.Class<?> wildcardClass17 = parkingSpace10.getClass();
        boolean boolean18 = parkingSpace2.equals((java.lang.Object) parkingSpace10);
        java.util.UUID uUID19 = null;
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = null;
        models.parkingSpace.ParkingSpace parkingSpace24 = new models.parkingSpace.ParkingSpace(uUID19, parkingLot20, parkingSpaceStatus21, "", false);
        java.lang.String str25 = parkingSpace24.toString();
        parkingSpace24.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus27 = parkingSpace24.getStatus();
        boolean boolean29 = parkingSpace24.equals((java.lang.Object) 1.0f);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus30 = parkingSpace24.getStatus();
        parkingSpace2.setStatus(parkingSpaceStatus30);
        boolean boolean32 = parkingSpace2.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus13 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus13.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus27 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus27.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus30 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus30.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingLot.ParkingLot parkingLot23 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(parkingLot23, "hi!");
        parkingSpace25.setEnabled(true);
        java.util.UUID uUID28 = parkingSpace25.getID();
        models.parkingLot.ParkingLot parkingLot29 = null;
        java.util.UUID uUID30 = null;
        models.parkingLot.ParkingLot parkingLot31 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus32 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = new models.parkingSpace.ParkingSpace(uUID30, parkingLot31, parkingSpaceStatus32, "", false);
        java.lang.String str36 = parkingSpace35.toString();
        models.parkingLot.ParkingLot parkingLot37 = parkingSpace35.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus38 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace35.setStatus(parkingSpaceStatus38);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus38, "hi!", true);
        models.parkingLot.ParkingLot parkingLot43 = null;
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(parkingLot44, "hi!");
        parkingSpace46.setEnabled(true);
        java.util.UUID uUID49 = parkingSpace46.getID();
        models.parkingLot.ParkingLot parkingLot50 = null;
        java.util.UUID uUID51 = null;
        models.parkingLot.ParkingLot parkingLot52 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID51, parkingLot52, parkingSpaceStatus53, "", false);
        java.lang.String str57 = parkingSpace56.toString();
        models.parkingLot.ParkingLot parkingLot58 = parkingSpace56.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace56.setStatus(parkingSpaceStatus59);
        models.parkingSpace.ParkingSpace parkingSpace63 = new models.parkingSpace.ParkingSpace(uUID49, parkingLot50, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot43, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace69 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus59, "", true);
        java.util.UUID uUID70 = parkingSpace69.getID();
        models.parkingLot.ParkingLot parkingLot71 = null;
        java.util.UUID uUID72 = null;
        models.parkingLot.ParkingLot parkingLot73 = null;
        java.util.UUID uUID74 = null;
        models.parkingLot.ParkingLot parkingLot75 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus76 = null;
        models.parkingSpace.ParkingSpace parkingSpace79 = new models.parkingSpace.ParkingSpace(uUID74, parkingLot75, parkingSpaceStatus76, "", false);
        java.lang.String str80 = parkingSpace79.toString();
        parkingSpace79.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus82 = parkingSpace79.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace85 = new models.parkingSpace.ParkingSpace(uUID72, parkingLot73, parkingSpaceStatus82, "", true);
        models.parkingSpace.ParkingSpace parkingSpace88 = new models.parkingSpace.ParkingSpace(uUID70, parkingLot71, parkingSpaceStatus82, "", true);
        java.lang.String str89 = parkingSpace88.getName();
        java.lang.Class<?> wildcardClass90 = parkingSpace88.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "be89cd76-eff3-4cac-abcf-aa147accb7c3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID28);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID28.toString(), "d786cf82-89e4-48cd-8520-da93a5f6c705");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot37);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus38 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus38.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID49);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID49.toString(), "5d8df390-40f4-48a3-b6e8-44afe86bd923");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus59 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus59.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID70);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID70.toString(), "be89cd76-eff3-4cac-abcf-aa147accb7c3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus82 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus82.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "" + "'", str89.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        java.lang.String str15 = parkingSpace5.toString();
        java.util.UUID uUID16 = parkingSpace5.getID();
        java.lang.String str17 = parkingSpace5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = null;
        models.parkingLot.ParkingLot parkingLot6 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus7 = null;
        models.parkingSpace.ParkingSpace parkingSpace10 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus7, "", false);
        java.lang.String str11 = parkingSpace10.toString();
        models.parkingLot.ParkingLot parkingLot12 = parkingSpace10.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace10.setStatus(parkingSpaceStatus13);
        parkingSpace2.setStatus(parkingSpaceStatus13);
        models.parkingLot.ParkingLot parkingLot16 = parkingSpace2.getLot();
        boolean boolean17 = parkingSpace2.isBookable();
        models.parkingLot.ParkingLot parkingLot18 = null;
        models.parkingSpace.ParkingSpace parkingSpace20 = new models.parkingSpace.ParkingSpace(parkingLot18, "");
        boolean boolean21 = parkingSpace20.isBookable();
        java.util.UUID uUID22 = parkingSpace20.getID();
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        models.parkingLot.ParkingLot parkingLot30 = parkingSpace28.getLot();
        models.parkingLot.ParkingLot parkingLot31 = null;
        models.parkingSpace.ParkingSpace parkingSpace33 = new models.parkingSpace.ParkingSpace(parkingLot31, "hi!");
        parkingSpace33.setEnabled(true);
        java.util.UUID uUID36 = parkingSpace33.getID();
        models.parkingLot.ParkingLot parkingLot37 = null;
        java.util.UUID uUID38 = null;
        models.parkingLot.ParkingLot parkingLot39 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus40 = null;
        models.parkingSpace.ParkingSpace parkingSpace43 = new models.parkingSpace.ParkingSpace(uUID38, parkingLot39, parkingSpaceStatus40, "", false);
        java.lang.String str44 = parkingSpace43.toString();
        models.parkingLot.ParkingLot parkingLot45 = parkingSpace43.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus46 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace43.setStatus(parkingSpaceStatus46);
        models.parkingSpace.ParkingSpace parkingSpace50 = new models.parkingSpace.ParkingSpace(uUID36, parkingLot37, parkingSpaceStatus46, "hi!", true);
        models.parkingLot.ParkingLot parkingLot51 = null;
        java.util.UUID uUID52 = null;
        models.parkingLot.ParkingLot parkingLot53 = null;
        java.util.UUID uUID54 = null;
        models.parkingLot.ParkingLot parkingLot55 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus56 = null;
        models.parkingSpace.ParkingSpace parkingSpace59 = new models.parkingSpace.ParkingSpace(uUID54, parkingLot55, parkingSpaceStatus56, "", false);
        java.lang.String str60 = parkingSpace59.toString();
        parkingSpace59.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus62 = parkingSpace59.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace65 = new models.parkingSpace.ParkingSpace(uUID52, parkingLot53, parkingSpaceStatus62, "", true);
        models.parkingSpace.ParkingSpace parkingSpace68 = new models.parkingSpace.ParkingSpace(uUID36, parkingLot51, parkingSpaceStatus62, "hi!", false);
        models.parkingLot.ParkingLot parkingLot69 = null;
        java.util.UUID uUID70 = null;
        models.parkingLot.ParkingLot parkingLot71 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus72 = null;
        models.parkingSpace.ParkingSpace parkingSpace75 = new models.parkingSpace.ParkingSpace(uUID70, parkingLot71, parkingSpaceStatus72, "", false);
        java.lang.String str76 = parkingSpace75.toString();
        parkingSpace75.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus78 = parkingSpace75.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace81 = new models.parkingSpace.ParkingSpace(uUID36, parkingLot69, parkingSpaceStatus78, "", true);
        parkingSpace28.setStatus(parkingSpaceStatus78);
        parkingSpace20.setStatus(parkingSpaceStatus78);
        parkingSpace2.setStatus(parkingSpaceStatus78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus13 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus13.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID22.toString(), "6cec89de-f395-4914-9ad7-1f0bb192eba9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID36);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID36.toString(), "b540cf54-d424-4c4d-842d-286cf8cc8424");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot45);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus46 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus46.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus62 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus62.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus78 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus78.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingLot.ParkingLot parkingLot21 = null;
        models.parkingSpace.ParkingSpace parkingSpace23 = new models.parkingSpace.ParkingSpace(parkingLot21, "hi!");
        parkingSpace23.setEnabled(true);
        java.util.UUID uUID26 = parkingSpace23.getID();
        models.parkingLot.ParkingLot parkingLot27 = null;
        java.util.UUID uUID28 = null;
        models.parkingLot.ParkingLot parkingLot29 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus30 = null;
        models.parkingSpace.ParkingSpace parkingSpace33 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus30, "", false);
        java.lang.String str34 = parkingSpace33.toString();
        models.parkingLot.ParkingLot parkingLot35 = parkingSpace33.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus36 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace33.setStatus(parkingSpaceStatus36);
        models.parkingSpace.ParkingSpace parkingSpace40 = new models.parkingSpace.ParkingSpace(uUID26, parkingLot27, parkingSpaceStatus36, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace43 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus36, "hi!", true);
        models.parkingLot.ParkingLot parkingLot44 = null;
        java.util.UUID uUID45 = null;
        models.parkingLot.ParkingLot parkingLot46 = null;
        java.util.UUID uUID47 = null;
        models.parkingLot.ParkingLot parkingLot48 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus49 = null;
        models.parkingSpace.ParkingSpace parkingSpace52 = new models.parkingSpace.ParkingSpace(uUID47, parkingLot48, parkingSpaceStatus49, "", false);
        java.lang.String str53 = parkingSpace52.toString();
        parkingSpace52.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus55 = parkingSpace52.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace58 = new models.parkingSpace.ParkingSpace(uUID45, parkingLot46, parkingSpaceStatus55, "", true);
        models.parkingSpace.ParkingSpace parkingSpace61 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot44, parkingSpaceStatus55, "", true);
        java.util.UUID uUID62 = parkingSpace61.getID();
        boolean boolean63 = parkingSpace61.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "f65984f0-0a69-41f9-b7e7-5fabba48408f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID26);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID26.toString(), "1a01030b-c9d0-4b38-8f60-0fcf6397be4a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot35);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus36 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus36.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus55 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus55.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID62);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID62.toString(), "f65984f0-0a69-41f9-b7e7-5fabba48408f");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = null;
        models.parkingLot.ParkingLot parkingLot6 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus7 = null;
        models.parkingSpace.ParkingSpace parkingSpace10 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus7, "", false);
        java.lang.String str11 = parkingSpace10.toString();
        models.parkingLot.ParkingLot parkingLot12 = parkingSpace10.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace10.setStatus(parkingSpaceStatus13);
        parkingSpace2.setStatus(parkingSpaceStatus13);
        java.lang.Class<?> wildcardClass16 = parkingSpace2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus13 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus13.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingLot.ParkingLot parkingLot23 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(parkingLot23, "hi!");
        parkingSpace25.setEnabled(true);
        java.util.UUID uUID28 = parkingSpace25.getID();
        models.parkingLot.ParkingLot parkingLot29 = null;
        java.util.UUID uUID30 = null;
        models.parkingLot.ParkingLot parkingLot31 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus32 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = new models.parkingSpace.ParkingSpace(uUID30, parkingLot31, parkingSpaceStatus32, "", false);
        java.lang.String str36 = parkingSpace35.toString();
        models.parkingLot.ParkingLot parkingLot37 = parkingSpace35.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus38 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace35.setStatus(parkingSpaceStatus38);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus38, "hi!", true);
        models.parkingLot.ParkingLot parkingLot43 = null;
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(parkingLot44, "hi!");
        parkingSpace46.setEnabled(true);
        java.util.UUID uUID49 = parkingSpace46.getID();
        models.parkingLot.ParkingLot parkingLot50 = null;
        java.util.UUID uUID51 = null;
        models.parkingLot.ParkingLot parkingLot52 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID51, parkingLot52, parkingSpaceStatus53, "", false);
        java.lang.String str57 = parkingSpace56.toString();
        models.parkingLot.ParkingLot parkingLot58 = parkingSpace56.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace56.setStatus(parkingSpaceStatus59);
        models.parkingSpace.ParkingSpace parkingSpace63 = new models.parkingSpace.ParkingSpace(uUID49, parkingLot50, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot43, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace69 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus59, "", true);
        java.util.UUID uUID70 = parkingSpace69.getID();
        models.parkingLot.ParkingLot parkingLot71 = null;
        java.util.UUID uUID72 = null;
        models.parkingLot.ParkingLot parkingLot73 = null;
        java.util.UUID uUID74 = null;
        models.parkingLot.ParkingLot parkingLot75 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus76 = null;
        models.parkingSpace.ParkingSpace parkingSpace79 = new models.parkingSpace.ParkingSpace(uUID74, parkingLot75, parkingSpaceStatus76, "", false);
        java.lang.String str80 = parkingSpace79.toString();
        parkingSpace79.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus82 = parkingSpace79.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace85 = new models.parkingSpace.ParkingSpace(uUID72, parkingLot73, parkingSpaceStatus82, "", true);
        models.parkingSpace.ParkingSpace parkingSpace88 = new models.parkingSpace.ParkingSpace(uUID70, parkingLot71, parkingSpaceStatus82, "", true);
        java.lang.String str89 = parkingSpace88.getName();
        java.lang.String str90 = parkingSpace88.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "7cbffccc-28e9-4e91-bd1c-06503560aa9a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID28);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID28.toString(), "80a5f6bc-f61f-4fcb-9b2e-d25d25bf6f61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot37);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus38 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus38.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID49);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID49.toString(), "354478d4-64a6-46fd-bc8d-a2ece5aecc9d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus59 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus59.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID70);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID70.toString(), "7cbffccc-28e9-4e91-bd1c-06503560aa9a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus82 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus82.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "" + "'", str89.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "" + "'", str90.equals(""));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        boolean boolean10 = parkingSpace5.isEnabled();
        java.util.UUID uUID11 = null;
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.UUID uUID13 = null;
        models.parkingLot.ParkingLot parkingLot14 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(uUID13, parkingLot14, parkingSpaceStatus15, "", false);
        java.lang.String str19 = parkingSpace18.toString();
        parkingSpace18.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = parkingSpace18.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace24 = new models.parkingSpace.ParkingSpace(uUID11, parkingLot12, parkingSpaceStatus21, "", false);
        parkingSpace5.setStatus(parkingSpaceStatus21);
        models.parkingLot.ParkingLot parkingLot26 = parkingSpace5.getLot();
        parkingSpace5.setEnabled(false);
        java.lang.String str29 = parkingSpace5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus21 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus21.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus23 = null;
        models.parkingSpace.ParkingSpace parkingSpace26 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus23, "", false);
        java.lang.String str27 = parkingSpace26.toString();
        parkingSpace26.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus29 = parkingSpace26.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace32 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus29, "hi!", false);
        models.parkingLot.ParkingLot parkingLot33 = null;
        java.util.UUID uUID34 = null;
        models.parkingLot.ParkingLot parkingLot35 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus36 = null;
        models.parkingSpace.ParkingSpace parkingSpace39 = new models.parkingSpace.ParkingSpace(uUID34, parkingLot35, parkingSpaceStatus36, "", false);
        java.lang.String str40 = parkingSpace39.toString();
        parkingSpace39.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus42 = parkingSpace39.getStatus();
        parkingSpace39.setEnabled(false);
        parkingSpace39.setEnabled(true);
        java.lang.String str47 = parkingSpace39.getName();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus48 = parkingSpace39.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace51 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot33, parkingSpaceStatus48, "", true);
        models.parkingLot.ParkingLot parkingLot52 = null;
        models.parkingLot.ParkingLot parkingLot53 = null;
        models.parkingSpace.ParkingSpace parkingSpace55 = new models.parkingSpace.ParkingSpace(parkingLot53, "hi!");
        parkingSpace55.setEnabled(true);
        java.lang.String str58 = parkingSpace55.getName();
        java.util.UUID uUID59 = null;
        models.parkingLot.ParkingLot parkingLot60 = null;
        java.util.UUID uUID61 = null;
        models.parkingLot.ParkingLot parkingLot62 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus63 = null;
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(uUID61, parkingLot62, parkingSpaceStatus63, "", false);
        java.lang.String str67 = parkingSpace66.toString();
        parkingSpace66.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus69 = parkingSpace66.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace72 = new models.parkingSpace.ParkingSpace(uUID59, parkingLot60, parkingSpaceStatus69, "", false);
        parkingSpace55.setStatus(parkingSpaceStatus69);
        models.parkingSpace.ParkingSpace parkingSpace76 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot52, parkingSpaceStatus69, "hi!", false);
        parkingSpace76.setEnabled(false);
        java.util.UUID uUID79 = null;
        models.parkingLot.ParkingLot parkingLot80 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus81 = null;
        models.parkingSpace.ParkingSpace parkingSpace84 = new models.parkingSpace.ParkingSpace(uUID79, parkingLot80, parkingSpaceStatus81, "", false);
        java.lang.String str85 = parkingSpace84.toString();
        models.parkingLot.ParkingLot parkingLot86 = parkingSpace84.getLot();
        boolean boolean87 = parkingSpace84.isEnabled();
        boolean boolean88 = parkingSpace76.equals((java.lang.Object) parkingSpace84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "3d1841f7-df35-4093-b817-d141f5990ff0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus29 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus29.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus42 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus42.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus48 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus48.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus69 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus69.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "" + "'", str85.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        java.lang.String str7 = parkingSpace5.getName();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        models.parkingLot.ParkingLot parkingLot9 = parkingSpace5.getLot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parkingLot9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpaceStatus8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace parkingSpace11 = new models.parkingSpace.ParkingSpace(parkingLot9, "hi!");
        parkingSpace11.setEnabled(true);
        java.util.UUID uUID14 = parkingSpace11.getID();
        models.parkingLot.ParkingLot parkingLot15 = null;
        java.util.UUID uUID16 = null;
        models.parkingLot.ParkingLot parkingLot17 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus18 = null;
        models.parkingSpace.ParkingSpace parkingSpace21 = new models.parkingSpace.ParkingSpace(uUID16, parkingLot17, parkingSpaceStatus18, "", false);
        java.lang.String str22 = parkingSpace21.toString();
        models.parkingLot.ParkingLot parkingLot23 = parkingSpace21.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus24 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace21.setStatus(parkingSpaceStatus24);
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID14, parkingLot15, parkingSpaceStatus24, "hi!", true);
        models.parkingLot.ParkingLot parkingLot29 = null;
        java.util.UUID uUID30 = null;
        models.parkingLot.ParkingLot parkingLot31 = null;
        java.util.UUID uUID32 = null;
        models.parkingLot.ParkingLot parkingLot33 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus34 = null;
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID32, parkingLot33, parkingSpaceStatus34, "", false);
        java.lang.String str38 = parkingSpace37.toString();
        parkingSpace37.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus40 = parkingSpace37.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace43 = new models.parkingSpace.ParkingSpace(uUID30, parkingLot31, parkingSpaceStatus40, "", true);
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(uUID14, parkingLot29, parkingSpaceStatus40, "hi!", false);
        models.parkingLot.ParkingLot parkingLot47 = null;
        java.util.UUID uUID48 = null;
        models.parkingLot.ParkingLot parkingLot49 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus50 = null;
        models.parkingSpace.ParkingSpace parkingSpace53 = new models.parkingSpace.ParkingSpace(uUID48, parkingLot49, parkingSpaceStatus50, "", false);
        java.lang.String str54 = parkingSpace53.toString();
        parkingSpace53.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus56 = parkingSpace53.getStatus();
        boolean boolean58 = parkingSpace53.equals((java.lang.Object) 1.0f);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = parkingSpace53.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace62 = new models.parkingSpace.ParkingSpace(uUID14, parkingLot47, parkingSpaceStatus59, "hi!", false);
        parkingSpace5.setStatus(parkingSpaceStatus59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID14.toString(), "82427e4b-c96b-48f1-9561-beb72c23f22a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot23);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus24 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus24.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus40 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus40.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus56 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus56.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus59 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus59.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        java.lang.String str16 = parkingSpace5.getName();
        parkingSpace5.checkOut();
        boolean boolean18 = parkingSpace5.isEnabled();
        boolean boolean19 = parkingSpace5.isBookable();
        parkingSpace5.checkOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        boolean boolean9 = parkingSpace5.isEnabled();
        java.util.UUID uUID10 = null;
        models.parkingLot.ParkingLot parkingLot11 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus12 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = new models.parkingSpace.ParkingSpace(uUID10, parkingLot11, parkingSpaceStatus12, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = null;
        parkingSpace15.setStatus(parkingSpaceStatus16);
        parkingSpace15.setEnabled(true);
        boolean boolean20 = parkingSpace15.isEnabled();
        parkingSpace15.checkOut();
        java.util.UUID uUID22 = parkingSpace15.getID();
        boolean boolean23 = parkingSpace5.equals((java.lang.Object) uUID22);
        boolean boolean24 = parkingSpace5.isEnabled();
        models.parkingLot.ParkingLot parkingLot25 = null;
        models.parkingSpace.ParkingSpace parkingSpace27 = new models.parkingSpace.ParkingSpace(parkingLot25, "hi!");
        parkingSpace27.setEnabled(true);
        java.util.UUID uUID30 = parkingSpace27.getID();
        models.parkingLot.ParkingLot parkingLot31 = null;
        java.util.UUID uUID32 = null;
        models.parkingLot.ParkingLot parkingLot33 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus34 = null;
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID32, parkingLot33, parkingSpaceStatus34, "", false);
        java.lang.String str38 = parkingSpace37.toString();
        models.parkingLot.ParkingLot parkingLot39 = parkingSpace37.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus40 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace37.setStatus(parkingSpaceStatus40);
        models.parkingSpace.ParkingSpace parkingSpace44 = new models.parkingSpace.ParkingSpace(uUID30, parkingLot31, parkingSpaceStatus40, "hi!", true);
        models.parkingLot.ParkingLot parkingLot45 = null;
        java.util.UUID uUID46 = null;
        models.parkingLot.ParkingLot parkingLot47 = null;
        java.util.UUID uUID48 = null;
        models.parkingLot.ParkingLot parkingLot49 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus50 = null;
        models.parkingSpace.ParkingSpace parkingSpace53 = new models.parkingSpace.ParkingSpace(uUID48, parkingLot49, parkingSpaceStatus50, "", false);
        java.lang.String str54 = parkingSpace53.toString();
        parkingSpace53.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus56 = parkingSpace53.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace59 = new models.parkingSpace.ParkingSpace(uUID46, parkingLot47, parkingSpaceStatus56, "", true);
        models.parkingSpace.ParkingSpace parkingSpace62 = new models.parkingSpace.ParkingSpace(uUID30, parkingLot45, parkingSpaceStatus56, "hi!", false);
        parkingSpace5.setStatus(parkingSpaceStatus56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID30);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID30.toString(), "79fe0ea2-3276-401d-b807-ec9da4d51853");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot39);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus40 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus40.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus56 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus56.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        models.parkingSpace.ParkingSpace parkingSpace28 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus25, "", false);
        java.lang.String str29 = parkingSpace28.toString();
        parkingSpace28.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = parkingSpace28.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace34 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus31, "", true);
        models.parkingSpace.ParkingSpace parkingSpace37 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus31, "hi!", false);
        models.parkingLot.ParkingLot parkingLot38 = null;
        java.util.UUID uUID39 = null;
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.UUID uUID41 = null;
        models.parkingLot.ParkingLot parkingLot42 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus43 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(uUID41, parkingLot42, parkingSpaceStatus43, "", false);
        java.lang.String str47 = parkingSpace46.toString();
        parkingSpace46.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus49 = parkingSpace46.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace52 = new models.parkingSpace.ParkingSpace(uUID39, parkingLot40, parkingSpaceStatus49, "", true);
        models.parkingSpace.ParkingSpace parkingSpace55 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot38, parkingSpaceStatus49, "", true);
        java.util.UUID uUID56 = parkingSpace55.getID();
        models.parkingLot.ParkingLot parkingLot57 = null;
        java.util.UUID uUID58 = null;
        models.parkingLot.ParkingLot parkingLot59 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus60 = null;
        models.parkingSpace.ParkingSpace parkingSpace63 = new models.parkingSpace.ParkingSpace(uUID58, parkingLot59, parkingSpaceStatus60, "", false);
        java.lang.String str64 = parkingSpace63.toString();
        parkingSpace63.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus66 = parkingSpace63.getStatus();
        boolean boolean68 = parkingSpace63.equals((java.lang.Object) 1.0f);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus69 = parkingSpace63.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace72 = new models.parkingSpace.ParkingSpace(uUID56, parkingLot57, parkingSpaceStatus69, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "4486f7f9-aaec-44f4-ac85-cdc8b78b3508");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus31 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus31.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus49 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus49.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID56);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID56.toString(), "4486f7f9-aaec-44f4-ac85-cdc8b78b3508");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus66 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus66.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus69 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus69.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace5.getStatus();
        java.util.UUID uUID17 = parkingSpace5.getID();
        java.util.UUID uUID18 = parkingSpace5.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID18);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus7 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED;
        parkingSpace5.setStatus(parkingSpaceStatus7);
        java.lang.String str9 = parkingSpace5.toString();
        parkingSpace5.setEnabled(false);
        parkingSpace5.checkOut();
        java.lang.String str13 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace5.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus7 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED + "'", parkingSpaceStatus7.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.BOOKED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        boolean boolean10 = parkingSpace5.isEnabled();
        models.parkingLot.ParkingLot parkingLot11 = parkingSpace5.getLot();
        java.util.UUID uUID12 = null;
        models.parkingLot.ParkingLot parkingLot13 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus14 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = new models.parkingSpace.ParkingSpace(uUID12, parkingLot13, parkingSpaceStatus14, "", false);
        java.lang.String str18 = parkingSpace17.toString();
        parkingSpace17.checkOut();
        boolean boolean20 = parkingSpace17.isEnabled();
        boolean boolean21 = parkingSpace17.isBookable();
        parkingSpace17.checkOut();
        boolean boolean23 = parkingSpace17.isEnabled();
        parkingSpace17.setEnabled(false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus26 = parkingSpace17.getStatus();
        parkingSpace5.setStatus(parkingSpaceStatus26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus26 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus26.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus23 = null;
        models.parkingSpace.ParkingSpace parkingSpace26 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus23, "", false);
        java.lang.String str27 = parkingSpace26.toString();
        parkingSpace26.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus29 = parkingSpace26.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace32 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus29, "hi!", false);
        models.parkingLot.ParkingLot parkingLot33 = null;
        models.parkingLot.ParkingLot parkingLot34 = null;
        models.parkingSpace.ParkingSpace parkingSpace36 = new models.parkingSpace.ParkingSpace(parkingLot34, "hi!");
        parkingSpace36.setEnabled(true);
        java.util.UUID uUID39 = parkingSpace36.getID();
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.UUID uUID41 = null;
        models.parkingLot.ParkingLot parkingLot42 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus43 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(uUID41, parkingLot42, parkingSpaceStatus43, "", false);
        java.lang.String str47 = parkingSpace46.toString();
        models.parkingLot.ParkingLot parkingLot48 = parkingSpace46.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus49 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace46.setStatus(parkingSpaceStatus49);
        models.parkingSpace.ParkingSpace parkingSpace53 = new models.parkingSpace.ParkingSpace(uUID39, parkingLot40, parkingSpaceStatus49, "hi!", true);
        models.parkingLot.ParkingLot parkingLot54 = null;
        java.util.UUID uUID55 = null;
        models.parkingLot.ParkingLot parkingLot56 = null;
        java.util.UUID uUID57 = null;
        models.parkingLot.ParkingLot parkingLot58 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = null;
        models.parkingSpace.ParkingSpace parkingSpace62 = new models.parkingSpace.ParkingSpace(uUID57, parkingLot58, parkingSpaceStatus59, "", false);
        java.lang.String str63 = parkingSpace62.toString();
        parkingSpace62.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus65 = parkingSpace62.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace68 = new models.parkingSpace.ParkingSpace(uUID55, parkingLot56, parkingSpaceStatus65, "", true);
        models.parkingSpace.ParkingSpace parkingSpace71 = new models.parkingSpace.ParkingSpace(uUID39, parkingLot54, parkingSpaceStatus65, "hi!", false);
        models.parkingLot.ParkingLot parkingLot72 = null;
        java.util.UUID uUID73 = null;
        models.parkingLot.ParkingLot parkingLot74 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus75 = null;
        models.parkingSpace.ParkingSpace parkingSpace78 = new models.parkingSpace.ParkingSpace(uUID73, parkingLot74, parkingSpaceStatus75, "", false);
        java.lang.String str79 = parkingSpace78.toString();
        parkingSpace78.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus81 = parkingSpace78.getStatus();
        boolean boolean83 = parkingSpace78.equals((java.lang.Object) 1.0f);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus84 = parkingSpace78.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace87 = new models.parkingSpace.ParkingSpace(uUID39, parkingLot72, parkingSpaceStatus84, "hi!", false);
        models.parkingSpace.ParkingSpace parkingSpace90 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot33, parkingSpaceStatus84, "", true);
        java.util.UUID uUID91 = parkingSpace90.getID();
        java.lang.Class<?> wildcardClass92 = uUID91.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "4ea1767e-1c1d-4120-b2a4-a81ebba1c0f9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus29 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus29.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID39);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID39.toString(), "95206ad6-2971-4849-9653-615b5fc5f2ba");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot48);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus49 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus49.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus65 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus65.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "" + "'", str79.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus81 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus81.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus84 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus84.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID91);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID91.toString(), "4ea1767e-1c1d-4120-b2a4-a81ebba1c0f9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        models.parkingLot.ParkingLot parkingLot6 = null;
        models.parkingSpace.ParkingSpace parkingSpace8 = new models.parkingSpace.ParkingSpace(parkingLot6, "hi!");
        parkingSpace8.setEnabled(true);
        java.util.UUID uUID11 = null;
        models.parkingLot.ParkingLot parkingLot12 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = null;
        models.parkingSpace.ParkingSpace parkingSpace16 = new models.parkingSpace.ParkingSpace(uUID11, parkingLot12, parkingSpaceStatus13, "", false);
        java.lang.String str17 = parkingSpace16.toString();
        models.parkingLot.ParkingLot parkingLot18 = parkingSpace16.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus19 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace16.setStatus(parkingSpaceStatus19);
        parkingSpace8.setStatus(parkingSpaceStatus19);
        parkingSpace2.setStatus(parkingSpaceStatus19);
        java.util.UUID uUID23 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.UUID uUID25 = null;
        models.parkingLot.ParkingLot parkingLot26 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus27 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = new models.parkingSpace.ParkingSpace(uUID25, parkingLot26, parkingSpaceStatus27, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus31 = null;
        parkingSpace30.setStatus(parkingSpaceStatus31);
        parkingSpace30.setEnabled(true);
        boolean boolean35 = parkingSpace30.isEnabled();
        parkingSpace30.checkOut();
        java.util.UUID uUID37 = null;
        models.parkingLot.ParkingLot parkingLot38 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus39 = null;
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID37, parkingLot38, parkingSpaceStatus39, "", false);
        java.lang.String str43 = parkingSpace42.toString();
        parkingSpace42.checkOut();
        boolean boolean45 = parkingSpace42.isEnabled();
        models.parkingLot.ParkingLot parkingLot46 = parkingSpace42.getLot();
        boolean boolean47 = parkingSpace30.equals((java.lang.Object) parkingLot46);
        java.util.UUID uUID48 = null;
        models.parkingLot.ParkingLot parkingLot49 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus50 = null;
        models.parkingSpace.ParkingSpace parkingSpace53 = new models.parkingSpace.ParkingSpace(uUID48, parkingLot49, parkingSpaceStatus50, "", false);
        java.lang.String str54 = parkingSpace53.toString();
        parkingSpace53.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus56 = parkingSpace53.getStatus();
        parkingSpace30.setStatus(parkingSpaceStatus56);
        models.parkingSpace.ParkingSpace parkingSpace60 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus56, "", true);
        models.parkingLot.ParkingLot parkingLot61 = parkingSpace60.getLot();
        java.util.UUID uUID62 = parkingSpace60.getID();
        models.parkingLot.ParkingLot parkingLot63 = null;
        models.parkingLot.ParkingLot parkingLot64 = null;
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(parkingLot64, "hi!");
        parkingSpace66.setEnabled(true);
        java.lang.String str69 = parkingSpace66.getName();
        java.util.UUID uUID70 = null;
        models.parkingLot.ParkingLot parkingLot71 = null;
        java.util.UUID uUID72 = null;
        models.parkingLot.ParkingLot parkingLot73 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus74 = null;
        models.parkingSpace.ParkingSpace parkingSpace77 = new models.parkingSpace.ParkingSpace(uUID72, parkingLot73, parkingSpaceStatus74, "", false);
        java.lang.String str78 = parkingSpace77.toString();
        parkingSpace77.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus80 = parkingSpace77.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace83 = new models.parkingSpace.ParkingSpace(uUID70, parkingLot71, parkingSpaceStatus80, "", false);
        parkingSpace66.setStatus(parkingSpaceStatus80);
        models.parkingSpace.ParkingSpace parkingSpace87 = new models.parkingSpace.ParkingSpace(uUID62, parkingLot63, parkingSpaceStatus80, "hi!", false);
        models.parkingLot.ParkingLot parkingLot88 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus89 = null;
        models.parkingSpace.ParkingSpace parkingSpace92 = new models.parkingSpace.ParkingSpace(uUID62, parkingLot88, parkingSpaceStatus89, "", false);
        boolean boolean93 = parkingSpace92.isEnabled();
        java.lang.String str94 = parkingSpace92.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot18);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus19 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus19.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID23);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID23.toString(), "4b7e4437-2453-443c-ac57-6440ffb40661");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus56 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus56.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID62);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID62.toString(), "4b7e4437-2453-443c-ac57-6440ffb40661");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "hi!" + "'", str69.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus80 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus80.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "" + "'", str94.equals(""));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = parkingSpace5.getStatus();
        parkingSpace5.setEnabled(false);
        java.lang.String str11 = parkingSpace5.getName();
        boolean boolean12 = parkingSpace5.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingLot.ParkingLot parkingLot23 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = new models.parkingSpace.ParkingSpace(parkingLot23, "hi!");
        parkingSpace25.setEnabled(true);
        java.util.UUID uUID28 = parkingSpace25.getID();
        models.parkingLot.ParkingLot parkingLot29 = null;
        java.util.UUID uUID30 = null;
        models.parkingLot.ParkingLot parkingLot31 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus32 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = new models.parkingSpace.ParkingSpace(uUID30, parkingLot31, parkingSpaceStatus32, "", false);
        java.lang.String str36 = parkingSpace35.toString();
        models.parkingLot.ParkingLot parkingLot37 = parkingSpace35.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus38 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace35.setStatus(parkingSpaceStatus38);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus38, "hi!", true);
        models.parkingLot.ParkingLot parkingLot43 = null;
        models.parkingLot.ParkingLot parkingLot44 = null;
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(parkingLot44, "hi!");
        parkingSpace46.setEnabled(true);
        java.util.UUID uUID49 = parkingSpace46.getID();
        models.parkingLot.ParkingLot parkingLot50 = null;
        java.util.UUID uUID51 = null;
        models.parkingLot.ParkingLot parkingLot52 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus53 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = new models.parkingSpace.ParkingSpace(uUID51, parkingLot52, parkingSpaceStatus53, "", false);
        java.lang.String str57 = parkingSpace56.toString();
        models.parkingLot.ParkingLot parkingLot58 = parkingSpace56.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus59 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace56.setStatus(parkingSpaceStatus59);
        models.parkingSpace.ParkingSpace parkingSpace63 = new models.parkingSpace.ParkingSpace(uUID49, parkingLot50, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace66 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot43, parkingSpaceStatus59, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace69 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus59, "", true);
        java.util.UUID uUID70 = parkingSpace69.getID();
        parkingSpace69.checkOut();
        java.lang.String str72 = parkingSpace69.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "233596b7-2021-4cad-8940-be444eaa2980");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID28);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID28.toString(), "88834fa9-d146-4562-be7c-0cf4736c55ef");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot37);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus38 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus38.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID49);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID49.toString(), "9a3de12d-2ab3-44ce-898e-f6c2dd575d9b");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot58);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus59 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus59.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID70);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID70.toString(), "233596b7-2021-4cad-8940-be444eaa2980");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        boolean boolean10 = parkingSpace5.isEnabled();
        parkingSpace5.checkOut();
        java.util.UUID uUID12 = parkingSpace5.getID();
        parkingSpace5.setEnabled(false);
        models.parkingLot.ParkingLot parkingLot15 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace5.getStatus();
        java.lang.String str17 = parkingSpace5.toString();
        boolean boolean18 = parkingSpace5.isEnabled();
        java.util.UUID uUID19 = null;
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = null;
        models.parkingSpace.ParkingSpace parkingSpace24 = new models.parkingSpace.ParkingSpace(uUID19, parkingLot20, parkingSpaceStatus21, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        parkingSpace24.setStatus(parkingSpaceStatus25);
        parkingSpace24.setEnabled(true);
        boolean boolean29 = parkingSpace24.isEnabled();
        parkingSpace24.checkOut();
        java.util.UUID uUID31 = parkingSpace24.getID();
        models.parkingLot.ParkingLot parkingLot32 = parkingSpace24.getLot();
        boolean boolean33 = parkingSpace5.equals((java.lang.Object) parkingLot32);
        parkingSpace5.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot15);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "");
        boolean boolean3 = parkingSpace2.isEnabled();
        models.parkingLot.ParkingLot parkingLot4 = parkingSpace2.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot4);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        models.parkingLot.ParkingLot parkingLot6 = null;
        models.parkingSpace.ParkingSpace parkingSpace8 = new models.parkingSpace.ParkingSpace(parkingLot6, "hi!");
        parkingSpace8.setEnabled(true);
        java.util.UUID uUID11 = null;
        models.parkingLot.ParkingLot parkingLot12 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus13 = null;
        models.parkingSpace.ParkingSpace parkingSpace16 = new models.parkingSpace.ParkingSpace(uUID11, parkingLot12, parkingSpaceStatus13, "", false);
        java.lang.String str17 = parkingSpace16.toString();
        models.parkingLot.ParkingLot parkingLot18 = parkingSpace16.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus19 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace16.setStatus(parkingSpaceStatus19);
        parkingSpace8.setStatus(parkingSpaceStatus19);
        parkingSpace2.setStatus(parkingSpaceStatus19);
        java.lang.Class<?> wildcardClass23 = parkingSpaceStatus19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot18);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus19 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus19.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "");
        boolean boolean3 = parkingSpace2.isBookable();
        java.util.UUID uUID4 = null;
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = null;
        models.parkingSpace.ParkingSpace parkingSpace11 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus8, "", false);
        java.lang.String str12 = parkingSpace11.toString();
        models.parkingLot.ParkingLot parkingLot13 = parkingSpace11.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus14 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace11.setStatus(parkingSpaceStatus14);
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(uUID4, parkingLot5, parkingSpaceStatus14, "hi!", true);
        parkingSpace2.setStatus(parkingSpaceStatus14);
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingSpace.ParkingSpace parkingSpace22 = new models.parkingSpace.ParkingSpace(parkingLot20, "");
        boolean boolean23 = parkingSpace22.isEnabled();
        parkingSpace22.setEnabled(true);
        boolean boolean26 = parkingSpace2.equals((java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot13);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus14 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus14.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.util.UUID uUID5 = parkingSpace2.getID();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        models.parkingLot.ParkingLot parkingLot14 = parkingSpace12.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace12.setStatus(parkingSpaceStatus15);
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot6, parkingSpaceStatus15, "hi!", true);
        models.parkingLot.ParkingLot parkingLot20 = null;
        models.parkingLot.ParkingLot parkingLot21 = null;
        models.parkingSpace.ParkingSpace parkingSpace23 = new models.parkingSpace.ParkingSpace(parkingLot21, "hi!");
        parkingSpace23.setEnabled(true);
        java.util.UUID uUID26 = parkingSpace23.getID();
        models.parkingLot.ParkingLot parkingLot27 = null;
        java.util.UUID uUID28 = null;
        models.parkingLot.ParkingLot parkingLot29 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus30 = null;
        models.parkingSpace.ParkingSpace parkingSpace33 = new models.parkingSpace.ParkingSpace(uUID28, parkingLot29, parkingSpaceStatus30, "", false);
        java.lang.String str34 = parkingSpace33.toString();
        models.parkingLot.ParkingLot parkingLot35 = parkingSpace33.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus36 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace33.setStatus(parkingSpaceStatus36);
        models.parkingSpace.ParkingSpace parkingSpace40 = new models.parkingSpace.ParkingSpace(uUID26, parkingLot27, parkingSpaceStatus36, "hi!", true);
        models.parkingSpace.ParkingSpace parkingSpace43 = new models.parkingSpace.ParkingSpace(uUID5, parkingLot20, parkingSpaceStatus36, "hi!", true);
        models.parkingLot.ParkingLot parkingLot44 = parkingSpace43.getLot();
        parkingSpace43.checkOut();
        java.lang.String str46 = parkingSpace43.getName();
        java.util.UUID uUID47 = parkingSpace43.getID();
        java.lang.Class<?> wildcardClass48 = parkingSpace43.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "0a0b0b9b-15dd-44ad-9a31-348bc4f9f8bb");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot14);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus15 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus15.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID26);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID26.toString(), "e6e8bee7-b29b-4a54-81bb-b72dab395089");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot35);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus36 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus36.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID47);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID47.toString(), "0a0b0b9b-15dd-44ad-9a31-348bc4f9f8bb");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingLot.ParkingLot parkingLot2 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = new models.parkingSpace.ParkingSpace(parkingLot2, "hi!");
        parkingSpace4.setEnabled(true);
        java.util.UUID uUID7 = parkingSpace4.getID();
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.UUID uUID9 = null;
        models.parkingLot.ParkingLot parkingLot10 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus11 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = new models.parkingSpace.ParkingSpace(uUID9, parkingLot10, parkingSpaceStatus11, "", false);
        java.lang.String str15 = parkingSpace14.toString();
        models.parkingLot.ParkingLot parkingLot16 = parkingSpace14.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus17 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace14.setStatus(parkingSpaceStatus17);
        models.parkingSpace.ParkingSpace parkingSpace21 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus17, "hi!", true);
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.UUID uUID23 = null;
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.UUID uUID25 = null;
        models.parkingLot.ParkingLot parkingLot26 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus27 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = new models.parkingSpace.ParkingSpace(uUID25, parkingLot26, parkingSpaceStatus27, "", false);
        java.lang.String str31 = parkingSpace30.toString();
        parkingSpace30.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus33 = parkingSpace30.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace36 = new models.parkingSpace.ParkingSpace(uUID23, parkingLot24, parkingSpaceStatus33, "", true);
        models.parkingSpace.ParkingSpace parkingSpace39 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot22, parkingSpaceStatus33, "hi!", false);
        models.parkingSpace.ParkingSpace parkingSpace42 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus33, "hi!", true);
        parkingSpace42.setEnabled(true);
        java.lang.String str45 = parkingSpace42.getName();
        boolean boolean46 = parkingSpace42.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "42ef993e-1205-43fe-b4a4-671c540700e1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot16);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus17 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus17.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus33 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus33.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        parkingSpace5.setStatus(parkingSpaceStatus6);
        parkingSpace5.setEnabled(true);
        models.parkingLot.ParkingLot parkingLot10 = parkingSpace5.getLot();
        boolean boolean12 = parkingSpace5.equals((java.lang.Object) false);
        java.lang.String str13 = parkingSpace5.getName();
        models.parkingLot.ParkingLot parkingLot14 = null;
        models.parkingSpace.ParkingSpace parkingSpace16 = new models.parkingSpace.ParkingSpace(parkingLot14, "hi!");
        parkingSpace16.setEnabled(true);
        java.util.UUID uUID19 = parkingSpace16.getID();
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.UUID uUID21 = null;
        models.parkingLot.ParkingLot parkingLot22 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus23 = null;
        models.parkingSpace.ParkingSpace parkingSpace26 = new models.parkingSpace.ParkingSpace(uUID21, parkingLot22, parkingSpaceStatus23, "", false);
        java.lang.String str27 = parkingSpace26.toString();
        models.parkingLot.ParkingLot parkingLot28 = parkingSpace26.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus29 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace26.setStatus(parkingSpaceStatus29);
        models.parkingSpace.ParkingSpace parkingSpace33 = new models.parkingSpace.ParkingSpace(uUID19, parkingLot20, parkingSpaceStatus29, "hi!", true);
        models.parkingLot.ParkingLot parkingLot34 = null;
        java.util.UUID uUID35 = null;
        models.parkingLot.ParkingLot parkingLot36 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus37 = null;
        models.parkingSpace.ParkingSpace parkingSpace40 = new models.parkingSpace.ParkingSpace(uUID35, parkingLot36, parkingSpaceStatus37, "", false);
        java.lang.String str41 = parkingSpace40.toString();
        parkingSpace40.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus43 = parkingSpace40.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace46 = new models.parkingSpace.ParkingSpace(uUID19, parkingLot34, parkingSpaceStatus43, "hi!", false);
        models.parkingLot.ParkingLot parkingLot47 = null;
        java.util.UUID uUID48 = null;
        models.parkingLot.ParkingLot parkingLot49 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus50 = null;
        models.parkingSpace.ParkingSpace parkingSpace53 = new models.parkingSpace.ParkingSpace(uUID48, parkingLot49, parkingSpaceStatus50, "", false);
        java.lang.String str54 = parkingSpace53.toString();
        parkingSpace53.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus56 = parkingSpace53.getStatus();
        parkingSpace53.setEnabled(false);
        parkingSpace53.setEnabled(true);
        java.lang.String str61 = parkingSpace53.getName();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus62 = parkingSpace53.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace65 = new models.parkingSpace.ParkingSpace(uUID19, parkingLot47, parkingSpaceStatus62, "", true);
        models.parkingLot.ParkingLot parkingLot66 = null;
        java.util.UUID uUID67 = null;
        models.parkingLot.ParkingLot parkingLot68 = null;
        java.util.UUID uUID69 = null;
        models.parkingLot.ParkingLot parkingLot70 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus71 = null;
        models.parkingSpace.ParkingSpace parkingSpace74 = new models.parkingSpace.ParkingSpace(uUID69, parkingLot70, parkingSpaceStatus71, "", false);
        java.lang.String str75 = parkingSpace74.toString();
        parkingSpace74.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus77 = parkingSpace74.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace80 = new models.parkingSpace.ParkingSpace(uUID67, parkingLot68, parkingSpaceStatus77, "", false);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus81 = parkingSpace80.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace84 = new models.parkingSpace.ParkingSpace(uUID19, parkingLot66, parkingSpaceStatus81, "", true);
        parkingSpace5.setStatus(parkingSpaceStatus81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID19.toString(), "ca9a9d7b-914e-48df-b690-f4ffc7c917a5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot28);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus29 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus29.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus43 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus43.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus56 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus56.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus62 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus62.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "" + "'", str75.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus77 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus77.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus81 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus81.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus9 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = new models.parkingSpace.ParkingSpace(uUID7, parkingLot8, parkingSpaceStatus9, "", false);
        java.lang.String str13 = parkingSpace12.toString();
        parkingSpace12.checkOut();
        boolean boolean15 = parkingSpace12.isEnabled();
        java.lang.String str16 = parkingSpace12.toString();
        boolean boolean17 = parkingSpace5.equals((java.lang.Object) parkingSpace12);
        java.lang.String str18 = parkingSpace12.getName();
        models.parkingLot.ParkingLot parkingLot19 = parkingSpace12.getLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot19);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        models.parkingLot.ParkingLot parkingLot0 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = new models.parkingSpace.ParkingSpace(parkingLot0, "hi!");
        parkingSpace2.setEnabled(true);
        java.lang.String str5 = parkingSpace2.getName();
        java.util.UUID uUID6 = null;
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.UUID uUID8 = null;
        models.parkingLot.ParkingLot parkingLot9 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus10 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = new models.parkingSpace.ParkingSpace(uUID8, parkingLot9, parkingSpaceStatus10, "", false);
        java.lang.String str14 = parkingSpace13.toString();
        parkingSpace13.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = parkingSpace13.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace19 = new models.parkingSpace.ParkingSpace(uUID6, parkingLot7, parkingSpaceStatus16, "", false);
        parkingSpace2.setStatus(parkingSpaceStatus16);
        java.util.UUID uUID21 = parkingSpace2.getID();
        boolean boolean22 = parkingSpace2.isBookable();
        java.lang.String str23 = parkingSpace2.getName();
        boolean boolean24 = parkingSpace2.isBookable();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus25 = null;
        parkingSpace2.setStatus(parkingSpaceStatus25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus16 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus16.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID21.toString(), "cd871fe9-fef3-4d16-b48d-02474e8ccb1e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        boolean boolean10 = parkingSpace5.isEnabled();
        java.util.UUID uUID11 = null;
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.UUID uUID13 = null;
        models.parkingLot.ParkingLot parkingLot14 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus15 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = new models.parkingSpace.ParkingSpace(uUID13, parkingLot14, parkingSpaceStatus15, "", false);
        java.lang.String str19 = parkingSpace18.toString();
        parkingSpace18.checkOut();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus21 = parkingSpace18.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace24 = new models.parkingSpace.ParkingSpace(uUID11, parkingLot12, parkingSpaceStatus21, "", false);
        parkingSpace5.setStatus(parkingSpaceStatus21);
        models.parkingLot.ParkingLot parkingLot26 = parkingSpace5.getLot();
        java.lang.Class<?> wildcardClass27 = parkingSpace5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus21 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus21.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        models.parkingLot.ParkingLot parkingLot7 = parkingSpace5.getLot();
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus8 = models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE;
        parkingSpace5.setStatus(parkingSpaceStatus8);
        boolean boolean10 = parkingSpace5.isEnabled();
        models.parkingLot.ParkingLot parkingLot11 = parkingSpace5.getLot();
        parkingSpace5.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + parkingSpaceStatus8 + "' != '" + models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE + "'", parkingSpaceStatus8.equals(models.parkingSpace.ParkingSpace.ParkingSpaceStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot11);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.util.UUID uUID0 = null;
        models.parkingLot.ParkingLot parkingLot1 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus2 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = new models.parkingSpace.ParkingSpace(uUID0, parkingLot1, parkingSpaceStatus2, "", false);
        java.lang.String str6 = parkingSpace5.toString();
        parkingSpace5.checkOut();
        boolean boolean8 = parkingSpace5.isEnabled();
        boolean boolean9 = parkingSpace5.isBookable();
        parkingSpace5.checkOut();
        boolean boolean11 = parkingSpace5.isBookable();
        boolean boolean13 = parkingSpace5.equals((java.lang.Object) 100.0f);
        boolean boolean14 = parkingSpace5.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }
}
