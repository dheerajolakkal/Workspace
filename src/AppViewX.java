import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppViewX {
    public static void main(String[] args){
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("c#");
        languages.add("Scala");
        for(int i=0;i<languages.size();i++){
            if("Java".equalsIgnoreCase(languages.get(i))) {
                languages.remove(languages.get(i));
                i--;
            }
        }

        languages = languages.stream().filter(language->!language.equals("Java")).collect(Collectors.toList());

        System.out.println(languages);

    }
}
