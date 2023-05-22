/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.io.File;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class App{
    public void getGreeting() throws InterruptedException, MalformedURLException, AWTException {
        
        
        TestCases tests = new TestCases(); // Initialize your test class
   
        // TODO: call your test case functions one after other here

        //   tests.testCase01();
        //  tests.testCase02();
        //  tests.testCase03();
        //  tests.testCase04();
        //  tests.testCase05();

        //  tests.testCase06();
        tests.testCase07();
        //  tests.testCase08();
        //  tests.testCase09();
        //  tests.testCase10();
  
        // END Tests

        tests.endTest(); // End your test by clearning connections and closing browser
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException, AWTException {
        new App().getGreeting();
    }
}
