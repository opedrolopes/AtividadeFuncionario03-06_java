package aula04eExercicio;

public class Funcionarios {

    private String nome;
    private int idade;
    private String cargo;
    private String situacao;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public Funcionarios(String nome, int idade, String cargo, String situacao) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCargo(cargo);
        this.setSituacao(situacao);
    }

    public String demitirFuncionario(){
        return this.situacao = "Inativo";
    }

    public String trocarCargoFuncionario(String cargo){
        if(cargo == "Estagiario"){
            return this.cargo ="Dev. Junior";
        } else if (cargo == "Dev. Junior"){
            return this.cargo ="Pleno";
        } else if (cargo == "Pleno" ){
            return this.cargo ="Senior";
        } else {
            return this.cargo ="Chefe";
        }
    }

    public int aniversario(){
        return this.idade = ++idade;
    }

    public String pagarSalario(){

        return "O salário foi pago" ;
    }


}


