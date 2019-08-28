package main.java

import geb.Browser
import main.java.pages.ContactUsPage

Browser.drive {
    to ContactUsPage
    println currentUrl

    "enter first name"("Aditya")
    "enter last name"("Botre")
    "enter email id"("abc@xyz.com")
    "enter comment"("stay happy as well")
    "click submit"()
}
