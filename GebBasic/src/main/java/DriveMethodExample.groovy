package main.java

import geb.Browser

Browser.drive {
    go("/Contact-Us/contactus.html")
    $("input[name='first_name']")<<"Aditya"
    $("input[name='last_name']").value "Botre"
    $("input[name='email']").value("aditya.botre@coditas.com")
    $("textarea[name='message']").value("Hello Selenium")
    $("input.contact_button[type='submit']").click()
}