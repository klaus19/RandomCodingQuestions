public class FinalVariable{

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for(String operation: operations){
            if(operation.equals("++X") || operation.equals("X++")){
                result++;
                // System.out.println(result);
            }
            if(operation.equals("--X") || operation.equals("X--")){
                result--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FinalVariable fc = new FinalVariable();

        String[]str = new String[]{"--X","X++","X++"};
        System.out.println(fc.finalValueAfterOperations(str));
    }

}
