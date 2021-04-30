public enum TipoPrenda {
    CAMISA(Categoria.PARTE_SUPERIOR),
    PANTALON(Categoria.PARTE_INFERIOR),
    REMERA(Categoria.PARTE_SUPERIOR),
    ZAPATILLA(Categoria.CALZADO),
    ZAPATOS(Categoria.CALZADO);

    private Categoria categoria;

    private TipoPrenda(Categoria categoria){
        this.categoria = categoria;
    }
}
