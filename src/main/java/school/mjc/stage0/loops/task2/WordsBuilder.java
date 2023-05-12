package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int phraseLength = 0;
        String str = "";
        while (phraseLength<chars.length){
            str += chars[phraseLength];
            phraseLength++;
        }
        System.out.print(str);
    }
}
