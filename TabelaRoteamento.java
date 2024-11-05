import java.util.ArrayList;

public class TabelaRoteamento {
    private ArrayList<TabelaRoteamentoRow> tabelaRoteamento;

    public TabelaRoteamento() {
        this.tabelaRoteamento = new ArrayList<TabelaRoteamentoRow>();
    }

    public void addRow(Integer ipDestino, Integer metrica, Integer ipSaida) {
        TabelaRoteamentoRow row = new TabelaRoteamentoRow(ipDestino, metrica, ipSaida);
        this.tabelaRoteamento.add(row);
    }

    public boolean haveRoute(Integer ipDestino) {
        for (TabelaRoteamentoRow row : this.tabelaRoteamento) {
            if (row.getIpDestino().equals(ipDestino)) {
                return true;
            }
        }
        return false;
    }

    public boolean haveBetterRoute(TabelaRoteamentoRow row) {
        for (TabelaRoteamentoRow tabelaRoteamentoRow : this.tabelaRoteamento) {
            if (tabelaRoteamentoRow.getIpDestino().equals(row.getIpDestino())) {
                if (tabelaRoteamentoRow.getMetrica() > row.getMetrica()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void print() {
        for (TabelaRoteamentoRow row : this.tabelaRoteamento) {
            System.out.println(row);
        }
    }
}


class TabelaRoteamentoRow {
    private Integer ipDestino;
    private Integer metrica;
    private Integer ipSaida;

    public TabelaRoteamentoRow (Integer ipDestino, Integer metrica, Integer ipSaida) {
        this.ipDestino = ipDestino;
        this.metrica = metrica;
        this.ipSaida = ipSaida;
    }

    public Integer getIpDestino() {
        return ipDestino;
    }

    public void setIpDestino(Integer ipDestino) {
        this.ipDestino = ipDestino;
    }

    public Integer getMetrica() {
        return metrica;
    }

    public void setMetrica(Integer metrica) {
        this.metrica = metrica;
    }

    public Integer getIpSaida() {
        return ipSaida;
    }

    public void setIpSaida(Integer ipSaida) {
        this.ipSaida = ipSaida;
    }

    @Override
    public String toString() {
        return "TabelaRoteamento [ipDestino=" + ipDestino + ", metrica=" + metrica + ", ipSaida=" + ipSaida + "]";
    }
}
