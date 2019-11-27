package test;
import java.lang.*;

public class test {
    public static void main(String args[]){
        son s = new son();
        // son s2 = new son("son");
    }
}

class f{
    f(){
        System.out.println("我是父类无参构造函数");
    }
    f(String s){
        System.out.println("我是父类有参构造::函数："+s);
    }
    // System.out.println("zhanglihua");
}
class son extends f{

}