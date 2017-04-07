import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lanceur {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("fichier1.txt");
		FileReader fr = new FileReader(f);
		
		File f2 = new File("fichier3.txt"); //renvoie des entiers : code binaire de chaque lettre
		FileWriter fw = new FileWriter (f2);
		
		
		int c;
		while((c=fr.read())!=-1)
		{
			System.out.println(c);
			fw.write(c+1);
		}
		
		fr.close();
		fw.close();
		
		
		File f4 = new File("fichier3.txt");
		FileReader fr1 = new FileReader(f4);
		File f3 = new File("fichier4.txt");
		FileWriter fw2 = new FileWriter (f3);
		
		
		int y;
		while ((y=fr1.read())!=-1)
		{
			fw2.write(y-1);
		}
		
		
		
		fr1.close();
		fw2.close();
		
	}

}
