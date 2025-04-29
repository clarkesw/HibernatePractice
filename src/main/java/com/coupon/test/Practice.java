package com.coupon.test;

import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.groupingBy;

//  Sort the same list of Student objects, but this time primarily by name in ascending order, 
//      and for students with the same name, sort them by age in ascending order. 
//      Write a Java method to accomplish this.

public class Practice {
    public static void main(String[] args){
        
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("John", 25, 60);
        employees[1] = new Employee("John", 18, 28);
        employees[2] = new Employee("Ace", 22, 45);
        employees[3] = new Employee("Keith", 35, 72);

//        Arrays.sort(employees, 
//                Comparator.comparing((emp1, emp2) -> Objects.equals(emp1.getName()), emp2.getName()));
        
        for(Employee emp : employees)
            System.out.println(emp);
    }
    
    static List<Integer> sort(List<Integer> inList){
        Collections.sort(inList);
        return inList;
    }
    
    static Optional<Integer> get2Largest(List<Integer> list){
        Long len = list.stream()
                .distinct()
                .count();
             
        if(len < 2)
            return Optional.empty();
        List<Integer> sort = list.stream()
                   .sorted((x, y) -> y.compareTo(x))
                   .toList();
        
        Integer i = sort.get(1);
        return Optional.ofNullable(i);
    }
    
    static void printMe(Integer[] intB){
        
        List<Integer> ls = Arrays.asList(intB);//new ArrayList<>(intB);
        
        String words = ls.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(words);
        
//        for(int i=0; i < intB.length; i++)
//            System.out.print(intB[i] + " ,");      
    }
}

interface Oddity{
    public boolean getOdds(Integer in);
}
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Alice", 20));
//        students.add(new Student("Bob", 22));
//        students.add(new Student("Charlie", 19));
//        students.add(new Student("David", 21));
//        students.add(new Student("Eve", 22));    
//
//       // students.sort(Comparator.comparing(stud -> stud.getAge()).reversed());
//        
//        System.out.println("Result: " + students); 



//      List<Integer> list = Arrays.asList(3,4,7,4,7,2,1,8,9,5);
//      String[] array = {"grab","a","kayak","for","clarke","and","apple"};
//      List<Integer> list  = Arrays.asList(3,4,7,4,7,2,1,8,9,5);
//        Character[] charry = {'a','b','c','d'};
//        List<String> lStr = new ArrayList<>(){{
//            add("saltclarke");
//            add("steak");
//            add("saltbea");
//            add("kayak");
//            add("grab");
//            add("saltapple");
//            add("sleek");
//        }};
//        List<List<Integer>> listOfLists = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5),
//                Arrays.asList(6, 7, 8, 9)
//        );

//        List<Person> list = new ArrayList<>(){{
//            add(new Person("Brad", 63));
//            add(new Person("Beth", 12));
//            add(new Person("Henry", 24));
//            add(new Person("Chad", 24));
//            add(new Person("Clarke", 22));
//            add(new Person("Sally", 74));
//        }};

//    public static List<Person> orderPpl(List<Person> list){  
//        Comparator<Person> comp = (var p1, var p2) -> {
//            if(p2.getAge() < p1.getAge()){
//                return -1;
//            }else if(p2.getAge() > p1.getAge()){
//                return 1;
//            }else{
//                return p1.getName().compareTo(p2.getName());
//            }
//        };
//        Collections.sort(list, comp);
//        return list;
//    }      

//        Java Stream that finds the longest string in the list. If there are multiple strings with the same 
//                maximum length, return any one of them. If the list is empty, return an empty Optional<String>.
//        
//        Optional<String> Olist = lStr.stream()
//                .collect(Collectors.maxBy(
//                        Comparator.comparingInt(
//                                String::length)));
//
//        if(Olist.isPresent())
//            System.out.println(Olist.get());