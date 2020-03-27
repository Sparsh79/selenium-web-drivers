name := "selenium-try-1"

version := "1.3.8"

scalaVersion := "2.12.8"
//enablePlugins(TestNGPlugin)

libraryDependencies += "org.scalactic" %% "scalactic" % "3.1.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % "test"

// https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver
libraryDependencies += "org.seleniumhq.selenium" % "selenium-chrome-driver" % "4.0.0-alpha-4"
libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "4.0.0-alpha-4"
// https://mvnrepository.com/artifact/org.testng/testng
libraryDependencies += "org.testng" % "testng" % "7.1.0" % Test
// https://mvnrepository.com/artifact/org.uncommons/reportng
libraryDependencies += "org.uncommons" % "reportng" % "1.1.4" % Test
// https://mvnrepository.com/artifact/velocity/velocity-dep
libraryDependencies += "velocity" % "velocity-dep" % "1.4"
// https://mvnrepository.com/artifact/com.google.inject/guice
libraryDependencies += "com.google.inject" % "guice" % "3.0"
