#Sandbox

A clean Java / Maven / Gradle / No- My- SQL / REST Project for rapidly testing some cool stuff


##Getting started

Create deployable .war  wtih 

- Maven<br/>
`mvn clean package`<br/>
package generates the war.<br>
`mvn clean install` <br>
install copied the .war to /.m2/repository/... and includes the goal package

- Gradle<br/>
`gradle clean war`

copy your generated .war from /target or /build into your autodeploy directory from the running Application Server.

Now you can run the Servlet under:

- `http://localhost:8080/sandbox/Servlet`

or the JSP file under:

- `http://localhost:8080/sandbox/`

that's it.

##Working with a build automation tool

###Artifact handling with Archiva

It is required to have archiva installed on your pc standard is /localhost:8080

Be sure you have no Application Server running or you get the error port is in use.

Copy the settings.xml from the _settings folder in this prject to your

###Maven
- Maven install<br/>
`$MAVEN2_HOME/conf/settings.xml`

- User's install<br/>
`${user.home}/.m2/settings.xml`

Go into the sandbox directory and run on command line

- `mvn clean package deploy`

#####How to use cobertura code coverage

To work with Cobertura CodeCoverage use one of these maven goals.

* _cobertura:check_ Check the Last Instrumentation Results.
* _cobertura:clean_ Clean up rogue files that cobertura maven plugin is tracking.
* _cobertura:dump-datafile_ Cobertura Datafile Dump Mojo.
* _cobertura:instrument_ Instrument the compiled classes.
* _cobertura:cobertura_ Instruments, Tests, and Generates a Cobertura Report.

Example:

- `mvn clean package cobertura:cobertura`

The reports can be find under 

- `target/site/cobertura/index.html`

###Gradle
To use the gradle build tool to the root directory of sandbox and run following command to build a jar.

- `gradle jar `

If you would like to upload the artifact to archiva use

- `gradle jar upload`

#####Gradle Cobertura Plugin

- `gradle cobertura`

Executes tests and generates a cobertura code coverage report in this directory

- `build/reports/cobertura`

For more information and settings for this task visit

[https://github.com/valkolovos/gradle_cobertura/wiki](https://github.com/valkolovos/gradle_cobertura/wiki)

#####Gradle Checkstyle Plugin

The checkstyle plugin run the configured checkstyle.xml modules in

- `config/checkstylecheckstyle.xml`

To run the checkstyle analysis run following command.

- `gradle check`


For more cool checkstyles visite

[available checks](http://checkstyle.sourceforge.net/availablechecks.html)

PropertyTypes

[property types](http://checkstyle.sourceforge.net/property_types.html)


##Requirements

Archiva with standard options (Snapshot and Internal repository)
Insalled Maven 3.0.3


##ToDo

- Add MySQL Description
- Add Stateless & Statefull EJB
- Add NoSQL
- Add REST

##Gotchas

- By calling the URL for the Servlet and or JSP file 
take care of case sensitivity.

- If you have an 401 error on archive an artifact to your archiva repository be sure
that you have copyed the settings.xml 

- If you develop on your localhost and use archiva and a running Application Server be sure you have configured two different Ports. `:8080` & `:8181`


##Test systems


###Application Server

- Glassfish 3.1.2
- Apache Tomcat / 7.0.33
	

##MIT-License

_Copyright (c) 2012 Christian Soth<br>
See the file license.txt for copying permission._
