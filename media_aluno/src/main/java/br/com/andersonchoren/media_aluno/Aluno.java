package br.com.andersonchoren.media_aluno;

public class Aluno {
    private float n1, n2, n3, n4, media;

    public Aluno(float n1, float n2, float n3, float n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.calcularMedia();
    }

    private void calcularMedia() {
        this.media = (this.n1 + this.n2 + this.n3 + this.n4) / 4;
    }

    public String verificarStatusDaAprovacao() {
        if (this.media >= 7)
            return "Aluno aprovado!!!";
        else if (this.media < 5)
            return "Aluno reprovado!!!";
        else
            return "Aluno em exame!!!";
    }

    public String verificarStatusExame(float notaExame) {
        this.media = (notaExame + this.media) / 2;
        if (this.media >= 5)
            return "Aluno aprovado!!!";
        else
            return "Aluno reprovado!!!";
    }

    public boolean deveFazerExame() {
        return this.media >= 5 && this.media < 7;
    }

    public float getMedia() {
        return media;
    }

    public String obterMedia() {
//        return "Média: " + this.media;
        return String.format("Media: %.1f",this.media);
    }
}
