package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "about_Us")
public class AboutUs {
    @Id
    private String id;
    private String aboutUsEng;
    private String aboutusRus;

}
