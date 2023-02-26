import java.util.ArrayList;

public class CustomerProblem {
    private String empresa;
    private String usuario;
    private String problema;
    private String solucao;
    private String produto;
    private String contato;

    public CustomerProblem(String empresa, String usuario, String problema, String solucao, String produto, String contato) {
        this.empresa = empresa;
        this.usuario = usuario;
        this.problema = problema;
        this.solucao = solucao;
        this.produto = produto;
        this.contato = contato;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getProblema() {
        return problema;
    }

    public String getSolucao() {
        return solucao;
    }

    public String getProduto() {
        return produto;
    }

    public String getContato() {
        return contato;
    }

}


