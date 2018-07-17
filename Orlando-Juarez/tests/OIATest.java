import org.junit.Test;
import parcialOIA.LosAventurerosMateros;
import java.io.File;


public class OIATest {
	
	File e,s;
	LosAventurerosMateros aResolver;
	

	@Test
	public void caso_01()
	{
		
		e=new File ("LoteDePrueba\\IN\\Caso_01_unCebador.in");
		s=new File ("Caso_01.out");
		aResolver=new LosAventurerosMateros(e,s);
		aResolver.resolver();
		
	}
	@Test
	public void caso_02()
	{
		
		e=new File ("LoteDePrueba\\IN\\Caso_02_CasoEnunciado1.in");
		s=new File ("Caso_02.out");
		aResolver=new LosAventurerosMateros(e,s);
		aResolver.resolver();
		
	}
	@Test
	public void caso_03()
	{
		
		e=new File ("LoteDePrueba\\IN\\Caso_03_CasoEnunciado2.in");
		s=new File ("Caso_03.out");
		aResolver=new LosAventurerosMateros(e,s);
		aResolver.resolver();
		
	}
	@Test
	public void caso_04()
	{
		
		e=new File ("LoteDePrueba\\IN\\Caso_04_VueltasMayorQIntegrantes.in");
		s=new File ("Caso_04.out");
		aResolver=new LosAventurerosMateros(e,s);
		aResolver.resolver();
		
	}

}