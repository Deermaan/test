package loop;

public class NestedLoop {
    public static void main(String[] args) {

        /*
            Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */

        for(int i=1; i<4; i++){
            System.out.println();
            System.out.println("Week: " + i);
            System.out.println();
            for(int k=1; k<4; k++){
                System.out.println("  Day: " + k);

            }
        }
    }
}
