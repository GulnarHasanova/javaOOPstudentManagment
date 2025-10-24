package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager   {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student>students = new ArrayList<>();
    public void  addStudent(){
        Student student = new Student();
        System.out.println("id-i daxil et:");
        long id = scanner.nextLong();
        while(checkIfIdExists(id)){
            System.out.println("bu idli sexs artiq movcuddur.");
            System.out.println("id-i daxil et:");
            id = scanner.nextLong();
            scanner.nextLine();
        }
        System.out.println("adi daxil et:");
        String name =scanner.next();
        scanner.nextLine();
        System.out.println("soyadi daxil et:");
        String surname =scanner.next();
        scanner.nextLine();

        int age = -1;
        while (age <= 0) {
            System.out.println("yas daxil et:");

            try {
                age = scanner.nextInt();
                scanner.nextLine(); // Həmişə bufferi təmizlə

                if (age <= 0) {
                    System.out.println("Yasi duzgun daxil edin (0-dan böyük olmalıdır).");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("XƏTA: Yaş yalnız rəqəm olmalıdır! Yenidən cəhd edin.");

                scanner.nextLine();

                // burda age menfi edirem ki dovr yeniden baslasin
                age = -1;
            }
        }

        student.setAge(age);
        student.setId(id);
        student.setName(name);
        student.setSurname(surname);
        students.add(student);
        System.out.println(name +" "+ surname+" daxil edildi");


    }
    public void showAllStudents(){
        students.forEach(System.out::println);


    }

    public void findById(){
        System.out.println("id-i daxil et:");
       long id =scanner.nextLong();

        System.out.println(students.stream().filter(student ->student.getId()==id ).findFirst().orElse(null));
    }

    public void deleteStudent(){
        System.out.println("adi daxil et:");
        scanner.nextLine();
        String name =scanner.nextLine();

       students.removeIf(student -> student.getName().equals(name));

    }

    public int selectionMenu(){
        System.out.println("istifade etmek istediyiniz methodu secin.");
        System.out.print("" +
                "1)id ile tap\n" +
                "2)butun telebeleri goster\n" +
                "3)telebeni adiyla sil\n" +
                "4)telebe daxil et\n");
        int selection = scanner.nextInt();
        switch (selection){
            case 1->
                this.findById();
            case 2->
                this.showAllStudents();
            case 3->{

                this.deleteStudent();

            }
            case 4->
                this.addStudent();
            default -> System.out.println("duzgun secim edin");

        }
        return selection;
    }

    private boolean checkIfIdExists(long checkId) {
        // Lambda burada xarici metodun dəyişəninə müraciət etmir,
        // sadəcə parametr olaraq ötürülən 'checkId'-dən istifadə edir.
        return students.stream().anyMatch(stu -> stu.getId() == checkId);
    }

}
