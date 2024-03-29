package com.example.mytest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowWebView;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import android.os.Build;
import android.widget.EditText;

import com.example.mytest.Activities.LoginActivity;


public class LoginActivityUnitTest {

    private LoginActivity loginActivity;

    @Before
    public void setUp() throws Exception {
        loginActivity = Robolectric.buildActivity(LoginActivity.class).create().get();
    }







    @Test
    public void testValidateData_WithValidInput() {
        EditText emailEditText = loginActivity.findViewById(R.id.email);
        EditText passEditText = loginActivity.findViewById(R.id.password);

        emailEditText.setText("validemail@example.com");
        passEditText.setText("validPassword");

        assertTrue(loginActivity.validateData());
    }

    @Test
    public void testValidateData_WithInvalidEmail() {
        EditText emailEditText = loginActivity.findViewById(R.id.email);
        EditText passEditText = loginActivity.findViewById(R.id.password);

        emailEditText.setText("invalidemail");
        passEditText.setText("validPassword");

        assertFalse(loginActivity.validateData());
    }

    @Test
    public void testValidateData_WithEmptyPassword() {
        EditText emailEditText = loginActivity.findViewById(R.id.email);
        EditText passEditText = loginActivity.findViewById(R.id.password);

        emailEditText.setText("validemail@example.com");
        passEditText.setText("");

        assertFalse(loginActivity.validateData());
    }

    // Add more test cases as needed for other scenarios

    @Test
    public void testGoogleSignIn() {
        // Test Google sign-in functionality here
    }
//
//    // Add more tests for other methods such as login, firebaseAuthWithGoogle, etc.
}