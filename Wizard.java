public class Wizard extends Character {
    private String spell;

    public Wizard(String name, int health, String spell){
        super(name, health);
        this.spell = spell;
    }
    public void castSpell(){
        System.out.println(getName()+ " casts " + spell + ".");
        
    }
    @Override
    public String toString(){
        return super.toString() + ", spell='"+ spell + "'}";
    }
}
