class Animal
{
void sound()
{
System.out.println("Animal makes sound");
}
}
class Dog extends Animal
{
void sound()
{
// super.sound(); if we want to print parent class then use super keyword
System.out.println("Dog barks");
}
public static void main(String[] arg)
{
Animal a =new Dog();
a.sound();
}
}

// output child class