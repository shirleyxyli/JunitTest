@Calculator
  Feature: 百度首页搜索功能

    Scenario: 打开百度进行搜索
      Given 打开百度首页
      When 输入google进行搜索
      Then 搜索页面包含google
