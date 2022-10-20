package com.jeeyusoft.todo.entity;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "todo")
public class ToDo extends BaseEntity {
    // 기본키
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid") //랜덤uuid를 가지고 ID 값을 생성함
    private String id;

    // 사용자 식별을 위한 ID
    @Column(length = 100, nullable = false)
    private String userId;

    //제목
    @Column(length = 500, nullable = false)
    private String title;

    //수행 여부
    @Column(nullable = false)
    private boolean done;

}
