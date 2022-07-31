package com.example.studyspringboot.repository;

import com.example.studyspringboot.entity.Memo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.IntStream;

public class MemoRepositoryTests {

    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testClass() {
        System.out.println(memoRepository.getClass().getName());
    }

    @Test
    public void testInsertDummies() {
        IntStream.rangeClosed(1, 100). forEach(i -> {
            Memo memo = Memo
                    .builder()
                    .memoText("Sample..." + i)
                    .build();
            memoRepository.save(memo);
        });
    }
}
