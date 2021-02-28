set projectLocation=C:\Users\SUPERSTAR\eclipse-workspace\ol_hrms_frameworks
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml