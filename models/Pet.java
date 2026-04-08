// Rafael Sant' Anna dos Santos 3a tec ti
// Pedro Delgado Pereira Pinto 3a tec ti
// Bernardo Soares Zacharias 3a tec ti
// Cassio Cesar de Souza Brito 3a tec ti


package com.sgp.models;

public class Pet {

    private String nome;
    private String especie;
    private int anoNascimento;
    private double peso;

    //  Construtor
    public Pet() {
        this.nome = "Rex";
        this.especie = "Cachorro";
        this.anoNascimento = 2023;
        this.peso = 15.5;
    }

    public Pet(String nome, String especie, int anoNascimento, double peso) {
        setNome(nome);
        setEspecie(especie);
        setAnoNascimento(anoNascimento);
        setPeso(peso);
    }

    //  Metodo especifico 
    public void saudacao() {
        System.out.println("O pet " + nome + ", que é um " + especie + ", tem " + calcularIdade() + " anos de idade.");
    }
    
    public int calcularIdade() {
        return 2026 - anoNascimento;
    }

    // Get
    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public double getPeso() {
        return peso;
    }

    //  Set com validação
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.trim().isEmpty()) {
            throw new IllegalArgumentException("Espécie inválida!");
        }
        this.especie = especie;
    }

    public void setAnoNascimento(int anoNascimento) {
        // Considerando que o pet não pode ter nascido no futuro ou ser irrealisticamente velho
        if (anoNascimento < 1990 || anoNascimento > 2026) {
            throw new IllegalArgumentException("Ano de nascimento inválido!");
        }
        this.anoNascimento = anoNascimento;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido! O peso deve ser maior que zero.");
        }
        this.peso = peso;
    }

    // toString 
    @Override
    public String toString() {
        return "Pet [nome=" + nome + ", especie=" + especie + ", anoNascimento=" + anoNascimento + ", peso=" + peso + "kg, idade=" + calcularIdade() + " anos]";
    }
}
