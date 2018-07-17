package parcialOIA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//import com.sun.java.swing.plaf.windows.TMSchema.Part;

public class LosAventurerosMateros extends EjercicioOIA{

	long cantidadIntegrantes;
	long cebador;
	ArrayList<Long> descartados;
	
	FileWriter fw;
	FileReader fr;
	BufferedReader br;
	BufferedWriter bw;
	
	public LosAventurerosMateros(File entrada, File salida) {
		super(entrada, salida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void resolver() {
		// TODO Auto-generated method stub
		try {
			
			fr=new FileReader(super.entrada);
			br=new BufferedReader(fr);
			
			Participantes [] participantes;
			descartados=new ArrayList<Long>();
			
			cantidadIntegrantes=Integer.parseInt(br.readLine());
			String [] linea=br.readLine().split(" ");
			cebador=1;
			
			participantes=new Participantes[(int) cantidadIntegrantes+1];
			
			for(int i=1;i<participantes.length;i++)
				participantes[i]=new Participantes();
			
			long j=1;
			
			for(int i=0;i<linea.length;i++) {
				
				for(int x = 1;x<=Long.parseLong(linea[i]);x++) {
					j++;
					if(j>cantidadIntegrantes)			
						j=1;					
					while(participantes[(int)j].isDescartado())
						{
							j++;
							if(j>cantidadIntegrantes)	
								j=1;
						}
				}
				
				participantes[(int)j].setDescartado(true);
				j++;
				if(j>cantidadIntegrantes)
					j=1;	
				while(participantes[(int)j].isDescartado())
				{
					j++;
					if(j>cantidadIntegrantes)	
						j=1;
				}
			}
				
			fw=new FileWriter(salida);
			
			bw=new BufferedWriter(fw);
			
			for(int i=0;i<descartados.size();i++)
			bw.write(descartados.get(i)+" ");
			bw.newLine();
			bw.write((int) j);
			bw.flush();
			bw.close();
			
			System.out.println(j);
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException ee)
		{
			ee.printStackTrace();

		}
		finally
		{
			try
			{
			fr.close();
			br.close();
			}
			catch(IOException ee)
			{
				ee.printStackTrace();
			}
		}
	}
	
	
}
