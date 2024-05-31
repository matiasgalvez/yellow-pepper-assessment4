# yellow-pepper-assessment4


This is an automation project that uses Serenity BDD and Rest Assured for the
creation of an Automation Framework that allows testing of the exposed APIs by
[Swagger PetStore Project](https://github.com/swagger-api/swagger-petstore) running in a local environment


***

## Languages & Frameworks

This project uses the following languages and frameworks:

* [Serenity BDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html) as automated testing framework.
* [Rest Assured](https://rest-assured.io/) as framework to test and validate REST services in Java.
* [Cucumber](https://cucumber.io/) as BDD testing software.
* [Java 15](https://www.azul.com/blog/jdk-15-release-64-new-features-and-apis) as programming language.
* [Gradle](https://gradle.org/) as compilation tool.

***

## Prerequisites

1. Download Java 15 JDK.
2. Install [Git](https://git-scm.com)
3. Install [Gradle](https://gradle.org/install/)

**Note**: `build.gradle` has all the necessary configuration for the proyect.

Additional plugins:

1. [x] *JUnit*
2. [x] *Cucumber for Java*
3. [x] *Gherkin*

***

### Test Cases

Happy path and Unhappy Path for an endpoint of each Request Type.

> **FEATURE**: PetStore | Get Pet Data
> - [x] [TC-001] Validate that sending a Request to get Pet details with an existing id works **Happy Path**
> - [x] [TC-002] Validate that send a Request to get Pet details with a non-existing id errors **Unhappy Path**
>
> **FEATURE**: PetStore | Pet Creation
> - [x] [TC-003] Validate that sending a Request to create a Pet with valid data works **Happy Path**
> - [x] [TC-004] Validate that sending a Request to create a Pet with invalid data errors **Unhappy Path**
>
> **FEATURE**: PetStore | Order Deletion
> - [x] [TC-005] Validate that sending a Request to Delete an order with a valid id works **Happy Path**
>
> **FEATURE**: PetStore | Pet Update
> - [x] [TC-006] Validate that sending a Request to update a Pet with valid data works **Happy Path**
> - [x] [TC-007] Validate that sending a Request to update a Pet with invalid data errors **Unhappy Path**

***

## Project Structure

```Gherkin
src
+ main                                      | Source main
  + test                                    |
    + java                                  |
      + runner                              | Responsible for executing feature scenarios
      + steps                               | Sets of test steps
      + utils                               | Common class constructors used in steps
    + resources                             |
      + features                            | 
        +feature files                      | Feature files to be executed by the runner
+ build.gradle                              | Gradle Configuration
+serenity.properties                        | Serenity general properties
+settings.gradle                            |
```

***

## Project Execution:

1. Download the project from GitHub
    * **Option 1** (HTTPS): `https://github.com/matiasgalvez/yellow-pepper-assessment4.git`
    * **Option 2** (SSH): `git@github.com:matiasgalvez/yellow-pepper-assessment4.git`
    * **Option 3:** Download as ZIP file and extract it

2. Standing in project root run the following command in terminal `./gradlew build`

3. Execute tests by going to the runner folder and executing `SerenityRunnerTest`

***

## Test Reports

The test report will be generated with each runner run in `target/site/serenity/index.html`.
