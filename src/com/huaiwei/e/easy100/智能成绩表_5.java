package com.huaiwei.e.easy100;

import java.util.*;

public class 智能成绩表_5 {
    public static String stand;

    //定义静态内部类，用来定义学生姓名以及学生成绩
    static class Student implements Comparable<Student> {
        //学生姓名
        String name;
        //学生总分
        int scores;
        //学生单科分数
        Map<String, Integer> objects;

        public Student(String name) {
            this.name = name;
            objects=new HashMap<>();
        }

        public void addObject(String object, int score) {
            this.objects.put(object, score);
            this.scores += score;
        }


        @Override
        public int compareTo(Student o) {
            int b = o.scores;
            int a = this.scores;
            if (objects.containsKey(stand)) {
                b = objects.get(stand);
                a = this.objects.get(stand);
            }
            if (a != b) {
                return a - b;
            } else {
                return this.name.compareTo(o.name);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int h = sc.nextInt();
        sc.nextLine();
        String obj = sc.nextLine();
        List<Student> students = new ArrayList<Student>();
        for (int j = 0; j < i; j++) {
            String stu = sc.nextLine();
            Student student = new Student(stu.split(" ")[0]);
            for (int k = 0; k < h; k++) {
                student.addObject(obj.split(" ")[k], Integer.parseInt(stu.split(" ")[k + 1]));
            }
            students.add(student);
        }
        stand = sc.nextLine();
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.name);
        }
    }
}


