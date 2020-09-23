$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/I_StyleMaterialUpdate.feature");
formatter.feature({
  "name": "Style and Material Sample validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Selenium"
    },
    {
      "name": "@Sample"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Material Sample Creation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Jenkins3"
    }
  ]
});
formatter.step({
  "name": "User launches centric application",
  "keyword": "Given "
});
formatter.step({
  "name": "Go to homepage",
  "keyword": "Then "
});
formatter.step({
  "name": "verify user screen",
  "keyword": "And "
});
formatter.step({
  "name": "User creates material sample combination \"\u003cMaterialSample\u003e\",\"\u003cMaterial\u003e\",\"\u003cDimensionA\u003e\",\"\u003cDimensionB\u003e\",\"\u003cCode\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Code",
        "Material",
        "MaterialSample",
        "DimensionA",
        "DimensionB"
      ]
    },
    {
      "cells": [
        "123",
        "Material - Proto",
        "Jeans Sample - Material",
        "Colors",
        "Sample per active color"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Material Sample Creation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Selenium"
    },
    {
      "name": "@Sample"
    },
    {
      "name": "@Jenkins3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches centric application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_launches_centric_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.go_to_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user screen",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.verify_user_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User creates material sample combination \"Jeans Sample - Material\",\"Material - Proto\",\"Colors\",\"Sample per active color\",\"123\"",
  "keyword": "And "
});
formatter.match({
  "location": "StyleMaterialSamplePageSteps.user_creates_material_sample_combination(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});