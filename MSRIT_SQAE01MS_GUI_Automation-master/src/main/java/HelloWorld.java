
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import java.awt.Image;
import java.awt.image.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;


public class HelloWorld extends javax.swing.JFrame {

    static AppiumDriver<MobileElement> driver1;

    public HelloWorld() throws Exception {

        System.out.println("Hello world constructor");
        List<String> v = device.getvalues();

        driver1 = OpenApp.openapp(v, driver1);
        setVisible(true);
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        id = new javax.swing.JLabel();
        id1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        textArea1 = new java.awt.TextArea();
        textArea2 = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        ele_name = new javax.swing.JTextField();
        label_name = new javax.swing.JLabel();
        resultpf = new javax.swing.JLabel();
        textArea3 = new java.awt.TextArea();
        click = new javax.swing.JTextField();
        clickbutton = new javax.swing.JButton();
        start = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        getContentPane().setLayout(null);

        id.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        id.setText("XPATH");
        getContentPane().add(id);
        id.setBounds(40, 30, 54, 15);
        getContentPane().add(id1);
        id1.setBounds(150, 30, 859, 22);

        jButton1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 190, 88, 38);

        jButton2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(430, 190, 70, 40);

        jButton3.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jButton3.setText("RESET");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(300, 190, 80, 38);

