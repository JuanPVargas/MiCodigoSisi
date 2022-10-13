package TallerDoWhile;

import javax.swing.JOptionPane;

public class Punto8 {

	public static void main(String[] args) {
		double Centavos = 0.50;
		int IngresoMensual = (96*400);
		double AumentoMensual=IngresoMensual*Centavos;
		int Años = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años que deseea comprar barriles"));
		int Meses = Años*12;
		
		String aumento = JOptionPane.showInputDialog("Teniendo cuenta que existe un aumento mensual de 50 centavos,¿Desea cambiarlo si/no?");
		
		if(aumento.equals("si")) {
		  float c = Integer.parseInt(JOptionPane.showInputDialog("ingrese los centavos que desee: "));
		  Centavos = c;
		}
		int i = 1;
		int ValorAnual = 0;
		int Barriles=0;
		double ValorMensual=0;
		
		while(i<=Meses) {
			AumentoMensual=(AumentoMensual+Centavos);
			ValorMensual = (9600+AumentoMensual)*400;
			Barriles = Barriles + 400;
			if(i==12) {
				ValorAnual = (int) ValorMensual;
			}
			i++;
		}
		JOptionPane.showMessageDialog(null,
				                           " El ingreso mensual es de : $"+IngresoMensual+"\n El ingreso anual es de: $"+ValorAnual+"\n El ingreso total es de: $"+ValorMensual+"\n El total de barriles vendidos: $"+Barriles);
	}
}
