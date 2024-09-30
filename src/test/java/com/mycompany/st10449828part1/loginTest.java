/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.st10449828part1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Bless
 */
public class loginTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
    
       /**
     * Test of getName method, of class Login.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        login instance = new login();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Login.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        login instance = new login();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getsurname method, of class Login.
     */
    @Test
    public void testGetsurname() {
        System.out.println("getsurname");
        login instance = new login();
        String expResult = "";
        String result = instance.getsurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setsurname method, of class Login.
     */
    @Test
    public void testSetsurname() {
        System.out.println("setsurname");
        String lastname = "";
        login instance = new login();
        instance.setsurname(lastname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class Login.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        login instance = new login();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Login.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String initialUsername = "";
        login instance = new login();
        instance.setUsername(initialUsername);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Login.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        login instance = new login();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Login.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String initialPassword = "";
        login instance = new login();
        instance.setPassword(initialPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getfinalUsername method, of class Login.
     */
    @Test
    public void testGetfinalUsername() {
        System.out.println("getfinalUsername");
        login instance = new login();
        String expResult = "";
        String result = instance.getfinalUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setfinalUsername method, of class Login.
     */
    @Test
    public void testSetfinalUsername() {
        System.out.println("setfinalUsername");
        String finalUserName = "";
        login instance = new login();
        instance.setfinalUsername(finalUserName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getfinalPassword method, of class Login.
     */
    @Test
    public void testGetfinalPassword() {
        System.out.println("getfinalPassword");
        login instance = new login();
        String expResult = "";
        String result = instance.getfinalPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoginPassword method, of class Login.
     */
    @Test
    public void testSetLoginPassword() {
        System.out.println("setLoginPassword");
        String finalpassWord = "";
        login instance = new login();
        instance.setLoginPassword(finalpassWord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String initialUsername = "";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.checkUserName(initialUsername);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String initialPassword = "";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(initialPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String initialUsername = "";
        String initialPassword = "";
        login instance = new login();
        String expResult = "";
        String result = instance.registerUser(initialUsername, initialPassword);
        assertEquals(expResult, result);
        // TODO Review the generated test code and eliminate the default fail call
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String finalUserName = "";
        String finalpassWord = "";
        String initialUsername = "";
        String initialPassword = "";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.loginUser(finalUserName, finalpassWord, initialUsername, initialPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String finalUserName = "Bl_";
        String finalpassWord = "Blessing@123";
        String initialUsername = "BL_";
        String initialPassword = "Blessing@123";
        login instance = new login();
        String expResult = "";
        String result = instance.returnLoginStatus(finalUserName, finalpassWord, initialUsername, initialPassword);
        assertEquals(expResult, result);
        // TODO Examine the generated test code and delete the default fail call.
       // fail("The test case is a prototype.");
    }
    
}
