package main.java

import org.openqa.selenium.chrome.ChromeDriver

waiting{
     timeout=2
    retryInterval=0.5
    includeCauseInMessage=true     //it will give you proper message incase of failure

    preset{                             //preset is nothing but overriding of default parameter
        slow{
            timeout=20
            retryInterval=1
        }
        veryslow{ timeout=50 }
    }
}

atCheckWaiting="slow"
atCheckWaiting=true

driver={
    System.setProperty("webdriver.chrome.driver","/home/coditas/Downloads/chromedriver_linux64/chromedriver")
    new ChromeDriver()
}

baseUrl="http://www.webdriveruniversity.com"
reportsDir="./target/report"
