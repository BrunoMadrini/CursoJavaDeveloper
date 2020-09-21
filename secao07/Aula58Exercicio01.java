// Exercício para demonstração de funções para Strings.

package secao07;

public class Aula58Exercicio01 {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG      ";

		// Funções

		// Transformar tudo para minúscula
		String s01 = original.toLowerCase();
		// Transformar tudo para maiúscula
		String s02 = original.toUpperCase();
		// Excluir espaçamento
		String s03 = original.trim();
		// Montar uma nova string recortando a partir do segundo caractere
		String s04 = original.substring(2);
		// Montar uma nova string recortando a partir do segundo caractere e indo até o
		// nono caractere
		String s05 = original.substring(2, 9);
		// Trocar o caractere a minúsculo pelo x minúsculo
		String s06 = original.replace('a', 'x');
		// Trocar uma sequência por outra
		String s07 = original.replace("abc", "xy");
		// Descobrir a primeira ocorrência do caractere especificado
		int i = original.indexOf("bc");
		// Descobri qual é a útima ocorrência do caractere especificado
		int j = original.lastIndexOf("bc");

		// Saídas
		System.out.println("Original: " + original);
		System.out.println("toLowerCase: " + s01);
		System.out.println("toUpperCase: " + s02);
		System.out.println("trim: " + s03);
		System.out.println("substring(2): " + s04);
		System.out.println("substring(2, 9): " + s05);
		System.out.println("replace('a', 'x'): " + s06);
		System.out.println("replace('abc', 'xy'): " + s07);
		System.out.println("indexOf('bc'): " + i);
		System.out.println("lastIndexOf('bc'): " + j);
	}

}
