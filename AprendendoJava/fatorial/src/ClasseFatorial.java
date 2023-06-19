public class ClasseFatorial {

    public static int resultado(int num){

        int res = num;
        for(int c=1;c<num;c++){
            res*=c;
        }

        return res;
    }

    public static String conta(int num){

        String principal="";
        int res = 1;
        for(int c=num;c>1;c--){

            res*=c;
            principal += c+" x ";

        }
        principal += "1 = "+res;

        return principal;
    }

    
}
