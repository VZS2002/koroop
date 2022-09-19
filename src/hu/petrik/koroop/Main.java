package hu.petrik.koroop;

import hu.petrik.koroop.kor.Kor;

public class Main {
    public static void main(String[] args) {
        Kor[] tomb= new Kor[10];

        for (int i = 0; i < tomb.length; i++) {
            tomb[i]=new Kor();
;        }

        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }
          double a = 0;
          int index = 0;
        for (int i = 0; i < tomb.length; i++) {
           if (tomb[i].Terulet()>a)
           {
               a=tomb[i].Terulet();
               index=i;
           }
        }

        System.out.println("A legnagyobb területű kör a következő: " + tomb[index]);
    }
}
