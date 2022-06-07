

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import java.util.*;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Srishti
 */
public class fileread {
    static AppiumDriver<MobileElement> driver1;
public static void main(String args[])
throws Exception
    {
 DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("deviceName","Galaxy S10+");//dev_name"Galaxy S10+"
	cap.setCapability("udid","R38KA093V8Y" );//"R38KA093V8Y" udid
	cap.setCapability("platformName","Android");//"Android"pfname
	cap.setCapability("platformVersion","11");//"11"version
	
cap.setCapability("appPackage", "com.ldt.musicr");//"com.ldt.musicr"apppackage
	cap.setCapability("appActivity","com.ldt.musicr.ui.AppActivity");//activity "com.ldt.musicr.ui.AppActivity"
	
	URL url=new URL("http://127.0.0.1:4723/wd/hub");
	
	driver1=new AppiumDriver<MobileElement>(url,cap);
driver1=OpenApp.click_button(driver1,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[5]");

        driver1=OpenApp.click_button(driver1,"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
	
        // Declaring and initializing the string with
        // custom path of a file
        String path = "C:\\Users\\Srishti\\OneDrive\\Desktop\\xpath.txt";
//String op= "C:\\Users\\Srishti\\OneDrive\\Desktop\\output.txt";
 String path1="C:\\Users\\Srishti\\OneDrive\\Desktop\\name.txt";

  FileWriter fw=new FileWriter("C:\\Users\\Srishti\\OneDrive\\Desktop\\output.txt");    
JSONArray jsonArray = new JSONArray();
        InputStream is = new FileInputStream(path);
 InputStream is1 = new FileInputStream(path1);
 Scanner sc1= new Scanner(
                 is1, StandardCharsets.UTF_8.name());

        // Try block to check for exceptions
        try (Scanner sc = new Scanner(
                 is, StandardCharsets.UTF_8.name())) {
 
            // It holds true till there is single element
            // left in the object with usage of hasNext()
            // method
            while (sc.hasNextLine())
            {
 
                List<String> r2=new ArrayList<>();
List<String> r1=new ArrayList<>();
String xp=sc.nextLine();
                 System.out.println(xp);
String element=sc1.nextLine();
                System.out.println("\n"+element);
r1=appValues.openCalculator(xp,driver1);
r2=screen1json.compareWith(element);


if(!Comparision.compare(r1,r2)){

JSONObject obj=new JSONObject();
obj.put(element,"False");
fw.write(obj.toString());
fw.write("\n");
jsonArray.add(obj.toString());
           
}



           
 }


int n=jsonArray.size();
 Iterator<JSONObject> it = jsonArray.iterator();
//while(it.hasNext()){
//JSONObject o=it.next();
//System.out.println(n);n--;

//System.out.println(it.next());
//fw.write(it.next().toJSONString());
//}
//fw.write(jsonArray.toString());    
                     System.out.println("\n\n");

        }
    

 fw.close(); 

}
}
