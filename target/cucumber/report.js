$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Application Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Home page  valid Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FavTest"
    }
  ]
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on the Login option and enters valid \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "HomePage is displayed with \"Hi, Demo User\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "user@phptravels.com",
        "demouser"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Home page  valid Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FavTest"
    }
  ]
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Login option and enters valid user@phptravels.com and demouser",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.user_clicks_on_the_login_option_and_enters_valid_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "HomePage is displayed with \"Hi, Demo User\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.homepage_is_displayed_with_something(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});