package OverloadedConstructors;

public class User {


    String userName;
    String email;
    int age;

    User(){
        this.userName  = "Guest";
        this.age = 0;
        this.email = null;
    }
    User(String userName,String email){
        this.userName = userName;
        this.email = email;
    }
    User(String userName){
        this.userName = userName;
        this.age = 0;
        this.email = null;
    }

}
