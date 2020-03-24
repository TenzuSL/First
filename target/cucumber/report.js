$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/Practise.feature");
formatter.feature({
  "line": 1,
  "name": "Practise",
  "description": "",
  "id": "practise",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10321435300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "search and validate",
  "description": "",
  "id": "practise;search-and-validate",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Newtest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "land in greenkart",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "select \"cucumber\" and select count as \"5\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "add product to cart and checkout",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "validate the selected item",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.land_in_greenkart()"
});
formatter.result({
  "duration": 3830271900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cucumber",
      "offset": 8
    },
    {
      "val": "5",
      "offset": 39
    }
  ],
  "location": "stepdefinition.select_something_and_select_count_as_something(String,String)"
});
formatter.result({
  "duration": 5555194500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.add_product_to_cart_and_checkout()"
});
formatter.result({
  "duration": 15253636100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.validate_the_selected_item()"
});
formatter.result({
  "duration": 54227000,
  "status": "passed"
});
formatter.after({
  "duration": 721101400,
  "status": "passed"
});
});