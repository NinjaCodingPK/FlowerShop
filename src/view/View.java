package view;

/**
 * View class in MVC pattern.
 * Created by wookie on 6/19/16.
 */
public class View {

    public void printMessage(String... message) {
        for(String m : message)
            System.out.println(m);
    }
}
