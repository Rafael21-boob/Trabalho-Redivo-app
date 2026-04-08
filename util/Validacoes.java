package util;

public class Validacoes {

    private Validacoes() {
    }

    public static boolean nomeValido(String nome) {
        return !(nome == null || nome.trim().isEmpty() ||
                nome.matches(".*\\d+.*"));
    }

    public static String mensagemString(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            return "Erro: o nome não pode ser vazio.";
        } else if (nome.matches(".*\\d+.*")) {
            return "Erro: o nome não pode conter números.";
        }
        return "";
    }

    // Validação de Ano de Nascimento (Pets vivos hoje dificilmente nasceram antes de 1990)
    public static boolean anoValida(int ano) {
        return ano >= 1990 && ano <= 2026;
    }

    public static String mensagemErroAno(int ano) {
        if (ano < 1990 || ano > 2026) {
            return "Erro: ano de nascimento inválido (deve ser entre 1990 e 2026).";
        }
        return "";
    }

    // Validação de Peso
    public static boolean pesoValido(double peso) {
        return peso > 0;
    }

    public static String mensagemErroPeso(double peso) {
        if (peso <= 0) {
            return "Erro: o peso deve ser maior que zero.";
        }
        return "";
    }

    // Validação de Espécie
    public static boolean especieValido(String especie) {
        return !(especie == null || especie.trim().isEmpty());
    }

    public static String mensagemErroEspecie(String especie) {
        if (especie == null || especie.trim().isEmpty()) {
            return "Erro: a espécie não pode estar vazia.";
        }
        return "";
    }
}