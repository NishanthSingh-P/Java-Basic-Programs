import java.io.*;
// Class 1
class Pet {
// attributes of class1
String name;
int age;
String breed;
// constructor of class 1
Pet(String name, int age, String breed)
{
// Assignment of current attributes
/// using this keyword with same
this.name = name;
this.age = age;
this.breed = breed;
}
}
/* Class 2 : where execution is shown
for class 1 */
public class Compare {
// Main driver method
public static void main(String args[])
{
// Objects of class1 (auxiliary class)
// are assigned value */
Pet dog1 = new Pet("Snow", 3, "German Shepherd");
Pet cat = new Pet("Jack", 2, "Tabby");
Pet dog2 = new Pet("Snow", 3, "German Shepherd");
// Checking objects are equal and
// printing output- true/false
System.out.println(dog1.equals(dog2));
}
}