
import java.time.LocalDate;

/**
 * @author Alunos
 */
public class Filme {
    
    private String titulo, tituloOriginal, genero, diretor;
    private short anoLancamento;
    private double valorFaturamento, valorOrcamento;
    private long espectadores;
    private String classificacao;
    private double mediaPreco;
    private LocalDate dataLancamentoBrasil;
    private String idioma;

    //permitir guardar informçao
    public void setTitulo(String nomeTitulo){
        this.titulo = nomeTitulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTituloOriginal(String nomeTituloOriginal){
        this.titulo = nomeTituloOriginal;
    }
    public String getTituloOriginal(){
        return tituloOriginal;
    }
    public void setGenero(String Genero){
        this.genero = Genero;
    }
    public String getGenero(){
        return genero;
    }
    
    
    public void setDiretor(String Diretor){
        this.diretor = Diretor;
    }
    public String getDiretor(){
        return diretor;
    }
    public void setAnoLancamento(Short AnoLancamento){
        this.anoLancamento = AnoLancamento;
    }
    public Short getAnoLancamento(){
        return anoLancamento;
    }
    public void setValorFaturamento(double ValorFaturamento){
        this.valorFaturamento = ValorFaturamento;
    }
    public double getValorFaturamento(){
        return valorFaturamento;
    }
    public void setValorOrcamento(double ValorOrcamento){
        this.valorOrcamento = ValorOrcamento;
    }
    public double getValorOrcamento(){
        return valorOrcamento;
    }
    public void setEspectadores(long Espectadores){
        this.espectadores = Espectadores;
    }
    public long getEspectadores(){
        return espectadores;
    }
    public void setClassificacao(String Classificacao){
        this.classificacao = Classificacao;
    }
    public String getClassificacao(){
        return classificacao;
    }
    public void setMediaPreco(double MediaPreco){
        this.mediaPreco = MediaPreco;
    }
    public double getMediaPreco(){
        return mediaPreco;
    }
    public void setDataLancamentoBrasil(LocalDate DataLancamentoBrasil){
        this.dataLancamentoBrasil = DataLancamentoBrasil;
    }
    public LocalDate getDataLancamentoBrasil(){
        return dataLancamentoBrasil;
    }
    public void setIdioma(String Idioma){
        this.idioma = Idioma;
    }
    public String getIdioma(){
        return idioma;
    }
}
