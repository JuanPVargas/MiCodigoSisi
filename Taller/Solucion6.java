package Taller;


public class Solucion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //se arrojara un valor aleatorio entre 0° y 60°
		int ValorAleatorio = (int)(Math.random()*60+ 0);
		
		//si es menor o igual a 10° el tipo de temperatura sera frio
		if (ValorAleatorio <= 10) {
			System.out.println( ValorAleatorio + "° (TIPO DE CLIMA): Frio");
		}
		
		//si es menor o igual a 20° el tipo de temperatura sera nublado
		else if (ValorAleatorio <= 20) {
			System.out.println( ValorAleatorio + "° (TIPO DE CLIMA): Nublado");
		}
		
		//si es menor o igual a 30° el tipo de temperatura sera calor
		else if (ValorAleatorio <= 30) {
			System.out.println( ValorAleatorio + "° (TIPO DE CLIMA): Calor");
		}
		
		//si es mayor a 30° el tipo de temperatura sera tropical
		else if (ValorAleatorio > 30) {
			System.out.println( ValorAleatorio + "° (TIPO DE CLIMA): Tropical");
		}
			
	}

}
