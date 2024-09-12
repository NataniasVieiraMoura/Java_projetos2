package Aula_3OrientaçãoaObjeto;

public class Aluno {
    private String matricula;
    private String nome;//variável privada da classe Aluno. Só acessada com modificadores de métodos
    public String getMatricula(){//valor de retorno tipo String
        return matricula;//get dá acesso a variável privada de uma classe
    }
    public void setMatricula(String matricula){// valor de retorno void(vazio)
        this.matricula = matricula;//set dá acesso a manipulação da variável privada de uma classe
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
