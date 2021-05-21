package armybuilder.data;

/**
 * Class to define the Monster unit and all its attributes
 * @author albertoribellesfernandezllebrez
 * @version 0.2
 */
public class MonsterUnit extends GenericUnit{
    protected short attackNumbers;
    protected short reach;
    protected String specialRule;

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @return It will return a MonsterUnit instance with the specified
     * attributes
     */
    public MonsterUnit(){
        unit = "DRAGON";
        type = "MONSTER";
        equipment = "JAWS AND CLAWS";
        movement = 2;
        damage = 8;
        cost = 125;
        attackNumbers = 2;
        reach = 1;
        specialRule = "DISRUPTING VOID";
    }

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @param name A String with the MonsterUnit name
     * @return It will return a MonsterUnit instance with the specified
     * attributes
     */
    public MonsterUnit(String name){
        this.name = name;
        unit = "DRAGON";
        type = "MONSTER";
        equipment = "JAWS AND CLAWS";
        movement = 2;
        damage = 8;
        cost = 125;
        attackNumbers = 2;
        reach = 1;
        specialRule = "DISRUPTING VOID";
    }

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @param fragments A String array from which all parameters are generated
     * @return It will return a MonsterUnit instance with the specified
     * attributes
     */
    public MonsterUnit(String[] fragments) {
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
     * Returns the MonsterUnit's attackNumbers
     * @return MonsterUnit's attackNumbers
     */
    public short getAttackNumbers() {
        return attackNumbers;
    }

    /**
     * Establishes the MonsterUnit's attackNumbers
     * @param attackNumbers MonsterUnit's attackNumbers
     */
    public void setAttackNumbers(short attackNumbers) {
        this.attackNumbers = attackNumbers;
    }

    /**
     * Returns the MonsterUnit's reach
     * @return MonsterUnit's reach
     */
    public short getReach() {
        return reach;
    }

    /**
     * Establishes the MonsterUnit's reach
     * @param reach MonsterUnit's reach
     */
    public void setReach(short reach) {
        this.reach = reach;
    }

    /**
     * Returns the MonsterUnit's specialRule
     * @return MonsterUnit's specialRule
     */
    public String getSpecialRule() {
        return specialRule;
    }

    /**
     * Establishes the MonsterUnit's specialRule
     * @param specialRule MonsterUnit's specialRule
     */
    public void setSpecialRule(String specialRule) {
        this.specialRule = specialRule;
    }

    /**
     * Returns the MonsterUnit's attributes on a string
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
     * Returns the MonsterUnit's attributes & name on a string
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
     * Returns the MonsterUnit's attributes on a string separated by ";"
     * @return String
     */
    @Override
    public String toSave(){
        return super.toSave() + ";" + attackNumbers + ";" + reach + ";" + specialRule;
    }
}
