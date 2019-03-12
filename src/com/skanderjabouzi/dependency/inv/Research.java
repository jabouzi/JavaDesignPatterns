package com.skanderjabouzi.dependency.inv;

import org.javatuples.Triplet;

import java.util.List;

public class Research {

//    public Research(Relationships relationships) {
//        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
//        relations.stream().filter( x -> x.getValue0().name.equals("John") && x.getValue1() == Relationship.PARENT).forEach(ch -> System.out.println("John has a child called " + ch.getValue2().name));
//    }

    public Research(RelationshipBrowser relationshipBrowser) {
        List<Person> children = relationshipBrowser.findAllChildrenOf("John");
        for(Person child : children) {
            System.out.println("John has a child called " + child.name);
        }
    }
}
