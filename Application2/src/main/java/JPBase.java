import org.openqa.selenium.By;

public class JPBase extends Base {
    public String signInIconXpath = "//*[@id=\"toggleToolTip\"]/div/div/div[1]";
    public String signInLinkXpath = "//*[@id=\"headerAccount\"]/div/div/ul/li[1]/button";
    public String emailFieldXPath = "//*[@id=\"content\"]/main/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[2]/div/div[1]/span/div/input";
    public String passwordFieldXpath = "//*[@id=\"content\"]/main/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[2]/div/div[2]/input";
    public String signInButtonXpath = "//*[@id=\"content\"]/main/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[2]/div/div[5]/button";


    public String searchField = "//*[@id=\"searchInputId\"]";
    public String searchIcon = "//*[@id=\"typeaheadInputContainer\"]/div/button";
    public String userName = "sanjira@gmail.com";
    public String password = "Test@1234";

    public void jcpLogin() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(signInIconXpath)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(signInLinkXpath)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(emailFieldXPath)).sendKeys(userName);
        Thread.sleep(3000);
        driver.findElement(By.xpath(passwordFieldXpath)).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.xpath(signInButtonXpath)).click();
        Thread.sleep(4000);
    }

    public void productSearch() throws InterruptedException{

        Thread.sleep(3000);
        driver.findElement(By.xpath(searchField)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(searchField)).sendKeys("Nike Shoe");
        Thread.sleep(3000);
        driver.findElement(By.xpath(searchIcon)).click();
        Thread.sleep(3000);
    }
}
