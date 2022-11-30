package exercises9;

public class T0914_RtoL {
	public static String writeChinese(String s) {
		String chinese_str = s.replace('R', 'L');
		return chinese_str.replace('r', 'l');
	}
}
