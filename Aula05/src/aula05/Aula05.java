package aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.abrirConta(123, "Jubileu", "cc");
        pessoa1.depositar(300);
        pessoa1.estadoAtual();
        pessoa1.sacar(188.5f);
        pessoa1.estadoAtual();
        
        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.abrirConta(456, "Creusa", "cp");
        pessoa2.depositar(500);
        pessoa2.estadoAtual();
        pessoa2.sacar(250.5f);
        pessoa2.estadoAtual();
    }   
}
