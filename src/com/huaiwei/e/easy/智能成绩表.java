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
        int scores;
        public Student(String name){
            this.name=name;
            this.object=new HashMap<>();
        }

        public void add(String object,int score){
            this.object.put(object,score);
            scores+=score;
        }
        public int compareTo(Student o){
            int p1=scores,p2=o.scores;
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
        Scanner sc = new Scanner(System.in);
        //m个学生
        int m=sc.nextInt();
        //n个科目
        int n=sc.nextInt();
        sc.nextLine();
        List<Student> students=new ArrayList<>();
        String [] objects=sc.nextLine().split(" ");
        for (int i=0;i<m;i++){
            String name=sc.next();
            Student student=new Student(name);
            for (int j=0;j<n;j++){
                int score=sc.nextInt();
                student.add(objects[j],score);
            }
            students.add(student);
        }
        stand=sc.next();
        Collections.sort(students);

        for (Student s:students){
            System.out.print(s.name+" ");
        }
    }
}
