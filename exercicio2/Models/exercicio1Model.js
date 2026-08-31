class Pessoa{
    constructor(nome, cpf){
        this.nome = nome;
        this.cpf = cpf
    }

    apresentar(){
        console.log('nome:',this.nome,'cpf:',this.cpf);
    }
}

class Aluno extends Pessoa{
    constructor(nome,cpf,rm){
        super(nome,cpf);
        this.rm = rm;
    }
apresentar(){
    super.apresentar();
    console.log('rm',this.rm);
    }
}

const josue = new Pessoa('Josue','123.456.789-67');
josue.apresentar();

const davi = new Aluno('Davi','123.123.123-67','9995');
davi.apresentar();
