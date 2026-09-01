package Docs.Models;

class Hotel {
    String nome;
    String qtdQuartos;
    String avaliacao;
    String localizacao;

    Hotel(String nome, String qtdQuartos, String avaliacao, String localizacao) {
        this.nome = nome;
        this.qtdQuartos = qtdQuartos;
        this.avaliacao = avaliacao;
        this.localizacao = localizacao;
    }

    void apresentar() {
        System.out.println("Nome do Hotel: " + nome +
                " Quantidade de Quartos: " + qtdQuartos +
                " Avaliação: " + avaliacao +
                " Localização: " + localizacao);
    }
}

class Hospede extends Hotel {
    String nomeHospede;
    String cpf;
    String telefone;
    String email;
    String idHospede;

    Hospede(String nomeHospede, String cpf, String telefone, String email, String idHospede) {
        super("", "", "", "");
        this.nomeHospede = nomeHospede;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.idHospede = idHospede;
    }

    void apresentar() {
        System.out.println("Nome: " + nomeHospede +
                " Cpf: " + cpf +
                " Telefone: " + telefone +
                " Email: " + email +
                " ID Hospede: " + idHospede);
    }
}

class Quarto extends Hotel {
    String endereco;
    String categoria;
    String numero;
    String idQuarto;

    Quarto(String endereco, String categoria, String numero, String idQuarto,
           String nome, String qtdQuartos, String avaliacao, String localizacao) {
        super(nome, qtdQuartos, avaliacao, localizacao);

        this.endereco = endereco;
        this.categoria = categoria;
        this.numero = numero;
        this.idQuarto = idQuarto;
    }

    void apresentar() {
        System.out.println("Endereço: " + endereco +
                " Categoria: " + categoria +
                " Número: " + numero +
                " ID Quarto: " + idQuarto);
    }
}

class Cadastro {
    String idReserva;
    String dataCheckIn;
    String dataCheckout;
    String horarioCheckin;
    String horarioCheckout;
    String idCadastro;

    Cadastro(String idReserva, String dataCheckIn, String dataCheckout,
             String horarioCheckin, String horarioCheckout, String idCadastro) {
        this.idReserva = idReserva;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckout = dataCheckout;
        this.horarioCheckin = horarioCheckin;
        this.horarioCheckout = horarioCheckout;
        this.idCadastro = idCadastro;
    }

    void reservar() {
        System.out.println("ID Reserva: " + idReserva +
                " Data Check-in: " + dataCheckIn +
                " Data Check-out: " + dataCheckout +
                " Horário Check-in: " + horarioCheckin +
                " Horário Check-out: " + horarioCheckout +
                " ID Cadastro: " + idCadastro);
    }
}

public class Main {
    public static void main(String[] args) {

        Hotel hotelgivi = new Hotel(
                "Hotel Givi |",
                "9 |",
                "5 Estrelas |",
                "Campinas/SP"
        );

        hotelgivi.apresentar();

        Hospede davi = new Hospede(
                "Davi |",
                "123.123.123-67 |",
                "19 99999-9999 |",
                "davimalaksenai@gmail.com |",
                "ID 1"
        );

        davi.apresentar();

        Quarto quarto1 = new Quarto(
                "Rua das Flores, 100",
                "Suíte",
                "101",
                "Q1",
                "Hotel Givi",
                "9",
                "5 Estrelas",
                "Campinas/SP"
        );

        quarto1.apresentar();

        Cadastro cadastro1 = new Cadastro(
                "1 |",
                "31/08 |",
                "01/09 |",
                "12:20 |",
                "23:20 |",
                "1"
        );

        cadastro1.reservar();
    }
}

