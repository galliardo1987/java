public class TesteMetodos {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        Conta segundaConta = new Conta();
        System.out.println(segundaConta.saldo);
        segundaConta.deposita(1000);

        /*primeiraConta.transfere(300, segundaConta);
        System.out.println("O saldo atual");
        */
        System.out.println(segundaConta.saldo);
        if(segundaConta.transfere(500, primeiraConta)){
            System.out.println("Transferecia concluida com sucesso");
        }else{
            System.out.println("Transferencia não executada, saldo insuficiente.");
        }
        System.out.println("Seu saldo atual é de: "+segundaConta.saldo);
    }
}
