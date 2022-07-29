package com.testvagrant.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testvagrant.resources.CommonHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ImdbPage extends CommonHelper{
	
	public ImdbPage(){
		PageFactory.initElements (driver, this); 
		}
		 
		@FindBy(id = "suggestion-search")
		private WebElement imdbSearchBox;
		
		@FindBy(xpath = "//a[contains(text(),'Part 1')]")
		private WebElement clickMovieName;
		
		@FindBy(xpath = "//h3[contains (text(),'Box office')]")
		private WebElement scrollDownImdb;
		
		@FindBy(xpath = "//a[contains (text(),  'January')]")
		private WebElement date;
		
		@FindBy(xpath = "(//a[contains (text(),  'India')])[1]")
		private WebElement region;

		public WebElement getImdbSearchBox() {
			return imdbSearchBox;
		}

		public WebElement getclickMovieName() {
			return clickMovieName;
		}

		public WebElement getScrollDownImdb() {
			return scrollDownImdb;
		}

		public WebElement getDateModule() {
			return date;
		}

		public WebElement getRegionModule() {
			return region;
		}
		
		

		

}
