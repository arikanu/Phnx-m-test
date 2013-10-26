package com.phoenix.android.activity.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;

import com.phoenix.android.activity.LoginActivity;

public class LoginActivityTest extends ActivityInstrumentationTestCase2<LoginActivity> {
	private static final String VALID_USERNAME = "test";
	private static final String VALID_PASSWORD = "1";
	private static final String INVALID_USERNAME = "mahmut";
	private static final String INVALID_PASSWORD = "maðara";
	
	private LoginActivity activity;
	private EditText usernameET;
	private EditText passwordET;
	private Button loginBtn;
	
	public LoginActivityTest() {
		super("com.phoenix.android.activity", LoginActivity.class);
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		activity = getActivity();
	}
	
	public void testValidLogin(){
		assertTrue(true);
	}
	public void testUsernameEmptyLogin(){
		assertTrue(false);
	}
	public void testPasswordEmptyLogin(){
		assertTrue(false);
	}
	public void testInvalidLogin(){
		assertTrue(false);
	}
	
}
