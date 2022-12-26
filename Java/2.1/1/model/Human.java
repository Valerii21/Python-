package model;

import java.util.ArrayList;
import java.util.List;

public class Human {
    String name;
    List<Human> children;

    public Human(String name){
        this.name = name;
        this.children = new ArrayList<Human>();
    }

    public void AddOneChild(Human child){
        this.children.add(child);
    }

    public void AddMoreChildren(List<Human> children){
        this.children.addAll(children);
    }

    public Human GetChild(int index){
        return this.children.get(index);
    }

    public String GetAllChildren(Human parent){
        String result = "";
        for (int i = 0; i < parent.children.size(); i++) {
            result += parent.children.get(i).name + "\r\n";
            result += GetAllChildren(parent.children.get(i));
        }
        return result;
    }
}