package com.skanderjabouzi.dependency.inv;

import org.javatuples.Triplet;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Relationships implements RelationshipBrowser {
    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public List<Triplet<Person, Relationship, Person>> getRelations() {
        return relations;
    }

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    @Override
    public List<Person> findAllChildrenOf(String name) {
        return relations.stream().filter( x -> x.getValue0().name.equals("John") && x.getValue1() == Relationship.PARENT).map(Triplet::getValue2).collect(Collectors.toList());
    }
}
