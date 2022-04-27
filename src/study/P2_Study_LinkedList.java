package study;

import java.util.*;


/*
    [2-2강 Java의 List]
    LinkedList
    List 인터페이스
    ArrayList (not sync) - 멀티쓰레드 환경이 아니다. 그때 쓰면 됨. (인덱스로 빠르게 접근해야한다)
    Vector (sync) - 멀티쓰레드 환경에서 쓰레드 세이프하게 리스트를 구현해야 하면..쓴다.
*/

class MyData {
    int value;

    public MyData(int value) {
        this.value = value;
    }

    static  MyData create(int v) {
        return  new MyData(v);
    }

    @Override
    public  String toString() {
        return "" + value;
    }

    @Override
    public  boolean equals(Object o) {
        if(this == o) return true;
        if(o ==null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return value == myData.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

public class P2_Study_LinkedList {
    public static void main(String[] args){
        List<MyData> list = new ArrayList<>();
        list.add(MyData.create(1));
        list.add(MyData.create(2));
        list.add(MyData.create(3));

        method1(list);
    }

    static void method1(List<MyData> list) {
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