        textArea1.setBackground(new java.awt.Color(255, 255, 255));
        textArea1.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textArea1TextValueChanged(evt);
            }
        });
        getContentPane().add(textArea1);
        textArea1.setBounds(160, 390, 320, 250);

        textArea2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(textArea2);
        textArea2.setBounds(660, 380, 310, 270);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel1.setText("EXTRACTED VALUES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 360, 142, 30);
        getContentPane().add(ele_name);
        ele_name.setBounds(150, 70, 859, 22);

        label_name.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        label_name.setText("ELEMENT NAME");
        getContentPane().add(label_name);
        label_name.setBounds(10, 70, 100, 20);

        resultpf.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        resultpf.setText("     RESULT");
        resultpf.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        resultpf.setOpaque(true);
        getContentPane().add(resultpf);
        resultpf.setBounds(20, 690, 92, 32);
        getContentPane().add(textArea3);
        textArea3.setBounds(160, 680, 290, 60);

        click.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickActionPerformed(evt);
            }
        });
        getContentPane().add(click);
        click.setBounds(150, 120, 859, 22);

        clickbutton.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        clickbutton.setText("CLICK");
        clickbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(clickbutton);
        clickbutton.setBounds(30, 120, 72, 21);

        start.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        start.setText("START");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        getContentPane().add(start);
        start.setBounds(840, 260, 100, 40);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(630, 680, 380, 60);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1110, 80, 488, 731);

        jButton4.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jButton4.setText("DISPLAY SCREEN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(590, 260, 150, 40);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel2.setText("JSON VALUES");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(770, 360, 100, 20);

        jLabel4.setBackground(new java.awt.Color(213, 202, 189));
        jLabel4.setText("jLabel4");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-100, -60, 2260, 1330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//submit button
//        System.out.println("insidesubmit");
        List<String> atr = new ArrayList<>();
        atr.add("text in element ");
        atr.add("isDisplayed");
        atr.add("x");
        atr.add("y");
        atr.add("width ");
        atr.add("height ");
        atr.add("isEnabled");
        atr.add("red");
        atr.add("green");
        atr.add("blue");

        atr.add("color_code");

        atr.add("isSelected");
        atr.add("isScrollable");
        atr.add("isClickable");
        atr.add("isfocusable");
        atr.add("isfocussed");
        atr.add("long-clickable");
        atr.add("checkable");
        atr.add("checked");

        atr.add("tagName: ");

        atr.add("x-avg");
        atr.add("y-avg");

        List<String> atr2 = new ArrayList<>();
        atr2.add("name");
        atr2.add("isVisible");
        atr2.add("x");
        atr2.add("y");
        atr2.add("height");
        atr2.add("width");
        atr2.add("isEnabled");
        atr2.add("red");
        atr2.add("green");
        atr2.add("blue");

        Iterator<String> iter = atr.iterator();
        Iterator<String> iter2 = atr2.iterator();
        List<String> r2 = new ArrayList<>();
        List<String> r1 = new ArrayList<>();
        String res = "";
        String s = id1.getText();
        String n = ele_name.getText();
//        System.out.println("insidesubmit");
        System.out.println(n);
        System.out.println(s);
        try {
            r1 = appValues.openCalculator(s, driver1);

            for (String x : r1) {
                res = res + iter.next() + ": " + x + "\n";
            }
            textArea1.setText(res);
            res = "";
            r2 = screen1json.compareWith(n);
            for (String x : r2) {
                res = res + iter2.next() + ":" + x + "\n";
            }
            textArea2.setText(res);

            boolean b = Comparision.compare(r1, r2);
            if (b) {
                textArea3.setText("TRUE");
            } else {
                textArea3.setText("FALSE");
            }
//System.out.println("insidesubmit");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
public static void elementScreenshot(AppiumDriver driver,MobileElement ele ,int c)
{

File screenshotLocation = null;
try{

File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

BufferedImage fullImg = ImageIO.read(scrFile);
//Get the location of element on the page
Point point = ele.getLocation();
//Get width and height of the element
int eleWidth = ele.getSize().getWidth();
int eleHeight = ele.getSize().getHeight();
//Crop the entire page screenshot to get only element screenshot
BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(), eleWidth,eleHeight);
ImageIO.write(eleScreenshot, "png", scrFile);
String path = "screenshots/" + "element"+c+ ".png";

screenshotLocation = new File(System.getProperty("user.dir") + "/" + path);
FileUtils.copyFile(scrFile, screenshotLocation);

System.out.println(screenshotLocation.toString());

} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
//return screenshotLocation.toString();

}
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//System.out.println("c1");
id1.setText("");
        click.setText("");
        textArea1.setText("");
        textArea2.setText("");
        ele_name.setText("");
//List<MobileElement> allCheckBoxes=driver1.findElementsByXPath("//*");//[@class='android.widget.']");
//
//    for (MobileElement mobileElement : allCheckBoxes) {
//        System.out.println(mobileElement.getText()+"    "+mobileElement.getTagName());
//    }       
//System.out.println("c2"); 
//id1.setText("");
//        click.setText("");
//        textArea1.setText("");
//        textArea2.setText("");
//        ele_name.setText("");    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void textArea1TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textArea1TextValueChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_textArea1TextValueChanged

    private void clickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickActionPerformed
//    String clickon=click.getText();    

        // TODO add your handling code here:
    }//GEN-LAST:event_clickActionPerformed

    private void clickbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickbuttonActionPerformed

        String xp = click.getText();
        try {
            driver1 = OpenApp.click_button(driver1, xp);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_clickbuttonActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
//       try{ 
//
//call(evt);}catch(Exception e){}
//        // TODO add your handling code here:
Boolean r =true;
List<String> atr2 = new ArrayList<>();
        atr2.add("name");
        atr2.add("isVisible");
        atr2.add("x");
        atr2.add("y");
        atr2.add("height");
        atr2.add("width");
        atr2.add("isEnabled");
        atr2.add("red");
        atr2.add("green");
        atr2.add("blue");
// List<String> r2 = new ArrayList<>();
// Iterator<String> iter2 = atr2.iterator();
 try{     
     int c=0;
// FileWriter fw=new FileWriter("C:\\Users\\kumar satyam\\Downloads\\MSRIT_SQAE01MS_GUI_Automation-master (1)\\MSRIT_SQAE01MS_GUI_Automation-master\\Result\\output.txt"); 
//FileWriter fw1=new FileWriter("C:\\Users\\kumar satyam\\OneDrive\\Desktop\\output1.txt"); 
  FileWriter fw=new FileWriter("Result/output.txt");
fw.write("LOG");
                List<MobileElement> allCheckBoxes=driver1.findElementsByXPath("//*");     
                                 List<String> r1 = new ArrayList<>();
List<String> r2 = new ArrayList<>();
                                
                                String res="";
String res1 = "";
                for (MobileElement x : allCheckBoxes) 
                { 
                    c++;
                            r1 = appValues.getvalues(x, driver1);
                            for (String s : r1)                    
                                res = res+ s+"\n";
                            textArea1.setText(res); 
String t=x.getText();
                if(t.length()!=0){
System.out.println("e2 "+x.getText());
                r2 = screen1json.compareWith(x.getText());
                    for (String y : r2) {
                        res1 = res1 + ": " + y + "\n";
                    }
                }
                fw.write("\n\n"+res);
fw.write("\n\n"+res1);
                textArea2.setText(res1);
                     fw.write(res);
                boolean b = Comparision.compare(r1, r2);
                if (b) {
                    textArea3.setText("TRUE");
fw.write("\nRESULT: TRUE");

fw.write("\n\n");
                } 
                else{ 
                    r=false;
                    fw.write("\nResult: FALSE");
                    textArea3.setText("False");
                      elementScreenshot(driver1,x ,c);   
                }
                             
                          
                                          
                }
 

}catch(Exception e){
    
//    e.printStackTrace();
}
 jTextField1.setText("OVERALL RESULT:" +r.toString());
//try{     
// FileWriter fw=new FileWriter("C:\\Users\\kumar satyam\\OneDrive\\Desktop\\output.txt"); 
// 
//fw.write("LOG");
//                List<MobileElement> allCheckBoxes=driver1.findElementsByXPath("//*");     
//                                 List<String> r1 = new ArrayList<>();
//                                
//                                String res="";
//                for (MobileElement x : allCheckBoxes) 
//                {
//                            r1 = appValues.getvalues(x, driver1);
//                            for (String s : r1)                    
//                                res = res+ s+"\n";
//                            textArea1.setText(res); 
//
//                               fw.write(res); 
//                                res = "";
//                                String temp = x.getText();
//                                String x1="";
//                                if(temp!=null && !temp.equals(x1)){
//                                    
//                                
//                r2 = screen1json.compareWith(temp);
//                for (String y : r2) {
//                    res = res + iter2.next() + ": " + y + "\n";
//                }
//                                }
//fw.write("\n"+res);
//                textArea2.setText(res);
//
//                boolean b = Comparision.compare(r1, r2);
////fw.write("\n"+r1.toString());
////fw.write("\n"+r2.toString());
//                if (b) {
//                    textArea3.setText("TRUE");
//fw.write("\nRESULT: TRUE");
//fw.write("\n\n");
//                } 
//                            Thread.sleep(1000);                  
//                }
//fw.close();
//}catch(Exception e){
//e.printStackTrace();
//}
    }//GEN-LAST:event_startActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

