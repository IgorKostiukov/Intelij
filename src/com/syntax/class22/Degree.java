package com.syntax.class22;

public class Degree {
   void getPrerequisite(){
        System.out.println("to get a degree you need a high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree {
    @Override
    void getPrerequisite() {
        System.out.println("Lol");
    }
}
class Test {
    public static void main(String[] args) {
        Masters masters= new Masters();
        Bachelors bachelors=new Bachelors();
        Degree degree=new Degree();
                degree.getPrerequisite();
        bachelors.getPrerequisite();
        masters.getPrerequisite();
    }
}

