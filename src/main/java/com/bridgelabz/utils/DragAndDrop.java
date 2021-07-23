package com.bridgelabz.utils;

import com.bridgelabz.base.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDrop extends Base {
    @FindBy(xpath = "//*[@id='credit2']/a")
    public static WebElement From;

    @FindBy(xpath = "//*[@id='bank']/li")
    public static WebElement To;


    public DragAndDrop(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static void dragAndDrop() throws InterruptedException {
        //JavascriptExecutor here is used to scroll the window
        //window is scrolled downwards by 1000 pixel
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);

        //Using Action class for drag and drop.
        Actions act = new Actions(driver);
        //Dragged and dropped.
        act.dragAndDrop(From, To).build().perform();
        Thread.sleep(5000);
    }
}


