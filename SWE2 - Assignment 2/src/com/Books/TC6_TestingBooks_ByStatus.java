package com.Books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC6_TestingBooks_ByStatus
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:/University/Third Year/Second Term/Software Engineering-2/Assignments/CS352-SE2-2017-2018-Assignment2/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:81/library/member");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("m.samy");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("hello123");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("//ul[@class='nav']//li//a[@href='books.php']")).click();
        driver.findElement(By.xpath("//div[@id='example_filter']//label//input[@type='text']")).sendKeys("Old");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//div[@id='example_filter']//label//input[@type='text']")).clear();
        driver.findElement(By.xpath("//div[@id='example_filter']//label//input[@type='text']")).sendKeys("New");
    }
}
