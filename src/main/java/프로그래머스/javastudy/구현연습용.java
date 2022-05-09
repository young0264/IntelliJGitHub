package 프로그래머스.javastudy;

class 구현연습용 {
        public int solution(int n) { //약수의 합을 리턴
                int answer = 0;
                for(int i=1;i<=n;i++){
                        if (n%i==0){
                                answer += i;
                        }
                }


                return answer;

        }
}