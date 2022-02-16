# annotation-processor
Java custom annotation processor


```java
package com.annotation;

public class Main {

    public static void main(String[] args) {
        // The @BuilderProperty creates the dynamic builder class for Person with the help of annotation processor
        Person person = new PersonBuilder().setAge(29).setName("Ram").build();
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
```
* In the above class the IDE shows the error for _PersonBuilder_ class since the class is only created at the time of compile.
* To test this project first need to build the project from the parent module.
* Then run the annotation-demo.jar with the following command.
```cmd
target> java -cp annotation-demo.jar com.annotation.Main
```
