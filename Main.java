import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    while (true) {
      System.out.println("==============================");
      System.out.println("        [!KALKULATOR!]        ");
      System.out.println("==============================");
      System.out.println("1. Suma 2. Różnica 3. Iloczyn 4. Iloraz");
        System.out.println("");
      int program = s.nextInt();
      if (program < 0 || program > 5) {

      System.out.println("==============================");
      System.out.println("        [ERROR] [ERROR]       ");
      System.out.println("==============================");
        System.out.println("");
      System.out.println("--------------------------------------------------------------");
        System.out.println("");
      continue;
      }
        System.out.println("");
      System.out.println("|Podaj Liczbę a: ");
        System.out.println("");
      Float a = s.nextFloat();
        System.out.println("");
      System.out.println("||Podaj Liczbę b: ");
        System.out.println("");
      float b = s.nextFloat();
        System.out.println("");
      switch (program) {
        case 1:
          System.out.println("Wynik: "+ (a+b));
          break;
        case 2:
          System.out.println("Wynik: "+ (a-b));
          break;
        case 3:
          System.out.println("Wynik: "+ (a*b));
          break;
        case 4:
          if(b==0){
          System.out.println("NIE DZIEL PRZEZ ZERO GAMONIU");
            System.out.println("");
            System.out.println("");
          continue;
          }
          
          System.out.println("Wynik: "+ (a/b));
          break;
      }
    }
  }
}