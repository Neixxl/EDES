package com.game.engine;

/**
 * Clase Warrior que hereda de CombatEngine.
 * 
 * @author Neizan del rio
 * @version 1.0
 */
public class Warrior extends CombatEngine {

    /**
     * Constructor del guerrero.
     * 
     * @param hp Vida del guerrero.
     * @param mp Mana del guerrero.
     */
    public Warrior(int hp, int mp) {
        super(hp, mp);
    }

    /**
     * {@inheritDoc}
     * <p>
     * Nota: El guerrero aplica un bono de +5 por fuerza física.
     * </p>
     */
    @Override
    public int calculateDamage(int attackPower, int enemyDefense) {
        int baseDamage = super.calculateDamage(attackPower, enemyDefense);
        return baseDamage + 5; // Bono de fuerza
    }
}
