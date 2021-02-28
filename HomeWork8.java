package org.example.homework.hw8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWork8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        String url = "C://Users//kren1gan//IdeaProjects//SeleniumQA//src//main//resources//select.html";
        System.out.println("Start test");
        webDriver.get(url);


        WebElement cheese = webDriver.findElement(By.cssSelector("#additives > option:nth-child(1)"));
        Thread.sleep(500);
        cheese.click();
        WebElement cheese1 = webDriver.findElement(By.cssSelector("#out2 > option:nth-child(1)"));

        if (cheese1.getText().equals("Cheese")){
            System.out.println("This is HOROSHO - "+ cheese1.getText());
        }else {
            System.out.println("error");
        }
        Thread.sleep(500);

        Actions action = new Actions(webDriver);

        action.keyDown(Keys.CONTROL);
        WebElement pepperoni = webDriver.findElement(By.cssSelector("#additives > option:nth-child(3)"));
        pepperoni.click();
        WebElement cheese2 = webDriver.findElement(By.cssSelector("#out2 > option:nth-child(1)"));
        WebElement pepperoni1 = webDriver.findElement(By.cssSelector("#out2 > option:nth-child(2)"));
        if ((cheese2.getText().equals("Cheese")) && (pepperoni1.getText().equals("Pepperoni"))){
            System.out.println("This is HOROSHO - "+cheese2.getText()+"\n"+pepperoni1.getText());
        }else{
            System.out.println("error");
        }
        Thread.sleep(500);

        action.keyDown(Keys.CONTROL);
        WebElement mushrooms = webDriver.findElement(By.cssSelector("#additives > option:nth-child(5)"));
        mushrooms.click();
        WebElement cheese3 = webDriver.findElement(By.cssSelector("#out2 > option:nth-child(1)"));
        WebElement pepperoni2 = webDriver.findElement(By.cssSelector("#out2 > option:nth-child(2)"));
        WebElement mushrooms1 = webDriver.findElement(By.cssSelector("#out2 > option:nth-child(3)"));
        if ((cheese3.getText().equals("Cheese")) && (pepperoni2.getText().equals("Pepperoni")) && (mushrooms1.getText().equals("Mushrooms"))){
            System.out.println("This is HOROSHO - "+cheese3.getText()+"\n" +pepperoni2.getText()+"\n"+mushrooms1.getText());
        }else{
            System.out.println("error");
        }

        Thread.sleep(2000);
        webDriver.quit();
        System.out.println("Test end");
    }
}
