package com.chkim.abstracFactory.after;

public class MeatMandooFactory implements MandooFactory{
    @Override
    public Mandoo createMandoo() {
        return new MeatMandoo();
    }
}
