

import java.util.List;


public class Quest {
    private int id, intellect_min, charism_min, strengh_min, agility_min, karma_min, gold;
    private String name, type, description;
    private char gender;

    public List<Quest> getRequisites() {
        return requisites;
    }

    public void setRequisites(List<Quest> requisites) {
        this.requisites = requisites;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIntellect_min() {
        return intellect_min;
    }

    public void setIntellect_min(int intellect_min) {
        this.intellect_min = intellect_min;
    }

    public int getCharism_min() {
        return charism_min;
    }

    public void setCharism_min(int charism_min) {
        this.charism_min = charism_min;
    }

    public int getStrengh_min() {
        return strengh_min;
    }

    public void setStrengh_min(int strengh_min) {
        this.strengh_min = strengh_min;
    }

    public int getAgility_min() {
        return agility_min;
    }

    public void setAgility_min(int agility_min) {
        this.agility_min = agility_min;
    }

    public int getKarma_min() {
        return karma_min;
    }

    public void setKarma_min(int karma_min) {
        this.karma_min = karma_min;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    private List<Quest> requisites;

}
