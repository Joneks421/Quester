package com.example.quester;

public class TasksClass {
        String text;
        String shortInfo;
        String fullInfo;
        String authorName;
        String testName;
        Integer pointForCorrect;

    public TasksClass(String text, String shortInfo, String fullInfo, String authorName,
                      String testName, Integer pointForCorrect) {
        this.text = text;
        this.shortInfo = shortInfo;
        this.fullInfo = fullInfo;
        this.authorName = authorName;
        this.testName = testName;
        this.pointForCorrect = pointForCorrect;
    }
}
