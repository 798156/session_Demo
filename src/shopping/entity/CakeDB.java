package shopping.entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//数据层 封装的数据(蛋糕) 及其访问数据的方法
public class CakeDB {
    //蛋糕存放在map集合中
    private static Map<String,Cake> map=new LinkedHashMap<String,Cake>();
    //初始化数据
    static {
        map.put("1",new Cake("A类蛋糕","1"));
        map.put("2",new Cake("B类蛋糕","2"));
        map.put("3",new Cake("C类蛋糕","3"));
        map.put("4",new Cake("D类蛋糕","4"));
        map.put("5",new Cake("E类蛋糕","5"));
    }
    //获取所有蛋糕对象的方法
    public static Collection<Cake> getAll() {
        return map.values();
    }
    //通过ID获取蛋糕对象
    public static Cake getCakeById(String id) {
        return map.get(id);
    }
}
