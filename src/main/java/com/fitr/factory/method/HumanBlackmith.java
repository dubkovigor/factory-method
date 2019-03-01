package com.fitr.factory.method;

public class HumanBlackmith implements Blacksmith {

    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new HumanWeapon(weaponType);
    }

}