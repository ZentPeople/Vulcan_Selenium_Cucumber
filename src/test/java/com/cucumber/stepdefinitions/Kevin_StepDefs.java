package com.cucumber.stepdefinitions;

import java.util.Hashtable;

import org.apache.log4j.Logger;

import com.cucumber.helper.UserActions;

public class Kevin_StepDefs {

	private static Logger Log = Logger.getLogger(UserActions.class.getName());

	UserActions User;
	Hashtable<String,String> Data;

	public Kevin_StepDefs(UserActions User) {
		this.User = User;
	}
}
