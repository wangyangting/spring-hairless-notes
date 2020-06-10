package com.github.hairless.po;

import lombok.*;

import javax.persistence.*;

/**
 * @author wangyangting
 * @date 2020-06-10
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
}
