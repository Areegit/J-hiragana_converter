import java.util.Scanner;
public class Hiragana {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("☆☆☆Welcome To Hiragana Converter☆☆☆");
        System.out.println("enter the Romaji of the letter: ");
        String romaji = input.next();
        
        // the output may not give the Japanese letter in programiz or some online copilers "it appers as a qustion mark"
    
    switch (romaji) {
        case "a":
            System.out.println("the letter in hiragana is : あ");
            break;
        case "ka":
            System.out.println("the letter in hiragana is : か");
            break;
        case "sa":
            System.out.println("the letter in hiragana is : さ");
            break;
        case "ta":
            System.out.println("the letter in hiragana is : た");
            break;
        case "na":
            System.out.println("the letter in hiragana is : な");
            break;
        case "ha":
            System.out.println("the letter in hiragana is : は");
            break;
        case "ma":
            System.out.println("the letter in hiragana is : ま");
            break;
        case "ya":
            System.out.println("the letter in hiragana is : や");
            break;
        case "ra":
            System.out.println("the letter in hiragana is : ら");
            break;
        case "wa":
            System.out.println("the letter in hiragana is : わ");
            break;
        case "i":
            System.out.println("the letter in hiragana is : い");
            break;
        case "ki":
            System.out.println("the letter in hiragana is : き");
            break;
        case "shi":
            System.out.println("the letter in hiragana is : し");
            break;
        case "chi":
            System.out.println("the letter in hiragana is : ち");
            break;
        case "ni":
            System.out.println("the letter in hiragana is : に");
            break;
        case "hi":
            System.out.println("the letter in hiragana is : ひ");
            break;
        case "mi":
            System.out.println("the letter in hiragana is : み");
            break;
        case "ri":
            System.out.println("the letter in hiragana is : り");
            break;
        case "u":
            System.out.println("the letter in hiragana is : う");
            break;
        case "ku":
            System.out.println("the letter in hiragana is : く");
            break;
        case "su":
            System.out.println("the letter in hiragana is : す");
            break;
        case "tsu":
            System.out.println("the letter in hiragana is : つ");
            break;
        case "nu":
            System.out.println("the letter in hiragana is : ぬ");
            break;
        case "fu":
            System.out.println("the letter in hiragana is : ふ");
            break;
        case "mu":
            System.out.println("the letter in hiragana is : む");
            break;
        case "yu":
            System.out.println("the letter in hiragana is : ゆ");
            break;
        case "ru":
            System.out.println("the letter in hiragana is : る");
            break;
        case "wo":
            System.out.println("the letter in hiragana is : を");
            break;
        case "e":
            System.out.println("the letter in hiragana is : え");
            break;
        case "ke":
            System.out.println("the letter in hiragana is : け");
            break;
        case "se":
            System.out.println("the letter in hiragana is : せ");
            break;
        case "te":
            System.out.println("the letter in hiragana is : て");
            break;    
        case "ne":
            System.out.println("the letter in hiragana is : ね");
            break;
        case "he":
            System.out.println("the letter in hiragana is : へ");
            break;
        case "me":
            System.out.println("the letter in hiragana is : め");
            break;    
        case "re":
            System.out.println("the letter in hiragana is : れ");
            break;
        case "o":
            System.out.println("the letter in hiragana is : お");
            break;
        case "ko":
            System.out.println("the letter in hiragana is : こ");
            break;
        case "so":
            System.out.println("the letter in hiragana is : そ");
            break;
        case "to":
            System.out.println("the letter in hiragana is : と");
            break;
        case "no":
            System.out.println("the letter in hiragana is : の");
            break;
        case "ho":
            System.out.println("the letter in hiragana is : ほ");
            break;
        case "mo":
            System.out.println("the letter in hiragana is : も");
            break;
        case "yo":
            System.out.println("the letter in hiragana is : よ");
            break;
        case "ro":
            System.out.println("the letter in hiragana is : ろ");
            break;
        case "n":
            System.out.println("the letter in hiragana is : ん");
            break;
        default :
        System.out.println("Sorry, invalid input");
            break;
    }
       input.close();
    }
}
