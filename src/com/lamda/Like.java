package com.lamda;

public class Like {
    //静态内部类
    static class IlikeImpl1 implements Ilike{
        @Override
        public void likes() {
            System.out.println("静态内部类");
        }
    }
    public static void main(String[] args) {
        Ilike ilike = new IlikeImpl();
        ilike.likes();
        Ilike ilike1 =  new IlikeImpl1();
        ilike1.likes();
        //匿名内部类
        ilike= new Ilike() {
            @Override
            public void likes() {
                System.out.println("匿名内部类");
            }
        };
        ilike.likes();
        Ilike lil=() -> {
                System.out.println("lamda表达式");
        };
        lil.likes();
    }
}


interface Ilike{
    void likes();
}


class IlikeImpl implements Ilike{

    @Override
    public void likes() {
        System.out.println("我喜欢你");
    }
}