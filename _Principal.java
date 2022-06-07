package aula04eExercicio;

public class _Principal {
    public static void main(String[]args){
        Funcionarios f1 = new Funcionarios("Teto",23,"Estagiario","Ativo");
        Funcionarios f2 = new Funcionarios("Matue",67,"Chefe","Ativo");
        Funcionarios f3 = new Funcionarios("Wiu",23,"Pleno","Ativo");
        Funcionarios f4 = new Funcionarios("Ualisson",44,"Senior","Ativo");

        System.out.println(f1.getNome()+", você não faz mais parte dessa empresa");
        System.out.println("Status anterior: "+f1.getSituacao()); //teste
        f1.setSituacao(f1.demitirFuncionario());
        System.out.println("Status atual: "+f1.getSituacao()); //teste

        System.out.println("");

        System.out.println("Parabéns " +f2.getNome()+", você foi promovido(a)");
        System.out.println("Status anterior: "+f2.getCargo()); //teste
        f2.setCargo(f2.trocarCargoFuncionario(f2.getCargo()));
        System.out.println("Status atual: "+f2.getCargo()); //teste

        System.out.println("");

        System.out.println("Olá " +f3.getNome()+", feliz aniversário");
        System.out.println("Status anterior: "+f3.getIdade()); //teste
        f3.setIdade(f3.aniversario());
        System.out.println("Status atual: "+f3.getIdade()); //teste

        System.out.println("");

        System.out.println("Olá " +f4.getNome()+", "+f4.pagarSalario());

    }

}
