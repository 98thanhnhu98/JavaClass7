package javaClass.Bai7;

import javaClass.Bai5.City;
import lambda.project.Person;

import java.util.*;

public class Bai7 {
    private static List<City> list = new LinkedList<>();
    public Bai7(){
        list.add(new City(49,"Thành Phố Hồ Chí Minh"));
        list.add(new City(2,"Đà Nẵng"));
        list.add(new City(220,"Cà Mau"));
        list.add(new City(100,"Hà Nội"));
    }
    public static void removeOdd() {
        System.out.println("REMOVEODD");
        list.removeIf(city -> city.getId() % 2 != 0);
        list.forEach(System.out::println);
    }
    public static void sort(){
        System.out.println("SORT");
        list.sort(Comparator.comparingInt(City::getId));
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Bai7 bai7 = new Bai7();
        sort();
        removeOdd();
    }
}
