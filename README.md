Run tests using 
```
mvn test
```

Find reports at

```
target/cucumber/cucumber-html-reports/overview-features.html
```

#### Dependency Injection
As we used `cucumber-picocontainer`, injecting the classes per is taken care by pico. 
For parallel execution With surefire, a new singleton will be injected. 

#### Parallel execution
This is take care by maven surefire plugin with below config in the pom.xml
```
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.0</version>
                <configuration>
                    <parallel>methods</parallel>
                    <useUnlimitedThreads>true</useUnlimitedThreads>
                </configuration>
            </plugin>
```


PENDING
1. TAGS - Done 
    `mvn test -Dcucumber.options='--tags "@simple"'`
    Above runs only features & scenarios that are tagged as @simple
2. Project related info for reports
3. Gradle file with parallel execution
    