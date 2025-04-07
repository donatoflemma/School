package designpatterns.singleton;

// Erzeugungsmuster

public class TestSingleton {
      static public void main (String[] args) {
             Singleton st1 = Singleton.getInstance();
             st1.method1();
             Singleton st2 = Singleton.getInstance();
             st2.method1();
             if (st1==st2) System.out.println("only ONE instance");
      }
}