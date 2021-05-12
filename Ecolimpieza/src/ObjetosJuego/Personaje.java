package ObjetosJuego;
import static InterfazdeUsuario.PantallaJuego.GRAVEDAD;
import static InterfazdeUsuario.PantallaJuego.SUELOY;

import java.awt.Color;
import java.awt.Graphics;

public class Personaje {
	private float x=0;
	private float y=0;
	private float velocidady=0;
	
	public void update() {
		if(y>=SUELOY-100) {
			velocidady=0;
			y=SUELOY-100;
		}
		else {
			//x+=1;
			velocidady+=GRAVEDAD;
			y+=velocidady;
		}
	}
	
	public void dibujar(Graphics g) {
		g.setColor(Color.BLACK);
		//super.paint(g);
		//coordination x, y, width, height of the rectangle
		g.drawRect((int)x, (int)y, 100, 100);
	}
	
	public void saltar() {
		velocidady=-4;
		y+=velocidady;
	}
	
	public void setX(float x) {
		this.x=x;
	}
	
	public void setY(float y) {
		this.y=y;
	}
	
	public void setVelocidadY(float velocidady) {
		this.velocidady=velocidady;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float getVelocidadY() {
		return velocidady;
	}
}
