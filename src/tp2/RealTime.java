package tp2;

import java.io.Serializable;

public class RealTime implements ITime, Serializable {

	public  static final long serialVersionUID = 1;
	public long getCurrentTime() {
		return System.currentTimeMillis();
	}

	
}
