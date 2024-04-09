package model;

public class FilaGeneric<T> {
	private No<T> inicio;
	private No<T> fim;

	public FilaGeneric() {
		inicio = null;
		fim = null;
	}

	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		}
		return false;

	}

	public void insert(T valor) {
		No<T> elemento = new No<T>();
		elemento.dado = valor;

		if (isEmpty()) { // Se está vazio, inicio e fim apontam para o mesmo valor
			inicio = elemento;
			fim = elemento;
		} else { // Caso contrário, elemento entra pelo fim
			fim.proximo = elemento;
			fim = elemento;
		}
	}

	public T remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos na fila");
		}
		T valor = inicio.dado;
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = inicio;
		} else {
			inicio = inicio.proximo;
		}
		return valor;
	}

	public void list() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos na fila");
		}
		No<T> aux = inicio;
		while (aux != null) {
			System.out.print(aux.dado + " => ");
			aux = aux.proximo;
		}
		System.out.println("null");

	}

	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No<T> aux = inicio;
			while (aux != null) {
				cont++;
				aux = aux.proximo;
			}
		}
		return cont;
	}

}