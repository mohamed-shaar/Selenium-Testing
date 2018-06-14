package com.SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_TestSignupPage_Valid
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "E:/University/Third Year/Second Term/Software Engineering-2/Assignments/CS352-SE2-2017-2018-Assignment2/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:81/library/student_form.php");
        driver.manage().window().maximize();

        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("Mohamed");

        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Samy");

        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("m.samy");

        driver.findElement(By.name("gender")).sendKeys("Male");

        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys("Faisal street");

        driver.findElement(By.name("roll")).clear();
        driver.findElement(By.name("roll")).sendKeys("123");

        driver.findElement(By.name("contact")).clear();
        driver.findElement(By.name("contact")).sendKeys("0124455878");

        driver.findElement(By.name("type")).sendKeys("Student");

        driver.findElement(By.name("year_level")).sendKeys("First Year");

        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("hello123");

        driver.findElement(By.name("submit")).click();
    }
}
