package com.fitr.factory.method;

public class HumanWeapon implements Weapon {

    private WeaponType weaponType;

    public HumanWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Человеческий " + weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}