import java.time.LocalDate;

public class Anotacao {

    private String titulo;
    private String texto;
    private LocalDate data;

    public Anotacao() {
        this.data = LocalDate.now();
    }

    public Anotacao(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
        this.data = LocalDate.now();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                ", texto='" + texto + '\'' +
                ", data=" + data +
                '}';
    }
}
