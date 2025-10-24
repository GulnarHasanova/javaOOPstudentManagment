# javaOOPstudentManagmen
Student Management System (Java Console Application)
This project is a simple console-based application written in Java. It demonstrates core Object-Oriented Programming (OOP) concepts and uses an ArrayList to manage student records. Robust input handling is implemented using try-catch blocks and Scanner methods.

# Functionality Overview
The application allows users to perform the following operations:

Add Student: Allows input of new student data (ID, Name, Surname, Age). Validation ensures the ID is unique and that Age/ID inputs are valid positive numbers.

Find by ID: Searches for and displays a student record based on the provided ID.

Show All Students: Prints a list of all currently registered students.

Delete by Name: Removes a student entry from the list using the student's name.

# Code Structure
The project consists of three main Java classes:

Student.java: The Data Model (POJO) for a student record. It implements Encapsulation using private fields (id, name, surname, age) and public getters/setters. The overridden toString() method provides a clean, formatted output for student information.

StudentManager.java: Contains all the core business logic and data management.

Main.java: The application's entry point, which initiates the interactive menu and handles top-level input errors.

# Tələbə İdarəetmə Sistemi (Java Konsol Proqramı)
Bu layihə Java ilə yazılmış sadə konsol əsaslı proqramdır. O, əsas Obyekt Yönümlü Proqramlaşdırma (OOP) konsepsiyalarını nümayiş etdirir və tələbə qeydlərini idarə etmək üçün ArrayList istifadə edir. Möhkəm giriş idarəetməsi try-catch blokları və Scanner metodlarından istifadə edilərək tətbiq edilir.

# Funksionallığa Baxış
Proqram istifadəçilərə aşağıdakı əməliyyatları yerinə yetirməyə imkan verir:

Tələbə Əlavə Etmə: Yeni tələbə məlumatlarının (ID, Ad, Soyad, Yaş) daxil edilməsinə imkan verir. Yoxlama ID-nin unikal olmasını və Yaş/ID girişlərinin etibarlı müsbət rəqəmlər olmasını təmin edir.

ID ilə Tapma: Təqdim edilmiş ID əsasında tələbə qeydini axtarır və göstərir.

Bütün Tələbələri Göstərmə: Hazırda qeydiyyatdan keçmiş bütün tələbələrin siyahısını çap edir.

Adla Silmə: Tələbənin adından istifadə edərək siyahıdan tələbə qeydini silir.

# Kodun Quruluşu
Layihə üç əsas Java sinfindən ibarətdir:

Student.java: Tələbə qeydi üçün Məlumat Modeli (POJO). O, private sahələr (id, name, surname, age) və public getter/setter-lərdən istifadə edərək Kapsullamayı tətbiq edir. Əvəzlənmiş (@Override) toString() metodu tələbə məlumatları üçün səliqəli, formatlanmış çıxış təmin edir.

StudentManager.java: Bütün əsas biznes məntiqini və məlumat idarəetməsini ehtiva edir.

Main.java: Proqramın giriş nöqtəsidir, interaktiv menyunu işə salır və yuxarı səviyyəli giriş xətalarını idarə edir.
