public class GoalParser {

    public String interpret(String command) {

           return command.replace("()","o").replace("(al)","al");
    }

    public static void main(String[] args) {
        GoalParser gp = new GoalParser();
        String str = "G()(al)";
        System.out.println(gp.interpret(str));
    }
}
