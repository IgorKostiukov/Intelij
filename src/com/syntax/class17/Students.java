package com.syntax.class17;

public class Students {

    Students(String name,String subject1,String subject2,String subject3,int grade1,int grade2,int grade3){
        char gradeLettter=' ';
        int aver=0;
        aver=(grade1+grade2+grade3)/3;
        if (aver >80 ){
            gradeLettter='A';
        } else if (aver >60 &&aver <80) {
            gradeLettter='B';
        } else if(aver >40 && aver<60){
            gradeLettter='C';
        } else if (aver >20 && aver <40){
            gradeLettter='D';
        } else if (aver<20){
            gradeLettter='F';
        }

        System.out.println(gradeLettter);
    }
}
