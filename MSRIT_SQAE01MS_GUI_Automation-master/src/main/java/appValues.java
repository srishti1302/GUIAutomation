//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import java.awt.Color;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.List;
//import javax.imageio.ImageIO;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author Srishti
// */
//public class appValues {
//
//    public static List<String> openCalculator(String s,AppiumDriver<MobileElement> driver1 ) throws Exception { 
//
//	
//	/*driver1=OpenApp.click_button(driver1,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[5]");
//        driver1=OpenApp.click_button(driver1,"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
//	System.out.println("started");*/
//MobileElement e1=driver1.findElement(By.xpath(s));
//
////"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[5]"));
//List<String> result=new ArrayList<>();
//
//result.add( e1.getText());
//result.add( ""+e1.isDisplayed());
//result.add(""+e1.getLocation().getX());
//result.add(""+e1.getLocation().getY());
//
//result.add(""+e1.getSize().getWidth());
//result.add(""+e1.getSize().getHeight());	
//result.add(""+e1.isEnabled());	
//
//
//
//
//
//
//
//	org.openqa.selenium.Point point = e1.getCenter();
//	int centerx = point.getX();
//	int centerY = point.getY();
//	
//
//	File scrFile = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
//	
//	 BufferedImage image = ImageIO.read(scrFile);
//	  // Getting pixel color by position x and y 
//	  int clr=  image.getRGB(centerx,centerY); 
//	  int  red   = (clr & 0x00ff0000) >> 16;
//	  int  green = (clr & 0x0000ff00) >> 8;
//	  int  blue  =  clr & 0x000000ff;
//	 result.add(""+ red);
//	  result.add(""+ green);
//	  result.add(""+ blue);
//
//Color color = new Color(red,green,blue);
//String hex = Integer.toHexString(color.getRGB() & 0xffffff);
//if (hex.length() < 6) {
//    hex = "0" + hex;
//}
//hex = "#" + hex;
//
//result.add(hex);
//result.add( ""+e1.isSelected());
//result.add( ""+e1.getAttribute("scrollable"));
//result.add( ""+e1.getAttribute("clickable"));
//result.add( ""+e1.getAttribute("focusable"));
//result.add( ""+e1.getAttribute("focused"));
//result.add( ""+e1.getAttribute("long-clickable"));
//result.add( ""+e1.getAttribute("checkable"));
//result.add( ""+e1.getAttribute("checked"));
//result.add(e1.getTagName());
//result.add(""+centerx);
//result.add(""+centerY);
//	return result;
//}
//}


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Srishti
 */
public class appValues {

    public static List<String> openCalculator(String s,AppiumDriver<MobileElement> driver1 ) throws Exception { 

	System.out.println("insidemain");
        
MobileElement e1=(MobileElement) driver1.findElement(By.xpath(s)); 
System.out.println("insidemain");
List<String> result=new ArrayList<>();

result.add(""+ e1.getText());
result.add( ""+e1.isDisplayed());
result.add(""+e1.getLocation().getX());
result.add(""+e1.getLocation().getY());

result.add(""+e1.getSize().getWidth());
result.add(""+e1.getSize().getHeight());	
result.add(""+e1.isEnabled());	

System.out.println("insidemain");






	org.openqa.selenium.Point point = e1.getCenter();
	int centerx = point.getX();
	int centerY = point.getY();
	
System.out.println("insidemain");

	File scrFile = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
	System.out.println("insidemain");

	 BufferedImage image = ImageIO.read(scrFile);
         System.out.println("insidemain");

	  // Getting pixel color by position x and y 
	  int clr=  image.getRGB(centerx,centerY); 
	  int  red   = (clr & 0x00ff0000) >> 16;
	  int  green = (clr & 0x0000ff00) >> 8;
	  int  blue  =  clr & 0x000000ff;
	 result.add(""+ red);
	  result.add(""+ green);
	  result.add(""+ blue);
System.out.println("insidemain");

Color color = new Color(red,green,blue);
String hex = Integer.toHexString(color.getRGB() & 0xffffff);
System.out.println("insidemain");

if (hex.length() < 6) {
    hex = "0" + hex;
}
hex = "#" + hex;
System.out.println("insidemain");

result.add(hex);
result.add( "isSelected"+e1.isSelected());
result.add( "scrollable"+e1.getAttribute("scrollable"));
result.add( "clickable"+e1.getAttribute("clickable"));
result.add( "focusable"+e1.getAttribute("focusable"));
result.add( "focused"+e1.getAttribute("focused"));
result.add( "long-clickable"+e1.getAttribute("long-clickable"));
result.add( "checkable"+e1.getAttribute("checkable"));
result.add( "checked"+e1.getAttribute("checked"));
result.add("tagname: "+e1.getTagName());
result.add("centerx"+centerx);
result.add("centerY"+centerY);
System.out.println("insidemain");
	return result;
}







 public static List<String> getvalues(MobileElement e1,AppiumDriver<MobileElement> driver1 ) throws Exception { 

	
List<String> result=new ArrayList<>();

result.add( "Text: "+e1.getText());
result.add( "Displayed: "+e1.isDisplayed());
result.add("getX: "+e1.getLocation().getX());
result.add("getY: "+e1.getLocation().getY());

result.add("getWidth: "+e1.getSize().getWidth());
result.add("getHeight: "+e1.getSize().getHeight());	
result.add("Enabled: "+e1.isEnabled());	







	org.openqa.selenium.Point point = e1.getCenter();
	int centerx = point.getX();
	int centerY = point.getY();
	

	File scrFile = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
	
	 BufferedImage image = ImageIO.read(scrFile);
	  // Getting pixel color by position x and y 
	  int clr=  image.getRGB(centerx,centerY); 
	  int  red   = (clr & 0x00ff0000) >> 16;
	  int  green = (clr & 0x0000ff00) >> 8;
	  int  blue  =  clr & 0x000000ff;
	 result.add("red: "+ red);
	  result.add("green: "+ green);
	  result.add("blue: "+ blue);

Color color = new Color(red,green,blue);
String hex = Integer.toHexString(color.getRGB() & 0xffffff);
if (hex.length() < 6) {
    hex = "0" + hex;
}
hex = "#" + hex;

result.add(hex);
result.add( "Selected: "+e1.isSelected());
result.add( "Scrollable: "+e1.getAttribute("scrollable"));
result.add( "clickable"+e1.getAttribute("clickable"));
result.add( "focusable"+e1.getAttribute("focusable"));
result.add( "focused: "+e1.getAttribute("focused"));
result.add( "long-clickable: "+e1.getAttribute("long-clickable"));
result.add( "checkable: "+e1.getAttribute("checkable"));
result.add( "checked: "+e1.getAttribute("checked"));
result.add("tagname: "+e1.getTagName());
result.add("centerX"+centerx);
result.add("centerY"+centerY);
	return result;
}








}