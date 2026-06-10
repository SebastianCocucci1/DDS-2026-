package iteracion01;
import java.util.Objects;

public class Prenda {
  private TipoDePrenda tipo;
  private Tela tela;
  private String colorPrincipal;
  private String colorSecundario;

  public Prenda(TipoDePrenda tipo, Tela tela, String colorPrimario) {
    this.tipo = Objects.requireNonNull(tipo, "El tipo no puede ser nulo");
    this.tela = Objects.requireNonNull(tela, "La tela no puede ser nula");
    this.colorPrincipal = Objects.requireNonNull(colorPrimario, "El color primario no puede ser nulo");
  }

  public TipoDePrenda getTipo() {
    return tipo;
  }


  public void setColorSecundario(String colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public String getColorSecundario() {
    return colorSecundario;
  }


}

