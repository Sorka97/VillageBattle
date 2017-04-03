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
    // Mirando arriba
    private Image arribaQuieto;
    private Image arribaPasoIzquierdo;
    private Image arribaPasoDerecho;
    private Image arribaAtacando1;
    private Image arribaAtacando2;
    // Mirando izquierda
    private Image izquierdaQuieto;
    private Image izquierdaPasoIzquierdo;
    private Image izquierdaPasoDerecho;
    private Image izquierdaAtacando1;
    private Image izquierdaAtacando2;
    // Mirando derecha
    private Image derechaQuieto;
    private Image derechaPasoIzquierdo;
    private Image derechaPasoDerecho;
    private Image derechaAtacando1;
    private Image derechaAtacando2;
    // Mirando abajo
    private Image abajoQuieto;
    private Image abajoPasoIzquierdo;
    private Image abajoPasoDerecho;
    private Image abajoAtacando1;
    private Image abajoAtacando2;

    //Sonido
    private MediaPlayer sonidoPersonaje;
    private MediaPlayer sonidoPasos;

    //Constructor
    public Personaje (String name, int life, float velocity, float fieldOfView, String specialAbility, Image icon ,Image upQuieto, Image rightQuieto, Image leftQuieto, Image downQuieto, Image upPasoIzquierdo, Image rightPasoIzquierdo, Image leftPasoIzquierdo, Image downPasoIzquierdo, Image upPasoDerecho , Image rightPasoDerecho, Image leftPasoDerecho, Image downPasoDerecho, Image upAtacando1 , Image rightAtacando1 , Image leftAtacando1, Image downAtacando1, Image upAtacando2, Image rightAtacando2, Image leftAtacando2, Image downAtacando2, MediaPlayer soundPersonaje, MediaPlayer soundPasos){

        nombre = name;
        vida = life;
        velocidad = velocity;
        campoVision = fieldOfView;
        habilidadEspecial = specialAbility;

        icono =  icon;
        arribaQuieto = upQuieto;
        abajoQuieto = downQuieto;
        derechaQuieto = rightQuieto;
        izquierdaQuieto = leftQuieto;

        arribaPasoIzquierdo = upPasoIzquierdo;
        abajoPasoIzquierdo = downPasoIzquierdo;
        derechaPasoIzquierdo = rightPasoIzquierdo;
        izquierdaPasoIzquierdo = leftPasoIzquierdo;

        arribaPasoDerecho = upPasoDerecho;
        abajoPasoDerecho = downPasoDerecho;
        derechaPasoDerecho = rightPasoDerecho;
        izquierdaPasoDerecho = leftPasoDerecho;


        arribaAtacando1 = upAtacando1;
        abajoAtacando1 = downAtacando1;
        derechaAtacando1 = rightAtacando1;
        izquierdaAtacando1 = leftAtacando1;

        arribaAtacando2 = upAtacando2;
        abajoAtacando2 = downAtacando2;
        derechaAtacando2 = rightAtacando2;
        izquierdaAtacando2 = leftAtacando2;

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
