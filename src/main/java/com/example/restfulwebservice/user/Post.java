package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Integer id;

    private String description;

    // User : Post - > 1 : 0~N , Main : Sub - > Parent : Child
    //LAZY : 지연 로딩 방식 - > 사용자의 엔티티를 조회 할 때 포스트 엔티티가 같이 로딩 되는게 아니라 포스트 데이터가 로딩 되는 시점에 필요한 사용자 데이터를 가지고 온다.
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;
}
