# Design Patterns in Java
A Maven-based repository to learn and implement design patterns in Java.
## How to Run
- Compile: [INFO] Scanning for projects...
[INFO] 
[INFO] --------------< com.designpatterns:design-patterns-java >---------------
[INFO] Building design-patterns-java 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ design-patterns-java ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/urviash/Learning/design-patterns-java/src/main/resources
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ design-patterns-java ---
[INFO] Changes detected - recompiling the module! :input tree
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 3 source files with javac [debug target 11] to target/classes
[WARNING] system modules path not set in conjunction with -source 11
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.651 s
[INFO] Finished at: 2025-03-20T16:46:09+05:30
[INFO] ------------------------------------------------------------------------
- Run Singleton Demo: [INFO] Scanning for projects...
[INFO] 
[INFO] --------------< com.designpatterns:design-patterns-java >---------------
[INFO] Building design-patterns-java 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- exec:3.1.0:java (default-cli) @ design-patterns-java ---
[WARNING] 
java.lang.ClassNotFoundException: com.designpatterns.creational.singleton.SingletonDemo
    at org.codehaus.mojo.exec.URLClassLoaderBuilder$ExecJavaClassLoader.loadClass (URLClassLoaderBuilder.java:198)
    at java.lang.ClassLoader.loadClass (ClassLoader.java:521)
    at org.codehaus.mojo.exec.ExecJavaMojo$1.run (ExecJavaMojo.java:271)
    at java.lang.Thread.run (Thread.java:833)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.539 s
[INFO] Finished at: 2025-03-20T16:46:11+05:30
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.codehaus.mojo:exec-maven-plugin:3.1.0:java (default-cli) on project design-patterns-java: An exception occurred while executing the Java class. com.designpatterns.creational.singleton.SingletonDemo -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
- Run Tests: [INFO] Scanning for projects...
[INFO] 
[INFO] --------------< com.designpatterns:design-patterns-java >---------------
[INFO] Building design-patterns-java 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ design-patterns-java ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/urviash/Learning/design-patterns-java/src/main/resources
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ design-patterns-java ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ design-patterns-java ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/urviash/Learning/design-patterns-java/src/test/resources
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ design-patterns-java ---
[INFO] Changes detected - recompiling the module! :source
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file with javac [debug target 11] to target/test-classes
[INFO] -------------------------------------------------------------
[WARNING] COMPILATION WARNING : 
[INFO] -------------------------------------------------------------
[WARNING] system modules path not set in conjunction with -source 11
[INFO] 1 warning
[INFO] -------------------------------------------------------------
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /Users/urviash/Learning/design-patterns-java/src/test/java/com/designpatterns/AppTest.java:[3,23] package junit.framework does not exist
[ERROR] /Users/urviash/Learning/design-patterns-java/src/test/java/com/designpatterns/AppTest.java:[4,23] package junit.framework does not exist
[ERROR] /Users/urviash/Learning/design-patterns-java/src/test/java/com/designpatterns/AppTest.java:[5,23] package junit.framework does not exist
[ERROR] /Users/urviash/Learning/design-patterns-java/src/test/java/com/designpatterns/AppTest.java:[11,13] cannot find symbol
  symbol: class TestCase
[ERROR] /Users/urviash/Learning/design-patterns-java/src/test/java/com/designpatterns/AppTest.java:[26,19] cannot find symbol
  symbol:   class Test
  location: class com.designpatterns.AppTest
[ERROR] /Users/urviash/Learning/design-patterns-java/src/test/java/com/designpatterns/AppTest.java:[28,20] cannot find symbol
  symbol:   class TestSuite
  location: class com.designpatterns.AppTest
[ERROR] /Users/urviash/Learning/design-patterns-java/src/test/java/com/designpatterns/AppTest.java:[36,9] cannot find symbol
  symbol:   method assertTrue(boolean)
  location: class com.designpatterns.AppTest
[INFO] 7 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.746 s
[INFO] Finished at: 2025-03-20T16:46:15+05:30
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:testCompile (default-testCompile) on project design-patterns-java: Compilation failure: Compilation failure: 
[ERROR] /Users/urviash/Learning/design-patterns-java/src/test/java/com/designpatterns/AppTest.java:[3,23] package junit.framework does not exist
[ERROR] /Users/urviash/Learning/design-patterns-java/src/test/java/com/designpatterns/AppTest.java:[4,23] package junit.framework does not exist
[ERROR] /Users/urviash/Learning/design-patterns-java/src/test/java/com/designpatterns/AppTest.java:[5,23] package junit.framework does not exist
[ERROR] /Users/urviash/Learning/design-patterns-java/src/test/java/com/designpatterns/AppTest.java:[11,13] cannot find symbol
[ERROR]   symbol: class TestCase
[ERROR] /Users/urviash/Learning/design-patterns-java/src/test/java/com/designpatterns/AppTest.java:[26,19] cannot find symbol
[ERROR]   symbol:   class Test
[ERROR]   location: class com.designpatterns.AppTest
[ERROR] /Users/urviash/Learning/design-patterns-java/src/test/java/com/designpatterns/AppTest.java:[28,20] cannot find symbol
[ERROR]   symbol:   class TestSuite
[ERROR]   location: class com.designpatterns.AppTest
[ERROR] /Users/urviash/Learning/design-patterns-java/src/test/java/com/designpatterns/AppTest.java:[36,9] cannot find symbol
[ERROR]   symbol:   method assertTrue(boolean)
[ERROR]   location: class com.designpatterns.AppTest
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
## Structure
- **creational**: Creational design patterns (e.g., Singleton)
- **structural**: Structural design patterns
- **behavioral**: Behavioral design patterns
