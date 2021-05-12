package InterfazdeUsuario;

//import static InterfazdeUsuario.PantallaJuego.SUELOY;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import ObjetosJuego.Personaje;

public class PantallaJuego extends JPanel implements Runnable, KeyListener{
	
	public static final float GRAVEDAD=0.1f;
	public static final float SUELOY=300;//en pixeles
	private Personaje principal;
	private Thread thread;
	
	public PantallaJuego() {
		thread=new Thread(this);
		principal=new Personaje();
	}
	
	public void comenzarJuego() {
		thread.start();
	}

	@Override
	public void run() {
		//game loop
		while(true) {
			try {
				principal.update();
				repaint();
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.BLACK);
		g.drawLine(0, (int)SUELOY, getWidth(), (int)SUELOY);
		principal.dibujar(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		principal.saltar();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	
}
