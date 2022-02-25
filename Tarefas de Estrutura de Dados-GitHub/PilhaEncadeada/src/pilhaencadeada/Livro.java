package pilhaencadeada;

public class Livro {

    private String titulo, autor, editora;

    public String getLivro() {
        return (titulo + "\n" + autor + "\n" + editora + "\n");
    }

    public Livro(String t, String a, String e) {
        titulo = t;
        autor = a;
        editora = e;
    }
}
