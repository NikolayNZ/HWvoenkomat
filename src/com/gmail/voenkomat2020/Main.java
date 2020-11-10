package com.gmail.voenkomat2020;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {


        Student student1 = new Student("Иван", "Смирнов", 16, "Мужской", 1);
        Student student2 = new Student("Светлана", "Смирнова", 17, "Женский", 2);
        Student student3 = new Student("Олег", "Жданов", 20, "Мужской", 3);
        Student student4 = new Student("Борис", "Шевчук", 21, "Мужской", 4);
        Student student5 = new Student("Анна", "Мисан", 22, "Женский", 5);
        Student student6 = new Student("Антон", "Варивода", 23, "Мужской", 6);
        Student student7 = new Student("Сергей", "Задоенко", 21, "Мужской", 4);
        Student student8 = new Student("Андрей", "Гриценко", 24, "Мужской", 7);


    Group group1 = new Group();
		try

    {
        group1.interactiveAddStudent();
        group1.interactiveAddStudent();
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
        group1.addStudent(student6);
        group1.addStudent(student7);
        group1.addStudent(student8);
        System.out.println("Группа: ");
    } catch(
    MyException e) {
        System.out.println(e.toString());
    }

        group1.sortStudent();

		System.out.println("Студентов в группе: "+group1.studentNumber());
        group1.printGroup();

        System.out.println();
        System.out.println("Поиск студентов по фамилии: ");
        System.out.println(group1.searchForStudent("Петров"));
        System.out.println(group1.searchForStudent("Жданов"));

        Student[] group = new Student[]{};
        Arrays.sort(group, Comparator.nullsFirst(new StudentNameComparator()));

        System.out.println();
        for (int i = 0; i < group.length; i++) {
            System.out.println(group[i]);
        }

		System.out.println();
		System.out.println("Сдуденты, которые подходят для военкомата: ");
		System.out.println(Arrays.toString(group1.Recrut()));

        System.out.println();
        System.out.println("Список студентов, которые остались в группе: ");
        group1.deleteStudent(6);
        group1.deleteStudent(7);
        group1.printGroup();


}
}

