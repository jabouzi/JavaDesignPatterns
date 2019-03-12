package com.skanderjabouzi.dependency.inv;

import java.util.List;

public interface RelationshipBrowser {
    List<Person> findAllChildrenOf(String name);
}
