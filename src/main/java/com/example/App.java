package com.example;

public class App {
    public static void main(String[] args) {
        String path1 = PathBuilder.builder()
                .basePath()
                .subPath()
                .slash()
                .any(1)
                .build();
        System.out.println(path1);

        String path2 = PathBuilder.builder()
                .basePath()
                .subPath()
                .slash()
                .any(14)
                .slash()
                .any("cities")
                .build();
        System.out.println(path2);
    }
}
