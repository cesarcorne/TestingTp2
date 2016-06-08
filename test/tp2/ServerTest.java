package tp2;

import static org.hamcrest.CoreMatchers.is;
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
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import tp2.SSServerGen;
import tp2.Server;

@RunWith(Theories.class)
public class ServerTest {
	
	/*
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
	/*
	private List<Server> deserialize(){
		List<Server> result = new ArrayList<Server>();
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			// Leemos el archivo serializado generado por Korat
			File f = new File("/home/cesar/Escritorio/testing/korat/tp2.ser");
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
	*/
	
	@Theory
	public void test2(@SSServerGen Server s){

		
		//System.out.println(s.toString());
		
		s.update(); 
		assertThat(s.repOK(),is(true));
	 
	}

}
