package armybuilder.data;

/**
 * Class to define the SwordMasters unit and all its attributes
 * @author albertoribellesfernandezllebrez
 * @version 0.2
 */
public class SwordMastersUnit extends GenericUnit{
    protected short attackNumbers;
    protected short reach;
    protected String specialRule;

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @return It will return a SwordMastersUnit instance with the specified
     * attributes
     */
    public SwordMastersUnit(){
        unit = "SWORDMASTERS";
        type = "LINE";
        equipment = "GRAND SWORD";
        movement = 4;
        damage = 4;
        cost = 200;
        attackNumbers = 3;
        reach = 1;
        specialRule = "DEATH BLOW";
    }

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @param name A String with the SwordMastersUnit name
     * @return It will return a SwordMastersUnit instance with the specified
     * attributes
     */
    public SwordMastersUnit(String name){
        this.name = name;
        unit = "SWORDMASTERS";
        type = "LINE";
        equipment = "GRAND SWORD";
        movement = 4;
        damage = 4;
        cost = 200;
        attackNumbers = 3;
        reach = 1;
        specialRule = "DEATH BLOW";
    }

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @param fragments A String array from which all parameters are generated
     * @return It will return a SwordMastersUnit instance with the specified
     * attributes
     */
    public SwordMastersUnit(String[] fragments) {
        unit = fragments[0].toUpperCase();
        name = fragments[1].toUpperCase();
        type = fragments[2].toUpperCase();
        equipment = fragments[3].toUpperCase();
        movement = Short.parseShort(fragments[4]);
        damage = Short.parseShort(fragments[5]);
        cost = Short.parseShort(fragments[6]);
        attackNumbers = Short.parseShort(fragments[7]);
        reach = Short.parseShort(fragments[8]);
        specialRule = fragments[9].toUpperCase();
    }

    /**
     * Constructor with parameters
     * @param name A String with the SwordMastersUnit name
     * @param unit A String with the SwordMastersUnit's type
     * @param type A String with the SwordMastersUnit's type
     * @param equipment A String with the SwordMastersUnit's equipment
     * @param movement A short with the SwordMastersUnit's movement
     * @param damage A short with the SwordMastersUnit's damage
     * @param cost A short with the SwordMastersUnit's cost
     * @param attackNumbers A short with the SwordMastersUnit's cost
     * @param reach A short with the SwordMastersUnit's cost
     * @param specialRule A String with the SwordMastersUnit's type
     * @return It will return a HeroUnit instance with the specified
    attributes
     */
    public SwordMastersUnit(String unit, String type, String name, String equipment, short movement, short damage,
                            short cost, short attackNumbers, short reach, String specialRule) {
        super(unit, type, name, equipment, movement, damage, cost);
        this.attackNumbers = attackNumbers;
        this.reach = reach;
        this.specialRule = specialRule;
    }

    /**
     * Returns the SwordMastersUnit's attackNumbers
     * @return SwordMastersUnit's attackNumbers
     */
    public short getAttackNumbers() {
        return attackNumbers;
    }

    /**
     * Establishes the SwordMastersUnit's attackNumbers
     * @param attackNumbers SwordMastersUnit's attackNumbers
     */
    public void setAttackNumbers(short attackNumbers) {
        this.attackNumbers = attackNumbers;
    }

    /**
     * Returns the SwordMastersUnit's reach
     * @return SwordMastersUnit's reach
     */
    public short getReach() {
        return reach;
    }

    /**
     * Establishes the SwordMastersUnit's reach
     * @param reach SwordMastersUnit's reach
     */
    public void setReach(short reach) {
        this.reach = reach;
    }

    /**
     * Returns the SwordMastersUnit's specialRule
     * @return SwordMastersUnit's specialRule
     */
    public String getSpecialRule() {
        return specialRule;
    }

    /**
     * Establishes the SwordMastersUnit's specialRule
     * @param specialRule SwordMastersUnit's specialRule
     */
    public void setSpecialRule(String specialRule) {
        this.specialRule = specialRule;
    }

    /**
     * Returns the SwordMastersUnit's attributes on a string
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() +
                ", ATTACK " + attackNumbers +
                ", REACH " + reach + '\"'+
                ", RULE: " + specialRule;
    }

    /**
     * Returns the SwordMastersUnit's attributes & name on a string
     * @return String
     */
    @Override
    public String toShow() {
        return super.toShow() +
                ", ATTACK " + attackNumbers +
                ", REACH " + reach + '\"'+
                ", RULE: " + specialRule;
    }

    /**
     * Returns the SwordMastersUnit's attributes on a string separated by ";"
     * @return String
     */
    @Override
    public String toSave(){
        return super.toSave() + ";" + attackNumbers + ";" + reach + ";" + specialRule;
    }
}
