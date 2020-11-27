
public class Rettangolo {

	private double base;
	private double altezza;
	private double x;
	private double y;
	private double Perimetro;
	private double Area;
	
	
	
	public Rettangolo() {
		this.base = 0;
		this.altezza = 0;
		this.x = 0;
		this.y = 0;
	}
	
	public Rettangolo(double base, double altezza, double x, double y) {
		this.base = base;
		this.altezza = altezza;
		this.x = x;
		this.y = y;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltezza() {
		return altezza;
	}
	
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
		
	public double getPerimetro() {
		return (base*2 + altezza*2);
	}
	
	public void setPerimetro() {
		Perimetro = base*2 + altezza*2;
	}
	
	public double getArea() {
		return (base*altezza);
	}
	
	public void setArea() {
		Area = base*altezza;
	}
	
	public void traslazione(double quota) {
		y += quota;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y; 
	}
	
	
}
