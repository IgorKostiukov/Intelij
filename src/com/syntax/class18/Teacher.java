package com.syntax.class18;

public class Teacher {
    String name;
    String subject;
   void teachs(){
        System.out.println(name+" Starts teaching "+subject);
    }
}
class MathTeacher extends Teacher{
    MathTeacher(String name,String subject) {
        this.name=name;
        this.subject=subject;

    }

    }

class ChemistryTeacher extends Teacher{
    ChemistryTeacher(String name,String subject) {
        this.name=name;
        this.subject=subject;

    }

}
class PianoTeacher extends Teacher{

    PianoTeacher(String name,String subject) {
        this.name=name;
        this.subject=subject;

    }
}
class Tester{
    public static void main(String[] args) {
        MathTeacher m1=new MathTeacher("Yaya","Math");
        ChemistryTeacher m2=new ChemistryTeacher("Lulu","Chemistry");
        PianoTeacher m3=new PianoTeacher("Bobo","Piano");
        m1.teachs();
        m2.teachs();
        m3.teachs();
    }
}
