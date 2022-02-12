$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("worldPopulation.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Find how many we are",
  "description": "",
  "id": ";find-how-many-we-are",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "go to webpage, find how many people we are",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});