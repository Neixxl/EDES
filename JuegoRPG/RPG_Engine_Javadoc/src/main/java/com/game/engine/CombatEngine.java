package com.game.engine;

/**
 * Motor de Combate del juego RPG.
 * Esta clase sirve para gestionar la vida y el mana de los personajes.
 * 
 * <table border="1">
 * <caption>Tipos de personajes</caption>
 * <tr>
 * <th>Tipo</th>
 * <th>Descripcion</th>
 * </tr>
 * <tr>
 * <td>Guerrero</td>
 * <td>Personaje con mucha fuerza y vida.</td>
 * </tr>
 * <tr>
 * <td>Mago</td>
 * <td>Personaje que usa magia y tiene poco HP.</td>
 * </tr>
 * </table>
 * 
 * @author Neizan del rio
 * @version 1.0
 */
public class CombatEngine {

    /**
     * Puntos de vida del personaje.
     */
    private int hp;

    /**
     * Puntos de mana para hacer magia.
     */
    private int mp;

    /**
     * Constructor de la clase CombatEngine.
     * 
     * @param hp La vida inicial.
     * @param mp El mana inicial.
     */
    public CombatEngine(int hp, int mp) {
        this.hp = hp;
        this.mp = mp;
    }

    /**
     * Metodo para calcular cuanto daño hace un ataque.
     * 
     * @param attackPower  La fuerza del ataque.
     * @param enemyDefense La defensa del enemigo.
     * @return El daño total que se hace.
     * @throws IllegalStateException Si el personaje tiene 0 de vida o menos.
     * @see #heal(int)
     */
    public int calculateDamage(int attackPower, int enemyDefense) {
        if (this.hp <= 0) {
            throw new IllegalStateException("Un personaje derrotado no puede atacar.");
        }
        int damage = attackPower - enemyDefense;
        return Math.max(0, damage);
    }

    /**
     * Metodo para curar al personaje.
     * 
     * @param amount La cantidad de vida a curar.
     * @throws IllegalStateException Si el personaje esta muerto no se cura.
     * @see #calculateDamage(int, int)
     */
    public void heal(int amount) {
        if (this.hp <= 0) {
            throw new IllegalStateException("No se puede curar a un muerto.");
        }
        this.hp = Math.min(100, this.hp + amount);
    }

    /**
     * Ataque antiguo que ya no sirve.
     * 
     * @deprecated Usar mejor el nuevo metodo {@link #calculateDamage(int, int)}
     */
    @Deprecated
    public void oldAttack() {
        System.out.println("Ejecutando ataque del sistema antiguo...");
    }
}
