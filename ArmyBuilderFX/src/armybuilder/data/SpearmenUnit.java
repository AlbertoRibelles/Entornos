package armybuilder.data;

/**
 * Class to define the Spearmen unit and all its attributes
 * @author albertoribellesfernandezllebrez
 * @version 0.2
 */
public class SpearmenUnit extends GenericUnit{
    protected short attackNumbers;
    protected short reach;
    protected String specialRule;

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @return It will return a SpearmenUnit instance with the specified
     * attributes
     */
    public SpearmenUnit(){
        unit = "SPEARMEN";
        type = "LINE";
        equipment = "HEAVY SPEAR AND SHIELD";
        movement = 3;
        damage = 2;
        cost = 150;
        attackNumbers = 5;
        reach = 2;
        specialRule = "STRIKE FIRST";
    }

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @param name A String with the SpearmenUnit name
     * @return It will return a SpearmenUnit instance with the specified
     * attributes
     */
    public SpearmenUnit(String name){
        this.name = name;
        unit = "SPEARMEN";
        type = "LINE";
        equipment = "HEAVY SPEAR AND SHIELD";
        movement = 3;
        damage = 2;
        cost = 150;
        attackNumbers = 5;
        reach = 2;
        specialRule = "STRIKE FIRST";
    }

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @param fragments A String array from which all parameters are generated
     * @return It will return a SpearmenUnit instance with the specified
     * attributes
     */
    public SpearmenUnit(String[] fragments) {
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
     * @param name A String with the SpearmenUnit name
     * @param unit A String with the SpearmenUnit's type
     * @param type A String with the SpearmenUnit's type
     * @param equipment A String with the SpearmenUnit's equipment
     * @param movement A short with the SpearmenUnit's movement
     * @param damage A short with the SpearmenUnit's damage
     * @param cost A short with the SpearmenUnit's cost
     * @param attackNumbers A short with the SpearmenUnit's cost
     * @param reach A short with the SpearmenUnit's cost
     * @param specialRule A String with the SpearmenUnit's type
     * @return It will return a HeroUnit instance with the specified
    attributes
     */
    public SpearmenUnit(String unit, String type, String name, String equipment, short movement, short damage,
                        short cost, short attackNumbers, short reach, String specialRule) {
        super(unit, type, name, equipment, movement, damage, cost);
        this.attackNumbers = attackNumbers;
        this.reach = reach;
        this.specialRule = specialRule;
    }

    /**
     * Returns the SpearmenUnit's attackNumbers
     * @return SpearmenUnit's attackNumbers
     */
    public short getAttackNumbers() {
        return attackNumbers;
    }

    /**
     * Establishes the SpearmenUnit's attackNumbers
     * @param attackNumbers SpearmenUnit's attackNumbers
     */
    public void setAttackNumbers(short attackNumbers) {
        this.attackNumbers = attackNumbers;
    }

    /**
     * Returns the SpearmenUnit's reach
     * @return SpearmenUnit's reach
     */
    public short getReach() {
        return reach;
    }

    /**
     * Establishes the SpearmenUnit's reach
     * @param reach SpearmenUnit's reach
     */
    public void setReach(short reach) {
        this.reach = reach;
    }

    /**
     * Returns the SpearmenUnit's specialRule
     * @return SpearmenUnit's specialRule
     */
    public String getSpecialRule() {
        return specialRule;
    }

    /**
     * Establishes the SpearmenUnit's specialRule
     * @param specialRule SpearmenUnit's specialRule
     */
    public void setSpecialRule(String specialRule) {
        this.specialRule = specialRule;
    }

    /**
     * Returns the SpearmenUnit's attributes on a string
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
     * Returns the SpearmenUnit's attributes & name on a string
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
     * Returns the SpearmenUnit's attributes on a string separated by ";"
     * @return String
     */
    @Override
    public String toSave(){
        return super.toSave() + ";" + attackNumbers + ";" + reach + ";" + specialRule;
    }
}
