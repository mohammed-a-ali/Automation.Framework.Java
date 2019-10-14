$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/UserRegisteration.feature");
formatter.feature({
  "name": "User Registration",
  "description": "  I want to check that the user can register in our ECommerce website",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User Registration",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "UserRegistration.the_user_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on register link",
  "keyword": "When "
});
formatter.match({
  "location": "UserRegistration.i_click_on_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I entered the user data",
  "keyword": "And "
});
formatter.match({
  "location": "UserRegistration.i_entered_the_user_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The registration page displays successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistration.the_registration_page_displays_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User Registration",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "name": "I entered \"\u003cfirstName\u003e\", \"\u003clastName\u003e\", \"\u003cemail\u003e\", \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "The registration page displays successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "Mohamed",
        "Ali",
        "malii3@gmail.com",
        "123456789"
      ]
    },
    {
      "cells": [
        "Ahmed",
        "Khaled",
        "akt3@gmail.com",
        "123456789"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Registration",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "UserRegistration.the_user_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on register link",
  "keyword": "When "
});
formatter.match({
  "location": "UserRegistration.i_click_on_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I entered \"Mohamed\", \"Ali\", \"malii3@gmail.com\", \"123456789\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserRegistration.iEntered(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The registration page displays successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistration.the_registration_page_displays_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Registration",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "UserRegistration.the_user_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on register link",
  "keyword": "When "
});
formatter.match({
  "location": "UserRegistration.i_click_on_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I entered \"Ahmed\", \"Khaled\", \"akt3@gmail.com\", \"123456789\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserRegistration.iEntered(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The registration page displays successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistration.the_registration_page_displays_successfully()"
});
formatter.result({
  "status": "passed"
});
});