package class06.Homework;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*
goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
click on get new user
print the firstname of user
 */
public class HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "safari";
        openBrowserAndLaunchApplication(url, browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement newUserBtn= driver.findElement(By.xpath("//button[text()='Get New User']"));
        newUserBtn.click();
        WebElement firstName= driver.findElement(By.xpath("//p[contains(text(),'First Name ')]"));

        System.out.println(firstName.getText());
        WebElement lastName= driver.findElement(By.xpath("//p[contains(text(),'Last Name ')]"));
        System.out.println(lastName.getText());
        Thread.sleep(5000);
        driver.close();
    }
}
