package org.coursera.sustainableapps.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    /**
     * test requirements for step 8
     */
    @Test
    public void checkEmailTest(){
        LoginActivity act= new LoginActivity();
        assertEquals("Login success", act.checkEmail("sdds@gmail.com"));
    }
    @Test
    public void checkPasswordTest(){
        LoginActivity act= new LoginActivity();
        assertEquals("Login success", act.checkPassword("wdagregwagrwgr"));
    }



}