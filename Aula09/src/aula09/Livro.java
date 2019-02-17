package aula09;

public class Livro implements Publicacao{
    private String titulo;   
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.aberto = false;
        this.pagAtual = 0;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro: " + "titulo =" + titulo + ", autor =" + autor + ", totPaginas = " + totPaginas + ","
                + " pagAtual = " + pagAtual + ", aberto = " + aberto + ", leitor = " + leitor.getNome() + "\n\n";
    }
     
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pag) {
        if(this.getTotPaginas() >= pag){
            this.setPagAtual(pag);
        }else{
            System.out.println("Erro!");
        }
    }

    @Override
    public void avancarPag() {
        if(this.getTotPaginas() > this.getPagAtual()){
            this.pagAtual += 1;
        }else{
            System.out.println("Erro!");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getPagAtual() > 1){
            this.pagAtual -= 1;
        }else{
            System.out.println("Erro!");
        }
    }
}
