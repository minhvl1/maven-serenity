# maven-serenity

## Sernity + Junit + POM pattern

![image](https://user-images.githubusercontent.com/67543695/205447971-c74bfaf3-7b64-405f-863a-0c2c24ced4c8.png)

![image](https://user-images.githubusercontent.com/67543695/205447960-80fcba0b-b2be-4c73-86ee-22124327cd1d.png)

![image](https://user-images.githubusercontent.com/67543695/205450533-70b22ec0-1dc7-4714-a840-0b54f3c4b652.png)

## Run Testcases
1. Config browser in serenity.properties

![image](https://user-images.githubusercontent.com/67543695/215641544-37012d9d-ba31-471e-aa04-21163a134291.png)

2. Run by command line: disable all properties in serenity.properties
   
   - Default 
     - `mvn clean verify`
   - Run with tags: @screenplay and @sit
     - `mvn clean verify -D"cucumber.filter.tags=@screenplay or @sit"`
   - Run with specific browser: chrome
     - `mvn clean verify -D"webdriver.driver=chrome" -D"headless.mode = true"`
