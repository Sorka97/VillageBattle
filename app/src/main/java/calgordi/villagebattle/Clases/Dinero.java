package calgordi.villagebattle.Clases;

public class Dinero extends Usuario{
    private int moneyGold;
    private int moneyDiamond;

    public Dinero (String nombreUsuario, String contrasena, String correo, int dineroOro, int dineroDiamante) {
        super (nombreUsuario, contrasena, correo);
        moneyGold = dineroOro;
        moneyDiamond = dineroDiamante;
    }

    public void setMoneyGold (int dineroOro){
        moneyGold = dineroOro;
    }
    public int getMoneyGold () {
        return moneyGold;
    }
    public void setMoneyDiamond (int dineroDiamante) {
        moneyDiamond = dineroDiamante;
    }
    public int getMoneyDiamond (){
        return moneyDiamond;
    }

    public void addMoneyGold (int dineroOroAAnadir) {
        moneyGold += dineroOroAAnadir;
    }
    public void removeMoneyGold (int dineroOroAQuitar){
        moneyGold -= dineroOroAQuitar;
    }
    public void addMoneyDiamond (int dineroDiamanteAAnadir){moneyDiamond += dineroDiamanteAAnadir;}
    public void removeMoneyDiamond (int dineroDiamanteAQuitar){moneyDiamond -= dineroDiamanteAQuitar;}
}
