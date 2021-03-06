package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class Impaler extends Weapon{
    public Impaler(int userStrength){
        super(userStrength,1,0,5,"Impaler","Typically" +
                " used as a ritual pair, these weapons are a deadly combination. The wielder\n" +
                "first entangles their foe in the hooked mesh of their electrified shardnet before\n" +
                "administering the killing blow using their extendable, twin-bladed impaler.");
        setImpale(true);
    }
}