@soap
Feature:  Soap API
  @soaprestassured
  Scenario: SOAP API with restassured
    Given Send restassured request
#    When post is "/webservicesserver/NumberConversion.wso"
#    Then extra response
  @soapSerenityRest
  Scenario: SOAP API with SerenityRest
    Given Send SerenityRest request
#    When post is "/webservicesserver/NumberConversion.wso"
    Then extra response

    @xml
    Scenario: xml
      Given real xml file and replace
