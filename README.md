# maven-serenity

## Sernity + Junit + POM pattern

![image](https://user-images.githubusercontent.com/67543695/215646466-eeb4a1e5-47e9-429a-baa5-3cb3b5f3e7cc.png)

![image](https://user-images.githubusercontent.com/67543695/215646713-3835c234-88fc-4fed-8c08-a65d035a96f4.png)

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
