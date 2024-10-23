public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "123.123.456-09";
        paulo.profissao = "Pedreiro";

        Conta contadoPaulo = new Conta();
        contadoPaulo.deposita(500);

        contadoPaulo.titular = paulo;
        System.out.println(contadoPaulo.titular.nome);
        System.out.println(contadoPaulo.titular.profissao);
        System.out.println(contadoPaulo.saldo);
    }
}
