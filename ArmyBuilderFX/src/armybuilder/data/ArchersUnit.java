package armybuilder.data;

/**
 * Class to define the Archers unit and all its attributes
 * @author albertoribellesfernandezllebrez
 * @version 0.2
 */
public class ArchersUnit extends GenericUnit{
    protected short attackNumbers;
    protected short reach;
    protected String specialRule;

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @return It will return a ArchersUnit instance with the specified
     * attributes
     */
    public ArchersUnit(){
        unit = "Archers";
        type = "Line";
        equipment = "Long bow";
        movement = 2;
        damage = 1;
        cost = 125;
        attackNumbers = 7;
        reach = 5;
        specialRule = "Rain of arrows";
    }

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @param name A String with the ArchersUnit name
     * @return It will return a ArchersUnit instance with the specified
     * attributes
     */
    public ArchersUnit(String name){
        this.name = name;
        unit = "ARCHERS";
        type = "LINE";
        equipment = "LONG BOW";
        movement = 2;
        damage = 1;
        cost = 125;
        attackNumbers = 7;
        reach = 5;
        specialRule = "RAIN OF ARROWS";
    }

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @param fragments A String array from which all parameters are generated
     * @return It will return a ArchersUnit instance with the specified
     * attributes
     */
    public ArchersUnit(String[] fragments) {
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
     * @param name A String with the ArchersUnit name
     * @param unit A String with the ArchersUnit's type
     * @param type A String with the ArchersUnit's type
     * @param equipment A String with the ArchersUnit's equipment
     * @param movement A short with the ArchersUnit's movement
     * @param damage A short with the ArchersUnit's damage
     * @param cost A short with the ArchersUnit's cost
     * @param attackNumbers A short with the ArchersUnit's cost
     * @param reach A short with the ArchersUnit's cost
     * @param specialRule A String with the ArchersUnit's type
     * @return It will return a ArchersUnit instance with the specified
    attributes
     */
    public ArchersUnit(String unit, String type, String name, String equipment, short movement, short damage,
                       short cost, short attackNumbers, short reach, String specialRule) {
        super(unit, type, name, equipment, movement, damage, cost);
        this.attackNumbers = attackNumbers;
        this.reach = reach;
        this.specialRule = specialRule;
    }

    /**
     * Returns the ArchersUnit's attackNumbers
     * @return ArchersUnit's attackNumbers
     */
    public short getAttackNumbers() {
        return attackNumbers;
    }

    /**
     * Establishes the ArchersUnit's attackNumbers
     * @param attackNumbers ArchersUnit's attackNumbers
     */
    public void setAttackNumbers(short attackNumbers) {
        this.attackNumbers = attackNumbers;
    }

    /**
     * Returns the ArchersUnit's reach
     * @return ArchersUnit's reach
     */
    public short getReach() {
        return reach;
    }

    /**
     * Establishes the ArchersUnit's reach
     * @param reach ArchersUnit's reach
     */
    public void setReach(short reach) {
        this.reach = reach;
    }

    /**
     * Returns the ArchersUnit's specialRule
     * @return ArchersUnit's specialRule
     */
    public String getSpecialRule() {
        return specialRule;
    }

    /**
     * Establishes the ArchersUnit's specialRule
     * @param specialRule ArchersUnit's specialRule
     */
    public void setSpecialRule(String specialRule) {
        this.specialRule = specialRule;
    }

    /**
     * Returns the ArchersUnit's attributes on a string
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
     * Returns the ArchersUnit's attributes & name on a string
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
     * Returns the ArchersUnit's attributes on a string separated by ";"
     * @return String
     */
    @Override
    public String toSave(){
        return super.toSave() + ";" + attackNumbers + ";" + reach + ";" + specialRule;
    }
}
