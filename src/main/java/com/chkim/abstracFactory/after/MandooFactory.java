package com.chkim.abstracFactory.after;


public interface MandooFactory {

    default Mandoo orderMandoo(String name, String shippingAddress) {
        validate(name, shippingAddress);
        prepareMandooSkin();
        Mandoo mandoo = createMandoo();
        packaging(mandoo.getName());
        ship(shippingAddress, mandoo.getName());
        return mandoo;
    }


    Mandoo createMandoo();

    private void prepareMandooSkin() {
        System.out.println("만두피를 준비합시다");
    }

    private void validate(String name, String shippingAddress) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("만두 이름이?");
        }
        if (shippingAddress == null || shippingAddress.isBlank()) {
            throw new IllegalArgumentException("배송 받는 주소가?");
        }
    }


    private void packaging(String name) {
        System.out.println(name + "를 포장합니다");
    }

    private void ship(String shippingAddress, String name) {
        System.out.println(name + "를" + shippingAddress + "으로 보냅니다.");
    }


}
