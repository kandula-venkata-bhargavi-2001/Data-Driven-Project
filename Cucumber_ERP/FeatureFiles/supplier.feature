@tag
Feature:  
As Admin user i want user supplier module

@supplier
Scenario Outline:
I want to add supplier with multiple data.

Given launch browser "<browser>"
When Launch url
When Wait for username with "name" and "username" and "10"
When Enter username with "name" and "username" and "admin"
When Enter password with "xpath" and "//input[@id='password']" and "master"
When click login button with "xpath" and "//button[@id='btnsubmit']"
When wait for Supplier link "xpath" and "(//a[contains(text(),'Suppliers')])[2]" and "10"
When click Supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When wait  for AddIcon with "xpath"  and "(//span[@data-caption='Add'])[1]" and "10"
When click Addicon button with "xpath" and "(//span[@data-caption='Add'])[1]" 
When wait for supplier number with "name" and "x_Supplier_Number" and "10"
When Capture supplier number with "name" and "x_Supplier_Number"
When Enter in "<suppliername>" with "name" and "x_Supplier_Name"
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']"
When Enter in "<city>" with "xpath" and "//*[@id='x_City']"
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']"
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']"
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']"
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']"
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']"
When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']"
When click Add button with "id" and "btnAction"
When for ConfirmOk button with "xpath" and "//button[text()='OK!']" and "10"
When click confirm ok button with "xpath" and "//button[text()='OK!']"
When wait for Alert ok button with "xpath" and "(//button[text()='OK'])[6]" and "10"
When click Alert ok button with "xpath" and "(//button[text()='OK'])[6]"
When verify supplierNumber
When click logout link with "xpath" and "//a[text()='Logout']"
When close browser

Examples:

|browser|suppliername|address|city|country|cperson|pnumber|mail|mnumber|note|
|chrome|Testing1|Ameerpet1|Hyderabad|India|Qedgetech|5678904563|test@gmail.com|9876543210|i am new Supplier|

@customer
Scenario Outline:
Validate Customer with Multiple data

Given launch browser "<browser>"
When Launch url
When Wait for username with "name" and "username" and "10"
When Enter username with "name" and "username" and "admin"
When Enter password with "xpath" and "//input[@id='password']" and "master"
When click login button with "xpath" and "//button[@id='btnsubmit']"
When wait for Customer link "xpath" and "(//a[starts-with(text(),'Customers')])[2]" and "10"
When click Customer link with "xpath" and "(//a[starts-with(text(),'Customers')])[2]"
When wait  for AddIcon with "xpath"  and "(//span[@data-caption='Add'])[1]" and "10"
When click Addicon button with "xpath" and "(//span[@data-caption='Add'])[1]" 
When wait for Customer number with "name" and "x_Customer_Number" and "10"
When Capture Customer number with "name" and "x_Customer_Number"
When Enter in "<customername>" with "name" and "x_Customer_Name"
When Enter in "<address>" with "xpath" and "//textarea[@id='x_Address']"
When Enter in "<city>" with "xpath" and "//input[@id='x_City']"
When Enter in "<country>" with "xpath" and "//input[@id='x_Country']"
When Enter in "<cperson>" with "xpath" and "//input[@id='x_Contact_Person']"
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']"
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']"
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']"
When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']"
When click Add button with "id" and "btnAction"
When for ConfirmOk button with "xpath" and "//button[normalize-space()='OK!']" and "10"
When click confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When wait for Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]" and "10"
When click Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When verify CustomerNumber
When click logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When close browser

Examples:
|browser|customername|address|city|country|cperson|pnumber|mail|mnumber|note|
|chrome|Testing3|Kothapalli|kadapa|India|Qedge|9876543210|testng@gmail.com|1234567890|i am new customer|



