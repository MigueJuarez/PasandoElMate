package parcialOIA;
import java.io.File;
public class MainOIA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File e=new File ("LoteDePrueba\\IN\\Caso_03_CasoEnunciado2.in");
		File s=new File ("archivo.out");
		
		LosAventurerosMateros aResolver=new LosAventurerosMateros(e,s);
		
		aResolver.resolver();
		
	}

}
