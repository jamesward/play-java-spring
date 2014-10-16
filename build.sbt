name := "play-java-spring"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaCore,
  javaWs % "test",
  "com.h2database" % "h2" % "1.4.181",
  "org.springframework" % "spring-context" % "4.0.4.RELEASE",
  "org.springframework" % "spring-orm" % "4.0.4.RELEASE",
  "org.springframework" % "spring-jdbc" % "4.0.4.RELEASE",
  "org.springframework" % "spring-tx" % "4.0.4.RELEASE",
  "org.springframework" % "spring-expression" % "4.0.4.RELEASE",
  "org.springframework" % "spring-aop" % "4.0.4.RELEASE",
  "org.springframework" % "spring-test" % "4.0.4.RELEASE" % "test",
  "org.hibernate" % "hibernate-entitymanager" % "4.3.5.Final",
  "cglib" % "cglib" % "2.2.2",
  "javax.inject" % "javax.inject" % "1"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)
