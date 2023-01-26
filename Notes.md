# Spring Boot Notes
### 
IoC Container IoC dependency injection (DI) olarakta bilinir. Bean'leri oluştururken dependencyleri de inject eder.

**Bean**: IoC container tarafında instantiate edilen java classlarıdır.

### @Component

Spring'e class ın bean olarak application context'e ekleneceğini belirtir.

### ComponentScan 
 * Application context'in yöneteceği bean'lerin hangi package de aranacağını belirtir. 
 * Springte main classa eklenir.

```java
@ComponentScan(basePackages = "com.example")
class In28MinutesSpringApplication {
    public static void main(String[] args) {
    }
}
```
    Spring boot otomatik olarak @SpringBootApplication annotationın kullanıldığı package ve alt packagelerde component scan yapar.

**Get Bean From The Application Context**

* Spring application context beanlerin instance'sını oluşturur ve gerekli dependencyleri inject eder.
* Manages lifecycle of beans.

```java
@SpringBootApplication
public class In28MinutesSpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(In28MinutesSpringApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        int result = binarySearch.binarySearch(new int[]{2, 5, 1, 8}, 1);
        System.out.println(result);
    }
}
```
### @Component
@Component is an annotation that allows Spring to automatically detect our custom beans.

In other words, without having to write any explicit code, Spring will:

* Scan our application for classes annotated with @Component
* Instantiate them and inject any specified dependencies into them
* Inject them wherever needed

### @Autowired
Starting with Spring 2.5, the framework introduced annotations-driven Dependency Injection. The main annotation of this feature is @Autowired. **It allows Spring to resolve and inject collaborating beans into our bean.**

