@feature
Feature: Login Web Sentinel Feature

  Scenario: User Want To Login Web
    Given Open Website Sentinel
    When User input username "kraken" and password "kraken"
    Then User success to login