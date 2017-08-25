# BridgeDesignPattern (Structural Design Pattern)

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
