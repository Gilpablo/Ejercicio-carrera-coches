package carreracoches;

public class Coche {
	
	private String nombre_piloto;
	
	private int dorsal_piloto;
	
	private int distancia_carrera;
	
	private boolean estado_coche;
	
	private int potencia=50;
	
	private int velocidad;
	
	private int km_recorridos;

	public Coche(String nombre_piloto, int dorsal_piloto, int distancia_carrera, boolean estado_coche, int potencia,
			int velocidad, int km_recorridos) {
		
		this.nombre_piloto = nombre_piloto;
		this.dorsal_piloto = dorsal_piloto;
		this.distancia_carrera = distancia_carrera;
		this.estado_coche = estado_coche;
		this.potencia = potencia;
		this.velocidad = velocidad;
		this.km_recorridos = km_recorridos;
	}

	
	public String getNombre_piloto() {
		return nombre_piloto;
	}

	public void setNombre_piloto(String nombre_piloto) {
		this.nombre_piloto = nombre_piloto;
	}

	public int getDorsal_piloto() {
		return dorsal_piloto;
	}

	public void setDorsal_piloto(int dorsal_piloto) {
		this.dorsal_piloto = dorsal_piloto;
	}

	public int getDistancia_carrera() {
		return distancia_carrera;
	}

	public void setDistancia_carrera(int distancia_carrera) {
		this.distancia_carrera = distancia_carrera;
	}

	public boolean isEstado_coche() {
		return estado_coche;
	}

	public void setEstado_coche(boolean estado_coche) {
		this.estado_coche = estado_coche;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getKm_recorridos() {
		return km_recorridos;
	}

	public void setKm_recorridos(int km_recorridos) {
		this.km_recorridos = km_recorridos;
	}
	
	
	

}
