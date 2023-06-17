$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Verify_In_Etsy_Jwellery_Wine_Is_Displayed.feature");
formatter.feature({
  "name": "Verify In Etsy Wine is displayed",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify wine is displayed",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in etsy home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Verify_In_Etsy_Jwellery_Wine_Is_Displayed.i_am_in_etsy_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I hover on Wedding \u0026 Party",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Verify_In_Etsy_Jwellery_Wine_Is_Displayed.i_hover_on_Wedding_Party()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I hover on Wedding jewellery",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Verify_In_Etsy_Jwellery_Wine_Is_Displayed.i_hover_on_Wedding_jewellery()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on jewllery set",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Verify_In_Etsy_Jwellery_Wine_Is_Displayed.i_click_on_jewllery_set()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will see \"wine\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Verify_In_Etsy_Jwellery_Wine_Is_Displayed.i_will_see(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});