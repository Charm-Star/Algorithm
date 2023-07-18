import java.util.ArrayList;

class Moitest {
    public Object[] solution(int[] answers) {

        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};


        int j1 = 0;
        int j2 = 0;
        int j3 = 0;


        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i % 5]) {
                j1++;
            }
            if (answers[i] == num2[i % 8]) {
                j2++;
            }
            if (answers[i] == num3[i % 10]) {
                j3++;
            }
        }
        int[] list = new int[] {j1,j2,j3};
        int maxValue = -1;

        for(int s : list){
            maxValue = Math.max(maxValue,s);
        }

        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < 3;i++){
            if(maxValue==list[i]){
                answer.add(i+1);
            }
        }





        return answer.toArray();
    }
}