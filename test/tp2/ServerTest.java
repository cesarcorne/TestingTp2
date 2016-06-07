package tp2;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.experimental.theories.PotentialAssignment;


public class ServerTest {
	
	
	@Test
	public void test() {
		List<Server> list = deserialize();
		for (Server server : list) {
			System.out.println(server.toString());
		}
		
		assertTrue(true);
	}

	/**
	 * Metodo que deserealiza los objetos generados por Korat.
	 * 
	 * @return La lista de objetos generados por Korat
	 * */
	private List<Server> deserialize(){
		List<Server> result = new ArrayList<Server>();
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			// Leemos el archivo serializado generado por Korat
			File f = new File("/home/cristian/workspace/TestingTp2/objects.ser");
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			for (int i = 0; i < fis.available(); i++) {
				Server server = (Server) ois.readObject();
				result.add(server);
			}
			ois.close();
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}

		return result;
	}

}
