import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

public class sorter {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        while(!(al.contains("Stop") || al.contains("stop"))){
        String str = "Gebe Stop ein wenn du alle zu sortierenden Begriffe eingegeben hast\n";
        str+="Die bisherige Eingabe ist: " + al.toString(); 
        al.add(JOptionPane.showInputDialog(null, str).toLowerCase());
        }
        if(al.contains("Stop"))al.remove("Stop");
        else al.remove("stop");
        Collections.sort(al);
        String str = new String();
        for(int i = 0; i<al.size(); i++){
            str+=al.get(i)+"\n";
        }
        JOptionPane.showMessageDialog(null, "Die Sortierte Liste ist:\n" + str);
    }
}