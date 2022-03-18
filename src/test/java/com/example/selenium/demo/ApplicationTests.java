package com.example.selenium.demo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
		WebDriver driver = new ChromeDriver();



		driver.get("http://localhost:8080/");



		driver.quit();
	}

}
