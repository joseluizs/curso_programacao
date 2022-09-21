package curso_programacao;

public class Aula59Strings {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();// caixa baixa
		String s02 = original.toUpperCase();// caixa alta
		String s03 = original.trim();//remove espaços
		String s04 = original.substring(2);//forma nova string apartir de um caracter
		String s05 = original.substring(2, 9);//forma nova string até certo limite
		String s06 = original.replace('a', 'x');//troca um caracter por outro
		String s07 = original.replace("abc", "xy");//troca uma subString por outro
		int i = original.indexOf("bc");//saber a 1ª posição de bc
		int j = original.lastIndexOf("bc");//saber a ultima posição de bc
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("subString(2): -" + s04 + "-");
		System.out.println("subString(2, 9): -" + s05 + "-");
		System.out.println("replace(a, x): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("indexOf 'bc': " + i);
		System.out.println("lastIndexOf 'bc': " + j);
		



	}

}
