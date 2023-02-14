package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {  // extende de Conteúdo pois utiliza título, descrição e soma LocalDate
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    } // sobreescreve metodo calcularXP e adiciona 20
    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
