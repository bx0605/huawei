package com.huaiwei.e.easy;
import java.sql.Connection;
import java.util.*;
public class 智能成绩表 {
    public static String stand;
    //定义静态内部类Student
    static class Student implements Comparable<Student> {
        String name;
        Map<String,Integer> object;
        //总分
        int scannerores;
        public Student(String name){
            this.name=name;
            this.object=new HashMap<>();
        }

        public void add(String object,int scannerore){
            this.object.put(object,scannerore);
            scannerores+=scannerore;
        }
        public int compareTo(Student o){
            int p1=scannerores,p2=o.scannerores;
            if (this.object.containsKey(stand)){
                p1=this.object.get(stand);
                p2=o.object.get(stand);
            }
            if (p1!=p2){
                return p2-p1;
            }else {
                return this.name.compareTo(o.name);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //m个学生
        int m=scanner.nextInt();
        //n个科目
        int n=scanner.nextInt();
        scanner.nextLine();
        List<Student> students=new ArrayList<>();
        String [] objects=scanner.nextLine().split(" ");
        for (int i=0;i<m;i++){
            String name=scanner.next();
            Student student=new Student(name);
            for (int j=0;j<n;j++){
                int scannerore=scanner.nextInt();
                student.add(objects[j],scannerore);
            }
            students.add(student);
        }
        stand=scanner.next();
        Collections.sort(students);

        for (Student s:students){
            System.out.print(s.name+" ");
        }
    }
}
