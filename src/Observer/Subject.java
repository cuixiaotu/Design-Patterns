package Observer;

import java.util.ArrayList;

public interface Subject {
    ArrayList observer = new ArrayList();
    public void registerObserver();
    public void removeObserver();
    public void notifyObserver();

}
