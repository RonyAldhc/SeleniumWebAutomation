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

## Plugins

## Additional Plugin to Support Serenity Report
```
<plugin>
                <groupId>net.serenity-bdd.maven.plugins</groupId>
                <artifactId>serenity-maven-plugin</artifactId>
                <version>${serenity.maven.version}</version>
                <dependencies>
                    <dependency>
                        <groupId>net.serenity-bdd</groupId>
                        <artifactId>serenity-core</artifactId>
                        <version>${serenity.version}</version>
                    </dependency>
                </dependencies>
                <executions>
                    <execution>
                        <id>serenity-reports</id>
                        <phase>post-integration-test</phase>
                        <goals>
                            <goal>aggregate</goal>
                        </goals>
                    </execution>
                </executions>
 </plugin>
 
 <plugin>
                <groupId>net.serenity-bdd.maven.plugins</groupId>
                <artifactId>serenity-maven-plugin</artifactId>
                <version>${serenity.version}</version>
                <configuration>
                    <reports>single-page-html,json-summary</reports>
                </configuration>
                <executions>
                    <execution>
                        <id>serenity-reports</id>
                        <phase>post-integration-test</phase>
                        <goals>
                            <goal>aggregate</goal>
                        </goals>
                    </execution>
                </executions>
                <dependencies>
                    <dependency>
                        <groupId>net.serenity-bdd</groupId>
                        <artifactId>serenity-single-page-report</artifactId>
                        <version>2.1.4</version>
                    </dependency>
                    <dependency>
                        <groupId>net.serenity-bdd</groupId>
                        <artifactId>serenity-json-summary-report</artifactId>
                        <version>2.1.4</version>
                    </dependency>
                </dependencies>
 </plugin>
```

## Additional Plugin to Support Cucumber Connect with Serenity Report
```
 <plugin>
                <artifactId>maven-failsafe-plugin</artifactId>
                <version>${maven.failsafe.plugin.version}</version>
                <configuration>
                    <includes>
                        <include>**/*TestSuite.java</include>
                        <!--<include>**/*IT.java</include>-->
                    </includes>
                    <!--<parallel>classes</parallel>-->
                    <!--<threadCount>${parallel.tests}</threadCount>-->
                    <perCoreThreadCount>false</perCoreThreadCount>
                    <!--                    <forkCount>2C</forkCount>-->
                </configuration>
                <executions>
                    <execution>
                        <goals>
                            <goal>integration-test</goal>
                            <goal>verify</goal>
                        </goals>
                    </execution>
                </executions>
 </plugin>
```

## Additional Plugin to Run Maven 
```
<plugin>
                <artifactId>maven-clean-plugin</artifactId>
                <version>2.4.1</version>
                <executions>
                    <execution>
                        <id>auto-clean</id>
                        <phase>initialize</phase>
                        <goals>
                            <goal>clean</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
```

