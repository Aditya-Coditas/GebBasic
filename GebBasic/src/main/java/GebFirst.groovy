package main.java

import geb.Browser
 import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","/home/coditas/Downloads/chromedriver_linux64/chromedriver")
def browser
browser = new Browser(driver: new ChromeDriver())
browser.go("http://www.webdriveruniversity.com/Contact-Us/contactus.html")
browser.$("input[name='first_name']")<<"Aditya"
browser.$("input[name='last_name']").value "Botre"
browser.$("input[name='email']").value("aditya.botre@coditas.com")
browser.$("textarea[name='message']").value("Hello Selenium")
browser.$("input.contact_button[type='submit']").click()

browser.close()