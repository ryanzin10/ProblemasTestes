import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BuscaBinariaTeste{

    @Test
  public void numeroInicio( ){
    int[] array = {0, 5, 10, 20, 40, 80};
    int chave = 5;

    assertEquals(1, BuscaBinaria.busca(array, chave));
  }

  @Test
  public void numeroMeio( ){
    int[] array = {0, 5, 10, 20, 40, 80};
    int chave = 10;

    assertEquals(2, BuscaBinaria.busca(array, chave));
  }

  @Test
  public void numeroFim( ){
    int[] array = {0, 5, 10, 20, 40, 80};
    int chave = 80;

    assertEquals(5, BuscaBinaria.busca(array, chave));
  }

  @Test
  public void numeroNaoExiste( ){
    int[] array = {0, 5, 10, 20, 40, 80};
    int chave = 22;

    assertEquals(-1, BuscaBinaria.busca(array, chave));
  }

  @Test
  public void arrayImpar( ){
    int[] array = {0, 5, 10, 20, 40};
    int chave = 10;

    assertEquals(2, BuscaBinaria.busca(array, chave));
  }
}
