package fr.valportail;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    // Vérification du bon fonctionnement de MD5
    String password = "aaaaaaaaaaaaaaaaaaaa";
    System.out.println(AwesomePasswordChecker.computeMD5(password));

    // Vérification du calcul de distances
    AwesomePasswordChecker apc = AwesomePasswordChecker.getInstance();
    System.out.println(apc.getDistance(password));
  }
}
