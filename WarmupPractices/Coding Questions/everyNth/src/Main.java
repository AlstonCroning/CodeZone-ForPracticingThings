public class Main {

    public static void main(String [] args) {
        String str = "abcdefg";
        int n = 3;
        int remainder;
        String madeString = "";

        for(int i=0;i<str.length();i++){
            remainder = i%n;

            if(remainder == 0){
                madeString += str.substring(i,i+1);
            }
        }
        //display every nth char of the String given
        System.out.println(madeString);
    }
}
