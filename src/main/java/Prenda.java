import static java.util.Objects.requireNonNull;

public class Prenda {
    private TipoPrenda tipoPrenda;
    private Material material;
    private Color colorPrincipal;
    private Color colorSecundario;

    public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrincipal, Color colorSecundario) {
        this.tipoPrenda = requireNonNull(tipoPrenda, "Falta el Tipo de Prenda");
        this.material = requireNonNull(material, "Falta el Material de la Prenda");
        this.colorPrincipal = requireNonNull(colorPrincipal, "Falta el Color Principal de la Prenda");
        this.colorSecundario = colorSecundario;
    }
}
