package Abstraction;

public class Triangle extends Shape{
    int base,height;

    Triangle(int base,int height){
        this.base = base;
        this.height = height;
    }
    @Override
    double area(){
        return 0.5 * this.base * this.height;
    }
}
