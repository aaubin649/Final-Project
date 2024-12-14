public class Knight extends Character {
    private String weapon;

    public Knight (String name, int health, String weapon){
        super(name, health);
        this.weapon = weapon;

    }
    public void defend(){
        System.out.println(getName()+ " is defending with " + weapon + ".");
    }

    @Override
    public String toString(){
        return super.toString()+ ", weapon='" + weapon + "'}";
    }
}


