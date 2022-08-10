package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Keys;

public class Pruebas_Exabyte {


        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "D:\\Cuarto Cuatrimestre\\Calidad Del Software\\Selenium Proyecto\\Automatizacion_Campus\\src\\main\\resources\\Drivers\\chromedriver.exe");
            // Initialize browser

            WebDriver driver = new ChromeDriver();
            // Open Campus

            driver.get("https://exabytesystemscr.com/page/comercial/");


            // Maximize browser
            driver.manage().window().maximize();

            driver.findElement(By.className("link-overlay")).click();

            driver.findElement(By.className("remove-filter-icon")).click();






        }
    }


