package com.example.studyspringboot.repository;

import com.example.studyspringboot.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
