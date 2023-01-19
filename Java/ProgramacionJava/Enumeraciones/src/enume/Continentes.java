package enume;
public enum Continentes {
    ASIA(44),
    AFRICA(53),
    AMERICA(34),
    EUROPA(46),
    OCEANIA(14);
    
    private final int paises;
    Continentes(int paises){
        this.paises = paises;
    }
    public int getPaises(){
        return this.paises;
    }
}
