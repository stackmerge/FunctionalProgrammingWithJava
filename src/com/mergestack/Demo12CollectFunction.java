package com.mergestack;

import java.util.*;
import java.util.stream.Collectors;

public class Demo12CollectFunction {

    public static void main(String[] args) {
        String[] wordsArr = {"hello", "apple", "apple","functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));
        
        Set<String> wordSet = words
        		.stream()
        		.collect(Collectors.toSet());
        
        System.out.println(wordSet);

        
        String wordListString = words
        		.stream()
        		.collect(Collectors.joining(", "));
        
        System.out.println(wordListString);
        
        Long wordCount = words
        		.stream()
        		.collect(Collectors.counting());
        
        System.out.println(wordCount);
        
        Map<Integer, List<String>> wordLengthMap = words
                .stream()
                .collect(Collectors.groupingBy((word) -> word.length()));

        System.out.println(wordLengthMap);
        
        Map<Boolean, List<String>> wordLengthMap1 = words
                .stream()
                .collect(Collectors.partitioningBy(
                        (word) -> word.length() > 5
                ));

        System.out.println(wordLengthMap1);
    }
}
