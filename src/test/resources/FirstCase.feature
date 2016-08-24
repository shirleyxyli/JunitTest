@Calculator
Feature: 测试加减乘除
  
  Scenario: 两个数相加
    Given 输入第一个数字20
    And 输入第二个数字40
    When 两个数进行相加
    Then 得出的结果60