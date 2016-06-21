package controller;

import view.View;

/** Controller class in MVC pattern.
 * Created by wookie on 6/19/16.
 */
public class Controller {
    private View view;

    public Controller(View view) {
        this.view = view;
    }
}
