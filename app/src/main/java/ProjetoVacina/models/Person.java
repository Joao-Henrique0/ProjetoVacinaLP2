package ProjetoVacina.models;

import ProjetoVacina.models.SignaturesObjects.PriorityGroup;
import ProjetoVacina.models.SignaturesObjects.Sexo;

public class Person {
    private String name;
    private String cpf;
    private Sexo sex;
    private PriorityGroup priorityGroup;

    public Person(String name, String cpf, Sexo sex, PriorityGroup priorityGroup){
        this.name = name;
        this.cpf = cpf;
        this.sex = sex;
        this.priorityGroup = priorityGroup;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void print(){
        System.out.println("Nome = " + name + " Cpf = "+ cpf +" Sexo = " + sex.toString() + " Grupo de Prioridade = "+ priorityGroup.toString());
    }
}

