# Web-Services

Author: Praveenkumar

Version History:

0.1 Initial Version
0.2 Updating instructions to use custom property to specify lib locations instead of adding libs manually
0.3 Adding Maven
Installation
In Eclipse
This assumes you have Eclipse 3.6+, m2e Maven plugin, Maven, and Git installed.

Eclipse can be downloaded at: http://download.eclipse.org
Maven can be downloaded at: http://maven.apache.org/download.html
m2e Maven plugin comes with Eclipse 3.7+ and can be installed for older versions by going to Help > Eclipse Marketplace and typing 'm2e'
Git can be downloaded at: http://git-scm.com/download
It is recommended you set up your environment in the following manner:

Create a "java" directory. Unzip Eclipse into it.

Ensue the "maven" executable is in your path. Type "mvn" on the command line if it's been correctly added to your path:

 $ mvn -v
 Apache Maven 3.0.2 (r1056850; 2016-01-08 19:58:10-0500)
 Java version: 1.6.0_24, vendor: Apple Inc.
 Java home: /System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home
 Default locale: en_US, platform encoding: MacRoman
 OS name: "mac os x", version: "10.6.8", arch: "x86_64", family: "mac"
Create a "workspace" folder in your java folder. This will be the root of your Eclipse workspace. When you start Eclipse for the first time, tell it to use this folder as the workspace folder. If you are already using Eclipse and have already designated a workspace folder, you can continue using that folder.

Then you need to install 2 additional connectors from the m2e Marketplace in Eclipse:

File > Import > Check out Maven Projects from SCM > Next
Click "m2e Marketplace" link
Select the "Axis Tools m2e" and "m2e-egit" connectors from the m2e Marketplace
Click Finish
Follow the prompts to install these connectors
Restart Eclipse once these are done installing
Once Eclipse restarts:

File > Import > Check out Maven Projects from SCM > Next
Select "git" from the dropdown
Enter git://github.com/hannonhill/Webservices-Java-Sample-Project.git into the Git URL field
Click Next
Click Finish
This will import and build the project in Eclipse.

Once built, use Git to checkout the appropriate branch of this project for your Cascade installation. For example, if you're running Cascade version 8.0.1, checkout 8.0.x: git checkout 8.0.x

To update the generated Web Services stubs to correspond to your version of Cascade:

Open the WSDL from your Cascade Server instance by going to: http://your-cascade-url/ws/services/AssetOperationService?wsdl

Save this as a file "asset-operation.wsdl".

Replace the "asset-operation.wsdl" file in src/java/wsdl inside the eclipse project with your own file.

In Eclipse, right-click the project and click Refresh. Maven should run and regenerate your stubs based on this updated WSDL file.

If for some reason it doesn't, open a command-line/terminal window to run maven.

Navigate to to the base directory where the project was created to (e.g. java/workspace/Cascade Webservices) and type the command "mvn generate-sources" You should see a successful ant build similar to:

 $ mvn generate-sources
 [INFO] Scanning for projects...
 [INFO]                                                                         
 [INFO] ------------------------------------------------------------------------
 [INFO] Building Cascade-Java-Web-Services-Example-Project 8.0.1
 [INFO] ------------------------------------------------------------------------
 [INFO] 
 [INFO] --- axistools-maven-plugin:1.4:wsdl2java (default) @ Cascade-Java-Web-Services-Example-Project ---
 [INFO] about to add compile source root
 [INFO] Processing wsdl: /Users/bradley/cascade/Webservices-Java-Sample-Project/src/java/wsdl/asset-operation.wsdl
 Jul 18, 2016 3:33:52 PM org.apache.axis.utils.JavaUtils isAttachmentSupported
 WARNING: Unable to find required classes (javax.activation.DataHandler and javax.mail.internet.MimeMultipart). Attachment support is disabled.
 [INFO] ------------------------------------------------------------------------
 [INFO] BUILD SUCCESS
 [INFO] ------------------------------------------------------------------------
 [INFO] Total time: 3.940s
 [INFO] Finished at: Mon Jul 18 15:33:55 EDT 2016
 [INFO] Final Memory: 3M/81M
 [INFO] ------------------------------------------------------------------------
Then, refresh Eclipse and your project should be built.

With Git and Maven only
This assumes you have Maven 3+ and Git installed.

Maven can be downloaded at: http://maven.apache.org/download.html
Git can be downloaded at: http://git-scm.com/download
Clone the project:

Clone this repository: git clone git://github.com/hannonhill/Webservices-Java-Sample-Project.git
Change into the directory for the newly created project
Use Git to checkout the appropriate branch of this project for your Cascade installation. For example, if you're running Cascade version 8.0.1, checkout 8.0.x: git checkout 8.0.x
Update the Web Services stubs:

Open the WSDL from your Cascade Server instance by going to: http:///ws/services/AssetOperationService?wsdl

Save this as a file "asset-operation.wsdl".

Replace the "asset-operation.wsdl" file in src/java/wsdl inside the eclipse project with your own file.

Open a command-line/terminal window to run maven.

Navigate to to the base directory where the project was unzipped to (e.g. java/workspace/Cascade Webservices) and type the command "mvn generate-sources" You should see a successful ant build similar to:
