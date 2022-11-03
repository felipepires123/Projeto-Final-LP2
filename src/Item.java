public class Item implements MenuItem {

    private int numeroItem;
    private String competencia;
    private String descricao;
    private boolean feito;



    public Item(int numeroItem, String competencia, String descricao) {
        this.numeroItem = numeroItem;
        this.competencia = competencia;
        this.descricao = descricao;
        this.feito = false;
    }

    public boolean getFeito() {
        return feito;
    }

    public void setFeito(boolean feito) {
        this.feito = feito;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void terminalItem(){



    }
}
