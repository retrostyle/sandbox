#Sandbox

A clean Java / Maven / Gradle / No- My- SQL / REST Project for rapidly testing some cool stuff


##Getting started

Create deployable .war  wtih 

Maven = `mvn clean package`<br>
Gradle = `gradle clean war`

copy the generated .war in /target or /build to your autodeploy directory to your running Application Server.

Now you can run the Servlet under:

`http://localhost:8080/sandbox/Servlet`

or the JSP file under:

`http://localhost:8080/sandbox/`

that's it.

##Working with maven

###Artifact handling with Archiva

It is required to have archiva installed on your pc @ /localhost:8080

Be sure you have no Application Server still running

Copy the settings.xml under _settings folder to your
	_Maven install: $M2_HOME/conf/settings.xml_
	_user's install: ${user.home}/.m2/settings.xml_

Go into the sandbox directory and run on command line
	_mvn clean package deploy_

5. With the Ant



###How to use cobertura code coverage

To work with Cobertura CodeCoverage use one of these maven goals.

* _cobertura:check_ Check the Last Instrumentation Results.
* _cobertura:clean_ Clean up rogue files that cobertura maven plugin is tracking.
* _cobertura:dump-datafile_ Cobertura Datafile Dump Mojo.
* _cobertura:instrument_ Instrument the compiled classes.
* _cobertura:cobertura_ Instruments, Tests, and Generates a Cobertura Report.

Example:

`mvn clean package cobertura:cobertura`


##Requirements

Archiva with standard options (Snapshot and Internal repository)
Insalled Maven 3.0.3


##ToDo

- Add MySQL
- Add NoSQL
- Add Maven
- Add Gradle
- Add REST
- Test on JBoss

##Gotchas

- If you have an 401 error on archive an artifact to your archiva repository be sure
that you have copyed the settings.xml 

- If you develop on your localhost and use archiva and a running Application Server be sure you have configured two different Ports. `:8080` & `:8181`


##Test system

All things are tested on:

- Mac OS X 10.8.2
- Procesor: 2.2 GHz Intel Core i7
- Memory: 8GB 1333 MHz DDR3
- GNU bash, version 3.2.48(1)-release (x86_64-apple-darwin12)
- Build-Jdk: 1.7.0_07
 
###Tested on

- Glassfish 3.1.2
- Apache Tomcat / 7.0.33
	

##License

_Copyright (c) 2012 Christian Soth<br>
See the file license.txt for copying permission._
