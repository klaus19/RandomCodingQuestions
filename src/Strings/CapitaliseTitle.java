package Strings;

public class CapitaliseTitle {

    public String capitalizeTitle(String title) {

        String[] words = title.split(" ");
        String ret = "";
        for(int i = 0; i < words.length; i++)
        {
            words[i] = words[i].toLowerCase(); // In any case, only the first letter should be capital
            if(words[i].length() <= 2)
                continue;
            else
                words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            // Capitalizing first letter
        }
        for(String word : words)
            ret = ret + " " + word;
        return ret.trim();

    }

    public static void main(String[] args) {
        CapitaliseTitle cp = new CapitaliseTitle();
        String str = "capiTalIze tHe titLe";
        System.out.println(cp.capitalizeTitle(str));
    }
}
