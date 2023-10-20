package com.ohgiraffers.pet.repository;

import com.ohgiraffers.pet.dto.MemberDTO;
import com.ohgiraffers.pet.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Integer> {

    @Query(value = "SELECT * FROM mem_info ORDER BY mem_code ASC"
            , nativeQuery = true)
    public List<Member> findAllMemCode() ;
}
