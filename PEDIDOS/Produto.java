public class Produto {
    private String descriptionProduto;
    private int idProduto;
    private int quantityProduto;
    private double valueProduto;
    public Produto (String descriptionProduto, int idProduto, int quantityProduto, double valueProduto){
        this.descriptionProduto = descriptionProduto;
        this.idProduto = idProduto;
        this.quantityProduto = quantityProduto;
        this.valueProduto = valueProduto;
        this.valueTotal = calcularValorTotal(valueProduto, quantityProduto);
    }
        private static double calcularValorTotal (double valueProduto){
            double value = 0.0
            value = quantityProduto * valueProduto
            return value;
        }
        private static String adicionarProduto (String descriptionProduto, int idProduto, int quantityProduto, int valueProduto){
            return new Produto(description, id, quantity, value)
        }
        private static String removerProduto (String descriptionProduto, int idProduto, int quantityProduto, int valueProduto){
            return;
        }
        private static double adicionarDesconto (double valueTotal){
            double desconto = 0.0
            desconto = valueTotal  - porcentagem * valueTotal
            return desconto;
        }
}