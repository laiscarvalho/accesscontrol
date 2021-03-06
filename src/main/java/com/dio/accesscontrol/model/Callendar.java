package com.dio.accesscontrol.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Callendar {
    @Id
    private long id;
    @ManyToOne
    private DataType dataType;
    private String description;
    private LocalDateTime commemorativeDate;

}
