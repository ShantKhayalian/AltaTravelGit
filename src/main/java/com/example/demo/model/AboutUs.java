package com.example.demo.model;

import lombok.*;
import org.bson.types.Binary;
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
    private Binary firstImage;
    private Binary lirstImage;
    private Binary video;

}
