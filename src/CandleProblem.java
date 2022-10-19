public class CandleProblem {


    public int getNumber(int solutionNumber,int makeNew) {
        return  solutionNumber + (solutionNumber-1)/(makeNew-1);
    }
}
