package 使用Comparator的排序_Lambda;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 基于Comparable实现的 比较器
 *
 * @author zijian Wang
 */
public class Person {


    private int age;

    private int height;

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }


    public Person(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Person person1 = new Person(80, 160);
        Person person2 = new Person(60, 190);
        Person person3 = new Person(100, 150);
        //-1
        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        //原来的list80，60，100
        System.out.println("原始数据：" + list);

        //60 80 100
        list.sort((p1, p2) -> p1.getAge() < p2.getAge() ? -1 : p1.getAge() == p2.getAge() ? 0 : 1);
        System.out.println("按年龄排序：" + list);


        list.sort((p1, p2)  -> p1.getHeight() < p2.getHeight() ? -1 : p1.getHeight() == p2.getHeight() ? 0 : 1);
        System.out.println("按身高排序：" + list);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }
}
