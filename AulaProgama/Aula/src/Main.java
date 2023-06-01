public class Main {
    public static void main(String[] args) {
        String texto = "texto 01";
        String texto2 = new String("texto 02");

        // Acessar um caracter específico dentro do texto pelo indice de letras
        System.out.println(texto.charAt(5));
        // Obter o tamanho (quantidade de chars) do texto
        System.out.println(texto.length());
        // Verificar se o texto é vazio
        System.out.println(texto =="");
        System.out.println("".length() == 0);
        System.out.println(texto.isEmpty());

        // Obter uma substring dentro do texto original definindo o ponto inicial
        System.out.println(texto.substring(2));
        System.out.println(texto.substring(2,6));

        //
        String nome = "João";
        String sobrenome = "Victor";
        String nomeCompleto = nome + sobrenome;
        String nomeCompleto2 = nome.concat(sobrenome);

        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(nomeCompleto);
        System.out.println(nomeCompleto2);

        //



    }
}