import java.util.Collections;
import java.util.List;

public class main {

	public static void main(String[] args) {
		Proceso process;
		int size;
		for (int i = 0; i < 5; i++) {
			process = new Proceso(((int) Math.floor(Math.random()*4+1)*1000),"P_"+i);
			ColaProceso.put(process);
		}
		Collections.shuffle((List<?>) ColaProceso.cola);
		size=ColaProceso.cola.size();
		for (int i = 0; i < size; i++) {
			try {
				System.out.println("***********************************");
				ColaProceso.sirve();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
