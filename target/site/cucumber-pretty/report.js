$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/account.feature");
formatter.feature({
  "line": 1,
  "name": "My Account Page",
  "description": "",
  "id": "my-account-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5521332023,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Able to log in to my account",
  "description": "",
  "id": "my-account-page;able-to-log-in-to-my-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate to Home Depot",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on my account",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I entred my Credentials",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should see My account Info",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeDepot.iNavigateToHomeDepot()"
});
formatter.result({
  "duration": 13640621399,
  "status": "passed"
});
formatter.match({
  "location": "HomeDepot.iClickOnMyAccount()"
});
formatter.result({
  "duration": 1091898138,
  "status": "passed"
});
formatter.match({
  "location": "HomeDepot.iEntredMyCredentials()"
});
formatter.result({
  "duration": 3583867438,
  "status": "passed"
});
formatter.match({
  "location": "HomeDepot.iShouldSeeMyAccountInfo()"
});
formatter.result({
  "duration": 552775282,
  "status": "passed"
});
formatter.after({
  "duration": 1442949033,
  "status": "passed"
});
});