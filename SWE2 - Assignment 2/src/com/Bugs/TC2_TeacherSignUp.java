package com.Bugs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_TeacherSignUp
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:/University/Third Year/Second Term/Software Engineering-2/Assignments/CS352-SE2-2017-2018-Assignment2/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:81/library/teacher_form.php");
        driver.manage().window().maximize();

        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("Amina");

        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Allam");

        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("a.allam");

        driver.findElement(By.name("gender")).sendKeys("Male");

        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys("faisal street");

        driver.findElement(By.name("contact")).clear();
        driver.findElement(By.name("contact")).sendKeys("0123456789");

        driver.findElement(By.name("type")).sendKeys("Teacher");

        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("algo123");

        driver.findElement(By.name("submit")).click();
    }
}
