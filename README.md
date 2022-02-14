# DependencyInversionPrinciple
          The Dependency Inversion Principle represent the "D" of the five SOLID Principle of OOPs.It states 
 that,High level modules should not depend on low level module,both should depend on abstraction.Abstraction 
 should not depend on details,Details should depend on abstraction. 

          In these project,consider an electric switch that turns a lightbulb and fan on or off.There are 
three classes 'ElectricPowerSwitch','LightBub' and 'Fan'.In lightbulb and Fan classes we have two methods
 turnOn() and turnOff() to turn 
 light on or off .By dependency inversion principle, now make two interfaces 'Switch' and 'Switchable' where 
 lightBulb implements switchable and electricPowerSwitch implements switch which referred the switchable 
 interface instead of any concrete classes in a field. This shows that high level module do not depend on 
 low level module but both of them depend on abstractions.

 JunitTest:
        There is JUnit Test also present for all Dependency Inversion Principle and test coverage are 100%
  successful by jacoco reports.
       
  SONARQUBE 
  
  gradle command to publish code to sonarqube
    gradle sonarqube
       -Dsonar.projectKey=DependencyInversionPrinciple
       -Dsonar.host.url=http://localhost:9000
       -Dsonar.login=a1f6a51f2c4769664d04b338e860477b52b960d4