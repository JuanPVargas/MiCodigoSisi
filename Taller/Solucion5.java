package Taller;

import javax.swing.JOptionPane;

public class Solucion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double CuotaFija = 60.00;
		double LitrosConsumidos;
		
		//pedir al usuario los litros que consumio
		LitrosConsumidos = Double.parseDouble(JOptionPane.showInputDialog("¿cuantos litros consumio?"));
		
		// si consumio 50 o menos se le cobrara la cuota fija
		if (LitrosConsumidos <= 50) {
			JOptionPane.showMessageDialog(null, "debe pagar $" + CuotaFija + " en su recibo de agua");
		}
		
		//si consumio entre 50 a 200 se le conrara adicionalmente $30 por litro consumido
		else if (LitrosConsumidos <= 200) {
			
			double MasDe50 = LitrosConsumidos - 50;
			double Opcion2 = MasDe50 * 30.00;
			double SegundaOpcion = 60.00 + Opcion2;
			JOptionPane.showMessageDialog(null, "debe pagar $" + SegundaOpcion + " en su recibo de agua");
		}
		
		//a partir de los 200 metros consumidos se cobra por cada metro $50
		else if (LitrosConsumidos > 200) {
			
			double MasDe200 = LitrosConsumidos - 200;
			double Opcion3 = MasDe200 * 50.00;
			double TerceraOpcion = 4560.00 + Opcion3;
			JOptionPane.showMessageDialog(null, "debe pagar $" + TerceraOpcion + " en su recibo de agua");
		}
		
	}

}
