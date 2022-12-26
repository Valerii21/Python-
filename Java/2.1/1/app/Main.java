package app;
import java.util.ArrayList;
import java.util.List;

import model.Human;

public class Main {

    public static void main(String[] args) {
        Human mainParent = new Human("Main");
        List<Human> children = new ArrayList<Human>();
        children.add(new Human("1"));
        children.add(new Human("2"));

        mainParent.AddMoreChildren(children);
        Human tmpParent = mainParent.GetChild(1);
        tmpParent.AddOneChild(new Human("3"));

        System.out.println(mainParent.GetAllChildren(mainParent));
    }
}