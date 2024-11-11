public class DescontoClienteVIP implements Desconto{

    @Override
    public double aplicarDesconto(double valor) {
        return valor - (valor * 0.2);
    }
    
}
