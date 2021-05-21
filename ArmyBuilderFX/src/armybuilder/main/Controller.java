package armybuilder.main;

import armybuilder.data.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * This class is in charge of
 * @author albertoribellesfernandezllebrez
 * @version 0.2
 */
public class Controller implements Initializable {
    @FXML
    private Button addBtn;
    @FXML
    private Button rmvBtn;
    @FXML
    private ListView  listUnits;
    @FXML
    private ObservableList<GenericUnit> display;

    static final int MAX_UNITS = 8;
    static int totalUnits = 0, countCommand = 0, countLine = 0, countMons = 0;
    static ArrayList<GenericUnit> userList = new ArrayList<>();

    public Controller(){

    }

    /**
     * A method to initialize the display variable
     * @param url A String with the GenericUnit's type
     * @param resourceBundle A String with the GenericUnit name
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        display = FXCollections.observableArrayList();
        display.add(new HeroUnit());
        display.add(new WizardUnit());
        display.add(new SpearmenUnit());
        display.add(new SwordMastersUnit());
        display.add(new ArchersUnit());
        display.add(new MonsterUnit());
        listUnits.setItems(display);
    }

    /**
     * A method to save user List
     */
    public void saveList() {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = null;
        String unitToSaveFormat;
        String fileSaveName;
        Collections.sort(userList, GenericUnit.CSComparator);
        String input="";

        do {
            System.out.println("Do you want to save the list? Y/N");
            input = sc.nextLine().toUpperCase();
        } while(!input.equals("Y") && !input.equals("N"));

        if(input.equalsIgnoreCase("Y")){
            System.out.println("Enter the list name:");
            fileSaveName = sc.nextLine();
            fileSaveName +=".txt";

            try
            {
                pw = new PrintWriter (fileSaveName);
                for (GenericUnit unit : userList) {
                    unitToSaveFormat = unit.toSave();
                    pw.println(unitToSaveFormat);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                pw.close();
            }
        }
    }

    /**
     * A method that loads the desired list with the
     * name entered by the user
     */
    public void loadList() {
        Scanner sc = new Scanner(System.in);
        userList.clear();
        BufferedReader br = null;
        System.out.println("Enter the list name: ");
        String listName = sc.nextLine();
        File load = new File(listName);
        String saveFormat;

        if(!load.exists()) {
            System.err.println("Error. File not found");
        }
        else{
            try {
                br = new BufferedReader(new FileReader(
                        load));

                while((saveFormat = br.readLine()) != null){
                    fromFileToUnit(saveFormat);
                }
            } catch (FileNotFoundException e) {
                System.err.println("Error. File not found");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        printUserList();
    }

    /**
     * A method that receives a string and transforms it into
     * the an object of a unit class depending on the type
     * @param saveFormat A String with the GenericUnit's type
     */
    private static void fromFileToUnit(String saveFormat){
        String[] fragments = saveFormat.split(";");
        String readUnit = fragments[0].toUpperCase();
        switch (readUnit){
            case "HERO":
                userList.add(new HeroUnit(fragments));
                countCommand++;
                totalUnits++;
                break;
            case "WIZARD":
                userList.add(new WizardUnit(fragments));
                countCommand++;
                totalUnits++;
                break;
            case "SPEARMEN":
                userList.add(new SpearmenUnit(fragments));
                countLine++;
                totalUnits++;
                break;
            case "SWORDMASTERS":
                userList.add(new SwordMastersUnit(fragments));
                countLine++;
                totalUnits++;
                break;
            case "ARCHERS":
                userList.add(new ArchersUnit(fragments));
                countLine++;
                totalUnits++;
                break;
            case "DRAGON":
                userList.add(new MonsterUnit(fragments));
                countMons++;
                totalUnits++;
                break;
        }
    }

    /**
     * A method that that lets the user create a list from the
     * available options.
     */
    public void createList() {
        System.out.println("Choose units from the list: ");
        Scanner sc = new Scanner(System.in);

        //setDisplay();

        String option;
        boolean exit = false;

        do
        {
            printUnits();
            printUserList();

            option = "";
            System.out.println("Choose option: ");
            System.out.println("1. Add unit.");
            System.out.println("2. Delete troop.");
            System.out.println("0. Return.");
            option = sc.nextLine().toUpperCase();

            switch(option) {
                case "1":
                    option = "";
                    System.out.print("Type option: ");
                    option = sc.nextLine().toUpperCase();

                    switch (option) {
                        case "HERO":
                            if (countCommand < 3 && totalUnits < MAX_UNITS) {
                                addUnit(option);
                            } else
                                System.out.println("Cannot add more units of this type.");
                            break;
                        case "WIZARD":
                            if (countCommand < 3 && totalUnits < MAX_UNITS) {
                                addUnit(option);
                            } else
                                System.out.println("Cannot add more units of this type.");
                            break;
                        case "SPEARMEN":
                            if (countLine < 6 && totalUnits < MAX_UNITS) {
                                addUnit(option);
                            } else
                                System.out.println("Cannot add more units of this type.");
                            break;
                        case "SWORDMASTERS":
                            if (countLine < 6 && totalUnits < MAX_UNITS) {
                                addUnit(option);
                            } else
                                System.out.println("Cannot add more units of this type.");
                            break;
                        case "ARCHERS":
                            if (countLine < 6 && totalUnits < MAX_UNITS) {
                                addUnit(option);
                            } else
                                System.out.println("Cannot add more units of this type.");
                            break;
                        case "DRAGON":
                            if (countMons < 1 && totalUnits < MAX_UNITS) {
                                addUnit(option);
                            } else
                                System.out.println("Cannot add more units of this type.");
                            break;
                        case "exit":
                            exit = true;
                            break;
                        default:
                            System.out.println("Wrong input.");
                    }
                    if (totalUnits == 8) {
                        exit = true;
                        System.out.println("Reached max number of units.");
                    }
                    break;

                case "2":
                    printUserList();
                    System.out.println("Enter the name of the unit to delete: ");
                    int unitNumber = sc.nextInt();
                    sc.nextLine();
                    unitNumber-=1;
                    userList.remove(unitNumber);
                    break;
                case "0":
                    exit = true;
                    break;
                default:
                    System.out.println("Wrong input.");
            }
        }
        while (!exit);
    }

    /**
     * A method that prints on screen the available units to be
     * added to the user List
     */
    private void printUnits(){

        System.out.println("/------------ Units -------------/");
        System.out.println();

        for (GenericUnit g : display) {
            listUnits.getItems().add(g.toString());
        }
        System.out.println();
        System.out.println("/-------------------------------/");
        System.out.println("Form your list with 8 units from this list.");
    }

    /**
     * A method that prints on screen the user List
     */
    private static void printUserList(){
        System.out.println("/------------ List -------------/");
        System.out.println();
        for(int i = 0; i < userList.size(); i++){
            System.out.printf("%d. %s", (i+1), userList.get(i).toShow());
            System.out.println();
        }
        System.out.println();
        System.out.println("/-------------------------------/");
        System.out.printf("Total units: %d / %d", totalUnits, MAX_UNITS);
        System.out.println();
    }

    /**
     * A method that request the user a name to assign it to a unit
     * to be added to the user List
     */
    private static String requestName(String input){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println(input);
        name = sc.nextLine();

        return name;
    }

    /**
     * A method that adds the unit to the user List
     */
    private static void addUnit(String option){
        if(option.equalsIgnoreCase("HERO")){
            userList.add(new HeroUnit(requestName("Enter unit name:")));
            countCommand++;
            totalUnits++;
        }
        else if(option.equalsIgnoreCase("WIZARD")){
            userList.add(new WizardUnit(requestName("Enter name: ")));
            countCommand++;
            totalUnits++;
        }
        else if(option.equalsIgnoreCase("SPEARMEN")){
            userList.add(new SpearmenUnit(requestName("Enter name: ")));
            countLine++;
            totalUnits++;
        }
        else if(option.equalsIgnoreCase("SWORDMASTERS")){
            userList.add(new SwordMastersUnit(requestName("Enter name: ")));
            countLine++;
            totalUnits++;
        }
        else if(option.equalsIgnoreCase("ARCHERS")){
            userList.add(new ArchersUnit(requestName("Enter name: ")));
            countLine++;
            totalUnits++;
        }
        else if(option.equalsIgnoreCase("DRAGON")){
            userList.add(new MonsterUnit(requestName("Enter name: ")));
            countMons++;
            totalUnits++;
        }
    }

    /**
     * A method to initialize the display variable
     * that prints the options menu
     */
    public void printMenu(){
        System.out.println("/------------ Menu -------------/");
        System.out.println();
        System.out.println("1. Create / edit existing list.");
        System.out.println("2. Load existing list.");
        System.out.println("3. Print list.");
        System.out.println("0. Exit.");
        System.out.println();
        System.out.println("/-------------------------------/");
        System.out.print("Choose option: ");
    }

    public void addUnit(ActionEvent actionEvent) {
    }

    public void removeUnit(ActionEvent actionEvent) {
    }
}
