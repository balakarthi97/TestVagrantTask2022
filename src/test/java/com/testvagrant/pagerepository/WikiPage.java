package com.testvagrant.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testvagrant.resources.CommonHelper;

public class WikiPage extends CommonHelper{
	
	public WebElement getWikiSearchBox() {
		return wikiSearchBox;
	}

	public WebElement getDateModule() {
		return dateModule;
	}

	public WebElement getRegionModule() {
		return regionModule;
	}

	public WikiPage(){
		PageFactory.initElements (driver, this); 
		}
		 
		@FindBy(xpath = "//input [@id = 'searchInput']")
		private WebElement wikiSearchBox;
		
		@FindBy(xpath = "(//div [@class = 'plainlist'])[4]")
		private WebElement dateModule;
		
		@FindBy(xpath = "(//td[@class = 'infobox-data'])[12]")
		private WebElement regionModule;

}