// displayscreen
                                try{
                                BufferedImage img = null;
                                File file= ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
                                FileUtils.copyFile(file,new File("screen.jpg"));
                                try {
                                    img = ImageIO.read(new File("screen.jpg"));
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }

                                Image dimg = img.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(),Image.SCALE_SMOOTH);

                                ImageIcon icon = new ImageIcon(dimg);
                                jLabel3.setIcon(icon);










/* correct code
MobileElement ele = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView[3]"));

File screenshotLocation = null;
try{
File scrFile = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);

BufferedImage fullImg = ImageIO.read(scrFile);
//Get the location of element on the page
Point point = ele.getLocation();
//Get width and height of the element
int eleWidth = ele.getSize().getWidth();
int eleHeight = ele.getSize().getHeight();
//Crop the entire page screenshot to get only element screenshot
BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(), eleWidth,
eleHeight);
ImageIO.write(eleScreenshot,"png",scrFile);

String path = "screenshots/" + UUID.randomUUID() + ".png";

screenshotLocation = new File(System.getProperty("user.dir") + "/" + path);
FileUtils.copyFile(scrFile, screenshotLocation);

System.out.println(screenshotLocation.toString());

} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}


*/







                                Thread.sleep(3000);
                                }catch(Exception e){}
        
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HelloWorld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelloWorld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelloWorld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelloWorld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HelloWorld().setVisible(true);
                } catch (Exception e) {
                }
            }
        });
    }


