package com.chkim.abstracFactory.after;

public class Client {

    public static void main(String[] args) {
        new KimchiMandooFactory().orderMandoo("김치", "우리집");
        new MeatMandooFactory().orderMandoo("고기", "우리집");

    }

}
