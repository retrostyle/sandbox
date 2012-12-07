Sandbox
=======

A clean Java / Maven / JDBC / SQL / REST Project for rapidly testing some cool stuff


Getting started
=======

Deploy on Glassfish and now you can run the Servlet under:
- http://localhost:8080/sandbox/Servlet

or the JSP file under:
- http://localhost:8080/sandbox/


Create deployable .war  wtih 
- mvn clean package

now you can move the file under /target to your autodeploy folder.


Handle with Artifacts (Archiva & Maven)
=======

1. It is required to have archiva installed on your pc @ /localhost:8080

2. Be sure you have no Application Server still running

3. Copy the settings.xml under _settings folder to your
Maven install: $M2_HOME/conf/settings.xml
user's install: ${user.home}/.m2/settings.xml

4. Go into the sandbox directory and run on command line
- mvn clean install package deploy

5. With the Art


Requirements
=======
Archiva with standard options (Snapshot and Internal repository)
Insalled Maven 3.0.3

Tested on
=======

Glassfish 3.1.2
Apache Tomcat / 7.0.33


ToDo
=======

- Add MySQL
- Add NoSQL
- Add Maven
- Add Gradle
- Add REST
- Test on JBoss

Gootchas
=======

If you have an 401 error on archive an artifact to your archiva repository be sure
that you have copyed the settings.xml 


Testsystem
=======

All things are tested on:
	Mac OS X 10.8.2
	Procesor: 2.2 GHz Intel Core i7
	Memory: 8GB 1333 MHz DDR3
	Build-Jdk: 1.7.0_07