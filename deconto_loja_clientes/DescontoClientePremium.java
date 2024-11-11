public class DescontoClientePremium implements Desconto{

    @Override
    public double aplicarDesconto(double valor) {
         return valor - (valor * 0.1);
    }
    
}
