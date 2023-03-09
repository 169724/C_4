import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    while (true) {
      System.out.println("Kalkulator!!!!");
      System.out.println("1. Suma 2. Różnica 3. Iloczyn 4. Iloraz");
      int program = s.nextInt();
      if (program < 0 || program > 5) {
        System.out.println("WYBIERZ PROGRAM OD 1 DO 4!!!!");
        System.out.println("=============================");
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("=============================");
        continue;
      }

      System.out.println("|Podaj Liczbę a: ");
      Float a = s.nextFloat();
      System.out.println("||Podaj Liczbę b: ");
      float b = s.nextFloat();
      switch (program) {
        case 1:
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
      }
    }
  }
}