$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/GMO_PO.feature");
formatter.feature({
  "name": "Test GMO Post",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Enter GMO OnLine site",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@GMOHome"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on GMO home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefinitions.i_am_on_GMO_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Enter GMO site",
  "keyword": "When "
});
formatter.match({
  "location": "StepsDefinitions.i_Enter_GMO_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Catalog page displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefinitions.i_should_see_Catalog_page_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Order an item from the catalog displayed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Catalog"
    }
  ]
});
formatter.step({
  "name": "I am on Catalog page",
  "keyword": "Given "
});
formatter.step({
  "name": "I order \"\u003corderQty\u003e\" for item \"\u003citemDesc\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should see quantity for \"\u003citemDesc\u003e\" equals \"\u003corderQty\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "orderQty",
        "itemDesc"
      ]
    },
    {
      "cells": [
        "10",
        "Hiking Boots"
      ]
    },
    {
      "cells": [
        "4",
        "3 Person Dome Tent"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Order an item from the catalog displayed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Catalog"
    }
  ]
});
formatter.step({
  "name": "I am on Catalog page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefinitions.i_am_on_Catalog_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I order \"10\" for item \"Hiking Boots\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepsDefinitions.i_order_for_item(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see quantity for \"Hiking Boots\" equals \"10\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefinitions.i_should_see_quantity_for_equals(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Order an item from the catalog displayed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Catalog"
    }
  ]
});
formatter.step({
  "name": "I am on Catalog page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefinitions.i_am_on_Catalog_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I order \"4\" for item \"3 Person Dome Tent\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepsDefinitions.i_order_for_item(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see quantity for \"3 Person Dome Tent\" equals \"4\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefinitions.i_should_see_quantity_for_equals(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Closed driver",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CloseBroser"
    }
  ]
});
formatter.step({
  "name": "Closed the driver",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefinitions.closed_the_driver()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});