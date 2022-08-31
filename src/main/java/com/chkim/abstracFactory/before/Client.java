package com.chkim.abstracFactory.before;

public class Client {

    public static void main(String[] args) {
        BeforeMandooFactory mandooFactory = new BeforeMandooFactory();
        mandooFactory.orderMandoo("김치", "우리집");
        mandooFactory.orderMandoo("고기", "우리집");
    }

}
