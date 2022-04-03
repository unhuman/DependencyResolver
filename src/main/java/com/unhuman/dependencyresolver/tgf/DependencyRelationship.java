package com.unhuman.dependencyresolver.tgf;

public class DependencyRelationship {
    private String parent;
    private String child;
    private String scope;

    public DependencyRelationship(String data) {
        String[] details = data.split("\\s+");
        if (details.length != 3) {
            throw new RuntimeException("Invalid Dependency Data: " + String.join(" ", data));
        }

        int i = 0;
        parent = details[i++];
        child = details[i++];
        scope = details[i++];
    }

    public String getParent() {
        return parent;
    }

    public String getChild() {
        return child;
    }

    public String getScope() {
        return scope;
    }
}
