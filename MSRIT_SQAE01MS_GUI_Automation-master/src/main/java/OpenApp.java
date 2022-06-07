
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Srishti
 */
public class OpenApp {

    static public AppiumDriver<MobileElement> openapp(List<String> v, AppiumDriver<MobileElement> driver1) throws Exception {
        System.out.println("entered open app");
        String dev_name = v.get(0);
        String udid = v.get(1);
        String pfname = v.get(3);
        String version = v.get(2);
        String apppackage = v.get(4);
        String activity = v.get(5);
//System.out.println(pfname);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", dev_name);//dev_name"Galaxy S10+"
        cap.setCapability("udid", udid);//"R38KA093V8Y" udid
        cap.setCapability("platformName",pfname );//"Android"pfname
        cap.setCapability("platformVersion",version );//"11"version

        cap.setCapability("appPackage", apppackage);//"com.ldt.musicr"apppackage
        cap.setCapability("appActivity",activity );//activity "com.ldt.musicr.ui.AppActivity"
        cap.setCapability("autoGrantPermissions",true);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver1 = new AppiumDriver<MobileElement>(url, cap);
//        Thread.sleep(9000);
//        driver1 = OpenApp.click_button(driver1, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button[2]");
// Thread.sleep(9000);
//        driver1 = OpenApp.click_button(driver1,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.Button[1]");
//        Thread.sleep(5000);
//       driver1 = OpenApp.click_button(driver1,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button");
//       Thread.sleep(5000);
//    driver1 = OpenApp.click_button(driver1,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.Button[1]");
//        System.out.println(driver1.getPageSource());
//         Thread.sleep(8000);
//         driver1 = OpenApp.click_button(driver1,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button");
//          Thread.sleep(5000);
//          driver1=OpenApp.click_button(driver1,"//android.widget.CheckBox[@content-desc=\"All\"]");
//           Thread.sleep(5000);
//           driver1=OpenApp.click_button(driver1,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button");
//            Thread.sleep(5000);
// driver1=OpenApp.click_button(driver1,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button");
//   Thread.sleep(5000);
//   driver1=OpenApp.click_button(driver1,"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
// Thread.sleep(5000);
// 
// 
//   driver1=OpenApp.click_button(driver1,"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
//  Thread.sleep(5000);
//   driver1=OpenApp.click_button(driver1,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button[2]");
//
//            Thread.sleep(5000);
           System.out.println(driver1.getPageSource());
        return driver1;
    }

    static public AppiumDriver<MobileElement> click_button(AppiumDriver<MobileElement> driver1, String xp) throws Exception {
        MobileElement e2 = driver1.findElement(By.xpath(xp));
        e2.click();
        Thread.sleep(3000);
        return driver1;
    }

}
