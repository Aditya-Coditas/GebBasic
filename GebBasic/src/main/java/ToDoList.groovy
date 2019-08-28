package main.java

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","/home/coditas/Downloads/chromedriver_linux64/chromedriver")
def browser
browser = new Browser(driver: new ChromeDriver())
browser.go("http://www.webdriveruniversity.com/To-Do-List/index.html")
browser.$("input",type:"text")<<"Aditya"



//browser.actions().m
//?browser.close()