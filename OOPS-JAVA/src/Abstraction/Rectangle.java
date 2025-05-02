package Abstraction;

public class Rectangle extends Shape{

    int l,b;

    Rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }

    @Override
    double area(){
        return this.l * this.b;
    }


}
