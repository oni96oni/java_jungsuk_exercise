
public class Exercise2_1_7 {

	public static void main(String[] args) {
		int m = 20;

		int n = m++ + m;

		System.out.println(m);	//21

		System.out.println(n);	//41
/*
2-3 2바이트니까 16비트 2에 16승 마이너스 1 65535

2-4 
1번 256커버 가능 2에 8승마이너스 1 255 이므로 안된다 땡
2번케릭터타입 작은따옴표는 안에 공백이라도 있어야해 아무것도 없으면 안됨 땡
3번 오케이 두글자이상이면 문자가아니라 문자열!!
4번 f는 생략불가 f 붙여주기 땡 
5번 왠지될것같은데 안돼 땡 큰타입이 작은타입의 접미사를 사용하는것이니까 괜찮아

2-5
리터럴:100, 100L, 3.14f
키워드:int, long, final, float
변수:i, l
상수:PI

2-6
2번 대문자여서?

2-7
"1"+"2" = "12"
true+"" = "true"
'A'+'B' = 'AB' 65+66 131
'1'+2 = 오류 51  
'1'+'2'='3' 99 
'J'+"ava" = "Java"
true + null = 오류 
 
 */
		
	}

}
