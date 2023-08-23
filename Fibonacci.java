package ch.competec;

import java.util.Arrays;



  public class Fibonacci {
    private int limit;
    private boolean[] istPrim;

    public Fibonacci(int limit) {
      this.limit = limit;
      this.istPrim = siebVonEratosthenes(limit);
    }

    public void findeFibonacciPrimzahlen(int n) {
      int gefunden = 0;
      int vorherige = 0, aktuelle = 1;

      while (gefunden < n) {
        int nächste = vorherige + aktuelle;
        vorherige = aktuelle;
        aktuelle = nächste;

        if (nächste < limit && istPrim[nächste]) {
          System.out.println(nächste + " ist eine Fibonacci-Primzahl");
          gefunden++;
        }

        if (nächste >= limit) {
          System.out.println("Limit erreicht. Bitte erhöhen.");
          break;
        }
      }
    }

    private boolean[] siebVonEratosthenes(int limit) {
      boolean[] istPrim = new boolean[limit];
      Arrays.fill(istPrim, true);
      istPrim[0] = istPrim[1] = false;

      for (int i = 2; i < Math.sqrt(limit); i++) {
        if (istPrim[i]) {
          for (int j = i * i; j < limit; j += i) {
            istPrim[j] = false;
          }
        }
      }
      return istPrim;
    }


}