public  void image() throws Exception{
Thread t=new Thread();
t.start();
BufferedImage img = null; 
File file= ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file,new File("screen.jpg"));
try {
    img = ImageIO.read(new File("screen.jpg"));
} catch (IOException e) {
    e.printStackTrace();
}
    
Image dimg = img.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(),Image.SCALE_SMOOTH);

ImageIcon icon = new ImageIcon(dimg);

jLabel3.setIcon(icon);
     

}

    public  void call(java.awt.event.ActionEvent evt) throws Exception{

     
        String xpaths[] = {
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView[2]",
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[2]",
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[3]",
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView",
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView[3]"
,
"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"        

,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView"
,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView[1]"


,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.ImageView"

,"	\n" +
"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.ImageView[3]"
,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[1]"
};
        String[] names = {"1", "3", "See All", "Rectangle", "See all songs","Recently Played","My Top Tracks","Songs","refresh","more","Playlists"};
 FileWriter fw=new FileWriter("C:\\Users\\Srishti\\OneDrive\\Desktop\\output.txt");  
        List<String> atr = new ArrayList<>();
        atr.add("text in element ");
        atr.add("isDisplayed");
        atr.add("x");
        atr.add("y");
        atr.add("width ");
        atr.add("height ");
        atr.add("isEnabled");
        atr.add("red");
        atr.add("green");
        atr.add("blue");

        atr.add("color_code");

        atr.add("isSelected");
        atr.add("isScrollable");
        atr.add("isClickable");
        atr.add("isfocusable");
        atr.add("isfocussed");
        atr.add("long-clickable");
        atr.add("checkable");
        atr.add("checked");

        atr.add("tagName: ");

        atr.add("x-avg");
        atr.add("y-avg");

        List<String> atr2 = new ArrayList<>();
        atr2.add("name");
        atr2.add("isVisible");
        atr2.add("x");
        atr2.add("y");
        atr2.add("height");
        atr2.add("width");
        atr2.add("isEnabled");
        atr2.add("red");
        atr2.add("green");
        atr2.add("blue");


        for (int i = 0; i < 11; i++) {

            String s = xpaths[i];
            String n = names[i];

            String res = "";
            List<String> r2 = new ArrayList<>();
            List<String> r1 = new ArrayList<>();

fw.write(n);


            Iterator<String> iter = atr.iterator();
            Iterator<String> iter2 = atr2.iterator();
            try {
                id1.setText(s);
                ele_name.setText(n);

                Thread.sleep(100);
                r1 = appValues.openCalculator(s, driver1);

                for (String x : r1) {
                    res = res + iter.next() + ": " + x + "\n";
                }
fw.write("\n"+res);
                textArea1.setText(res);
                res = "";
                r2 = screen1json.compareWith(n);
                for (String x : r2) {
                    res = res + iter2.next() + ": " + x + "\n";
                }
fw.write("\n"+res);
                textArea2.setText(res);

                boolean b = Comparision.compare(r1, r2);
//fw.write("\n"+r1.toString());
//fw.write("\n"+r2.toString());
                if (b) {
                    textArea3.setText("TRUE");
fw.write("\nRESULT: TRUE");
fw.write("\n\n");
                } else {
                    textArea3.setText("FALSE");
fw.write("\nRESULT: FALSE");
fw.write("\n\n");
                }
        
                

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

//Thread.sleep(1000);
//jTextField1.setText(" SCREEN 1 COMPLETED");


//Thread.sleep(1000);
driver1=OpenApp.click_button(driver1,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[1]");


image();

String screen2[]={

"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView",
"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView",
"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView",
"/android.widget.LinearLayout[@content-desc=\"Songs\"]/android.widget.TextView",
"//android.widget.LinearLayout[@content-desc=\"Playlists\"]",
"//android.widget.LinearLayout[@content-desc=\"Artists\"]/android.widget.TextView"

};

String names2[]={"Library","Search","Search icon","Songs","Playlists","Artists"};



  for (int i = 0; i < 6; i++) {

            String s = screen2[i];
            String n = names2[i];

            String res = "";
            List<String> r2 = new ArrayList<>();
            List<String> r1 = new ArrayList<>();

fw.write(n);


            Iterator<String> iter = atr.iterator();
            Iterator<String> iter2 = atr2.iterator();
            try {
                id1.setText(s);
                ele_name.setText(n);

                Thread.sleep(100);
                r1 = appValues.openCalculator(s, driver1);

                for (String x : r1) {
                    res = res + iter.next() + ": " + x + "\n";
                }
fw.write("\n"+res);
                textArea1.setText(res);
                res = "";
                r2 = screen1json.compareWith(n);
                for (String x : r2) {
                    res = res + iter2.next() + ": " + x + "\n";
                }
fw.write("\n"+res);
                textArea2.setText(res);

                boolean b = Comparision.compare(r1, r2);
//fw.write("\n"+r1.toString());
//fw.write("\n"+r2.toString());
                if (b) {
                    textArea3.setText("TRUE");
fw.write("\nRESULT: TRUE");
fw.write("\n\n");
                } else {
                    textArea3.setText("FALSE");
fw.write("\nRESULT: FALSE");
fw.write("\n\n");
                }
      

                

            } catch (Exception e) {
                e.printStackTrace();
            }

        }




driver1=OpenApp.click_button(driver1,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
image();

//screen3






String screen3[]={
"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]",
"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]",
"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]",
"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[3]",
"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[4]",
"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[5]",
"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView",
"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"

};
String names3[]={"more","splash_icon","Last Added","Play","Play all","Shuffle Play","List","listblack"};


for (int i = 0; i < 8; i++) {

            String s = screen3[i];
            String n = names3[i];

            String res = "";
            List<String> r2 = new ArrayList<>();
            List<String> r1 = new ArrayList<>();

fw.write(n);


            Iterator<String> iter = atr.iterator();
            Iterator<String> iter2 = atr2.iterator();
            try {
                id1.setText(s);
                ele_name.setText(n);

               // Thread.sleep(100);
                r1 = appValues.openCalculator(s, driver1);

                for (String x : r1) {
                    res = res + iter.next() + ": " + x + "\n";
                }
fw.write("\n"+res);
                textArea1.setText(res);
                res = "";
                r2 = screen1json.compareWith(n);
                for (String x : r2) {
                    res = res + iter2.next() + ": " + x + "\n";
                }
fw.write("\n"+res);
                textArea2.setText(res);

                boolean b = Comparision.compare(r1, r2);
                if (b) {
                    textArea3.setText("TRUE");
fw.write("\nRESULT: TRUE");
fw.write("\n\n");
                } else {
                    textArea3.setText("FALSE");
fw.write("\nRESULT: FALSE");
fw.write("\n\n");
                }
      

                

            } catch (Exception e) {
                e.printStackTrace();
            }

        }


  jTextField1.setText("OVERALL RESULT : FAIL");

fw.close();





    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField click;
    private javax.swing.JButton clickbutton;
    private javax.swing.JTextField ele_name;
    private javax.swing.JLabel id;
    private javax.swing.JTextField id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel resultpf;
    private javax.swing.JButton start;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    private java.awt.TextArea textArea3;
    // End of variables declaration//GEN-END:variables
}
