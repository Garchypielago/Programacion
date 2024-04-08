package serializables4;

import java.io.*;
  public class ClaseOutput extends ObjectOutputStream { 
	ClaseOutput(OutputStream f) throws IOException {
		super(f);
	} // Constructor
	
	protected void writeStreamHeader() throws IOException{} // Reescribe esta para que no se escriba la cabecera
}