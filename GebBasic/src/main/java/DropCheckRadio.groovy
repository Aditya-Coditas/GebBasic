import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","/home/coditas/Downloads/chromedriver_linux64/chromedriver")
def browser
browser = new Browser(driver: new ChromeDriver())
browser.go("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html")

//browser.$("#checkboxes > label:nth-child(3) > input[type=checkbox]").click()

browser.$("input[type='checkbox'][value='option-2']").click()
//browser.$("input[value='option-3']").click()
//browser.$("input[value='option-4']").click()

browser.$("select#dropdowm-menu-1").value("python")
browser.$("#dropdowm-menu-2").value("TestNG")
browser.$("#dropdowm-menu-3").value("JQuery")





//browser.$("#radio-buttons > input[type=radio]:nth-child(1)").click()
//browser.$("#radio-buttons > input[type=radio]:nth-child(3)").click()
//browser.$("#radio-buttons > input[type=radio]:nth-child(5)").click()
//browser.$("#radio-buttons > input[type=radio]:nth-child(7)").click()

//browser.$("#radio-buttons > input[type=radio]:nth-child(1)")

browser.close()




