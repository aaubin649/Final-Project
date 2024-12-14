public class Peasant extends Character {
    private String skill;

    public Peasant(String name, int health, String skill){
        super(name, health);
        this.skill = skill;
    }
    public void work(){
        System.out.println(getName()+ " is working using skill: " + skill+ ".");

    }
    @Override
    public String toString(){
        return super.toString()+ ", skill='" + skill + "'}";
    }
}
