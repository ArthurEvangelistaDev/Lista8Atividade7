class Tamagushi {

    private String nome;
    private int fome, saude, idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getFome() {
        return this.fome;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getSaude() {
        return this.saude;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getHumor() {
        return (this.fome + this.saude) / 2;
    }

    public void mudarNome(String nome) {
        this.nome = nome;
    }

    public void aumentarFome(int valor) {
        this.fome = this.fome < 100 ? this.fome + valor : this.fome;
    }

    public void diminuirFome(int valor) {
        this.fome = this.fome > 0 ? this.fome - valor : this.fome;
    }

    public void aumentarSaude(int saude) {
        this.saude = this.saude < 100 ? this.saude + saude : this.saude;
    }

    public void diminuirSaude(int saude) {
        this.saude = this.saude > 0 ? this.saude - saude : this.saude;
    }

    public void aumentarIdade(int idade) {
        this.idade = this.idade + idade;
    }

    public void diminuiIdade(int idade) {
        this.idade = this.idade > 0 ? this.idade - idade : this.idade;
    }

}