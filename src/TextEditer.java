// Exo 2

import java.util.ArrayList;

public class TextEditer {
    private String text;
    ArrayList<String> history;

    public TextEditer(){
        this.text = " ";
        history = new ArrayList<String>();
        this.history.add(text);
    }

    public void addText(String text){
        this.text = text;
        this.history.add(text);
    }

    public void showText(){
        for (String text : history) {
            System.out.println(text + " ");
        }
    }

    public void UnDo(){
        this.history.remove(history.size()-1);
    }

    public void ReDo(){
       this.history.add(text);
    }

    

    public static void main(String[] args) {
        TextEditer textEditer = new TextEditer();
        textEditer.addText("Hello world");
        textEditer.showText();
        textEditer.addText("Bonjour le monde");;
        textEditer.showText();
        textEditer.UnDo();
        textEditer.showText();
        textEditer.ReDo();
        textEditer.showText();
    }
    
}
