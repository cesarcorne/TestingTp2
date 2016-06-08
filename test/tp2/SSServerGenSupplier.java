package tp2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

public class SSServerGenSupplier extends ParameterSupplier{

	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
		List<PotentialAssignment> values = new ArrayList<PotentialAssignment>();
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			// Leemos el archivo serializado generado por Korat
			File f = new File("/home/cesar/Escritorio/testing/tp2/tp2/objects.ser");
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			for (int i = 0; i < fis.available(); i++) {
				Server server = (Server) ois.readObject();
				values.add(PotentialAssignment.forValue(Integer.toString(i), server));
			}
			ois.close();
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}

	
		return values;
	}

}
