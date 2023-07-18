class JoyStick {
    static boolean[] arr;

    public static void main(String[] args) {

    }
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int index;
        arr = new boolean[len];


        for (int i = 0; i < len; i++) {
            answer +=Math.min(name.charAt(i)-65,90-(int)name.charAt(i)+1);
        }

        index = 0;
        for(int i = 1 ; i < len;i++){
            if(name.charAt(i)!='A'){
                index = i;
                break;
            }

        }


        int lindex = 0;

        for(int i = len -1 ; i >= 0;i--){
            if(name.charAt(i)!='A'){
                lindex = i;
                break;
            }
        }

        answer+=Math.min(lindex,len-index);


        return answer;
    }



}

