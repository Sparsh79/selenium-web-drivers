package com.knoldus
import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import org.scalatest._
import org.testng
import org.openqa.selenium.support.ui._
import org.openqa.selenium.interactions.Action
import org.openqa.selenium.interactions.Actions
import org.testng.annotations.Test

class FirstTry extends FlatSpec {

  val BASE_URL = "https://www.amazon.in/"
  val EMAIL = "sparshbhardwaj10@gmail.com"
  val PASSWORD = "sparsh"
  val NAME = "Sparsh"
  val PHONE = "9997180989"
  System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/chromedriver_linux64(2)/chromedriver")

  val driver = new ChromeDriver()


  "A user" should "visit amazon.com" in {
    driver.manage().window().maximize()

    driver.get(BASE_URL)
    val title = driver.getTitle
    if (driver.getCurrentUrl == BASE_URL) {
      print("welcome to amazon: " + title)

    }
    else
      print("something went wrong")
  }

  "A user" should " be able to log" in {
    driver.manage().window().maximize()
    driver.get(BASE_URL)
    testng.Reporter.log("amazon accessed")
    /*driver.findElementByCssSelector("#nav-link-accountList > span:nth-child(1)").click()
    driver.findElementByCssSelector("#ap_email").sendKeys(EMAIL)
    driver.findElementByCssSelector("#continue").click()
    driver.findElementByCssSelector("#ap_password").sendKeys(PASSWORD)
    driver.findElementByCssSelector("#signInSubmit").click()

     */
    driver.findElementByCssSelector("#nav-link-accountList").click()
    //testng.Reporter.log("clicked the button")
    driver.findElementByCssSelector("#createAccountSubmit").click()
    //testng.Reporter.log("click the new customer button")
    driver.findElementByCssSelector("#ap_customer_name").sendKeys(NAME)
    //testng.Reporter.log("entered the name")
    driver.findElementByCssSelector("#ap_phone_number").sendKeys(PHONE)
    //testng.Reporter.log("entered the phone number")
    driver.findElementByCssSelector("#ap_email").sendKeys(EMAIL)
    //testng.Reporter.log("entered the email")
    driver.findElementByCssSelector("#ap_password").sendKeys(PASSWORD)
    //testng.Reporter.log("entered the password")
    driver.findElementByCssSelector("#continue").click()
    //testng.Reporter.log("clicked on the button")
    driver.findElementByCssSelector("#ap_register_form > div > div > div:nth-child(9) > a").click()
    driver.findElement(By.linkText("Need help?")).click()
    driver.findElement(By.xpath("//*[@id=\"ap-other-signin-issues-link\"]")).click()
    // driver.findElementByCssSelector("#cu-select-firstNode").click()
    val dropdown = new Select(driver.findElement(By.id("cu-select-firstNode")))
    dropdown.selectByVisibleText("I cannot reset my password")
    driver.findElementByCssSelector("#contactUsWidget > div.cu-dyk-container > div > div > a").click()
  }
  "a user" should "be able to use radio button" in {
    driver.manage().window().maximize()
    driver.get("http://demo.guru99.com/test/radio.html")
    driver.findElementById("vfb-7-1").click()
    driver.findElementByCssSelector("#vfb-7-3").click()
    driver.findElementByCssSelector("#vfb-6-0").click()
    driver.findElementByCssSelector("#vfb-6-2").click()

  }
  "a user" should "be to perform actions" in {
    driver.manage().window().maximize()
    driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C355887219776%7Ce%7Cfacebook%27%7C&placement=&creative=355887219776&keyword=facebook%27&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-362360550869%26loc_physical_ms%3D9040183%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI-eySu_i36AIVioSRCh0iNgJ9EAAYASAAEgL14vD_BwE")
    //driver.findElementByXPath("#navbar-brand-centered > ul > li:nth-child(4) > a").click()

    val builder = new Actions(driver)
    builder
      .moveToElement(driver.findElement(By.cssSelector("#u_0_n")))
      .click()
      .contextClick(driver.findElement(By.cssSelector("#u_0_n")))
      .click()
      .build()
      .perform()
  }

  "A user" should "able to handle pop ups" in {
    driver.manage().window().maximize()
    driver.get("http://demo.guru99.com/test/delete_customer.php")
    driver.findElementByCssSelector("body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=text]").sendKeys("baburao")
    driver.findElementByCssSelector("body > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=submit]:nth-child(1)").click()
    driver.switchTo().alert().accept()
  }
}
