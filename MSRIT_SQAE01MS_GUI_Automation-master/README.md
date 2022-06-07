# MSRIT_SQAE01MS_GUI_Automation
SRIB-PRISM Program
### GUI PROJECT
# About The Project
•	An application used for testing Graphical User Interface (GUI).
<br/>
•	Automated GUI testing tools are highly needed in order to save software development time and cost.
<br/>
•	This application will extract details from mobile app automatically and compare them to the json values from the testing dataset.
# Technologies and Language Used
•	Appium
<br/>
•	Appium Inspector
<br/>
•	JAVA
<br/>
# Design of the Application
•	The application consists of 2 main pages.
<br />
 ###	Page 1
The user needs to enter the device name, udid, platform version, platform name for the device on which the app would be running.
Also, the user needs to enter the app package and app activity corresponding to which the app will be opened automatically in the connected device.
![Screenshot (191)](https://media.github.ecodesamsung.com/user/14793/files/d5e4a33c-0111-4a6d-9ef2-1d66223aebe4)

###	Page 2
![Screenshot (190)](https://media.github.ecodesamsung.com/user/14793/files/4bdb4733-04e5-484d-9f04-0d9467e1f0b7)


This page is used for following functions: -
1.	START BUTTON:
For automatically extracting all the elements details on the current screen and extracting the corresponding value from json file , giving the appropriate comparison result.

2.	 CLICK BUTTON:
If the user wants to switch between the screens, he/she must do it manually by entering XPATH of the element which needs to be clicked in order to move to the next screen.

3.	SUBMIT BUTTON:
If the user wants to compare any one specific element, they must enter its xpath for it to be extracted and its element name corresponding to the json file. By clicking on submit button, the values will be extracted and shown in the application.
FLOW CHART FOR THE WORKING OF THE APP
•	Extraction of element xpath from appium inspector.
•	Extracting information by using the xpath through appium.
•	Extracting the element information from the json file.
•	Comparing the two set of values.
•	Displaying the result based on the comparison.

4. DISPLAY SCREEN:</br>
 When clicked, the current screen opened on the device will be displayed in the application.
# REQUIREMENTS FOR THE DESIGNED APPLICATION: -
1.	Appium Server should be installed on the system on which the designed application is running.
2.	In order to extract xpath for switching between screens, Appium Inspector has to be used.
3.	The json file should be in a specific format. We have provided with a json file (sample.json) which can be referred for required format.The json files should be named according to increasing order of integers such that(1.json , 2.json etc.).
4.	Only the elements which could be found in a json file will be extracted and compared.
# OUTPUT FOR VALIDATION: -
1.	The screenshots of all the elements for which the comparison was done and the result was not true, will be stored in a screenshots folder for easy validation.
2.	The two sets of extracted value along with result are stored in a text file output.txt for future validation.

# STEPS TO RUN THE PROJECT
1. Connect the mobile device to the system (wired connection).</br>
2. Go to the device.java file and run the file.</br>
3. A window like this will open.</br></br>
![Screenshot (191)](https://media.github.ecodesamsung.com/user/14793/files/0c088734-8f2d-4ed2-aa23-173ec66ab31d)
Fill in all the required details and click start.</br></br>
4.The app will be automatically opened in the mobile. When the app is opened successfully , following window will be displayed.
![Screenshot (189)](https://media.github.ecodesamsung.com/user/14793/files/83a988b6-6082-4eab-9122-21bedb974ad9)</br></br>
5.Use display screen button in order to display the current screen, start for button for automatic comparison for current screen elements, click button to click on a particular elements(or to switch between screens) and submit button in order to compare specific element whose xpath and name is given as input.

