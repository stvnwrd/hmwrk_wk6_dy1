import java.util.ArrayList;
import java.util.Collections;

public class MagicEightBall {

    private ArrayList<String> answers;

    public MagicEightBall(ArrayList<String> answers){
        this.answers = new ArrayList<>();
    }

    public void add(String answer){
        this.answers.add(answer);
    }

    public int getAnswerCount(){
        return this.answers.size();
    }

    public String getAnswerAtIndex(int index){
        return answers.get(index);
    }

    public int getRandomAnswer(){
        Collections.shuffle(answers);
        return answers.get(0);
    }

    public ArrayList<Integer> getAnswers(){
        return new ArrayList<>(this.answers);
    }

}
