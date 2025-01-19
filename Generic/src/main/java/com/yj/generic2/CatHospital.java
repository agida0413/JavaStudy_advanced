package com.yj.generic2;

public class CatHospital {

    private Cat animal;

    public void set(Cat animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물이름: "+animal.getName());
        System.out.println("동물크기: "+animal.getSize());

        animal.sound(); 
    }

    public Cat bigger(Cat target){
        return animal.getSize() > target.getSize() ? animal :target;
    }


}