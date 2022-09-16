public class Driver {
    public static void main(String[] args) {
        int answer = 0;
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                answer = answer + i;
            }
        }
        System.out.println(answer);


        int[] squirrels = {20,30,40,50,60};
        int[] partySquirrels = new int[squirrels.length];

        for (int i = 0; i<=squirrels.length-1; i++) {
            partySquirrels[squirrels.length-1-i] = squirrels[i];
        }
        for (int i = 0; i<=squirrels.length-1; i++) {
            System.out.println(partySquirrels[i]);
        }
//        int sum = 0;
//        for (int i = 0; i<=squirrels.length-1; i++) {
//
//            sum += squirrels[i];
//            partySquirrels[i] = squirrels[i];
//        }
//
//
//        System.out.println(sum);
        //the array to look at
//        int[] squirrels = {20,70,40,50,60};
//        //the value of the largest squirrel value
//        int bigSquirrel = 0;
//
//        //loop through each squirrel
//        for (int i = 0; i<=squirrels.length-1; i++){
//            //if the current squirrel has a greater value than my current
//            //bigSquirrel, set the bigSquirrel to the value of the current
//            //array element
//            if (bigSquirrel < squirrels[i]){
//                //set the value
//                bigSquirrel = squirrels[i];
//            }
//        }
//        for (int squirrel : squirrels){
//            //if the current squirrel has a greater value than my current
//            //bigSquirrel, set the bigSquirrel to the value of the current
//            //array element
//            if (bigSquirrel < squirrel){
//                //set the value
//                bigSquirrel = squirrel;
//            }
//        }
//        System.out.println(bigSquirrel);



        //?? squirrels[1]
//
//
//        int[] squirrels = {20,70,40,50,60};
//        int[] partySquirrels = new int[squirrels.length];
////        System.out.println(partySquirrels.length);
//        int bigSquirrel = 0;
////        System.out.println(partySquirrels.length);
//        for (int i = 0; i<=squirrels.length-1; i++){
//            //System.out.println(squirrels[i]);
//            //partySquirrels[i] = squirrels[i];
//            if (bigSquirrel<squirrels[i]){
//                bigSquirrel=squirrels[i];
//            }
//        }
//        System.out.println(bigSquirrel);
//        //equivalent *values* in each array
//
//        partySquirrels[0] = 11;
//        partySquirrels[partySquirrels.length-1] = 111;
//        partySquirrels[partySquirrels.length-1] = 111;
//        for (int squirrel: squirrels){
//            System.out.println(squirrel);
//        }
//
//
//        for (int i = 0; i<=squirrels.length-1; i++){
//            System.out.println(squirrels[i]);
//            System.out.println(partySquirrels[i]);
//        }
//        System.out.println(partySquirrels[squirrels.length-1]);
//
////        partySquirrels = squirrels;
////        partySquirrels[1] = partySquirrels[0];
////        partySquirrels[2] = 10;
////        squirrels[0] = 100;
//        //?? squirrels[1]
    }

}
