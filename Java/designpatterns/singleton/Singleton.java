package designpatterns.singleton;

//This class provides only one instance by Singleton.getInstance();
//Cannot be instantiated from outside due to the private constructor
//"private Singleton() { // empty constructor  }"
//It is based on designpattern "singleton"
//It will not be destroyed because of the static instance variable
//"private static SingleTon instance"

public class Singleton {
private static Singleton instance = null;

private Singleton() { } // this will prevent from instantiate with "new"

//instance method
public static Singleton getInstance() {
  if (instance==null)
    instance = new Singleton();
  return instance;
}
//-------add here further methods as you need
void method1 () {
	System.out.println("Singleton method");
}
}
