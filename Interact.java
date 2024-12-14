public class Interact {
    public static void workWith(Character character){
        System.out.println("Interacting with: " + character.getName());

    }
    public static void tradeGoods(Merchant merchant){
        merchant.trade();
    }
    public static void protect(Knight knight){
        knight.defend();
    }
    public static void castSpell(Wizard wizard){
        wizard.castSpell();
    }
}
