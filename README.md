# Geekdemy - LLD

* Machine Coding Problem Statement:  https://www.geektrust.com/coding/detailed/geekdemy.
* This problem is solved during Code with Geektrust Hackathon on May 2 2024. 
* The low level design code reads data input from file . After reading the input commands, processes them & prints output on command line interface.

* This code has earned all the required badges : Maintanability , Readability , Tests , Correctness , Build.

  ![1714580358829](https://github.com/AvirupMazumder/Geekdemy-Challenge-Geektrust/assets/80705801/9cefc705-ae33-4c5d-b29a-c304b400f2e8)

# Pre-requisites
* Java 1.8/1.11/1.15
* Gradle 6

# How to run the code

We have provided scripts to execute the code. 

Use `run.sh` if you are Linux/Unix/macOS Operating systems and `run.bat` if you are on Windows.

Internally both the scripts run the following commands 

 * `gradle clean build -x test --no-daemon` - This will create a jar file `geektrust.jar` in the `build/libs` folder.
 * `java -jar build/libs/geektrust.jar sample_input/input1.txt` - This will execute the jar file passing in the sample input file as the command line argument

 Use the build.gradle file provided along with this project. Please change the main class entry under the `jar` task

 ```
 manifest {
        attributes 'Main-Class' : 'com.geektrust.backend.App' //Change this to the main class of your program which will be executed
    }
```
in the build.gradle if your main class has changed.

 # How to execute the unit tests

 `gradle clean test --no-daemon` will execute the unit test cases.

# Help

You can refer our help documents [here](https://help.geektrust.in)
You can read build instructions [here](https://github.com/geektrust/coding-problem-artefacts/tree/master/Java)
