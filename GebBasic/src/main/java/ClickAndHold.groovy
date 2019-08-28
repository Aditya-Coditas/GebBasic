import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.interactions.Actions


System.setProperty("webdriver.chrome.driver","/home/coditas/Downloads/chromedriver_linux64/chromedriver")
        def browser
        browser = new Browser(driver: new ChromeDriver())
        browser.go("http://www.webdriveruniversity.com/Actions/index.html")
        def actions=new Actions()
      //  actions.clickAndHold($("#click-box"))
        actions.moveToElement($("button.dropbtn")[1])