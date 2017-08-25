# BridgeDesignPattern (Structural Design Pattern)

As per GoF Bridge design pattern "Decouple an abstraction from its implementation so that the two can vary independently" which allow abstraction class and concrete class to change independently and dosnt bound abstraction and implementation at compile time.

It also follows the notion to prefer Composition over inheritence


Without Bridge pattern:
```java
        A                        
     /     \
    Aa      Ab
   / \     /  \
 Aa1 Aa2  Ab1 Ab2           
 
             ----Shape---
            /            \
      Square              Circle
     /      \            /      \
BlueSquare  RedSquare BlueCircle RedCircle
```

After Bridge pattern Refactor to:

```java
     A         N
  /     \     / \
Aa(N) Ab(N)  1   2


      ----Shape---                        Color
     /            \                       /   \
Square(Color)   Circle(Color)           Blue   Red
```
