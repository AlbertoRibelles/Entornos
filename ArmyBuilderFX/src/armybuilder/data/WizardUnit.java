package armybuilder.data;

/**
 * Class to define the Wizard unit and all its attributes
 * @author albertoribellesfernandezllebrez
 * @version 0.2
 */
public class WizardUnit extends GenericUnit{
    protected short magicAttacks;
    protected short wizardryLvl;
    protected String spell;

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @return It will return a WizardUnit instance with the specified
     * attributes
     */
    public WizardUnit() {
        unit = "WIZARD";
        type = "COMMANDER";
        equipment = "GRAND SCEPTER";
        movement = 3;
        damage = 6;
        cost = 150;
        magicAttacks = 2;
        wizardryLvl = 3;
        spell = "FIREBALL";
    }

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @param name A String with the WizardUnit name
     * @return It will return a WizardUnit instance with the specified
     * attributes
     */
    public WizardUnit(String name) {
        this.name = name;
        unit = "WIZARD";
        type = "COMMANDER";
        equipment = "GRAND SCEPTER";
        movement = 3;
        damage = 6;
        cost = 150;
        magicAttacks = 2;
        wizardryLvl = 3;
        spell = "FIREBALL";
    }

    /**
     * Constructor with parameters
     * that sets all values of the parameters
     * @param fragments A String array from which all parameters are generated
     * @return It will return a WizardUnit instance with the specified
     * attributes
     */
    public WizardUnit(String[] fragments) {
        unit = fragments[0].toUpperCase();
        name = fragments[1].toUpperCase();
        type = fragments[2].toUpperCase();
        equipment = fragments[3].toUpperCase();
        movement = Short.parseShort(fragments[4]);
        damage = Short.parseShort(fragments[5]);
        cost = Short.parseShort(fragments[6]);
        magicAttacks = Short.parseShort(fragments[7]);
        wizardryLvl = Short.parseShort(fragments[8]);
        spell = fragments[9].toUpperCase();
    }

    /**
     * Constructor with parameters
     * @param name A String with the WizardUnit name
     * @param unit A String with the WizardUnit's type
     * @param type A String with the WizardUnit's type
     * @param equipment A String with the WizardUnit's equipment
     * @param movement A short with the WizardUnit's movement
     * @param damage A short with the WizardUnit's damage
     * @param cost A short with the WizardUnit's cost
     * @param magicAttacks A short with the WizardUnit's cost
     * @param wizardryLvl A short with the WizardUnit's cost
     * @param spell A String with the WizardUnit's type
     * @return It will return a HeroUnit instance with the specified
    attributes
     */
    public WizardUnit(String unit, String type, String name, String equipment, short movement, short damage, short cost,
                      short magicAttacks, short wizardryLvl, String spell) {
        super(unit, type, name, equipment, movement, damage, cost);
        this.magicAttacks = magicAttacks;
        this.wizardryLvl = wizardryLvl;
        this.spell = spell;
    }

    /**
     * Returns the WizardUnit's magicAttacks
     * @return WizardUnit's magicAttacks
     */
    public short getMagicAttacks() {
        return magicAttacks;
    }

    /**
     * Establishes the WizardUnit's magicAttacks
     * @param magicAttacks WizardUnit's magicAttacks
     */
    public void setMagicAttacks(short magicAttacks) {
        this.magicAttacks = wizardryLvl;
    }

    /**
     * Returns the WizardUnit's wizardryLvl
     * @return WizardUnit's wizardryLvl
     */
    public short getWizardryLvl() {
        return wizardryLvl;
    }

    /**
     * Establishes the WizardUnit's wizardry Level
     * @param wizardryLvl WizardUnit's wizardry Level
     */
    public void setWizardryLvl(short wizardryLvl) {
        this.wizardryLvl = wizardryLvl;
    }

    /**
     * Returns the WizardUnit's spell
     * @return WizardUnit's spell
     */
    public String getSpell() {
        return spell;
    }

    /**
     * Establishes the WizardUnit's spell
     * @param spell WizardUnit's spell
     */
    public void setSpell(String spell) {
        this.spell = spell;
    }

    /**
     * Returns the WizardUnit's attributes on a string
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() +
                ", ATTACK " + magicAttacks +
                ", WIZARDRY " + wizardryLvl +
                ", SPELLS: " + spell;
    }

    /**
     * Returns the WizardUnit's attributes & name on a string
     * @return String
     */
    @Override
    public String toShow() {
        return super.toShow() +
                ", ATTACK " + magicAttacks +
                ", WIZARDRY " + wizardryLvl +
                ", SPELLS: " + spell;
    }

    /**
     * Returns the WizardUnit's attributes on a string separated by ";"
     * @return String
     */
    @Override
    public String toSave(){
        return super.toSave() + ";" + magicAttacks + ";" + wizardryLvl + ";" + spell;
    }
}
