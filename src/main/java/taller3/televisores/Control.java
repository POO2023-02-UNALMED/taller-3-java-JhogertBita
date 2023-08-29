package taller3.televisores;

public class Control {
	public TV tv;
	
	public void enlazar(TV tv) {
		this.tv=tv;
		tv.setControl(this);
	}
	public void setTv(TV tv) {
		this.tv=tv;
	}
	public boolean turnOn() {
		return tv.estado=true;
	}
	public boolean turnOff() {
		return tv.estado=false;
	}
	public Object getTv() {
		return tv;
	}
	public void canalUp() {
		if(tv.estado==true & tv.canal<120) {
			tv.canal++;
		}
	}
	public void canalDown() {
		if(tv.estado==true & tv.canal>1) {
		tv.canal--;}
	}
	public void volumenUp() {
		if(tv.estado==true & tv.volumen<7){
		tv.volumen++;}
	}
	public void volumenDown() {
		if(tv.estado==true & tv.volumen>0) {
		tv.volumen--;}
	}
	public void setVolumen(int volumen) {
		if (tv.estado==true & volumen<=7 & volumen>=0) {
		tv.setVolumen(volumen);}
	}
	public void setCanal(int canal) {
		if (tv.estado==true & canal<=120 & canal>=1) {
		tv.canal=canal;
		}
	}
}
