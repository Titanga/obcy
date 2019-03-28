import java.util.*;
import java.text.*;

class MyGetTime{
    public static void dayn(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args) {
        //第一种方法。java.util中有一个获取时间的抽象工具类Calendar。
        //GregorianCalendar是Calendar的一个子类，他可以创建一个可以获取各个时间字段的对象。
        //然后用get方法来获取各个字段的值（get方法的数据返回类型是int）。
        GregorianCalendar g = new GregorianCalendar();
        dayn(g);
        dayn("以上是 GregorianCalendar对象------------以下是获取对象字段值-----------------");
        dayn(g.get(Calendar.YEAR)+"年"+  (g.get(Calendar.MONTH)+1) +"月"+ g.get(Calendar.DAY_OF_MONTH)+"日");
        dayn(g.get(Calendar.HOUR_OF_DAY)+"时"+  (g.get(Calendar.MINUTE)) +"分"+ g.get(Calendar.SECOND)+"秒"+g.get(Calendar.MILLISECOND)+"毫秒");
      
        //第二种方法：java.util中有一个获取时间的工具类Data。用此类可以获取一个时间对象。
        //java.text包中有一个DateFormat抽象类，可以将一个 Date 对象格式化为日期/时间字符串
        //SimpleDateFormat继承于DateFormat。SimpleDateFormat可以储存时间的格式化方式。
        
        Date d = new Date();
        dayn("以下是Date对象-------------------------");
        dayn(d);
        dayn("以下是格式化后Date对象后打印出来的字符串-------------------------");
        SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日(E) HH:mm:ss:SSS ");
        String  a = s.format(d);
        dayn(a);
   
    }
    


}
