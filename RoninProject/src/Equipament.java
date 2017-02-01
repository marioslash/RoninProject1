


public class Equipament extends Item {
    private boolean active;
    private String slot;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public Equipament (){
        this.setConsumable(false);
        this.getEffect().setPermanent(true);
    }
}
