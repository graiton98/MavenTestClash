import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
        driver.findElement(By.id("email")).sendKeys("daw2glopezmonjo@iesjoanramis.org");
        driver.findElement(By.id("password")).sendKeys("LopezMonjo356");
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
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //List<WebElement> clanBoton = driver.findElements(By.name("clanTag"));
        List<WebElement> clanBoton = driver.findElements(By.tagName("input"));
        //driver.findElement(By.xpath("//a[@class='toggleEndpointList']"));
        //driver.findElement(By.className("toggleEndpointList")).click();
        //List<WebElement> clanBoton = driver.findElements(By.className("toggleOperation"));
        //List<WebElement> clanBoton = driver.findElements(By.xpath("a[@class='toggleEndpointList']"));
        /*clanBoton.get(0).click();*/
        //for(WebElement element : clanBoton) element.click();
        /*driver.findElement(By.name("clanTag")).sendKeys("#9QJ209UV");
        driver.findElement(By.className("submit")).click();*/
        //clanBoton.get(3).sendKeys("9QJ209UV");
        
        clanBoton.get(0).sendKeys("maamaaaaaaaa");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}