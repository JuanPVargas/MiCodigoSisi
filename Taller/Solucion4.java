package Taller;

//se importa JOptionPane para preguntar las horas trabajadas en la semana y calcular su salario
import javax.swing.JOptionPane;

public class Solucion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int HorasTrabajadas;
		
		//se le pregunta al usuario cuantas horas trabajo a la semana
		HorasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("¿cuantas horas trabajo en la semana?"));
		
		//si tranajo 40 o menos horas en la semana se multiplica cada hora por $16
		if (HorasTrabajadas <= 40) {
			
			int MenosDe40 = HorasTrabajadas * 16;
			JOptionPane.showMessageDialog(null, "su salario semanal será $" + MenosDe40);
		}
		
		//Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra. ​
		else if (HorasTrabajadas > 40) {
			
			//se le restan 40 a las horas trabajadas para saber las horas adicionales
			int MasDe40 = HorasTrabajadas - 40;
			//las horas adicionales se multiplican por 20 que es el valor de cada hora adicional
			int mas_de_40 = MasDe40 * 20;
			//se le suma $640 que es el valor de las primeras 40 horas a las horas adicionales
			int salario =  640 + mas_de_40;
			JOptionPane.showMessageDialog(null, "su salario semanal será $" + salario);
		}

	}

}
