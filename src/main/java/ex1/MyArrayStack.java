package ex1;

import org.junit.Test;

// ÷–¥’ª
public class MyArrayStack {

//    public static void main(String[] args) {
//        MyArrayStack mas=new MyArrayStack();
//        mas.push("a");
//        mas.push("b");
//        mas.push("c");
////        System.out.println(mas.pop());
////        System.out.println(mas.peek());
//        for (int i=0;i<=os.length;)
//    }

    @Test
    public void test1(){

    }
    private Object [] os=new Object[16];

    private int size=0;

    public void push(Object data){
        if(size>=os.length){
            reSize();
        }
        os[size++]=data;
    }

    public Object pop(){
        Object o = os[size];
        os[--size]=null;
        return o;
    }

    public Object peek(){
        Object oldValue=os[size];
        return oldValue;
    }

    private void reSize() {
        Object [] temp = new Object[os.length*3];
        for(int i=0;i<os.length;i++){
            temp[i] = os[i];
            os[i]=null;
        }
        os=temp;
    }

}
