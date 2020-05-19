package MaleevTask4;

public class Main {

    public static void main(String[] args) {
	//Задание 18.
    	String str = "Выпьем, добрая подружка Бедной юности моей, Выпьем с горя; где же кружка? Сердцу будет веселей.";
	int n=0;

	char symbol;
	for (int i=0; i<str.length(); i++) {
	    symbol=str.charAt( i );
	    if (symbol==','||symbol=='.'||symbol==';'||symbol=='?')
	        n++;
        }
	System.out.println( "В тексте "+n+" знаков препинания");
	//Задание 19.
		String str19 = "Спой мне песню, как синицам Тихо за морем жила; Спой мне песню, как девица За водой поутру шла.";
		int n19=1;
		//условие для подбора подряд нескольких пробелов не смог быстро продумать.
		for (int i=0;i<str19.length();i++){
			if (str19.charAt( i )==' ')
				n19++;
		}
		System.out.println( "В тексте "+n19+" слов");
		//Задание 20.
		String str20 = "Буря мглою небо кроет, Вихри снежные крутя; То, как зверь, она завоет, То заплачет, как дитя.";
		int n20=0;
		String newStr20="";
		for (int i=0;i<str20.length();i++){
			if (str20.charAt( i )==' '||str20.charAt( i )==','||str20.charAt( i )==';'||str20.charAt( i )=='.') {
				if (str20.charAt( i-1 )==','||str20.charAt( i-1 )==';'||str20.charAt( i-1 )=='.')
				continue;
				else System.out.print( str20.charAt( i - 1 ) );
			}
		}
		//Задание 21.
		String str21= "Наша ветхая лачужка И печальна и темна. Что же ты, моя старушка, Приумолкла у окна? Или бури завываньем";
		for (int i=0;i<10;i++){
			str21 +="Ты, мой друг, утомлена, Или дремлешь под жужжаньем Своего веретена?";
		}
		System.out.println(  );
		System.out.println( str21 );
		//Second
		String str22= "Наша ветхая лачужка И печальна и темна. Что же ты, моя старушка, Приумолкла у окна? Или бури завываньем";
		StringBuilder stringBuilder =new StringBuilder( str22 );
		for (int i=0;i<10;i++){
stringBuilder.append("Ты, мой друг, утомлена, Или дремлешь под жужжаньем Своего веретена?");
		}
		System.out.println( stringBuilder );
    }
}
