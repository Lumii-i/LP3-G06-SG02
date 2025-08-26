package actividades_s2_ac2;

public class Contador {
    private int valor;
    static int acumulador = 0;
    public static final int VALOR_INICIAL = 10;

    public Contador(int valor){
        this.valor = valor;
        acumulador += valor;
    }

    public Contador(){
        this(Contador.VALOR_INICIAL);
    }

    public void inc(){
        valor++;
        acumulador++;
    }

    public int getValor(){
        return valor;
    }

    public static int getAcumulador(){
        return acumulador;
    }
}
