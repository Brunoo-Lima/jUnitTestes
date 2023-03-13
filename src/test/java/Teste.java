import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Teste {
    @Test
    void validarNome() {
        Pessoa pessoa = new Pessoa("Bruno", 23);
        Assertions.assertEquals("Bruno", pessoa.getNome());
    }

    @Test
    void deveRetornarSeEhMesmoNome() {
        Pessoa pessoa = new Pessoa("Bruno", 23);
        Assertions.assertTrue(pessoa.MaiorIdade());

        Pessoa pessoa1 = new Pessoa("Alessandra", 16);
        Assertions.assertFalse(pessoa1.MaiorIdade());
    }
}
