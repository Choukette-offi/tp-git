import java.util.ArrayList;
import com.google.gson.Gson;
FileReader fr = new FileReader("./fichier.json");
class Box{
private ArrayList<Thing> contents = new ArrayList<Thing>();
public void add(Thing truc){
    this.contents.add(truc);
}
public boolean contient(Thing truc){
    if(this.contents.contains(truc)){
        return true;
    }
    return false;
}
}