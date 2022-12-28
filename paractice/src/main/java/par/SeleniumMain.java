package par;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumMain {
    public static void main(String[] args){
        //WEb driver 위치
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //브라우저를 출력하지 않고 가져오기
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("headless");
        //드라이버 로드
        //WebDriver driver = new ChromeDriver(options);

        WebDriver driver = new ChromeDriver();



        //사이트 접속
        driver.get("https://nid.naver.com/nidlogin.login");
        //자바스크립트 실행
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementsByName('id')[0].value=\'" + "dnsxogh960717" + "\'");
        js.executeScript("document.getElementsByName('pw')[0].value=\'" + "1234" + "\'");
        //소스코드 가져오기
        System.out.println(driver.getPageSource());
    }
}
