package ejercicio07;

public class Contacto implements Comparable <Contacto>{

	private String nombre = "";
	private int telefono = 123456789;
	
	public Contacto(String nombre, int telefono) {
		if(nombre!=null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if(telefono >= 111111111 && telefono <= 999999999) {
			this.telefono = telefono;
		}
	}
	
	public Contacto(String nombre) {
		if(nombre!=null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public int getTelefono() {
		return telefono;
	}





	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}





	@Override
	public String toString() {
		String cadena;
		
		cadena = nombre + "::" + telefono;
		
		return cadena;
	}
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Contacto c = (Contacto) obj;
		if(this.nombre.equals(c.nombre)) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	public int compareTo(Contacto o) {
		int res = 0;
		
		if(this.nombre.compareTo(o.nombre) > 0) {
			res = 1;
		}else if(this.nombre.compareTo(o.nombre) < 0) {
			res = -1;
		}
		return res;
	}
	

	

}
