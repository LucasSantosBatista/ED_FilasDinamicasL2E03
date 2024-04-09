package view;

import model.FilaGeneric;

public class Main {
	public static void main(String[] args) {
		int[] vetor = { 26, 48, 77, 19, 92, 51, 64, 63, 75, 53, 70, 87, 36, 64, 69, 22, 47, 9, 28 };

		FilaGeneric<Integer> f = new FilaGeneric<>();

		try {
			for (int valor : vetor) {
				if (f.isEmpty()) {
					f.insert(valor);
					System.out.println("Insert => " + valor);
				} else if (valor > 50) {
					valor += f.remove();
					System.out.println("Remove + valor");
					f.insert(valor);
					System.out.println("Insert => " + valor);
				} else {
					int valor2 = f.remove();
					System.out.println("Remove => " + valor2);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.print("Fila: ");
			f.list();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}