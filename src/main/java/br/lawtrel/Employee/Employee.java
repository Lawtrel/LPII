package br.lawtrel.Employee;
class Gerente extends Employee {
    private double bonus;

    public Gerente(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public double calcularSalario() {
        return 5000.0 + bonus;
    }
}

class Programador extends  Employee {
    private int horasExtras;

    public Programador(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return 3500.0 + (horasExtras * 20.0);
    }
}

public class Employee {
    public double calcularSalario() {
        return 0.0;
    }
    public static void main(String[] args) {
        Gerente gerente = new Gerente(1000);
        System.out.println("Salario do Gerente: $" + gerente.calcularSalario());

        Programador programador = new Programador(100);
        System.out.println("Salario do Programador: $" + programador.calcularSalario());
    }
}