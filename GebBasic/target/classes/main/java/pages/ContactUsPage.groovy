package main.java.pages

import geb.Page

class ContactUsPage extends Page{

    static url="/Contact-Us/contactus.html"

    static at={
        title=="WebDriver | Contact Us"
        $("h2.section_header").isDisplayed()
    }

    static content ={
          // we can write navigator as
          //<navigatorName><options map> <actual navigator>
          //option map contain wait,required and cache fileds
        firstName(wait:true){  $("input[name='first_name']")}
        lastName(wait:true){ $("input[name='last_name']")}
        emailId(wait:true){$("input[name='email']")}
        comment(wait:true){$("textarea[name='message']")}
        submit(wait:true){$("input.contact_button[type='submit']")}
    }


    def "enter first name"(fName)
    {
        firstName.value(fName)
        assert firstName.value() == fName
    }
    
    def "enter last name"(lName)
    {
        lastName.value(lName)
        assert  lastName.value() == lName
    }
    
    def "enter email id"(eId)
    {
        emailId.value(eId)
        assert emailId.value() == eId
    }

    def "enter comment"(text)
    {
        comment.value(text)
        assert comment.value() == text
    }

    def "click submit"()
    {
        submit.click()
    }
}
