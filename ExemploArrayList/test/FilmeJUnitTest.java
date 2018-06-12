import static org.junit.Assert.assertEquals;

/**
 * @author Alunos
 */
public class FilmeJUnitTest {
    
    

        public void infTitulo(){
        Filme troia = new Filme();
        troia.setTitulo("Troia");
        assertEquals("Troia", troia.getTitulo());
        }
        public void infTituloOriginal(){
          Filme tituloOriginal = new Filme();
          tituloOriginal.setTituloOriginal("Troy");
          assertEquals("Troy", tituloOriginal.getTituloOriginal());
        }
        public void infGenero(){
            Filme troia = new Filme();
            troia.setGenero("Épico");
            assertEquals("Épico", troia.getGenero());
        }
        public void infDiretor(){
            Filme troia = new Filme();
            troia.setDiretor("Wolfgang");
            assertEquals("Wolfgang", troia.getDiretor());
            troia.setDiretor("Wolfgang Petersen");
            assertEquals("Wolfgang Petersen", troia.getDiretor());
        }
        public void infIdioma(){
            Filme troia = new Filme();
            troia.setIdioma("Inglês");
            assertEquals("Inglês", troia.getIdioma());
        }
        public void infClassificacao(){
            Filme troia = new Filme();
            troia.setClassificacao("18");
            assertEquals(18, troia.getClassificacao());
        }
        public void infValorFaturamento(){
            Filme troia = new Filme();
            troia.setValorFaturamento(4974098.52);
        }
        public void infValorOrcamento(){
            Filme troia = new Filme();
            troia.setValorOrcamento(175000000);
        }
        public void infMediaPreco(){
            Filme troia = new Filme();
            troia.setMediaPreco(20);
        }
        public void infEspectadores(){
            Filme troia = new Filme();
            troia.setEspectadores(2098890);
        }
        public void infAnoLancamento(){
            Filme troia = new Filme();
            troia.setAnoLancamento((short)2004);
        }
        public void infDataLancamentoBrasil(){
            Filme troia = new Filme();
            //troia.DataLancamentoBrasil((LocalDate)2004);
        }
      
    }