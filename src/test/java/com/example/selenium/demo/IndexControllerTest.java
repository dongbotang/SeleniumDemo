package com.example.selenium.demo;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * @project: selenium.demo
 * @author: Dongbo Tang
 * @Date: 18/03/2022
 */


public class IndexControllerTest {
    @Test
    public void myTest(){
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080/");

        Assert.assertEquals("ReactJS + Spring Data REST", driver.getTitle());

        WebElement myLink = driver.findElement(By.id("myLink"));
        Assert.assertNotNull(myLink);
        myLink.click();

        Assert.assertEquals("Hello", driver.getTitle());
        WebElement welcomeInfo = driver.findElement(By.tagName("p"));
        System.out.println(welcomeInfo.getText());
        Assert.assertEquals("Hello, Dongbo Tang!", welcomeInfo.getText());
        driver.quit();
    }
}
