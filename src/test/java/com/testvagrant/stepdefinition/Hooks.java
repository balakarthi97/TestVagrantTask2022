package com.testvagrant.stepdefinition;

import java.io.IOException;

import com.testvagrant.resources.CommonHelper;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonHelper{
	
	CommonHelper chobj = new CommonHelper();
	
	@Before("@imdb")
	public void beforeScenario1 () throws InterruptedException, IOException {
		chobj.launch(chobj.propertiesFile("URL1"));
	}
	
	@Before("@wiki")
	public void beforeScenario2 () throws InterruptedException, IOException {
		chobj.launch(chobj.propertiesFile("URL2"));
	}
	
	
	@After 
	public void afterScenario () {
		chobj.quit();
	}
}
