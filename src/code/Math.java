package code;

public class Math {
    public static void main(String[] args) {
        // libreria math(metodos)
        double raiz = java.lang.Math.sqrt(9);// raiz cuadrada
        System.out.println(raiz);
        double base = 6, exp = 3;
        double res = java.lang.Math.pow(base,exp); //exponentes
        System.out.println(res);
        double num = 4.56;
        float nume = 3.53f;
        long resultado = java.lang.Math.round(num);//redondeo
        int resu = java.lang.Math.round(nume);
        System.out.println(resultado);
        System.out.println(resu);
        double aleatorio = java.lang.Math.random();//numeros randoms
        System.out.println(aleatorio);
    }
}
