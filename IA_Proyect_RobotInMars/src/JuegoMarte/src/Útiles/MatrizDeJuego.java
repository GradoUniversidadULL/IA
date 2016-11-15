package �tiles;

import java.util.Random;

import Objetos.Personaje;

public class MatrizDeJuego {
	public Personaje[][] mPersonaje;
	private int tamanoX;
	private int tamanoY;

	/** CONSTRUCTOR */
	public MatrizDeJuego() {
		mPersonaje = new Personaje[10][10];

		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				mPersonaje[x][y] = new Personaje(x, y, 0);
			}
		}
	}
	
	/** CONSTRUCTOR */
	public MatrizDeJuego(int tamanoX, int tamanoY) {
		mPersonaje = new Personaje[tamanoX][tamanoY];
		this.tamanoX = tamanoX;
		this.tamanoY = tamanoY;

		for (int x = 0; x < tamanoX; x++) {
			for (int y = 0; y < tamanoY; y++) {
				mPersonaje[x][y] = new Personaje(x, y, 0);
			}
		}
	}

	/** GETTERS AND SETTERS */
	public int getTamanoX() {
		return tamanoX;
	}

	public void setTamanoX(int tamanoX) {
		this.tamanoX = tamanoX;
	}

	public int getTamanoY() {
		return tamanoY;
	}

	public void setTamanoY(int tamanoY) {
		this.tamanoY = tamanoY;
	}

	/** M�TODO */
	public void insertarPersonaje (int x, int y, int personaje) {
		this.mPersonaje[x][y].setEstado(personaje);
	}
	
	public int aleatorioX(){
		Random semilla = new Random();
		int posX=1;
		posX = semilla.nextInt(tamanoX);
		return posX;
	}
	
	public int aleatorioY(){
		Random semilla = new Random();
		int posY=2;
		posY = semilla.nextInt(tamanoY);
		return posY;
	}
	public void random(){
		int x = aleatorioX();
		int y = aleatorioY();
	}
}
