package armybuilder.data;

/**
 * Class to define the Hero unit and all its attributes
 * @author albertoribellesfernandezllebrez
 * @version 0.2
 */
public class HeroUnit extends GenericUnit{
    protected short attackNumbers;
    protected short commandLevel;
    protected String action;

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @return It will return a HeroUnit instance with the specified
     * attributes
     */
    public HeroUnit() {
        unit = "HERO";
        type = "COMMANDER";
        equipment = "RUNIC BLADE";
        movement = 5;
        damage = 8;
        cost = 200;
        attackNumbers = 6;
        commandLevel = 3;
        action = "CHARGE";
    }

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @param name A String with the HeroUnit name
     * @return It will return a HeroUnit instance with the specified
    attributes
     */
    public HeroUnit(String name) {
        this.name = name;
        unit = "HERO";
        type = "COMMANDER";
        equipment = "RUNIC BLADE";
        movement = 5;
        damage = 8;
        cost = 200;
        attackNumbers = 6;
        commandLevel = 3;
        action = "CHARGE";
    }

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @param fragments A String array from which all parameters are generated
     * @return It will return a HeroUnit instance with the specified
     * attributes
     */
    public HeroUnit(String[] fragments) {
        unit = fragments[0].toUpperCase();
        name = fragments[1].toUpperCase();
        type = fragments[2].toUpperCase();
        equipment = fragments[3].toUpperCase();
        movement = Short.parseShort(fragments[4]);
        damage = Short.parseShort(fragments[5]);
        cost = Short.parseShort(fragments[6]);
        attackNumbers = Short.parseShort(fragments[7]);
        commandLevel = Short.parseShort(fragments[8]);
        action = fragments[9].toUpperCase();
    }

    /**
     * Constructor with parameters
     * @param unit A String with the HeroUnit's type
     * @param name A String with the HeroUnit name
     * @param type A String with the HeroUnit's type
     * @param equipment A String with the HeroUnit's equipment
     * @param movement A short with the HeroUnit's movement
     * @param damage A short with the HeroUnit's damage
     * @param cost A short with the HeroUnit's cost
     * @param attackNumbers A short with the HeroUnit's cost
     * @param commandLevel A short with the HeroUnit's cost
     * @param action A String with the HeroUnit's type
     * @return It will return a HeroUnit instance with the specified
    attributes
     */
    public HeroUnit(String unit, String type, String name, String equipment, short movement, short damage, short cost,
                    short attackNumbers, short commandLevel, String action) {
        super(unit, type, name, equipment, movement, damage, cost);
        this.attackNumbers = attackNumbers;
        this.commandLevel = commandLevel;
        this.action = action;
    }

    /**
     * Returns the HeroUnit's attackNumbers
     * @return HeroUnit's attackNumbers
     */
    public short getAttackNumbers() {
        return attackNumbers;
    }

    /**
     * Establishes the HeroUnit's attackNumbers
     * @param attackNumbers HeroUnit's attackNumbers
     */
    public void setAttackNumbers(short attackNumbers) {
        this.attackNumbers = attackNumbers;
    }

    /**
     * Returns the HeroUnit's commandLevel
     * @return HeroUnit's commandLevel
     */
    public short getCommandLevel() {
        return commandLevel;
    }

    /**
     * Establishes the HeroUnit's commandLevel
     * @param commandLevel HeroUnit's commandLevel
     */
    public void setCommandLevel(short commandLevel) {
        this.commandLevel = commandLevel;
    }

    /**
     * Returns the HeroUnit's action
     * @return HeroUnit's action
     */
    public String getAction() {
        return action;
    }

    /**
     * Establishes the HeroUnit's action
     * @param action HeroUnit's action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Returns the HeroUnit's attributes on a string
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() +
                ", ATTACK " + attackNumbers +
                ", COMMAND " + commandLevel +
                ", ACTION: " + action;
    }

    /**
     * Returns the HeroUnit's attributes & name on a string
     * @return String
     */
    @Override
    public String toShow() {
        return super.toShow() +
                ", ATTACK " + attackNumbers +
                ", COMMAND " + commandLevel +
                ", ACTION: " + action;
    }

    /**
     * Returns the HeroUnit's attributes on a string separated by ";"
     * @return String
     */
    @Override
    public String toSave(){
        return super.toSave() + ";" + attackNumbers + ";" + commandLevel + ";" + action;
    }
}
