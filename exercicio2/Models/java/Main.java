class Hotel {
    String nome;
    int qtdQuartos;
    String avaliacao;
    String localizacao;

    Hotel(String nome, int qtdQuartos, String avaliacao, String localizacao) {
        this.nome = nome;
        this.qtdQuartos = qtdQuartos;
        this.avaliacao = avaliacao;
        this.localizacao = localizacao;
    }

    void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Quartos: " + qtdQuartos);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Localização: " + localizacao);
    }
}

class Hospede {
    String nome;
    String cpf;
    String telefone;
    String email;
    String idHospede;

    Hospede(String nome, String cpf, String telefone, String email, String idHospede) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.idHospede = idHospede;
    }

    void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("ID Hóspede: " + idHospede);
    }
}

class Quarto {
    String endereco;
    String categoria;
    String numero;
    String idQuarto;

    Quarto(String endereco, String categoria, String numero, String idQuarto) {
        this.endereco = endereco;
        this.categoria = categoria;
        this.numero = numero;
        this.idQuarto = idQuarto;
    }

    void apresentar() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Categoria: " + categoria);
        System.out.println("Número: " + numero);
        System.out.println("ID Quarto: " + idQuarto);
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
        System.out.println("ID Reserva: " + idReserva);
        System.out.println("Check-in: " + dataCheckIn);
        System.out.println("Check-out: " + dataCheckout);
        System.out.println("Horário Check-in: " + horarioCheckin);
        System.out.println("Horário Check-out: " + horarioCheckout);
        System.out.println("ID Cadastro: " + idCadastro);
    }
}

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel(
            "Hotel Givi",
            9,
            "5 Estrelas",
            "Campinas/SP"
        );

        Hospede hospede = new Hospede(
            "Davi",
            "123.123.123-67",
            "19 99999-9999",
            "davimalaksenai@gmail.com",
            "1"
        );

        Quarto quarto = new Quarto(
            "Rua das Flores, 100",
            "Suíte",
            "101",
            "Q1"
        );

        Cadastro cadastro = new Cadastro(
            "1",
            "31/08",
            "01/09",
            "12:20",
            "23:20",
            "1"
        );

        hotel.apresentar();
        hospede.apresentar();
        quarto.apresentar();
        cadastro.reservar();
    }
}

