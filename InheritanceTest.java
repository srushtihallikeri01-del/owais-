class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dogs extends Animal{
    void sound(){
        System.out.println("barking");
    }
}
public class InheritanceTest{
    public static void main(String[]args){
        Dogs d=new Dogs();
        d.sound();
        d.eat();
    }
}