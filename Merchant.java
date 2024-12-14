public class Merchant extends Character{
    private String goods;

    public Merchant(String name, int health, String goods){
        super(name, health);
        this.goods = goods;
    }
    public void trade(){
        System.out.println(getName() + " trades " + goods + ".");
    }
    @Override
    public String toString(){
        return super.toString()+", goods='"+ goods + "'}";
    }
}
