package poo.example;

public class SmartPhone extends Celular{
	
	float pixelesCamara;
	float tamanioMemoriaExterna;
	float tamanioMemoriaInterna;
	
	//constructor por defecto
	//cambios en constructor para conflictos primero aca que abajo
	
	public SmartPhone() {
	}

	//constructor con los atributos de la clase incluso los heredados
	public SmartPhone(String marca, String modelo, String color, float pixelesCamara, float tamanioMemoriaRam,
			float tamaoDisco) {
		super(marca, modelo, color);
		this.pixelesCamara = pixelesCamara;
		this.tamanioMemoriaInterna = tamanioMemoriaRam;
		this.tamanioMemoriaExterna = tamaoDisco;
	}
	// método sobrescrito (override), utilizo código de la clase Celular y añado código que necesito 
	@Override
	public void informarCaracteristicas() {
		// TODO Auto-generated method stub
		super.informarCaracteristicas();
		//System.out.println(String.format("SmartPhone calidad cámara: %s pixeles", pixelesCamara));
		//System.out.println(String.format("SmartPhone tamaño memoria interna: %s GB", tamanioMemoriaInterna));
		//System.out.println(String.format("SmartPhone tamaño memoria externa: %s GB", tamanioMemoriaExterna));
	}
	
	
	
	public float getPixelesCamar() {
		return PixelesCamar;
	}
	public void setPixelesCamar(float PixelesCamar) {
		this.PixelesCamar = PixelesCamar;
	}
	public float gettamanioMemoriaInterna) {
		return tamanioMemoriaInterna;
	}
	public void settamanioMemoriaInterna(float tamanioMemoriaInterna) {
		this.tamanioMemoriaInterna = tamanioMemoriaInterna;
	}
	public String gettamanioMemoriaExterna() {
		return tamanioMemoriaExterna;
	}
	public void settamanioMemoriaExterna(String tamanioMemoriaExterna) {
		this.tamanioMemoriaExterna = tamanioMemoriaExterna;
	}
	
}
