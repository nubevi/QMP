public class ConstructorDePrendas {
    private TipoPrenda tipoPrenda;
    private Trama trama = Trama.LISA;
    private Color colorPrimario;
    private Color colorSecundario;
    private Material material;

    public void inicializarPrenda(TipoPrenda tipoDePrenda){
        this.tipoPrenda = tipoDePrenda;
    }

    public void setTrama(Trama trama) {
        // VALIDACION
        this.trama = trama;
    }

    public void setColorPrimario(Color colorPrimario) {
        // VALIDACION
        this.colorPrimario = colorPrimario;
    }

    public void setColorSecundario(Color colorSecundario) {
        // VALIDACION
        this.colorSecundario = colorSecundario;
    }

    public void setMaterial(Material material) {
        // VALIDACION
        this.material = material;
    }

    public Prenda guardarPrenda(){
        // Si es valida...
        return new Prenda(this.tipoPrenda, this.material, this.colorPrimario, this.colorSecundario);
    }
}
