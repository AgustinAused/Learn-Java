package code;

public class Math {
    public static void main(String[] args) {
        // libreria math(metodos)
        double raiz = java.lang.Math.sqrt(9);
        System.out.println(raiz);
        double base = 6, exp = 3;
        double res = java.lang.Math.pow(base,exp);
        System.out.println(res);
        double num = 4.56;
        float nume = 3.53f;
        long resultado = java.lang.Math.round(num);
        int resu = java.lang.Math.round(nume);
        System.out.println(resultado);
        System.out.println(resu);
    }
}
