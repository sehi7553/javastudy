package gugudan;

public class Start {
    public static void main(String[] args) {
        Ggd g = new Ggdmpl();
        for(int a = 1; a <= 9; a++){
            System.out.println(a+"단");
            for(int b = 1; b <= 9; b++){
                System.out.println(a + " X " + b + " = " + g.ggd(a,b));
            }
        }
    }
}
