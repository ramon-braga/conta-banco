public class Autor {
    
    private String nome;
    private String email;
    private String cpf;

    String getNome() {
        return this.nome;
    }
    void setNome(String nome) {
        this.nome = nome;
    }

    String getEmail() {
        return this.email;
    }
    void setEmail(String email) {
        this.email = email;
    }

    String getCpf() {
        return this.cpf;
    }
    void setCpf(String cpf) {
        this.cpf = cpf;
    }

    void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do autor");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
    }
}
