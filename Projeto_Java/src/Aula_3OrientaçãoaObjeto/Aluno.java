package Aula_3Orienta��oaObjeto;

public class Aluno {
    private String matricula;
    private String nome;//vari�vel privada da classe Aluno. S� acessada com modificadores de m�todos
    public String getMatricula(){//valor de retorno tipo String
        return matricula;//get d� acesso a vari�vel privada de uma classe
    }
    public void setMatricula(String matricula){// valor de retorno void(vazio)
        this.matricula = matricula;//set d� acesso a manipula��o da vari�vel privada de uma classe
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
