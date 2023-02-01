# maven-serenity

## Sernity + Junit + POM pattern

![image](https://user-images.githubusercontent.com/67543695/215646466-eeb4a1e5-47e9-429a-baa5-3cb3b5f3e7cc.png)

![image](https://user-images.githubusercontent.com/67543695/215646713-3835c234-88fc-4fed-8c08-a65d035a96f4.png)

![image](https://user-images.githubusercontent.com/67543695/215647495-2412156c-5bb0-43e8-b62e-dcf9e7c140a0.png)

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
    
3. Run by Jenkins

![image](https://user-images.githubusercontent.com/67543695/215655547-24998b16-d919-4a98-8fb1-113c4953b1db.png)

![image](https://user-images.githubusercontent.com/67543695/215983258-bcadea19-14e1-4a4d-8aeb-fc9a967a9ccd.png)
