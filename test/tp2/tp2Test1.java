package tp2;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class tp2Test1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test001"); }


    tp2.StubTime stubTime0 = new tp2.StubTime();
    long long1 = stubTime0.getCurrentTime();
    long long2 = stubTime0.getCurrentTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 200000L);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test002"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addException(iP13);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    server16.update();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b29 = server16.addBan(iP28);
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b36 = server30.connect(iP35);
    java.lang.String str37 = server30.toString();
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b44 = server38.connect(iP43);
    boolean b45 = server30.addException(iP43);
    tp2.Server server46 = new tp2.Server();
    tp2.Server server47 = new tp2.Server();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b53 = server47.connect(iP52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b59 = server47.addBan(iP58);
    boolean b60 = server46.removeException(iP58);
    boolean b61 = server30.addException(iP58);
    boolean b62 = server16.addBan(iP58);
    tp2.StubTime stubTime63 = new tp2.StubTime();
    server16.setTime((tp2.ITime)stubTime63);
    long long65 = stubTime63.getCurrentTime();
    long long66 = stubTime63.getCurrentTime();
    long long67 = stubTime63.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime63);
    boolean b69 = server0.repOK();
    java.lang.String str70 = server0.toString();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1, (java.lang.Integer)0);
    boolean b76 = server0.removeException(iP75);
    boolean b77 = server0.repOK();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str37.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long65 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long66 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long67 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str70.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test003"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.Server server2 = new tp2.Server();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b8 = server2.connect(iP7);
    server2.update();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b15 = server2.addBan(iP14);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    java.lang.String str23 = server16.toString();
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b30 = server24.connect(iP29);
    boolean b31 = server16.addException(iP29);
    tp2.Server server32 = new tp2.Server();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b45 = server33.addBan(iP44);
    boolean b46 = server32.removeException(iP44);
    boolean b47 = server16.addException(iP44);
    boolean b48 = server2.addBan(iP44);
    boolean b49 = server0.removeException(iP44);
    boolean b50 = server0.repOK();
    boolean b51 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test004"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test005"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addException(iP13);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    server16.update();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b29 = server16.addBan(iP28);
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b36 = server30.connect(iP35);
    java.lang.String str37 = server30.toString();
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b44 = server38.connect(iP43);
    boolean b45 = server30.addException(iP43);
    tp2.Server server46 = new tp2.Server();
    tp2.Server server47 = new tp2.Server();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b53 = server47.connect(iP52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b59 = server47.addBan(iP58);
    boolean b60 = server46.removeException(iP58);
    boolean b61 = server30.addException(iP58);
    boolean b62 = server16.addBan(iP58);
    tp2.StubTime stubTime63 = new tp2.StubTime();
    server16.setTime((tp2.ITime)stubTime63);
    long long65 = stubTime63.getCurrentTime();
    long long66 = stubTime63.getCurrentTime();
    long long67 = stubTime63.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime63);
    boolean b69 = server0.repOK();
    tp2.StubTime stubTime70 = new tp2.StubTime();
    server0.setTime((tp2.ITime)stubTime70);
    java.lang.String str72 = server0.toString();
    tp2.ITime iTime73 = null;
    server0.setTime(iTime73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str37.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long65 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long66 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long67 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str72.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test006"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    java.lang.String str14 = server0.toString();
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    server15.update();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b28 = server15.addBan(iP27);
    boolean b29 = server0.removeBan(iP27);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)0);
    boolean b35 = server0.connect(iP34);
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server36.connect(iP41);
    tp2.ITime iTime43 = null;
    server36.setTime(iTime43);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b50 = server36.removeException(iP49);
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b56 = server36.removeException(iP55);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    boolean b62 = server36.connect(iP61);
    boolean b63 = server0.removeBan(iP61);
    boolean b64 = server0.repOK();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)(-1));
    boolean b70 = server0.addBan(iP69);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=1465597327490, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597387490]]}]"+ "'", str14.equals("Server [lastUpdate=1465597327490, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597387490]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test007"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)10, (java.lang.Integer)0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test008"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addBan(iP13);
    server0.update();
    server0.update();
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b24 = server18.connect(iP23);
    server18.update();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b31 = server18.addBan(iP30);
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b38 = server32.connect(iP37);
    java.lang.String str39 = server32.toString();
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b46 = server40.connect(iP45);
    boolean b47 = server32.addException(iP45);
    tp2.Server server48 = new tp2.Server();
    tp2.Server server49 = new tp2.Server();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b55 = server49.connect(iP54);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b61 = server49.addBan(iP60);
    boolean b62 = server48.removeException(iP60);
    boolean b63 = server32.addException(iP60);
    boolean b64 = server18.addBan(iP60);
    tp2.StubTime stubTime65 = new tp2.StubTime();
    server18.setTime((tp2.ITime)stubTime65);
    server0.setTime((tp2.ITime)stubTime65);
    tp2.Server server68 = new tp2.Server();
    server68.update();
    tp2.Server server70 = new tp2.Server();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b76 = server70.connect(iP75);
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b82 = server70.addBan(iP81);
    boolean b83 = server68.addBan(iP81);
    boolean b84 = server0.connect(iP81);
    tp2.StubTime stubTime85 = new tp2.StubTime();
    long long86 = stubTime85.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime85);
    long long88 = stubTime85.getCurrentTime();
    long long89 = stubTime85.getCurrentTime();
    long long90 = stubTime85.getCurrentTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str39.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long86 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long88 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long89 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long90 == 200000L);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test009"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)100);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test010"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addBan(iP21);
    server0.update();
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b32 = server26.connect(iP31);
    server26.update();
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b40 = server34.connect(iP39);
    server34.update();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    boolean b49 = server34.addBan(iP47);
    boolean b50 = server26.addBan(iP47);
    boolean b51 = server0.addBan(iP47);
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b58 = server52.connect(iP57);
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b64 = server52.addBan(iP63);
    tp2.Server server65 = new tp2.Server();
    server65.update();
    tp2.Server server67 = new tp2.Server();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b73 = server67.connect(iP72);
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b79 = server67.addBan(iP78);
    boolean b80 = server65.addBan(iP78);
    boolean b81 = server52.removeException(iP78);
    boolean b82 = server0.connect(iP78);
    server0.update();
    java.lang.String str84 = server0.toString();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + "Server [lastUpdate=1465597327554, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597387550]]}]"+ "'", str84.equals("Server [lastUpdate=1465597327554, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597387550]]}]"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test011"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b18 = server0.removeException(iP17);
    java.lang.Integer i21 = null;
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)100, i21, (java.lang.Integer)10);
    boolean b24 = server0.removeException(iP23);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)1);
    boolean b30 = server0.removeException(iP29);
    java.lang.String str31 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={[IPBan [ip=-1.10.1.1, expires=1465597387584]]}]"+ "'", str31.equals("Server [lastUpdate=0, exceptions=(), bans={[IPBan [ip=-1.10.1.1, expires=1465597387584]]}]"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test012"); }


    java.lang.Integer i2 = null;
    tp2.IP iP4 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)100, i2, (java.lang.Integer)10);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test013"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addBan(iP13);
    server0.update();
    server0.update();
    boolean b18 = server0.repOK();
    server0.update();
    boolean b20 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test014"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    java.lang.String str21 = server14.toString();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    boolean b29 = server14.addException(iP27);
    tp2.Server server30 = new tp2.Server();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b43 = server31.addBan(iP42);
    boolean b44 = server30.removeException(iP42);
    boolean b45 = server14.addException(iP42);
    boolean b46 = server0.addBan(iP42);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b52 = server0.connect(iP51);
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)0);
    boolean b58 = server0.removeBan(iP57);
    java.lang.String str59 = server0.toString();
    boolean b60 = server0.repOK();
    tp2.IP iP61 = null;
    boolean b62 = server0.removeException(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "Server [lastUpdate=1465597327595, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597387595]][IPBan [ip=-1.10.1.1, expires=1465597387596]]}]"+ "'", str59.equals("Server [lastUpdate=1465597327595, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597387595]][IPBan [ip=-1.10.1.1, expires=1465597387596]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test015"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b19 = server13.connect(iP18);
    tp2.ITime iTime20 = null;
    server13.setTime(iTime20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b27 = server13.removeException(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b34 = server28.connect(iP33);
    server28.update();
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server36.connect(iP41);
    server36.update();
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b50 = server44.connect(iP49);
    boolean b51 = server36.addBan(iP49);
    boolean b52 = server28.addBan(iP49);
    boolean b53 = server13.connect(iP49);
    boolean b54 = server0.removeBan(iP49);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b60 = server0.addBan(iP59);
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    boolean b66 = server0.connect(iP65);
    java.lang.String str67 = server0.toString();
    server0.update();
    boolean b69 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={[IPBan [ip=-1.10.1.1, expires=1465597387614]][IPBan [ip=-1.0.10.1, expires=1465597387617]]}]"+ "'", str67.equals("Server [lastUpdate=0, exceptions=(), bans={[IPBan [ip=-1.10.1.1, expires=1465597387614]][IPBan [ip=-1.0.10.1, expires=1465597387617]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test016"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)1);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test017"); }


    tp2.Server server0 = new tp2.Server();
    tp2.Server server1 = new tp2.Server();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b7 = server1.connect(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b13 = server1.addBan(iP12);
    boolean b14 = server0.removeException(iP12);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b27 = server15.addBan(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b34 = server28.connect(iP33);
    tp2.ITime iTime35 = null;
    server28.setTime(iTime35);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server28.removeException(iP41);
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b49 = server43.connect(iP48);
    server43.update();
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b57 = server51.connect(iP56);
    server51.update();
    tp2.Server server59 = new tp2.Server();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b65 = server59.connect(iP64);
    boolean b66 = server51.addBan(iP64);
    boolean b67 = server43.addBan(iP64);
    boolean b68 = server28.connect(iP64);
    boolean b69 = server15.removeBan(iP64);
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b75 = server15.removeBan(iP74);
    boolean b76 = server0.addException(iP74);
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b82 = server0.addException(iP81);
    boolean b83 = server0.repOK();
    java.lang.Integer i87 = null;
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)100, (java.lang.Integer)0, i87);
    boolean b89 = server0.addException(iP88);
    boolean b90 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test018"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)0);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b16 = server10.connect(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b23 = server17.connect(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b29 = server17.addBan(iP28);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b35 = server17.removeException(iP34);
    boolean b36 = server10.addException(iP34);
    boolean b37 = server10.repOK();
    boolean b38 = server10.repOK();
    server10.update();
    server10.update();
    java.lang.Integer i44 = null;
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10, i44);
    boolean b46 = server10.addBan(iP45);
    // The following exception was thrown during execution in test generation
    try {
      boolean b47 = server0.connect(iP45);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test019"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    server13.update();
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b27 = server15.addBan(iP26);
    boolean b28 = server13.addBan(iP26);
    boolean b29 = server0.removeException(iP26);
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b36 = server30.connect(iP35);
    boolean b37 = server0.connect(iP35);
    java.lang.String str38 = server0.toString();
    tp2.IP iP39 = null;
    boolean b40 = server0.removeException(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={[IPBan [ip=-1.10.1.1, expires=1465597387677]]}]"+ "'", str38.equals("Server [lastUpdate=0, exceptions=(), bans={[IPBan [ip=-1.10.1.1, expires=1465597387677]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test020"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)1, (java.lang.Integer)10, (java.lang.Integer)0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test021"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    server13.update();
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b27 = server15.addBan(iP26);
    boolean b28 = server13.addBan(iP26);
    boolean b29 = server0.removeException(iP26);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)1);
    boolean b35 = server0.addException(iP34);
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server36.connect(iP41);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b48 = server36.addBan(iP47);
    boolean b49 = server0.connect(iP47);
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    server50.update();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server58.connect(iP63);
    boolean b65 = server50.addBan(iP63);
    server50.update();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    boolean b72 = server50.removeBan(iP71);
    boolean b73 = server0.removeBan(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test022"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addBan(iP13);
    server0.update();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b23 = server17.connect(iP22);
    server17.update();
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    server25.update();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    boolean b40 = server25.addBan(iP38);
    boolean b41 = server17.addBan(iP38);
    boolean b42 = server0.connect(iP38);
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b49 = server43.connect(iP48);
    server43.update();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b56 = server43.addBan(iP55);
    tp2.Server server57 = new tp2.Server();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b63 = server57.connect(iP62);
    java.lang.String str64 = server57.toString();
    tp2.Server server65 = new tp2.Server();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b71 = server65.connect(iP70);
    boolean b72 = server57.addException(iP70);
    tp2.Server server73 = new tp2.Server();
    tp2.Server server74 = new tp2.Server();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b80 = server74.connect(iP79);
    tp2.IP iP85 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b86 = server74.addBan(iP85);
    boolean b87 = server73.removeException(iP85);
    boolean b88 = server57.addException(iP85);
    boolean b89 = server43.addBan(iP85);
    tp2.StubTime stubTime90 = new tp2.StubTime();
    server43.setTime((tp2.ITime)stubTime90);
    long long92 = stubTime90.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime90);
    tp2.ITime iTime94 = null;
    server0.setTime(iTime94);
    tp2.IP iP96 = null;
    boolean b97 = server0.connect(iP96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str64.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long92 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == true);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test023"); }


    tp2.Server server0 = new tp2.Server();
    tp2.Server server1 = new tp2.Server();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b7 = server1.connect(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b13 = server1.addBan(iP12);
    boolean b14 = server0.removeException(iP12);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b27 = server15.addBan(iP26);
    boolean b28 = server15.repOK();
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b35 = server29.connect(iP34);
    server29.update();
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b43 = server37.connect(iP42);
    server37.update();
    tp2.Server server45 = new tp2.Server();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b51 = server45.connect(iP50);
    boolean b52 = server37.addBan(iP50);
    boolean b53 = server29.addBan(iP50);
    boolean b54 = server15.addException(iP50);
    boolean b55 = server0.addBan(iP50);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)0);
    boolean b61 = server0.removeException(iP60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test024"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server0.removeException(iP13);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    server15.update();
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b29 = server23.connect(iP28);
    server23.update();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    boolean b38 = server23.addBan(iP36);
    boolean b39 = server15.addBan(iP36);
    boolean b40 = server0.connect(iP36);
    tp2.Server server41 = new tp2.Server();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b47 = server41.connect(iP46);
    server41.update();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b54 = server41.addBan(iP53);
    tp2.Server server55 = new tp2.Server();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b61 = server55.connect(iP60);
    java.lang.String str62 = server55.toString();
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b69 = server63.connect(iP68);
    boolean b70 = server55.addException(iP68);
    tp2.Server server71 = new tp2.Server();
    tp2.Server server72 = new tp2.Server();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b78 = server72.connect(iP77);
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b84 = server72.addBan(iP83);
    boolean b85 = server71.removeException(iP83);
    boolean b86 = server55.addException(iP83);
    boolean b87 = server41.addBan(iP83);
    tp2.StubTime stubTime88 = new tp2.StubTime();
    server41.setTime((tp2.ITime)stubTime88);
    server0.setTime((tp2.ITime)stubTime88);
    long long91 = stubTime88.getCurrentTime();
    long long92 = stubTime88.getCurrentTime();
    long long93 = stubTime88.getCurrentTime();
    long long94 = stubTime88.getCurrentTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str62.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long91 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long92 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long93 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long94 == 200000L);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test025"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    java.lang.String str21 = server14.toString();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    boolean b29 = server14.addException(iP27);
    tp2.Server server30 = new tp2.Server();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b43 = server31.addBan(iP42);
    boolean b44 = server30.removeException(iP42);
    boolean b45 = server14.addException(iP42);
    boolean b46 = server0.addBan(iP42);
    boolean b47 = server0.repOK();
    java.lang.String str48 = server0.toString();
    server0.update();
    server0.update();
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b57 = server51.connect(iP56);
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b63 = server51.addBan(iP62);
    boolean b64 = server0.removeBan(iP62);
    java.lang.String str65 = server0.toString();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Server [lastUpdate=1465597327819, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597387819]][IPBan [ip=-1.10.1.1, expires=1465597387820]]}]"+ "'", str48.equals("Server [lastUpdate=1465597327819, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597387819]][IPBan [ip=-1.10.1.1, expires=1465597387820]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "Server [lastUpdate=1465597327820, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597387819]]}]"+ "'", str65.equals("Server [lastUpdate=1465597327820, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597387819]]}]"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test026"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addBan(iP13);
    java.lang.String str16 = server0.toString();
    java.lang.String str17 = server0.toString();
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b24 = server18.connect(iP23);
    java.lang.String str25 = server18.toString();
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b32 = server26.connect(iP31);
    boolean b33 = server18.addException(iP31);
    server18.update();
    boolean b35 = server18.repOK();
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server36.connect(iP41);
    server36.update();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b49 = server36.addBan(iP48);
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    java.lang.String str57 = server50.toString();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server58.connect(iP63);
    boolean b65 = server50.addException(iP63);
    tp2.Server server66 = new tp2.Server();
    tp2.Server server67 = new tp2.Server();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b73 = server67.connect(iP72);
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b79 = server67.addBan(iP78);
    boolean b80 = server66.removeException(iP78);
    boolean b81 = server50.addException(iP78);
    boolean b82 = server36.addBan(iP78);
    tp2.StubTime stubTime83 = new tp2.StubTime();
    server36.setTime((tp2.ITime)stubTime83);
    long long85 = stubTime83.getCurrentTime();
    long long86 = stubTime83.getCurrentTime();
    long long87 = stubTime83.getCurrentTime();
    server18.setTime((tp2.ITime)stubTime83);
    tp2.IP iP93 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)1);
    boolean b94 = server18.addBan(iP93);
    boolean b95 = server0.connect(iP93);
    java.lang.String str96 = server0.toString();
    java.lang.String str97 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=1465597327839, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597387840]]}]"+ "'", str16.equals("Server [lastUpdate=1465597327839, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597387840]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=1465597327839, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597387840]]}]"+ "'", str17.equals("Server [lastUpdate=1465597327839, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597387840]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str25.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str57.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long85 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long86 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long87 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str96 + "' != '" + "Server [lastUpdate=1465597327839, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597387840]]}]"+ "'", str96.equals("Server [lastUpdate=1465597327839, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597387840]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str97 + "' != '" + "Server [lastUpdate=1465597327839, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597387840]]}]"+ "'", str97.equals("Server [lastUpdate=1465597327839, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597387840]]}]"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test027"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addException(iP21);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    server25.update();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    boolean b40 = server25.addBan(iP38);
    server25.update();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    server42.update();
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    server50.update();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server58.connect(iP63);
    boolean b65 = server50.addBan(iP63);
    boolean b66 = server42.addBan(iP63);
    boolean b67 = server25.connect(iP63);
    boolean b68 = server0.removeBan(iP63);
    java.lang.String str69 = server0.toString();
    java.lang.String str70 = server0.toString();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)(-1));
    boolean b76 = server0.removeBan(iP75);
    boolean b77 = server0.repOK();
    boolean b78 = server0.repOK();
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b84 = server0.addBan(iP83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str69.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str70.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test028"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addException(iP21);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    server25.update();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    boolean b40 = server25.addBan(iP38);
    server25.update();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    server42.update();
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    server50.update();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server58.connect(iP63);
    boolean b65 = server50.addBan(iP63);
    boolean b66 = server42.addBan(iP63);
    boolean b67 = server25.connect(iP63);
    boolean b68 = server0.removeBan(iP63);
    java.lang.String str69 = server0.toString();
    java.lang.String str70 = server0.toString();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)(-1));
    boolean b76 = server0.removeBan(iP75);
    tp2.Server server77 = new tp2.Server();
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b83 = server77.connect(iP82);
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b89 = server77.addBan(iP88);
    boolean b90 = server0.connect(iP88);
    server0.update();
    boolean b92 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str69.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str70.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test029"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)(-1), (java.lang.Integer)1);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test030"); }


    tp2.Server server0 = new tp2.Server();
    tp2.Server server1 = new tp2.Server();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b7 = server1.connect(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b13 = server1.addBan(iP12);
    boolean b14 = server0.removeException(iP12);
    server0.update();
    boolean b16 = server0.repOK();
    java.lang.String str17 = server0.toString();
    java.lang.Integer i21 = null;
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)1, (java.lang.Integer)10, i21);
    boolean b23 = server0.addException(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=1465597327958, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=1465597327958, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test031"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addException(iP13);
    boolean b16 = server0.repOK();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b23 = server17.connect(iP22);
    server17.update();
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    boolean b32 = server17.addBan(iP30);
    server17.update();
    server17.update();
    tp2.Server server35 = new tp2.Server();
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server36.connect(iP41);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b48 = server36.addBan(iP47);
    boolean b49 = server35.removeException(iP47);
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    tp2.ITime iTime57 = null;
    server50.setTime(iTime57);
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server50.removeException(iP63);
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b70 = server50.removeException(iP69);
    boolean b71 = server35.addException(iP69);
    boolean b72 = server17.removeBan(iP69);
    boolean b73 = server17.repOK();
    boolean b74 = server17.repOK();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)(-1));
    boolean b80 = server17.addException(iP79);
    boolean b81 = server0.removeBan(iP79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test032"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    java.lang.String str8 = server0.toString();
    java.lang.String str9 = server0.toString();
    java.lang.String str10 = server0.toString();
    boolean b11 = server0.repOK();
    java.lang.String str12 = server0.toString();
    boolean b13 = server0.repOK();
    server0.update();
    java.lang.String str15 = server0.toString();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)(-1));
    boolean b21 = server0.connect(iP20);
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    java.lang.String str29 = server22.toString();
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b36 = server30.connect(iP35);
    boolean b37 = server22.addException(iP35);
    tp2.IP iP38 = null;
    boolean b39 = server22.removeBan(iP38);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b45 = server22.removeBan(iP44);
    tp2.Server server46 = new tp2.Server();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b52 = server46.connect(iP51);
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b58 = server46.addBan(iP57);
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b64 = server46.removeException(iP63);
    tp2.Server server65 = new tp2.Server();
    server65.update();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    boolean b72 = server65.removeException(iP71);
    boolean b73 = server46.addBan(iP71);
    boolean b74 = server22.addBan(iP71);
    boolean b75 = server0.connect(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465597327992, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465597327992, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465597327992, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465597327992, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465597327992, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465597327992, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=1465597327992, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=1465597327992, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=1465597327994, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=1465597327994, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str29.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test033"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addException(iP21);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    server25.update();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    boolean b40 = server25.addBan(iP38);
    server25.update();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    server42.update();
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    server50.update();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server58.connect(iP63);
    boolean b65 = server50.addBan(iP63);
    boolean b66 = server42.addBan(iP63);
    boolean b67 = server25.connect(iP63);
    boolean b68 = server0.removeBan(iP63);
    java.lang.String str69 = server0.toString();
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)100);
    boolean b75 = server0.addException(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str69.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test034"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addException(iP21);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    server25.update();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    boolean b40 = server25.addBan(iP38);
    server25.update();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    server42.update();
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    server50.update();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server58.connect(iP63);
    boolean b65 = server50.addBan(iP63);
    boolean b66 = server42.addBan(iP63);
    boolean b67 = server25.connect(iP63);
    boolean b68 = server0.removeBan(iP63);
    tp2.ITime iTime69 = null;
    server0.setTime(iTime69);
    tp2.StubTime stubTime71 = new tp2.StubTime();
    server0.setTime((tp2.ITime)stubTime71);
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)(-1));
    boolean b78 = server0.removeException(iP77);
    boolean b79 = server0.repOK();
    java.lang.String str80 = server0.toString();
    tp2.IP iP85 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b86 = server0.connect(iP85);
    java.lang.String str87 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str80.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str87 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str87.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test035"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    boolean b13 = server0.repOK();
    server0.update();
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    java.lang.String str22 = server15.toString();
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b29 = server23.connect(iP28);
    server23.update();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    boolean b38 = server23.addBan(iP36);
    boolean b39 = server15.addException(iP36);
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b46 = server40.connect(iP45);
    server40.update();
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b54 = server48.connect(iP53);
    boolean b55 = server40.addBan(iP53);
    server40.update();
    tp2.Server server57 = new tp2.Server();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b63 = server57.connect(iP62);
    server57.update();
    tp2.Server server65 = new tp2.Server();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b71 = server65.connect(iP70);
    server65.update();
    tp2.Server server73 = new tp2.Server();
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b79 = server73.connect(iP78);
    boolean b80 = server65.addBan(iP78);
    boolean b81 = server57.addBan(iP78);
    boolean b82 = server40.connect(iP78);
    boolean b83 = server15.removeBan(iP78);
    tp2.ITime iTime84 = null;
    server15.setTime(iTime84);
    tp2.StubTime stubTime86 = new tp2.StubTime();
    server15.setTime((tp2.ITime)stubTime86);
    long long88 = stubTime86.getCurrentTime();
    long long89 = stubTime86.getCurrentTime();
    long long90 = stubTime86.getCurrentTime();
    long long91 = stubTime86.getCurrentTime();
    long long92 = stubTime86.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime86);
    long long94 = stubTime86.getCurrentTime();
    long long95 = stubTime86.getCurrentTime();
    long long96 = stubTime86.getCurrentTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str22.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long88 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long89 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long90 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long91 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long92 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long94 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long95 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long96 == 200000L);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test036"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addBan(iP13);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    server16.update();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b29 = server16.addBan(iP28);
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b36 = server30.connect(iP35);
    java.lang.String str37 = server30.toString();
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b44 = server38.connect(iP43);
    boolean b45 = server30.addException(iP43);
    tp2.Server server46 = new tp2.Server();
    tp2.Server server47 = new tp2.Server();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b53 = server47.connect(iP52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b59 = server47.addBan(iP58);
    boolean b60 = server46.removeException(iP58);
    boolean b61 = server30.addException(iP58);
    boolean b62 = server16.addBan(iP58);
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b68 = server16.connect(iP67);
    java.lang.Integer i71 = null;
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)100, i71, (java.lang.Integer)10);
    boolean b74 = server16.addException(iP73);
    boolean b75 = server0.removeException(iP73);
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)(-1));
    boolean b81 = server0.addException(iP80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str37.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test037"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.Server server2 = new tp2.Server();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b8 = server2.connect(iP7);
    java.lang.String str9 = server2.toString();
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b16 = server10.connect(iP15);
    boolean b17 = server2.addException(iP15);
    tp2.Server server18 = new tp2.Server();
    tp2.Server server19 = new tp2.Server();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b25 = server19.connect(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b31 = server19.addBan(iP30);
    boolean b32 = server18.removeException(iP30);
    boolean b33 = server2.addException(iP30);
    boolean b34 = server0.connect(iP30);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)(-1));
    boolean b40 = server0.connect(iP39);
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)0);
    boolean b46 = server0.addBan(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test038"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b13 = server7.connect(iP12);
    server7.update();
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    boolean b22 = server7.addBan(iP20);
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b29 = server23.connect(iP28);
    server23.update();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b36 = server23.addBan(iP35);
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b43 = server37.connect(iP42);
    java.lang.String str44 = server37.toString();
    tp2.Server server45 = new tp2.Server();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b51 = server45.connect(iP50);
    boolean b52 = server37.addException(iP50);
    tp2.Server server53 = new tp2.Server();
    tp2.Server server54 = new tp2.Server();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b60 = server54.connect(iP59);
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b66 = server54.addBan(iP65);
    boolean b67 = server53.removeException(iP65);
    boolean b68 = server37.addException(iP65);
    boolean b69 = server23.addBan(iP65);
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b75 = server23.connect(iP74);
    boolean b76 = server7.connect(iP74);
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)100);
    boolean b82 = server7.connect(iP81);
    boolean b83 = server0.connect(iP81);
    boolean b84 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str44.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test039"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)1, (java.lang.Integer)1, (java.lang.Integer)100);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test040"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server0.removeException(iP13);
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b20 = server0.removeException(iP19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    boolean b26 = server0.connect(iP25);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)1);
    boolean b32 = server0.removeBan(iP31);
    java.lang.String str33 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str33.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test041"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    boolean b8 = server0.repOK();
    server0.update();
    server0.update();
    server0.update();
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b18 = server12.connect(iP17);
    tp2.Server server19 = new tp2.Server();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b25 = server19.connect(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b31 = server19.addBan(iP30);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b37 = server19.removeException(iP36);
    boolean b38 = server12.addException(iP36);
    boolean b39 = server12.repOK();
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b46 = server40.connect(iP45);
    java.lang.String str47 = server40.toString();
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b54 = server48.connect(iP53);
    server48.update();
    tp2.Server server56 = new tp2.Server();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b62 = server56.connect(iP61);
    boolean b63 = server48.addBan(iP61);
    boolean b64 = server40.addException(iP61);
    tp2.StubTime stubTime65 = new tp2.StubTime();
    server40.setTime((tp2.ITime)stubTime65);
    server12.setTime((tp2.ITime)stubTime65);
    server0.setTime((tp2.ITime)stubTime65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str47.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test042"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addException(iP13);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    server16.update();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b29 = server16.addBan(iP28);
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b36 = server30.connect(iP35);
    java.lang.String str37 = server30.toString();
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b44 = server38.connect(iP43);
    boolean b45 = server30.addException(iP43);
    tp2.Server server46 = new tp2.Server();
    tp2.Server server47 = new tp2.Server();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b53 = server47.connect(iP52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b59 = server47.addBan(iP58);
    boolean b60 = server46.removeException(iP58);
    boolean b61 = server30.addException(iP58);
    boolean b62 = server16.addBan(iP58);
    tp2.StubTime stubTime63 = new tp2.StubTime();
    server16.setTime((tp2.ITime)stubTime63);
    long long65 = stubTime63.getCurrentTime();
    long long66 = stubTime63.getCurrentTime();
    long long67 = stubTime63.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime63);
    boolean b69 = server0.repOK();
    tp2.StubTime stubTime70 = new tp2.StubTime();
    server0.setTime((tp2.ITime)stubTime70);
    long long72 = stubTime70.getCurrentTime();
    long long73 = stubTime70.getCurrentTime();
    long long74 = stubTime70.getCurrentTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str37.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long65 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long66 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long67 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long72 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long73 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long74 == 200000L);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test043"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addException(iP21);
    boolean b25 = server0.repOK();
    tp2.IP iP26 = null;
    boolean b27 = server0.addBan(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b34 = server28.connect(iP33);
    java.lang.String str35 = server28.toString();
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server36.connect(iP41);
    server36.update();
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b50 = server44.connect(iP49);
    boolean b51 = server36.addBan(iP49);
    boolean b52 = server28.addException(iP49);
    boolean b53 = server0.addException(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str35.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test044"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addBan(iP13);
    server0.update();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b23 = server17.connect(iP22);
    server17.update();
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    server25.update();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    boolean b40 = server25.addBan(iP38);
    boolean b41 = server17.addBan(iP38);
    boolean b42 = server0.connect(iP38);
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b49 = server43.connect(iP48);
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b55 = server43.addBan(iP54);
    boolean b56 = server43.repOK();
    tp2.Server server57 = new tp2.Server();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b63 = server57.connect(iP62);
    server57.update();
    tp2.Server server65 = new tp2.Server();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b71 = server65.connect(iP70);
    server65.update();
    tp2.Server server73 = new tp2.Server();
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b79 = server73.connect(iP78);
    boolean b80 = server65.addBan(iP78);
    boolean b81 = server57.addBan(iP78);
    boolean b82 = server43.addException(iP78);
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)1);
    boolean b88 = server43.addBan(iP87);
    boolean b89 = server0.addException(iP87);
    boolean b90 = server0.repOK();
    java.lang.String str91 = server0.toString();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str91 + "' != '" + "Server [lastUpdate=1465597328288, exceptions=([10.10.100.1]), bans={[IPBan [ip=100.0.10.1, expires=1465597388288]]}]"+ "'", str91.equals("Server [lastUpdate=1465597328288, exceptions=([10.10.100.1]), bans={[IPBan [ip=100.0.10.1, expires=1465597388288]]}]"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test045"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addException(iP13);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    server16.update();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b29 = server16.addBan(iP28);
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b36 = server30.connect(iP35);
    java.lang.String str37 = server30.toString();
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b44 = server38.connect(iP43);
    boolean b45 = server30.addException(iP43);
    tp2.Server server46 = new tp2.Server();
    tp2.Server server47 = new tp2.Server();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b53 = server47.connect(iP52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b59 = server47.addBan(iP58);
    boolean b60 = server46.removeException(iP58);
    boolean b61 = server30.addException(iP58);
    boolean b62 = server16.addBan(iP58);
    tp2.StubTime stubTime63 = new tp2.StubTime();
    server16.setTime((tp2.ITime)stubTime63);
    long long65 = stubTime63.getCurrentTime();
    long long66 = stubTime63.getCurrentTime();
    long long67 = stubTime63.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime63);
    boolean b69 = server0.repOK();
    java.lang.String str70 = server0.toString();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1, (java.lang.Integer)0);
    boolean b76 = server0.removeException(iP75);
    boolean b77 = server0.repOK();
    boolean b78 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str37.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long65 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long66 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long67 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str70.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test046"); }


    tp2.Server server0 = new tp2.Server();
    tp2.Server server1 = new tp2.Server();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b7 = server1.connect(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b13 = server1.addBan(iP12);
    boolean b14 = server0.removeException(iP12);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    tp2.ITime iTime22 = null;
    server15.setTime(iTime22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b29 = server15.removeException(iP28);
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b36 = server30.connect(iP35);
    server30.update();
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b44 = server38.connect(iP43);
    server38.update();
    tp2.Server server46 = new tp2.Server();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b52 = server46.connect(iP51);
    boolean b53 = server38.addBan(iP51);
    boolean b54 = server30.addBan(iP51);
    boolean b55 = server15.connect(iP51);
    tp2.Server server56 = new tp2.Server();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b62 = server56.connect(iP61);
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b68 = server56.addBan(iP67);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b74 = server56.removeException(iP73);
    boolean b75 = server15.connect(iP73);
    boolean b76 = server0.removeBan(iP73);
    java.lang.String str77 = server0.toString();
    server0.update();
    boolean b79 = server0.repOK();
    java.lang.String str80 = server0.toString();
    boolean b81 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str77.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "Server [lastUpdate=1465597328355, exceptions=(), bans={}]"+ "'", str80.equals("Server [lastUpdate=1465597328355, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test047"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server0.removeException(iP13);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    server15.update();
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b29 = server23.connect(iP28);
    boolean b30 = server15.addBan(iP28);
    boolean b31 = server0.addException(iP28);
    java.lang.String str32 = server0.toString();
    java.lang.String str33 = server0.toString();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)100);
    boolean b39 = server0.connect(iP38);
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b46 = server40.connect(iP45);
    server40.update();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b53 = server40.addBan(iP52);
    java.lang.String str54 = server40.toString();
    tp2.Server server55 = new tp2.Server();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b61 = server55.connect(iP60);
    server55.update();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b68 = server55.addBan(iP67);
    boolean b69 = server40.removeBan(iP67);
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)(-1));
    boolean b75 = server40.connect(iP74);
    boolean b76 = server0.connect(iP74);
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str32.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str33.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "Server [lastUpdate=1465597328384, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597388384]]}]"+ "'", str54.equals("Server [lastUpdate=1465597328384, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597388384]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test048"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)1);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test049"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addException(iP13);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    server16.update();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b29 = server16.addBan(iP28);
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b36 = server30.connect(iP35);
    java.lang.String str37 = server30.toString();
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b44 = server38.connect(iP43);
    boolean b45 = server30.addException(iP43);
    tp2.Server server46 = new tp2.Server();
    tp2.Server server47 = new tp2.Server();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b53 = server47.connect(iP52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b59 = server47.addBan(iP58);
    boolean b60 = server46.removeException(iP58);
    boolean b61 = server30.addException(iP58);
    boolean b62 = server16.addBan(iP58);
    tp2.StubTime stubTime63 = new tp2.StubTime();
    server16.setTime((tp2.ITime)stubTime63);
    long long65 = stubTime63.getCurrentTime();
    long long66 = stubTime63.getCurrentTime();
    long long67 = stubTime63.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime63);
    server0.update();
    boolean b70 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str37.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long65 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long66 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long67 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test050"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b12 = server0.connect(iP11);
    boolean b13 = server0.repOK();
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    server14.update();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b27 = server14.addBan(iP26);
    boolean b28 = server14.repOK();
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b35 = server29.connect(iP34);
    server29.update();
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b43 = server37.connect(iP42);
    boolean b44 = server29.addBan(iP42);
    server29.update();
    tp2.Server server46 = new tp2.Server();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b52 = server46.connect(iP51);
    server46.update();
    tp2.Server server54 = new tp2.Server();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b60 = server54.connect(iP59);
    server54.update();
    tp2.Server server62 = new tp2.Server();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b68 = server62.connect(iP67);
    boolean b69 = server54.addBan(iP67);
    boolean b70 = server46.addBan(iP67);
    boolean b71 = server29.connect(iP67);
    tp2.IP iP72 = null;
    boolean b73 = server29.removeException(iP72);
    java.lang.String str74 = server29.toString();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)10, (java.lang.Integer)(-1));
    boolean b80 = server29.addBan(iP79);
    boolean b81 = server14.removeException(iP79);
    boolean b82 = server0.connect(iP79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "Server [lastUpdate=1465597328414, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597388414]]}]"+ "'", str74.equals("Server [lastUpdate=1465597328414, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597388414]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test051"); }


    java.lang.Integer i1 = null;
    tp2.IP iP4 = new tp2.IP((java.lang.Integer)0, i1, (java.lang.Integer)0, (java.lang.Integer)10);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test052"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addBan(iP13);
    server0.update();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b23 = server17.connect(iP22);
    server17.update();
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    server25.update();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    boolean b40 = server25.addBan(iP38);
    boolean b41 = server17.addBan(iP38);
    boolean b42 = server0.connect(iP38);
    server0.update();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test053"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addBan(iP13);
    server0.update();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b23 = server17.connect(iP22);
    server17.update();
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    server25.update();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    boolean b40 = server25.addBan(iP38);
    boolean b41 = server17.addBan(iP38);
    boolean b42 = server0.connect(iP38);
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b49 = server43.connect(iP48);
    boolean b50 = server0.addBan(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test054"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    java.lang.String str8 = server0.toString();
    java.lang.String str9 = server0.toString();
    java.lang.String str10 = server0.toString();
    boolean b11 = server0.repOK();
    java.lang.String str12 = server0.toString();
    boolean b13 = server0.repOK();
    server0.update();
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b34 = server22.addBan(iP33);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b40 = server22.removeException(iP39);
    boolean b41 = server15.addException(iP39);
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    server42.update();
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    server50.update();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server58.connect(iP63);
    boolean b65 = server50.addBan(iP63);
    boolean b66 = server42.addBan(iP63);
    boolean b67 = server15.addException(iP63);
    boolean b68 = server0.addBan(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465597328473, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465597328473, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465597328473, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465597328473, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465597328473, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465597328473, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=1465597328473, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=1465597328473, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test055"); }


    java.lang.Integer i1 = null;
    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1, i1, (java.lang.Integer)100, (java.lang.Integer)(-1));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test056"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    boolean b14 = server0.repOK();
    java.lang.String str15 = server0.toString();
    server0.update();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=1465597328494, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597388494]]}]"+ "'", str15.equals("Server [lastUpdate=1465597328494, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597388494]]}]"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test057"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addBan(iP21);
    server0.update();
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b32 = server26.connect(iP31);
    server26.update();
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b40 = server34.connect(iP39);
    server34.update();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    boolean b49 = server34.addBan(iP47);
    boolean b50 = server26.addBan(iP47);
    boolean b51 = server0.addBan(iP47);
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b58 = server52.connect(iP57);
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b64 = server52.addBan(iP63);
    tp2.Server server65 = new tp2.Server();
    server65.update();
    tp2.Server server67 = new tp2.Server();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b73 = server67.connect(iP72);
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b79 = server67.addBan(iP78);
    boolean b80 = server65.addBan(iP78);
    boolean b81 = server52.removeException(iP78);
    boolean b82 = server0.connect(iP78);
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1));
    boolean b88 = server0.addBan(iP87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test058"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server0.removeException(iP13);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    server15.update();
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b29 = server23.connect(iP28);
    boolean b30 = server15.addBan(iP28);
    boolean b31 = server0.addException(iP28);
    java.lang.String str32 = server0.toString();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b45 = server33.addBan(iP44);
    boolean b46 = server33.repOK();
    tp2.Server server47 = new tp2.Server();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b53 = server47.connect(iP52);
    server47.update();
    tp2.Server server55 = new tp2.Server();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b61 = server55.connect(iP60);
    server55.update();
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b69 = server63.connect(iP68);
    boolean b70 = server55.addBan(iP68);
    boolean b71 = server47.addBan(iP68);
    boolean b72 = server33.addException(iP68);
    boolean b73 = server0.removeBan(iP68);
    java.lang.Integer i75 = null;
    java.lang.Integer i77 = null;
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)(-1), i75, (java.lang.Integer)100, i77);
    boolean b79 = server0.removeBan(iP78);
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str32.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test059"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b19 = server13.connect(iP18);
    tp2.ITime iTime20 = null;
    server13.setTime(iTime20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b27 = server13.removeException(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b34 = server28.connect(iP33);
    server28.update();
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server36.connect(iP41);
    server36.update();
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b50 = server44.connect(iP49);
    boolean b51 = server36.addBan(iP49);
    boolean b52 = server28.addBan(iP49);
    boolean b53 = server13.connect(iP49);
    boolean b54 = server0.removeBan(iP49);
    server0.update();
    tp2.Server server56 = new tp2.Server();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b62 = server56.connect(iP61);
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b68 = server56.addBan(iP67);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b74 = server56.removeException(iP73);
    boolean b75 = server0.removeException(iP73);
    server0.update();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test060"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b13 = server7.connect(iP12);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b19 = server7.addBan(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b25 = server7.removeException(iP24);
    java.lang.Integer i28 = null;
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)100, i28, (java.lang.Integer)10);
    boolean b31 = server7.removeException(iP30);
    boolean b32 = server0.removeException(iP30);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)100);
    boolean b38 = server0.connect(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test061"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    boolean b13 = server0.repOK();
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    server14.update();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    server22.update();
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b36 = server30.connect(iP35);
    boolean b37 = server22.addBan(iP35);
    boolean b38 = server14.addBan(iP35);
    boolean b39 = server0.addException(iP35);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)1);
    boolean b45 = server0.addBan(iP44);
    tp2.Server server46 = new tp2.Server();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b52 = server46.connect(iP51);
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b58 = server46.addBan(iP57);
    boolean b59 = server46.repOK();
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b66 = server60.connect(iP65);
    server60.update();
    tp2.Server server68 = new tp2.Server();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b74 = server68.connect(iP73);
    server68.update();
    tp2.Server server76 = new tp2.Server();
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b82 = server76.connect(iP81);
    boolean b83 = server68.addBan(iP81);
    boolean b84 = server60.addBan(iP81);
    boolean b85 = server46.addException(iP81);
    tp2.IP iP90 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)1);
    boolean b91 = server46.addBan(iP90);
    boolean b92 = server0.removeException(iP90);
    java.lang.String str93 = server0.toString();
    tp2.IP iP94 = null;
    boolean b95 = server0.connect(iP94);
    java.lang.String str96 = server0.toString();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str93 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={[IPBan [ip=-1.10.1.1, expires=1465597388620]][IPBan [ip=10.10.100.1, expires=1465597388623]]}]"+ "'", str93.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={[IPBan [ip=-1.10.1.1, expires=1465597388620]][IPBan [ip=10.10.100.1, expires=1465597388623]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str96 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={[IPBan [ip=-1.10.1.1, expires=1465597388620]][IPBan [ip=10.10.100.1, expires=1465597388623]]}]"+ "'", str96.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={[IPBan [ip=-1.10.1.1, expires=1465597388620]][IPBan [ip=10.10.100.1, expires=1465597388623]]}]"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test062"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    boolean b8 = server0.repOK();
    server0.update();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    boolean b15 = server0.addBan(iP14);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)1);
    boolean b21 = server0.addException(iP20);
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    server22.update();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b35 = server22.addBan(iP34);
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server36.connect(iP41);
    java.lang.String str43 = server36.toString();
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b50 = server44.connect(iP49);
    boolean b51 = server36.addException(iP49);
    tp2.Server server52 = new tp2.Server();
    tp2.Server server53 = new tp2.Server();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b59 = server53.connect(iP58);
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b65 = server53.addBan(iP64);
    boolean b66 = server52.removeException(iP64);
    boolean b67 = server36.addException(iP64);
    boolean b68 = server22.addBan(iP64);
    tp2.StubTime stubTime69 = new tp2.StubTime();
    server22.setTime((tp2.ITime)stubTime69);
    long long71 = stubTime69.getCurrentTime();
    long long72 = stubTime69.getCurrentTime();
    long long73 = stubTime69.getCurrentTime();
    long long74 = stubTime69.getCurrentTime();
    long long75 = stubTime69.getCurrentTime();
    long long76 = stubTime69.getCurrentTime();
    long long77 = stubTime69.getCurrentTime();
    long long78 = stubTime69.getCurrentTime();
    long long79 = stubTime69.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime69);
    long long81 = stubTime69.getCurrentTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str43.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long71 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long72 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long73 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long74 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long75 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long76 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long77 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long78 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long79 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long81 == 200000L);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test063"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.Server server2 = new tp2.Server();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b8 = server2.connect(iP7);
    server2.update();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b15 = server2.addBan(iP14);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    java.lang.String str23 = server16.toString();
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b30 = server24.connect(iP29);
    boolean b31 = server16.addException(iP29);
    tp2.Server server32 = new tp2.Server();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b45 = server33.addBan(iP44);
    boolean b46 = server32.removeException(iP44);
    boolean b47 = server16.addException(iP44);
    boolean b48 = server2.addBan(iP44);
    boolean b49 = server0.removeException(iP44);
    java.lang.String str50 = server0.toString();
    java.lang.String str51 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Server [lastUpdate=1465597328685, exceptions=(), bans={}]"+ "'", str50.equals("Server [lastUpdate=1465597328685, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Server [lastUpdate=1465597328685, exceptions=(), bans={}]"+ "'", str51.equals("Server [lastUpdate=1465597328685, exceptions=(), bans={}]"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test064"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addException(iP21);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    server25.update();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    boolean b40 = server25.addBan(iP38);
    server25.update();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    server42.update();
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    server50.update();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server58.connect(iP63);
    boolean b65 = server50.addBan(iP63);
    boolean b66 = server42.addBan(iP63);
    boolean b67 = server25.connect(iP63);
    boolean b68 = server0.removeBan(iP63);
    tp2.ITime iTime69 = null;
    server0.setTime(iTime69);
    tp2.StubTime stubTime71 = new tp2.StubTime();
    server0.setTime((tp2.ITime)stubTime71);
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)(-1));
    boolean b78 = server0.removeException(iP77);
    boolean b79 = server0.repOK();
    tp2.IP iP84 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b85 = server0.addException(iP84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test065"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    java.lang.String str8 = server0.toString();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)1);
    boolean b14 = server0.connect(iP13);
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1));
    boolean b20 = server0.removeException(iP19);
    tp2.Server server21 = new tp2.Server();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b27 = server21.connect(iP26);
    server21.update();
    boolean b29 = server21.repOK();
    server21.update();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    boolean b36 = server21.addBan(iP35);
    boolean b37 = server0.addException(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465597328755, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465597328755, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test066"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.Server server2 = new tp2.Server();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b8 = server2.connect(iP7);
    java.lang.String str9 = server2.toString();
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b16 = server10.connect(iP15);
    server10.update();
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b24 = server18.connect(iP23);
    boolean b25 = server10.addBan(iP23);
    boolean b26 = server2.addException(iP23);
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b33 = server27.connect(iP32);
    server27.update();
    tp2.Server server35 = new tp2.Server();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b41 = server35.connect(iP40);
    boolean b42 = server27.addBan(iP40);
    server27.update();
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b50 = server44.connect(iP49);
    server44.update();
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b58 = server52.connect(iP57);
    server52.update();
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b66 = server60.connect(iP65);
    boolean b67 = server52.addBan(iP65);
    boolean b68 = server44.addBan(iP65);
    boolean b69 = server27.connect(iP65);
    boolean b70 = server2.removeBan(iP65);
    tp2.ITime iTime71 = null;
    server2.setTime(iTime71);
    tp2.StubTime stubTime73 = new tp2.StubTime();
    server2.setTime((tp2.ITime)stubTime73);
    long long75 = stubTime73.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime73);
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)1);
    boolean b82 = server0.addException(iP81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long75 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test067"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10, (java.lang.Integer)0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test068"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)(-1));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test069"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addException(iP13);
    tp2.IP iP16 = null;
    boolean b17 = server0.removeBan(iP16);
    java.lang.String str18 = server0.toString();
    tp2.Server server19 = new tp2.Server();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b25 = server19.connect(iP24);
    server19.update();
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b33 = server27.connect(iP32);
    server27.update();
    tp2.Server server35 = new tp2.Server();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b41 = server35.connect(iP40);
    boolean b42 = server27.addBan(iP40);
    boolean b43 = server19.addBan(iP40);
    server19.update();
    tp2.Server server45 = new tp2.Server();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b51 = server45.connect(iP50);
    server45.update();
    tp2.Server server53 = new tp2.Server();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b59 = server53.connect(iP58);
    server53.update();
    tp2.Server server61 = new tp2.Server();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b67 = server61.connect(iP66);
    boolean b68 = server53.addBan(iP66);
    boolean b69 = server45.addBan(iP66);
    boolean b70 = server19.addBan(iP66);
    server19.update();
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)1);
    boolean b77 = server19.connect(iP76);
    java.lang.String str78 = server19.toString();
    java.lang.Integer i81 = null;
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)100, i81, (java.lang.Integer)(-1));
    boolean b84 = server19.connect(iP83);
    boolean b85 = server0.removeBan(iP83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str18.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + "Server [lastUpdate=1465597328800, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597388798]]}]"+ "'", str78.equals("Server [lastUpdate=1465597328800, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597388798]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test070"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    java.lang.String str21 = server14.toString();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    boolean b29 = server14.addException(iP27);
    tp2.Server server30 = new tp2.Server();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b43 = server31.addBan(iP42);
    boolean b44 = server30.removeException(iP42);
    boolean b45 = server14.addException(iP42);
    boolean b46 = server0.addBan(iP42);
    boolean b47 = server0.repOK();
    java.lang.String str48 = server0.toString();
    server0.update();
    server0.update();
    boolean b51 = server0.repOK();
    boolean b52 = server0.repOK();
    tp2.Server server53 = new tp2.Server();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b59 = server53.connect(iP58);
    server53.update();
    java.lang.String str61 = server53.toString();
    java.lang.String str62 = server53.toString();
    java.lang.String str63 = server53.toString();
    boolean b64 = server53.repOK();
    java.lang.String str65 = server53.toString();
    server53.update();
    java.lang.Integer i70 = null;
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10, i70);
    boolean b72 = server53.removeBan(iP71);
    boolean b73 = server0.addBan(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Server [lastUpdate=1465597328830, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597388830]][IPBan [ip=-1.10.1.1, expires=1465597388832]]}]"+ "'", str48.equals("Server [lastUpdate=1465597328830, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597388830]][IPBan [ip=-1.10.1.1, expires=1465597388832]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "Server [lastUpdate=1465597328833, exceptions=(), bans={}]"+ "'", str61.equals("Server [lastUpdate=1465597328833, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "Server [lastUpdate=1465597328833, exceptions=(), bans={}]"+ "'", str62.equals("Server [lastUpdate=1465597328833, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "Server [lastUpdate=1465597328833, exceptions=(), bans={}]"+ "'", str63.equals("Server [lastUpdate=1465597328833, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "Server [lastUpdate=1465597328833, exceptions=(), bans={}]"+ "'", str65.equals("Server [lastUpdate=1465597328833, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test071"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    java.lang.Integer i3 = null;
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)0, i3, (java.lang.Integer)10, (java.lang.Integer)0);
    boolean b7 = server0.removeException(iP6);
    java.lang.Integer i8 = null;
    java.lang.Integer i11 = null;
    tp2.IP iP12 = new tp2.IP(i8, (java.lang.Integer)10, (java.lang.Integer)0, i11);
    boolean b13 = server0.addBan(iP12);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)10);
    boolean b19 = server0.removeException(iP18);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test072"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)(-1));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test073"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)1);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test074"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test075"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    java.lang.String str21 = server14.toString();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    boolean b29 = server14.addException(iP27);
    tp2.Server server30 = new tp2.Server();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b43 = server31.addBan(iP42);
    boolean b44 = server30.removeException(iP42);
    boolean b45 = server14.addException(iP42);
    boolean b46 = server0.addBan(iP42);
    boolean b47 = server0.repOK();
    java.lang.String str48 = server0.toString();
    boolean b49 = server0.repOK();
    tp2.IP iP50 = null;
    boolean b51 = server0.removeBan(iP50);
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)0);
    boolean b57 = server0.removeBan(iP56);
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)0);
    boolean b64 = server58.removeException(iP63);
    boolean b65 = server0.addBan(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Server [lastUpdate=1465597328857, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597388857]][IPBan [ip=-1.10.1.1, expires=1465597388860]]}]"+ "'", str48.equals("Server [lastUpdate=1465597328857, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597388857]][IPBan [ip=-1.10.1.1, expires=1465597388860]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test076"); }


    tp2.Server server0 = new tp2.Server();
    tp2.Server server1 = new tp2.Server();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b7 = server1.connect(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b13 = server1.addBan(iP12);
    boolean b14 = server0.removeException(iP12);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b27 = server15.addBan(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b34 = server28.connect(iP33);
    tp2.ITime iTime35 = null;
    server28.setTime(iTime35);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server28.removeException(iP41);
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b49 = server43.connect(iP48);
    server43.update();
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b57 = server51.connect(iP56);
    server51.update();
    tp2.Server server59 = new tp2.Server();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b65 = server59.connect(iP64);
    boolean b66 = server51.addBan(iP64);
    boolean b67 = server43.addBan(iP64);
    boolean b68 = server28.connect(iP64);
    boolean b69 = server15.removeBan(iP64);
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b75 = server15.removeBan(iP74);
    boolean b76 = server0.addException(iP74);
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b82 = server0.addException(iP81);
    boolean b83 = server0.repOK();
    java.lang.Integer i87 = null;
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)100, (java.lang.Integer)0, i87);
    boolean b89 = server0.addException(iP88);
    java.lang.Integer i90 = null;
    java.lang.Integer i93 = null;
    tp2.IP iP94 = new tp2.IP(i90, (java.lang.Integer)10, (java.lang.Integer)0, i93);
    boolean b95 = server0.connect(iP94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test077"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    java.lang.String str21 = server14.toString();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    boolean b29 = server14.addException(iP27);
    tp2.Server server30 = new tp2.Server();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b43 = server31.addBan(iP42);
    boolean b44 = server30.removeException(iP42);
    boolean b45 = server14.addException(iP42);
    boolean b46 = server0.addBan(iP42);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)0);
    boolean b52 = server0.removeException(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test078"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)(-1));
    boolean b7 = server0.addException(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test079"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addBan(iP21);
    server0.update();
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b32 = server26.connect(iP31);
    server26.update();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b39 = server26.addBan(iP38);
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b46 = server40.connect(iP45);
    java.lang.String str47 = server40.toString();
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b54 = server48.connect(iP53);
    boolean b55 = server40.addException(iP53);
    tp2.Server server56 = new tp2.Server();
    tp2.Server server57 = new tp2.Server();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b63 = server57.connect(iP62);
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b69 = server57.addBan(iP68);
    boolean b70 = server56.removeException(iP68);
    boolean b71 = server40.addException(iP68);
    boolean b72 = server26.addBan(iP68);
    tp2.StubTime stubTime73 = new tp2.StubTime();
    server26.setTime((tp2.ITime)stubTime73);
    long long75 = stubTime73.getCurrentTime();
    long long76 = stubTime73.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime73);
    boolean b78 = server0.repOK();
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b84 = server0.addException(iP83);
    server0.update();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str47.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long75 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long76 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test080"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)1, (java.lang.Integer)10);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test081"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    boolean b7 = server0.repOK();
    server0.update();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test082"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addBan(iP21);
    server0.update();
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b32 = server26.connect(iP31);
    server26.update();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b39 = server26.addBan(iP38);
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b46 = server40.connect(iP45);
    java.lang.String str47 = server40.toString();
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b54 = server48.connect(iP53);
    boolean b55 = server40.addException(iP53);
    tp2.Server server56 = new tp2.Server();
    tp2.Server server57 = new tp2.Server();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b63 = server57.connect(iP62);
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b69 = server57.addBan(iP68);
    boolean b70 = server56.removeException(iP68);
    boolean b71 = server40.addException(iP68);
    boolean b72 = server26.addBan(iP68);
    tp2.StubTime stubTime73 = new tp2.StubTime();
    server26.setTime((tp2.ITime)stubTime73);
    long long75 = stubTime73.getCurrentTime();
    long long76 = stubTime73.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime73);
    boolean b78 = server0.repOK();
    java.lang.String str79 = server0.toString();
    boolean b80 = server0.repOK();
    tp2.IP iP85 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b86 = server0.addBan(iP85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str47.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long75 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long76 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "Server [lastUpdate=1465597328980, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597388980]]}]"+ "'", str79.equals("Server [lastUpdate=1465597328980, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597388980]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test083"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addException(iP13);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    server16.update();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b29 = server16.addBan(iP28);
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b36 = server30.connect(iP35);
    java.lang.String str37 = server30.toString();
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b44 = server38.connect(iP43);
    boolean b45 = server30.addException(iP43);
    tp2.Server server46 = new tp2.Server();
    tp2.Server server47 = new tp2.Server();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b53 = server47.connect(iP52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b59 = server47.addBan(iP58);
    boolean b60 = server46.removeException(iP58);
    boolean b61 = server30.addException(iP58);
    boolean b62 = server16.addBan(iP58);
    tp2.StubTime stubTime63 = new tp2.StubTime();
    server16.setTime((tp2.ITime)stubTime63);
    long long65 = stubTime63.getCurrentTime();
    long long66 = stubTime63.getCurrentTime();
    long long67 = stubTime63.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime63);
    boolean b69 = server0.repOK();
    java.lang.String str70 = server0.toString();
    server0.update();
    tp2.Server server72 = new tp2.Server();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b78 = server72.connect(iP77);
    server72.update();
    tp2.IP iP84 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b85 = server72.addBan(iP84);
    boolean b86 = server0.connect(iP84);
    java.lang.Integer i87 = null;
    tp2.IP iP91 = new tp2.IP(i87, (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)0);
    boolean b92 = server0.connect(iP91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str37.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long65 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long66 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long67 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str70.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test084"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addException(iP21);
    boolean b25 = server0.repOK();
    tp2.Server server26 = new tp2.Server();
    server26.update();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    boolean b33 = server26.removeException(iP32);
    boolean b34 = server0.addBan(iP32);
    java.lang.Integer i37 = null;
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)(-1), i37, (java.lang.Integer)1);
    boolean b40 = server0.addBan(iP39);
    boolean b41 = server0.repOK();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    tp2.Server server49 = new tp2.Server();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b55 = server49.connect(iP54);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b61 = server49.addBan(iP60);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b67 = server49.removeException(iP66);
    boolean b68 = server42.addException(iP66);
    tp2.Server server69 = new tp2.Server();
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b75 = server69.connect(iP74);
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b81 = server69.addBan(iP80);
    tp2.IP iP86 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b87 = server69.removeException(iP86);
    boolean b88 = server42.removeBan(iP86);
    boolean b89 = server0.removeBan(iP86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test085"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    java.lang.String str15 = server8.toString();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addException(iP21);
    tp2.Server server24 = new tp2.Server();
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b37 = server25.addBan(iP36);
    boolean b38 = server24.removeException(iP36);
    boolean b39 = server8.addException(iP36);
    boolean b40 = server8.repOK();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b46 = server8.removeBan(iP45);
    boolean b47 = server0.addException(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test086"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    java.lang.String str21 = server14.toString();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    boolean b29 = server14.addException(iP27);
    tp2.Server server30 = new tp2.Server();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b43 = server31.addBan(iP42);
    boolean b44 = server30.removeException(iP42);
    boolean b45 = server14.addException(iP42);
    boolean b46 = server0.addBan(iP42);
    java.lang.String str47 = server0.toString();
    server0.update();
    java.lang.String str49 = server0.toString();
    boolean b50 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Server [lastUpdate=1465597329098, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389099]][IPBan [ip=-1.10.1.1, expires=1465597389100]]}]"+ "'", str47.equals("Server [lastUpdate=1465597329098, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389099]][IPBan [ip=-1.10.1.1, expires=1465597389100]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "Server [lastUpdate=1465597329100, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389099]][IPBan [ip=-1.10.1.1, expires=1465597389100]]}]"+ "'", str49.equals("Server [lastUpdate=1465597329100, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389099]][IPBan [ip=-1.10.1.1, expires=1465597389100]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test087"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b18 = server0.removeException(iP17);
    tp2.Server server19 = new tp2.Server();
    server19.update();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    boolean b26 = server19.removeException(iP25);
    boolean b27 = server0.addBan(iP25);
    boolean b28 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test088"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server0.removeException(iP13);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    server15.update();
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b29 = server23.connect(iP28);
    boolean b30 = server15.addBan(iP28);
    boolean b31 = server0.addException(iP28);
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b38 = server32.connect(iP37);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b44 = server32.addBan(iP43);
    tp2.Server server45 = new tp2.Server();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b51 = server45.connect(iP50);
    tp2.ITime iTime52 = null;
    server45.setTime(iTime52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b59 = server45.removeException(iP58);
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b66 = server60.connect(iP65);
    server60.update();
    tp2.Server server68 = new tp2.Server();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b74 = server68.connect(iP73);
    server68.update();
    tp2.Server server76 = new tp2.Server();
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b82 = server76.connect(iP81);
    boolean b83 = server68.addBan(iP81);
    boolean b84 = server60.addBan(iP81);
    boolean b85 = server45.connect(iP81);
    boolean b86 = server32.removeBan(iP81);
    boolean b87 = server0.connect(iP81);
    tp2.IP iP92 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b93 = server0.addException(iP92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test089"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    boolean b13 = server0.repOK();
    server0.update();
    boolean b15 = server0.repOK();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    java.lang.String str23 = server16.toString();
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b30 = server24.connect(iP29);
    server24.update();
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b38 = server32.connect(iP37);
    boolean b39 = server24.addBan(iP37);
    boolean b40 = server16.addException(iP37);
    tp2.Server server41 = new tp2.Server();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b47 = server41.connect(iP46);
    server41.update();
    tp2.Server server49 = new tp2.Server();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b55 = server49.connect(iP54);
    boolean b56 = server41.addBan(iP54);
    server41.update();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server58.connect(iP63);
    server58.update();
    tp2.Server server66 = new tp2.Server();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b72 = server66.connect(iP71);
    server66.update();
    tp2.Server server74 = new tp2.Server();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b80 = server74.connect(iP79);
    boolean b81 = server66.addBan(iP79);
    boolean b82 = server58.addBan(iP79);
    boolean b83 = server41.connect(iP79);
    boolean b84 = server16.removeBan(iP79);
    tp2.ITime iTime85 = null;
    server16.setTime(iTime85);
    java.lang.String str87 = server16.toString();
    tp2.IP iP92 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b93 = server16.addException(iP92);
    boolean b94 = server0.removeException(iP92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str87 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str87.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test090"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addBan(iP21);
    server0.update();
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b32 = server26.connect(iP31);
    server26.update();
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b40 = server34.connect(iP39);
    server34.update();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    boolean b49 = server34.addBan(iP47);
    boolean b50 = server26.addBan(iP47);
    boolean b51 = server0.addBan(iP47);
    server0.update();
    tp2.Server server53 = new tp2.Server();
    server53.update();
    tp2.Server server55 = new tp2.Server();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b61 = server55.connect(iP60);
    java.lang.String str62 = server55.toString();
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b69 = server63.connect(iP68);
    boolean b70 = server55.addException(iP68);
    tp2.Server server71 = new tp2.Server();
    tp2.Server server72 = new tp2.Server();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b78 = server72.connect(iP77);
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b84 = server72.addBan(iP83);
    boolean b85 = server71.removeException(iP83);
    boolean b86 = server55.addException(iP83);
    boolean b87 = server53.connect(iP83);
    boolean b88 = server0.addBan(iP83);
    tp2.IP iP93 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    boolean b94 = server0.removeException(iP93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str62.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test091"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    java.lang.String str21 = server14.toString();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    boolean b29 = server14.addException(iP27);
    tp2.Server server30 = new tp2.Server();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b43 = server31.addBan(iP42);
    boolean b44 = server30.removeException(iP42);
    boolean b45 = server14.addException(iP42);
    boolean b46 = server0.addBan(iP42);
    boolean b47 = server0.repOK();
    java.lang.String str48 = server0.toString();
    java.lang.String str49 = server0.toString();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)1);
    boolean b55 = server0.addException(iP54);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Server [lastUpdate=1465597329242, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389243]][IPBan [ip=-1.10.1.1, expires=1465597389245]]}]"+ "'", str48.equals("Server [lastUpdate=1465597329242, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389243]][IPBan [ip=-1.10.1.1, expires=1465597389245]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "Server [lastUpdate=1465597329242, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389243]][IPBan [ip=-1.10.1.1, expires=1465597389245]]}]"+ "'", str49.equals("Server [lastUpdate=1465597329242, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389243]][IPBan [ip=-1.10.1.1, expires=1465597389245]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test092"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    java.lang.String str21 = server14.toString();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    boolean b29 = server14.addException(iP27);
    tp2.Server server30 = new tp2.Server();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b43 = server31.addBan(iP42);
    boolean b44 = server30.removeException(iP42);
    boolean b45 = server14.addException(iP42);
    boolean b46 = server0.addBan(iP42);
    tp2.StubTime stubTime47 = new tp2.StubTime();
    server0.setTime((tp2.ITime)stubTime47);
    tp2.Server server49 = new tp2.Server();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b55 = server49.connect(iP54);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b61 = server49.addBan(iP60);
    tp2.Server server62 = new tp2.Server();
    server62.update();
    tp2.Server server64 = new tp2.Server();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b70 = server64.connect(iP69);
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b76 = server64.addBan(iP75);
    boolean b77 = server62.addBan(iP75);
    boolean b78 = server49.removeException(iP75);
    boolean b79 = server0.addException(iP75);
    java.lang.String str80 = server0.toString();
    java.lang.String str81 = server0.toString();
    server0.update();
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)10);
    boolean b88 = server0.removeBan(iP87);
    boolean b89 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "Server [lastUpdate=1465597329259, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389260]]}]"+ "'", str80.equals("Server [lastUpdate=1465597329259, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389260]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "Server [lastUpdate=1465597329259, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389260]]}]"+ "'", str81.equals("Server [lastUpdate=1465597329259, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389260]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test093"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    java.lang.String str21 = server14.toString();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    boolean b29 = server14.addException(iP27);
    tp2.Server server30 = new tp2.Server();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b43 = server31.addBan(iP42);
    boolean b44 = server30.removeException(iP42);
    boolean b45 = server14.addException(iP42);
    boolean b46 = server0.addBan(iP42);
    boolean b47 = server0.repOK();
    java.lang.String str48 = server0.toString();
    server0.update();
    server0.update();
    boolean b51 = server0.repOK();
    boolean b52 = server0.repOK();
    java.lang.String str53 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Server [lastUpdate=1465597329293, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389293]][IPBan [ip=-1.10.1.1, expires=1465597389295]]}]"+ "'", str48.equals("Server [lastUpdate=1465597329293, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389293]][IPBan [ip=-1.10.1.1, expires=1465597389295]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Server [lastUpdate=1465597329295, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389293]][IPBan [ip=-1.10.1.1, expires=1465597389295]]}]"+ "'", str53.equals("Server [lastUpdate=1465597329295, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389293]][IPBan [ip=-1.10.1.1, expires=1465597389295]]}]"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test094"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b19 = server13.connect(iP18);
    tp2.ITime iTime20 = null;
    server13.setTime(iTime20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b27 = server13.removeException(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b34 = server28.connect(iP33);
    server28.update();
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server36.connect(iP41);
    server36.update();
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b50 = server44.connect(iP49);
    boolean b51 = server36.addBan(iP49);
    boolean b52 = server28.addBan(iP49);
    boolean b53 = server13.connect(iP49);
    boolean b54 = server0.removeBan(iP49);
    server0.update();
    tp2.Server server56 = new tp2.Server();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b62 = server56.connect(iP61);
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b68 = server56.addBan(iP67);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b74 = server56.removeException(iP73);
    boolean b75 = server0.removeException(iP73);
    java.lang.String str76 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "Server [lastUpdate=1465597329312, exceptions=(), bans={[IPBan [ip=-1.10.1.1, expires=1465597389309]]}]"+ "'", str76.equals("Server [lastUpdate=1465597329312, exceptions=(), bans={[IPBan [ip=-1.10.1.1, expires=1465597389309]]}]"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test095"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server0.removeException(iP13);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    server15.update();
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b29 = server23.connect(iP28);
    server23.update();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    boolean b38 = server23.addBan(iP36);
    boolean b39 = server15.addBan(iP36);
    boolean b40 = server0.connect(iP36);
    tp2.Server server41 = new tp2.Server();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b47 = server41.connect(iP46);
    server41.update();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b54 = server41.addBan(iP53);
    tp2.Server server55 = new tp2.Server();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b61 = server55.connect(iP60);
    java.lang.String str62 = server55.toString();
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b69 = server63.connect(iP68);
    boolean b70 = server55.addException(iP68);
    tp2.Server server71 = new tp2.Server();
    tp2.Server server72 = new tp2.Server();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b78 = server72.connect(iP77);
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b84 = server72.addBan(iP83);
    boolean b85 = server71.removeException(iP83);
    boolean b86 = server55.addException(iP83);
    boolean b87 = server41.addBan(iP83);
    tp2.StubTime stubTime88 = new tp2.StubTime();
    server41.setTime((tp2.ITime)stubTime88);
    server0.setTime((tp2.ITime)stubTime88);
    tp2.StubTime stubTime91 = new tp2.StubTime();
    server0.setTime((tp2.ITime)stubTime91);
    long long93 = stubTime91.getCurrentTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str62.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long93 == 200000L);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test096"); }


    tp2.Server server0 = new tp2.Server();
    tp2.Server server1 = new tp2.Server();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b7 = server1.connect(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b13 = server1.addBan(iP12);
    boolean b14 = server0.removeException(iP12);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b27 = server15.addBan(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b34 = server28.connect(iP33);
    tp2.ITime iTime35 = null;
    server28.setTime(iTime35);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server28.removeException(iP41);
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b49 = server43.connect(iP48);
    server43.update();
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b57 = server51.connect(iP56);
    server51.update();
    tp2.Server server59 = new tp2.Server();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b65 = server59.connect(iP64);
    boolean b66 = server51.addBan(iP64);
    boolean b67 = server43.addBan(iP64);
    boolean b68 = server28.connect(iP64);
    boolean b69 = server15.removeBan(iP64);
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b75 = server15.removeBan(iP74);
    boolean b76 = server0.addException(iP74);
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b82 = server0.addException(iP81);
    server0.update();
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
    boolean b89 = server0.removeException(iP88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test097"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b18 = server0.removeException(iP17);
    java.lang.String str19 = server0.toString();
    boolean b20 = server0.repOK();
    java.lang.String str21 = server0.toString();
    boolean b22 = server0.repOK();
    java.lang.String str23 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={[IPBan [ip=-1.10.1.1, expires=1465597389413]]}]"+ "'", str19.equals("Server [lastUpdate=0, exceptions=(), bans={[IPBan [ip=-1.10.1.1, expires=1465597389413]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={[IPBan [ip=-1.10.1.1, expires=1465597389413]]}]"+ "'", str21.equals("Server [lastUpdate=0, exceptions=(), bans={[IPBan [ip=-1.10.1.1, expires=1465597389413]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={[IPBan [ip=-1.10.1.1, expires=1465597389413]]}]"+ "'", str23.equals("Server [lastUpdate=0, exceptions=(), bans={[IPBan [ip=-1.10.1.1, expires=1465597389413]]}]"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test098"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    java.lang.String str11 = server0.toString();
    java.lang.String str12 = server0.toString();
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b19 = server13.connect(iP18);
    server13.update();
    tp2.Server server21 = new tp2.Server();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b27 = server21.connect(iP26);
    server21.update();
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b35 = server29.connect(iP34);
    boolean b36 = server21.addBan(iP34);
    boolean b37 = server13.addBan(iP34);
    server13.update();
    tp2.Server server39 = new tp2.Server();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b45 = server39.connect(iP44);
    server39.update();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b52 = server39.addBan(iP51);
    tp2.Server server53 = new tp2.Server();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b59 = server53.connect(iP58);
    java.lang.String str60 = server53.toString();
    tp2.Server server61 = new tp2.Server();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b67 = server61.connect(iP66);
    boolean b68 = server53.addException(iP66);
    tp2.Server server69 = new tp2.Server();
    tp2.Server server70 = new tp2.Server();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b76 = server70.connect(iP75);
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b82 = server70.addBan(iP81);
    boolean b83 = server69.removeException(iP81);
    boolean b84 = server53.addException(iP81);
    boolean b85 = server39.addBan(iP81);
    tp2.StubTime stubTime86 = new tp2.StubTime();
    server39.setTime((tp2.ITime)stubTime86);
    long long88 = stubTime86.getCurrentTime();
    long long89 = stubTime86.getCurrentTime();
    server13.setTime((tp2.ITime)stubTime86);
    server0.setTime((tp2.ITime)stubTime86);
    tp2.StubTime stubTime92 = new tp2.StubTime();
    server0.setTime((tp2.ITime)stubTime92);
    long long94 = stubTime92.getCurrentTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465597329416, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465597329416, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465597329416, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465597329416, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=1465597329416, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=1465597329416, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str60.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long88 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long89 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long94 == 200000L);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test099"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b13 = server7.connect(iP12);
    server7.update();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b20 = server7.addBan(iP19);
    tp2.Server server21 = new tp2.Server();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b27 = server21.connect(iP26);
    java.lang.String str28 = server21.toString();
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b35 = server29.connect(iP34);
    boolean b36 = server21.addException(iP34);
    tp2.Server server37 = new tp2.Server();
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b44 = server38.connect(iP43);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b50 = server38.addBan(iP49);
    boolean b51 = server37.removeException(iP49);
    boolean b52 = server21.addException(iP49);
    boolean b53 = server7.addBan(iP49);
    tp2.StubTime stubTime54 = new tp2.StubTime();
    server7.setTime((tp2.ITime)stubTime54);
    server0.setTime((tp2.ITime)stubTime54);
    tp2.Server server57 = new tp2.Server();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b63 = server57.connect(iP62);
    java.lang.String str64 = server57.toString();
    boolean b65 = server57.repOK();
    tp2.Server server66 = new tp2.Server();
    server66.update();
    tp2.Server server68 = new tp2.Server();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b74 = server68.connect(iP73);
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b80 = server68.addBan(iP79);
    boolean b81 = server66.addBan(iP79);
    boolean b82 = server57.addException(iP79);
    boolean b83 = server57.repOK();
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)0);
    boolean b89 = server57.addException(iP88);
    boolean b90 = server0.addBan(iP88);
    tp2.IP iP95 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b96 = server0.removeException(iP95);
    java.lang.String str97 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str28.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str64.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str97 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={[IPBan [ip=100.-1.10.0, expires=260000]]}]"+ "'", str97.equals("Server [lastUpdate=0, exceptions=(), bans={[IPBan [ip=100.-1.10.0, expires=260000]]}]"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test100"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    java.lang.String str21 = server14.toString();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    boolean b29 = server14.addException(iP27);
    tp2.Server server30 = new tp2.Server();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b43 = server31.addBan(iP42);
    boolean b44 = server30.removeException(iP42);
    boolean b45 = server14.addException(iP42);
    boolean b46 = server0.addBan(iP42);
    tp2.StubTime stubTime47 = new tp2.StubTime();
    server0.setTime((tp2.ITime)stubTime47);
    tp2.Server server49 = new tp2.Server();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b55 = server49.connect(iP54);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b61 = server49.addBan(iP60);
    tp2.Server server62 = new tp2.Server();
    server62.update();
    tp2.Server server64 = new tp2.Server();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b70 = server64.connect(iP69);
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b76 = server64.addBan(iP75);
    boolean b77 = server62.addBan(iP75);
    boolean b78 = server49.removeException(iP75);
    boolean b79 = server0.addException(iP75);
    java.lang.String str80 = server0.toString();
    java.lang.String str81 = server0.toString();
    tp2.StubTime stubTime82 = new tp2.StubTime();
    server0.setTime((tp2.ITime)stubTime82);
    long long84 = stubTime82.getCurrentTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "Server [lastUpdate=1465597329498, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389498]]}]"+ "'", str80.equals("Server [lastUpdate=1465597329498, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389498]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "Server [lastUpdate=1465597329498, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389498]]}]"+ "'", str81.equals("Server [lastUpdate=1465597329498, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389498]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long84 == 200000L);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test101"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b18 = server0.removeException(iP17);
    java.lang.Integer i21 = null;
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)100, i21, (java.lang.Integer)10);
    boolean b24 = server0.removeException(iP23);
    server0.update();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test102"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addException(iP13);
    tp2.Server server16 = new tp2.Server();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b23 = server17.connect(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b29 = server17.addBan(iP28);
    boolean b30 = server16.removeException(iP28);
    boolean b31 = server0.addException(iP28);
    boolean b32 = server0.repOK();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    java.lang.String str40 = server33.toString();
    tp2.Server server41 = new tp2.Server();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b47 = server41.connect(iP46);
    boolean b48 = server33.addException(iP46);
    tp2.Server server49 = new tp2.Server();
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b62 = server50.addBan(iP61);
    boolean b63 = server49.removeException(iP61);
    boolean b64 = server33.addException(iP61);
    boolean b65 = server33.repOK();
    boolean b66 = server33.repOK();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b72 = server33.addBan(iP71);
    boolean b73 = server0.addException(iP71);
    java.lang.Integer i76 = null;
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)100, i76, (java.lang.Integer)(-1));
    boolean b79 = server0.addException(iP78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str40.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test103"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    boolean b8 = server0.repOK();
    server0.update();
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b16 = server10.connect(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b23 = server17.connect(iP22);
    java.lang.String str24 = server17.toString();
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    server25.update();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    boolean b40 = server25.addBan(iP38);
    boolean b41 = server17.addException(iP38);
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    server42.update();
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    boolean b57 = server42.addBan(iP55);
    server42.update();
    tp2.Server server59 = new tp2.Server();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b65 = server59.connect(iP64);
    server59.update();
    tp2.Server server67 = new tp2.Server();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b73 = server67.connect(iP72);
    server67.update();
    tp2.Server server75 = new tp2.Server();
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b81 = server75.connect(iP80);
    boolean b82 = server67.addBan(iP80);
    boolean b83 = server59.addBan(iP80);
    boolean b84 = server42.connect(iP80);
    boolean b85 = server17.removeBan(iP80);
    java.lang.String str86 = server17.toString();
    java.lang.String str87 = server17.toString();
    tp2.IP iP92 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)(-1));
    boolean b93 = server17.removeBan(iP92);
    boolean b94 = server10.addBan(iP92);
    boolean b95 = server0.removeException(iP92);
    java.lang.String str96 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str24.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str86.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str87 + "' != '" + "Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"+ "'", str87.equals("Server [lastUpdate=0, exceptions=([100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str96 + "' != '" + "Server [lastUpdate=1465597329569, exceptions=(), bans={}]"+ "'", str96.equals("Server [lastUpdate=1465597329569, exceptions=(), bans={}]"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test104"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addBan(iP13);
    boolean b16 = server0.repOK();
    java.lang.String str17 = server0.toString();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)(-1));
    boolean b23 = server0.removeException(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=1465597329611, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597389612]]}]"+ "'", str17.equals("Server [lastUpdate=1465597329611, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597389612]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test105"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addException(iP13);
    tp2.Server server16 = new tp2.Server();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b23 = server17.connect(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b29 = server17.addBan(iP28);
    boolean b30 = server16.removeException(iP28);
    boolean b31 = server0.addException(iP28);
    boolean b32 = server0.repOK();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    java.lang.String str40 = server33.toString();
    tp2.Server server41 = new tp2.Server();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b47 = server41.connect(iP46);
    boolean b48 = server33.addException(iP46);
    tp2.Server server49 = new tp2.Server();
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b62 = server50.addBan(iP61);
    boolean b63 = server49.removeException(iP61);
    boolean b64 = server33.addException(iP61);
    boolean b65 = server33.repOK();
    boolean b66 = server33.repOK();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b72 = server33.addBan(iP71);
    boolean b73 = server0.addException(iP71);
    boolean b74 = server0.repOK();
    tp2.IP iP75 = null;
    boolean b76 = server0.removeException(iP75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str40.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test106"); }


    tp2.Server server0 = new tp2.Server();
    tp2.Server server1 = new tp2.Server();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b7 = server1.connect(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b13 = server1.addBan(iP12);
    boolean b14 = server0.removeException(iP12);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b27 = server15.addBan(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b34 = server28.connect(iP33);
    tp2.ITime iTime35 = null;
    server28.setTime(iTime35);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server28.removeException(iP41);
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b49 = server43.connect(iP48);
    server43.update();
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b57 = server51.connect(iP56);
    server51.update();
    tp2.Server server59 = new tp2.Server();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b65 = server59.connect(iP64);
    boolean b66 = server51.addBan(iP64);
    boolean b67 = server43.addBan(iP64);
    boolean b68 = server28.connect(iP64);
    boolean b69 = server15.removeBan(iP64);
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b75 = server15.removeBan(iP74);
    boolean b76 = server0.addException(iP74);
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b82 = server0.addException(iP81);
    boolean b83 = server0.repOK();
    java.lang.Integer i87 = null;
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)100, (java.lang.Integer)0, i87);
    boolean b89 = server0.addException(iP88);
    server0.update();
    boolean b91 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test107"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addBan(iP13);
    server0.update();
    server0.update();
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b24 = server18.connect(iP23);
    java.lang.String str25 = server18.toString();
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b32 = server26.connect(iP31);
    server26.update();
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b40 = server34.connect(iP39);
    boolean b41 = server26.addBan(iP39);
    boolean b42 = server18.addException(iP39);
    boolean b43 = server18.repOK();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)0);
    boolean b49 = server18.connect(iP48);
    boolean b50 = server0.connect(iP48);
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b57 = server51.connect(iP56);
    server51.update();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b64 = server51.addBan(iP63);
    java.lang.String str65 = server51.toString();
    tp2.Server server66 = new tp2.Server();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b72 = server66.connect(iP71);
    server66.update();
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b79 = server66.addBan(iP78);
    boolean b80 = server51.removeBan(iP78);
    tp2.IP iP85 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)0);
    boolean b86 = server51.connect(iP85);
    boolean b87 = server0.addBan(iP85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str25.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "Server [lastUpdate=1465597329684, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389684]]}]"+ "'", str65.equals("Server [lastUpdate=1465597329684, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389684]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test108"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    java.lang.String str21 = server14.toString();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    boolean b29 = server14.addException(iP27);
    tp2.Server server30 = new tp2.Server();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b43 = server31.addBan(iP42);
    boolean b44 = server30.removeException(iP42);
    boolean b45 = server14.addException(iP42);
    boolean b46 = server0.addBan(iP42);
    tp2.StubTime stubTime47 = new tp2.StubTime();
    server0.setTime((tp2.ITime)stubTime47);
    tp2.Server server49 = new tp2.Server();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b55 = server49.connect(iP54);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b61 = server49.addBan(iP60);
    tp2.Server server62 = new tp2.Server();
    server62.update();
    tp2.Server server64 = new tp2.Server();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b70 = server64.connect(iP69);
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b76 = server64.addBan(iP75);
    boolean b77 = server62.addBan(iP75);
    boolean b78 = server49.removeException(iP75);
    boolean b79 = server0.addException(iP75);
    java.lang.String str80 = server0.toString();
    java.lang.String str81 = server0.toString();
    server0.update();
    server0.update();
    tp2.IP iP84 = null;
    boolean b85 = server0.removeBan(iP84);
    tp2.IP iP90 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b91 = server0.removeException(iP90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "Server [lastUpdate=1465597329713, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389713]]}]"+ "'", str80.equals("Server [lastUpdate=1465597329713, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389713]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "Server [lastUpdate=1465597329713, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389713]]}]"+ "'", str81.equals("Server [lastUpdate=1465597329713, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389713]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test109"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    java.lang.String str8 = server0.toString();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
    boolean b14 = server0.removeBan(iP13);
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)1);
    boolean b20 = server0.removeException(iP19);
    boolean b21 = server0.repOK();
    boolean b22 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465597329750, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465597329750, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test110"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addException(iP21);
    boolean b25 = server0.repOK();
    tp2.Server server26 = new tp2.Server();
    server26.update();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    boolean b33 = server26.removeException(iP32);
    boolean b34 = server0.addBan(iP32);
    tp2.Server server35 = new tp2.Server();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b41 = server35.connect(iP40);
    server35.update();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b48 = server35.addBan(iP47);
    boolean b49 = server0.removeException(iP47);
    boolean b50 = server0.repOK();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test111"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    java.lang.String str21 = server14.toString();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    boolean b29 = server14.addException(iP27);
    tp2.Server server30 = new tp2.Server();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b43 = server31.addBan(iP42);
    boolean b44 = server30.removeException(iP42);
    boolean b45 = server14.addException(iP42);
    boolean b46 = server0.addBan(iP42);
    tp2.StubTime stubTime47 = new tp2.StubTime();
    server0.setTime((tp2.ITime)stubTime47);
    tp2.Server server49 = new tp2.Server();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b55 = server49.connect(iP54);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b61 = server49.addBan(iP60);
    tp2.Server server62 = new tp2.Server();
    server62.update();
    tp2.Server server64 = new tp2.Server();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b70 = server64.connect(iP69);
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b76 = server64.addBan(iP75);
    boolean b77 = server62.addBan(iP75);
    boolean b78 = server49.removeException(iP75);
    boolean b79 = server0.addException(iP75);
    java.lang.String str80 = server0.toString();
    java.lang.String str81 = server0.toString();
    server0.update();
    java.lang.Integer i85 = null;
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)100, i85, (java.lang.Integer)10);
    boolean b88 = server0.connect(iP87);
    tp2.IP iP93 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)0);
    boolean b94 = server0.removeException(iP93);
    boolean b95 = server0.repOK();
    server0.update();
    server0.update();
    java.lang.String str98 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "Server [lastUpdate=1465597329767, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389767]]}]"+ "'", str80.equals("Server [lastUpdate=1465597329767, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389767]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "Server [lastUpdate=1465597329767, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389767]]}]"+ "'", str81.equals("Server [lastUpdate=1465597329767, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389767]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str98 + "' != '" + "Server [lastUpdate=200000, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389767]]}]"+ "'", str98.equals("Server [lastUpdate=200000, exceptions=([-1.10.1.1]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389767]]}]"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test112"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addBan(iP13);
    server0.update();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b23 = server17.connect(iP22);
    server17.update();
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    server25.update();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    boolean b40 = server25.addBan(iP38);
    boolean b41 = server17.addBan(iP38);
    boolean b42 = server0.connect(iP38);
    tp2.ITime iTime43 = null;
    server0.setTime(iTime43);
    // The following exception was thrown during execution in test generation
    try {
      boolean b45 = server0.repOK();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test113"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    java.lang.String str14 = server0.toString();
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    server15.update();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b28 = server15.addBan(iP27);
    boolean b29 = server0.removeBan(iP27);
    boolean b30 = server0.repOK();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    server31.update();
    tp2.Server server39 = new tp2.Server();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b45 = server39.connect(iP44);
    server39.update();
    tp2.Server server47 = new tp2.Server();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b53 = server47.connect(iP52);
    boolean b54 = server39.addBan(iP52);
    boolean b55 = server31.addBan(iP52);
    server31.update();
    boolean b57 = server31.repOK();
    java.lang.String str58 = server31.toString();
    boolean b59 = server31.repOK();
    server31.update();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)1);
    boolean b66 = server31.addException(iP65);
    boolean b67 = server0.addBan(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=1465597329844, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389844]]}]"+ "'", str14.equals("Server [lastUpdate=1465597329844, exceptions=(), bans={[IPBan [ip=100.-1.-1.0, expires=1465597389844]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "Server [lastUpdate=1465597329846, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597389846]]}]"+ "'", str58.equals("Server [lastUpdate=1465597329846, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597389846]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test114"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    boolean b8 = server0.repOK();
    tp2.Server server9 = new tp2.Server();
    server9.update();
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b17 = server11.connect(iP16);
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b23 = server11.addBan(iP22);
    boolean b24 = server9.addBan(iP22);
    boolean b25 = server0.addException(iP22);
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b32 = server26.connect(iP31);
    server26.update();
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b40 = server34.connect(iP39);
    server34.update();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    boolean b49 = server34.addBan(iP47);
    boolean b50 = server26.addBan(iP47);
    boolean b51 = server0.addBan(iP47);
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b58 = server52.connect(iP57);
    java.lang.String str59 = server52.toString();
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b66 = server60.connect(iP65);
    server60.update();
    tp2.Server server68 = new tp2.Server();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b74 = server68.connect(iP73);
    boolean b75 = server60.addBan(iP73);
    boolean b76 = server52.addException(iP73);
    tp2.StubTime stubTime77 = new tp2.StubTime();
    server52.setTime((tp2.ITime)stubTime77);
    long long79 = stubTime77.getCurrentTime();
    long long80 = stubTime77.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime77);
    long long82 = stubTime77.getCurrentTime();
    long long83 = stubTime77.getCurrentTime();
    long long84 = stubTime77.getCurrentTime();
    long long85 = stubTime77.getCurrentTime();
    long long86 = stubTime77.getCurrentTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str59.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long79 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long80 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long82 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long83 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long84 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long85 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long86 == 200000L);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test115"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    java.lang.String str8 = server0.toString();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
    boolean b14 = server0.removeBan(iP13);
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)1);
    boolean b20 = server0.removeException(iP19);
    boolean b21 = server0.repOK();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    server22.update();
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b36 = server30.connect(iP35);
    boolean b37 = server22.addBan(iP35);
    boolean b38 = server22.repOK();
    tp2.Server server39 = new tp2.Server();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b45 = server39.connect(iP44);
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b51 = server39.addBan(iP50);
    boolean b52 = server22.connect(iP50);
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)(-1));
    boolean b58 = server22.addException(iP57);
    boolean b59 = server0.connect(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465597329895, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465597329895, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test116"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addException(iP13);
    tp2.Server server16 = new tp2.Server();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b23 = server17.connect(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b29 = server17.addBan(iP28);
    boolean b30 = server16.removeException(iP28);
    boolean b31 = server0.addException(iP28);
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b38 = server32.connect(iP37);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b44 = server32.addBan(iP43);
    tp2.Server server45 = new tp2.Server();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b51 = server45.connect(iP50);
    tp2.ITime iTime52 = null;
    server45.setTime(iTime52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b59 = server45.removeException(iP58);
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b66 = server60.connect(iP65);
    server60.update();
    tp2.Server server68 = new tp2.Server();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b74 = server68.connect(iP73);
    server68.update();
    tp2.Server server76 = new tp2.Server();
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b82 = server76.connect(iP81);
    boolean b83 = server68.addBan(iP81);
    boolean b84 = server60.addBan(iP81);
    boolean b85 = server45.connect(iP81);
    boolean b86 = server32.removeBan(iP81);
    boolean b87 = server0.addException(iP81);
    boolean b88 = server0.repOK();
    tp2.IP iP93 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)(-1));
    boolean b94 = server0.addException(iP93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test117"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.Server server2 = new tp2.Server();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b8 = server2.connect(iP7);
    server2.update();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b15 = server2.addBan(iP14);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    java.lang.String str23 = server16.toString();
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b30 = server24.connect(iP29);
    boolean b31 = server16.addException(iP29);
    tp2.Server server32 = new tp2.Server();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b45 = server33.addBan(iP44);
    boolean b46 = server32.removeException(iP44);
    boolean b47 = server16.addException(iP44);
    boolean b48 = server2.addBan(iP44);
    boolean b49 = server0.removeException(iP44);
    boolean b50 = server0.repOK();
    tp2.IP iP51 = null;
    boolean b52 = server0.connect(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test118"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addException(iP13);
    tp2.Server server16 = new tp2.Server();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b23 = server17.connect(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b29 = server17.addBan(iP28);
    boolean b30 = server16.removeException(iP28);
    boolean b31 = server0.addException(iP28);
    boolean b32 = server0.repOK();
    boolean b33 = server0.repOK();
    server0.update();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b40 = server0.removeBan(iP39);
    java.lang.String str41 = server0.toString();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    tp2.Server server49 = new tp2.Server();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b55 = server49.connect(iP54);
    server49.update();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b62 = server49.addBan(iP61);
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b69 = server63.connect(iP68);
    java.lang.String str70 = server63.toString();
    tp2.Server server71 = new tp2.Server();
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b77 = server71.connect(iP76);
    boolean b78 = server63.addException(iP76);
    tp2.Server server79 = new tp2.Server();
    tp2.Server server80 = new tp2.Server();
    tp2.IP iP85 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b86 = server80.connect(iP85);
    tp2.IP iP91 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b92 = server80.addBan(iP91);
    boolean b93 = server79.removeException(iP91);
    boolean b94 = server63.addException(iP91);
    boolean b95 = server49.addBan(iP91);
    tp2.StubTime stubTime96 = new tp2.StubTime();
    server49.setTime((tp2.ITime)stubTime96);
    server42.setTime((tp2.ITime)stubTime96);
    server0.setTime((tp2.ITime)stubTime96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Server [lastUpdate=1465597329971, exceptions=([-1.10.1.1][100.0.10.1]), bans={}]"+ "'", str41.equals("Server [lastUpdate=1465597329971, exceptions=([-1.10.1.1][100.0.10.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str70.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test119"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b19 = server13.connect(iP18);
    tp2.ITime iTime20 = null;
    server13.setTime(iTime20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b27 = server13.removeException(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b34 = server28.connect(iP33);
    server28.update();
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server36.connect(iP41);
    server36.update();
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b50 = server44.connect(iP49);
    boolean b51 = server36.addBan(iP49);
    boolean b52 = server28.addBan(iP49);
    boolean b53 = server13.connect(iP49);
    boolean b54 = server0.removeBan(iP49);
    tp2.Server server55 = new tp2.Server();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b61 = server55.connect(iP60);
    java.lang.String str62 = server55.toString();
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b69 = server63.connect(iP68);
    boolean b70 = server55.addException(iP68);
    tp2.Server server71 = new tp2.Server();
    tp2.Server server72 = new tp2.Server();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b78 = server72.connect(iP77);
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b84 = server72.addBan(iP83);
    boolean b85 = server71.removeException(iP83);
    boolean b86 = server55.addException(iP83);
    boolean b87 = server0.connect(iP83);
    server0.update();
    tp2.Server server89 = new tp2.Server();
    java.lang.String str90 = server89.toString();
    server89.update();
    tp2.IP iP96 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)0);
    boolean b97 = server89.addBan(iP96);
    boolean b98 = server0.addException(iP96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str62.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str90.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test120"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addBan(iP21);
    server0.update();
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b32 = server26.connect(iP31);
    server26.update();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b39 = server26.addBan(iP38);
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b46 = server40.connect(iP45);
    java.lang.String str47 = server40.toString();
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b54 = server48.connect(iP53);
    boolean b55 = server40.addException(iP53);
    tp2.Server server56 = new tp2.Server();
    tp2.Server server57 = new tp2.Server();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b63 = server57.connect(iP62);
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b69 = server57.addBan(iP68);
    boolean b70 = server56.removeException(iP68);
    boolean b71 = server40.addException(iP68);
    boolean b72 = server26.addBan(iP68);
    tp2.StubTime stubTime73 = new tp2.StubTime();
    server26.setTime((tp2.ITime)stubTime73);
    long long75 = stubTime73.getCurrentTime();
    long long76 = stubTime73.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime73);
    long long78 = stubTime73.getCurrentTime();
    long long79 = stubTime73.getCurrentTime();
    long long80 = stubTime73.getCurrentTime();
    long long81 = stubTime73.getCurrentTime();
    long long82 = stubTime73.getCurrentTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str47.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long75 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long76 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long78 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long79 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long80 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long81 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long82 == 200000L);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test121"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addBan(iP13);
    server0.update();
    server0.update();
    tp2.Server server18 = new tp2.Server();
    tp2.Server server19 = new tp2.Server();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b25 = server19.connect(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b31 = server19.addBan(iP30);
    boolean b32 = server18.removeException(iP30);
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    tp2.ITime iTime40 = null;
    server33.setTime(iTime40);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b47 = server33.removeException(iP46);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b53 = server33.removeException(iP52);
    boolean b54 = server18.addException(iP52);
    boolean b55 = server0.removeBan(iP52);
    boolean b56 = server0.repOK();
    server0.update();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server58.connect(iP63);
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b70 = server58.addBan(iP69);
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b76 = server58.removeException(iP75);
    java.lang.Integer i79 = null;
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)100, i79, (java.lang.Integer)10);
    boolean b82 = server58.removeException(iP81);
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)0);
    boolean b88 = server58.removeBan(iP87);
    boolean b89 = server0.removeBan(iP87);
    tp2.IP iP94 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)100);
    boolean b95 = server0.removeBan(iP94);
    tp2.IP iP96 = null;
    boolean b97 = server0.addBan(iP96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test122"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addBan(iP13);
    server0.update();
    server0.update();
    tp2.Server server18 = new tp2.Server();
    tp2.Server server19 = new tp2.Server();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b25 = server19.connect(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b31 = server19.addBan(iP30);
    boolean b32 = server18.removeException(iP30);
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    tp2.ITime iTime40 = null;
    server33.setTime(iTime40);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b47 = server33.removeException(iP46);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b53 = server33.removeException(iP52);
    boolean b54 = server18.addException(iP52);
    boolean b55 = server0.removeBan(iP52);
    boolean b56 = server0.repOK();
    tp2.Server server57 = new tp2.Server();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b63 = server57.connect(iP62);
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b69 = server57.addBan(iP68);
    boolean b70 = server57.repOK();
    tp2.Server server71 = new tp2.Server();
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b77 = server71.connect(iP76);
    server71.update();
    tp2.Server server79 = new tp2.Server();
    tp2.IP iP84 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b85 = server79.connect(iP84);
    server79.update();
    tp2.Server server87 = new tp2.Server();
    tp2.IP iP92 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b93 = server87.connect(iP92);
    boolean b94 = server79.addBan(iP92);
    boolean b95 = server71.addBan(iP92);
    boolean b96 = server57.addException(iP92);
    boolean b97 = server0.addException(iP92);
    java.lang.String str98 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str98 + "' != '" + "Server [lastUpdate=1465597330138, exceptions=([100.0.10.1]), bans={}]"+ "'", str98.equals("Server [lastUpdate=1465597330138, exceptions=([100.0.10.1]), bans={}]"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test123"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server0.removeException(iP13);
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)1);
    boolean b20 = server0.removeException(iP19);
    java.lang.String str21 = server0.toString();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b34 = server22.addBan(iP33);
    tp2.Server server35 = new tp2.Server();
    server35.update();
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b43 = server37.connect(iP42);
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b49 = server37.addBan(iP48);
    boolean b50 = server35.addBan(iP48);
    boolean b51 = server22.removeException(iP48);
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b58 = server52.connect(iP57);
    boolean b59 = server22.connect(iP57);
    // The following exception was thrown during execution in test generation
    try {
      boolean b60 = server0.addBan(iP57);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test124"); }


    java.lang.Integer i0 = null;
    tp2.IP iP4 = new tp2.IP(i0, (java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)1);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test125"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addBan(iP21);
    server0.update();
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b32 = server26.connect(iP31);
    server26.update();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b39 = server26.addBan(iP38);
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b46 = server40.connect(iP45);
    java.lang.String str47 = server40.toString();
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b54 = server48.connect(iP53);
    boolean b55 = server40.addException(iP53);
    tp2.Server server56 = new tp2.Server();
    tp2.Server server57 = new tp2.Server();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b63 = server57.connect(iP62);
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b69 = server57.addBan(iP68);
    boolean b70 = server56.removeException(iP68);
    boolean b71 = server40.addException(iP68);
    boolean b72 = server26.addBan(iP68);
    tp2.StubTime stubTime73 = new tp2.StubTime();
    server26.setTime((tp2.ITime)stubTime73);
    long long75 = stubTime73.getCurrentTime();
    long long76 = stubTime73.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime73);
    tp2.Server server78 = new tp2.Server();
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b84 = server78.connect(iP83);
    tp2.IP iP89 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b90 = server78.addBan(iP89);
    boolean b91 = server0.connect(iP89);
    java.lang.String str92 = server0.toString();
    java.lang.String str93 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str47.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long75 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long76 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str92 + "' != '" + "Server [lastUpdate=1465597330185, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597390185]]}]"+ "'", str92.equals("Server [lastUpdate=1465597330185, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597390185]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str93 + "' != '" + "Server [lastUpdate=1465597330185, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597390185]]}]"+ "'", str93.equals("Server [lastUpdate=1465597330185, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597390185]]}]"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test126"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.Server server2 = new tp2.Server();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b8 = server2.connect(iP7);
    server2.update();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b15 = server2.addBan(iP14);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    java.lang.String str23 = server16.toString();
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b30 = server24.connect(iP29);
    boolean b31 = server16.addException(iP29);
    tp2.Server server32 = new tp2.Server();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b45 = server33.addBan(iP44);
    boolean b46 = server32.removeException(iP44);
    boolean b47 = server16.addException(iP44);
    boolean b48 = server2.addBan(iP44);
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b54 = server2.connect(iP53);
    java.lang.Integer i57 = null;
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)100, i57, (java.lang.Integer)10);
    boolean b60 = server2.addException(iP59);
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b66 = server2.connect(iP65);
    boolean b67 = server0.connect(iP65);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test127"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b18 = server0.removeException(iP17);
    java.lang.Integer i21 = null;
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)100, i21, (java.lang.Integer)10);
    boolean b24 = server0.removeException(iP23);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b37 = server25.addBan(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b43 = server25.removeException(iP42);
    tp2.Server server44 = new tp2.Server();
    server44.update();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    boolean b51 = server44.removeException(iP50);
    boolean b52 = server25.addBan(iP50);
    boolean b53 = server0.removeException(iP50);
    boolean b54 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test128"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    java.lang.String str8 = server0.toString();
    java.lang.String str9 = server0.toString();
    java.lang.String str10 = server0.toString();
    boolean b11 = server0.repOK();
    java.lang.String str12 = server0.toString();
    server0.update();
    server0.update();
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b34 = server22.addBan(iP33);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b40 = server22.removeException(iP39);
    boolean b41 = server15.addException(iP39);
    boolean b42 = server15.repOK();
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b49 = server43.connect(iP48);
    java.lang.String str50 = server43.toString();
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b57 = server51.connect(iP56);
    server51.update();
    tp2.Server server59 = new tp2.Server();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b65 = server59.connect(iP64);
    boolean b66 = server51.addBan(iP64);
    boolean b67 = server43.addException(iP64);
    tp2.StubTime stubTime68 = new tp2.StubTime();
    server43.setTime((tp2.ITime)stubTime68);
    server15.setTime((tp2.ITime)stubTime68);
    server0.setTime((tp2.ITime)stubTime68);
    long long72 = stubTime68.getCurrentTime();
    long long73 = stubTime68.getCurrentTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465597330263, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465597330263, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465597330263, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465597330263, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465597330263, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465597330263, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=1465597330263, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=1465597330263, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str50.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long72 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long73 == 200000L);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test129"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)1);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test130"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addException(iP21);
    tp2.StubTime stubTime25 = new tp2.StubTime();
    server0.setTime((tp2.ITime)stubTime25);
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b33 = server27.connect(iP32);
    server27.update();
    tp2.Server server35 = new tp2.Server();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b41 = server35.connect(iP40);
    boolean b42 = server27.addBan(iP40);
    server27.update();
    server27.update();
    tp2.Server server45 = new tp2.Server();
    tp2.Server server46 = new tp2.Server();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b52 = server46.connect(iP51);
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b58 = server46.addBan(iP57);
    boolean b59 = server45.removeException(iP57);
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b66 = server60.connect(iP65);
    tp2.ITime iTime67 = null;
    server60.setTime(iTime67);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b74 = server60.removeException(iP73);
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b80 = server60.removeException(iP79);
    boolean b81 = server45.addException(iP79);
    boolean b82 = server27.removeBan(iP79);
    boolean b83 = server27.repOK();
    tp2.ITime iTime84 = null;
    server27.setTime(iTime84);
    java.lang.Integer i86 = null;
    tp2.IP iP90 = new tp2.IP(i86, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)(-1));
    boolean b91 = server27.addException(iP90);
    boolean b92 = server0.addBan(iP90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test131"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b26 = server14.addBan(iP25);
    boolean b27 = server13.removeException(iP25);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b34 = server28.connect(iP33);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b40 = server28.addBan(iP39);
    boolean b41 = server28.repOK();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    server42.update();
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    server50.update();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server58.connect(iP63);
    boolean b65 = server50.addBan(iP63);
    boolean b66 = server42.addBan(iP63);
    boolean b67 = server28.addException(iP63);
    boolean b68 = server13.addBan(iP63);
    boolean b69 = server0.addException(iP63);
    boolean b70 = server0.repOK();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test132"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)(-1));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test133"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addException(iP13);
    tp2.Server server16 = new tp2.Server();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b23 = server17.connect(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b29 = server17.addBan(iP28);
    boolean b30 = server16.removeException(iP28);
    boolean b31 = server0.addException(iP28);
    tp2.Server server32 = new tp2.Server();
    server32.update();
    java.lang.Integer i35 = null;
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)0, i35, (java.lang.Integer)10, (java.lang.Integer)0);
    boolean b39 = server32.removeException(iP38);
    java.lang.Integer i40 = null;
    java.lang.Integer i43 = null;
    tp2.IP iP44 = new tp2.IP(i40, (java.lang.Integer)10, (java.lang.Integer)0, i43);
    boolean b45 = server32.addBan(iP44);
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)10);
    boolean b51 = server32.removeException(iP50);
    boolean b52 = server0.connect(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test134"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    java.lang.String str21 = server14.toString();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    boolean b29 = server14.addException(iP27);
    tp2.Server server30 = new tp2.Server();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b43 = server31.addBan(iP42);
    boolean b44 = server30.removeException(iP42);
    boolean b45 = server14.addException(iP42);
    boolean b46 = server0.addBan(iP42);
    boolean b47 = server0.repOK();
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b54 = server48.connect(iP53);
    server48.update();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b61 = server48.addBan(iP60);
    boolean b62 = server0.removeException(iP60);
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)0);
    boolean b68 = server0.addException(iP67);
    java.lang.String str69 = server0.toString();
    java.lang.Integer i73 = null;
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)100, i73);
    boolean b75 = server0.addBan(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "Server [lastUpdate=1465597330363, exceptions=([10.10.1.0]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597390363]][IPBan [ip=-1.10.1.1, expires=1465597390364]]}]"+ "'", str69.equals("Server [lastUpdate=1465597330363, exceptions=([10.10.1.0]), bans={[IPBan [ip=100.-1.-1.0, expires=1465597390363]][IPBan [ip=-1.10.1.1, expires=1465597390364]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test135"); }


    java.lang.Integer i2 = null;
    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)0, i2, (java.lang.Integer)0);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test136"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b18 = server0.removeException(iP17);
    tp2.Server server19 = new tp2.Server();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b25 = server19.connect(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b31 = server19.addBan(iP30);
    tp2.Server server32 = new tp2.Server();
    server32.update();
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b40 = server34.connect(iP39);
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b46 = server34.addBan(iP45);
    boolean b47 = server32.addBan(iP45);
    boolean b48 = server19.removeException(iP45);
    boolean b49 = server0.connect(iP45);
    tp2.IP iP50 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b51 = server0.addException(iP50);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test137"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    boolean b13 = server0.repOK();
    server0.update();
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b21 = server15.connect(iP20);
    java.lang.String str22 = server15.toString();
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b29 = server23.connect(iP28);
    server23.update();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b37 = server31.connect(iP36);
    boolean b38 = server23.addBan(iP36);
    boolean b39 = server15.addException(iP36);
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b46 = server40.connect(iP45);
    server40.update();
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b54 = server48.connect(iP53);
    boolean b55 = server40.addBan(iP53);
    server40.update();
    tp2.Server server57 = new tp2.Server();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b63 = server57.connect(iP62);
    server57.update();
    tp2.Server server65 = new tp2.Server();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b71 = server65.connect(iP70);
    server65.update();
    tp2.Server server73 = new tp2.Server();
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b79 = server73.connect(iP78);
    boolean b80 = server65.addBan(iP78);
    boolean b81 = server57.addBan(iP78);
    boolean b82 = server40.connect(iP78);
    boolean b83 = server15.removeBan(iP78);
    tp2.ITime iTime84 = null;
    server15.setTime(iTime84);
    tp2.StubTime stubTime86 = new tp2.StubTime();
    server15.setTime((tp2.ITime)stubTime86);
    long long88 = stubTime86.getCurrentTime();
    long long89 = stubTime86.getCurrentTime();
    long long90 = stubTime86.getCurrentTime();
    long long91 = stubTime86.getCurrentTime();
    long long92 = stubTime86.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime86);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str22.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long88 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long89 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long90 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long91 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long92 == 200000L);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test138"); }


    tp2.Server server0 = new tp2.Server();
    tp2.Server server1 = new tp2.Server();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b7 = server1.connect(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b13 = server1.addBan(iP12);
    boolean b14 = server0.removeException(iP12);
    server0.update();
    boolean b16 = server0.repOK();
    java.lang.String str17 = server0.toString();
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b24 = server18.connect(iP23);
    server18.update();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b31 = server18.addBan(iP30);
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b38 = server32.connect(iP37);
    java.lang.String str39 = server32.toString();
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b46 = server40.connect(iP45);
    boolean b47 = server32.addException(iP45);
    tp2.Server server48 = new tp2.Server();
    tp2.Server server49 = new tp2.Server();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b55 = server49.connect(iP54);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b61 = server49.addBan(iP60);
    boolean b62 = server48.removeException(iP60);
    boolean b63 = server32.addException(iP60);
    boolean b64 = server18.addBan(iP60);
    tp2.StubTime stubTime65 = new tp2.StubTime();
    server18.setTime((tp2.ITime)stubTime65);
    long long67 = stubTime65.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=1465597330431, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=1465597330431, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str39.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long67 == 200000L);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test139"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addException(iP21);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    server25.update();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    boolean b40 = server25.addBan(iP38);
    server25.update();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    server42.update();
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    server50.update();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server58.connect(iP63);
    boolean b65 = server50.addBan(iP63);
    boolean b66 = server42.addBan(iP63);
    boolean b67 = server25.connect(iP63);
    boolean b68 = server0.removeBan(iP63);
    tp2.ITime iTime69 = null;
    server0.setTime(iTime69);
    tp2.StubTime stubTime71 = new tp2.StubTime();
    server0.setTime((tp2.ITime)stubTime71);
    long long73 = stubTime71.getCurrentTime();
    long long74 = stubTime71.getCurrentTime();
    long long75 = stubTime71.getCurrentTime();
    long long76 = stubTime71.getCurrentTime();
    long long77 = stubTime71.getCurrentTime();
    long long78 = stubTime71.getCurrentTime();
    long long79 = stubTime71.getCurrentTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long73 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long74 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long75 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long76 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long77 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long78 == 200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long79 == 200000L);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test140"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addException(iP13);
    tp2.IP iP16 = null;
    boolean b17 = server0.removeBan(iP16);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test141"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b19 = server13.connect(iP18);
    tp2.ITime iTime20 = null;
    server13.setTime(iTime20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b27 = server13.removeException(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b34 = server28.connect(iP33);
    server28.update();
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server36.connect(iP41);
    server36.update();
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b50 = server44.connect(iP49);
    boolean b51 = server36.addBan(iP49);
    boolean b52 = server28.addBan(iP49);
    boolean b53 = server13.connect(iP49);
    boolean b54 = server0.removeBan(iP49);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b60 = server0.removeBan(iP59);
    java.lang.Integer i63 = null;
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)100, i63, (java.lang.Integer)(-1));
    boolean b66 = server0.addBan(iP65);
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1));
    boolean b72 = server0.addBan(iP71);
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)10);
    boolean b78 = server0.removeBan(iP77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test142"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    server8.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    boolean b23 = server8.addBan(iP21);
    boolean b24 = server0.addBan(iP21);
    server0.update();
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b32 = server26.connect(iP31);
    server26.update();
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b40 = server34.connect(iP39);
    server34.update();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    boolean b49 = server34.addBan(iP47);
    boolean b50 = server26.addBan(iP47);
    boolean b51 = server0.addBan(iP47);
    server0.update();
    tp2.Server server53 = new tp2.Server();
    server53.update();
    tp2.Server server55 = new tp2.Server();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b61 = server55.connect(iP60);
    java.lang.String str62 = server55.toString();
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b69 = server63.connect(iP68);
    boolean b70 = server55.addException(iP68);
    tp2.Server server71 = new tp2.Server();
    tp2.Server server72 = new tp2.Server();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b78 = server72.connect(iP77);
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b84 = server72.addBan(iP83);
    boolean b85 = server71.removeException(iP83);
    boolean b86 = server55.addException(iP83);
    boolean b87 = server53.connect(iP83);
    boolean b88 = server0.addBan(iP83);
    tp2.IP iP93 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b94 = server0.addBan(iP93);
    boolean b95 = server0.repOK();
    java.lang.String str96 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str62.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str96 + "' != '" + "Server [lastUpdate=1465597330515, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597390512]][IPBan [ip=-1.10.1.1, expires=1465597390516]][IPBan [ip=0.10.10.1, expires=1465597390517]]}]"+ "'", str96.equals("Server [lastUpdate=1465597330515, exceptions=(), bans={[IPBan [ip=100.0.10.1, expires=1465597390512]][IPBan [ip=-1.10.1.1, expires=1465597390516]][IPBan [ip=0.10.10.1, expires=1465597390517]]}]"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test143"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.Server server2 = new tp2.Server();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b8 = server2.connect(iP7);
    java.lang.String str9 = server2.toString();
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b16 = server10.connect(iP15);
    server10.update();
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b24 = server18.connect(iP23);
    boolean b25 = server10.addBan(iP23);
    boolean b26 = server2.addException(iP23);
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b33 = server27.connect(iP32);
    server27.update();
    tp2.Server server35 = new tp2.Server();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b41 = server35.connect(iP40);
    boolean b42 = server27.addBan(iP40);
    server27.update();
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b50 = server44.connect(iP49);
    server44.update();
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b58 = server52.connect(iP57);
    server52.update();
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b66 = server60.connect(iP65);
    boolean b67 = server52.addBan(iP65);
    boolean b68 = server44.addBan(iP65);
    boolean b69 = server27.connect(iP65);
    boolean b70 = server2.removeBan(iP65);
    tp2.ITime iTime71 = null;
    server2.setTime(iTime71);
    tp2.StubTime stubTime73 = new tp2.StubTime();
    server2.setTime((tp2.ITime)stubTime73);
    java.lang.Integer i77 = null;
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, i77, (java.lang.Integer)10);
    boolean b80 = server2.addException(iP79);
    boolean b81 = server0.addException(iP79);
    tp2.IP iP86 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b87 = server0.connect(iP86);
    java.lang.String str88 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + "Server [lastUpdate=1465597330558, exceptions=([10.0.null.10]), bans={}]"+ "'", str88.equals("Server [lastUpdate=1465597330558, exceptions=([10.0.null.10]), bans={}]"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test144"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addBan(iP13);
    server0.update();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b23 = server17.connect(iP22);
    server17.update();
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    server25.update();
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    boolean b40 = server25.addBan(iP38);
    boolean b41 = server17.addBan(iP38);
    boolean b42 = server0.connect(iP38);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)0);
    boolean b48 = server0.removeException(iP47);
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)100);
    boolean b54 = server0.addException(iP53);
    java.lang.String str55 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "Server [lastUpdate=1465597330596, exceptions=([0.-1.10.100]), bans={[IPBan [ip=100.0.10.1, expires=1465597390596]]}]"+ "'", str55.equals("Server [lastUpdate=1465597330596, exceptions=([0.-1.10.100]), bans={[IPBan [ip=100.0.10.1, expires=1465597390596]]}]"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test145"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b20 = server14.connect(iP19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b26 = server14.addBan(iP25);
    boolean b27 = server13.removeException(iP25);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b34 = server28.connect(iP33);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b40 = server28.addBan(iP39);
    boolean b41 = server28.repOK();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b48 = server42.connect(iP47);
    server42.update();
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    server50.update();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server58.connect(iP63);
    boolean b65 = server50.addBan(iP63);
    boolean b66 = server42.addBan(iP63);
    boolean b67 = server28.addException(iP63);
    boolean b68 = server13.addBan(iP63);
    boolean b69 = server0.addException(iP63);
    boolean b70 = server0.repOK();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)100);
    boolean b76 = server0.addException(iP75);
    java.lang.String str77 = server0.toString();
    boolean b78 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "Server [lastUpdate=0, exceptions=([1.-1.100.100][100.0.10.1]), bans={[IPBan [ip=-1.10.1.1, expires=1465597390611]]}]"+ "'", str77.equals("Server [lastUpdate=0, exceptions=([1.-1.100.100][100.0.10.1]), bans={[IPBan [ip=-1.10.1.1, expires=1465597390611]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test146"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test147"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    java.lang.String str8 = server0.toString();
    java.lang.String str9 = server0.toString();
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b16 = server10.connect(iP15);
    server10.update();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b23 = server10.addBan(iP22);
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b30 = server24.connect(iP29);
    java.lang.String str31 = server24.toString();
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b38 = server32.connect(iP37);
    boolean b39 = server24.addException(iP37);
    tp2.Server server40 = new tp2.Server();
    tp2.Server server41 = new tp2.Server();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b47 = server41.connect(iP46);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b53 = server41.addBan(iP52);
    boolean b54 = server40.removeException(iP52);
    boolean b55 = server24.addException(iP52);
    boolean b56 = server10.addBan(iP52);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b62 = server10.connect(iP61);
    java.lang.Integer i65 = null;
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)100, i65, (java.lang.Integer)10);
    boolean b68 = server10.addException(iP67);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b74 = server10.connect(iP73);
    boolean b75 = server0.removeBan(iP73);
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
    boolean b81 = server0.addException(iP80);
    java.lang.Integer i83 = null;
    tp2.IP iP86 = new tp2.IP((java.lang.Integer)0, i83, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b87 = server0.addException(iP86);
    java.lang.String str88 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465597330641, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465597330641, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465597330641, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465597330641, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str31.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + "Server [lastUpdate=1465597330641, exceptions=([0.null.10.1][-1.1.-1.-1]), bans={}]"+ "'", str88.equals("Server [lastUpdate=1465597330641, exceptions=([0.null.10.1][-1.1.-1.-1]), bans={}]"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test148"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b13 = server0.addBan(iP12);
    boolean b14 = server0.repOK();
    server0.update();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    tp2.ITime iTime23 = null;
    server16.setTime(iTime23);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b31 = server25.connect(iP30);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b37 = server25.addBan(iP36);
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b44 = server38.connect(iP43);
    tp2.ITime iTime45 = null;
    server38.setTime(iTime45);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b52 = server38.removeException(iP51);
    tp2.Server server53 = new tp2.Server();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b59 = server53.connect(iP58);
    server53.update();
    tp2.Server server61 = new tp2.Server();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b67 = server61.connect(iP66);
    server61.update();
    tp2.Server server69 = new tp2.Server();
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b75 = server69.connect(iP74);
    boolean b76 = server61.addBan(iP74);
    boolean b77 = server53.addBan(iP74);
    boolean b78 = server38.connect(iP74);
    boolean b79 = server25.removeBan(iP74);
    tp2.IP iP84 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b85 = server25.addBan(iP84);
    tp2.IP iP90 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    boolean b91 = server25.connect(iP90);
    boolean b92 = server16.removeBan(iP90);
    boolean b93 = server0.addBan(iP90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test149"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b14 = server8.connect(iP13);
    boolean b15 = server0.addBan(iP13);
    server0.update();
    server0.update();
    tp2.Server server18 = new tp2.Server();
    tp2.Server server19 = new tp2.Server();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b25 = server19.connect(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b31 = server19.addBan(iP30);
    boolean b32 = server18.removeException(iP30);
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b39 = server33.connect(iP38);
    tp2.ITime iTime40 = null;
    server33.setTime(iTime40);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b47 = server33.removeException(iP46);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b53 = server33.removeException(iP52);
    boolean b54 = server18.addException(iP52);
    boolean b55 = server0.removeBan(iP52);
    boolean b56 = server0.repOK();
    server0.update();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server58.connect(iP63);
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b70 = server58.addBan(iP69);
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b76 = server58.removeException(iP75);
    java.lang.Integer i79 = null;
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)100, i79, (java.lang.Integer)10);
    boolean b82 = server58.removeException(iP81);
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)0);
    boolean b88 = server58.removeBan(iP87);
    boolean b89 = server0.removeBan(iP87);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test150"); }


    java.lang.Integer i1 = null;
    tp2.IP iP4 = new tp2.IP((java.lang.Integer)10, i1, (java.lang.Integer)(-1), (java.lang.Integer)1);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test151"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b12 = server0.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b19 = server13.connect(iP18);
    tp2.ITime iTime20 = null;
    server13.setTime(iTime20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b27 = server13.removeException(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b34 = server28.connect(iP33);
    server28.update();
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b42 = server36.connect(iP41);
    server36.update();
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b50 = server44.connect(iP49);
    boolean b51 = server36.addBan(iP49);
    boolean b52 = server28.addBan(iP49);
    boolean b53 = server13.connect(iP49);
    boolean b54 = server0.removeBan(iP49);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b60 = server0.addBan(iP59);
    java.lang.Integer i64 = null;
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)100, i64);
    boolean b66 = server0.addException(iP65);
    tp2.Server server67 = new tp2.Server();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b73 = server67.connect(iP72);
    server67.update();
    tp2.Server server75 = new tp2.Server();
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b81 = server75.connect(iP80);
    server75.update();
    tp2.Server server83 = new tp2.Server();
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b89 = server83.connect(iP88);
    boolean b90 = server75.addBan(iP88);
    boolean b91 = server67.addBan(iP88);
    boolean b92 = server0.addBan(iP88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test152"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    boolean b8 = server0.repOK();
    boolean b9 = server0.repOK();
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b16 = server10.connect(iP15);
    server10.update();
    java.lang.String str18 = server10.toString();
    java.lang.String str19 = server10.toString();
    java.lang.String str20 = server10.toString();
    boolean b21 = server10.repOK();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b28 = server22.connect(iP27);
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b35 = server29.connect(iP34);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b41 = server29.addBan(iP40);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b47 = server29.removeException(iP46);
    boolean b48 = server22.addException(iP46);
    java.lang.String str49 = server22.toString();
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b56 = server50.connect(iP55);
    server50.update();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b64 = server58.connect(iP63);
    boolean b65 = server50.addBan(iP63);
    boolean b66 = server50.repOK();
    tp2.Server server67 = new tp2.Server();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b73 = server67.connect(iP72);
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b79 = server67.addBan(iP78);
    boolean b80 = server50.connect(iP78);
    boolean b81 = server22.removeException(iP78);
    boolean b82 = server10.addException(iP78);
    boolean b83 = server0.removeBan(iP78);
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    boolean b89 = server0.removeException(iP88);
    java.lang.String str90 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Server [lastUpdate=1465597330791, exceptions=(), bans={}]"+ "'", str18.equals("Server [lastUpdate=1465597330791, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Server [lastUpdate=1465597330791, exceptions=(), bans={}]"+ "'", str19.equals("Server [lastUpdate=1465597330791, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Server [lastUpdate=1465597330791, exceptions=(), bans={}]"+ "'", str20.equals("Server [lastUpdate=1465597330791, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "Server [lastUpdate=0, exceptions=([-1.10.1.1]), bans={}]"+ "'", str49.equals("Server [lastUpdate=0, exceptions=([-1.10.1.1]), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str90.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","tp2Test1.test153"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b6 = server0.connect(iP5);
    server0.update();
    java.lang.String str8 = server0.toString();
    tp2.Server server9 = new tp2.Server();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b15 = server9.connect(iP14);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b22 = server16.connect(iP21);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b28 = server16.addBan(iP27);
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
    boolean b34 = server16.removeException(iP33);
    boolean b35 = server9.addException(iP33);
    boolean b36 = server0.removeException(iP33);
    boolean b37 = server0.repOK();
    java.lang.Integer i41 = null;
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)0, i41);
    boolean b43 = server0.addBan(iP42);
    java.lang.String str44 = server0.toString();
    java.lang.String str45 = server0.toString();
    server0.update();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    boolean b52 = server0.connect(iP51);
    java.lang.String str53 = server0.toString();
    tp2.Server server54 = new tp2.Server();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b60 = server54.connect(iP59);
    tp2.ITime iTime61 = null;
    server54.setTime(iTime61);
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    boolean b68 = server54.removeException(iP67);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)0);
    boolean b74 = server54.removeException(iP73);
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    boolean b80 = server54.connect(iP79);
    boolean b81 = server0.connect(iP79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465597330823, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465597330823, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Server [lastUpdate=1465597330823, exceptions=(), bans={[IPBan [ip=10.100.0.null, expires=1465597390824]]}]"+ "'", str44.equals("Server [lastUpdate=1465597330823, exceptions=(), bans={[IPBan [ip=10.100.0.null, expires=1465597390824]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Server [lastUpdate=1465597330823, exceptions=(), bans={[IPBan [ip=10.100.0.null, expires=1465597390824]]}]"+ "'", str45.equals("Server [lastUpdate=1465597330823, exceptions=(), bans={[IPBan [ip=10.100.0.null, expires=1465597390824]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Server [lastUpdate=1465597330825, exceptions=(), bans={[IPBan [ip=10.100.0.null, expires=1465597390824]]}]"+ "'", str53.equals("Server [lastUpdate=1465597330825, exceptions=(), bans={[IPBan [ip=10.100.0.null, expires=1465597390824]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);

  }

}
