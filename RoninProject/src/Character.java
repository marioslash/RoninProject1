

import java.util.ArrayList;
import java.util.List;


public class Character {
    private int id;
    private int intellect;
    private int charism;
    private int strengh;
    private int agility;
    private int karma;
    private int gold;
    private String name;
    private char gender;
    private int life; 
    private ArrayList<Item> inventory; // Inventório
    private int inventory_size; //Tamanho do Inventório
    private List<Quest> activeQuests; //Quests ativas 
    private List<Quest> completedQuests; //Quests já completadas

    public List<Quest> getCompletedQuests() {
		return completedQuests;
	}

	public void setCompletedQuests(List<Quest> completedQuests) {
		this.completedQuests = completedQuests;
	}

	public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public int getInventory_size() {
        return inventory_size;
    }

    public void setInventory_size(int inventory_size) {
        this.inventory_size = inventory_size;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public List<Quest> getActiveQuests() {
        return activeQuests;
    }

    public void setActiveQuests(List<Quest> quest) {
        this.activeQuests = quest;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getCharism() {
        return charism;
    }

    public void setCharism(int charism) {
        this.charism = charism;
    }

    public int getStrengh() {
        return strengh;
    }

    public void setStrengh(int strengh) {
        this.strengh = strengh;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Character(int id, int intellect, int charism, int strengh, int agility, int karma, int gold,
                     String name, char gender, int life, ArrayList<Item> inventory, int inventory_size,
                     List<Quest> quest) {

        this.id = id;
        this.intellect = intellect;
        this.charism = charism;
        this.strengh = strengh;
        this.agility = agility;
        this.karma = karma;
        this.gold = gold;
        this.name = name;
        this.gender = gender;
        this.life = life;
        this.inventory = inventory;
        this.inventory_size = inventory_size;
        this.activeQuests = quest;
    }


}
