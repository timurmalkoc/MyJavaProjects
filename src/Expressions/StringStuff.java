package Expressions;

public class StringStuff {
    public static void main(String[] args) {

        // split()
        System.out.println("=============== split ======================");
        String text = "Java is a fun programming language";
        String[] textSplit = text.split(" ");
        for (String i:textSplit){
            System.out.println("-> " + i);
        }

        // concat()
        System.out.println("=============== concat ======================");
        String newText = text.concat(" for me");
        System.out.println(newText);

        // equal() vs ==

        String text1 = new String("Coding");
        String text2 = text1;
        String text3 = new String("Coding");
        System.out.println("=============== equal vs == ======================");
        System.out.println("Using == operator \t\t->" + (text1 == text3));
        System.out.println("Using .equal() method \t->" + text1.equals(text3));
        System.out.println("If second reference the first obj. ->" + (text1 == text2));

        // contains()

        System.out.println("=============== contains ======================");
        System.out.println("Does text include \"Java\" -> " + (text.contains("Java")));
        System.out.println("Does text include \"java\" -> " + (text.contains("java")));
        System.out.println("Does text include \"Python\" -> " + (text.contains("Python")));

        // substring()

        System.out.println("=============== substring =====================");
        System.out.println("index 0 - 4 -> " + text.substring(0,4));
        System.out.println("from 5th until end -> " + text.substring(5));
        System.out.println("index 14 - 18 -> " + text.substring(14,18));

        // replace() and replaceAll()

        String text5 = "bat ball";
        String text6 = "Java123is4564356fun";
        System.out.println("=============== replace =====================");
        System.out.println(text5 + " =(b to c)=> "+ text5.replace("b","c"));
        System.out.println(text6 + " => " + text6.replaceAll("\\d+"," "));

        // charAt()

        System.out.println("=============== charAt =====================");
        System.out.println(text5 + " 5 (index 6) => "+ text5.charAt(5));

        // indexOf

        System.out.println("============== indexOf =====================");
        System.out.println(text5 + " index of t => " + text5.indexOf("t"));
        System.out.println(text5 + " index of ball => " + text5.indexOf("ball"));

        // compareTo() and compareToIgnoreCase() he comparison is based on the Unicode value of each character in the strings

        System.out.println("============== CompareTo ===================");
        System.out.println(text5 + "compare to \'bat ball\' => " + text5.compareTo("bat ball"));
        System.out.println(text5 + "compare to \'Bat Ball\' => " + text5.compareTo("Bat ball"));
        System.out.println(text5 + "compare to \'Bat Ball\' => " + text5.compareTo("aat ball"));
        System.out.println(text5 + "compare to \'Bat Ball\' => " + text5.compareTo("cat ball"));
        System.out.println("========== CompareToIgnoreCase =============");
        System.out.println(text5 + "compare to \'bat ball\' => " + text5.compareToIgnoreCase("bat ball"));
        System.out.println(text5 + "compare to \'Bat Ball\' => " + text5.compareToIgnoreCase("Bat ball"));
        System.out.println(text5 + "compare to \'Bat Ball\' => " + text5.compareToIgnoreCase("aat ball"));
        System.out.println(text5 + "compare to \'Bat Ball\' => " + text5.compareToIgnoreCase("cat ball"));

        // trim()
        // The trim() method removes any leading (starting) and trailing (ending) whitespaces from the specified string

        System.out.println("============== trim ============");
        System.out.println((" "+text5) + " trim at :" + text5.trim());

        // contentEqual()
        // The Java String equals() method not only compares the content, but also checks if the other object is an instance of String. However, contentEquals() only compares the content.

        String st1 = "Java";
        StringBuffer st2 = new StringBuffer("Java");
        System.out.println("equals => " + st1.equals(st2));
        System.out.println("contentEqual => " + st1.contentEquals(st2));



    }
}
