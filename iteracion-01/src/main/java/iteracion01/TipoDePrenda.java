package iteracion01;

import java.util.Objects;

public enum TipoDePrenda {
  REMERA(Categoria.PARTE_SUPERIOR),
  CAMISA_MANGA_CORTA(Categoria.PARTE_SUPERIOR),
  CAMISA_MANGA_LARGA(Categoria.PARTE_SUPERIOR),
  PANTALON(Categoria.PARTE_INFERIOR),
  POLLERA(Categoria.PARTE_INFERIOR),
  ZAPATOS(Categoria.CALZADO),
  ZAPATILLAS(Categoria.CALZADO),
  BOTAS(Categoria.CALZADO),
  PANUELO(Categoria.ACCESORIO),
  ANTEOJOS(Categoria.ACCESORIO);

  private final Categoria categoria;

  TipoDePrenda(Categoria categoria) {
    this.categoria = Objects.requireNonNull(categoria, "Categoria no puede ser nulo");
  }



  public Categoria getCategoria() {
    return categoria;
  }
}

