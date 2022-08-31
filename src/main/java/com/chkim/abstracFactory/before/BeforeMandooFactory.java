package com.chkim.abstracFactory.before;

import com.chkim.abstracFactory.after.Mandoo;

public class BeforeMandooFactory {

    public com.chkim.abstracFactory.after.Mandoo orderMandoo(String name, String shippingAddress) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("만두 이름이?");
        }
        if (shippingAddress == null || shippingAddress.isBlank()) {
            throw new IllegalArgumentException("배송 받는 주소가?");
        }

        prepareMandooSkin();

        com.chkim.abstracFactory.after.Mandoo mandoo = new Mandoo();
        mandoo.setName(name);

        if (name.contains("김치")) {
            mandoo.setName("팍쉰김치만두");
        } else if (name.contains("고기")) {
            mandoo.setName("개구리고기만두");
        } else {
            throw new IllegalArgumentException("그런만두 안팔아요");
        }

        if (name.contains("김치")) {
            mandoo.setMaterial("김치");
            mandoo.setColor("빨강");
        } else if (name.contains("고기")) {
            mandoo.setMaterial("돼지고기");
            mandoo.setColor("고기색");
        }

        packaging(mandoo.getName());
        ship(shippingAddress, mandoo.getName());

        return mandoo;

    }

    private void packaging(String name) {
        System.out.println(name + "를 포장합니다");
    }

    private void ship(String shippingAddress, String name) {
        System.out.println(name + "를" + shippingAddress + "으로 보냅니다.");
    }


    private void prepareMandooSkin() {
        System.out.println("만두피를 준비합시다");
    }
}
