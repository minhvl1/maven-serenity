@FeatureAPI
Feature: Demo API

  @getMethodApi
  Scenario: test get api
    Given send get method with id="1"
    When show get response body
    Then Status code is "200"

  @postMethodApi
  Scenario: test post api
    Given send post method
    When show post response body
    Then Status code post is "201"
