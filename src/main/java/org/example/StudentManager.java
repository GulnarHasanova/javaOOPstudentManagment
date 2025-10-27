package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager   {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student>students = new ArrayList<>();
    public void  addStudent(){
        Student student = new Student();
        System.out.println("Enter the id:");
        long id = scanner.nextLong();
        while(checkIfIdExists(id)){
            System.out.println("This ID is already in use.");
            System.out.println("Enter the id");
            id = scanner.nextLong();
            scanner.nextLine();
        }
        System.out.println("Enter the name:");
        String name =scanner.next();
        scanner.nextLine();
        System.out.println("Enter the surname:");
        String surname =scanner.next();
        scanner.nextLine();

        int age = -1;
        while (age <= 0) {
            System.out.println("Enter the age:");

            try {
                age = scanner.nextInt();
                scanner.nextLine(); // always clear the buffer

                if (age <= 0) {
                    System.out.println("Enter a valid age (it must be greater than 0).");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Age should contain numbers only! Try again");

                scanner.nextLine();

                //Here, I set age to a negative value so that the loop restarts.
                age = -1;
            }
        }

        student.setAge(age);
        student.setId(id);
        student.setName(name);
        student.setSurname(surname);
        students.add(student);
        System.out.println(name + " " + surname + " has been added");


    }
    public void showAllStudents(){
        students.forEach(System.out::println);


    }

    public void findById(){
        System.out.println("Enter the id:");
       long id =scanner.nextLong();

        System.out.println(students.stream().filter(student ->student.getId()==id ).findFirst().orElse(null));
    }

    public void deleteStudent() {
        boolean isRunning = true;
        while (isRunning){
            System.out.println("Enter the name:");
            String name = scanner.nextLine();
            if(students.isEmpty()) {
                System.out.println("The student list is empty.");
            } else {
                boolean removed = students.removeIf(student -> student.getName().trim().equals(name));
                if(removed) {
                    System.out.println("Deleted successfully.");
                    isRunning =false;
                } else {
                    System.out.println("This student does not exist.");
                }
            }
        }



    }

    public int selectionMenu(){
        System.out.println("Select the method you want to use:");
        System.out.print(
                "1) Find by ID\n" +
                        "2) Show all students\n" +
                        "3) Delete student by name\n" +
                        "4) Add student\n");

        int selection = scanner.nextInt();
        scanner.nextLine();
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
            default -> System.out.println("Invalid choice, please try again.");

        }
        return selection;
    }

    private boolean checkIfIdExists(long checkId) {
        // The lambda here does not access any external method variables,
        // it only uses 'checkId' passed as a parameter.

        return students.stream().anyMatch(stu -> stu.getId() == checkId);
    }

}
