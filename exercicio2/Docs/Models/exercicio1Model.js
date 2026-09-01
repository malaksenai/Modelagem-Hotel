class Hotel{
    constructor(nome, qtdQuartos, avaliacao, localizacao){
        this.nome = nome;
        this.qtdQuartos = qtdQuartos;
        this.avaliacao = avaliacao;
        this.localizacao = localizacao;
    }

    apresentar(){
        console.log('Nome do Hotel:',this.nome,'Quantidade de Quartos:',this.qtdQuartos,'Avaliação:',this.avaliacao,'Localização:',this.localizacao);
    }
}

class Hospede extends Hotel{
    constructor(
        nomeHospede,
        cpf,
        telefone,
        email,
        idHospede,
        nome,
        qtdQuartos,
        avaliacao,
        localizacao){
        super(nome,qtdQuartos,avaliacao, localizacao);   
        this.nomeHospede = nomeHospede;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.idHospede = idHospede;
    }
apresentar(){
    console.log(
        'Nome:',this.nomeHospede,'Cpf:',this.cpf,'Telefone:',this.telefone,'Email:',this.email,'ID Hospede:',this.idHospede);
    }
}


class Quarto extends Hotel {
    constructor(
        endereco,
        categoria,
        numero,
        idQuarto,
        nome,
        qtdQuartos,
        avaliacao,
        localizacao
    ) {
        super(nome, qtdQuartos, avaliacao, localizacao);

        this.endereco = endereco;
        this.categoria = categoria;
        this.numero = numero;
        this.idQuarto = idQuarto;
    }

    apresentar() {
        console.log(
            'Endereço:', this.endereco,
            'Categoria:', this.categoria,
            'Número:', this.numero,
            'ID Quarto:', this.idQuarto
        );
    }
}

class Cadastro {
    constructor(
        idReserva,
        dataCheckIn,
        dataCheckout,
        horarioCheckin,
        horarioCheckout,
        idCadastro
    ) {
        this.idReserva = idReserva;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckout = dataCheckout;
        this.horarioCheckin = horarioCheckin;
        this.horarioCheckout = horarioCheckout;
        this.idCadastro = idCadastro;
    }

    reservar() {
        console.log(
            'ID Reserva:', this.idReserva,
            'Data Check-in:', this.dataCheckIn,
            'Data Check-out:', this.dataCheckout,
            'Horário Check-in:', this.horarioCheckin,
            'Horário Check-out:', this.horarioCheckout,
            'ID Cadastro:', this.idCadastro
        );
    }
}

const hotelgivi = new Hotel(
    'Hotel Givi |','9 |','5 Estrelas |','Campinas/SP');
hotelgivi.apresentar();

const davi = new Hospede(
    'Davi |','123.123.123-67 |','19 99999-9999 |','davimalaksenai@gmail.com |','ID 1');
davi.apresentar();

const quarto1 = new Quarto(
    'Rua das Flores, 100',
    'Suíte',
    '101',
    'Q1',
    'Hotel Givi',
    '9',
    '5 Estrelas',
    'Campinas/SP'
);

quarto1.apresentar();

const cadastro1 = new Cadastro(
    '1 |',
    '31/08 |',
    '01/09 |',
    '12:20 |',
    '23:20 |',
    '1'
)

cadastro1.reservar();