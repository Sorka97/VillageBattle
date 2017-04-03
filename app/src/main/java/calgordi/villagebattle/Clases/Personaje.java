package calgordi.villagebattle.Clases;

import android.media.Image;
import android.media.MediaPlayer;

public class Personaje {
    // Propiedades
    private String nombre;
    private int vida;
    private float velocidad;
    private float campoVision;
    private String habilidadEspecial;

    // Sprites
    private Image icono;

    private Image quieto;
    private Image pasoIzquierdo;
    private Image pasoDerecho;
    private Image atacando;
    private Image atacando2;

    //Sonido
    private MediaPlayer sonidoPersonaje;
    private MediaPlayer sonidoPasos;

    //Constructor
    public Personaje (String name, int life, float velocity, float fieldOfView, String specialAbility, Image icon ,Image qieto, Image pasoIzqierdo, Image pasoDrecho ,Image atcando,Image atcando2, MediaPlayer soundPersonaje, MediaPlayer soundPasos){

        nombre = name;
        vida = life;
        velocidad = velocity;
        campoVision = fieldOfView;
        habilidadEspecial = specialAbility;

        icono =  icon;
        quieto = qieto;
        pasoIzquierdo = pasoIzqierdo;
        pasoDerecho = pasoDrecho;
        atacando = atcando;
        atacando2 = atcando2;

        sonidoPersonaje = soundPersonaje;
        sonidoPasos = soundPasos;

    }
//Metodos set - get

    public String getNombre(){
        return nombre;
    }
    public void setVida(int life){
        vida = life;
    }
    public int getVida() {
        return vida;
    }
    public void setVelocidad (float velocity){
        velocidad = velocity;
    }
    public float getVelocidad () {
        return velocidad;
    }
    public void setCampoVision(float fieldOfView) {
        campoVision = fieldOfView;
    }
    public float getCampoVision(){
        return campoVision;
    }
}
