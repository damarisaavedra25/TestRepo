package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static WebDriver driver;

    public static void main(String[] args) {
        //setUp()
        System.setProperty("webdriver.chrome.driver", "/Users/ds0522/Documents/BOOTCAMP/Proyecto/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sheltered-mesa-19374.herokuapp.com/about/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //locate username
        driver.findElement(By.id("id_username")).sendKeys("cacao15");

        //locate password
        driver.findElement(By.id("id_password")).sendKeys("Papimayo5656$");

        //locate login
        driver.findElement(By.className("btn-success")).click();

        //Scenario 1 "Create Post"
        //locate new post
        driver.findElement(By.linkText("New Post")).click();

        //insert title
        driver.findElement(By.id("id_title")).sendKeys("Greetings from Italy!");

        //insert subtitle
        driver.findElement(By.id("id_subtitle")).sendKeys("Best family vacation!");

        //insert body
        driver.findElement(By.id("id_body")).sendKeys("We had an amazing time with the family.");

        //create post
        driver.findElement(By.className("btn-success")).click();

        //Scenario 2 "Fail Post Message"
        //locate new post
        driver.findElement(By.linkText("New Post")).click();

        //insert subtitle
        driver.findElement(By.id("id_subtitle")).sendKeys("Test scenario 2");

        //insert body
        driver.findElement(By.id("id_body")).sendKeys("Test scenario 2 body");

        //create post
        driver.findElement(By.className("btn-success")).click();

        driver.findElement(By.linkText("Home")).click();

        //Scenario 2 "User fails to create post without subtitle"
        //locate new post
        driver.findElement(By.linkText("New Post")).click();

        //insert subtitle
        driver.findElement(By.id("id_title")).sendKeys("Test scenario 2");

        //insert body
        driver.findElement(By.id("id_body")).sendKeys("Test scenario 2 body");

        //create post
        driver.findElement(By.className("btn-success")).click();

        driver.findElement(By.linkText("Home")).click();

        //Scenario 2. User updates Post
        //Esc 1
        //locate new post
        driver.findElement(By.linkText("New Post")).click();

        //insert title
        driver.findElement(By.id("id_title")).sendKeys("Greetings from Italy!");

        //insert subtitle
        driver.findElement(By.id("id_subtitle")).sendKeys("Best family vacation!");

        //insert body
        driver.findElement(By.id("id_body")).sendKeys("We had an amazing time with the family.");

        //create post
        driver.findElement(By.className("btn-success")).click();

        //edit post
        driver.findElement(By.className("btn-outline-primary")).click();

        //edit title
        driver.findElement(By.id("id_title")).sendKeys("Edit title");

        //edit subtitle
        driver.findElement(By.id("id_subtitle")).sendKeys("Edit subtitle");

        //edit body
        driver.findElement(By.id("id_body")).sendKeys("Edit body");

        driver.findElement(By.className("btn-success")).click();

        driver.findElement(By.linkText("Home")).click();

        //Scenario 2. User partially updates a post successfully

        driver.findElement(By.linkText("New Post")).click();

        //insert title
        driver.findElement(By.id("id_title")).sendKeys("Greetings from Italy!");

        //insert subtitle
        driver.findElement(By.id("id_subtitle")).sendKeys("Best family vacation!");

        //insert body
        driver.findElement(By.id("id_body")).sendKeys("We had an amazing time with the family.");

        //create post
        driver.findElement(By.className("btn-success")).click();

        //edit post
        driver.findElement(By.className("btn-outline-primary")).click();

        //edit subtitle
        driver.findElement(By.id("id_subtitle")).sendKeys("Edit subtitle");

        //edit body
        driver.findElement(By.id("id_body")).sendKeys("Edit body");

        driver.findElement(By.className("btn-success")).click();

        //Scenario 3: User attempts to update another user's post and fails
        //doubts on this one, escenario is not clear to me
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://sheltered-mesa-19374.herokuapp.com/posts/24/error");
        driver2.manage().window().maximize();
        driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.close();
    }
}