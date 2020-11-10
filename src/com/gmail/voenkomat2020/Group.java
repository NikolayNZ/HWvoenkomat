package com.gmail.voenkomat2020;

import java.util.Arrays;
import java.util.Scanner;

public class Group implements Voencom {
    private Student[] group = new Student[10];

    public Group(Student[] group) {
        this.group = group;
    }

    public Group() {
        super();
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }

    public int studentNumber() {
        int number = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                number = number + 1;
            }
        }
        return number;
    }

    public void interactiveAddStudent() throws MyException {
        Student st = new Student("name", "lastname", 0, "sex", 0);
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя: ");
        st.setName(sc.nextLine());
        System.out.println("Введите фамилию: ");
        st.setLastname(sc.nextLine());
        System.out.println("Введите возрост: ");
        st.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Введите пол: ");
        st.setSex(sc.nextLine());
        System.out.println("Введите курс: ");
        st.setCourse(sc.nextInt());

        if (st.getAge() < 0 || st.getCourse() < 0 || st.getName() == null) {
            System.out.println("Ошибка!");
            st = null;
        }

        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = st;
                return;
            }
        }
        throw new MyException();

    }

    public void sortStudent() {
        Arrays.sort(group, (a, b) -> NullChecker.checkNull(a, b) == NullChecker.NOT_NULL ?
                a.getName().compareTo(b.getName()) : NullChecker.checkNull(a, b));
    }

    @Override
    public Student[] Recrut() {
        int Soldiers = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null && group[i].getAge() >= 18 && group[i].getSex().equals("Мужской")) {
                Soldiers = Soldiers + 1;
            }
        }

        Student[] recrut = new Student[Soldiers];
        int num = 0;
        for (int k = 0; k < group.length; k++) {
            if (group[k] != null && group[k].getAge() >= 18 && group[k].getSex().equals("Мужской")) {
                recrut[num] = group[k];
                num = num + 1;
            }
        }
        return recrut;
    }


    public void addStudent(Student student) throws MyException {
        if (student == null) {
            throw new IllegalArgumentException("Студента не знайдено!");
        }
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = student;
                return;
            }
        }
        throw new MyException();

    }

    public void deleteStudent(int a) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null && group[i].getCourse() == a) {
                group[i] = null;
                break;
            }
        }
    }

    public Student searchForStudent(String lastname) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null && group[i].getLastname().equals(lastname)) {
                return group[i];
            }
        }
        return null;

    }

    public void printGroup() {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                System.out.println("Курс: " + group[i].getCourse() + ", Имя: "
                        + group[i].getName() + ", Фамилия: " + group[i].getLastname() + ", Возраст: " + group[i].getAge() + ", Пол: " + group[i].getSex());
            }
        }
    }
}