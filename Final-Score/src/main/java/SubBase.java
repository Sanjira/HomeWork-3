import org.openqa.selenium.By;

public class SubBase extends Base {
    public String signInLinkXpath = "//*[@id=\"app\"]/div/header/nav[1]/div[2]/button";
    public String emailAddressFieldXPath = "/html/body/div[8]/div/div/div/form/div[1]/div/label/input";
    public String passwordFieldXpath = "/html/body/div[8]/div/div/div/form/div[2]/div[1]/label/input";
    public String signInButtonXpath = "/html/body/div[8]/div/div/div/form/div[4]/div[1]/button";


    public String userName = "sanjira@gmail.com";
    public String password = "Test@1234";

    public void fsLogin() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(signInLinkXpath)).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(emailAddressFieldXPath)).sendKeys(userName);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(passwordFieldXpath)).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(signInButtonXpath)).click();
        Thread.sleep(3000);
    }

    public void searchProduct() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"typeahead\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"typeahead\"]")).sendKeys("iPhone");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/nav[2]/div[2]/form/button/span/svg")).click();
        Thread.sleep(5000);
    }
//
//    public void searchProduct2() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPad");
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
//        Thread.sleep(5000);
//    }
}


