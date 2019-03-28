import java.util.*;

public class HashMapDemo {
    public static void dayn(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args) {
        
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("jubin", "xixian");
        map.put("wang", "luyi");
        map.put("ganlu", "huangiuan");
        map.put("jungang", "xincai");
        
        dayn(map.containsKey("jubin"));
        dayn(map.remove("jubin0"));
        dayn(map.get("jubin"));
        //取出map集合里面的所有的键（keyset方法返回的是Set类型000），放入set集合。
        Set<String> keyset = map.keySet();
        dayn("打印map集合");
        dayn(map);
        dayn("打印map里面所有键的集合");
        dayn(keyset);
        //创建set集合keyset的迭代器把所有的键挨个取出来
        Iterator<String> it = keyset.iterator();
        while(it.hasNext()){
            String c = it.next();
           // 利用所取出来的键，来获取map集合里各个键的值
            dayn(c+"=="+map.get(c));
        }
        //第二种取出方式。利用键值关系对象来取出数据
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,String>> ite = entrySet.iterator();
        while(ite.hasNext()){
            Map.Entry<String,String> entry = ite.next();
            String s =(entry.getKey());
            String m = (entry.getValue());
            dayn(s+".."+m);
            
        }
    }
}
