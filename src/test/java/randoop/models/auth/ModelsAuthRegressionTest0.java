package randoop.models.auth;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModelsAuthRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        java.lang.Class<?> wildcardClass3 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = manager6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        models.user.User user5 = null;
        authenticationState0.setLoggedInUser(user5);
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.auth.AuthStateObserver authStateObserver8 = null;
        authenticationState0.addObserver(authStateObserver8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        models.auth.AuthStateObserver authStateObserver1 = null;
        authenticationState0.addObserver(authStateObserver1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.user.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            authenticationState0.setLoggedInUser(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.auth.AuthStateObserver.onAuthStateChanged(boolean)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        models.manager.Manager manager5 = authenticationState0.getLoggedInManager();
        models.auth.AuthStateObserver authStateObserver6 = null;
        authenticationState0.addObserver(authStateObserver6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = superManager8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        java.lang.Class<?> wildcardClass10 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager9 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user5 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        models.user.User user5 = null;
        authenticationState0.setLoggedInUser(user5);
        models.user.User user7 = null;
        authenticationState0.setLoggedInUser(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        boolean boolean10 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.user.User user4 = null;
        authenticationState0.setLoggedInUser(user4);
        models.auth.AuthStateObserver authStateObserver6 = null;
        authenticationState0.removeObserver(authStateObserver6);
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.user.User user9 = null;
        authenticationState0.setLoggedInUser(user9);
        java.lang.Class<?> wildcardClass11 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.manager.Manager manager9 = authenticationState0.getLoggedInManager();
        java.lang.Class<?> wildcardClass10 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        models.user.User user1 = null;
        authenticationState0.setLoggedInUser(user1);
        boolean boolean3 = authenticationState0.isSuperManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        boolean boolean8 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.superManager.SuperManager superManager10 = authenticationState0.getLoggedInSuperManager();
        boolean boolean11 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean10 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.addObserver(authStateObserver2);
        models.manager.Manager manager4 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        models.client.Client client7 = authenticationState0.getLoggedInClient();
        models.auth.AuthStateObserver authStateObserver8 = null;
        authenticationState0.removeObserver(authStateObserver8);
        models.superManager.SuperManager superManager10 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user5 = authenticationState0.getLoggedInUser();
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.addObserver(authStateObserver10);
        models.user.User user12 = authenticationState0.getLoggedInUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = user12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = user7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.addObserver(authStateObserver4);
        models.user.User user6 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean10 = authenticationState0.isManagerLoggedIn();
        models.superManager.SuperManager superManager11 = authenticationState0.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = superManager11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = user3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.addObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.addObserver(authStateObserver4);
        models.user.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            authenticationState0.setLoggedInUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.auth.AuthStateObserver.onAuthStateChanged(boolean)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.addObserver(authStateObserver2);
        java.lang.Class<?> wildcardClass4 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        boolean boolean10 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean11 = authenticationState0.isManagerLoggedIn();
        boolean boolean12 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        models.user.User user1 = null;
// flaky:         authenticationState0.setLoggedInUser(user1);
        models.superManager.SuperManager superManager3 = authenticationState0.getLoggedInSuperManager();
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isClientLoggedIn();
        boolean boolean6 = authenticationState0.isSuperManagerLoggedIn();
        models.manager.Manager manager7 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        boolean boolean10 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        boolean boolean8 = authenticationState0.isManagerLoggedIn();
        java.lang.Class<?> wildcardClass9 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.addObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        models.auth.AuthStateObserver authStateObserver7 = null;
        authenticationState0.addObserver(authStateObserver7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = user7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        models.client.Client client7 = authenticationState0.getLoggedInClient();
        models.client.Client client8 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager9 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isSuperManagerLoggedIn();
        models.superManager.SuperManager superManager10 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver11 = null;
        authenticationState0.removeObserver(authStateObserver11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        java.lang.Class<?> wildcardClass8 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.manager.Manager manager9 = authenticationState0.getLoggedInManager();
        boolean boolean10 = authenticationState0.isLoggedIn();
        models.user.User user11 = null;
        authenticationState0.setLoggedInUser(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.removeObserver(authStateObserver9);
        boolean boolean11 = authenticationState0.isClientLoggedIn();
        java.lang.Class<?> wildcardClass12 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean10 = authenticationState0.isManagerLoggedIn();
        models.superManager.SuperManager superManager11 = authenticationState0.getLoggedInSuperManager();
        boolean boolean12 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        java.lang.Class<?> wildcardClass8 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        models.user.User user5 = null;
        authenticationState0.setLoggedInUser(user5);
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        boolean boolean8 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        boolean boolean10 = authenticationState0.isSuperManagerLoggedIn();
        models.manager.Manager manager11 = authenticationState0.getLoggedInManager();
        models.auth.AuthStateObserver authStateObserver12 = null;
        authenticationState0.addObserver(authStateObserver12);
        boolean boolean14 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.addObserver(authStateObserver10);
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.user.User user13 = authenticationState0.getLoggedInUser();
        models.client.Client client14 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client14);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        models.user.User user9 = null;
        authenticationState0.setLoggedInUser(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.addObserver(authStateObserver10);
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.user.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            authenticationState0.setLoggedInUser(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.auth.AuthStateObserver.onAuthStateChanged(boolean)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.addObserver(authStateObserver4);
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.client.Client client8 = authenticationState0.getLoggedInClient();
        boolean boolean9 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean10 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.user.User user4 = null;
// flaky:         authenticationState0.setLoggedInUser(user4);
        models.auth.AuthStateObserver authStateObserver6 = null;
        authenticationState0.removeObserver(authStateObserver6);
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.user.User user11 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        models.client.Client client9 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.auth.AuthStateObserver authStateObserver6 = null;
        authenticationState0.removeObserver(authStateObserver6);
        boolean boolean8 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user10 = authenticationState0.getLoggedInUser();
        boolean boolean11 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.user.User user4 = null;
        authenticationState0.setLoggedInUser(user4);
        models.auth.AuthStateObserver authStateObserver6 = null;
        authenticationState0.removeObserver(authStateObserver6);
        models.auth.AuthStateObserver authStateObserver8 = null;
        authenticationState0.removeObserver(authStateObserver8);
        models.client.Client client10 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager13 = authenticationState0.getLoggedInManager();
        boolean boolean14 = authenticationState0.isLoggedIn();
        boolean boolean15 = authenticationState0.isSuperManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver16 = null;
        authenticationState0.addObserver(authStateObserver16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.addObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        boolean boolean8 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user5 = authenticationState0.getLoggedInUser();
        boolean boolean6 = authenticationState0.isLoggedIn();
        models.auth.AuthStateObserver authStateObserver7 = null;
        authenticationState0.addObserver(authStateObserver7);
        boolean boolean9 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        boolean boolean9 = authenticationState0.isLoggedIn();
        models.user.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            authenticationState0.setLoggedInUser(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.auth.AuthStateObserver.onAuthStateChanged(boolean)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.addObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        models.user.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            authenticationState0.setLoggedInUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.auth.AuthStateObserver.onAuthStateChanged(boolean)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.auth.AuthStateObserver authStateObserver8 = null;
        authenticationState0.removeObserver(authStateObserver8);
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.removeObserver(authStateObserver10);
        models.auth.AuthStateObserver authStateObserver12 = null;
        authenticationState0.removeObserver(authStateObserver12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.auth.AuthStateObserver authStateObserver12 = null;
        authenticationState0.removeObserver(authStateObserver12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isLoggedIn();
        models.client.Client client7 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        boolean boolean10 = authenticationState0.isSuperManagerLoggedIn();
        models.superManager.SuperManager superManager11 = authenticationState0.getLoggedInSuperManager();
        models.user.User user12 = null;
        authenticationState0.setLoggedInUser(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.user.User user9 = null;
        authenticationState0.setLoggedInUser(user9);
        models.auth.AuthStateObserver authStateObserver11 = null;
        authenticationState0.removeObserver(authStateObserver11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.auth.AuthStateObserver authStateObserver8 = null;
        authenticationState0.removeObserver(authStateObserver8);
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.addObserver(authStateObserver10);
        models.superManager.SuperManager superManager12 = authenticationState0.getLoggedInSuperManager();
        boolean boolean13 = authenticationState0.isClientLoggedIn();
        boolean boolean14 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.manager.Manager manager10 = authenticationState0.getLoggedInManager();
        models.superManager.SuperManager superManager11 = authenticationState0.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = superManager11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        models.manager.Manager manager5 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.addObserver(authStateObserver4);
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.client.Client client8 = authenticationState0.getLoggedInClient();
        boolean boolean9 = authenticationState0.isSuperManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.removeObserver(authStateObserver10);
        boolean boolean12 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.addObserver(authStateObserver10);
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.user.User user13 = authenticationState0.getLoggedInUser();
        boolean boolean14 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            authenticationState0.setLoggedInUser(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.auth.AuthStateObserver.onAuthStateChanged(boolean)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        models.manager.Manager manager1 = authenticationState0.getLoggedInManager();
        models.user.User user2 = authenticationState0.getLoggedInUser();
        boolean boolean3 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.superManager.SuperManager superManager10 = authenticationState0.getLoggedInSuperManager();
        models.manager.Manager manager11 = authenticationState0.getLoggedInManager();
        boolean boolean12 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user5 = null;
        authenticationState0.setLoggedInUser(user5);
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager4 = authenticationState0.getLoggedInManager();
        models.auth.AuthStateObserver authStateObserver5 = null;
        authenticationState0.removeObserver(authStateObserver5);
        models.superManager.SuperManager superManager7 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        boolean boolean10 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver8 = null;
        authenticationState0.removeObserver(authStateObserver8);
        boolean boolean10 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager11 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        models.auth.AuthStateObserver authStateObserver3 = null;
        authenticationState0.removeObserver(authStateObserver3);
        boolean boolean5 = authenticationState0.isClientLoggedIn();
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager13 = authenticationState0.getLoggedInManager();
        boolean boolean14 = authenticationState0.isLoggedIn();
        boolean boolean15 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean16 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean17 = authenticationState0.isLoggedIn();
        models.auth.AuthStateObserver authStateObserver18 = null;
        authenticationState0.addObserver(authStateObserver18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        models.client.Client client7 = authenticationState0.getLoggedInClient();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        boolean boolean9 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authenticationState0.getLoggedInSuperManager();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = user8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.addObserver(authStateObserver10);
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.user.User user13 = authenticationState0.getLoggedInUser();
        boolean boolean14 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        boolean boolean3 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user4 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        models.user.User user1 = null;
// flaky:         authenticationState0.setLoggedInUser(user1);
        models.superManager.SuperManager superManager3 = authenticationState0.getLoggedInSuperManager();
        boolean boolean4 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user5 = authenticationState0.getLoggedInUser();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = user3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.superManager.SuperManager superManager13 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver14 = null;
        authenticationState0.addObserver(authStateObserver14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.user.User user4 = null;
// flaky:         authenticationState0.setLoggedInUser(user4);
        models.auth.AuthStateObserver authStateObserver6 = null;
        authenticationState0.removeObserver(authStateObserver6);
        models.auth.AuthStateObserver authStateObserver8 = null;
        authenticationState0.removeObserver(authStateObserver8);
        boolean boolean10 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.user.User user4 = null;
        authenticationState0.setLoggedInUser(user4);
        models.auth.AuthStateObserver authStateObserver6 = null;
        authenticationState0.removeObserver(authStateObserver6);
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.superManager.SuperManager superManager11 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.addObserver(authStateObserver4);
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        boolean boolean8 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.addObserver(authStateObserver4);
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.client.Client client8 = authenticationState0.getLoggedInClient();
        boolean boolean9 = authenticationState0.isSuperManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.removeObserver(authStateObserver10);
        models.manager.Manager manager12 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.user.User user10 = null;
        authenticationState0.setLoggedInUser(user10);
        models.manager.Manager manager12 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.user.User user4 = null;
        authenticationState0.setLoggedInUser(user4);
        models.auth.AuthStateObserver authStateObserver6 = null;
        authenticationState0.removeObserver(authStateObserver6);
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.removeObserver(authStateObserver9);
        boolean boolean11 = authenticationState0.isManagerLoggedIn();
        models.user.User user12 = null;
        authenticationState0.setLoggedInUser(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager13 = authenticationState0.getLoggedInManager();
        boolean boolean14 = authenticationState0.isLoggedIn();
        models.auth.AuthStateObserver authStateObserver15 = null;
        authenticationState0.addObserver(authStateObserver15);
        boolean boolean17 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.user.User user10 = null;
        authenticationState0.setLoggedInUser(user10);
        models.client.Client client12 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.addObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        boolean boolean9 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        boolean boolean10 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user11 = null;
        authenticationState0.setLoggedInUser(user11);
        models.user.User user13 = null;
        authenticationState0.setLoggedInUser(user13);
        models.user.User user15 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager13 = authenticationState0.getLoggedInManager();
        boolean boolean14 = authenticationState0.isLoggedIn();
        boolean boolean15 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean16 = authenticationState0.isClientLoggedIn();
        models.client.Client client17 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.superManager.SuperManager superManager10 = authenticationState0.getLoggedInSuperManager();
        models.superManager.SuperManager superManager11 = authenticationState0.getLoggedInSuperManager();
        models.user.User user12 = null;
        authenticationState0.setLoggedInUser(user12);
        models.user.User user14 = authenticationState0.getLoggedInUser();
        models.superManager.SuperManager superManager15 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager15);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager13 = authenticationState0.getLoggedInManager();
        boolean boolean14 = authenticationState0.isLoggedIn();
        boolean boolean15 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean16 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean17 = authenticationState0.isLoggedIn();
        boolean boolean18 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isManagerLoggedIn();
        models.user.User user6 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.auth.AuthStateObserver authStateObserver6 = null;
        authenticationState0.addObserver(authStateObserver6);
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.manager.Manager manager9 = authenticationState0.getLoggedInManager();
        boolean boolean10 = authenticationState0.isLoggedIn();
        boolean boolean11 = authenticationState0.isSuperManagerLoggedIn();
        java.lang.Class<?> wildcardClass12 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.superManager.SuperManager superManager10 = authenticationState0.getLoggedInSuperManager();
        models.superManager.SuperManager superManager11 = authenticationState0.getLoggedInSuperManager();
        models.user.User user12 = null;
        authenticationState0.setLoggedInUser(user12);
        models.auth.AuthStateObserver authStateObserver14 = null;
        authenticationState0.addObserver(authStateObserver14);
        models.superManager.SuperManager superManager16 = authenticationState0.getLoggedInSuperManager();
        models.superManager.SuperManager superManager17 = authenticationState0.getLoggedInSuperManager();
        boolean boolean18 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager13 = authenticationState0.getLoggedInManager();
        boolean boolean14 = authenticationState0.isLoggedIn();
        boolean boolean15 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean16 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean17 = authenticationState0.isLoggedIn();
        models.auth.AuthStateObserver authStateObserver18 = null;
        authenticationState0.removeObserver(authStateObserver18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        boolean boolean8 = authenticationState0.isManagerLoggedIn();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        boolean boolean10 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        boolean boolean5 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user6 = authenticationState0.getLoggedInUser();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.auth.AuthStateObserver authStateObserver8 = null;
        authenticationState0.addObserver(authStateObserver8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authenticationState0.getLoggedInSuperManager();
        models.user.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            authenticationState0.setLoggedInUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.auth.AuthStateObserver.onAuthStateChanged(boolean)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.user.User user4 = null;
        authenticationState0.setLoggedInUser(user4);
        models.auth.AuthStateObserver authStateObserver6 = null;
        authenticationState0.removeObserver(authStateObserver6);
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        boolean boolean11 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        boolean boolean5 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user6 = authenticationState0.getLoggedInUser();
        models.auth.AuthStateObserver authStateObserver7 = null;
        authenticationState0.addObserver(authStateObserver7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        models.manager.Manager manager5 = authenticationState0.getLoggedInManager();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isSuperManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.removeObserver(authStateObserver10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        models.auth.AuthStateObserver authStateObserver7 = null;
        authenticationState0.removeObserver(authStateObserver7);
        models.client.Client client9 = authenticationState0.getLoggedInClient();
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.addObserver(authStateObserver10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        boolean boolean9 = authenticationState0.isLoggedIn();
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.removeObserver(authStateObserver10);
        models.auth.AuthStateObserver authStateObserver12 = null;
        authenticationState0.removeObserver(authStateObserver12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.superManager.SuperManager superManager10 = authenticationState0.getLoggedInSuperManager();
        models.superManager.SuperManager superManager11 = authenticationState0.getLoggedInSuperManager();
        models.user.User user12 = null;
        authenticationState0.setLoggedInUser(user12);
        boolean boolean14 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isSuperManagerLoggedIn();
        java.lang.Class<?> wildcardClass10 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isSuperManagerLoggedIn();
        models.superManager.SuperManager superManager10 = authenticationState0.getLoggedInSuperManager();
        boolean boolean11 = authenticationState0.isLoggedIn();
        models.user.User user12 = null;
        authenticationState0.setLoggedInUser(user12);
        models.user.User user14 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        boolean boolean10 = authenticationState0.isSuperManagerLoggedIn();
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager12 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.user.User user4 = null;
        authenticationState0.setLoggedInUser(user4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        java.lang.Class<?> wildcardClass7 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isSuperManagerLoggedIn();
        models.superManager.SuperManager superManager10 = authenticationState0.getLoggedInSuperManager();
        boolean boolean11 = authenticationState0.isSuperManagerLoggedIn();
        models.manager.Manager manager12 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        boolean boolean8 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.auth.AuthStateObserver authStateObserver6 = null;
        authenticationState0.removeObserver(authStateObserver6);
        models.auth.AuthStateObserver authStateObserver8 = null;
        authenticationState0.removeObserver(authStateObserver8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager13 = authenticationState0.getLoggedInManager();
        boolean boolean14 = authenticationState0.isLoggedIn();
        models.auth.AuthStateObserver authStateObserver15 = null;
        authenticationState0.addObserver(authStateObserver15);
        boolean boolean17 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.manager.Manager manager9 = authenticationState0.getLoggedInManager();
        boolean boolean10 = authenticationState0.isLoggedIn();
        boolean boolean11 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean12 = authenticationState0.isLoggedIn();
        java.lang.Class<?> wildcardClass13 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        models.user.User user1 = null;
// flaky:         authenticationState0.setLoggedInUser(user1);
        models.superManager.SuperManager superManager3 = authenticationState0.getLoggedInSuperManager();
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isClientLoggedIn();
        boolean boolean6 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        models.user.User user9 = null;
        authenticationState0.setLoggedInUser(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isClientLoggedIn();
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.addObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        models.manager.Manager manager10 = authenticationState0.getLoggedInManager();
        boolean boolean11 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        models.manager.Manager manager5 = authenticationState0.getLoggedInManager();
        models.user.User user6 = authenticationState0.getLoggedInUser();
        java.lang.Class<?> wildcardClass7 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        models.user.User user9 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager10 = authenticationState0.getLoggedInManager();
        models.auth.AuthStateObserver authStateObserver11 = null;
        authenticationState0.removeObserver(authStateObserver11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user5 = authenticationState0.getLoggedInUser();
        models.user.User user6 = null;
        authenticationState0.setLoggedInUser(user6);
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        java.lang.Class<?> wildcardClass9 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        boolean boolean10 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user11 = null;
        authenticationState0.setLoggedInUser(user11);
        models.user.User user13 = null;
        authenticationState0.setLoggedInUser(user13);
        boolean boolean15 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver16 = null;
        authenticationState0.addObserver(authStateObserver16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        boolean boolean10 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user11 = null;
        authenticationState0.setLoggedInUser(user11);
        java.lang.Class<?> wildcardClass13 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        models.client.Client client7 = authenticationState0.getLoggedInClient();
        boolean boolean8 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.removeObserver(authStateObserver9);
        models.auth.AuthStateObserver authStateObserver11 = null;
        authenticationState0.removeObserver(authStateObserver11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.auth.AuthStateObserver authStateObserver6 = null;
        authenticationState0.addObserver(authStateObserver6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.addObserver(authStateObserver4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.user.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            authenticationState0.setLoggedInUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.auth.AuthStateObserver.onAuthStateChanged(boolean)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        models.auth.AuthStateObserver authStateObserver3 = null;
        authenticationState0.removeObserver(authStateObserver3);
        models.auth.AuthStateObserver authStateObserver5 = null;
        authenticationState0.addObserver(authStateObserver5);
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        boolean boolean8 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        boolean boolean10 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        models.user.User user1 = null;
        authenticationState0.setLoggedInUser(user1);
        models.superManager.SuperManager superManager3 = authenticationState0.getLoggedInSuperManager();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        models.manager.Manager manager5 = authenticationState0.getLoggedInManager();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        models.user.User user1 = null;
        authenticationState0.setLoggedInUser(user1);
        models.auth.AuthStateObserver authStateObserver3 = null;
        authenticationState0.removeObserver(authStateObserver3);
        models.auth.AuthStateObserver authStateObserver5 = null;
        authenticationState0.addObserver(authStateObserver5);
        models.user.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            authenticationState0.setLoggedInUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.auth.AuthStateObserver.onAuthStateChanged(boolean)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.user.User user4 = null;
        authenticationState0.setLoggedInUser(user4);
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        boolean boolean10 = authenticationState0.isSuperManagerLoggedIn();
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.auth.AuthStateObserver authStateObserver12 = null;
        authenticationState0.removeObserver(authStateObserver12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        models.client.Client client9 = authenticationState0.getLoggedInClient();
        boolean boolean10 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        models.manager.Manager manager10 = authenticationState0.getLoggedInManager();
        models.superManager.SuperManager superManager11 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        models.user.User user9 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager10 = authenticationState0.getLoggedInManager();
        models.auth.AuthStateObserver authStateObserver11 = null;
        authenticationState0.addObserver(authStateObserver11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean8 = authenticationState0.isSuperManagerLoggedIn();
        java.lang.Class<?> wildcardClass9 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.client.Client client9 = authenticationState0.getLoggedInClient();
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.removeObserver(authStateObserver10);
        models.client.Client client12 = authenticationState0.getLoggedInClient();
        models.user.User user13 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver7 = null;
        authenticationState0.removeObserver(authStateObserver7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.user.User user10 = null;
        authenticationState0.setLoggedInUser(user10);
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.user.User user13 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        boolean boolean9 = authenticationState0.isLoggedIn();
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.removeObserver(authStateObserver10);
        boolean boolean12 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        models.user.User user1 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        models.manager.Manager manager5 = authenticationState0.getLoggedInManager();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        models.manager.Manager manager7 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        models.client.Client client7 = authenticationState0.getLoggedInClient();
        models.client.Client client8 = authenticationState0.getLoggedInClient();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.removeObserver(authStateObserver9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        models.client.Client client7 = authenticationState0.getLoggedInClient();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        models.manager.Manager manager9 = authenticationState0.getLoggedInManager();
        boolean boolean10 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.removeObserver(authStateObserver10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.removeObserver(authStateObserver9);
        boolean boolean11 = authenticationState0.isClientLoggedIn();
        models.user.User user12 = null;
        authenticationState0.setLoggedInUser(user12);
        boolean boolean14 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        java.lang.Class<?> wildcardClass2 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.superManager.SuperManager superManager10 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user5 = authenticationState0.getLoggedInUser();
        boolean boolean6 = authenticationState0.isLoggedIn();
        models.auth.AuthStateObserver authStateObserver7 = null;
        authenticationState0.addObserver(authStateObserver7);
        boolean boolean9 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean10 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.removeObserver(authStateObserver9);
        boolean boolean11 = authenticationState0.isClientLoggedIn();
        models.manager.Manager manager12 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager12);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager4 = authenticationState0.getLoggedInManager();
        models.manager.Manager manager5 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.client.Client client9 = authenticationState0.getLoggedInClient();
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.removeObserver(authStateObserver10);
        boolean boolean12 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.client.Client client6 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager13 = authenticationState0.getLoggedInManager();
        boolean boolean14 = authenticationState0.isManagerLoggedIn();
        boolean boolean15 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.addObserver(authStateObserver4);
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.addObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isSuperManagerLoggedIn();
        models.manager.Manager manager7 = authenticationState0.getLoggedInManager();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager4 = authenticationState0.getLoggedInManager();
        models.auth.AuthStateObserver authStateObserver5 = null;
        authenticationState0.removeObserver(authStateObserver5);
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.addObserver(authStateObserver10);
        boolean boolean12 = authenticationState0.isClientLoggedIn();
        models.auth.AuthStateObserver authStateObserver13 = null;
        authenticationState0.addObserver(authStateObserver13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        models.auth.AuthStateObserver authStateObserver3 = null;
        authenticationState0.removeObserver(authStateObserver3);
        models.manager.Manager manager5 = authenticationState0.getLoggedInManager();
        models.user.User user6 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        boolean boolean8 = authenticationState0.isManagerLoggedIn();
        models.client.Client client9 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        models.client.Client client7 = authenticationState0.getLoggedInClient();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.user.User user4 = null;
        authenticationState0.setLoggedInUser(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        models.user.User user1 = null;
        authenticationState0.setLoggedInUser(user1);
        models.superManager.SuperManager superManager3 = authenticationState0.getLoggedInSuperManager();
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isClientLoggedIn();
        boolean boolean6 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver8 = null;
        authenticationState0.removeObserver(authStateObserver8);
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.removeObserver(authStateObserver10);
        models.user.User user12 = null;
        authenticationState0.setLoggedInUser(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isManagerLoggedIn();
        boolean boolean6 = authenticationState0.isLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager4 = authenticationState0.getLoggedInManager();
        models.auth.AuthStateObserver authStateObserver5 = null;
        authenticationState0.removeObserver(authStateObserver5);
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        boolean boolean8 = authenticationState0.isClientLoggedIn();
        models.client.Client client9 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        models.client.Client client7 = authenticationState0.getLoggedInClient();
        boolean boolean8 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isClientLoggedIn();
        java.lang.Class<?> wildcardClass6 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isSuperManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver7 = null;
        authenticationState0.removeObserver(authStateObserver7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager4 = authenticationState0.getLoggedInManager();
        boolean boolean5 = authenticationState0.isManagerLoggedIn();
        java.lang.Class<?> wildcardClass6 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.client.Client client9 = authenticationState0.getLoggedInClient();
        models.auth.AuthStateObserver authStateObserver10 = null;
        authenticationState0.removeObserver(authStateObserver10);
        boolean boolean12 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver13 = null;
        authenticationState0.addObserver(authStateObserver13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        models.manager.Manager manager5 = authenticationState0.getLoggedInManager();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager13 = authenticationState0.getLoggedInManager();
        boolean boolean14 = authenticationState0.isLoggedIn();
        models.auth.AuthStateObserver authStateObserver15 = null;
        authenticationState0.addObserver(authStateObserver15);
        boolean boolean17 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user18 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        models.manager.Manager manager5 = authenticationState0.getLoggedInManager();
        models.user.User user6 = authenticationState0.getLoggedInUser();
        models.user.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            authenticationState0.setLoggedInUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.auth.AuthStateObserver.onAuthStateChanged(boolean)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean5 = authenticationState0.isManagerLoggedIn();
        boolean boolean6 = authenticationState0.isLoggedIn();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        models.user.User user9 = null;
// flaky:         authenticationState0.setLoggedInUser(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isClientLoggedIn();
        models.auth.AuthStateObserver authStateObserver6 = null;
        authenticationState0.addObserver(authStateObserver6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        boolean boolean9 = authenticationState0.isLoggedIn();
        boolean boolean10 = authenticationState0.isClientLoggedIn();
        boolean boolean11 = authenticationState0.isClientLoggedIn();
        boolean boolean12 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        boolean boolean10 = authenticationState0.isLoggedIn();
        models.superManager.SuperManager superManager11 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        models.user.User user1 = null;
        authenticationState0.setLoggedInUser(user1);
        models.auth.AuthStateObserver authStateObserver3 = null;
        authenticationState0.removeObserver(authStateObserver3);
        models.auth.AuthStateObserver authStateObserver5 = null;
        authenticationState0.addObserver(authStateObserver5);
        models.auth.AuthStateObserver authStateObserver7 = null;
        authenticationState0.removeObserver(authStateObserver7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        boolean boolean10 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean11 = authenticationState0.isManagerLoggedIn();
        models.client.Client client12 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client12);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.addObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        models.auth.AuthStateObserver authStateObserver7 = null;
        authenticationState0.removeObserver(authStateObserver7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver3 = null;
        authenticationState0.addObserver(authStateObserver3);
        boolean boolean5 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        models.superManager.SuperManager superManager9 = authenticationState0.getLoggedInSuperManager();
        boolean boolean10 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.auth.AuthStateObserver authStateObserver8 = null;
        authenticationState0.removeObserver(authStateObserver8);
        models.manager.Manager manager10 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.user.User user9 = null;
        authenticationState0.setLoggedInUser(user9);
        boolean boolean11 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean8 = authenticationState0.isLoggedIn();
        java.lang.Class<?> wildcardClass9 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
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
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        models.user.User user1 = null;
        authenticationState0.setLoggedInUser(user1);
        models.superManager.SuperManager superManager3 = authenticationState0.getLoggedInSuperManager();
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.user.User user10 = null;
        authenticationState0.setLoggedInUser(user10);
        models.user.User user12 = authenticationState0.getLoggedInUser();
        boolean boolean13 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean14 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isLoggedIn();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        models.client.Client client7 = authenticationState0.getLoggedInClient();
        models.auth.AuthStateObserver authStateObserver8 = null;
        authenticationState0.removeObserver(authStateObserver8);
        boolean boolean10 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        models.client.Client client5 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        models.auth.AuthStateObserver authStateObserver5 = null;
        authenticationState0.removeObserver(authStateObserver5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        models.user.User user5 = authenticationState0.getLoggedInUser();
        boolean boolean6 = authenticationState0.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        models.user.User user5 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        boolean boolean5 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user6 = authenticationState0.getLoggedInUser();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        java.lang.Class<?> wildcardClass8 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver8 = null;
        authenticationState0.removeObserver(authStateObserver8);
        models.user.User user10 = null;
        authenticationState0.setLoggedInUser(user10);
        models.user.User user12 = null;
        authenticationState0.setLoggedInUser(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        boolean boolean9 = authenticationState0.isClientLoggedIn();
        boolean boolean10 = authenticationState0.isSuperManagerLoggedIn();
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.auth.AuthStateObserver authStateObserver12 = null;
        authenticationState0.addObserver(authStateObserver12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.addObserver(authStateObserver4);
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        models.user.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            authenticationState0.setLoggedInUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.auth.AuthStateObserver.onAuthStateChanged(boolean)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager13 = authenticationState0.getLoggedInManager();
        boolean boolean14 = authenticationState0.isClientLoggedIn();
        models.user.User user15 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.superManager.SuperManager superManager10 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver11 = null;
        authenticationState0.addObserver(authStateObserver11);
        models.client.Client client13 = authenticationState0.getLoggedInClient();
        boolean boolean14 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.user.User user4 = null;
        authenticationState0.setLoggedInUser(user4);
        models.auth.AuthStateObserver authStateObserver6 = null;
        authenticationState0.removeObserver(authStateObserver6);
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.user.User user9 = authenticationState0.getLoggedInUser();
        models.superManager.SuperManager superManager10 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver11 = null;
        authenticationState0.removeObserver(authStateObserver11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isLoggedIn();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        models.client.Client client9 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.superManager.SuperManager superManager10 = authenticationState0.getLoggedInSuperManager();
        models.superManager.SuperManager superManager11 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver12 = null;
        authenticationState0.addObserver(authStateObserver12);
        boolean boolean14 = authenticationState0.isManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager13 = authenticationState0.getLoggedInManager();
        models.auth.AuthStateObserver authStateObserver14 = null;
        authenticationState0.removeObserver(authStateObserver14);
        boolean boolean16 = authenticationState0.isClientLoggedIn();
        models.user.User user17 = null;
        authenticationState0.setLoggedInUser(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        models.user.User user5 = authenticationState0.getLoggedInUser();
        models.client.Client client6 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        boolean boolean5 = authenticationState0.isSuperManagerLoggedIn();
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.superManager.SuperManager superManager10 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver11 = null;
        authenticationState0.addObserver(authStateObserver11);
        models.manager.Manager manager13 = authenticationState0.getLoggedInManager();
        models.user.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            authenticationState0.setLoggedInUser(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.auth.AuthStateObserver.onAuthStateChanged(boolean)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager13);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        models.client.Client client9 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        models.user.User user7 = authenticationState0.getLoggedInUser();
        models.user.User user8 = null;
        authenticationState0.setLoggedInUser(user8);
        models.superManager.SuperManager superManager10 = authenticationState0.getLoggedInSuperManager();
        models.superManager.SuperManager superManager11 = authenticationState0.getLoggedInSuperManager();
        models.client.Client client12 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client12);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean8 = authenticationState0.isClientLoggedIn();
        models.client.Client client9 = authenticationState0.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        models.superManager.SuperManager superManager4 = authenticationState0.getLoggedInSuperManager();
        boolean boolean5 = authenticationState0.isLoggedIn();
        models.manager.Manager manager6 = authenticationState0.getLoggedInManager();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.manager.Manager manager8 = authenticationState0.getLoggedInManager();
        boolean boolean9 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager10 = authenticationState0.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.addObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean7 = authenticationState0.isLoggedIn();
        models.user.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            authenticationState0.setLoggedInUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.auth.AuthStateObserver.onAuthStateChanged(boolean)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.removeObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager8 = authenticationState0.getLoggedInSuperManager();
        models.auth.AuthStateObserver authStateObserver9 = null;
        authenticationState0.addObserver(authStateObserver9);
        models.client.Client client11 = authenticationState0.getLoggedInClient();
        models.user.User user12 = authenticationState0.getLoggedInUser();
        models.manager.Manager manager13 = authenticationState0.getLoggedInManager();
        boolean boolean14 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager15 = authenticationState0.getLoggedInManager();
        models.user.User user16 = authenticationState0.getLoggedInUser();
        models.superManager.SuperManager superManager17 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager17);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.client.Client client3 = authenticationState0.getLoggedInClient();
        boolean boolean4 = authenticationState0.isSuperManagerLoggedIn();
        models.superManager.SuperManager superManager5 = authenticationState0.getLoggedInSuperManager();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        models.auth.AuthStateObserver authStateObserver3 = null;
        authenticationState0.removeObserver(authStateObserver3);
        models.manager.Manager manager5 = authenticationState0.getLoggedInManager();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        java.lang.Class<?> wildcardClass7 = authenticationState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        boolean boolean4 = authenticationState0.isLoggedIn();
        models.manager.Manager manager5 = authenticationState0.getLoggedInManager();
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        boolean boolean8 = authenticationState0.isManagerLoggedIn();
        boolean boolean9 = authenticationState0.isSuperManagerLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver3 = null;
        authenticationState0.addObserver(authStateObserver3);
        models.user.User user5 = authenticationState0.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        boolean boolean2 = authenticationState0.isManagerLoggedIn();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.auth.AuthStateObserver authStateObserver4 = null;
        authenticationState0.addObserver(authStateObserver4);
        boolean boolean6 = authenticationState0.isSuperManagerLoggedIn();
        boolean boolean7 = authenticationState0.isClientLoggedIn();
        models.user.User user8 = authenticationState0.getLoggedInUser();
        models.superManager.SuperManager superManager9 = authenticationState0.getLoggedInSuperManager();
        boolean boolean10 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        models.manager.Manager manager1 = authenticationState0.getLoggedInManager();
        boolean boolean2 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.auth.AuthStateObserver authStateObserver2 = null;
        authenticationState0.removeObserver(authStateObserver2);
        models.user.User user4 = null;
// flaky:         authenticationState0.setLoggedInUser(user4);
        boolean boolean6 = authenticationState0.isClientLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        models.auth.AuthenticationState authenticationState0 = models.auth.AuthenticationState.getInstance();
        boolean boolean1 = authenticationState0.isManagerLoggedIn();
        models.manager.Manager manager2 = authenticationState0.getLoggedInManager();
        models.user.User user3 = authenticationState0.getLoggedInUser();
        models.client.Client client4 = authenticationState0.getLoggedInClient();
        boolean boolean5 = authenticationState0.isClientLoggedIn();
        models.superManager.SuperManager superManager6 = authenticationState0.getLoggedInSuperManager();
        models.superManager.SuperManager superManager7 = authenticationState0.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationState0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
    }
}
