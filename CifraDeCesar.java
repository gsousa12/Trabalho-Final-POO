/*
    Essa classe  conterá um método cifra() que receberá
    uma mensagem e um deslocamento como parametro.
*/

public class CifraDeCesar {

    public String cifra(String mensagem, int deslocamento) {
        
        StringBuilder resultado = new StringBuilder();  // Armazenar o texto criptografado

        for (char caractere : mensagem.toCharArray()) { // Itera cada caractere na String

            if (caractere != ' ') // Se 'caractere' NÃO for um espaço em branco...
            { 

                int posicaoOriginal = caractere - 'a'; // Calcula a pos original do caractere no alfabeto subtraindo o caractere 'a' do caractere atual

                int novaPosicao = (posicaoOriginal + deslocamento) % 26; // Calcula a nova posição do caractere após o deslocamento, garantindo que permaneça dentro do alcance das letras do alfabeto (de 'a' a 'z') usando o módulo 26.

                char novoCaracter = (char) ('a' + novaPosicao); // Calcula o novo caractere cifrado adicionando 'a' à nova posição calculada.     

                resultado.append(novoCaracter); // Anexa o novo caractere cifrado ao StringBuilder resultado.

            } else 
            {

                resultado.append(caractere); // Se o caractere for um espaço em branco, é mantido inalterado e anexado ao resultado.

            }
        }
        return resultado.toString(); // Retorna a representação em String do StringBuilder
    }

    public String decifrar(String mensagem, int deslocamento)
    {
        // Veja a explicação desse returno no arquivo Explicação.txt
        return cifra(mensagem, 26 - (deslocamento % 26));
    }
}