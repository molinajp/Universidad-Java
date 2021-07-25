package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a,b;
    
    //Constructor vacío
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    //Constructor con argumentos
    public Aritmetica(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        return a + b;
    }
    
    public int sumarConArgumentos(int a,int b){
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }
}
