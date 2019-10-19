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
        "malii5@gmail.com",
        "123456789"
      ]
    },
    {
      "cells": [
        "Ahmed",
        "Khaled",
        "akt5@gmail.com",
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
  "name": "I entered \"Mohamed\", \"Ali\", \"malii5@gmail.com\", \"123456789\"",
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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".result\"}\n  (Session info: chrome\u003d77.0.3865.120)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-TO67BV2\u0027, ip: \u0027192.168.14.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.120, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: C:\\Users\\kaiba\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:3754}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d6a4cf5002b7c9522680b1f800d8a602\n*** Element info: {Using\u003dclass name, value\u003dresult}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:412)\r\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:389)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy24.getText(Unknown Source)\r\n\tat steps.UserRegistration.the_registration_page_displays_successfully(UserRegistration.java:44)\r\n\tat ✽.The registration page displays successfully(file:src/test/java/features/UserRegisteration.feature:14)\r\n",
  "status": "failed"
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
  "name": "I entered \"Ahmed\", \"Khaled\", \"akt5@gmail.com\", \"123456789\"",
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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".result\"}\n  (Session info: chrome\u003d77.0.3865.120)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-TO67BV2\u0027, ip: \u0027192.168.14.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.120, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: C:\\Users\\kaiba\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:3754}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d6a4cf5002b7c9522680b1f800d8a602\n*** Element info: {Using\u003dclass name, value\u003dresult}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:412)\r\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:389)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy24.getText(Unknown Source)\r\n\tat steps.UserRegistration.the_registration_page_displays_successfully(UserRegistration.java:44)\r\n\tat ✽.The registration page displays successfully(file:src/test/java/features/UserRegisteration.feature:14)\r\n",
  "status": "failed"
});
});