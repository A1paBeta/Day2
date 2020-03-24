import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n, m;
    n = scan.nextInt();
    m = scan.nextInt();

    System.out.println("n = " + String.valueOf(n) + ", m = " + String.valueOf(m));

    //1. Math operator (수학 연산자)
    System.out.println("n + m = " + String.valueOf(n+m));
    System.out.println("n - m = " + String.valueOf(n-m));
    System.out.println("n * m = " + String.valueOf(n*m));
    System.out.println("n / m = " + String.valueOf(n/m));
    System.out.println("(floating Number) n / m = " + String.valueOf(n/(double)m));
    System.out.println("n % m = " + String.valueOf(n%m));

    //2. Logic operator (논리 연산자)
    boolean t = true, f = false;
    System.out.println("t && f = " + String.valueOf(t&&f));
    System.out.println("t && t = " + String.valueOf(t&&t));
    System.out.println("f && f = " + String.valueOf(f&&f));

    System.out.println("t || f = " + String.valueOf(t||f));
    System.out.println("t || t = " + String.valueOf(t||t));
    System.out.println("f || f = " + String.valueOf(f||f));

    System.out.println("!t = " + String.valueOf(!t));
    System.out.println("!f = " + String.valueOf(!f));
    
    //This code is modified

  }
}
