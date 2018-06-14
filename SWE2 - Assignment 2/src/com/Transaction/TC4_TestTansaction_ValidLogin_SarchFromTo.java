package com.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_TestTansaction_ValidLogin_SarchFromTo
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
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
        driver.findElement(By.name("from")).clear();
        driver.findElement(By.name("from")).sendKeys("1/1/1990");
        //driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/form[1]/div[2]/div[1]/input[1]")).clear();
        driver.findElement(By.name("to")).sendKeys("1/1/2020");
        driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/form[1]/div[3]/div[1]/button[1]")).click();
        }
}
