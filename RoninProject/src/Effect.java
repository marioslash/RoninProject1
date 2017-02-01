

import java.util.ArrayList;


public class Effect {

	private int id;
    private boolean permanent;
    private int intellect;
    private int charism;
    private int strengh;
    private int agility;
    private int karma;
    private int duration;
    private int life;
    private int inventory_size;
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public boolean isPermanent() {
        return permanent;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public void setCharism(int charism) {
        this.charism = charism;
    }

    public void setStrengh(int strengh) {
        this.strengh = strengh;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCharism() {
        return charism;
    }

    public int getStrengh() {
        return strengh;
    }

    public int getAgility() {
        return agility;
    }

    public int getKarma() {
        return karma;
    }

    public int getDuration() {
        return duration;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
