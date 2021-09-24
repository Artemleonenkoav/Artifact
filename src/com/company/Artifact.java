package com.company;

import java.sql.SQLOutput;

public class Artifact {
        String name;
        String nametwo;
        int number;
        int age;


        public Artifact( String name,int number) {
            this.name = name ;
            this.number = number;
        }
        public Artifact (String name,int number,int age ){
            this.name = name ;
            this.number = number;
            this.age = age ;
        }
        public Artifact (String name,String nametwo , int number,int age ){
            this.name = name ;
            this.nametwo = nametwo ;
            this.number = number;
            this.age = age ;

        }


        public static void main(String[] args) {
            Artifact first = new Artifact("Первый артефакт который хранится в музее под номером ",545454);
            Artifact second = new Artifact("Второй артефакт который хранится в музее под номером ",547412,21);
            Artifact third = new Artifact("Третий артефакт который хранится в музее под номером"," Ацтеки ",123231,22);
            System.out.print(first.name);
            System.out.println(first.number);
            System.out.print(second.name);
            System.out.print(second.number);
            System.out.println(" имеет  " + second.age+ " век");
            System.out.print(third.name);
            System.out.print(third.nametwo);
            System.out.print(third.number);
            System.out.println(" имеет " + third.age + " век");



        }
}



