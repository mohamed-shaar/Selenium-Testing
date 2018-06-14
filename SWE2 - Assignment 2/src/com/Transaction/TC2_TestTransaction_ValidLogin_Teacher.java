package com.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_TestTransaction_ValidLogin_Teacher
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "E:/University/Third Year/Second Term/Software Engineering-2/Assignments/CS352-SE2-2017-2018-Assignment2/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:81/library/member");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("m.samy");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("hello123");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("//html//li[3]/a[1]")).click();
        driver.findElement(By.xpath("//a[@href='return.php']")).click();
        driver.findElement(By.xpath("//a[@href='teacher_return.php']")).click();
    }
}
