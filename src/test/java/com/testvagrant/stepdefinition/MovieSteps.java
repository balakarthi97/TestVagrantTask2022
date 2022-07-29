package com.testvagrant.stepdefinition;

import com.testvagrant.pagerepository.ImdbPage;
import com.testvagrant.pagerepository.WikiPage;
import com.testvagrant.resources.CommonHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MovieSteps extends CommonHelper{
	
	CommonHelper commonActions = new CommonHelper();
	ImdbPage imdbPage = new ImdbPage();
	WikiPage wikiPediaPage = new WikiPage();

	
	  @Given("^Verify user is on imdp page$")
	    public void user_is_on_imdp_page() throws Throwable {
		  commonActions.assertValidate(commonActions.getCurrentUrl(), commonActions.propertiesFile("URL1"));
		  System.out.println();
	    }

	    @When("^Search movie name and click pushpa$")
	    public void search_movie_name_and_click_pushpa() throws Throwable {
	    	commonActions.sendKeys(imdbPage.getImdbSearchBox(), commonActions.propertiesFile("MovieName"));
	    	commonActions.click(imdbPage.getclickMovieName());
	    }

	    @And("^scrolldown imdb page to get movie name and date$")
	    public void scrolldown_imdb_page_to_get_movie_name_and_date() throws Throwable {
	    	commonActions.scrollDown(imdbPage.getScrollDownImdb());
	    	actualMovieNameInIMDB = commonActions.getText(imdbPage.getDateModule());
	    	actualRegionNameInIMDB = commonActions.getText(imdbPage.getRegionModule());
	    }
	    
	    @Given("^Verify user is on wikipedia page$")
	    public void user_is_on_wikipedia_page() throws Throwable {
	    	commonActions.assertValidate(commonActions.getCurrentUrl(), commonActions.propertiesFile("URL2"));
	    }
	    
	    @When("^Search movie name on wikipedia$")
	    public void search_movie_name_on_wikipedia() throws Throwable {
	    	commonActions.sendKeys(wikiPediaPage.getWikiSearchBox(), commonActions.propertiesFile("MovieName"));
	    }

	    @And("^scrolldown wikipedia page to get movie name and date$")
	    public void scrolldown_wikipedia_page_to_get_movie_name_and_date() throws Throwable {
	    	commonActions.scrollDown(wikiPediaPage.getDateModule());
	    	actualMovieNameInWikipedia = commonActions.getText(wikiPediaPage.getDateModule());
	    	actualRegionNameInWikipedia=commonActions.getText(wikiPediaPage.getRegionModule());
	    }
	    
	    @Then("^validate the imdb text with wikipedia$")
	    public void validate_the_imdb_text_with_wikipedia() throws Throwable {
	    	commonActions.assertValidate(actualMovieNameInIMDB, actualMovieNameInWikipedia);
	    	commonActions.assertValidate(actualRegionNameInIMDB, actualRegionNameInWikipedia);
	    }
	    
	    @Then("^close the browser$")
	    public void close_the_browser() throws Throwable {
	    	commonActions.quit();
	    }
}
