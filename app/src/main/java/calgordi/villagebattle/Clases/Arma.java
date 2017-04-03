package calgordi.villagebattle.Clases;

import android.media.Image;
import android.media.MediaPlayer;

public class Arma {
    private String nombre;
    private String tipo; // Si es a "melee" o a "distance"
    private int nivel; // Para subir de nivel hay que gastar oro y experiencia
    private int experiencia;
    private float dano;
    private float velocidadAtaque;
    private float rango;
    private int municionCargador; // Si es de type melee este dato no importara
    private float tiempoRecarga;
    private String habilidadEspecial;

    private Image bala;
    private MediaPlayer sonidoBala;

    public Arma (String name, String type, int level, int experience, float damage, float attackSpeed,float range, int ammo, float reload, String specialAbility, Image bullet, MediaPlayer soundBala){
        nombre = name;
        tipo = type;
        nivel = level;
        experiencia = experience;
        dano = damage;
        velocidadAtaque = attackSpeed;
        rango = range;
        municionCargador = ammo;
        tiempoRecarga = reload;
        habilidadEspecial = specialAbility;
        bala = bullet;
        sonidoBala = soundBala;
    }

    public String getNombre (){return nombre;}
    public String getTipo () {return tipo;}
    public void setNivel (int level){ nivel = level;}
    public int getNivel (){ return nivel;}
    public void setExperiencia (int experience) {experiencia = experience;}
    public int getExperiencia(){return experiencia;}
    public void setDano(float damage){ dano = damage;}
    public float getDano (){return dano;}
    public void setVelocidadAtaque (float attackSpeed) {velocidadAtaque = attackSpeed;}
    public float getVelocidadAtaque (){return velocidadAtaque;}
    public void setMunicionCargador (int ammo) {municionCargador = ammo;}
    public int getMunicionCargador (){return municionCargador;}
    public void setTiempoRecarga (float reload){tiempoRecarga = reload;}
    public float getTiempoRecarga (){return tiempoRecarga;}
    public String getHabilidadEspecial () {return habilidadEspecial;}
}
