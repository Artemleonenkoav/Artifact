package com.company;

public class Main {

    public static void main(String[] args) {
	Artifact first = new Artifact("Первый артефакт который хранится в музее под номером",545454);
	Artifact second = new Artifact("Второй артефакт который хранится в музее под номером",547412,21);
	Artifact third = new Artifact("Третий  артефакт который хранится в музее под номером","Ацтеки",123231,22);
        System.out.println(first.name);
        System.out.println(first.number);


        }

    }
