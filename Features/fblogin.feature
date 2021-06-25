@userfacebooklogin
Feature: User want to sigin  from facebook

In order to login from account
As a register user
I want to enter E-Mail Address, password, and click  to login


@Sazib
Scenario Outline: Positive sigin with valid E-Mail Address and Password

Given user launch facebook url
And user enter "<E-Mail Address>" and "<password>"
When user click on login button


Examples:

| E-Mail Address|password|
| mohammad.jahan@nexttechitc.com|Nexttech@12341|
