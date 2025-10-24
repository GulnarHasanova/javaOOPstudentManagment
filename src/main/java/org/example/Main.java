package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentManager student = new StudentManager();
     while (true){
         try {
             student.selectionMenu();


         } catch (InputMismatchException e) {
             System.out.println("duzgun sec");
             // ƏSAS DÜZƏLİŞ: Səhv girişi buffer-dən təmizlə!
             // Əks halda sonsuz dövr yaranacaq.
             student.scanner.nextLine();
         }
     }
    }
}