package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        //迭代器遍历
        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //增强for遍历
        for (String s : coll) {
            System.out.println(s);
        }
        //lambda表达式遍历
        coll.forEach(s-> System.out.println(s));
    }
}
