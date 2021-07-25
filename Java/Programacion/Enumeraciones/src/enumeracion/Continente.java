package enumeracion;

public enum Continente {
    AFRICA(53),
    EUROPA(46),
    ASIA(44), 
    AMERICA(34), 
    OCEANIA(14);
    
    private final int paises;
        
    Continente(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
