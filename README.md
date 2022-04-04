# DependencyInversionPrinciple
         
          The Dependency Inversion Principle represent the "D" of the five SOLID Principle of OOPs.It states 
 that,High level modules should not depend on low level module,both should depend on abstraction.Abstraction 
 should not depend on details,Details should depend on abstraction. 

          In these project,consider an electric switch that turns lightbulb and fan on or off.There are 
three classes 'ElectricPowerSwitch','LightBub' and 'Fan'."LightBulb" and "Fan" classes has two methods
 turnOn() and turnOff(). 
         By dependency inversion principle,"LightBulb" and "Fan" implements "Switchable" interface and 
"ElectricPowerSwitch" implements "Switch" interface. 
          This shows that high level module do not depend on low level module but both of them depend on 
          abstractions.

 JunitTest:
       The  Junit Test is done of all the entities in  "Dependency Inversion Principle" project and test coverage 
is 100% successful in jacoco report.

       
  SONARQUBE :
          In sonarqube,reliability ,security , securityReview and maintainability is A and 
the code coverage is 100%. 
       
  SONARQUBE 
  
  gradle command to publish code to sonarqube
    gradle sonarqube
       -Dsonar.projectKey=DependencyInversionPrinciple
       -Dsonar.host.url=http://localhost:9000
       -Dsonar.login=a1f6a51f2c4769664d04b338e860477b52b960d4