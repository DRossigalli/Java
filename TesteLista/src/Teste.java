import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		List<String> lista = new LinkedList<>();
		lista.add("Ana");
		lista.add("Bete");
		lista.add("Zuleika");
		lista.add("Antonio");
		lista.add("Diego");
		lista.add("Diego");
		
		System.out.println(lista);
		
		//remocão do Diego usando foreach

//		for(int i = 0; i < lista.size(); i++) {
//			if (lista.get(i).equals("Diego")) {
//				lista.remove(i);
//			}
//		}
		
		String aux;
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			aux = it.next();
			if (aux.equals("Diego")) {
				it.remove();
			}
		}
		
		System.out.println(lista);
	}

}
