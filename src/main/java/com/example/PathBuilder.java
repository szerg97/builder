package com.example;

public class PathBuilder {

    private static final StringBuilder sb = new StringBuilder();
    private static PathBuilder instance;

    public static PathBuilder builder(){
        if(PathBuilder.instance != null){
            sb.setLength(0);
            return instance;
        }
        instance = new PathBuilder();
        return instance;
    }

    public  PathBuilder basePath(){
        sb.append("http://localhost:8080/api/v1");
        return this;
    }

    public PathBuilder subPath(){
        sb.append("/countries");
        return this;
    }

    public PathBuilder slash(){
        sb.append("/");
        return this;
    }

    public PathBuilder any(Object obj){
        sb.append(obj);
        return this;
    }

    public String build(){
        return sb.toString();
    }
}
