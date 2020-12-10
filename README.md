# Selenium Web Automation

## Selenium Web Automation using Selenium, Cucumber, and Serenity.

Programming Language using Java

## Dependencies

## Selenium 
```
 <dependency>
     <groupId>org.Seleniumhq.Selenium</groupId>
     <artifactId>Selenium-java</artifactId>
     <version>3.141.59</version>
 </dependency>
```
## Cucumber
```
 <cucumber.version>4.2.0</cucumber.version>

 <dependency>
     <groupId>io.cucumber</groupId>
     <artifactId>cucumber-java</artifactId>
            <version>${cucumber.version}</version>
 </dependency>
 <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>${cucumber.version}</version>
 </dependency>
```

## Serenity
```
 <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-core</artifactId>
            <version>${serenity.version}</version>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>io.cucumber</groupId>
                    <artifactId>cucumber-core</artifactId>
                </exclusion>
            </exclusions>
 </dependency>
 <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-junit</artifactId>
            <version>${serenity.version}</version>
            <scope>test</scope>
 </dependency>
 <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-cucumber4</artifactId>
            <version>${serenity.cucumber.version}</version>
            <scope>test</scope>
 </dependency>
 <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-screenplay</artifactId>
            <version>${serenity.version}</version>
            <scope>test</scope>
 </dependency>
```


