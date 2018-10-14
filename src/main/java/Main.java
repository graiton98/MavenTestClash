import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.tools.ShellFunctions.input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Main{
    public static void main(String[] args) {
        /*JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("warlog.json"));
            JSONObject jo = (JSONObject) obj; 

            JSONArray msg = (JSONArray) jo.get("items");
            //System.out.println(msg.get(0));
            JSONObject war = (JSONObject)msg.get(0);
            JSONArray arr = (JSONArray) war.get("participants");
            Iterator<JSONObject> iterator = arr.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next().get("name"));
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        /*WebDriver driver = new HtmlUnitDriver();
        driver.get("https://developer.clashroyale.com/#/login");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("daw2glopezmonjo@iesjoanramis.org");
        email.submit();
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("LopezMonjo356");
        password.submit();
        driver.quit();*/
        
        //WebDriver driver = new HtmlUnitDriver();
        
        //WebElement we = driver.findElement(By.id("lst-ib"));
        //List<WebElement> we = driver.findElements(By.cssSelector("[id='lst-ib']"));
        //System.out.println("SIZE: "+we.size());
        //String emailAddress = driver.findElement(By.xpath("//span[@class='email']")).getText();
        //we.get(0).sendKeys("hola");
        //we.get(0).submit();
        //System.out.println("TITLE: "+driver.getTitle());
        
        //driver.findElement(By.xpath("//button[@type='submit'][text()='Log in']")).click();
        
        
        //Funciona
        /*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.es/");
        WebElement we = driver.findElement(By.id("lst-ib"));
        we.sendKeys("hola");
        we.submit();
        System.out.println("TITLE: "+driver.getTitle());
        driver.quit();*/
        
        // API Clash Royale
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://developer.clashroyale.com/#/login");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        driver.findElement(By.id("email")).sendKeys("testapiclash@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Dequa16.");
        driver.findElement(By.className("ladda-button")).click();
        //we.submit();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<WebElement> botons = driver.findElements(By.className("col-xs-6"));
        botons.get(1).click();
        //System.out.println("URL: "+driver.getCurrentUrl());
        //email.submit();
        //password.submit();
        //clan -> 9QJ209UV
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        //WebElement frame = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/div/div/div/div/iframe"));
        //driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/div/div/div/div/iframe")));
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        List<WebElement> clanBoton = driver.findElements(By.className("toggleEndpointList"));
        clanBoton.get(0).click();
        
        List<WebElement> operation = driver.findElements(By.className("toggleOperation"));
        for(int i = 0; i<operation.size(); i++){
            WebElement o = operation.get(i);
            if(o.isDisplayed() && i == 10){
                o.click();
            }
        }
        List<WebElement> clanTagList = driver.findElements(By.name("clanTag"));
        clanTagList.get(2).sendKeys("#9QJ209UV");
        
        List<WebElement> submitButton = driver.findElements(By.className("submit"));
        for(int i = 0; i<submitButton.size(); i++){
            WebElement o = submitButton.get(i);
            if(o.isDisplayed()){
                o.submit();
            }
        }
        driver.get("https://api.clashroyale.com/v1/clans/%239QJ209UV/warlog");
        String json = driver.findElement(By.tagName("pre")).getText();
        System.out.println(json);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}