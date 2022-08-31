package com.chkim.abstracFactory.after;

public class KimchiMandooFactory implements MandooFactory{
    @Override
    public Mandoo createMandoo() {
        return new KimchiMandoo();
    }
}
