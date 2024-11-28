/*
* File: Console.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: oktat
* Date: 2024-11-27
* Github: https://github.com/oktat/
* Licenc: MIT
*/
/*Refaktorálva:VTG,2024-11-28*/

import java.util.Scanner;

public class IncidentConsoleApp {

  public void Inputincident(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Bejelentő neve: ");
    String incidentnameString = sc.nextLine();
    System.out.print("Hiba leírása: ");

    String error = sc.nextLine();
    Store store = new Store();
    Incident incident = new Incident();

    incident.name = incidentnameString;
    incident.error = error;

    try {
      store.TXTFileWriter(incident);
    } catch (Exception e) {
      System.out.println(incidentnameString + " hiba leírt: " + error);
    }
    sc.close();
  }
}
