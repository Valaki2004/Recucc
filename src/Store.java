/*
* File: Store.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: oktat
* Date: 2024-11-27
* Github: https://github.com/oktat/
* Licenc: MIT
*/
/*Refaktorálva:VTG,2024-11-28*/

import java.io.FileWriter;
import java.io.IOException;

public class Store {
  public void TXTFileWriter(Incident incident){
    try {
      tryTXTFileWriter(incident);
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }
  public void tryTXTFileWriter(Incident incident) throws IOException {
    FileWriter fileWriter = new FileWriter("incidents.txt");
    fileWriter.write(incident.name + ":" + incident.error + "\n");
    fileWriter.close();
  }
}
