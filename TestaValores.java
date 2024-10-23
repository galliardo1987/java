public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 56008);

        //System.out.println(conta.getAgencia());
        Conta conta2 = new Conta(1337, 34987);
        Conta conta3 = new Conta(1337, 19746); 

        System.out.println(Conta.getTotal());
    }
}
