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
        System.out.println("���Ǹ����޲ι��캯��");
    }
    f(String s){
        System.out.println("���Ǹ����вι���::������"+s);
    }
    // System.out.println("zhanglihua");
}
class son extends f{

}