public class MetodosApp {
  public static void main(String[] args) {
    
  }

  // método ocorrencias:
  public static int numOcorrencias(int[] arrayInt, int num) {
    int ocorrencias = 0;
    for(int i : arrayInt) {
      if (i == num) ocorrencias++;
    }
    return ocorrencias;
  }

  // método que ordena um array de numeros com BubbleSort:
  private static void ordenaArray(int[] arrayInt) {
    int lastIndex = arrayInt.length - 1;
    for(int i = 0; i < lastIndex; i++) {
      
    }
  }

  // método que retorna true se existem elementos repetidos em um array ordenado;
  public static boolean temRepeticao(int[] arrayInt) {
    for(int i : arrayInt) {

    }
    return true;
  }
}
