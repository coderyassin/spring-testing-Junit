package org.yascode.springtest.junit;

import lombok.Data;

@Data
public class Student {

    private String name;
    private String age;

    public String findById(int id){
        if(id == 5) return "Yasin";
        else if(id == 6) return "Ahmed";
        else return null;
    }

    public void getException(){
        throw new SpecialException();
    }

}
