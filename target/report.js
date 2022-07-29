$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/TaskSteps.feature");
formatter.feature({
  "name": "Find movie release date and location",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "IMDB",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@imdb"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Verify user is on imdp page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.testvagrant.stepdefinition.MovieSteps.user_is_on_imdp_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search movie name and click pushpa",
  "keyword": "When "
});
formatter.match({
  "location": "com.testvagrant.stepdefinition.MovieSteps.search_movie_name_and_click_pushpa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "scrolldown imdb page to get movie name and date",
  "keyword": "And "
});
formatter.match({
  "location": "com.testvagrant.stepdefinition.MovieSteps.scrolldown_imdb_page_to_get_movie_name_and_date()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "WIKI",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wiki"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Verify user is on wikipedia page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.testvagrant.stepdefinition.MovieSteps.user_is_on_wikipedia_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search movie name on wikipedia",
  "keyword": "When "
});
formatter.match({
  "location": "com.testvagrant.stepdefinition.MovieSteps.search_movie_name_on_wikipedia()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "scrolldown wikipedia page to get movie name and date",
  "keyword": "And "
});
formatter.match({
  "location": "com.testvagrant.stepdefinition.MovieSteps.scrolldown_wikipedia_page_to_get_movie_name_and_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the imdb text with wikipedia",
  "keyword": "Then "
});
formatter.match({
  "location": "com.testvagrant.stepdefinition.MovieSteps.validate_the_imdb_text_with_wikipedia()"
});
formatter.result({
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[January 7, 2022 (United States)]\u003e but was:\u003c[17 December 2021]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat com.testvagrant.resources.CommonHelper.assertValidate(CommonHelper.java:61)\r\n\tat com.testvagrant.stepdefinition.MovieSteps.validate_the_imdb_text_with_wikipedia(MovieSteps.java:57)\r\n\tat ✽.validate the imdb text with wikipedia(file:///C:/Users/Bala%20karthi/eclipse-workspace/TestVagrant-Task/src/test/resources/Features/TaskSteps.feature:17)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});