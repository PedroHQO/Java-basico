package dio.pedro.semanazerojava;
public class MinhaClasse {
  
public static void main (String [] args) {
    String primeiroNome = "Pedro";
    String segundoNome = "Henrique";
    String terceiroNome = "Querino";
    String quartoNome = "Oliveira";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome, quartoNome);

    //Termo usado para imprimir uma mensagem no terinnal
    System.out.println(nomeCompleto);
}

//Criando um parametro para nome cmpleto, o parametro main se mantém, foi editado encima dele
public static String nomeCompleto (String primeiroNome, String segundoNome, String terceiroNome, String quartoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(terceiroNome).concat(" ").concat(quartoNome);
    //.concat é um termo usado para juntar strings, por exemplo dois nomes ou mais 




}


}
