import java.util.ArrayList;
import java.util.List;

public class MatchingRule {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count =0;
        int n = items.size();
        int r=2;

        if(ruleKey.equals("type"))  r=0;
        else if(ruleKey.equals("color")) r=1;

        for(List ls : items)
        {
            if (ls.get(r).equals(ruleValue))
                count++;
        }

        return count;
    }
}
