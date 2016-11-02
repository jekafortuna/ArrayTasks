package ua.kpi;

/**
 * Created by Evgeniy on 11/2/2016.
 */
public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
}
