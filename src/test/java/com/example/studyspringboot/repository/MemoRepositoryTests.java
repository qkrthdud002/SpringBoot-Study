package com.example.studyspringboot.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MemoRepositoryTests {

    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testClass() {
        System.out.println(memoRepository.getClass().getName());
    }

}
