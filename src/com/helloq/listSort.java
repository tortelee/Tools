package com.helloq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 对集合中的对象，按照某种规则排序
 *方法一:
 *实现接口Comparable 比较规则自己写
 * override
 * compareTo（object ）
 *     return 正负判断
 *
 * 调用Collection的sort方法进行排序
 */
class Student implements Comparable<Student>{
    private int age;

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.getAge();
    }
}
public class listSort {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student(2);
        Student s3 = new Student(43);
        Student s4 = new Student(21);
        Student s5 = new Student(12);
        ArrayList<Student> a = new ArrayList<>();
        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);
        a.add(s5);
        Collections.sort(a);
        for(Student s:a){
            System.out.println(s.getAge());
        }



    }
}
