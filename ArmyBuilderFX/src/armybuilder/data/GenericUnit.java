package armybuilder.data;

import java.util.Comparator;

/**
 * Class to define the generic unit and all its attributes
 * @author albertoribellesfernandezllebrez
 * @version 0.2
 */

public abstract class GenericUnit {
    protected String unit;
    protected String name;
    protected String type;
    protected String equipment;
    protected short movement;
    protected short damage;
    protected short cost;

    public GenericUnit() {

    }

    /**
     * Constructor with parameters
     * @param unit A String with the GenericUnit's type
     * @param name A String with the GenericUnit name
     * @param type A String with the GenericUnit's type
     * @param equipment A String with the GenericUnit's equipment
     * @param movement A short with the GenericUnit's movement
     * @param damage A short with the GenericUnit's damage
     * @param cost A short with the GenericUnit's cost
     * @return It will return a GenericUnit instance with the specified
    attributes
     */
    public GenericUnit(String unit, String name, String type, String equipment, short movement, short damage, short cost) {
        this.unit = unit;
        this.type = type;
        this.name = name;
        this.equipment = equipment;
        this.movement = movement;
        this.damage = damage;
        this.cost = cost;
    }

    /**
     * Returns the GenericUnit's unit
     * @return GenericUnit's unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Establishes the GenericUnit's unit
     * @param unit GenericUnit's unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Returns the GenericUnit's type
     * @return GenericUnit's type
     */
    public String getType() {
        return type;
    }

    /**
     * Establishes the GenericUnit's unit
     * @param type GenericUnit's unit
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the GenericUnit's name
     * @return GenericUnit's name
     */
    public String getName() {
        return name;
    }

    /**
     * Establishes the GenericUnit's name
     * @param name GenericUnit's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the GenericUnit's equipment
     * @return GenericUnit's equipment
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * Establishes the GenericUnit's equipment
     * @param equipment GenericUnit's equipment
     */
    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    /**
     * Returns the GenericUnit's movement
     * @return GenericUnit's movement
     */
    public short getMovement() {
        return movement;
    }

    /**
     * Establishes the GenericUnit's unit
     * @param movement GenericUnit's unit
     */
    public void setMovement(short movement) {
        this.movement = movement;
    }

    /**
     * Returns the GenericUnit's damage
     * @return GenericUnit's damage
     */
    public short getDamage() {
        return damage;
    }

    /**
     * Establishes the GenericUnit's unit
     * @param damage GenericUnit's unit
     */
    public void setDamage(short damage) {
        this.damage = damage;
    }

    /**
     * Returns the GenericUnit's cost
     * @return GenericUnit's cost
     */
    public short getCost() {
        return cost;
    }

    public void setCost(short cost) {
        this.cost = cost;
    }

    /**
     * Returns the GenericUnit's attributes on a string
     * @return String
     */
    @Override
    public String toString() {
        return "Unit - " + unit +
                ", type: " + type +
                ", equipment: " + equipment +
                ", MOV " + movement + '\"'+
                ", DMG " + damage +
                ", COST " + cost;
    }

    /**
     * Returns the GenericUnit's attributes & name on a string
     * @return String
     */
    public String toShow() {
        return this + ", name: " + name;
    }

    /**
     * Returns the GenericUnit's save format in a string with ";" separators
     * @return GenericUnit's parameters in a String
     */
    public String toSave(){
        return unit + ";" + name + ";" + type + ";" + equipment + ";" + movement + ";" + damage + ";" + cost;
    }


    public static Comparator<GenericUnit> CSComparator = new Comparator<GenericUnit>() {
        public int compare(GenericUnit u1, GenericUnit u2) {
            return u1.getType().compareTo(u2.getType());
        }};
}
