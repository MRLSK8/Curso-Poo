package aula07;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.setCategoria(peso);
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
    }
    
    public void apresentar(){
        System.out.println("\nLutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates() + "\n");
    }
    
    public void status(){
        System.out.print("\n" + getNome() + " é um peso " + this.getCategoria() + ",");
        System.out.print(getVitorias() + " vitorias,");
        System.out.print(getDerrotas() + " derrotas e ");
        System.out.println(getEmpates() + " empates.\n");
    }
    
    public void ganharLuta(){
        this.vitorias += 1;
    }
    
    public void perderLuta(){
        this.derrotas += 1;
    }
    
    public void empatarLuta(){
        this.empates += 1;
    }   

    public String getNome() {
        return this.nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(peso);
    }

    private void setCategoria(float peso) {
        if(peso < 52.2){
            this.categoria = "Invalido";
        }else if(peso < 70.3){
            this.categoria = "Leve";
        }else if(peso < 80.9){
            this.categoria = "Médio";
        }else{
            this.categoria = "Pesado";
        }
    }
}
