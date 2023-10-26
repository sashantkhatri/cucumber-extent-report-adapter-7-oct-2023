## cucumber-extent-report-adapter-7-oct-2023
This is a demo repository to integration extentreports-cucumber7-adapter with cucumber framework. In this repo we have used cucumber and testng. This repo only supports chrome browser.

1. src/test/resources/extent.properties -> is used for setting up properties of extent report.
2. src/test/resources/spark-config.xml -> is used for configure the extent report format.

# To run the test we can use following command:

1. mvn clean test
2. mvn clean test -Dheadless=true