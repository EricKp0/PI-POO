public class Main {
    public static void main(String[] args) {

        RelatorioGastos desenvolvimento = new RelatorioGastos();
        desenvolvimento.setCategoria("Desenvolvimento");
        desenvolvimento.setValorTotal(5000);
        desenvolvimento.gerarRelatorio();

        RelatorioGastos testes = new RelatorioGastos();
        testes.setCategoria("Testes");
        testes.setValorTotal(2000);
        testes.gerarRelatorio();

        RelatorioLucro lucro = new RelatorioLucro();
        lucro.setCategoria("Lucro");
        lucro.setValorTotal(15000);
        lucro.setNumeroVendas(300);
        lucro.gerarRelatorio();
    }
}

class Relatorio {
    protected String categoria;
    protected double valorTotal;

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void gerarRelatorio() {
        System.out.println("Categoria: " + categoria + " - Valor Total: " + valorTotal);
    }
}

class RelatorioGastos extends Relatorio {
    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório de Gastos - Categoria: " + categoria + " - Valor: " + valorTotal);
    }
}

class RelatorioLucro extends Relatorio {
    private int numeroVendas;

    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório de Lucro - Categoria: " + categoria + " - Lucro Total: " + valorTotal +
                " - Número de Vendas: " + numeroVendas);
    }
}
