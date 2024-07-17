package com.ormispring.day0717_restapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    private List<Member> members = new ArrayList<>();
    private long nextId = 1;

    @GetMapping
    public List<Member> getAllMembers() {
        return members;
    }

    @PostMapping
    public Member createMember(@RequestBody Member member) {
        member.setId(nextId++);
        members.add(member);
        return member;
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberDTO> getMemberById(@PathVariable("id") Long id) {
        Member member1 = members.stream()
                .filter(member -> member.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("뭐시여 이건."));

        MemberDTO memberDTO = new MemberDTO(member1.getEmail());

        return ResponseEntity.status(404).body(memberDTO); // 상태코드 바꾸는 방법
    }

    @PutMapping("/{id}")
    public Member updateMember(@PathVariable("id") Long id, @RequestBody Member updateMember) {
        Member member = members.stream()
                .filter(m -> m.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("멤버를 찾지 못하였습니다."));

        member.setName(updateMember.getName());
        member.setEmail(updateMember.getEmail());

        return member;
    }

    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable("id") Long id) {
        members.removeIf(member -> member.getId() == id);
    }
}
